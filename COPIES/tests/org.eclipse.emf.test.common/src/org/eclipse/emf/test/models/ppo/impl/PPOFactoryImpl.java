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
package org.eclipse.emf.test.models.ppo.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.test.models.ppo.*;
import org.eclipse.emf.test.models.ppo.Item;
import org.eclipse.emf.test.models.ppo.PPOFactory;
import org.eclipse.emf.test.models.ppo.PPOPackage;
import org.eclipse.emf.test.models.ppo.PurchaseOrder;
import org.eclipse.emf.test.models.ppo.USAddress;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PPOFactoryImpl extends EFactoryImpl implements PPOFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PPOFactory init()
  {
    try
    {
      PPOFactory thePPOFactory = (PPOFactory)EPackage.Registry.INSTANCE.getEFactory(PPOPackage.eNS_URI);
      if (thePPOFactory != null)
      {
        return thePPOFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PPOFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PPOFactoryImpl()
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
      case PPOPackage.ITEM: return (T) createItem();
      case PPOPackage.US_ADDRESS: return (T) createUSAddress();
      case PPOPackage.PURCHASE_ORDER: return (T) createPurchaseOrder();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  @SuppressWarnings("unchecked")
  public <T> T createFromString(EDataType<T> eDataType, String initialValue)
  {
    // CHANGE gen: Cast 1
    switch (eDataType.getClassifierID())
    {
      case PPOPackage.SKU:
        return (T) createSKUFromString((EDataType<String>) eDataType, initialValue);
      case PPOPackage.DATE:
        return (T) createDateFromString((EDataType<Date>) eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public <T> String convertToString(EDataType<T> eDataType, T instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PPOPackage.SKU:
        return convertSKUToString((EDataType<String>) eDataType, (String) instanceValue);
      case PPOPackage.DATE:
        return convertDateToString((EDataType<Date>) eDataType, (Date) instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Item createItem()
  {
    ItemImpl item = new ItemImpl();
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public USAddress createUSAddress()
  {
    USAddressImpl usAddress = new USAddressImpl();
    return usAddress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PurchaseOrder createPurchaseOrder()
  {
    PurchaseOrderImpl purchaseOrder = new PurchaseOrderImpl();
    return purchaseOrder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createSKUFromString(EDataType<String> eDataType, String initialValue)
  {
    return (String)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  // CHANGE gen: Add type parameter, convert type to string
  // CHANGE gen: Note, instanceValue has type Object. Change the signature made a lot of duplicate
  // methods get generated for hand-modified convert methods, because signatures didn't match.
  public String convertSKUToString(EDataType<String> eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, (String)instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date createDateFromString(EDataType<Date> eDataType, String initialValue)
  {
    return (Date)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  // CHANGE gen: Add type parameter, convert type to string
  // CHANGE gen: Note, instanceValue has type Object. Change the signature made a lot of duplicate
  // methods get generated for hand-modified convert methods, because signatures didn't match.
  public String convertDateToString(EDataType<Date> eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, (Date)instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PPOPackage getPPOPackage()
  {
    return (PPOPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PPOPackage getPackage()
  {
    return PPOPackage.eINSTANCE;
  }

} //PPOFactoryImpl
