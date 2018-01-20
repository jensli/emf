/**
 * Copyright (c) 2002-2009 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *   Christian Damus (Zeligsoft) - 255469
 */
package org.eclipse.emf.ecore.impl;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

//import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
//import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreFactoryImpl extends EFactoryImpl implements EcoreFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EcoreFactory init()
  {
    try
    {
      EcoreFactory theEcoreFactory = (EcoreFactory)EPackage.Registry.INSTANCE.getEFactory(EcorePackage.eNS_URI);
      if (theEcoreFactory != null)
      {
        return theEcoreFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EcoreFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EcoreFactoryImpl()
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
      case EcorePackage.EATTRIBUTE: return (T) createEAttribute();
      case EcorePackage.EANNOTATION: return (T) createEAnnotation();
      case EcorePackage.ECLASS: return (T) createEClass();
      case EcorePackage.EDATA_TYPE: return (T) createEDataType();
      case EcorePackage.EENUM: return (T) createEEnum();
      case EcorePackage.EENUM_LITERAL: return (T) createEEnumLiteral();
      case EcorePackage.EFACTORY: return (T) createEFactory();
      case EcorePackage.EOBJECT: return (T) createEObject();
      case EcorePackage.EOPERATION: return (T) createEOperation();
      case EcorePackage.EPACKAGE: return (T) createEPackage();
      case EcorePackage.EPARAMETER: return (T) createEParameter();
      case EcorePackage.EREFERENCE: return (T) createEReference();
      case EcorePackage.ESTRING_TO_STRING_MAP_ENTRY: return (T) (EObject)createEStringToStringMapEntry();
      case EcorePackage.EGENERIC_TYPE: return (T) createEGenericType();
      case EcorePackage.ETYPE_PARAMETER: return (T) createETypeParameter();
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
    // CHANGE gen: Cast added 1
    switch (eDataType.getClassifierID())
    {
      case EcorePackage.EBIG_DECIMAL:
        return (T) createEBigDecimalFromString((EDataType<BigDecimal>) eDataType, initialValue);
      case EcorePackage.EBIG_INTEGER:
        return (T) createEBigIntegerFromString((EDataType<BigInteger>) eDataType, initialValue);
      case EcorePackage.EBOOLEAN:
        return (T) createEBooleanFromString((EDataType<Boolean>) eDataType, initialValue);
      case EcorePackage.EBOOLEAN_OBJECT:
        return (T) createEBooleanObjectFromString((EDataType<Boolean>) eDataType, initialValue);
      case EcorePackage.EBYTE:
        return (T) createEByteFromString((EDataType<Byte>) eDataType, initialValue);
      case EcorePackage.EBYTE_ARRAY:
        return (T) createEByteArrayFromString((EDataType<byte[]>) eDataType, initialValue);
      case EcorePackage.EBYTE_OBJECT:
        return (T) createEByteObjectFromString((EDataType<Byte>) eDataType, initialValue);
      case EcorePackage.ECHAR:
        return (T) createECharFromString((EDataType<Character>) eDataType, initialValue);
      case EcorePackage.ECHARACTER_OBJECT:
        return (T) createECharacterObjectFromString((EDataType<Character>) eDataType, initialValue);
      case EcorePackage.EDATE:
        return (T) createEDateFromString((EDataType<Date>) eDataType, initialValue);
      case EcorePackage.EDOUBLE:
        return (T) createEDoubleFromString((EDataType<Double>) eDataType, initialValue);
      case EcorePackage.EDOUBLE_OBJECT:
        return (T) createEDoubleObjectFromString((EDataType<Double>) eDataType, initialValue);
      case EcorePackage.EFLOAT:
        return (T) createEFloatFromString((EDataType<Float>) eDataType, initialValue);
      case EcorePackage.EFLOAT_OBJECT:
        return (T) createEFloatObjectFromString((EDataType<Float>) eDataType, initialValue);
      case EcorePackage.EINT:
        return (T) createEIntFromString((EDataType<Integer>) eDataType, initialValue);
      case EcorePackage.EINTEGER_OBJECT:
        return (T) createEIntegerObjectFromString((EDataType<Integer>) eDataType, initialValue);
      case EcorePackage.EJAVA_CLASS:
        return (T) createEJavaClassFromString((EDataType<Class<?>>) eDataType, initialValue);
      case EcorePackage.EJAVA_OBJECT:
        return (T) createEJavaObjectFromString((EDataType<Object>) eDataType, initialValue);
      case EcorePackage.ELONG:
        return (T) createELongFromString((EDataType<Long>) eDataType, initialValue);
      case EcorePackage.ELONG_OBJECT:
        return (T) createELongObjectFromString((EDataType<Long>) eDataType, initialValue);
      case EcorePackage.ESHORT:
        return (T) createEShortFromString((EDataType<Short>) eDataType, initialValue);
      case EcorePackage.ESHORT_OBJECT:
        return (T) createEShortObjectFromString((EDataType<Short>) eDataType, initialValue);
      case EcorePackage.ESTRING:
        return (T) createEStringFromString((EDataType<String>) eDataType, initialValue);
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
	public <T> String convertToString(EDataType<T> eDataType, T instanceValue) {
    switch (eDataType.getClassifierID())
    {
      case EcorePackage.EBIG_DECIMAL:
        return convertEBigDecimalToString((EDataType<BigDecimal>) eDataType, (BigDecimal) instanceValue);
      case EcorePackage.EBIG_INTEGER:
        return convertEBigIntegerToString((EDataType<BigInteger>) eDataType, (BigInteger) instanceValue);
      case EcorePackage.EBOOLEAN:
        return convertEBooleanToString((EDataType<Boolean>) eDataType, (Boolean) instanceValue);
      case EcorePackage.EBOOLEAN_OBJECT:
        return convertEBooleanObjectToString((EDataType<Boolean>) eDataType, (Boolean) instanceValue);
      case EcorePackage.EBYTE:
        return convertEByteToString((EDataType<Byte>) eDataType, (Byte) instanceValue);
      case EcorePackage.EBYTE_ARRAY:
        return convertEByteArrayToString((EDataType<byte[]>) eDataType, (byte[]) instanceValue);
      case EcorePackage.EBYTE_OBJECT:
        return convertEByteObjectToString((EDataType<Byte>) eDataType, (Byte) instanceValue);
      case EcorePackage.ECHAR:
        return convertECharToString((EDataType<Character>) eDataType, (Character) instanceValue);
      case EcorePackage.ECHARACTER_OBJECT:
        return convertECharacterObjectToString((EDataType<Character>) eDataType, (Character) instanceValue);
      case EcorePackage.EDATE:
        return convertEDateToString((EDataType<Date>) eDataType, (Date) instanceValue);
      case EcorePackage.EDOUBLE:
        return convertEDoubleToString((EDataType<Double>) eDataType, (Double) instanceValue);
      case EcorePackage.EDOUBLE_OBJECT:
        return convertEDoubleObjectToString((EDataType<Double>) eDataType, (Double) instanceValue);
      case EcorePackage.EFLOAT:
        return convertEFloatToString((EDataType<Float>) eDataType, (Float) instanceValue);
      case EcorePackage.EFLOAT_OBJECT:
        return convertEFloatObjectToString((EDataType<Float>) eDataType, (Float) instanceValue);
      case EcorePackage.EINT:
        return convertEIntToString((EDataType<Integer>) eDataType, (Integer) instanceValue);
      case EcorePackage.EINTEGER_OBJECT:
        return convertEIntegerObjectToString((EDataType<Integer>) eDataType, (Integer) instanceValue);
      case EcorePackage.EJAVA_CLASS:
        return convertEJavaClassToString((EDataType<Class<?>>) eDataType, (Class<?>) instanceValue);
      case EcorePackage.EJAVA_OBJECT:
        return convertEJavaObjectToString((EDataType<Object>) eDataType, (Object) instanceValue);
      case EcorePackage.ELONG:
        return convertELongToString((EDataType<Long>) eDataType, (Long) instanceValue);
      case EcorePackage.ELONG_OBJECT:
        return convertELongObjectToString((EDataType<Long>) eDataType, (Long) instanceValue);
      case EcorePackage.ESHORT:
        return convertEShortToString((EDataType<Short>) eDataType, (Short) instanceValue);
      case EcorePackage.ESHORT_OBJECT:
        return convertEShortObjectToString((EDataType<Short>) eDataType, (Short) instanceValue);
      case EcorePackage.ESTRING:
        return convertEStringToString((EDataType<String>) eDataType, (String) instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject createEObject()
  {
    EObjectImpl eObject = new EObjectImpl();
    return eObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public <C extends EObject, V> EAttribute<C, V> createEAttribute()
  {
    EAttributeImpl<C, V> eAttribute = new EAttributeImpl<C, V>();
    return eAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAnnotation createEAnnotation()
  {
    EAnnotationImpl eAnnotation = new EAnnotationImpl();
    return eAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public <T extends EObject> EClass<T> createEClass()
  {
    EClassImpl<T> eClass = new EClassImpl<T>();
    return eClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public <T> EDataType<T> createEDataType()
  {
    EDataTypeImpl<T> eDataType = new EDataTypeImpl<T>();
    return eDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public <T> EParameter<T> createEParameter()
  {
    EParameterImpl<T> eParameter = new EParameterImpl<T>();
    return eParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public <C extends EObject, V> EOperation<C, V> createEOperation()
  {
    EOperationImpl<C, V> eOperation = new EOperationImpl<C, V>();
    return eOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EPackage createEPackage()
  {
    EPackageImpl ePackage = new EPackageImpl();
    return ePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EFactory createEFactory()
  {
    EFactoryImpl eFactory = new EFactoryImpl();
    return eFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnumLiteral createEEnumLiteral()
  {
    EEnumLiteralImpl eEnumLiteral = new EEnumLiteralImpl();
    return eEnumLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public <T> EEnum<T> createEEnum()
  {
    EEnumImpl<T> eEnum = new EEnumImpl<T>();
    return eEnum;
  }

  protected Boolean booleanValueOf(String initialValue)
  {
    if ("true".equalsIgnoreCase(initialValue))
    {
      return Boolean.TRUE;
    }
    else if ("false".equalsIgnoreCase(initialValue))
    {
      return Boolean.FALSE;
    }
    else
    {
      throw new IllegalArgumentException("Expecting true or false");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Boolean createEBooleanObjectFromString(EDataType<?> metaObject, String initialValue) 
  {
    return initialValue == null ? null : booleanValueOf(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertEBooleanObjectToString(EDataType<?> metaObject, Object instanceValue) 
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Character createECharacterObjectFromString(EDataType<?> metaObject, String initialValue) 
  {
    if (initialValue == null)
    {
      return null;
    }

    char charValue = 0;
    try
    {
      charValue = (char)Integer.parseInt(initialValue);
    }
    catch (NumberFormatException e)
    {
      char[] carray = initialValue.toCharArray();
      charValue = carray[0];
    }
    return charValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertECharacterObjectToString(EDataType<?> metaObject, Object instanceValue) 
  {
    if (instanceValue instanceof Character)
    {
      return Integer.toString((Character)instanceValue);
    }

    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Date createEDateFromString(EDataType<?> eDataType, String initialValue)
  {
    if (initialValue == null)
    {
      return null;
    }

    Exception exception = null;
    for (int i = 0; i < EDATE_FORMATS.length; ++i)
    {
      try
      {
        return EDATE_FORMATS[i].parse(initialValue);
      }
      catch (ParseException parseException)
      {
        exception = parseException;
      }
    }
    throw new WrappedException(exception);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertEDateToString(EDataType<?> eDataType, Object instanceValue)
  {
    if (instanceValue == null)
    {
      return null;
    }
    else
    {
      return EDATE_FORMATS[0].format((Date)instanceValue);
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Double createEDoubleObjectFromString(EDataType<?> metaObject, String initialValue) 
  {
    return initialValue == null ? null : Double.valueOf(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertEDoubleObjectToString(EDataType<?> metaObject, Object instanceValue) 
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Float createEFloatObjectFromString(EDataType<?> metaObject, String initialValue) 
  {
    return initialValue == null ? null : Float.valueOf(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertEFloatObjectToString(EDataType<?> metaObject, Object instanceValue) 
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Integer createEIntegerObjectFromString(EDataType<?> metaObject, String initialValue) 
  {
    return initialValue == null ? null : Integer.valueOf(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertEIntegerObjectToString(EDataType<?> metaObject, Object instanceValue) 
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public <C extends EObject, V> EReference<C, V> createEReference()
  {
    EReferenceImpl<C, V> eReference = new EReferenceImpl<C, V>();
    return eReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map.Entry<String, String> createEStringToStringMapEntry()
  {
    EStringToStringMapEntryImpl eStringToStringMapEntry = new EStringToStringMapEntryImpl();
    return eStringToStringMapEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EGenericType createEGenericType()
  {
    EGenericTypeImpl eGenericType = new EGenericTypeImpl();
    return eGenericType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETypeParameter createETypeParameter()
  {
    ETypeParameterImpl eTypeParameter = new ETypeParameterImpl();
    return eTypeParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public BigDecimal createEBigDecimalFromString(EDataType<?> eDataType, String initialValue)
  {
    return initialValue == null ? null : new BigDecimal(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertEBigDecimalToString(EDataType<?> eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public BigInteger createEBigIntegerFromString(EDataType<?> eDataType, String initialValue)
  {
    return initialValue == null ? null : new BigInteger(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertEBigIntegerToString(EDataType<?> eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EcorePackage getEcorePackage()
  {
    return (EcorePackage)getEPackage();
  }

  /**
   * @deprecated
   */
  @Deprecated
  public static EcorePackage getPackage()
  {
    return EcorePackage.eINSTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String createEStringFromString(EDataType<?> metaObject, String initialValue) 
  {
    return initialValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertEStringToString(EDataType<?> metaObject, Object instanceValue) 
  {
    return (String)instanceValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Integer createEIntFromString(EDataType<?> metaObject, String initialValue) 
  {
    return initialValue == null ? null : Integer.valueOf(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertEIntToString(EDataType<?> metaObject, Object instanceValue) 
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Boolean createEBooleanFromString(EDataType<?> metaObject, String initialValue) 
  {
    return initialValue == null ? null : booleanValueOf(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertEBooleanToString(EDataType<?> metaObject, Object instanceValue) 
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Byte createEByteObjectFromString(EDataType<?> metaObject, String initialValue) 
  {
    return initialValue == null ? null : Byte.valueOf(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertEByteObjectToString(EDataType<?> metaObject, Object instanceValue) 
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Float createEFloatFromString(EDataType<?> metaObject, String initialValue) 
  {
    return initialValue == null ? null : Float.valueOf(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertEFloatToString(EDataType<?> metaObject, Object instanceValue) 
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Character createECharFromString(EDataType<?> metaObject, String initialValue) 
  {
    if (initialValue == null)
    {
      return null;
    }
    char charValue = 0;
    try
    {
      charValue = (char)Integer.parseInt(initialValue);
    }
    catch (NumberFormatException e)
    {
      char[] carray = initialValue.toCharArray();
      charValue = carray[0];
    }
    return charValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertECharToString(EDataType<?> metaObject, Object instanceValue) 
  {
    if (instanceValue instanceof Character)
    {
      return Integer.toString((Character)instanceValue);
    }

    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Long createELongFromString(EDataType<?> metaObject, String initialValue) 
  {
    return initialValue == null ? null : Long.valueOf(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertELongToString(EDataType<?> metaObject, Object instanceValue) 
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Double createEDoubleFromString(EDataType<?> metaObject, String initialValue) 
  {
    return initialValue == null ? null : Double.valueOf(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertEDoubleToString(EDataType<?> metaObject, Object instanceValue) 
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Byte createEByteFromString(EDataType<?> metaObject, String initialValue) 
  {
    return initialValue == null ? null : Byte.valueOf(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertEByteToString(EDataType<?> metaObject, Object instanceValue) 
  {
    return instanceValue == null ? null : instanceValue.toString();
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public byte[] createEByteArrayFromString(EDataType<?> eDataType, String initialValue)
  {
    return hexStringToBytes(initialValue);
  }

  protected static byte hexCharToByte(char character)
  {
    return EFactoryImpl.hexCharToByte(character);
  }

  protected static final char [] HEX_DIGITS =  EFactoryImpl.HEX_DIGITS;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertEByteArrayToString(EDataType<?> eDataType, Object instanceValue)
  {
    if (instanceValue == null)
    {
      return null;
    }
    else
    {
      byte [] bytes = (byte[])instanceValue;
      return bytesToHexString(bytes, bytes.length);
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Short createEShortFromString(EDataType<?> metaObject, String initialValue) 
  {
    return initialValue == null ? null : Short.valueOf(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertEShortToString(EDataType<?> metaObject, Object instanceValue) 
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Class<?> createEJavaClassFromString(EDataType<?> metaObject, String initialValue) 
  {
    try
    {
      if (initialValue == null) return null;
      else if ("boolean".equals(initialValue)) return boolean.class;
      else if ("byte".equals(initialValue)) return byte.class;
      else if ("char".equals(initialValue)) return char.class;
      else if ("double".equals(initialValue)) return double.class;
      else if ("float".equals(initialValue)) return float.class;
      else if ("int".equals(initialValue)) return int.class;
      else if ("long".equals(initialValue)) return long.class;
      else if ("short".equals(initialValue)) return short.class;
      else return Class.forName(initialValue);
    }
    catch (ClassNotFoundException e)
    {
      throw new WrappedException(e);
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertEJavaClassToString(EDataType<?> metaObject, Object instanceValue)
  {
    return instanceValue == null ? "" : ((Class<?>)instanceValue).getName();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Object createEJavaObjectFromString(EDataType<?> eDataType, String initialValue)
  {
    return createFromString(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertEJavaObjectToString(EDataType<?> eDataType, Object instanceValue)
  {
    return convertToString(instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Long createELongObjectFromString(EDataType<?> metaObject, String initialValue) 
  {
    return initialValue == null ? null : Long.valueOf(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertELongObjectToString(EDataType<?> metaObject, Object instanceValue) 
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Short createEShortObjectFromString(EDataType<?> metaObject, String initialValue) 
  {
    return initialValue == null ? null : Short.valueOf(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertEShortObjectToString(EDataType<?> metaObject, Object instanceValue) 
  {
    return instanceValue == null ? null : instanceValue.toString();
  }
} //EcoreFactoryImpl
