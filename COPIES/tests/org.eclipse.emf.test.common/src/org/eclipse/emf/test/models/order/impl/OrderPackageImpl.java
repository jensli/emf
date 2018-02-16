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
package org.eclipse.emf.test.models.order.impl;

import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.test.models.customer.CustomerPackage;
import org.eclipse.emf.test.models.customer.impl.CustomerPackageImpl;
import org.eclipse.emf.test.models.movie.db.DBPackage;
import org.eclipse.emf.test.models.movie.db.impl.DBPackageImpl;
import org.eclipse.emf.test.models.order.CustomerOrder;
import org.eclipse.emf.test.models.order.DocumentRoot;
import org.eclipse.emf.test.models.order.Order;
import org.eclipse.emf.test.models.order.OrderFactory;
import org.eclipse.emf.test.models.order.OrderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrderPackageImpl extends EPackageImpl implements OrderPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<CustomerOrder> customerOrderEClass = null;

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
  private EClass<Order> orderEClass = null;

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
   * @see org.eclipse.emf.test.models.order.OrderPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private OrderPackageImpl()
  {
    super(eNS_URI, OrderFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link OrderPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static OrderPackage init()
  {
    if (isInited) return (OrderPackage)EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI);

    // Obtain or create and register package
    OrderPackageImpl theOrderPackage = (OrderPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OrderPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OrderPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Obtain or create and register interdependencies
    CustomerPackageImpl theCustomerPackage = (CustomerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CustomerPackage.eNS_URI) instanceof CustomerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CustomerPackage.eNS_URI) : CustomerPackage.eINSTANCE);
    DBPackageImpl theDBPackage = (DBPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DBPackage.eNS_URI) instanceof DBPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DBPackage.eNS_URI) : DBPackage.eINSTANCE);

    // Create package meta-data objects
    theOrderPackage.createPackageContents();
    theCustomerPackage.createPackageContents();
    theDBPackage.createPackageContents();

    // Initialize created meta-data
    theOrderPackage.initializePackageContents();
    theCustomerPackage.initializePackageContents();
    theDBPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theOrderPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(OrderPackage.eNS_URI, theOrderPackage);
    return theOrderPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<CustomerOrder> getCustomerOrder()
  {
    return customerOrderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<CustomerOrder, Order> getCustomerOrder_MoviesToSee()
  {
    return (EReference<CustomerOrder, Order>) customerOrderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<CustomerOrder, Order> getCustomerOrder_MoviesSeen()
  {
    return (EReference<CustomerOrder, Order>) customerOrderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<CustomerOrder, FeatureMap> getCustomerOrder_Any()
  {
    return (EAttribute<CustomerOrder, FeatureMap>) customerOrderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<CustomerOrder, String> getCustomerOrder_CustomerID()
  {
    return (EAttribute<CustomerOrder, String>) customerOrderEClass.getEStructuralFeatures().get(3);
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
  public EReference<DocumentRoot, CustomerOrder> getDocumentRoot_Order()
  {
    return (EReference<DocumentRoot, CustomerOrder>) documentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<Order> getOrder()
  {
    return orderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<Order, XMLGregorianCalendar> getOrder_DateRequested()
  {
    return (EAttribute<Order, XMLGregorianCalendar>) orderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<Order, XMLGregorianCalendar> getOrder_LastUpdated()
  {
    return (EAttribute<Order, XMLGregorianCalendar>) orderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<Order, List<String>> getOrder_Movies()
  {
    return (EAttribute<Order, List<String>>) orderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderFactory getOrderFactory()
  {
    return (OrderFactory)getEFactoryInstance();
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
    customerOrderEClass = (EClass<CustomerOrder>) createEClass(CUSTOMER_ORDER);
    // CHANGE gen: Use raw type
    createEReference(customerOrderEClass, CUSTOMER_ORDER__MOVIES_TO_SEE);
    // CHANGE gen: Use raw type
    createEReference(customerOrderEClass, CUSTOMER_ORDER__MOVIES_SEEN);
    // CHANGE gen: Use raw type
    createEAttribute(customerOrderEClass, CUSTOMER_ORDER__ANY);
    // CHANGE gen: Use raw type
    createEAttribute(customerOrderEClass, CUSTOMER_ORDER__CUSTOMER_ID);

    // CHANGE gen: Add cast
    documentRootEClass = (EClass<DocumentRoot>) createEClass(DOCUMENT_ROOT);
    // CHANGE gen: Use raw type
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
    // CHANGE gen: Use raw type
    createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    // CHANGE gen: Use raw type
    createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    // CHANGE gen: Use raw type
    createEReference(documentRootEClass, DOCUMENT_ROOT__ORDER);

    // CHANGE gen: Add cast
    orderEClass = (EClass<Order>) createEClass(ORDER);
    // CHANGE gen: Use raw type
    createEAttribute(orderEClass, ORDER__DATE_REQUESTED);
    // CHANGE gen: Use raw type
    createEAttribute(orderEClass, ORDER__LAST_UPDATED);
    // CHANGE gen: Use raw type
    createEAttribute(orderEClass, ORDER__MOVIES);
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

    // Initialize classes and features; add operations and parameters
    initEClass(customerOrderEClass, CustomerOrder.class, "CustomerOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCustomerOrder_MoviesToSee(), this.getOrder(), null, "moviesToSee", null, 1, 1, CustomerOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomerOrder_MoviesSeen(), this.getOrder(), null, "moviesSeen", null, 0, 1, CustomerOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCustomerOrder_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, -1, CustomerOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCustomerOrder_CustomerID(), theXMLTypePackage.getIDREF(), "customerID", null, 0, 1, CustomerOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Order(), this.getCustomerOrder(), null, "order", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(orderEClass, Order.class, "Order", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOrder_DateRequested(), theXMLTypePackage.getDate(), "dateRequested", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOrder_LastUpdated(), theXMLTypePackage.getDate(), "lastUpdated", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOrder_Movies(), theXMLTypePackage.getIDREFS(), "movies", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
    // null
    createNullAnnotations();
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
      (customerOrderEClass, 
       source, 
       new String[] 
       {
       "name", "customerOrder",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getCustomerOrder_MoviesToSee(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "moviesToSee"
       });	
    addAnnotation
      (getCustomerOrder_MoviesSeen(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "moviesSeen"
       });	
    addAnnotation
      (getCustomerOrder_Any(), 
       source, 
       new String[] 
       {
       "kind", "elementWildcard",
       "wildcards", "http:///org.eclipse.emf.test.models/Customer http:///org.eclipse.emf.test.models/MovieDB",
       "name", ":2",
       "processing", "strict"
       });	
    addAnnotation
      (getCustomerOrder_CustomerID(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "customerID"
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
      (getDocumentRoot_Order(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "order",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (orderEClass, 
       source, 
       new String[] 
       {
       "name", "order",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getOrder_DateRequested(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "dateRequested"
       });	
    addAnnotation
      (getOrder_LastUpdated(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "lastUpdated"
       });	
    addAnnotation
      (getOrder_Movies(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "movies"
       });
  }

  /**
   * Initializes the annotations for <b>null</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createNullAnnotations()
  {
    String source = null;	
    addAnnotation
      (orderEClass, 
       source, 
       new String[] 
       {
       "appinfo", "Information:<hasElement>date</hasElement>."
       });
  }

} //OrderPackageImpl
