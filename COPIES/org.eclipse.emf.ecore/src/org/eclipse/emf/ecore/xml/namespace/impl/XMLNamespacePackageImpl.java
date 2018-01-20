/**
 * Copyright (c) 2003-2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.emf.ecore.xml.namespace.impl;


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
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.ecore.xml.namespace.SpaceType;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespaceDocumentRoot;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespaceFactory;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.emf.ecore.xml.namespace.util.XMLNamespaceValidator;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XMLNamespacePackageImpl extends EPackageImpl implements XMLNamespacePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<XMLNamespaceDocumentRoot> xmlNamespaceDocumentRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum<SpaceType> spaceTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<String> langTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<String> langTypeNullEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<SpaceType> spaceTypeObjectEDataType = null;

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
   * @see org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private XMLNamespacePackageImpl()
  {
    super(eNS_URI, XMLNamespaceFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link XMLNamespacePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static XMLNamespacePackage init()
  {
    if (isInited) return (XMLNamespacePackage)EPackage.Registry.INSTANCE.getEPackage(XMLNamespacePackage.eNS_URI);

    // Obtain or create and register package
    XMLNamespacePackageImpl theXMLNamespacePackage = (XMLNamespacePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XMLNamespacePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XMLNamespacePackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theXMLNamespacePackage.createPackageContents();

    // Initialize created meta-data
    theXMLNamespacePackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theXMLNamespacePackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return XMLNamespaceValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theXMLNamespacePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(XMLNamespacePackage.eNS_URI, theXMLNamespacePackage);
    return theXMLNamespacePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<XMLNamespaceDocumentRoot> getXMLNamespaceDocumentRoot()
  {
    return xmlNamespaceDocumentRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<XMLNamespaceDocumentRoot, FeatureMap> getXMLNamespaceDocumentRoot_Mixed()
  {
    return (EAttribute<XMLNamespaceDocumentRoot, FeatureMap>) xmlNamespaceDocumentRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<XMLNamespaceDocumentRoot, EMap<String, String>> getXMLNamespaceDocumentRoot_XMLNSPrefixMap()
  {
    return (EReference<XMLNamespaceDocumentRoot, EMap<String, String>>) xmlNamespaceDocumentRootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<XMLNamespaceDocumentRoot, EMap<String, String>> getXMLNamespaceDocumentRoot_XSISchemaLocation()
  {
    return (EReference<XMLNamespaceDocumentRoot, EMap<String, String>>) xmlNamespaceDocumentRootEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<XMLNamespaceDocumentRoot, String> getXMLNamespaceDocumentRoot_Base()
  {
    return (EAttribute<XMLNamespaceDocumentRoot, String>) xmlNamespaceDocumentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<XMLNamespaceDocumentRoot, String> getXMLNamespaceDocumentRoot_Id()
  {
    return (EAttribute<XMLNamespaceDocumentRoot, String>) xmlNamespaceDocumentRootEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<XMLNamespaceDocumentRoot, String> getXMLNamespaceDocumentRoot_Lang()
  {
    return (EAttribute<XMLNamespaceDocumentRoot, String>) xmlNamespaceDocumentRootEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<XMLNamespaceDocumentRoot, SpaceType> getXMLNamespaceDocumentRoot_Space()
  {
    return (EAttribute<XMLNamespaceDocumentRoot, SpaceType>) xmlNamespaceDocumentRootEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum<SpaceType> getSpaceType()
  {
    return spaceTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<String> getLangType()
  {
    return langTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<String> getLangTypeNull()
  {
    return langTypeNullEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<SpaceType> getSpaceTypeObject()
  {
    return spaceTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLNamespaceFactory getXMLNamespaceFactory()
  {
    return (XMLNamespaceFactory)getEFactoryInstance();
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
    xmlNamespaceDocumentRootEClass = (EClass<XMLNamespaceDocumentRoot>) createEClass(XML_NAMESPACE_DOCUMENT_ROOT);
    // CHANGE gen: Use raw type
    createEAttribute(xmlNamespaceDocumentRootEClass, XML_NAMESPACE_DOCUMENT_ROOT__MIXED);
    // CHANGE gen: Use raw type
    createEReference(xmlNamespaceDocumentRootEClass, XML_NAMESPACE_DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    // CHANGE gen: Use raw type
    createEReference(xmlNamespaceDocumentRootEClass, XML_NAMESPACE_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    // CHANGE gen: Use raw type
    createEAttribute(xmlNamespaceDocumentRootEClass, XML_NAMESPACE_DOCUMENT_ROOT__BASE);
    // CHANGE gen: Use raw type
    createEAttribute(xmlNamespaceDocumentRootEClass, XML_NAMESPACE_DOCUMENT_ROOT__ID);
    // CHANGE gen: Use raw type
    createEAttribute(xmlNamespaceDocumentRootEClass, XML_NAMESPACE_DOCUMENT_ROOT__LANG);
    // CHANGE gen: Use raw type
    createEAttribute(xmlNamespaceDocumentRootEClass, XML_NAMESPACE_DOCUMENT_ROOT__SPACE);

    // Create enums
 		// CHANGE gen: Cast
    spaceTypeEEnum = (EEnum<SpaceType>) createEEnum(SPACE_TYPE);

    // Create data types
    // CHANGE gen: Cast
    langTypeEDataType = (EDataType<String>) createEDataType(LANG_TYPE);
    // CHANGE gen: Cast
    langTypeNullEDataType = (EDataType<String>) createEDataType(LANG_TYPE_NULL);
    // CHANGE gen: Cast
    spaceTypeObjectEDataType = (EDataType<SpaceType>) createEDataType(SPACE_TYPE_OBJECT);
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
    initEClass(xmlNamespaceDocumentRootEClass, XMLNamespaceDocumentRoot.class, "XMLNamespaceDocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXMLNamespaceDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXMLNamespaceDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXMLNamespaceDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXMLNamespaceDocumentRoot_Base(), theXMLTypePackage.getAnyURI(), "base", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXMLNamespaceDocumentRoot_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXMLNamespaceDocumentRoot_Lang(), this.getLangType(), "lang", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXMLNamespaceDocumentRoot_Space(), this.getSpaceType(), "space", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(spaceTypeEEnum, SpaceType.class, "SpaceType");
    addEEnumLiteral(spaceTypeEEnum, SpaceType.DEFAULT_LITERAL);
    addEEnumLiteral(spaceTypeEEnum, SpaceType.PRESERVE_LITERAL);

    // Initialize data types
    initEDataType(langTypeEDataType, String.class, "LangType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(langTypeNullEDataType, String.class, "LangTypeNull", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(spaceTypeObjectEDataType, SpaceType.class, "SpaceTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.w3.org/XML/1998/namespace
    createNamespaceAnnotations();
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.w3.org/XML/1998/namespace</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createNamespaceAnnotations()
  {
    String source = "http://www.w3.org/XML/1998/namespace";	
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "lang", "en"
       });
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
      (langTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "lang_._type",
       "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#language lang_._type_._member_._1"
       });	
    addAnnotation
      (langTypeNullEDataType, 
       source, 
       new String[] 
       {
       "name", "lang_._type_._member_._1",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "enumeration", ""
       });	
    addAnnotation
      (spaceTypeEEnum, 
       source, 
       new String[] 
       {
       "name", "space_._type"
       });	
    addAnnotation
      (spaceTypeObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "space_._type:Object",
       "baseType", "space_._type"
       });	
    addAnnotation
      (xmlNamespaceDocumentRootEClass, 
       source, 
       new String[] 
       {
       "name", "",
       "kind", "mixed"
       });	
    addAnnotation
      (getXMLNamespaceDocumentRoot_Mixed(), 
       source, 
       new String[] 
       {
       "kind", "elementWildcard",
       "name", ":mixed"
       });	
    addAnnotation
      (getXMLNamespaceDocumentRoot_XMLNSPrefixMap(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "xmlns:prefix"
       });	
    addAnnotation
      (getXMLNamespaceDocumentRoot_XSISchemaLocation(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "xsi:schemaLocation"
       });	
    addAnnotation
      (getXMLNamespaceDocumentRoot_Base(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "base",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getXMLNamespaceDocumentRoot_Id(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "id",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getXMLNamespaceDocumentRoot_Lang(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "lang",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getXMLNamespaceDocumentRoot_Space(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "space",
       "namespace", "##targetNamespace"
       });
  }

} //XMLNamespacePackageImpl
