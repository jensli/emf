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

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.test.models.qname.*;
import org.eclipse.emf.test.models.qname.DocumentRoot;
import org.eclipse.emf.test.models.qname.QNameFactory;
import org.eclipse.emf.test.models.qname.QNamePackage;
import org.eclipse.emf.test.models.qname.ResourceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QNameFactoryImpl extends EFactoryImpl implements QNameFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static QNameFactory init()
  {
    try
    {
      QNameFactory theQNameFactory = (QNameFactory)EPackage.Registry.INSTANCE.getEFactory(QNamePackage.eNS_URI);
      if (theQNameFactory != null)
      {
        return theQNameFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new QNameFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QNameFactoryImpl()
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
      case QNamePackage.DOCUMENT_ROOT: return (T) createDocumentRoot();
      case QNamePackage.RESOURCE_TYPE: return (T) createResourceType();
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
      case QNamePackage.INT_QNAME_UNION:
        return (T) createIntQNameUnionFromString((EDataType<Object>) eDataType, initialValue);
      case QNamePackage.LIST_UNION:
        return (T) createListUnionFromString((EDataType<List<Object>>) eDataType, initialValue);
      case QNamePackage.QNAME_LIST:
        return (T) createQnameListFromString((EDataType<List<QName>>) eDataType, initialValue);
      case QNamePackage.UNION:
        return (T) createUnionFromString((EDataType<Object>) eDataType, initialValue);
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
      case QNamePackage.INT_QNAME_UNION:
        return convertIntQNameUnionToString((EDataType<Object>) eDataType, (Object) instanceValue);
      case QNamePackage.LIST_UNION:
        return convertListUnionToString((EDataType<List<Object>>) eDataType, (List<Object>) instanceValue);
      case QNamePackage.QNAME_LIST:
        return convertQnameListToString((EDataType<List<QName>>) eDataType, (List<QName>) instanceValue);
      case QNamePackage.UNION:
        return convertUnionToString((EDataType<Object>) eDataType, (Object) instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentRoot createDocumentRoot()
  {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceType createResourceType()
  {
    ResourceTypeImpl resourceType = new ResourceTypeImpl();
    return resourceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object createIntQNameUnionFromString(EDataType<Object> eDataType, String initialValue)
  {
    if (initialValue == null) return null;
    Object result = null;
    RuntimeException exception = null;
    try
    {
      result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    if (result != null || exception == null) return result;
    
    throw exception;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertIntQNameUnionToString(EDataType<Object> eDataType, Object instanceValue)
  {
    if (instanceValue == null) return null;
    if (XMLTypePackage.Literals.INT.isInstance(instanceValue))
    {
      try
      {
        String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, (Integer)instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (XMLTypePackage.Literals.QNAME.isInstance(instanceValue))
    {
      try
      {
        String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, (QName)instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List<Object> createListUnionFromString(EDataType<List<Object>> eDataType, String initialValue)
  {
    if (initialValue == null) return null;
    List<Object> result = new ArrayList<Object>();
    for (String item : split(initialValue))
    {
      result.add(createUnionFromString(QNamePackage.Literals.UNION, item));
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  // CHANGE gen: Add type parameter, convert type to string
  // CHANGE gen: Note, instanceValue has type Object. Change the signature made a lot of duplicate
  // methods get generated for hand-modified convert methods, because signatures didn't match.
  public String convertListUnionToString(EDataType<List<Object>> eDataType, Object instanceValue)
  {
    if (instanceValue == null) return null;
    List<?> list = (List<?>)instanceValue;
    if (list.isEmpty()) return "";
    StringBuffer result = new StringBuffer();
    for (Object item : list)
    {
      result.append(convertUnionToString(QNamePackage.Literals.UNION, (Object) item));
      result.append(' ');
    }
    return result.substring(0, result.length() - 1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List<QName> createQnameListFromString(EDataType<List<QName>> eDataType, String initialValue)
  {
    if (initialValue == null) return null;
    List<QName> result = new ArrayList<QName>();
    for (String item : split(initialValue))
    {
      result.add((QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, item));
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  // CHANGE gen: Add type parameter, convert type to string
  // CHANGE gen: Note, instanceValue has type Object. Change the signature made a lot of duplicate
  // methods get generated for hand-modified convert methods, because signatures didn't match.
  public String convertQnameListToString(EDataType<List<QName>> eDataType, Object instanceValue)
  {
    if (instanceValue == null) return null;
    List<?> list = (List<?>)instanceValue;
    if (list.isEmpty()) return "";
    StringBuffer result = new StringBuffer();
    for (Object item : list)
    {
      // CHANGE gen: Added cast 6
      result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, (QName) item));
      result.append(' ');
    }
    return result.substring(0, result.length() - 1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object createUnionFromString(EDataType<Object> eDataType, String initialValue)
  {
    if (initialValue == null) return null;
    Object result = null;
    RuntimeException exception = null;
    try
    {
      result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    try
    {
      result = createIntQNameUnionFromString(QNamePackage.Literals.INT_QNAME_UNION, initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null))
      {
        return result;
      }
    }
    catch (RuntimeException e)
    {
      exception = e;
    }
    if (result != null || exception == null) return result;
    
    throw exception;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnionToString(EDataType<Object> eDataType, Object instanceValue)
  {
    if (instanceValue == null) return null;
    if (XMLTypePackage.Literals.BOOLEAN.isInstance(instanceValue))
    {
      try
      {
        String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, (Boolean)instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (QNamePackage.Literals.INT_QNAME_UNION.isInstance(instanceValue))
    {
      try
      {
        // CHANGE gen: Cast 3
        String value = convertIntQNameUnionToString(QNamePackage.Literals.INT_QNAME_UNION, (Object)instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QNamePackage getQNamePackage()
  {
    return (QNamePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static QNamePackage getPackage()
  {
    return QNamePackage.eINSTANCE;
  }

} //QNameFactoryImpl
