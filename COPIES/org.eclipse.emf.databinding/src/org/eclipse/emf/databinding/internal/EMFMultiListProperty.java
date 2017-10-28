/**
 * Copyright (c) 2009 Tom Schindl
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *  Tom Schindl <tom.schindl@bestsolution.at>
 */
package org.eclipse.emf.databinding.internal;

import org.eclipse.core.databinding.property.list.MultiListProperty;
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
public class EMFMultiListProperty<S extends EObject, E> extends MultiListProperty<S, E> implements IEMFListProperty<S, E>
{

  /**
   * Create new property
   * @param properties
   */
  public EMFMultiListProperty(IEMFListProperty<S, E>[] properties)
  {
    super(properties);
  }

  @Override
  public <T> IEMFListProperty<S, T> values(EStructuralFeature<? super E, T> feature)
  {
    return values(FeaturePath.fromList(feature));
  }

  @Override
  public <T> IEMFListProperty<S, T> values(FeaturePath<? super E, T> featurePath)
  {
    return values(EMFProperties.value(featurePath));
  }

  @Override
  public <T> IEMFListProperty<S, T> values(IEMFValueProperty<? super E, T> property)
  {
    return new EMFListPropertyDecorator<>(super.values(property), property.getStructuralFeature());
  }

  @Override
  public EStructuralFeature<?, ?> getStructuralFeature()
  {
    return null;
  }
  
  @Override
  public IEMFValueProperty<S, E> value(ListElementAccess<E> elementAccess) {
		throw new UnsupportedOperationException();
	}
}
