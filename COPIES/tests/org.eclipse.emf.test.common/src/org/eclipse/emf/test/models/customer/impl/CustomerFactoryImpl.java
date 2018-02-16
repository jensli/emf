package org.eclipse.emf.test.models.customer.impl;


import java.math.BigInteger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.test.models.customer.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomerFactoryImpl extends EFactoryImpl implements CustomerFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CustomerFactory init()
  {
    try
    {
      CustomerFactory theCustomerFactory = (CustomerFactory)EPackage.Registry.INSTANCE.getEFactory(CustomerPackage.eNS_URI);
      if (theCustomerFactory != null)
      {
        return theCustomerFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CustomerFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomerFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  // CHANGE: Added generics and annotation
  @SuppressWarnings("unchecked")
  public <T extends EObject> T create(EClass<T> eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CustomerPackage.CANADA_ADDR: return (T) createCanadaAddr();
      case CustomerPackage.CREDIT_INFO: return (T) createCreditInfo();
      case CustomerPackage.CUSTOMERS_TYPE: return (T) createCustomersType();
      case CustomerPackage.CUSTOMER_TYPE: return (T) createCustomerType();
      case CustomerPackage.DOCUMENT_ROOT: return (T) createDocumentRoot();
      case CustomerPackage.US_ADDR: return (T) createUSAddr();
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
  // CHANGE: Added generics and annotation
  @SuppressWarnings("unchecked")
  public <T> T createFromString(EDataType<T> eDataType, String initialValue)
  {
    // CHANGE gen: Cast added 1
    switch (eDataType.getClassifierID())
    {
      case CustomerPackage.US_STATE:
        return (T) createUSStateFromString((EDataType<USState>) eDataType, initialValue);
      case CustomerPackage.US_STATE_OBJECT:
        return (T) createUSStateObjectFromString((EDataType<USState>) eDataType, initialValue);
      case CustomerPackage.ZIP_CODES:
        return (T) createZipCodesFromString((EDataType<BigInteger>) eDataType, initialValue);
      case CustomerPackage.ZIP_UNION:
        return (T) createZipUnionFromString((EDataType<Object>) eDataType, initialValue);
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
      case CustomerPackage.US_STATE:
        return convertUSStateToString((EDataType<USState>) eDataType, (USState) instanceValue);
      case CustomerPackage.US_STATE_OBJECT:
        return convertUSStateObjectToString((EDataType<USState>) eDataType, (USState) instanceValue);
      case CustomerPackage.ZIP_CODES:
        return convertZipCodesToString((EDataType<BigInteger>) eDataType, (BigInteger) instanceValue);
      case CustomerPackage.ZIP_UNION:
        return convertZipUnionToString((EDataType<Object>) eDataType, (Object) instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CanadaAddr createCanadaAddr()
  {
    CanadaAddrImpl canadaAddr = new CanadaAddrImpl();
    return canadaAddr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreditInfo createCreditInfo()
  {
    CreditInfoImpl creditInfo = new CreditInfoImpl();
    return creditInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomersType createCustomersType()
  {
    CustomersTypeImpl customersType = new CustomersTypeImpl();
    return customersType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomerType createCustomerType()
  {
    CustomerTypeImpl customerType = new CustomerTypeImpl();
    return customerType;
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
  public USAddr createUSAddr()
  {
    USAddrImpl usAddr = new USAddrImpl();
    return usAddr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public USState createUSStateFromString(EDataType<USState> eDataType, String initialValue)
  {
    USState result = USState.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
  public String convertUSStateToString(EDataType<USState> eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public USState createUSStateObjectFromString(EDataType<USState> eDataType, String initialValue)
  {
    return createUSStateFromString(CustomerPackage.Literals.US_STATE, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  // CHANGE gen: Add type parameter, convert type to string
  // CHANGE gen: Note, instanceValue has type Object. Change the signature made a lot of duplicate
  // methods get generated for hand-modified convert methods, because signatures didn't match.
  public String convertUSStateObjectToString(EDataType<USState> eDataType, Object instanceValue)
  {
    return convertUSStateToString(CustomerPackage.Literals.US_STATE, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger createZipCodesFromString(EDataType<BigInteger> eDataType, String initialValue)
  {
    return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  // CHANGE gen: Add type parameter, convert type to string
  // CHANGE gen: Note, instanceValue has type Object. Change the signature made a lot of duplicate
  // methods get generated for hand-modified convert methods, because signatures didn't match.
  public String convertZipCodesToString(EDataType<BigInteger> eDataType, Object instanceValue)
  {
    // CHANGE gen: Added cast
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, (BigInteger)instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object createZipUnionFromString(EDataType<Object> eDataType, String initialValue)
  {
    if (initialValue == null) return null;
    Object result = null;
    RuntimeException exception = null;
    try
    {
      result = createUSStateFromString(CustomerPackage.Literals.US_STATE, initialValue);
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
      result = createZipCodesFromString(CustomerPackage.Literals.ZIP_CODES, initialValue);
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
  public String convertZipUnionToString(EDataType<Object> eDataType, Object instanceValue)
  {
    if (instanceValue == null) return null;
    if (CustomerPackage.Literals.US_STATE.isInstance(instanceValue))
    {
      try
      {
        // CHANGE gen: Cast added 3
        String value = convertUSStateToString(CustomerPackage.Literals.US_STATE, (USState)instanceValue);
        if (value != null) return value;
      }
      catch (Exception e)
      {
        // Keep trying other member types until all have failed.
      }
    }
    if (CustomerPackage.Literals.ZIP_CODES.isInstance(instanceValue))
    {
      try
      {
        // CHANGE gen: Cast added 3
        String value = convertZipCodesToString(CustomerPackage.Literals.ZIP_CODES, (BigInteger)instanceValue);
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
  public CustomerPackage getCustomerPackage()
  {
    return (CustomerPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CustomerPackage getPackage()
  {
    return CustomerPackage.eINSTANCE;
  }

} //CustomerFactoryImpl