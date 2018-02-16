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
package org.eclipse.emf.test.models.qname.impl;

import java.util.List;

import javax.xml.namespace.QName;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.test.models.qname.DocumentRoot;
import org.eclipse.emf.test.models.qname.QNameFactory;
import org.eclipse.emf.test.models.qname.QNamePackage;
import org.eclipse.emf.test.models.qname.ResourceType;
import org.eclipse.emf.test.models.qname.util.QNameValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QNamePackageImpl extends EPackageImpl implements QNamePackage
{
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
  private EClass<ResourceType> resourceTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Object> intQNameUnionEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<List<Object>> listUnionEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<List<QName>> qnameListEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Object> unionEDataType = null;

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
   * @see org.eclipse.emf.test.models.qname.QNamePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private QNamePackageImpl()
  {
    super(eNS_URI, QNameFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link QNamePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static QNamePackage init()
  {
    if (isInited) return (QNamePackage)EPackage.Registry.INSTANCE.getEPackage(QNamePackage.eNS_URI);

    // Obtain or create and register package
    QNamePackageImpl theQNamePackage = (QNamePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QNamePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QNamePackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theQNamePackage.createPackageContents();

    // Initialize created meta-data
    theQNamePackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theQNamePackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return QNameValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theQNamePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(QNamePackage.eNS_URI, theQNamePackage);
    return theQNamePackage;
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
  public EAttribute<DocumentRoot, QName> getDocumentRoot_AnyE()
  {
    return (EAttribute<DocumentRoot, QName>) documentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<DocumentRoot, List<Object>> getDocumentRoot_AnyEU()
  {
    return (EAttribute<DocumentRoot, List<Object>>) documentRootEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<DocumentRoot, ResourceType> getDocumentRoot_Resource()
  {
    return (EReference<DocumentRoot, ResourceType>) documentRootEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<DocumentRoot, Integer> getDocumentRoot_AInt()
  {
    return (EAttribute<DocumentRoot, Integer>) documentRootEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<DocumentRoot, QName> getDocumentRoot_AQname()
  {
    return (EAttribute<DocumentRoot, QName>) documentRootEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<DocumentRoot, List<Object>> getDocumentRoot_AUnion()
  {
    return (EAttribute<DocumentRoot, List<Object>>) documentRootEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<ResourceType> getResourceType()
  {
    return resourceTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<ResourceType, Object> getResourceType_Unionvalue()
  {
    return (EAttribute<ResourceType, Object>) resourceTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<ResourceType, List<QName>> getResourceType_Qnamelist()
  {
    return (EAttribute<ResourceType, List<QName>>) resourceTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<ResourceType, Integer> getResourceType_Intvalue()
  {
    return (EAttribute<ResourceType, Integer>) resourceTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<ResourceType, FeatureMap> getResourceType_Any()
  {
    return (EAttribute<ResourceType, FeatureMap>) resourceTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<ResourceType, List<QName>> getResourceType_MyQname()
  {
    return (EAttribute<ResourceType, List<QName>>) resourceTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<ResourceType, FeatureMap> getResourceType_AnyAttribute()
  {
    return (EAttribute<ResourceType, FeatureMap>) resourceTypeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Object> getIntQNameUnion()
  {
    return intQNameUnionEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<List<Object>> getListUnion()
  {
    return listUnionEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<List<QName>> getQnameList()
  {
    return qnameListEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Object> getUnion()
  {
    return unionEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QNameFactory getQNameFactory()
  {
    return (QNameFactory)getEFactoryInstance();
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
    documentRootEClass = (EClass<DocumentRoot>) createEClass(DOCUMENT_ROOT);
    // CHANGE gen: Use raw type
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
    // CHANGE gen: Use raw type
    createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    // CHANGE gen: Use raw type
    createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    // CHANGE gen: Use raw type
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__ANY_E);
    // CHANGE gen: Use raw type
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__ANY_EU);
    // CHANGE gen: Use raw type
    createEReference(documentRootEClass, DOCUMENT_ROOT__RESOURCE);
    // CHANGE gen: Use raw type
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__AINT);
    // CHANGE gen: Use raw type
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__AQNAME);
    // CHANGE gen: Use raw type
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__AUNION);

    // CHANGE gen: Add cast
    resourceTypeEClass = (EClass<ResourceType>) createEClass(RESOURCE_TYPE);
    // CHANGE gen: Use raw type
    createEAttribute(resourceTypeEClass, RESOURCE_TYPE__UNIONVALUE);
    // CHANGE gen: Use raw type
    createEAttribute(resourceTypeEClass, RESOURCE_TYPE__QNAMELIST);
    // CHANGE gen: Use raw type
    createEAttribute(resourceTypeEClass, RESOURCE_TYPE__INTVALUE);
    // CHANGE gen: Use raw type
    createEAttribute(resourceTypeEClass, RESOURCE_TYPE__ANY);
    // CHANGE gen: Use raw type
    createEAttribute(resourceTypeEClass, RESOURCE_TYPE__MY_QNAME);
    // CHANGE gen: Use raw type
    createEAttribute(resourceTypeEClass, RESOURCE_TYPE__ANY_ATTRIBUTE);

    // Create data types
    // CHANGE gen: Cast
    intQNameUnionEDataType = (EDataType<Object>) createEDataType(INT_QNAME_UNION);
    // CHANGE gen: Cast
    listUnionEDataType = (EDataType<List<Object>>) createEDataType(LIST_UNION);
    // CHANGE gen: Cast
    qnameListEDataType = (EDataType<List<QName>>) createEDataType(QNAME_LIST);
    // CHANGE gen: Cast
    unionEDataType = (EDataType<Object>) createEDataType(UNION);
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
    initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocumentRoot_AnyE(), theXMLTypePackage.getQName(), "anyE", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocumentRoot_AnyEU(), this.getListUnion(), "anyEU", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Resource(), this.getResourceType(), null, "resource", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocumentRoot_AInt(), theXMLTypePackage.getInt(), "aInt", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocumentRoot_AQname(), theXMLTypePackage.getQName(), "aQname", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocumentRoot_AUnion(), this.getListUnion(), "aUnion", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceTypeEClass, ResourceType.class, "ResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResourceType_Unionvalue(), this.getIntQNameUnion(), "unionvalue", null, 1, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResourceType_Qnamelist(), this.getQnameList(), "qnamelist", null, 1, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResourceType_Intvalue(), theXMLTypePackage.getInt(), "intvalue", null, 1, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResourceType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResourceType_MyQname(), this.getQnameList(), "myQname", null, 0, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResourceType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize data types
    initEDataType(intQNameUnionEDataType, Object.class, "IntQNameUnion", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(listUnionEDataType, List.class, "ListUnion", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(qnameListEDataType, List.class, "QnameList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(unionEDataType, Object.class, "Union", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
      (getDocumentRoot_AnyE(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "anyE",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getDocumentRoot_AnyEU(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "anyEU",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getDocumentRoot_Resource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "resource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getDocumentRoot_AInt(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "aInt",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getDocumentRoot_AQname(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "aQname",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getDocumentRoot_AUnion(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "aUnion",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (intQNameUnionEDataType, 
       source, 
       new String[] 
       {
       "name", "intQNameUnion",
       "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#int http://www.eclipse.org/emf/2003/XMLType#QName"
       });	
    addAnnotation
      (listUnionEDataType, 
       source, 
       new String[] 
       {
       "name", "listUnion",
       "itemType", "Union"
       });	
    addAnnotation
      (qnameListEDataType, 
       source, 
       new String[] 
       {
       "name", "qnameList",
       "itemType", "http://www.eclipse.org/emf/2003/XMLType#QName"
       });	
    addAnnotation
      (resourceTypeEClass, 
       source, 
       new String[] 
       {
       "name", "resourceType",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getResourceType_Unionvalue(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "unionvalue",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getResourceType_Qnamelist(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "qnamelist",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getResourceType_Intvalue(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "intvalue",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getResourceType_Any(), 
       source, 
       new String[] 
       {
       "kind", "elementWildcard",
       "wildcards", "##any",
       "name", ":3",
       "processing", "strict"
       });	
    addAnnotation
      (getResourceType_MyQname(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "myQname"
       });	
    addAnnotation
      (getResourceType_AnyAttribute(), 
       source, 
       new String[] 
       {
       "kind", "attributeWildcard",
       "wildcards", "##any",
       "name", ":5",
       "processing", "strict"
       });	
    addAnnotation
      (unionEDataType, 
       source, 
       new String[] 
       {
       "name", "Union",
       "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#boolean intQNameUnion"
       });
  }

} //QNamePackageImpl
