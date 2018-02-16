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
package org.eclipse.emf.test.models.customer.impl;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.test.models.customer.AddressType;
import org.eclipse.emf.test.models.customer.CanadaAddr;
import org.eclipse.emf.test.models.customer.CreditInfo;
import org.eclipse.emf.test.models.customer.CustomerFactory;
import org.eclipse.emf.test.models.customer.CustomerPackage;
import org.eclipse.emf.test.models.customer.CustomerType;
import org.eclipse.emf.test.models.customer.CustomersType;
import org.eclipse.emf.test.models.customer.DocumentRoot;
import org.eclipse.emf.test.models.customer.USAddr;
import org.eclipse.emf.test.models.customer.USState;
import org.eclipse.emf.test.models.customer.util.CustomerValidator;
import org.eclipse.emf.test.models.movie.db.DBPackage;
import org.eclipse.emf.test.models.movie.db.impl.DBPackageImpl;
import org.eclipse.emf.test.models.order.OrderPackage;
import org.eclipse.emf.test.models.order.impl.OrderPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomerPackageImpl extends EPackageImpl implements CustomerPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<AddressType> addressTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<CanadaAddr> canadaAddrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<CreditInfo> creditInfoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<CustomersType> customersTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<CustomerType> customerTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<DocumentRoot> documentRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<USAddr> usAddrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum<USState> usStateEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<USState> usStateObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<BigInteger> zipCodesEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Object> zipUnionEDataType = null;

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
   * @see org.eclipse.emf.test.models.customer.CustomerPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CustomerPackageImpl()
  {
    super(eNS_URI, CustomerFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link CustomerPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CustomerPackage init()
  {
    if (isInited) return (CustomerPackage)EPackage.Registry.INSTANCE.getEPackage(CustomerPackage.eNS_URI);

    // Obtain or create and register package
    CustomerPackageImpl theCustomerPackage = (CustomerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CustomerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CustomerPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Obtain or create and register interdependencies
    DBPackageImpl theDBPackage = (DBPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DBPackage.eNS_URI) instanceof DBPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DBPackage.eNS_URI) : DBPackage.eINSTANCE);
    OrderPackageImpl theOrderPackage = (OrderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI) instanceof OrderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI) : OrderPackage.eINSTANCE);

    // Create package meta-data objects
    theCustomerPackage.createPackageContents();
    theDBPackage.createPackageContents();
    theOrderPackage.createPackageContents();

    // Initialize created meta-data
    theCustomerPackage.initializePackageContents();
    theDBPackage.initializePackageContents();
    theOrderPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theCustomerPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return CustomerValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theCustomerPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CustomerPackage.eNS_URI, theCustomerPackage);
    return theCustomerPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<AddressType> getAddressType()
  {
    return addressTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<AddressType, String> getAddressType_Street()
  {
    return (EAttribute<AddressType, String>) addressTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<AddressType, String> getAddressType_Town()
  {
    return (EAttribute<AddressType, String>) addressTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<CanadaAddr> getCanadaAddr()
  {
    return canadaAddrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<CanadaAddr, String> getCanadaAddr_Zip()
  {
    return (EAttribute<CanadaAddr, String>) canadaAddrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<CanadaAddr, String> getCanadaAddr_Province()
  {
    return (EAttribute<CanadaAddr, String>) canadaAddrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<CreditInfo> getCreditInfo()
  {
    return creditInfoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<CreditInfo, String> getCreditInfo_Holder()
  {
    return (EAttribute<CreditInfo, String>) creditInfoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<CreditInfo, BigInteger> getCreditInfo_CcNumber()
  {
    return (EAttribute<CreditInfo, BigInteger>) creditInfoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<CreditInfo, XMLGregorianCalendar> getCreditInfo_ExpireDate()
  {
    return (EAttribute<CreditInfo, XMLGregorianCalendar>) creditInfoEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<CustomersType> getCustomersType()
  {
    return customersTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<CustomersType, FeatureMap> getCustomersType_Mixed()
  {
    return (EAttribute<CustomersType, FeatureMap>) customersTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<CustomersType, EList<CustomerType>> getCustomersType_Customer()
  {
    return (EReference<CustomersType, EList<CustomerType>>) customersTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<CustomerType> getCustomerType()
  {
    return customerTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<CustomerType, String> getCustomerType_Name()
  {
    return (EAttribute<CustomerType, String>) customerTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<CustomerType, AddressType> getCustomerType_Address()
  {
    return (EReference<CustomerType, AddressType>) customerTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<CustomerType, CreditInfo> getCustomerType_CreditCard()
  {
    return (EReference<CustomerType, CreditInfo>) customerTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<CustomerType, XMLGregorianCalendar> getCustomerType_PaymentDay()
  {
    return (EAttribute<CustomerType, XMLGregorianCalendar>) customerTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<CustomerType, String> getCustomerType_ID()
  {
    return (EAttribute<CustomerType, String>) customerTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<DocumentRoot> getDocumentRoot()
  {
    return documentRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<DocumentRoot, FeatureMap> getDocumentRoot_Mixed()
  {
    return (EAttribute<DocumentRoot, FeatureMap>) documentRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<DocumentRoot, EMap<String, String>> getDocumentRoot_XMLNSPrefixMap()
  {
    return (EReference<DocumentRoot, EMap<String, String>>) documentRootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<DocumentRoot, EMap<String, String>> getDocumentRoot_XSISchemaLocation()
  {
    return (EReference<DocumentRoot, EMap<String, String>>) documentRootEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<DocumentRoot, CustomersType> getDocumentRoot_Customers()
  {
    return (EReference<DocumentRoot, CustomersType>) documentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<DocumentRoot, String> getDocumentRoot_ID()
  {
    return (EAttribute<DocumentRoot, String>) documentRootEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<USAddr> getUSAddr()
  {
    return usAddrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<USAddr, Object> getUSAddr_Zip()
  {
    return (EAttribute<USAddr, Object>) usAddrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<USAddr, String> getUSAddr_State()
  {
    return (EAttribute<USAddr, String>) usAddrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum<USState> getUSState()
  {
    return usStateEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<USState> getUSStateObject()
  {
    return usStateObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<BigInteger> getZipCodes()
  {
    return zipCodesEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Object> getZipUnion()
  {
    return zipUnionEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomerFactory getCustomerFactory()
  {
    return (CustomerFactory)getEFactoryInstance();
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
    addressTypeEClass = (EClass<AddressType>) createEClass(ADDRESS_TYPE);
    // CHANGE gen: Use raw type
    createEAttribute(addressTypeEClass, ADDRESS_TYPE__STREET);
    // CHANGE gen: Use raw type
    createEAttribute(addressTypeEClass, ADDRESS_TYPE__TOWN);

    // CHANGE gen: Add cast
    canadaAddrEClass = (EClass<CanadaAddr>) createEClass(CANADA_ADDR);
    // CHANGE gen: Use raw type
    createEAttribute(canadaAddrEClass, CANADA_ADDR__ZIP);
    // CHANGE gen: Use raw type
    createEAttribute(canadaAddrEClass, CANADA_ADDR__PROVINCE);

    // CHANGE gen: Add cast
    creditInfoEClass = (EClass<CreditInfo>) createEClass(CREDIT_INFO);
    // CHANGE gen: Use raw type
    createEAttribute(creditInfoEClass, CREDIT_INFO__HOLDER);
    // CHANGE gen: Use raw type
    createEAttribute(creditInfoEClass, CREDIT_INFO__CC_NUMBER);
    // CHANGE gen: Use raw type
    createEAttribute(creditInfoEClass, CREDIT_INFO__EXPIRE_DATE);

    // CHANGE gen: Add cast
    customersTypeEClass = (EClass<CustomersType>) createEClass(CUSTOMERS_TYPE);
    // CHANGE gen: Use raw type
    createEAttribute(customersTypeEClass, CUSTOMERS_TYPE__MIXED);
    // CHANGE gen: Use raw type
    createEReference(customersTypeEClass, CUSTOMERS_TYPE__CUSTOMER);

    // CHANGE gen: Add cast
    customerTypeEClass = (EClass<CustomerType>) createEClass(CUSTOMER_TYPE);
    // CHANGE gen: Use raw type
    createEAttribute(customerTypeEClass, CUSTOMER_TYPE__NAME);
    // CHANGE gen: Use raw type
    createEReference(customerTypeEClass, CUSTOMER_TYPE__ADDRESS);
    // CHANGE gen: Use raw type
    createEReference(customerTypeEClass, CUSTOMER_TYPE__CREDIT_CARD);
    // CHANGE gen: Use raw type
    createEAttribute(customerTypeEClass, CUSTOMER_TYPE__PAYMENT_DAY);
    // CHANGE gen: Use raw type
    createEAttribute(customerTypeEClass, CUSTOMER_TYPE__ID);

    // CHANGE gen: Add cast
    documentRootEClass = (EClass<DocumentRoot>) createEClass(DOCUMENT_ROOT);
    // CHANGE gen: Use raw type
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
    // CHANGE gen: Use raw type
    createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    // CHANGE gen: Use raw type
    createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    // CHANGE gen: Use raw type
    createEReference(documentRootEClass, DOCUMENT_ROOT__CUSTOMERS);
    // CHANGE gen: Use raw type
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__ID);

    // CHANGE gen: Add cast
    usAddrEClass = (EClass<USAddr>) createEClass(US_ADDR);
    // CHANGE gen: Use raw type
    createEAttribute(usAddrEClass, US_ADDR__ZIP);
    // CHANGE gen: Use raw type
    createEAttribute(usAddrEClass, US_ADDR__STATE);

    // Create enums
 		// CHANGE gen: Cast
    usStateEEnum = (EEnum<USState>) createEEnum(US_STATE);

    // Create data types
    // CHANGE gen: Cast
    usStateObjectEDataType = (EDataType<USState>) createEDataType(US_STATE_OBJECT);
    // CHANGE gen: Cast
    zipCodesEDataType = (EDataType<BigInteger>) createEDataType(ZIP_CODES);
    // CHANGE gen: Cast
    zipUnionEDataType = (EDataType<Object>) createEDataType(ZIP_UNION);
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

    // Obtain other dependent packages
    XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    canadaAddrEClass.getESuperTypes().add(this.getAddressType());
    usAddrEClass.getESuperTypes().add(this.getAddressType());

    // Initialize classes and features; add operations and parameters
    initEClass(addressTypeEClass, AddressType.class, "AddressType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAddressType_Street(), theXMLTypePackage.getString(), "street", null, 1, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddressType_Town(), theXMLTypePackage.getString(), "town", null, 1, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(canadaAddrEClass, CanadaAddr.class, "CanadaAddr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCanadaAddr_Zip(), theXMLTypePackage.getString(), "zip", null, 1, 1, CanadaAddr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCanadaAddr_Province(), theXMLTypePackage.getString(), "province", null, 1, 1, CanadaAddr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(creditInfoEClass, CreditInfo.class, "CreditInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreditInfo_Holder(), theXMLTypePackage.getString(), "holder", null, 1, 1, CreditInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreditInfo_CcNumber(), theXMLTypePackage.getInteger(), "ccNumber", null, 1, 1, CreditInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreditInfo_ExpireDate(), theXMLTypePackage.getGYearMonth(), "expireDate", null, 1, 1, CreditInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customersTypeEClass, CustomersType.class, "CustomersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCustomersType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, CustomersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomersType_Customer(), this.getCustomerType(), null, "customer", null, 1, -1, CustomersType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(customerTypeEClass, CustomerType.class, "CustomerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCustomerType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, CustomerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomerType_Address(), this.getAddressType(), null, "address", null, 1, 1, CustomerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomerType_CreditCard(), this.getCreditInfo(), null, "creditCard", null, 1, 1, CustomerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCustomerType_PaymentDay(), theXMLTypePackage.getGDay(), "paymentDay", null, 1, 1, CustomerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCustomerType_ID(), theXMLTypePackage.getID(), "iD", null, 1, 1, CustomerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Customers(), this.getCustomersType(), null, "customers", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocumentRoot_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(usAddrEClass, USAddr.class, "USAddr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUSAddr_Zip(), this.getZipUnion(), "zip", null, 1, 1, USAddr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUSAddr_State(), theXMLTypePackage.getString(), "state", null, 1, 1, USAddr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(usStateEEnum, USState.class, "USState");
    addEEnumLiteral(usStateEEnum, USState.AK);
    addEEnumLiteral(usStateEEnum, USState.AL);
    addEEnumLiteral(usStateEEnum, USState.AR);

    // Initialize data types
    initEDataType(usStateObjectEDataType, USState.class, "USStateObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(zipCodesEDataType, BigInteger.class, "ZipCodes", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(zipUnionEDataType, Object.class, "ZipUnion", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
  }

  /**
   * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createExtendedMetaDataAnnotations()
  {
    String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
    addAnnotation
      (addressTypeEClass, 
       source, 
       new String[] 
       {
       "name", "addressType",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getAddressType_Street(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "street"
       });	
    addAnnotation
      (getAddressType_Town(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "town"
       });	
    addAnnotation
      (canadaAddrEClass, 
       source, 
       new String[] 
       {
       "name", "canadaAddr",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getCanadaAddr_Zip(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "zip"
       });	
    addAnnotation
      (getCanadaAddr_Province(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "province"
       });	
    addAnnotation
      (creditInfoEClass, 
       source, 
       new String[] 
       {
       "name", "creditInfo",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getCreditInfo_Holder(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "holder"
       });	
    addAnnotation
      (getCreditInfo_CcNumber(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "cc_number"
       });	
    addAnnotation
      (getCreditInfo_ExpireDate(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "expireDate"
       });	
    addAnnotation
      (customersTypeEClass, 
       source, 
       new String[] 
       {
       "name", "customersType",
       "kind", "mixed"
       });	
    addAnnotation
      (getCustomersType_Mixed(), 
       source, 
       new String[] 
       {
       "kind", "elementWildcard",
       "name", ":mixed"
       });	
    addAnnotation
      (getCustomersType_Customer(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "customer",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (customerTypeEClass, 
       source, 
       new String[] 
       {
       "name", "dbcustomer",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getCustomerType_Name(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "name"
       });	
    addAnnotation
      (getCustomerType_Address(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "address"
       });	
    addAnnotation
      (getCustomerType_CreditCard(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "creditCard"
       });	
    addAnnotation
      (getCustomerType_PaymentDay(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "paymentDay"
       });	
    addAnnotation
      (getCustomerType_ID(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "ID",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (documentRootEClass, 
       source, 
       new String[] 
       {
       "name", "",
       "kind", "mixed"
       });	
    addAnnotation
      (getDocumentRoot_Mixed(), 
       source, 
       new String[] 
       {
       "kind", "elementWildcard",
       "name", ":mixed"
       });	
    addAnnotation
      (getDocumentRoot_XMLNSPrefixMap(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "xmlns:prefix"
       });	
    addAnnotation
      (getDocumentRoot_XSISchemaLocation(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "xsi:schemaLocation"
       });	
    addAnnotation
      (getDocumentRoot_Customers(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "customers",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getDocumentRoot_ID(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "ID",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (usAddrEClass, 
       source, 
       new String[] 
       {
       "name", "USAddr",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getUSAddr_Zip(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "zip"
       });	
    addAnnotation
      (getUSAddr_State(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "state"
       });	
    addAnnotation
      (usStateEEnum, 
       source, 
       new String[] 
       {
       "name", "USState"
       });	
    addAnnotation
      (usStateObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "USState:Object",
       "baseType", "USState"
       });	
    addAnnotation
      (zipCodesEDataType, 
       source, 
       new String[] 
       {
       "name", "zipCodes",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
       "minInclusive", "10000",
       "maxInclusive", "99999"
       });	
    addAnnotation
      (zipUnionEDataType, 
       source, 
       new String[] 
       {
       "name", "zipUnion",
       "memberTypes", "USState zipCodes"
       });
  }

} //CustomerPackageImpl
