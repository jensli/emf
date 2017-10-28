/**
 * Copyright (c) 2008 Matthew Hall and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Matthew Hall - initial API and implementation (bug 195222)
 *   Matthew Hall - bug 264307
 *   Tom Schindl <tom.schindl@bestsolution.at> - port to EMF in 262160
 */
package org.eclipse.emf.databinding.internal;

import java.util.List;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.property.list.IListProperty;
import org.eclipse.core.databinding.property.list.ListProperty;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.databinding.IEMFValueProperty;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;


/**
 * <p><b>PROVISIONAL:</b> This API is subject to arbitrary change, including renaming or removal.</p>
 * 
 * @since 2.5
 */
public class EMFListPropertyDecorator<S extends EObject, E> extends ListProperty<S, E> implements IEMFListProperty<S, E>
{
  private final IListProperty<S, E> delegate;
  private final EStructuralFeature<?, ?> eStructuralFeature;

  /**
   * @param delegate
   * @param eStructuralFeature
   */
  public EMFListPropertyDecorator(IListProperty<S, E> delegate, EStructuralFeature<?, ?> eStructuralFeature)
  {
    this.delegate = delegate;
    this.eStructuralFeature = eStructuralFeature;
  }

  @Override
  public Object getElementType()
  {
    return delegate.getElementType();
  }

  @Override
  public <T> IEMFListProperty<S, T> values(EStructuralFeature<? super E, T> feature)
  {
    return values(FeaturePath.fromList(feature));
  }

  @Override
  public <T> IEMFListProperty<S, T> values(FeaturePath<? super E, T> featurePath)
  {
    return values(EMFProperties.value( featurePath));
  }

  @Override
  public <T> IEMFListProperty<S, T> values(IEMFValueProperty<? super E, T> property)
  {
    return new EMFListPropertyDecorator(super.values(property), property.getStructuralFeature());
  }

  @Override
  public IEMFValueProperty<S, E> value(ListElementAccess<E> elementAccess)
  {
    return new EMFValuePropertyDecorator(
        new EMFListValueProperty(delegate, eStructuralFeature, elementAccess), eStructuralFeature);
  }

  @Override
  public EStructuralFeature<?, ?> getStructuralFeature()
  {
    return eStructuralFeature;
  }

  @Override
  public IObservableList<E> observe(S source)
  {
    return new EMFObservableListDecorator(delegate.observe(source), eStructuralFeature);
  }

  @Override
  public IObservableList<E> observe(Realm realm, S source)
  {
    return new EMFObservableListDecorator(delegate.observe(realm, source), eStructuralFeature);
  }

  @Override
  public IObservableFactory listFactory()
  {
    return delegate.listFactory();
  }

  @Override
  public IObservableFactory listFactory(Realm realm)
  {
    return delegate.listFactory(realm);
  }

  @Override
  public IObservableList observeDetail(IObservableValue master)
  {
    return new EMFObservableListDecorator(delegate.observeDetail(master), eStructuralFeature);
  }

  @Override
  public String toString()
  {
    return delegate.toString();
  }
}
