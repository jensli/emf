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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.test.models.ppo.Item;
import org.eclipse.emf.test.models.ppo.PPOFactory;
import org.eclipse.emf.test.models.ppo.PPOPackage;
import org.eclipse.emf.test.models.ppo.PurchaseOrder;
import org.eclipse.emf.test.models.ppo.USAddress;
import org.eclipse.emf.test.models.ppo.util.PPOValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PPOPackageImpl extends EPackageImpl implements PPOPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<Item> itemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<USAddress> usAddressEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<PurchaseOrder> purchaseOrderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<String> skuEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Date> dateEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.emf.test.models.ppo.PPOPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PPOPackageImpl()
  {
    super(eNS_URI, PPOFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PPOPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PPOPackage init()
  {
    if (isInited) return (PPOPackage)EPackage.Registry.INSTANCE.getEPackage(PPOPackage.eNS_URI);

    // Obtain or create and register package
    PPOPackageImpl thePPOPackage = (PPOPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PPOPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PPOPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePPOPackage.createPackageContents();

    // Initialize created meta-data
    thePPOPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (thePPOPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return PPOValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    thePPOPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PPOPackage.eNS_URI, thePPOPackage);
    return thePPOPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<Item> getItem()
  {
    return itemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<Item, String> getItem_ProductName()
  {
    return (EAttribute<Item, String>) itemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<Item, Integer> getItem_Quantity()
  {
    return (EAttribute<Item, Integer>) itemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<Item, Integer> getItem_USPrice()
  {
    return (EAttribute<Item, Integer>) itemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<Item, String> getItem_Comment()
  {
    return (EAttribute<Item, String>) itemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<Item, Date> getItem_ShipDate()
  {
    return (EAttribute<Item, Date>) itemEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<Item, String> getItem_PartNum()
  {
    return (EAttribute<Item, String>) itemEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<USAddress> getUSAddress()
  {
    return usAddressEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<USAddress, String> getUSAddress_Name()
  {
    return (EAttribute<USAddress, String>) usAddressEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<USAddress, String> getUSAddress_Street()
  {
    return (EAttribute<USAddress, String>) usAddressEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<USAddress, String> getUSAddress_City()
  {
    return (EAttribute<USAddress, String>) usAddressEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<USAddress, String> getUSAddress_State()
  {
    return (EAttribute<USAddress, String>) usAddressEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<USAddress, Integer> getUSAddress_Zip()
  {
    return (EAttribute<USAddress, Integer>) usAddressEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<USAddress, String> getUSAddress_Country()
  {
    return (EAttribute<USAddress, String>) usAddressEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<PurchaseOrder> getPurchaseOrder()
  {
    return purchaseOrderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<PurchaseOrder, EList<Item>> getPurchaseOrder_Items()
  {
    return (EReference<PurchaseOrder, EList<Item>>) purchaseOrderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<PurchaseOrder, String> getPurchaseOrder_Comment()
  {
    return (EAttribute<PurchaseOrder, String>) purchaseOrderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<PurchaseOrder, Date> getPurchaseOrder_OrderDate()
  {
    return (EAttribute<PurchaseOrder, Date>) purchaseOrderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<PurchaseOrder, USAddress> getPurchaseOrder_BillTo()
  {
    return (EReference<PurchaseOrder, USAddress>) purchaseOrderEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<PurchaseOrder, USAddress> getPurchaseOrder_ShipTo()
  {
    return (EReference<PurchaseOrder, USAddress>) purchaseOrderEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<String> getSKU()
  {
    return skuEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Date> getDate()
  {
    return dateEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PPOFactory getPPOFactory()
  {
    return (PPOFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    // CHANGE gen: Add cast
    itemEClass = (EClass<Item>) createEClass(ITEM);
    // CHANGE gen: Use raw type
    createEAttribute(itemEClass, ITEM__PRODUCT_NAME);
    // CHANGE gen: Use raw type
    createEAttribute(itemEClass, ITEM__QUANTITY);
    // CHANGE gen: Use raw type
    createEAttribute(itemEClass, ITEM__US_PRICE);
    // CHANGE gen: Use raw type
    createEAttribute(itemEClass, ITEM__COMMENT);
    // CHANGE gen: Use raw type
    createEAttribute(itemEClass, ITEM__SHIP_DATE);
    // CHANGE gen: Use raw type
    createEAttribute(itemEClass, ITEM__PART_NUM);

    // CHANGE gen: Add cast
    usAddressEClass = (EClass<USAddress>) createEClass(US_ADDRESS);
    // CHANGE gen: Use raw type
    createEAttribute(usAddressEClass, US_ADDRESS__NAME);
    // CHANGE gen: Use raw type
    createEAttribute(usAddressEClass, US_ADDRESS__STREET);
    // CHANGE gen: Use raw type
    createEAttribute(usAddressEClass, US_ADDRESS__CITY);
    // CHANGE gen: Use raw type
    createEAttribute(usAddressEClass, US_ADDRESS__STATE);
    // CHANGE gen: Use raw type
    createEAttribute(usAddressEClass, US_ADDRESS__ZIP);
    // CHANGE gen: Use raw type
    createEAttribute(usAddressEClass, US_ADDRESS__COUNTRY);

    // CHANGE gen: Add cast
    purchaseOrderEClass = (EClass<PurchaseOrder>) createEClass(PURCHASE_ORDER);
    // CHANGE gen: Use raw type
    createEReference(purchaseOrderEClass, PURCHASE_ORDER__ITEMS);
    // CHANGE gen: Use raw type
    createEAttribute(purchaseOrderEClass, PURCHASE_ORDER__COMMENT);
    // CHANGE gen: Use raw type
    createEAttribute(purchaseOrderEClass, PURCHASE_ORDER__ORDER_DATE);
    // CHANGE gen: Use raw type
    createEReference(purchaseOrderEClass, PURCHASE_ORDER__BILL_TO);
    // CHANGE gen: Use raw type
    createEReference(purchaseOrderEClass, PURCHASE_ORDER__SHIP_TO);

    // Create data types
    // CHANGE gen: Cast
    skuEDataType = (EDataType<String>) createEDataType(SKU);
    // CHANGE gen: Cast
    dateEDataType = (EDataType<Date>) createEDataType(DATE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getItem_ProductName(), ecorePackage.getEString(), "productName", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getItem_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getItem_USPrice(), ecorePackage.getEInt(), "USPrice", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getItem_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getItem_ShipDate(), this.getDate(), "shipDate", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getItem_PartNum(), this.getSKU(), "partNum", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(usAddressEClass, USAddress.class, "USAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUSAddress_Name(), ecorePackage.getEString(), "name", null, 0, 1, USAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUSAddress_Street(), ecorePackage.getEString(), "street", null, 0, 1, USAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUSAddress_City(), ecorePackage.getEString(), "city", null, 0, 1, USAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUSAddress_State(), ecorePackage.getEString(), "state", null, 0, 1, USAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUSAddress_Zip(), ecorePackage.getEInt(), "zip", null, 0, 1, USAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUSAddress_Country(), ecorePackage.getEString(), "country", "US", 0, 1, USAddress.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    EOperation<?, ?> op = addEOperation(usAddressEClass, ecorePackage.getEBoolean(), "hasUSState", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    EGenericType g1 = createEGenericType(ecorePackage.getEMap());
    EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(purchaseOrderEClass, PurchaseOrder.class, "PurchaseOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPurchaseOrder_Items(), this.getItem(), null, "items", null, 2, -1, PurchaseOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPurchaseOrder_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, PurchaseOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPurchaseOrder_OrderDate(), this.getDate(), "orderDate", null, 0, 1, PurchaseOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPurchaseOrder_BillTo(), this.getUSAddress(), null, "billTo", null, 1, 1, PurchaseOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPurchaseOrder_ShipTo(), this.getUSAddress(), null, "shipTo", null, 1, 1, PurchaseOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize data types
    initEDataType(skuEDataType, String.class, "SKU", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.eclipse.org/emf/2002/Ecore
    createEcoreAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEcoreAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2002/Ecore";	
    addAnnotation
      (itemEClass, 
       source, 
       new String[] 
       {
       "constraints", "NonNegativeQuantity ValidShipDate"
       });
  }

} //PPOPackageImpl
