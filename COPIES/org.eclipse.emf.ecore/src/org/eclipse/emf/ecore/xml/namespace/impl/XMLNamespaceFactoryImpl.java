package org.eclipse.emf.ecore.xml.namespace.impl;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xml.namespace.*;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XMLNamespaceFactoryImpl extends EFactoryImpl implements XMLNamespaceFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static XMLNamespaceFactory init()
  {
    try
    {
      XMLNamespaceFactory theXMLNamespaceFactory = (XMLNamespaceFactory)EPackage.Registry.INSTANCE.getEFactory(XMLNamespacePackage.eNS_URI);
      if (theXMLNamespaceFactory != null)
      {
        return theXMLNamespaceFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new XMLNamespaceFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLNamespaceFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  // CHANGE gen: Added generics and annotation
  @SuppressWarnings("unchecked")
  public <T extends EObject> T create(EClass<T> eClass)
  {
    switch (eClass.getClassifierID())
    {
      case XMLNamespacePackage.XML_NAMESPACE_DOCUMENT_ROOT: return (T) createXMLNamespaceDocumentRoot();
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
  // CHANGE gen: Added generics and annotation
  @SuppressWarnings("unchecked")
  public <T> T createFromString(EDataType<T> eDataType, String initialValue)
  {
    // CHANGE gen: Cast added 1
    switch (eDataType.getClassifierID())
    {
      case XMLNamespacePackage.SPACE_TYPE:
        return (T) createSpaceTypeFromString((EDataType<SpaceType>) eDataType, initialValue);
      case XMLNamespacePackage.LANG_TYPE:
        return (T) createLangTypeFromString((EDataType<String>) eDataType, initialValue);
      case XMLNamespacePackage.LANG_TYPE_NULL:
        return (T) createLangTypeNullFromString((EDataType<String>) eDataType, initialValue);
      case XMLNamespacePackage.SPACE_TYPE_OBJECT:
        return (T) createSpaceTypeObjectFromString((EDataType<SpaceType>) eDataType, initialValue);
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
      case XMLNamespacePackage.SPACE_TYPE:
        return convertSpaceTypeToString((EDataType<SpaceType>) eDataType, (SpaceType) instanceValue);
      case XMLNamespacePackage.LANG_TYPE:
        return convertLangTypeToString((EDataType<String>) eDataType, (String) instanceValue);
      case XMLNamespacePackage.LANG_TYPE_NULL:
        return convertLangTypeNullToString((EDataType<String>) eDataType, (String) instanceValue);
      case XMLNamespacePackage.SPACE_TYPE_OBJECT:
        return convertSpaceTypeObjectToString((EDataType<SpaceType>) eDataType, (SpaceType) instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLNamespaceDocumentRoot createXMLNamespaceDocumentRoot()
  {
    XMLNamespaceDocumentRootImpl xmlNamespaceDocumentRoot = new XMLNamespaceDocumentRootImpl();
    return xmlNamespaceDocumentRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
    // CHANGE gen: Added type parameter
  public SpaceType createSpaceTypeFromString(EDataType<SpaceType> eDataType, String initialValue)
  {
    SpaceType result = SpaceType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  // CHANGE gen: Add type parameter, convert type to string
  public String convertSpaceTypeToString(EDataType<SpaceType> eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
    // CHANGE gen: Added type parameter
  public String createLangTypeFromString(EDataType<String> eDataType, String initialValue)
  {
    if (initialValue == null) return null;
    String result = null;
    RuntimeException exception = null;
    try
    {
      result = (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LANGUAGE, initialValue);
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
      result = createLangTypeNullFromString(XMLNamespacePackage.Literals.LANG_TYPE_NULL, initialValue);
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
  // CHANGE gen: Add type parameter, convert type to string
  public String convertLangTypeToString(EDataType<String> eDataType, Object instanceValue)
  {
    if (instanceValue == null) return null;
    if (XMLTypePackage.Literals.LANGUAGE.isInstance(instanceValue))
    {
      try
      {
        // CHANGE gen: Cast added 3
        String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LANGUAGE, (String) instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (XMLNamespacePackage.Literals.LANG_TYPE_NULL.isInstance(instanceValue))
    {
      try
      {
        // CHANGE gen: Cast added 3
        String value = convertLangTypeNullToString(XMLNamespacePackage.Literals.LANG_TYPE_NULL, (String) instanceValue);
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
    // CHANGE gen: Added type parameter
  public String createLangTypeNullFromString(EDataType<String> eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  // CHANGE gen: Add type parameter, convert type to string
  public String convertLangTypeNullToString(EDataType<String> eDataType, Object instanceValue)
  {
    // CHANGE gen: Added cast
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, (String)instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
    // CHANGE gen: Added type parameter
  public SpaceType createSpaceTypeObjectFromString(EDataType<SpaceType> eDataType, String initialValue)
  {
    return createSpaceTypeFromString(XMLNamespacePackage.Literals.SPACE_TYPE, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  // CHANGE gen: Add type parameter, convert type to string
  public String convertSpaceTypeObjectToString(EDataType<SpaceType> eDataType, Object instanceValue)
  {
    return convertSpaceTypeToString(XMLNamespacePackage.Literals.SPACE_TYPE, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLNamespacePackage getXMLNamespacePackage()
  {
    return (XMLNamespacePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static XMLNamespacePackage getPackage()
  {
    return XMLNamespacePackage.eINSTANCE;
  }

} //XMLNamespaceFactoryImpl