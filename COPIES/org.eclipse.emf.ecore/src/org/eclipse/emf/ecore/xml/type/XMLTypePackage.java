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
package org.eclipse.emf.ecore.xml.type;


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
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;


/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecore.xml.type.XMLTypeFactory
 * @model kind="package"
 * @generated
 */
public interface XMLTypePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "type";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/emf/2003/XMLType";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ecore.xml.type";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XMLTypePackage eINSTANCE = org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.emf.ecore.xml.type.impl.AnyTypeImpl <em>Any Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.xml.type.impl.AnyTypeImpl
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getAnyType()
   * @generated
   */
  int ANY_TYPE = 0;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_TYPE__MIXED = 0;

  /**
   * The feature id for the '<em><b>Any</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_TYPE__ANY = 1;

  /**
   * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_TYPE__ANY_ATTRIBUTE = 2;

  /**
   * The number of structural features of the '<em>Any Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.emf.ecore.xml.type.impl.ProcessingInstructionImpl <em>Processing Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.xml.type.impl.ProcessingInstructionImpl
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getProcessingInstruction()
   * @generated
   */
  int PROCESSING_INSTRUCTION = 1;

  /**
   * The feature id for the '<em><b>Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSING_INSTRUCTION__DATA = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSING_INSTRUCTION__TARGET = 1;

  /**
   * The number of structural features of the '<em>Processing Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSING_INSTRUCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.ecore.xml.type.impl.SimpleAnyTypeImpl <em>Simple Any Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.xml.type.impl.SimpleAnyTypeImpl
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getSimpleAnyType()
   * @generated
   */
  int SIMPLE_ANY_TYPE = 2;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ANY_TYPE__MIXED = ANY_TYPE__MIXED;

  /**
   * The feature id for the '<em><b>Any</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ANY_TYPE__ANY = ANY_TYPE__ANY;

  /**
   * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ANY_TYPE__ANY_ATTRIBUTE = ANY_TYPE__ANY_ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Raw Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ANY_TYPE__RAW_VALUE = ANY_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ANY_TYPE__VALUE = ANY_TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Instance Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ANY_TYPE__INSTANCE_TYPE = ANY_TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Simple Any Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ANY_TYPE_FEATURE_COUNT = ANY_TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.emf.ecore.xml.type.impl.XMLTypeDocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypeDocumentRootImpl
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getXMLTypeDocumentRoot()
   * @generated
   */
  int XML_TYPE_DOCUMENT_ROOT = 3;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_TYPE_DOCUMENT_ROOT__MIXED = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_TYPE_DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_TYPE_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

  /**
   * The feature id for the '<em><b>CDATA</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_TYPE_DOCUMENT_ROOT__CDATA = 3;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_TYPE_DOCUMENT_ROOT__COMMENT = 4;

  /**
   * The feature id for the '<em><b>Processing Instruction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION = 5;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_TYPE_DOCUMENT_ROOT__TEXT = 6;

  /**
   * The number of structural features of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_TYPE_DOCUMENT_ROOT_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '<em>Any Simple Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Object
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getAnySimpleType()
   * @generated
   */
  int ANY_SIMPLE_TYPE = 4;

  /**
   * The meta object id for the '<em>Any URI</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getAnyURI()
   * @generated
   */
  int ANY_URI = 5;

  /**
   * The meta object id for the '<em>Base64 Binary</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getBase64Binary()
   * @generated
   */
  int BASE64_BINARY = 6;

  /**
   * The meta object id for the '<em>Boolean</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getBoolean()
   * @generated
   */
  int BOOLEAN = 7;

  /**
   * The meta object id for the '<em>Boolean Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Boolean
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getBooleanObject()
   * @generated
   */
  int BOOLEAN_OBJECT = 8;

  /**
   * The meta object id for the '<em>Decimal</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.math.BigDecimal
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getDecimal()
   * @generated
   */
  int DECIMAL = 13;

  /**
   * The meta object id for the '<em>Integer</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.math.BigInteger
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getInteger()
   * @generated
   */
  int INTEGER = 33;

  /**
   * The meta object id for the '<em>Int Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Integer
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getIntObject()
   * @generated
   */
  int INT_OBJECT = 34;

  /**
   * The meta object id for the '<em>Long</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getLong()
   * @generated
   */
  int LONG = 36;

  /**
   * The meta object id for the '<em>Long Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Long
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getLongObject()
   * @generated
   */
  int LONG_OBJECT = 37;

  /**
   * The meta object id for the '<em>Int</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getInt()
   * @generated
   */
  int INT = 32;

  /**
   * The meta object id for the '<em>Short</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getShort()
   * @generated
   */
  int SHORT = 50;

  /**
   * The meta object id for the '<em>Short Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Short
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getShortObject()
   * @generated
   */
  int SHORT_OBJECT = 51;

  /**
   * The meta object id for the '<em>Byte</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getByte()
   * @generated
   */
  int BYTE = 9;

  /**
   * The meta object id for the '<em>Byte Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Byte
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getByteObject()
   * @generated
   */
  int BYTE_OBJECT = 10;

  /**
   * The meta object id for the '<em>Date</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see javax.xml.datatype.XMLGregorianCalendar
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getDate()
   * @generated
   */
  int DATE = 11;

  /**
   * The meta object id for the '<em>Date Time</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see javax.xml.datatype.XMLGregorianCalendar
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getDateTime()
   * @generated
   */
  int DATE_TIME = 12;

  /**
   * The meta object id for the '<em>String</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getString()
   * @generated
   */
  int STRING = 52;

  /**
   * The meta object id for the '<em>Double</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getDouble()
   * @generated
   */
  int DOUBLE = 14;

  /**
   * The meta object id for the '<em>Double Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Double
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getDoubleObject()
   * @generated
   */
  int DOUBLE_OBJECT = 15;

  /**
   * The meta object id for the '<em>Duration</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see javax.xml.datatype.Duration
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getDuration()
   * @generated
   */
  int DURATION = 16;

  /**
   * The meta object id for the '<em>ENTITIES Base</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.List
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getENTITIESBase()
   * @generated
   */
  int ENTITIES_BASE = 18;

  /**
   * The meta object id for the '<em>Normalized String</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getNormalizedString()
   * @generated
   */
  int NORMALIZED_STRING = 46;

  /**
   * The meta object id for the '<em>Token</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getToken()
   * @generated
   */
  int TOKEN = 54;

  /**
   * The meta object id for the '<em>Name</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getName_()
   * @generated
   */
  int NAME = 38;

  /**
   * The meta object id for the '<em>NC Name</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getNCName()
   * @generated
   */
  int NC_NAME = 39;

  /**
   * The meta object id for the '<em>ENTITY</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getENTITY()
   * @generated
   */
  int ENTITY = 19;

  /**
   * The meta object id for the '<em>ENTITIES</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.List
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getENTITIES()
   * @generated
   */
  int ENTITIES = 17;

  /**
   * The meta object id for the '<em>Float</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getFloat()
   * @generated
   */
  int FLOAT = 20;

  /**
   * The meta object id for the '<em>Float Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Float
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getFloatObject()
   * @generated
   */
  int FLOAT_OBJECT = 21;

  /**
   * The meta object id for the '<em>GDay</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see javax.xml.datatype.XMLGregorianCalendar
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getGDay()
   * @generated
   */
  int GDAY = 22;

  /**
   * The meta object id for the '<em>GMonth</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see javax.xml.datatype.XMLGregorianCalendar
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getGMonth()
   * @generated
   */
  int GMONTH = 23;

  /**
   * The meta object id for the '<em>GMonth Day</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see javax.xml.datatype.XMLGregorianCalendar
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getGMonthDay()
   * @generated
   */
  int GMONTH_DAY = 24;

  /**
   * The meta object id for the '<em>GYear</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see javax.xml.datatype.XMLGregorianCalendar
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getGYear()
   * @generated
   */
  int GYEAR = 25;

  /**
   * The meta object id for the '<em>GYear Month</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see javax.xml.datatype.XMLGregorianCalendar
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getGYearMonth()
   * @generated
   */
  int GYEAR_MONTH = 26;

  /**
   * The meta object id for the '<em>Hex Binary</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getHexBinary()
   * @generated
   */
  int HEX_BINARY = 27;

  /**
   * The meta object id for the '<em>ID</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getID()
   * @generated
   */
  int ID = 28;

  /**
   * The meta object id for the '<em>IDREF</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getIDREF()
   * @generated
   */
  int IDREF = 29;

  /**
   * The meta object id for the '<em>IDREFS Base</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.List
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getIDREFSBase()
   * @generated
   */
  int IDREFS_BASE = 31;

  /**
   * The meta object id for the '<em>IDREFS</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.List
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getIDREFS()
   * @generated
   */
  int IDREFS = 30;

  /**
   * The meta object id for the '<em>Language</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getLanguage()
   * @generated
   */
  int LANGUAGE = 35;

  /**
   * The meta object id for the '<em>Non Positive Integer</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.math.BigInteger
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getNonPositiveInteger()
   * @generated
   */
  int NON_POSITIVE_INTEGER = 45;

  /**
   * The meta object id for the '<em>Negative Integer</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.math.BigInteger
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getNegativeInteger()
   * @generated
   */
  int NEGATIVE_INTEGER = 40;

  /**
   * The meta object id for the '<em>NMTOKEN</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getNMTOKEN()
   * @generated
   */
  int NMTOKEN = 41;

  /**
   * The meta object id for the '<em>NMTOKENS Base</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.List
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getNMTOKENSBase()
   * @generated
   */
  int NMTOKENS_BASE = 43;

  /**
   * The meta object id for the '<em>NMTOKENS</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.List
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getNMTOKENS()
   * @generated
   */
  int NMTOKENS = 42;

  /**
   * The meta object id for the '<em>Non Negative Integer</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.math.BigInteger
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getNonNegativeInteger()
   * @generated
   */
  int NON_NEGATIVE_INTEGER = 44;

  /**
   * The meta object id for the '<em>NOTATION</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see javax.xml.namespace.QName
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getNOTATION()
   * @generated
   */
  int NOTATION = 47;

  /**
   * The meta object id for the '<em>Positive Integer</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.math.BigInteger
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getPositiveInteger()
   * @generated
   */
  int POSITIVE_INTEGER = 48;

  /**
   * The meta object id for the '<em>QName</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see javax.xml.namespace.QName
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getQName()
   * @generated
   */
  int QNAME = 49;

  /**
   * The meta object id for the '<em>Time</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see javax.xml.datatype.XMLGregorianCalendar
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getTime()
   * @generated
   */
  int TIME = 53;

  /**
   * The meta object id for the '<em>Unsigned Long</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.math.BigInteger
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getUnsignedLong()
   * @generated
   */
  int UNSIGNED_LONG = 59;

  /**
   * The meta object id for the '<em>Unsigned Int</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getUnsignedInt()
   * @generated
   */
  int UNSIGNED_INT = 57;

  /**
   * The meta object id for the '<em>Unsigned Int Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Long
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getUnsignedIntObject()
   * @generated
   */
  int UNSIGNED_INT_OBJECT = 58;

  /**
   * The meta object id for the '<em>Unsigned Short</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getUnsignedShort()
   * @generated
   */
  int UNSIGNED_SHORT = 60;

  /**
   * The meta object id for the '<em>Unsigned Short Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Integer
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getUnsignedShortObject()
   * @generated
   */
  int UNSIGNED_SHORT_OBJECT = 61;


  /**
   * The meta object id for the '<em>Unsigned Byte</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getUnsignedByte()
   * @generated
   */
  int UNSIGNED_BYTE = 55;


  /**
   * The meta object id for the '<em>Unsigned Byte Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Short
   * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getUnsignedByteObject()
   * @generated
   */
  int UNSIGNED_BYTE_OBJECT = 56;

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.ecore.xml.type.AnyType <em>Any Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Any Type</em>'.
   * @see org.eclipse.emf.ecore.xml.type.AnyType
   * @generated
   */
  EClass<AnyType> getAnyType();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.emf.ecore.xml.type.AnyType#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see org.eclipse.emf.ecore.xml.type.AnyType#getMixed()
   * @see #getAnyType()
   * @generated
   */
  EAttribute<AnyType, FeatureMap> getAnyType_Mixed();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.emf.ecore.xml.type.AnyType#getAny <em>Any</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Any</em>'.
   * @see org.eclipse.emf.ecore.xml.type.AnyType#getAny()
   * @see #getAnyType()
   * @generated
   */
  EAttribute<AnyType, FeatureMap> getAnyType_Any();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.emf.ecore.xml.type.AnyType#getAnyAttribute <em>Any Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Any Attribute</em>'.
   * @see org.eclipse.emf.ecore.xml.type.AnyType#getAnyAttribute()
   * @see #getAnyType()
   * @generated
   */
  EAttribute<AnyType, FeatureMap> getAnyType_AnyAttribute();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.ecore.xml.type.ProcessingInstruction <em>Processing Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Processing Instruction</em>'.
   * @see org.eclipse.emf.ecore.xml.type.ProcessingInstruction
   * @generated
   */
  EClass<ProcessingInstruction> getProcessingInstruction();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.xml.type.ProcessingInstruction#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Data</em>'.
   * @see org.eclipse.emf.ecore.xml.type.ProcessingInstruction#getData()
   * @see #getProcessingInstruction()
   * @generated
   */
  EAttribute<ProcessingInstruction, String> getProcessingInstruction_Data();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.xml.type.ProcessingInstruction#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see org.eclipse.emf.ecore.xml.type.ProcessingInstruction#getTarget()
   * @see #getProcessingInstruction()
   * @generated
   */
  EAttribute<ProcessingInstruction, String> getProcessingInstruction_Target();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.ecore.xml.type.SimpleAnyType <em>Simple Any Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Any Type</em>'.
   * @see org.eclipse.emf.ecore.xml.type.SimpleAnyType
   * @generated
   */
  EClass<SimpleAnyType> getSimpleAnyType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.xml.type.SimpleAnyType#getRawValue <em>Raw Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Raw Value</em>'.
   * @see org.eclipse.emf.ecore.xml.type.SimpleAnyType#getRawValue()
   * @see #getSimpleAnyType()
   * @generated
   */
  EAttribute<SimpleAnyType, String> getSimpleAnyType_RawValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.xml.type.SimpleAnyType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.emf.ecore.xml.type.SimpleAnyType#getValue()
   * @see #getSimpleAnyType()
   * @generated
   */
  EAttribute<SimpleAnyType, Object> getSimpleAnyType_Value();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.ecore.xml.type.SimpleAnyType#getInstanceType <em>Instance Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Instance Type</em>'.
   * @see org.eclipse.emf.ecore.xml.type.SimpleAnyType#getInstanceType()
   * @see #getSimpleAnyType()
   * @generated
   */
  EReference<SimpleAnyType, EDataType> getSimpleAnyType_InstanceType();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot
   * @generated
   */
  EClass<XMLTypeDocumentRoot> getXMLTypeDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot#getMixed()
   * @see #getXMLTypeDocumentRoot()
   * @generated
   */
  EAttribute<XMLTypeDocumentRoot, FeatureMap> getXMLTypeDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot#getXMLNSPrefixMap()
   * @see #getXMLTypeDocumentRoot()
   * @generated
   */
  EReference<XMLTypeDocumentRoot, EMap<String, String>> getXMLTypeDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot#getXSISchemaLocation()
   * @see #getXMLTypeDocumentRoot()
   * @generated
   */
  EReference<XMLTypeDocumentRoot, EMap<String, String>> getXMLTypeDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot <em>CDATA</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>CDATA</em>'.
   * @see org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot
   * @see #getXMLTypeDocumentRoot()
   * @generated
   */
  EAttribute<XMLTypeDocumentRoot, EList<String>> getXMLTypeDocumentRoot_CDATA();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot
   * @see #getXMLTypeDocumentRoot()
   * @generated
   */
  EAttribute<XMLTypeDocumentRoot, EList<String>> getXMLTypeDocumentRoot_Comment();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot
   * @see #getXMLTypeDocumentRoot()
   * @generated
   */
  EAttribute<XMLTypeDocumentRoot, EList<String>> getXMLTypeDocumentRoot_Text();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot <em>Processing Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Processing Instruction</em>'.
   * @see org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot
   * @see #getXMLTypeDocumentRoot()
   * @generated
   */
  EReference<XMLTypeDocumentRoot, EList<ProcessingInstruction>> getXMLTypeDocumentRoot_ProcessingInstruction();

  /**
   * Returns the meta object for data type '{@link java.lang.Object <em>Any Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Any Simple Type</em>'.
   * @see java.lang.Object
   * @model instanceClass="java.lang.Object"
   *        extendedMetaData="name='anySimpleType'"
   * @generated
   */
  EDataType<Object> getAnySimpleType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Any URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Any URI</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='anyURI' whiteSpace='collapse'"
   * @generated
   */
  EDataType<String> getAnyURI();

  /**
   * Returns the meta object for data type '<em>Base64 Binary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Base64 Binary</em>'.
   * @model instanceClass="byte[]"
   *        extendedMetaData="name='base64Binary' whiteSpace='collapse'"
   * @generated
   */
  EDataType<byte[]> getBase64Binary();

  /**
   * Returns the meta object for data type '<em>Boolean</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Boolean</em>'.
   * @model instanceClass="boolean"
   *        extendedMetaData="name='boolean' whiteSpace='collapse'"
   * @generated
   */
  EDataType<Boolean> getBoolean();

  /**
   * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Boolean Object</em>'.
   * @see java.lang.Boolean
   * @model instanceClass="java.lang.Boolean"
   *        extendedMetaData="name='boolean:Object' baseType='boolean'"
   * @generated
   */
  EDataType<Boolean> getBooleanObject();

  /**
   * Returns the meta object for data type '{@link java.math.BigDecimal <em>Decimal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Decimal</em>'.
   * @see java.math.BigDecimal
   * @model instanceClass="java.math.BigDecimal"
   *        extendedMetaData="name='decimal' whiteSpace='collapse'"
   * @generated
   */
  EDataType<BigDecimal> getDecimal();

  /**
   * Returns the meta object for data type '{@link java.math.BigInteger <em>Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Integer</em>'.
   * @see java.math.BigInteger
   * @model instanceClass="java.math.BigInteger"
   *        extendedMetaData="name='integer'"
   * @generated
   */
  EDataType<BigInteger> getInteger();

  /**
   * Returns the meta object for data type '{@link java.lang.Integer <em>Int Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Int Object</em>'.
   * @see java.lang.Integer
   * @model instanceClass="java.lang.Integer"
   *        extendedMetaData="name='int:Object' baseType='int'"
   * @generated
   */
  EDataType<Integer> getIntObject();

  /**
   * Returns the meta object for data type '<em>Long</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Long</em>'.
   * @model instanceClass="long"
   *        extendedMetaData="name='long'"
   * @generated
   */
  EDataType<Long> getLong();

  /**
   * Returns the meta object for data type '{@link java.lang.Long <em>Long Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Long Object</em>'.
   * @see java.lang.Long
   * @model instanceClass="java.lang.Long"
   *        extendedMetaData="name='long:Object' baseType='long'"
   * @generated
   */
  EDataType<Long> getLongObject();

  /**
   * Returns the meta object for data type '<em>Int</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Int</em>'.
   * @model instanceClass="int"
   *        extendedMetaData="name='int'"
   * @generated
   */
  EDataType<Integer> getInt();

  /**
   * Returns the meta object for data type '<em>Short</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Short</em>'.
   * @model instanceClass="short"
   *        extendedMetaData="name='short'"
   * @generated
   */
  EDataType<Short> getShort();

  /**
   * Returns the meta object for data type '{@link java.lang.Short <em>Short Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Short Object</em>'.
   * @see java.lang.Short
   * @model instanceClass="java.lang.Short"
   *        extendedMetaData="name='short:Object' baseType='short'"
   * @generated
   */
  EDataType<Short> getShortObject();

  /**
   * Returns the meta object for data type '<em>Byte</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Byte</em>'.
   * @model instanceClass="byte"
   *        extendedMetaData="name='byte'"
   * @generated
   */
  EDataType<Byte> getByte();

  /**
   * Returns the meta object for data type '{@link java.lang.Byte <em>Byte Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Byte Object</em>'.
   * @see java.lang.Byte
   * @model instanceClass="java.lang.Byte"
   *        extendedMetaData="name='byte:Object' baseType='byte'"
   * @generated
   */
  EDataType<Byte> getByteObject();

  /**
   * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Date</em>'.
   * @see javax.xml.datatype.XMLGregorianCalendar
   * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
   *        extendedMetaData="name='date' whiteSpace='collapse'"
   * @generated
   */
  EDataType<XMLGregorianCalendar> getDate();

  /**
   * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Date Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Date Time</em>'.
   * @see javax.xml.datatype.XMLGregorianCalendar
   * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
   *        extendedMetaData="name='dateTime' whiteSpace='collapse'"
   * @generated
   */
  EDataType<XMLGregorianCalendar> getDateTime();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>String</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='string' whiteSpace='preserve'"
   * @generated
   */
  EDataType<String> getString();

  /**
   * Returns the meta object for data type '<em>Double</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Double</em>'.
   * @model instanceClass="double"
   *        extendedMetaData="name='double' whiteSpace='collapse'"
   * @generated
   */
  EDataType<Double> getDouble();

  /**
   * Returns the meta object for data type '{@link java.lang.Double <em>Double Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Double Object</em>'.
   * @see java.lang.Double
   * @model instanceClass="java.lang.Double"
   *        extendedMetaData="name='double:Object' baseType='double'"
   * @generated
   */
  EDataType<Double> getDoubleObject();

  /**
   * Returns the meta object for data type '{@link javax.xml.datatype.Duration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Duration</em>'.
   * @see javax.xml.datatype.Duration
   * @model instanceClass="javax.xml.datatype.Duration"
   *        extendedMetaData="name='duration' whiteSpace='collapse'"
   * @generated
   */
  EDataType<Duration> getDuration();

  /**
   * Returns the meta object for data type '{@link java.util.List <em>ENTITIES Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>ENTITIES Base</em>'.
   * @see java.util.List
   * @model instanceClass="java.util.List"
   *        extendedMetaData="name='ENTITIES_._base' itemType='ENTITY'"
   * @generated
   */
  EDataType<List<String>> getENTITIESBase();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Normalized String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Normalized String</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='normalizedString' baseType='string' whiteSpace='replace'"
   * @generated
   */
  EDataType<String> getNormalizedString();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Token</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Token</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='token' baseType='normalizedString' whiteSpace='collapse'"
   * @generated
   */
  EDataType<String> getToken();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Name</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='Name' baseType='token' pattern='\\i\\c*'"
   * @generated
   */
  EDataType<String> getName_();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>NC Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>NC Name</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='NCName' baseType='Name' pattern='[\\i-[:]][\\c-[:]]*'"
   * @generated
   */
  EDataType<String> getNCName();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>ENTITY</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>ENTITY</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='ENTITY' baseType='NCName'"
   * @generated
   */
  EDataType<String> getENTITY();

  /**
   * Returns the meta object for data type '{@link java.util.List <em>ENTITIES</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>ENTITIES</em>'.
   * @see java.util.List
   * @model instanceClass="java.util.List"
   *        extendedMetaData="name='ENTITIES' baseType='ENTITIES_._base' minLength='1'"
   * @generated
   */
  EDataType<List<String>> getENTITIES();

  /**
   * Returns the meta object for data type '<em>Float</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Float</em>'.
   * @model instanceClass="float"
   *        extendedMetaData="name='float' whiteSpace='collapse'"
   * @generated
   */
  EDataType<Float> getFloat();

  /**
   * Returns the meta object for data type '{@link java.lang.Float <em>Float Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Float Object</em>'.
   * @see java.lang.Float
   * @model instanceClass="java.lang.Float"
   *        extendedMetaData="name='float:Object' baseType='float'"
   * @generated
   */
  EDataType<Float> getFloatObject();

  /**
   * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>GDay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>GDay</em>'.
   * @see javax.xml.datatype.XMLGregorianCalendar
   * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
   *        extendedMetaData="name='gDay' whiteSpace='collapse'"
   * @generated
   */
  EDataType<XMLGregorianCalendar> getGDay();

  /**
   * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>GMonth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>GMonth</em>'.
   * @see javax.xml.datatype.XMLGregorianCalendar
   * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
   *        extendedMetaData="name='gMonth' whiteSpace='collapse'"
   * @generated
   */
  EDataType<XMLGregorianCalendar> getGMonth();

  /**
   * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>GMonth Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>GMonth Day</em>'.
   * @see javax.xml.datatype.XMLGregorianCalendar
   * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
   *        extendedMetaData="name='gMonthDay' whiteSpace='collapse'"
   * @generated
   */
  EDataType<XMLGregorianCalendar> getGMonthDay();

  /**
   * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>GYear</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>GYear</em>'.
   * @see javax.xml.datatype.XMLGregorianCalendar
   * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
   *        extendedMetaData="name='gYear' whiteSpace='collapse'"
   * @generated
   */
  EDataType<XMLGregorianCalendar> getGYear();

  /**
   * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>GYear Month</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>GYear Month</em>'.
   * @see javax.xml.datatype.XMLGregorianCalendar
   * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
   *        extendedMetaData="name='gYearMonth' whiteSpace='collapse'"
   * @generated
   */
  EDataType<XMLGregorianCalendar> getGYearMonth();

  /**
   * Returns the meta object for data type '<em>Hex Binary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Hex Binary</em>'.
   * @model instanceClass="byte[]"
   *        extendedMetaData="name='hexBinary' whiteSpace='collapse'"
   * @generated
   */
  EDataType<byte[]> getHexBinary();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>ID</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='ID' baseType='NCName'"
   * @generated
   */
  EDataType<String> getID();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>IDREF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>IDREF</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='IDREF' baseType='NCName'"
   * @generated
   */
  EDataType<String> getIDREF();

  /**
   * Returns the meta object for data type '{@link java.util.List <em>IDREFS Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>IDREFS Base</em>'.
   * @see java.util.List
   * @model instanceClass="java.util.List"
   *        extendedMetaData="name='IDREFS_._base' itemType='IDREF'"
   * @generated
   */
  EDataType<List<String>> getIDREFSBase();

  /**
   * Returns the meta object for data type '{@link java.util.List <em>IDREFS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>IDREFS</em>'.
   * @see java.util.List
   * @model instanceClass="java.util.List"
   *        extendedMetaData="name='IDREFS' baseType='IDREFS_._base' minLength='1'"
   * @generated
   */
  EDataType<List<String>> getIDREFS();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Language</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='language' baseType='token' pattern='[a-zA-Z]{1,8}(-[a-zA-Z0-9]{1,8})*'"
   * @generated
   */
  EDataType<String> getLanguage();

  /**
   * Returns the meta object for data type '{@link java.math.BigInteger <em>Non Positive Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Non Positive Integer</em>'.
   * @see java.math.BigInteger
   * @model instanceClass="java.math.BigInteger"
   *        extendedMetaData="name='nonPositiveInteger' baseType='integer' maxInclusive='0'"
   * @generated
   */
  EDataType<BigInteger> getNonPositiveInteger();

  /**
   * Returns the meta object for data type '{@link java.math.BigInteger <em>Negative Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Negative Integer</em>'.
   * @see java.math.BigInteger
   * @model instanceClass="java.math.BigInteger"
   *        extendedMetaData="name='negativeInteger' baseType='nonPositiveInteger' maxInclusive='-1'"
   * @generated
   */
  EDataType<BigInteger> getNegativeInteger();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>NMTOKEN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>NMTOKEN</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='NMTOKEN' baseType='token' pattern='\\c+'"
   * @generated
   */
  EDataType<String> getNMTOKEN();

  /**
   * Returns the meta object for data type '{@link java.util.List <em>NMTOKENS Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>NMTOKENS Base</em>'.
   * @see java.util.List
   * @model instanceClass="java.util.List"
   *        extendedMetaData="name='NMTOKENS_._base' itemType='NMTOKEN'"
   * @generated
   */
  EDataType<List<String>> getNMTOKENSBase();

  /**
   * Returns the meta object for data type '{@link java.util.List <em>NMTOKENS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>NMTOKENS</em>'.
   * @see java.util.List
   * @model instanceClass="java.util.List"
   *        extendedMetaData="name='NMTOKENS' baseType='NMTOKENS_._base' minLength='1'"
   * @generated
   */
  EDataType<List<String>> getNMTOKENS();

  /**
   * Returns the meta object for data type '{@link java.math.BigInteger <em>Non Negative Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Non Negative Integer</em>'.
   * @see java.math.BigInteger
   * @model instanceClass="java.math.BigInteger"
   *        extendedMetaData="name='nonNegativeInteger' baseType='integer' minInclusive='0'"
   * @generated
   */
  EDataType<BigInteger> getNonNegativeInteger();

  /**
   * Returns the meta object for data type '{@link javax.xml.namespace.QName <em>NOTATION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>NOTATION</em>'.
   * @see javax.xml.namespace.QName
   * @model instanceClass="javax.xml.namespace.QName"
   *        extendedMetaData="name='NOTATION' whiteSpace='collapse'"
   * @generated
   */
  EDataType<QName> getNOTATION();

  /**
   * Returns the meta object for data type '{@link java.math.BigInteger <em>Positive Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Positive Integer</em>'.
   * @see java.math.BigInteger
   * @model instanceClass="java.math.BigInteger"
   *        extendedMetaData="name='positiveInteger' baseType='nonNegativeInteger' minInclusive='1'"
   * @generated
   */
  EDataType<BigInteger> getPositiveInteger();

  /**
   * Returns the meta object for data type '{@link javax.xml.namespace.QName <em>QName</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>QName</em>'.
   * @see javax.xml.namespace.QName
   * @model instanceClass="javax.xml.namespace.QName"
   *        extendedMetaData="name='QName' whiteSpace='collapse'"
   * @generated
   */
  EDataType<QName> getQName();

  /**
   * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Time</em>'.
   * @see javax.xml.datatype.XMLGregorianCalendar
   * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
   *        extendedMetaData="name='time' whiteSpace='collapse'"
   * @generated
   */
  EDataType<XMLGregorianCalendar> getTime();

  /**
   * Returns the meta object for data type '{@link java.math.BigInteger <em>Unsigned Long</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Unsigned Long</em>'.
   * @see java.math.BigInteger
   * @model instanceClass="java.math.BigInteger"
   *        extendedMetaData="name='unsignedLong' baseType='nonNegativeInteger' maxInclusive='18446744073709551615' minInclusive='0'"
   * @generated
   */
  EDataType<BigInteger> getUnsignedLong();

  /**
   * Returns the meta object for data type '<em>Unsigned Int</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Unsigned Int</em>'.
   * @model instanceClass="long"
   *        extendedMetaData="name='unsignedInt' maxInclusive='4294967295' minInclusive='0'"
   * @generated
   */
  EDataType<Long> getUnsignedInt();

  /**
   * Returns the meta object for data type '{@link java.lang.Long <em>Unsigned Int Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Unsigned Int Object</em>'.
   * @see java.lang.Long
   * @model instanceClass="java.lang.Long"
   *        extendedMetaData="name='unsignedInt:Object' baseType='unsignedInt'"
   * @generated
   */
  EDataType<Long> getUnsignedIntObject();

  /**
   * Returns the meta object for data type '<em>Unsigned Short</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Unsigned Short</em>'.
   * @model instanceClass="int"
   *        extendedMetaData="name='unsignedShort' maxInclusive='65535' minInclusive='0'"
   * @generated
   */
  EDataType<Integer> getUnsignedShort();

  /**
   * Returns the meta object for data type '{@link java.lang.Integer <em>Unsigned Short Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Unsigned Short Object</em>'.
   * @see java.lang.Integer
   * @model instanceClass="java.lang.Integer"
   *        extendedMetaData="name='unsignedShort:Object' baseType='unsignedShort'"
   * @generated
   */
  EDataType<Integer> getUnsignedShortObject();

  /**
   * Returns the meta object for data type '<em>Unsigned Byte</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Unsigned Byte</em>'.
   * @model instanceClass="short"
   *        extendedMetaData="name='unsignedByte' maxInclusive='255' minInclusive='0'"
   * @generated
   */
  EDataType<Short> getUnsignedByte();

  /**
   * Returns the meta object for data type '{@link java.lang.Short <em>Unsigned Byte Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Unsigned Byte Object</em>'.
   * @see java.lang.Short
   * @model instanceClass="java.lang.Short"
   *        extendedMetaData="name='unsignedByte:Object' baseType='unsignedByte'"
   * @generated
   */
  EDataType<Short> getUnsignedByteObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  XMLTypeFactory getXMLTypeFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals 
  {
    /**
     * The meta object literal for the '{@link org.eclipse.emf.ecore.xml.type.impl.AnyTypeImpl <em>Any Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.xml.type.impl.AnyTypeImpl
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getAnyType()
     * @generated
     */
    EClass<AnyType> ANY_TYPE = eINSTANCE.getAnyType();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute<AnyType, FeatureMap> ANY_TYPE__MIXED = eINSTANCE.getAnyType_Mixed();

    /**
     * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute<AnyType, FeatureMap> ANY_TYPE__ANY = eINSTANCE.getAnyType_Any();

    /**
     * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute<AnyType, FeatureMap> ANY_TYPE__ANY_ATTRIBUTE = eINSTANCE.getAnyType_AnyAttribute();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.ecore.xml.type.impl.ProcessingInstructionImpl <em>Processing Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.xml.type.impl.ProcessingInstructionImpl
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getProcessingInstruction()
     * @generated
     */
    EClass<ProcessingInstruction> PROCESSING_INSTRUCTION = eINSTANCE.getProcessingInstruction();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute<ProcessingInstruction, String> PROCESSING_INSTRUCTION__DATA = eINSTANCE.getProcessingInstruction_Data();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute<ProcessingInstruction, String> PROCESSING_INSTRUCTION__TARGET = eINSTANCE.getProcessingInstruction_Target();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.ecore.xml.type.impl.SimpleAnyTypeImpl <em>Simple Any Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.xml.type.impl.SimpleAnyTypeImpl
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getSimpleAnyType()
     * @generated
     */
    EClass<SimpleAnyType> SIMPLE_ANY_TYPE = eINSTANCE.getSimpleAnyType();

    /**
     * The meta object literal for the '<em><b>Raw Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute<SimpleAnyType, String> SIMPLE_ANY_TYPE__RAW_VALUE = eINSTANCE.getSimpleAnyType_RawValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute<SimpleAnyType, Object> SIMPLE_ANY_TYPE__VALUE = eINSTANCE.getSimpleAnyType_Value();

    /**
     * The meta object literal for the '<em><b>Instance Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<SimpleAnyType, EDataType> SIMPLE_ANY_TYPE__INSTANCE_TYPE = eINSTANCE.getSimpleAnyType_InstanceType();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.ecore.xml.type.impl.XMLTypeDocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypeDocumentRootImpl
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getXMLTypeDocumentRoot()
     * @generated
     */
    EClass<XMLTypeDocumentRoot> XML_TYPE_DOCUMENT_ROOT = eINSTANCE.getXMLTypeDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute<XMLTypeDocumentRoot, FeatureMap> XML_TYPE_DOCUMENT_ROOT__MIXED = eINSTANCE.getXMLTypeDocumentRoot_Mixed();

    /**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<XMLTypeDocumentRoot, EMap<String, String>> XML_TYPE_DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getXMLTypeDocumentRoot_XMLNSPrefixMap();

    /**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<XMLTypeDocumentRoot, EMap<String, String>> XML_TYPE_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getXMLTypeDocumentRoot_XSISchemaLocation();

    /**
     * The meta object literal for the '<em><b>CDATA</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute<XMLTypeDocumentRoot, EList<String>> XML_TYPE_DOCUMENT_ROOT__CDATA = eINSTANCE.getXMLTypeDocumentRoot_CDATA();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute<XMLTypeDocumentRoot, EList<String>> XML_TYPE_DOCUMENT_ROOT__COMMENT = eINSTANCE.getXMLTypeDocumentRoot_Comment();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute<XMLTypeDocumentRoot, EList<String>> XML_TYPE_DOCUMENT_ROOT__TEXT = eINSTANCE.getXMLTypeDocumentRoot_Text();

    /**
     * The meta object literal for the '<em><b>Processing Instruction</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<XMLTypeDocumentRoot, EList<ProcessingInstruction>> XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION = eINSTANCE.getXMLTypeDocumentRoot_ProcessingInstruction();

    /**
     * The meta object literal for the '<em>Any Simple Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getAnySimpleType()
     * @generated
     */
    EDataType<Object> ANY_SIMPLE_TYPE = eINSTANCE.getAnySimpleType();

    /**
     * The meta object literal for the '<em>Any URI</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getAnyURI()
     * @generated
     */
    EDataType<String> ANY_URI = eINSTANCE.getAnyURI();

    /**
     * The meta object literal for the '<em>Base64 Binary</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getBase64Binary()
     * @generated
     */
    EDataType<byte[]> BASE64_BINARY = eINSTANCE.getBase64Binary();

    /**
     * The meta object literal for the '<em>Boolean</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getBoolean()
     * @generated
     */
    EDataType<Boolean> BOOLEAN = eINSTANCE.getBoolean();

    /**
     * The meta object literal for the '<em>Boolean Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Boolean
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getBooleanObject()
     * @generated
     */
    EDataType<Boolean> BOOLEAN_OBJECT = eINSTANCE.getBooleanObject();

    /**
     * The meta object literal for the '<em>Byte</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getByte()
     * @generated
     */
    EDataType<Byte> BYTE = eINSTANCE.getByte();

    /**
     * The meta object literal for the '<em>Byte Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Byte
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getByteObject()
     * @generated
     */
    EDataType<Byte> BYTE_OBJECT = eINSTANCE.getByteObject();

    /**
     * The meta object literal for the '<em>Date</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see javax.xml.datatype.XMLGregorianCalendar
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getDate()
     * @generated
     */
    EDataType<XMLGregorianCalendar> DATE = eINSTANCE.getDate();

    /**
     * The meta object literal for the '<em>Date Time</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see javax.xml.datatype.XMLGregorianCalendar
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getDateTime()
     * @generated
     */
    EDataType<XMLGregorianCalendar> DATE_TIME = eINSTANCE.getDateTime();

    /**
     * The meta object literal for the '<em>Decimal</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.math.BigDecimal
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getDecimal()
     * @generated
     */
    EDataType<BigDecimal> DECIMAL = eINSTANCE.getDecimal();

    /**
     * The meta object literal for the '<em>Double</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getDouble()
     * @generated
     */
    EDataType<Double> DOUBLE = eINSTANCE.getDouble();

    /**
     * The meta object literal for the '<em>Double Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Double
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getDoubleObject()
     * @generated
     */
    EDataType<Double> DOUBLE_OBJECT = eINSTANCE.getDoubleObject();

    /**
     * The meta object literal for the '<em>Duration</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see javax.xml.datatype.Duration
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getDuration()
     * @generated
     */
    EDataType<Duration> DURATION = eINSTANCE.getDuration();

    /**
     * The meta object literal for the '<em>ENTITIES</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getENTITIES()
     * @generated
     */
    EDataType<List<String>> ENTITIES = eINSTANCE.getENTITIES();

    /**
     * The meta object literal for the '<em>ENTITIES Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getENTITIESBase()
     * @generated
     */
    EDataType<List<String>> ENTITIES_BASE = eINSTANCE.getENTITIESBase();

    /**
     * The meta object literal for the '<em>ENTITY</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getENTITY()
     * @generated
     */
    EDataType<String> ENTITY = eINSTANCE.getENTITY();

    /**
     * The meta object literal for the '<em>Float</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getFloat()
     * @generated
     */
    EDataType<Float> FLOAT = eINSTANCE.getFloat();

    /**
     * The meta object literal for the '<em>Float Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Float
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getFloatObject()
     * @generated
     */
    EDataType<Float> FLOAT_OBJECT = eINSTANCE.getFloatObject();

    /**
     * The meta object literal for the '<em>GDay</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see javax.xml.datatype.XMLGregorianCalendar
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getGDay()
     * @generated
     */
    EDataType<XMLGregorianCalendar> GDAY = eINSTANCE.getGDay();

    /**
     * The meta object literal for the '<em>GMonth</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see javax.xml.datatype.XMLGregorianCalendar
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getGMonth()
     * @generated
     */
    EDataType<XMLGregorianCalendar> GMONTH = eINSTANCE.getGMonth();

    /**
     * The meta object literal for the '<em>GMonth Day</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see javax.xml.datatype.XMLGregorianCalendar
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getGMonthDay()
     * @generated
     */
    EDataType<XMLGregorianCalendar> GMONTH_DAY = eINSTANCE.getGMonthDay();

    /**
     * The meta object literal for the '<em>GYear</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see javax.xml.datatype.XMLGregorianCalendar
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getGYear()
     * @generated
     */
    EDataType<XMLGregorianCalendar> GYEAR = eINSTANCE.getGYear();

    /**
     * The meta object literal for the '<em>GYear Month</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see javax.xml.datatype.XMLGregorianCalendar
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getGYearMonth()
     * @generated
     */
    EDataType<XMLGregorianCalendar> GYEAR_MONTH = eINSTANCE.getGYearMonth();

    /**
     * The meta object literal for the '<em>Hex Binary</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getHexBinary()
     * @generated
     */
    EDataType<byte[]> HEX_BINARY = eINSTANCE.getHexBinary();

    /**
     * The meta object literal for the '<em>ID</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getID()
     * @generated
     */
    EDataType<String> ID = eINSTANCE.getID();

    /**
     * The meta object literal for the '<em>IDREF</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getIDREF()
     * @generated
     */
    EDataType<String> IDREF = eINSTANCE.getIDREF();

    /**
     * The meta object literal for the '<em>IDREFS</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getIDREFS()
     * @generated
     */
    EDataType<List<String>> IDREFS = eINSTANCE.getIDREFS();

    /**
     * The meta object literal for the '<em>IDREFS Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getIDREFSBase()
     * @generated
     */
    EDataType<List<String>> IDREFS_BASE = eINSTANCE.getIDREFSBase();

    /**
     * The meta object literal for the '<em>Int</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getInt()
     * @generated
     */
    EDataType<Integer> INT = eINSTANCE.getInt();

    /**
     * The meta object literal for the '<em>Integer</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.math.BigInteger
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getInteger()
     * @generated
     */
    EDataType<BigInteger> INTEGER = eINSTANCE.getInteger();

    /**
     * The meta object literal for the '<em>Int Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Integer
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getIntObject()
     * @generated
     */
    EDataType<Integer> INT_OBJECT = eINSTANCE.getIntObject();

    /**
     * The meta object literal for the '<em>Language</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getLanguage()
     * @generated
     */
    EDataType<String> LANGUAGE = eINSTANCE.getLanguage();

    /**
     * The meta object literal for the '<em>Long</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getLong()
     * @generated
     */
    EDataType<Long> LONG = eINSTANCE.getLong();

    /**
     * The meta object literal for the '<em>Long Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Long
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getLongObject()
     * @generated
     */
    EDataType<Long> LONG_OBJECT = eINSTANCE.getLongObject();

    /**
     * The meta object literal for the '<em>Name</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getName_()
     * @generated
     */
    EDataType<String> NAME = eINSTANCE.getName_();

    /**
     * The meta object literal for the '<em>NC Name</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getNCName()
     * @generated
     */
    EDataType<String> NC_NAME = eINSTANCE.getNCName();

    /**
     * The meta object literal for the '<em>Negative Integer</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.math.BigInteger
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getNegativeInteger()
     * @generated
     */
    EDataType<BigInteger> NEGATIVE_INTEGER = eINSTANCE.getNegativeInteger();

    /**
     * The meta object literal for the '<em>NMTOKEN</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getNMTOKEN()
     * @generated
     */
    EDataType<String> NMTOKEN = eINSTANCE.getNMTOKEN();

    /**
     * The meta object literal for the '<em>NMTOKENS</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getNMTOKENS()
     * @generated
     */
    EDataType<List<String>> NMTOKENS = eINSTANCE.getNMTOKENS();

    /**
     * The meta object literal for the '<em>NMTOKENS Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getNMTOKENSBase()
     * @generated
     */
    EDataType<List<String>> NMTOKENS_BASE = eINSTANCE.getNMTOKENSBase();

    /**
     * The meta object literal for the '<em>Non Negative Integer</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.math.BigInteger
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getNonNegativeInteger()
     * @generated
     */
    EDataType<BigInteger> NON_NEGATIVE_INTEGER = eINSTANCE.getNonNegativeInteger();

    /**
     * The meta object literal for the '<em>Non Positive Integer</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.math.BigInteger
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getNonPositiveInteger()
     * @generated
     */
    EDataType<BigInteger> NON_POSITIVE_INTEGER = eINSTANCE.getNonPositiveInteger();

    /**
     * The meta object literal for the '<em>Normalized String</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getNormalizedString()
     * @generated
     */
    EDataType<String> NORMALIZED_STRING = eINSTANCE.getNormalizedString();

    /**
     * The meta object literal for the '<em>NOTATION</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see javax.xml.namespace.QName
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getNOTATION()
     * @generated
     */
    EDataType<QName> NOTATION = eINSTANCE.getNOTATION();

    /**
     * The meta object literal for the '<em>Positive Integer</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.math.BigInteger
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getPositiveInteger()
     * @generated
     */
    EDataType<BigInteger> POSITIVE_INTEGER = eINSTANCE.getPositiveInteger();

    /**
     * The meta object literal for the '<em>QName</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see javax.xml.namespace.QName
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getQName()
     * @generated
     */
    EDataType<QName> QNAME = eINSTANCE.getQName();

    /**
     * The meta object literal for the '<em>Short</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getShort()
     * @generated
     */
    EDataType<Short> SHORT = eINSTANCE.getShort();

    /**
     * The meta object literal for the '<em>Short Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Short
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getShortObject()
     * @generated
     */
    EDataType<Short> SHORT_OBJECT = eINSTANCE.getShortObject();

    /**
     * The meta object literal for the '<em>String</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getString()
     * @generated
     */
    EDataType<String> STRING = eINSTANCE.getString();

    /**
     * The meta object literal for the '<em>Time</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see javax.xml.datatype.XMLGregorianCalendar
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getTime()
     * @generated
     */
    EDataType<XMLGregorianCalendar> TIME = eINSTANCE.getTime();

    /**
     * The meta object literal for the '<em>Token</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getToken()
     * @generated
     */
    EDataType<String> TOKEN = eINSTANCE.getToken();

    /**
     * The meta object literal for the '<em>Unsigned Byte</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getUnsignedByte()
     * @generated
     */
    EDataType<Short> UNSIGNED_BYTE = eINSTANCE.getUnsignedByte();

    /**
     * The meta object literal for the '<em>Unsigned Byte Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Short
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getUnsignedByteObject()
     * @generated
     */
    EDataType<Short> UNSIGNED_BYTE_OBJECT = eINSTANCE.getUnsignedByteObject();

    /**
     * The meta object literal for the '<em>Unsigned Int</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getUnsignedInt()
     * @generated
     */
    EDataType<Long> UNSIGNED_INT = eINSTANCE.getUnsignedInt();

    /**
     * The meta object literal for the '<em>Unsigned Int Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Long
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getUnsignedIntObject()
     * @generated
     */
    EDataType<Long> UNSIGNED_INT_OBJECT = eINSTANCE.getUnsignedIntObject();

    /**
     * The meta object literal for the '<em>Unsigned Long</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.math.BigInteger
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getUnsignedLong()
     * @generated
     */
    EDataType<BigInteger> UNSIGNED_LONG = eINSTANCE.getUnsignedLong();

    /**
     * The meta object literal for the '<em>Unsigned Short</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getUnsignedShort()
     * @generated
     */
    EDataType<Integer> UNSIGNED_SHORT = eINSTANCE.getUnsignedShort();

    /**
     * The meta object literal for the '<em>Unsigned Short Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Integer
     * @see org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl#getUnsignedShortObject()
     * @generated
     */
    EDataType<Integer> UNSIGNED_SHORT_OBJECT = eINSTANCE.getUnsignedShortObject();

  }

} //XMLTypePackage
