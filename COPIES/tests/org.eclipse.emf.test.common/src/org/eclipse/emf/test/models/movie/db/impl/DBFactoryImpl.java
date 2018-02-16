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
package org.eclipse.emf.test.models.movie.db.impl;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.test.models.movie.db.*;
import org.eclipse.emf.test.models.movie.db.CriticsReviewType;
import org.eclipse.emf.test.models.movie.db.CustomerReviewType;
import org.eclipse.emf.test.models.movie.db.DBFactory;
import org.eclipse.emf.test.models.movie.db.DBPackage;
import org.eclipse.emf.test.models.movie.db.DocumentRoot;
import org.eclipse.emf.test.models.movie.db.GenreTypes;
import org.eclipse.emf.test.models.movie.db.MovieDBType;
import org.eclipse.emf.test.models.movie.db.MovieType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DBFactoryImpl extends EFactoryImpl implements DBFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DBFactory init()
  {
    try
    {
      DBFactory theDBFactory = (DBFactory)EPackage.Registry.INSTANCE.getEFactory(DBPackage.eNS_URI);
      if (theDBFactory != null)
      {
        return theDBFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DBFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DBFactoryImpl()
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
      case DBPackage.CRITICS_REVIEW_TYPE: return (T) createCriticsReviewType();
      case DBPackage.CUSTOMER_REVIEW_TYPE: return (T) createCustomerReviewType();
      case DBPackage.DOCUMENT_ROOT: return (T) createDocumentRoot();
      case DBPackage.MOVIE_DB_TYPE: return (T) createMovieDBType();
      case DBPackage.MOVIE_TYPE: return (T) createMovieType();
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
      case DBPackage.GENRE_TYPES:
        return (T) createGenreTypesFromString((EDataType<GenreTypes>) eDataType, initialValue);
      case DBPackage.ACTORS_LIST:
        return (T) createActorsListFromString((EDataType<List<String>>) eDataType, initialValue);
      case DBPackage.GENRE_TYPES_OBJECT:
        return (T) createGenreTypesObjectFromString((EDataType<GenreTypes>) eDataType, initialValue);
      case DBPackage.RATING_TYPE:
        return (T) createRatingTypeFromString((EDataType<Integer>) eDataType, initialValue);
      case DBPackage.RATING_TYPE_OBJECT:
        return (T) createRatingTypeObjectFromString((EDataType<Integer>) eDataType, initialValue);
      case DBPackage.RATING_VALUES:
        return (T) createRatingValuesFromString((EDataType<Integer>) eDataType, initialValue);
      case DBPackage.RATING_VALUES_OBJECT:
        return (T) createRatingValuesObjectFromString((EDataType<Integer>) eDataType, initialValue);
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
      case DBPackage.GENRE_TYPES:
        return convertGenreTypesToString((EDataType<GenreTypes>) eDataType, (GenreTypes) instanceValue);
      case DBPackage.ACTORS_LIST:
        return convertActorsListToString((EDataType<List<String>>) eDataType, (List<String>) instanceValue);
      case DBPackage.GENRE_TYPES_OBJECT:
        return convertGenreTypesObjectToString((EDataType<GenreTypes>) eDataType, (GenreTypes) instanceValue);
      case DBPackage.RATING_TYPE:
        return convertRatingTypeToString((EDataType<Integer>) eDataType, (Integer) instanceValue);
      case DBPackage.RATING_TYPE_OBJECT:
        return convertRatingTypeObjectToString((EDataType<Integer>) eDataType, (Integer) instanceValue);
      case DBPackage.RATING_VALUES:
        return convertRatingValuesToString((EDataType<Integer>) eDataType, (Integer) instanceValue);
      case DBPackage.RATING_VALUES_OBJECT:
        return convertRatingValuesObjectToString((EDataType<Integer>) eDataType, (Integer) instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CriticsReviewType createCriticsReviewType()
  {
    CriticsReviewTypeImpl criticsReviewType = new CriticsReviewTypeImpl();
    return criticsReviewType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomerReviewType createCustomerReviewType()
  {
    CustomerReviewTypeImpl customerReviewType = new CustomerReviewTypeImpl();
    return customerReviewType;
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
  public MovieDBType createMovieDBType()
  {
    MovieDBTypeImpl movieDBType = new MovieDBTypeImpl();
    return movieDBType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MovieType createMovieType()
  {
    MovieTypeImpl movieType = new MovieTypeImpl();
    return movieType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenreTypes createGenreTypesFromString(EDataType<GenreTypes> eDataType, String initialValue)
  {
    GenreTypes result = GenreTypes.get(initialValue);
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
  public String convertGenreTypesToString(EDataType<GenreTypes> eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List<String> createActorsListFromString(EDataType<List<String>> eDataType, String initialValue)
  {
    if (initialValue == null) return null;
    List<String> result = new ArrayList<String>();
    for (String item : split(initialValue))
    {
      result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, item));
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
  public String convertActorsListToString(EDataType<List<String>> eDataType, Object instanceValue)
  {
    if (instanceValue == null) return null;
    List<?> list = (List<?>)instanceValue;
    if (list.isEmpty()) return "";
    StringBuffer result = new StringBuffer();
    for (Object item : list)
    {
      // CHANGE gen: Added cast 6
      result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, (String) item));
      result.append(' ');
    }
    return result.substring(0, result.length() - 1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenreTypes createGenreTypesObjectFromString(EDataType<GenreTypes> eDataType, String initialValue)
  {
    return createGenreTypesFromString(DBPackage.Literals.GENRE_TYPES, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  // CHANGE gen: Add type parameter, convert type to string
  // CHANGE gen: Note, instanceValue has type Object. Change the signature made a lot of duplicate
  // methods get generated for hand-modified convert methods, because signatures didn't match.
  public String convertGenreTypesObjectToString(EDataType<GenreTypes> eDataType, Object instanceValue)
  {
    return convertGenreTypesToString(DBPackage.Literals.GENRE_TYPES, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer createRatingTypeFromString(EDataType<Integer> eDataType, String initialValue)
  {
    return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  // CHANGE gen: Add type parameter, convert type to string
  // CHANGE gen: Note, instanceValue has type Object. Change the signature made a lot of duplicate
  // methods get generated for hand-modified convert methods, because signatures didn't match.
  public String convertRatingTypeToString(EDataType<Integer> eDataType, Object instanceValue)
  {
    // CHANGE gen: Added cast
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, (Integer)instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer createRatingTypeObjectFromString(EDataType<Integer> eDataType, String initialValue)
  {
    return createRatingTypeFromString(DBPackage.Literals.RATING_TYPE, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  // CHANGE gen: Add type parameter, convert type to string
  // CHANGE gen: Note, instanceValue has type Object. Change the signature made a lot of duplicate
  // methods get generated for hand-modified convert methods, because signatures didn't match.
  public String convertRatingTypeObjectToString(EDataType<Integer> eDataType, Object instanceValue)
  {
    return convertRatingTypeToString(DBPackage.Literals.RATING_TYPE, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer createRatingValuesFromString(EDataType<Integer> eDataType, String initialValue)
  {
    return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  // CHANGE gen: Add type parameter, convert type to string
  // CHANGE gen: Note, instanceValue has type Object. Change the signature made a lot of duplicate
  // methods get generated for hand-modified convert methods, because signatures didn't match.
  public String convertRatingValuesToString(EDataType<Integer> eDataType, Object instanceValue)
  {
    // CHANGE gen: Added cast
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, (Integer)instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer createRatingValuesObjectFromString(EDataType<Integer> eDataType, String initialValue)
  {
    return createRatingValuesFromString(DBPackage.Literals.RATING_VALUES, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  // CHANGE gen: Add type parameter, convert type to string
  // CHANGE gen: Note, instanceValue has type Object. Change the signature made a lot of duplicate
  // methods get generated for hand-modified convert methods, because signatures didn't match.
  public String convertRatingValuesObjectToString(EDataType<Integer> eDataType, Object instanceValue)
  {
    return convertRatingValuesToString(DBPackage.Literals.RATING_VALUES, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DBPackage getDBPackage()
  {
    return (DBPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DBPackage getPackage()
  {
    return DBPackage.eINSTANCE;
  }

} //DBFactoryImpl
