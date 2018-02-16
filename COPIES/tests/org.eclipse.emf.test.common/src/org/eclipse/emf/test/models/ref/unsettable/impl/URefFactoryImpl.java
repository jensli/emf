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
package org.eclipse.emf.test.models.ref.unsettable.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.test.models.ref.unsettable.*;
import org.eclipse.emf.test.models.ref.unsettable.AU;
import org.eclipse.emf.test.models.ref.unsettable.BU;
import org.eclipse.emf.test.models.ref.unsettable.C1U;
import org.eclipse.emf.test.models.ref.unsettable.C2U;
import org.eclipse.emf.test.models.ref.unsettable.C3U;
import org.eclipse.emf.test.models.ref.unsettable.C4U;
import org.eclipse.emf.test.models.ref.unsettable.CU;
import org.eclipse.emf.test.models.ref.unsettable.DU;
import org.eclipse.emf.test.models.ref.unsettable.EU;
import org.eclipse.emf.test.models.ref.unsettable.URefFactory;
import org.eclipse.emf.test.models.ref.unsettable.URefPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class URefFactoryImpl extends EFactoryImpl implements URefFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static URefFactory init()
  {
    try
    {
      URefFactory theURefFactory = (URefFactory)EPackage.Registry.INSTANCE.getEFactory(URefPackage.eNS_URI);
      if (theURefFactory != null)
      {
        return theURefFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new URefFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public URefFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  @SuppressWarnings("unchecked")
  public <T extends EObject> T create(EClass<T> eClass)
  {
    switch (eClass.getClassifierID())
    {
      case URefPackage.C1U: return (T) createC1U();
      case URefPackage.C2U: return (T) createC2U();
      case URefPackage.AU: return (T) createAU();
      case URefPackage.BU: return (T) createBU();
      case URefPackage.CU: return (T) createCU();
      case URefPackage.DU: return (T) createDU();
      case URefPackage.C4U: return (T) createC4U();
      case URefPackage.C3U: return (T) createC3U();
      case URefPackage.EU: return (T) createEU();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public C1U createC1U()
  {
    C1UImpl c1U = new C1UImpl();
    return c1U;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public C2U createC2U()
  {
    C2UImpl c2U = new C2UImpl();
    return c2U;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AU createAU()
  {
    AUImpl au = new AUImpl();
    return au;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BU createBU()
  {
    BUImpl bu = new BUImpl();
    return bu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CU createCU()
  {
    CUImpl cu = new CUImpl();
    return cu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DU createDU()
  {
    DUImpl du = new DUImpl();
    return du;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public C4U createC4U()
  {
    C4UImpl c4U = new C4UImpl();
    return c4U;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public C3U createC3U()
  {
    C3UImpl c3U = new C3UImpl();
    return c3U;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EU createEU()
  {
    EUImpl eu = new EUImpl();
    return eu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public URefPackage getURefPackage()
  {
    return (URefPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static URefPackage getPackage()
  {
    return URefPackage.eINSTANCE;
  }

} //URefFactoryImpl
