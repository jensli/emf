/**
 * Copyright (c) 2008 Matthew Hall and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Matthew Hall - initial API and implementation (bug 194734)
 *   Matthew Hall - bugs 195222, 264307, 265561
 *   Tom Schindl <tom.schindl@bestsolution.at> - port to EMF in 262160
 */
package org.eclipse.emf.databinding.internal;

import java.util.List;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.core.databinding.property.value.ValueProperty;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.databinding.IEMFMapProperty;
import org.eclipse.emf.databinding.IEMFSetProperty;
import org.eclipse.emf.databinding.IEMFValueProperty;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;


/**
 * <p><b>PROVISIONAL:</b> This API is subject to arbitrary change, including renaming or removal.</p>
 *
 * @since 2.5
 */
public class EMFValuePropertyDecorator<S extends EObject, T> extends ValueProperty<S, T> implements IEMFValueProperty<S, T>
{
  private final IValueProperty<S, T> delegate;
  private final EStructuralFeature<?, ?> eStructuralFeature;

  /**
   * @param delegate
   * @param eStructuralFeature
   */
  public EMFValuePropertyDecorator(IValueProperty<S, T> delegate, EStructuralFeature<?, ?> eStructuralFeature)
  {
    this.delegate = delegate;
    this.eStructuralFeature = eStructuralFeature;
  }

  @Override
  public EStructuralFeature<?, ?> getStructuralFeature()
  {
    return eStructuralFeature;
  }

  @Override
  public Object getValueType()
  {
    return delegate.getValueType();
  }

  @Override
  public <V> IEMFValueProperty<S, V> value(EStructuralFeature<? super T, V> feature)
  {
    return value(FeaturePath.fromList(feature));
  }

  @SuppressWarnings({ "unchecked", "rawtypes" })
  @Override
  public <V> IEMFValueProperty<S, V> value(FeaturePath<? super T, V> featurePath)
  {
    return value(EMFProperties.value((FeaturePath) featurePath));
  }

  @SuppressWarnings({ "unchecked", "rawtypes" })
  @Override
  public <V> IEMFValueProperty<S, V> value(IEMFValueProperty<? super T, V> property)
  {
    return new EMFValuePropertyDecorator(super.value(property), property.getStructuralFeature());
  }

  @Override
  public <E> IEMFListProperty<S, E> list(EStructuralFeature<? super T, ? extends List<E>> feature)
  {
    return list(EMFProperties.list(feature));
  }

  @SuppressWarnings({ "unchecked", "rawtypes" })
  @Override
  public <E> IEMFListProperty<S, E> list(IEMFListProperty<? super T, E> property)
  {
    return new EMFListPropertyDecorator(super.list(property), property.getStructuralFeature());
  }

  @Override
  public <E> IEMFSetProperty<S, E> set(EStructuralFeature<? super T, ? extends List<E>> feature)
  {
    return set(EMFProperties.set(feature));
  }

  @Override
  public <V> IEMFSetProperty<S, V> set(IEMFSetProperty<? super T, V> property)
  {
    return new EMFSetPropertyDecorator(super.set(property), property.getStructuralFeature());
  }

  @Override
  public <K, V> IEMFMapProperty<S, K, V> map(EStructuralFeature<? super T, EMap<K, V>> feature)
  {
    return map(EMFProperties.map(feature));
  }

  @Override
  public <K, V> IEMFMapProperty<S, K, V> map(IEMFMapProperty<? super T, K, V> property)
  {
    return new EMFMapPropertyDecorator(super.map(property), property.getStructuralFeature());
  }

  @Override
  public IObservableValue<T> observe(S source)
  {
    return new EMFObservableValueDecorator<>(delegate.observe(source), eStructuralFeature);
  }

  @Override
  public IObservableValue<T> observe(Realm realm, S source)
  {
    return new EMFObservableValueDecorator<T>(delegate.observe(realm, source), eStructuralFeature);
  }

  @Override
  public IObservableFactory<S, IObservableValue<T>> valueFactory()
  {
    return delegate.valueFactory();
  }

  @Override
  public IObservableFactory<S, IObservableValue<T>> valueFactory(Realm realm)
  {
    return delegate.valueFactory(realm);
  }

  @Override
  public <M extends S> IObservableValue<T> observeDetail(IObservableValue<M> master)
  {
    return new EMFObservableValueDecorator<T>(delegate.observeDetail(master), eStructuralFeature);
  }

  /*
   * Suppress missing override warning to maintain compatibility with Eclipse 3.5.
   */
  public <M extends S> IObservableList<T> observeDetail(IObservableList<M> master)
  {
    return new EMFObservableListDecorator(delegate.observeDetail(master), eStructuralFeature);
  }

  /*
   * Suppress missing override warning to maintain compatibility with Eclipse 3.5.
   */
  public <M extends S> IObservableMap<M, T> observeDetail(IObservableSet<M> master)
  {
    return new EMFObservableMapDecorator(delegate.observeDetail(master), eStructuralFeature);
  }

  /*
   * Suppress missing override warning to maintain compatibility with Eclipse 3.5.
   */
  public <K, V extends S> IObservableMap<K, T> observeDetail(IObservableMap<K, V> master)
  {
    return new EMFObservableMapDecorator(delegate.observeDetail(master), eStructuralFeature);
  }

  @Override
  public String toString()
  {
    return delegate.toString();
  }
}
