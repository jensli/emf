/**
 * Copyright (c) 2008 Matthew Hall and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Matthew Hall - initial API and implementation (bug 194734)
 *   Matthew Hall - bug 195222, 264307, 265561
 *   Tom Schindl <tom.schindl@bestsolution.at> - port to EMF in 262160
 */
package org.eclipse.emf.databinding.internal;

import org.eclipse.core.databinding.property.INativePropertyListener;
import org.eclipse.core.databinding.property.IProperty;
import org.eclipse.core.databinding.property.ISimplePropertyListener;
import org.eclipse.core.databinding.property.value.SimpleValueProperty;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.ExtendedMetaData;


/**
 * <p><b>PROVISIONAL:</b> This API is subject to arbitrary change, including renaming or removal.</p>
 * 
 * @since 2.5
 */
public class EMFValueProperty<S extends EObject, T> extends SimpleValueProperty<S, T>
{
  private final EStructuralFeature<S, T> eStructuralFeature;

  /**
   * @param eStructuralFeature
   */
  public EMFValueProperty(EStructuralFeature<S, T> eStructuralFeature)
  {
    this.eStructuralFeature = eStructuralFeature;
  }

  public Object getValueType()
  {
    return eStructuralFeature;
  }

  /**
   * @return the feature
   */
  protected EStructuralFeature<S, T> getFeature()
  {
    return eStructuralFeature;
  }

  @Override
  protected T doGetValue(S source)
  {
    return ExtendedMetaData.INSTANCE.getAffiliation(source.eClass(), eStructuralFeature) == null
      ? null : source.eGet(eStructuralFeature);
  }

  @Override
  protected void doSetValue(S source, T value)
  {
    source.eSet(eStructuralFeature, value);
  }

  @Override
  public INativePropertyListener adaptListener(final ISimplePropertyListener listener)
  {
    return new EMFPropertyListener.EMFValuePropertyListener()
      {

        @Override
        protected IProperty getOwner()
        {
          return EMFValueProperty.this;
        }

        @Override
        protected ISimplePropertyListener getListener()
        {
          return listener;
        }

        @Override
        protected EStructuralFeature getFeature()
        {
          return eStructuralFeature;
        }
      };
  }

  @Override
  public String toString()
  {
    String s = EMFPropertyHelper.propertyName(eStructuralFeature);
    s += "<" + EMFPropertyHelper.shortClassName(eStructuralFeature) + ">"; //$NON-NLS-1$//$NON-NLS-2$
    return s;
  }
}
