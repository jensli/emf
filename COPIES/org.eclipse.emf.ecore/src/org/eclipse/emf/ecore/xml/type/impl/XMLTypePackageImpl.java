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
package org.eclipse.emf.ecore.xml.type.impl;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.ProcessingInstruction;
import org.eclipse.emf.ecore.xml.type.SimpleAnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;


import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XMLTypePackageImpl extends EPackageImpl implements XMLTypePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<AnyType> anyTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<ProcessingInstruction> processingInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<SimpleAnyType> simpleAnyTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<XMLTypeDocumentRoot> xmlTypeDocumentRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Object> anySimpleTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<String> anyURIEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<byte[]> base64BinaryEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Boolean> booleanEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Boolean> booleanObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<BigDecimal> decimalEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<BigInteger> integerEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Integer> intObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Long> longEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Long> longObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Integer> intEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Short> shortEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Short> shortObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Byte> byteEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Byte> byteObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<XMLGregorianCalendar> dateEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<XMLGregorianCalendar> dateTimeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<String> stringEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Double> doubleEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Double> doubleObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Duration> durationEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<List<String>> entitiesBaseEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<String> normalizedStringEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<String> tokenEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<String> nameEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<String> ncNameEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<String> entityEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<List<String>> entitiesEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Float> floatEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Float> floatObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<XMLGregorianCalendar> gDayEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<XMLGregorianCalendar> gMonthEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<XMLGregorianCalendar> gMonthDayEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<XMLGregorianCalendar> gYearEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<XMLGregorianCalendar> gYearMonthEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<byte[]> hexBinaryEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<String> idEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<String> idrefEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<List<String>> idrefsBaseEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<List<String>> idrefsEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<String> languageEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<BigInteger> nonPositiveIntegerEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<BigInteger> negativeIntegerEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<String> nmtokenEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<List<String>> nmtokensBaseEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<List<String>> nmtokensEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<BigInteger> nonNegativeIntegerEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<QName> notationEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<BigInteger> positiveIntegerEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<QName> qNameEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<XMLGregorianCalendar> timeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<BigInteger> unsignedLongEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Long> unsignedIntEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Long> unsignedIntObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Integer> unsignedShortEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Integer> unsignedShortObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Short> unsignedByteEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType<Short> unsignedByteObjectEDataType = null;

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
   * @see org.eclipse.emf.ecore.xml.type.XMLTypePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private XMLTypePackageImpl()
  {
    super(eNS_URI, XMLTypeFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link XMLTypePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static XMLTypePackage init()
  {
    if (isInited) return (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

    // Obtain or create and register package
    XMLTypePackageImpl theXMLTypePackage = (XMLTypePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XMLTypePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XMLTypePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theXMLTypePackage.createPackageContents();

    // Initialize created meta-data
    theXMLTypePackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theXMLTypePackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return XMLTypeValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theXMLTypePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(XMLTypePackage.eNS_URI, theXMLTypePackage);
    return theXMLTypePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<AnyType> getAnyType()
  {
    return anyTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<AnyType, FeatureMap> getAnyType_Mixed()
  {
    return (EAttribute<AnyType, FeatureMap>) anyTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<AnyType, FeatureMap> getAnyType_Any()
  {
    return (EAttribute<AnyType, FeatureMap>) anyTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<AnyType, FeatureMap> getAnyType_AnyAttribute()
  {
    return (EAttribute<AnyType, FeatureMap>) anyTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<ProcessingInstruction> getProcessingInstruction()
  {
    return processingInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<ProcessingInstruction, String> getProcessingInstruction_Data()
  {
    return (EAttribute<ProcessingInstruction, String>) processingInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<ProcessingInstruction, String> getProcessingInstruction_Target()
  {
    return (EAttribute<ProcessingInstruction, String>) processingInstructionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<SimpleAnyType> getSimpleAnyType()
  {
    return simpleAnyTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<SimpleAnyType, String> getSimpleAnyType_RawValue()
  {
    return (EAttribute<SimpleAnyType, String>) simpleAnyTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<SimpleAnyType, Object> getSimpleAnyType_Value()
  {
    return (EAttribute<SimpleAnyType, Object>) simpleAnyTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<SimpleAnyType, EDataType> getSimpleAnyType_InstanceType()
  {
    return (EReference<SimpleAnyType, EDataType>) simpleAnyTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<XMLTypeDocumentRoot> getXMLTypeDocumentRoot()
  {
    return xmlTypeDocumentRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<XMLTypeDocumentRoot, FeatureMap> getXMLTypeDocumentRoot_Mixed()
  {
    return (EAttribute<XMLTypeDocumentRoot, FeatureMap>) xmlTypeDocumentRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<XMLTypeDocumentRoot, EMap<String, String>> getXMLTypeDocumentRoot_XMLNSPrefixMap()
  {
    return (EReference<XMLTypeDocumentRoot, EMap<String, String>>) xmlTypeDocumentRootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<XMLTypeDocumentRoot, EMap<String, String>> getXMLTypeDocumentRoot_XSISchemaLocation()
  {
    return (EReference<XMLTypeDocumentRoot, EMap<String, String>>) xmlTypeDocumentRootEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<XMLTypeDocumentRoot, EList<String>> getXMLTypeDocumentRoot_CDATA()
  {
    return (EAttribute<XMLTypeDocumentRoot, EList<String>>) xmlTypeDocumentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<XMLTypeDocumentRoot, EList<String>> getXMLTypeDocumentRoot_Comment()
  {
    return (EAttribute<XMLTypeDocumentRoot, EList<String>>) xmlTypeDocumentRootEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<XMLTypeDocumentRoot, EList<String>> getXMLTypeDocumentRoot_Text()
  {
    return (EAttribute<XMLTypeDocumentRoot, EList<String>>) xmlTypeDocumentRootEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<XMLTypeDocumentRoot, EList<ProcessingInstruction>> getXMLTypeDocumentRoot_ProcessingInstruction()
  {
    return (EReference<XMLTypeDocumentRoot, EList<ProcessingInstruction>>) xmlTypeDocumentRootEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Object> getAnySimpleType()
  {
    return anySimpleTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<String> getAnyURI()
  {
    return anyURIEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<byte[]> getBase64Binary()
  {
    return base64BinaryEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Boolean> getBoolean()
  {
    return booleanEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Boolean> getBooleanObject()
  {
    return booleanObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<BigDecimal> getDecimal()
  {
    return decimalEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<BigInteger> getInteger()
  {
    return integerEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Integer> getIntObject()
  {
    return intObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Long> getLong()
  {
    return longEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Long> getLongObject()
  {
    return longObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Integer> getInt()
  {
    return intEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Short> getShort()
  {
    return shortEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Short> getShortObject()
  {
    return shortObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Byte> getByte()
  {
    return byteEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Byte> getByteObject()
  {
    return byteObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<XMLGregorianCalendar> getDate()
  {
    return dateEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<XMLGregorianCalendar> getDateTime()
  {
    return dateTimeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<String> getString()
  {
    return stringEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Double> getDouble()
  {
    return doubleEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Double> getDoubleObject()
  {
    return doubleObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Duration> getDuration()
  {
    return durationEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<List<String>> getENTITIESBase()
  {
    return entitiesBaseEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<String> getNormalizedString()
  {
    return normalizedStringEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<String> getToken()
  {
    return tokenEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<String> getName_()
  {
    return nameEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<String> getNCName()
  {
    return ncNameEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<String> getENTITY()
  {
    return entityEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<List<String>> getENTITIES()
  {
    return entitiesEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Float> getFloat()
  {
    return floatEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Float> getFloatObject()
  {
    return floatObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<XMLGregorianCalendar> getGDay()
  {
    return gDayEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<XMLGregorianCalendar> getGMonth()
  {
    return gMonthEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<XMLGregorianCalendar> getGMonthDay()
  {
    return gMonthDayEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<XMLGregorianCalendar> getGYear()
  {
    return gYearEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<XMLGregorianCalendar> getGYearMonth()
  {
    return gYearMonthEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<byte[]> getHexBinary()
  {
    return hexBinaryEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<String> getID()
  {
    return idEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<String> getIDREF()
  {
    return idrefEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<List<String>> getIDREFSBase()
  {
    return idrefsBaseEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<List<String>> getIDREFS()
  {
    return idrefsEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<String> getLanguage()
  {
    return languageEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<BigInteger> getNonPositiveInteger()
  {
    return nonPositiveIntegerEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<BigInteger> getNegativeInteger()
  {
    return negativeIntegerEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<String> getNMTOKEN()
  {
    return nmtokenEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<List<String>> getNMTOKENSBase()
  {
    return nmtokensBaseEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<List<String>> getNMTOKENS()
  {
    return nmtokensEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<BigInteger> getNonNegativeInteger()
  {
    return nonNegativeIntegerEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<QName> getNOTATION()
  {
    return notationEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<BigInteger> getPositiveInteger()
  {
    return positiveIntegerEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<QName> getQName()
  {
    return qNameEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<XMLGregorianCalendar> getTime()
  {
    return timeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<BigInteger> getUnsignedLong()
  {
    return unsignedLongEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Long> getUnsignedInt()
  {
    return unsignedIntEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Long> getUnsignedIntObject()
  {
    return unsignedIntObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Integer> getUnsignedShort()
  {
    return unsignedShortEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Integer> getUnsignedShortObject()
  {
    return unsignedShortObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Short> getUnsignedByte()
  {
    return unsignedByteEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType<Short> getUnsignedByteObject()
  {
    return unsignedByteObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLTypeFactory getXMLTypeFactory()
  {
    return (XMLTypeFactory)getEFactoryInstance();
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
    anyTypeEClass = (EClass<AnyType>) createEClass(ANY_TYPE);
    // CHANGE gen: Use raw type
    createEAttribute(anyTypeEClass, ANY_TYPE__MIXED);
    // CHANGE gen: Use raw type
    createEAttribute(anyTypeEClass, ANY_TYPE__ANY);
    // CHANGE gen: Use raw type
    createEAttribute(anyTypeEClass, ANY_TYPE__ANY_ATTRIBUTE);

    // CHANGE gen: Add cast
    processingInstructionEClass = (EClass<ProcessingInstruction>) createEClass(PROCESSING_INSTRUCTION);
    // CHANGE gen: Use raw type
    createEAttribute(processingInstructionEClass, PROCESSING_INSTRUCTION__DATA);
    // CHANGE gen: Use raw type
    createEAttribute(processingInstructionEClass, PROCESSING_INSTRUCTION__TARGET);

    // CHANGE gen: Add cast
    simpleAnyTypeEClass = (EClass<SimpleAnyType>) createEClass(SIMPLE_ANY_TYPE);
    // CHANGE gen: Use raw type
    createEAttribute(simpleAnyTypeEClass, SIMPLE_ANY_TYPE__RAW_VALUE);
    // CHANGE gen: Use raw type
    createEAttribute(simpleAnyTypeEClass, SIMPLE_ANY_TYPE__VALUE);
    // CHANGE gen: Use raw type
    createEReference(simpleAnyTypeEClass, SIMPLE_ANY_TYPE__INSTANCE_TYPE);

    // CHANGE gen: Add cast
    xmlTypeDocumentRootEClass = (EClass<XMLTypeDocumentRoot>) createEClass(XML_TYPE_DOCUMENT_ROOT);
    // CHANGE gen: Use raw type
    createEAttribute(xmlTypeDocumentRootEClass, XML_TYPE_DOCUMENT_ROOT__MIXED);
    // CHANGE gen: Use raw type
    createEReference(xmlTypeDocumentRootEClass, XML_TYPE_DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    // CHANGE gen: Use raw type
    createEReference(xmlTypeDocumentRootEClass, XML_TYPE_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    // CHANGE gen: Use raw type
    createEAttribute(xmlTypeDocumentRootEClass, XML_TYPE_DOCUMENT_ROOT__CDATA);
    // CHANGE gen: Use raw type
    createEAttribute(xmlTypeDocumentRootEClass, XML_TYPE_DOCUMENT_ROOT__COMMENT);
    // CHANGE gen: Use raw type
    createEReference(xmlTypeDocumentRootEClass, XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION);
    // CHANGE gen: Use raw type
    createEAttribute(xmlTypeDocumentRootEClass, XML_TYPE_DOCUMENT_ROOT__TEXT);

    // Create data types
    // CHANGE gen: Cast
    anySimpleTypeEDataType = (EDataType<Object>) createEDataType(ANY_SIMPLE_TYPE);
    // CHANGE gen: Cast
    anyURIEDataType = (EDataType<String>) createEDataType(ANY_URI);
    // CHANGE gen: Cast
    base64BinaryEDataType = (EDataType<byte[]>) createEDataType(BASE64_BINARY);
    // CHANGE gen: Cast
    booleanEDataType = (EDataType<Boolean>) createEDataType(BOOLEAN);
    // CHANGE gen: Cast
    booleanObjectEDataType = (EDataType<Boolean>) createEDataType(BOOLEAN_OBJECT);
    // CHANGE gen: Cast
    byteEDataType = (EDataType<Byte>) createEDataType(BYTE);
    // CHANGE gen: Cast
    byteObjectEDataType = (EDataType<Byte>) createEDataType(BYTE_OBJECT);
    // CHANGE gen: Cast
    dateEDataType = (EDataType<XMLGregorianCalendar>) createEDataType(DATE);
    // CHANGE gen: Cast
    dateTimeEDataType = (EDataType<XMLGregorianCalendar>) createEDataType(DATE_TIME);
    // CHANGE gen: Cast
    decimalEDataType = (EDataType<BigDecimal>) createEDataType(DECIMAL);
    // CHANGE gen: Cast
    doubleEDataType = (EDataType<Double>) createEDataType(DOUBLE);
    // CHANGE gen: Cast
    doubleObjectEDataType = (EDataType<Double>) createEDataType(DOUBLE_OBJECT);
    // CHANGE gen: Cast
    durationEDataType = (EDataType<Duration>) createEDataType(DURATION);
    // CHANGE gen: Cast
    entitiesEDataType = (EDataType<List<String>>) createEDataType(ENTITIES);
    // CHANGE gen: Cast
    entitiesBaseEDataType = (EDataType<List<String>>) createEDataType(ENTITIES_BASE);
    // CHANGE gen: Cast
    entityEDataType = (EDataType<String>) createEDataType(ENTITY);
    // CHANGE gen: Cast
    floatEDataType = (EDataType<Float>) createEDataType(FLOAT);
    // CHANGE gen: Cast
    floatObjectEDataType = (EDataType<Float>) createEDataType(FLOAT_OBJECT);
    // CHANGE gen: Cast
    gDayEDataType = (EDataType<XMLGregorianCalendar>) createEDataType(GDAY);
    // CHANGE gen: Cast
    gMonthEDataType = (EDataType<XMLGregorianCalendar>) createEDataType(GMONTH);
    // CHANGE gen: Cast
    gMonthDayEDataType = (EDataType<XMLGregorianCalendar>) createEDataType(GMONTH_DAY);
    // CHANGE gen: Cast
    gYearEDataType = (EDataType<XMLGregorianCalendar>) createEDataType(GYEAR);
    // CHANGE gen: Cast
    gYearMonthEDataType = (EDataType<XMLGregorianCalendar>) createEDataType(GYEAR_MONTH);
    // CHANGE gen: Cast
    hexBinaryEDataType = (EDataType<byte[]>) createEDataType(HEX_BINARY);
    // CHANGE gen: Cast
    idEDataType = (EDataType<String>) createEDataType(ID);
    // CHANGE gen: Cast
    idrefEDataType = (EDataType<String>) createEDataType(IDREF);
    // CHANGE gen: Cast
    idrefsEDataType = (EDataType<List<String>>) createEDataType(IDREFS);
    // CHANGE gen: Cast
    idrefsBaseEDataType = (EDataType<List<String>>) createEDataType(IDREFS_BASE);
    // CHANGE gen: Cast
    intEDataType = (EDataType<Integer>) createEDataType(INT);
    // CHANGE gen: Cast
    integerEDataType = (EDataType<BigInteger>) createEDataType(INTEGER);
    // CHANGE gen: Cast
    intObjectEDataType = (EDataType<Integer>) createEDataType(INT_OBJECT);
    // CHANGE gen: Cast
    languageEDataType = (EDataType<String>) createEDataType(LANGUAGE);
    // CHANGE gen: Cast
    longEDataType = (EDataType<Long>) createEDataType(LONG);
    // CHANGE gen: Cast
    longObjectEDataType = (EDataType<Long>) createEDataType(LONG_OBJECT);
    // CHANGE gen: Cast
    nameEDataType = (EDataType<String>) createEDataType(NAME);
    // CHANGE gen: Cast
    ncNameEDataType = (EDataType<String>) createEDataType(NC_NAME);
    // CHANGE gen: Cast
    negativeIntegerEDataType = (EDataType<BigInteger>) createEDataType(NEGATIVE_INTEGER);
    // CHANGE gen: Cast
    nmtokenEDataType = (EDataType<String>) createEDataType(NMTOKEN);
    // CHANGE gen: Cast
    nmtokensEDataType = (EDataType<List<String>>) createEDataType(NMTOKENS);
    // CHANGE gen: Cast
    nmtokensBaseEDataType = (EDataType<List<String>>) createEDataType(NMTOKENS_BASE);
    // CHANGE gen: Cast
    nonNegativeIntegerEDataType = (EDataType<BigInteger>) createEDataType(NON_NEGATIVE_INTEGER);
    // CHANGE gen: Cast
    nonPositiveIntegerEDataType = (EDataType<BigInteger>) createEDataType(NON_POSITIVE_INTEGER);
    // CHANGE gen: Cast
    normalizedStringEDataType = (EDataType<String>) createEDataType(NORMALIZED_STRING);
    // CHANGE gen: Cast
    notationEDataType = (EDataType<QName>) createEDataType(NOTATION);
    // CHANGE gen: Cast
    positiveIntegerEDataType = (EDataType<BigInteger>) createEDataType(POSITIVE_INTEGER);
    // CHANGE gen: Cast
    qNameEDataType = (EDataType<QName>) createEDataType(QNAME);
    // CHANGE gen: Cast
    shortEDataType = (EDataType<Short>) createEDataType(SHORT);
    // CHANGE gen: Cast
    shortObjectEDataType = (EDataType<Short>) createEDataType(SHORT_OBJECT);
    // CHANGE gen: Cast
    stringEDataType = (EDataType<String>) createEDataType(STRING);
    // CHANGE gen: Cast
    timeEDataType = (EDataType<XMLGregorianCalendar>) createEDataType(TIME);
    // CHANGE gen: Cast
    tokenEDataType = (EDataType<String>) createEDataType(TOKEN);
    // CHANGE gen: Cast
    unsignedByteEDataType = (EDataType<Short>) createEDataType(UNSIGNED_BYTE);
    // CHANGE gen: Cast
    unsignedByteObjectEDataType = (EDataType<Short>) createEDataType(UNSIGNED_BYTE_OBJECT);
    // CHANGE gen: Cast
    unsignedIntEDataType = (EDataType<Long>) createEDataType(UNSIGNED_INT);
    // CHANGE gen: Cast
    unsignedIntObjectEDataType = (EDataType<Long>) createEDataType(UNSIGNED_INT_OBJECT);
    // CHANGE gen: Cast
    unsignedLongEDataType = (EDataType<BigInteger>) createEDataType(UNSIGNED_LONG);
    // CHANGE gen: Cast
    unsignedShortEDataType = (EDataType<Integer>) createEDataType(UNSIGNED_SHORT);
    // CHANGE gen: Cast
    unsignedShortObjectEDataType = (EDataType<Integer>) createEDataType(UNSIGNED_SHORT_OBJECT);
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
    simpleAnyTypeEClass.getESuperTypes().add(this.getAnyType());

    // Initialize classes and features; add operations and parameters
    initEClass(anyTypeEClass, AnyType.class, "AnyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnyType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, AnyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAnyType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, AnyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getAnyType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AnyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processingInstructionEClass, ProcessingInstruction.class, "ProcessingInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcessingInstruction_Data(), this.getString(), "data", null, 0, 1, ProcessingInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProcessingInstruction_Target(), this.getString(), "target", null, 1, 1, ProcessingInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleAnyTypeEClass, SimpleAnyType.class, "SimpleAnyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimpleAnyType_RawValue(), this.getString(), "rawValue", null, 0, 1, SimpleAnyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleAnyType_Value(), this.getAnySimpleType(), "value", null, 0, 1, SimpleAnyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleAnyType_InstanceType(), ecorePackage.getEDataType(), null, "instanceType", null, 1, 1, SimpleAnyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xmlTypeDocumentRootEClass, XMLTypeDocumentRoot.class, "XMLTypeDocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXMLTypeDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXMLTypeDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXMLTypeDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXMLTypeDocumentRoot_CDATA(), this.getString(), "cDATA", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getXMLTypeDocumentRoot_Comment(), this.getString(), "comment", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getXMLTypeDocumentRoot_ProcessingInstruction(), this.getProcessingInstruction(), null, "processingInstruction", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getXMLTypeDocumentRoot_Text(), this.getString(), "text", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    // Initialize data types
    initEDataType(anySimpleTypeEDataType, Object.class, "AnySimpleType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(anyURIEDataType, String.class, "AnyURI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(base64BinaryEDataType, byte[].class, "Base64Binary", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(booleanEDataType, boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(booleanObjectEDataType, Boolean.class, "BooleanObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(byteEDataType, byte.class, "Byte", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(byteObjectEDataType, Byte.class, "ByteObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(dateEDataType, XMLGregorianCalendar.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(dateTimeEDataType, XMLGregorianCalendar.class, "DateTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(decimalEDataType, BigDecimal.class, "Decimal", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(doubleEDataType, double.class, "Double", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(doubleObjectEDataType, Double.class, "DoubleObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(durationEDataType, Duration.class, "Duration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(entitiesEDataType, List.class, "ENTITIES", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(entitiesBaseEDataType, List.class, "ENTITIESBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(entityEDataType, String.class, "ENTITY", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(floatEDataType, float.class, "Float", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(floatObjectEDataType, Float.class, "FloatObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(gDayEDataType, XMLGregorianCalendar.class, "GDay", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(gMonthEDataType, XMLGregorianCalendar.class, "GMonth", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(gMonthDayEDataType, XMLGregorianCalendar.class, "GMonthDay", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(gYearEDataType, XMLGregorianCalendar.class, "GYear", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(gYearMonthEDataType, XMLGregorianCalendar.class, "GYearMonth", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(hexBinaryEDataType, byte[].class, "HexBinary", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(idEDataType, String.class, "ID", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(idrefEDataType, String.class, "IDREF", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(idrefsEDataType, List.class, "IDREFS", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(idrefsBaseEDataType, List.class, "IDREFSBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(intEDataType, int.class, "Int", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(integerEDataType, BigInteger.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(intObjectEDataType, Integer.class, "IntObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(languageEDataType, String.class, "Language", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(longEDataType, long.class, "Long", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(longObjectEDataType, Long.class, "LongObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(nameEDataType, String.class, "Name", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(ncNameEDataType, String.class, "NCName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(negativeIntegerEDataType, BigInteger.class, "NegativeInteger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(nmtokenEDataType, String.class, "NMTOKEN", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(nmtokensEDataType, List.class, "NMTOKENS", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(nmtokensBaseEDataType, List.class, "NMTOKENSBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(nonNegativeIntegerEDataType, BigInteger.class, "NonNegativeInteger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(nonPositiveIntegerEDataType, BigInteger.class, "NonPositiveInteger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(normalizedStringEDataType, String.class, "NormalizedString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(notationEDataType, QName.class, "NOTATION", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(positiveIntegerEDataType, BigInteger.class, "PositiveInteger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(qNameEDataType, QName.class, "QName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(shortEDataType, short.class, "Short", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(shortObjectEDataType, Short.class, "ShortObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(timeEDataType, XMLGregorianCalendar.class, "Time", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(tokenEDataType, String.class, "Token", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(unsignedByteEDataType, short.class, "UnsignedByte", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(unsignedByteObjectEDataType, Short.class, "UnsignedByteObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(unsignedIntEDataType, long.class, "UnsignedInt", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(unsignedIntObjectEDataType, Long.class, "UnsignedIntObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(unsignedLongEDataType, BigInteger.class, "UnsignedLong", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(unsignedShortEDataType, int.class, "UnsignedShort", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(unsignedShortObjectEDataType, Integer.class, "UnsignedShortObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
      (anySimpleTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "anySimpleType"
       });	
    addAnnotation
      (anyTypeEClass, 
       source, 
       new String[] 
       {
       "name", "anyType",
       "kind", "mixed"
       });	
    addAnnotation
      (getAnyType_Mixed(), 
       source, 
       new String[] 
       {
       "kind", "elementWildcard",
       "name", ":mixed"
       });	
    addAnnotation
      (getAnyType_Any(), 
       source, 
       new String[] 
       {
       "kind", "elementWildcard",
       "wildcards", "##any",
       "name", ":1",
       "processing", "lax"
       });	
    addAnnotation
      (getAnyType_AnyAttribute(), 
       source, 
       new String[] 
       {
       "kind", "attributeWildcard",
       "wildcards", "##any",
       "name", ":2",
       "processing", "lax"
       });	
    addAnnotation
      (anyURIEDataType, 
       source, 
       new String[] 
       {
       "name", "anyURI",
       "whiteSpace", "collapse"
       });	
    addAnnotation
      (base64BinaryEDataType, 
       source, 
       new String[] 
       {
       "name", "base64Binary",
       "whiteSpace", "collapse"
       });	
    addAnnotation
      (booleanEDataType, 
       source, 
       new String[] 
       {
       "name", "boolean",
       "whiteSpace", "collapse"
       });	
    addAnnotation
      (booleanObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "boolean:Object",
       "baseType", "boolean"
       });	
    addAnnotation
      (byteEDataType, 
       source, 
       new String[] 
       {
       "name", "byte"
       });	
    addAnnotation
      (byteObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "byte:Object",
       "baseType", "byte"
       });	
    addAnnotation
      (dateEDataType, 
       source, 
       new String[] 
       {
       "name", "date",
       "whiteSpace", "collapse"
       });	
    addAnnotation
      (dateTimeEDataType, 
       source, 
       new String[] 
       {
       "name", "dateTime",
       "whiteSpace", "collapse"
       });	
    addAnnotation
      (decimalEDataType, 
       source, 
       new String[] 
       {
       "name", "decimal",
       "whiteSpace", "collapse"
       });	
    addAnnotation
      (doubleEDataType, 
       source, 
       new String[] 
       {
       "name", "double",
       "whiteSpace", "collapse"
       });	
    addAnnotation
      (doubleObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "double:Object",
       "baseType", "double"
       });	
    addAnnotation
      (durationEDataType, 
       source, 
       new String[] 
       {
       "name", "duration",
       "whiteSpace", "collapse"
       });	
    addAnnotation
      (entitiesEDataType, 
       source, 
       new String[] 
       {
       "name", "ENTITIES",
       "baseType", "ENTITIES_._base",
       "minLength", "1"
       });	
    addAnnotation
      (entitiesBaseEDataType, 
       source, 
       new String[] 
       {
       "name", "ENTITIES_._base",
       "itemType", "ENTITY"
       });	
    addAnnotation
      (entityEDataType, 
       source, 
       new String[] 
       {
       "name", "ENTITY",
       "baseType", "NCName"
       });	
    addAnnotation
      (floatEDataType, 
       source, 
       new String[] 
       {
       "name", "float",
       "whiteSpace", "collapse"
       });	
    addAnnotation
      (floatObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "float:Object",
       "baseType", "float"
       });	
    addAnnotation
      (gDayEDataType, 
       source, 
       new String[] 
       {
       "name", "gDay",
       "whiteSpace", "collapse"
       });	
    addAnnotation
      (gMonthEDataType, 
       source, 
       new String[] 
       {
       "name", "gMonth",
       "whiteSpace", "collapse"
       });	
    addAnnotation
      (gMonthDayEDataType, 
       source, 
       new String[] 
       {
       "name", "gMonthDay",
       "whiteSpace", "collapse"
       });	
    addAnnotation
      (gYearEDataType, 
       source, 
       new String[] 
       {
       "name", "gYear",
       "whiteSpace", "collapse"
       });	
    addAnnotation
      (gYearMonthEDataType, 
       source, 
       new String[] 
       {
       "name", "gYearMonth",
       "whiteSpace", "collapse"
       });	
    addAnnotation
      (hexBinaryEDataType, 
       source, 
       new String[] 
       {
       "name", "hexBinary",
       "whiteSpace", "collapse"
       });	
    addAnnotation
      (idEDataType, 
       source, 
       new String[] 
       {
       "name", "ID",
       "baseType", "NCName"
       });	
    addAnnotation
      (idrefEDataType, 
       source, 
       new String[] 
       {
       "name", "IDREF",
       "baseType", "NCName"
       });	
    addAnnotation
      (idrefsEDataType, 
       source, 
       new String[] 
       {
       "name", "IDREFS",
       "baseType", "IDREFS_._base",
       "minLength", "1"
       });	
    addAnnotation
      (idrefsBaseEDataType, 
       source, 
       new String[] 
       {
       "name", "IDREFS_._base",
       "itemType", "IDREF"
       });	
    addAnnotation
      (intEDataType, 
       source, 
       new String[] 
       {
       "name", "int"
       });	
    addAnnotation
      (integerEDataType, 
       source, 
       new String[] 
       {
       "name", "integer"
       });	
    addAnnotation
      (intObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "int:Object",
       "baseType", "int"
       });	
    addAnnotation
      (languageEDataType, 
       source, 
       new String[] 
       {
       "name", "language",
       "baseType", "token",
       "pattern", "[a-zA-Z]{1,8}(-[a-zA-Z0-9]{1,8})*"
       });	
    addAnnotation
      (longEDataType, 
       source, 
       new String[] 
       {
       "name", "long"
       });	
    addAnnotation
      (longObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "long:Object",
       "baseType", "long"
       });	
    addAnnotation
      (nameEDataType, 
       source, 
       new String[] 
       {
       "name", "Name",
       "baseType", "token",
       "pattern", "\\i\\c*"
       });	
    addAnnotation
      (ncNameEDataType, 
       source, 
       new String[] 
       {
       "name", "NCName",
       "baseType", "Name",
       "pattern", "[\\i-[:]][\\c-[:]]*"
       });	
    addAnnotation
      (negativeIntegerEDataType, 
       source, 
       new String[] 
       {
       "name", "negativeInteger",
       "baseType", "nonPositiveInteger",
       "maxInclusive", "-1"
       });	
    addAnnotation
      (nmtokenEDataType, 
       source, 
       new String[] 
       {
       "name", "NMTOKEN",
       "baseType", "token",
       "pattern", "\\c+"
       });	
    addAnnotation
      (nmtokensEDataType, 
       source, 
       new String[] 
       {
       "name", "NMTOKENS",
       "baseType", "NMTOKENS_._base",
       "minLength", "1"
       });	
    addAnnotation
      (nmtokensBaseEDataType, 
       source, 
       new String[] 
       {
       "name", "NMTOKENS_._base",
       "itemType", "NMTOKEN"
       });	
    addAnnotation
      (nonNegativeIntegerEDataType, 
       source, 
       new String[] 
       {
       "name", "nonNegativeInteger",
       "baseType", "integer",
       "minInclusive", "0"
       });	
    addAnnotation
      (nonPositiveIntegerEDataType, 
       source, 
       new String[] 
       {
       "name", "nonPositiveInteger",
       "baseType", "integer",
       "maxInclusive", "0"
       });	
    addAnnotation
      (normalizedStringEDataType, 
       source, 
       new String[] 
       {
       "name", "normalizedString",
       "baseType", "string",
       "whiteSpace", "replace"
       });	
    addAnnotation
      (notationEDataType, 
       source, 
       new String[] 
       {
       "name", "NOTATION",
       "whiteSpace", "collapse"
       });	
    addAnnotation
      (positiveIntegerEDataType, 
       source, 
       new String[] 
       {
       "name", "positiveInteger",
       "baseType", "nonNegativeInteger",
       "minInclusive", "1"
       });	
    addAnnotation
      (processingInstructionEClass, 
       source, 
       new String[] 
       {
       "name", "processingInstruction_._type",
       "kind", "empty"
       });	
    addAnnotation
      (getProcessingInstruction_Data(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "data"
       });	
    addAnnotation
      (getProcessingInstruction_Target(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "target"
       });	
    addAnnotation
      (qNameEDataType, 
       source, 
       new String[] 
       {
       "name", "QName",
       "whiteSpace", "collapse"
       });	
    addAnnotation
      (shortEDataType, 
       source, 
       new String[] 
       {
       "name", "short"
       });	
    addAnnotation
      (shortObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "short:Object",
       "baseType", "short"
       });	
    addAnnotation
      (simpleAnyTypeEClass, 
       source, 
       new String[] 
       {
       "name", "simpleAnyType",
       "kind", "simple"
       });	
    addAnnotation
      (getSimpleAnyType_RawValue(), 
       source, 
       new String[] 
       {
       "name", ":3",
       "kind", "simple"
       });	
    addAnnotation
      (getSimpleAnyType_Value(), 
       source, 
       new String[] 
       {
       "name", ":4",
       "kind", "simple"
       });	
    addAnnotation
      (getSimpleAnyType_InstanceType(), 
       source, 
       new String[] 
       {
       "name", ":5",
       "kind", "simple"
       });	
    addAnnotation
      (stringEDataType, 
       source, 
       new String[] 
       {
       "name", "string",
       "whiteSpace", "preserve"
       });	
    addAnnotation
      (timeEDataType, 
       source, 
       new String[] 
       {
       "name", "time",
       "whiteSpace", "collapse"
       });	
    addAnnotation
      (tokenEDataType, 
       source, 
       new String[] 
       {
       "name", "token",
       "baseType", "normalizedString",
       "whiteSpace", "collapse"
       });	
    addAnnotation
      (unsignedByteEDataType, 
       source, 
       new String[] 
       {
       "name", "unsignedByte",
       "maxInclusive", "255",
       "minInclusive", "0"
       });	
    addAnnotation
      (unsignedByteObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "unsignedByte:Object",
       "baseType", "unsignedByte"
       });	
    addAnnotation
      (unsignedIntEDataType, 
       source, 
       new String[] 
       {
       "name", "unsignedInt",
       "maxInclusive", "4294967295",
       "minInclusive", "0"
       });	
    addAnnotation
      (unsignedIntObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "unsignedInt:Object",
       "baseType", "unsignedInt"
       });	
    addAnnotation
      (unsignedLongEDataType, 
       source, 
       new String[] 
       {
       "name", "unsignedLong",
       "baseType", "nonNegativeInteger",
       "maxInclusive", "18446744073709551615",
       "minInclusive", "0"
       });	
    addAnnotation
      (unsignedShortEDataType, 
       source, 
       new String[] 
       {
       "name", "unsignedShort",
       "maxInclusive", "65535",
       "minInclusive", "0"
       });	
    addAnnotation
      (unsignedShortObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "unsignedShort:Object",
       "baseType", "unsignedShort"
       });	
    addAnnotation
      (xmlTypeDocumentRootEClass, 
       source, 
       new String[] 
       {
       "name", "",
       "kind", "mixed"
       });	
    addAnnotation
      (getXMLTypeDocumentRoot_Mixed(), 
       source, 
       new String[] 
       {
       "kind", "elementWildcard",
       "name", ":mixed"
       });	
    addAnnotation
      (getXMLTypeDocumentRoot_XMLNSPrefixMap(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "xmlns:prefix"
       });	
    addAnnotation
      (getXMLTypeDocumentRoot_XSISchemaLocation(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "xsi:schemaLocation"
       });	
    addAnnotation
      (getXMLTypeDocumentRoot_CDATA(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "cDATA",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getXMLTypeDocumentRoot_Comment(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "comment",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getXMLTypeDocumentRoot_ProcessingInstruction(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "processingInstruction",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getXMLTypeDocumentRoot_Text(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "text",
       "namespace", "##targetNamespace"
       });
  }

  /**
   * Initializes the annotations for <b>null</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  protected void createNullAnnotations()
  {
    // Don't create anything.
  }
} //XMLTypePackageImpl
