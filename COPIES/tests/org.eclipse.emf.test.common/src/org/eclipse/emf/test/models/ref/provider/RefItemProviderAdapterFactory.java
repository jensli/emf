/**
 * Copyright (c) 2007 IBM Corporation and others.
 * All rights reserved.  This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.emf.test.models.ref.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.test.models.ref.util.RefAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RefItemProviderAdapterFactory extends RefAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
  /**
   * This keeps track of the root adapter factory that delegates to this adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComposedAdapterFactory parentAdapterFactory;

  /**
   * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IChangeNotifier changeNotifier = new ChangeNotifier();

  /**
   * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Collection<Object> supportedTypes = new ArrayList<Object>();

  /**
   * This constructs an instance.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefItemProviderAdapterFactory()
  {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.test.models.ref.A} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AItemProvider aItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.test.models.ref.A}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createAAdapter()
  {
    if (aItemProvider == null)
    {
      aItemProvider = new AItemProvider(this);
    }

    return aItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.test.models.ref.B} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BItemProvider bItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.test.models.ref.B}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createBAdapter()
  {
    if (bItemProvider == null)
    {
      bItemProvider = new BItemProvider(this);
    }

    return bItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.test.models.ref.C1} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected C1ItemProvider c1ItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.test.models.ref.C1}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createC1Adapter()
  {
    if (c1ItemProvider == null)
    {
      c1ItemProvider = new C1ItemProvider(this);
    }

    return c1ItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.test.models.ref.C2} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected C2ItemProvider c2ItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.test.models.ref.C2}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createC2Adapter()
  {
    if (c2ItemProvider == null)
    {
      c2ItemProvider = new C2ItemProvider(this);
    }

    return c2ItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.test.models.ref.C} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CItemProvider cItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.test.models.ref.C}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createCAdapter()
  {
    if (cItemProvider == null)
    {
      cItemProvider = new CItemProvider(this);
    }

    return cItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.test.models.ref.D} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DItemProvider dItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.test.models.ref.D}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createDAdapter()
  {
    if (dItemProvider == null)
    {
      dItemProvider = new DItemProvider(this);
    }

    return dItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.test.models.ref.E} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EItemProvider eItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.test.models.ref.E}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createEAdapter()
  {
    if (eItemProvider == null)
    {
      eItemProvider = new EItemProvider(this);
    }

    return eItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.test.models.ref.C4} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected C4ItemProvider c4ItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.test.models.ref.C4}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createC4Adapter()
  {
    if (c4ItemProvider == null)
    {
      c4ItemProvider = new C4ItemProvider(this);
    }

    return c4ItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.test.models.ref.C3} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected C3ItemProvider c3ItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.test.models.ref.C3}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createC3Adapter()
  {
    if (c3ItemProvider == null)
    {
      c3ItemProvider = new C3ItemProvider(this);
    }

    return c3ItemProvider;
  }

  /**
   * This returns the root adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComposeableAdapterFactory getRootAdapterFactory()
  {
    return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
  }

  /**
   * This sets the composed adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
  {
    this.parentAdapterFactory = parentAdapterFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object type)
  {
    return supportedTypes.contains(type) || super.isFactoryForType(type);
  }

  /**
   * This implementation substitutes the factory itself as the key for the adapter.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter adapt(Notifier notifier, Object type)
  {
    return super.adapt(notifier, this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object adapt(Object object, Object type)
  {
    if (isFactoryForType(type))
    {
      Object adapter = super.adapt(object, type);
      if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter)))
      {
        return adapter;
      }
    }

    return null;
  }

  /**
   * This adds a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void addListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.addListener(notifyChangedListener);
  }

  /**
   * This removes a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void removeListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.removeListener(notifyChangedListener);
  }

  /**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fireNotifyChanged(Notification notification)
  {
    changeNotifier.fireNotifyChanged(notification);

    if (parentAdapterFactory != null)
    {
      parentAdapterFactory.fireNotifyChanged(notification);
    }
  }

  /**
   * This disposes all of the item providers created by this factory. 
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void dispose()
  {
    if (aItemProvider != null) aItemProvider.dispose();
    if (bItemProvider != null) bItemProvider.dispose();
    if (c1ItemProvider != null) c1ItemProvider.dispose();
    if (c2ItemProvider != null) c2ItemProvider.dispose();
    if (cItemProvider != null) cItemProvider.dispose();
    if (dItemProvider != null) dItemProvider.dispose();
    if (eItemProvider != null) eItemProvider.dispose();
    if (c4ItemProvider != null) c4ItemProvider.dispose();
    if (c3ItemProvider != null) c3ItemProvider.dispose();
  }

}
