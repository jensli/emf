/**
 * Copyright (c) 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 */
package org.eclipse.emf.databinding;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.map.ComputedObservableMap;
import org.eclipse.core.databinding.observable.map.MapDiff;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.ExtendedMetaData;


/**
 * <p><b>PROVISIONAL:</b> This API is subject to arbitrary change, including renaming or removal.</p>
 */
public class EObjectObservableMap<K extends EObject, V> extends ComputedObservableMap<K, V>
{
  /**
   * The feature to observe
   */
  protected EStructuralFeature<? super K, V> eStructuralFeature;

  private Adapter elementListener = new AdapterImpl()
    {
      @Override
      public void notifyChanged(Notification notification)
      {
        if (eStructuralFeature == notification.getFeature() && !notification.isTouch())
        {
          // TODO
          // This assumes we only get a SET notification, which isn't a
          // good assumption.
          //
          @SuppressWarnings("unchecked")
          final MapDiff<K, V> diff = Diffs.createMapDiffSingleChange(
            (K) notification.getNotifier(),
            (V) notification.getOldValue(),
            (V) notification.getNewValue());
          getRealm().exec(new Runnable()
            {
              public void run()
              {
                fireMapChange(diff);
              }
            });
        }
      }
    };

  /**
   * Create a new observable for the set of features
   * 
   * @param objects
   *            the objects to observe
   * @param feature
   *            the feature
   */
  public EObjectObservableMap(IObservableSet<K> objects, EStructuralFeature<? super K, V> feature)
  {
    super(objects);
    this.eStructuralFeature = feature;
  }

  @Override
  protected void hookListener(K domainElement)
  {
    domainElement.eAdapters().add(elementListener);
  }

  @Override
  protected void unhookListener(K domainElement)
  {
    domainElement.eAdapters().remove(elementListener);
  }

  @Override
  protected V doGet(K key)
  {
    return ExtendedMetaData.INSTANCE.getAffiliation(key.eClass(), eStructuralFeature) == null ? null : key.eGet(eStructuralFeature);
  }

  @Override
  protected V doPut(K key, V value)
  {
    V result = key.eGet(eStructuralFeature);
    key.eSet(eStructuralFeature, value);
    return result;
  }
}
