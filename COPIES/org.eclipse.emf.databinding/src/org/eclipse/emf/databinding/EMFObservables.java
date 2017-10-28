/**
 * Copyright (c) 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *   Trevor S. Kaufman - Bug 215131 - added mapFactory
 */
package org.eclipse.emf.databinding;

import java.util.List;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
import org.eclipse.core.databinding.observable.masterdetail.MasterDetailObservables;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.notify.NotifyingList;
import org.eclipse.emf.databinding.internal.EWritableList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;


/**
 * <p><b>PROVISIONAL:</b> This API is subject to arbitrary change, including renaming or removal.</p>
 */
public class EMFObservables
{
  /**
   * Returns an observable value for the given feature of the object.
   * @param eObject the object to observe.
   * @param eStructuralFeature the feature of the object to observe.
   * @return an observable value for the given feature of the object.
   */
  public static <S extends EObject, T> IObservableValue<T> observeValue(S eObject, EStructuralFeature<? super S, T> eStructuralFeature)
  {
    return new EObjectObservableValue<>(eObject, eStructuralFeature);
  }

  /**
   * Returns an observable value for the given feature of the object.
   * @param realm the realm in which to observe.
   * @param eObject the object to observe.
   * @param eStructuralFeature the feature of the object to observe.
   * @return an observable value for the given feature of the object.
   */
  public static <S extends EObject, T> IObservableValue<T> observeValue(Realm realm, S eObject, EStructuralFeature<? super S, T> eStructuralFeature)
  {
    return new EObjectObservableValue<>(realm, eObject, eStructuralFeature);
  }

  /**
   * Returns an observable list for the given multi-valued feature of the object.
   * @param eObject the object to observe.
   * @param eStructuralFeature the feature of the object to observe.
   * @return an observable list for the given multi-valued feature of the object.
   */
  public static <S extends EObject, E> IObservableList<E> observeList(S eObject, EStructuralFeature<? super S, ? extends List<E>> eStructuralFeature)
  {
    return new EObjectObservableList<>(eObject, eStructuralFeature);
  }

  /**
   * Returns an observable list for the given multi-valued feature of the object.
   * @param realm the realm in which to observe.
   * @param eObject the object to observe.
   * @param eStructuralFeature the feature of the object to observe.
   * @return an observable list for the given multi-valued feature of the object.
   */
  public static <S extends EObject, E> IObservableList<E> observeList(Realm realm, S eObject, EStructuralFeature<? super S, ? extends List<E>> eStructuralFeature)
  {
    return new EObjectObservableList<>(realm, eObject, eStructuralFeature);
  }

  /**
   * Returns an observable map in the default realm 
   * tracking the current value of the given feature for each object in the given set.
   * @param objects the objects to track.
   * @param eStructuralFeature the feature for which to track the value.
   * @return an observable map tracking the current value of the given feature for each object in the given set.
   */
  public static <K extends EObject, V> IObservableMap<K, V> observeMap(IObservableSet<K> objects, EStructuralFeature<? super K, V> eStructuralFeature)
  {
    return new EObjectObservableMap<>(objects, eStructuralFeature);
  }

  /**
   * Returns an array of observable maps in the default realm 
   * tracking the current value of the given features for each object in the given set.
   * @param objects the objects to track.
   * @param eStructuralFeatures the features for which to track the value.
   * @return an array of observable maps tracking the current value of the given features for each object in the given set.
   */
  public static <K extends EObject, V> IObservableMap<K, V>[] observeMaps(IObservableSet<K> objects, EStructuralFeature<? super K, V>[] eStructuralFeatures)
  {
    @SuppressWarnings("unchecked")
    IObservableMap<K, V>[] result = new IObservableMap [eStructuralFeatures.length];
    for (int i = 0; i < eStructuralFeatures.length; i++)
    {
      result[i] = observeMap(objects, eStructuralFeatures[i]);
    }
    return result;
  }

  /**
   * Returns an observable value that tracks the current value of the feature of the current value of the master observable value.
   * @param realm the realm in which to observe.
   * @param value the master observable value.
   * @param eStructuralFeature the feature for which to track the value.
   * @return an observable value that tracks the current value of the named property for the current value of the master observable value
   * @see MasterDetailObservables#detailValue(IObservableValue, IObservableFactory, Object)
   */
  public static <S extends EObject, T> IObservableValue<T> observeDetailValue(Realm realm, IObservableValue<S> value, EStructuralFeature<? super S, T> eStructuralFeature)
  {
    return MasterDetailObservables.detailValue(value, valueFactory(realm, eStructuralFeature), eStructuralFeature);
  }

  /**
   * Returns a factory for creating observable values
   * tracking the value of the given feature of a particular {@link EObject object}.
   * @param realm the realm in which to observe.
   * @param eStructuralFeature the feature for which to track the value.
   * @return an observable factory.
   */
  public static <S extends EObject, T> IObservableFactory<S, IObservableValue<T>> valueFactory(final Realm realm, final EStructuralFeature<S, T> eStructuralFeature)
  {
    return new IObservableFactory<S, IObservableValue<T>>()
      {
        public IObservableValue<T> createObservable(S target)
        {
          return observeValue(realm, target, eStructuralFeature);
        }
      };
  }

  /**
   * Returns an observable list that tracks the current value of the feature of the current value of the master observable value.
   * @param realm the realm in which to observe.
   * @param value the master observable value.
   * @param eStructuralFeature the feature for which to track the value.
   * @return an observable value that tracks the current value of the named property for the current value of the master observable value
   * @see MasterDetailObservables#detailList(IObservableValue, IObservableFactory, Object)
   */
  public static <S extends EObject, E> IObservableList<E> observeDetailList(Realm realm, IObservableValue<S> value, EStructuralFeature<? super S, ? extends List<E>> eStructuralFeature)
  {
    return MasterDetailObservables.detailList(value, listFactory(realm, eStructuralFeature), eStructuralFeature);
  }

  /**
   * Returns a factory for creating observable lists
   * tracking the value of the given feature of a particular {@link EObject object}.
   * @param realm the realm in which to observe.
   * @param eStructuralFeature the feature for which to track the value.
   * @return an observable factory.
   */
  public static <S extends EObject, E> IObservableFactory<S, IObservableList<E>> listFactory(final Realm realm, final EStructuralFeature<? super S, ? extends List<E>> eStructuralFeature)
  {
    return new IObservableFactory<S, IObservableList<E>>()
      {
        public IObservableList<E> createObservable(S target)
        {
          return observeList(realm, target, eStructuralFeature);
        }
      };
  }

  /**
   * Returns a factory for creating observable maps
   * tracking the value of the given feature of a particular {@link EObject object}.
   * @param eStructuralFeature the feature for which to track the value.
   * @return an observable factory.
   */
  public static <K extends EObject, S extends IObservableSet<K>, V> IObservableFactory<S, IObservableMap<K, V>> mapFactory(final EStructuralFeature<? super K, V> eStructuralFeature)
  {
    return new IObservableFactory<S, IObservableMap<K, V>>()
      {
        public IObservableMap<K, V> createObservable(S target)
        {
          return observeMap(target, eStructuralFeature);
        }
      };
  }

  /**
  	 * Returns an observable for the resource contents (
  	 * {@link Resource#getContents()})
  	 * 
  	 * @param resource
  	 *            the resources the content should be observed
  	 * @return an observable list
  	 */
  public static IObservableList<EObject> observeResourceContents(Resource resource)
  {
    return new EWritableList<EObject>((NotifyingList<EObject>)resource.getContents());
  }

}
