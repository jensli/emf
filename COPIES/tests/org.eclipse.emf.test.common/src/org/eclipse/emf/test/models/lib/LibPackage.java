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
package org.eclipse.emf.test.models.lib;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.emf.test.models.lib.LibFactory
 * @model kind="package"
 * @generated
 */
public interface LibPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lib";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http:///org.eclipse.emf.test.models/SimpleLib";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "org.eclipse.emf.test.models.lib";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LibPackage eINSTANCE = org.eclipse.emf.test.models.lib.impl.LibPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.models.lib.impl.LibraryImpl <em>Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.models.lib.impl.LibraryImpl
   * @see org.eclipse.emf.test.models.lib.impl.LibPackageImpl#getLibrary()
   * @generated
   */
  int LIBRARY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__NAME = 0;

  /**
   * The feature id for the '<em><b>Books</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__BOOKS = 1;

  /**
   * The feature id for the '<em><b>Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__ADDRESS = 2;

  /**
   * The feature id for the '<em><b>Writers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__WRITERS = 3;

  /**
   * The feature id for the '<em><b>Cafeteria</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__CAFETERIA = 4;

  /**
   * The number of structural features of the '<em>Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.models.lib.impl.BookImpl <em>Book</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.models.lib.impl.BookImpl
   * @see org.eclipse.emf.test.models.lib.impl.LibPackageImpl#getBook()
   * @generated
   */
  int BOOK = 1;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__TITLE = 0;

  /**
   * The number of structural features of the '<em>Book</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.models.lib.impl.AddressImpl <em>Address</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.models.lib.impl.AddressImpl
   * @see org.eclipse.emf.test.models.lib.impl.LibPackageImpl#getAddress()
   * @generated
   */
  int ADDRESS = 2;

  /**
   * The feature id for the '<em><b>Postal Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS__POSTAL_CODE = 0;

  /**
   * The number of structural features of the '<em>Address</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.models.lib.impl.PersonImpl <em>Person</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.models.lib.impl.PersonImpl
   * @see org.eclipse.emf.test.models.lib.impl.LibPackageImpl#getPerson()
   * @generated
   */
  int PERSON = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__NAME = 0;

  /**
   * The feature id for the '<em><b>Library</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__LIBRARY = 1;

  /**
   * The number of structural features of the '<em>Person</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.models.lib.impl.CafeteriaImpl <em>Cafeteria</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.models.lib.impl.CafeteriaImpl
   * @see org.eclipse.emf.test.models.lib.impl.LibPackageImpl#getCafeteria()
   * @generated
   */
  int CAFETERIA = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAFETERIA__NAME = 0;

  /**
   * The feature id for the '<em><b>Library</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAFETERIA__LIBRARY = 1;

  /**
   * The number of structural features of the '<em>Cafeteria</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAFETERIA_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.models.lib.Library <em>Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Library</em>'.
   * @see org.eclipse.emf.test.models.lib.Library
   * @generated
   */
  EClass<Library> getLibrary();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.test.models.lib.Library#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.test.models.lib.Library#getName()
   * @see #getLibrary()
   * @generated
   */
  EAttribute<Library, String> getLibrary_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.test.models.lib.Library#getBooks <em>Books</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Books</em>'.
   * @see org.eclipse.emf.test.models.lib.Library#getBooks()
   * @see #getLibrary()
   * @generated
   */
  EReference<Library, EList<Book>> getLibrary_Books();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.test.models.lib.Library#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Address</em>'.
   * @see org.eclipse.emf.test.models.lib.Library#getAddress()
   * @see #getLibrary()
   * @generated
   */
  EReference<Library, Address> getLibrary_Address();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.test.models.lib.Library#getWriters <em>Writers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Writers</em>'.
   * @see org.eclipse.emf.test.models.lib.Library#getWriters()
   * @see #getLibrary()
   * @generated
   */
  EReference<Library, EList<Person>> getLibrary_Writers();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.test.models.lib.Library#getCafeteria <em>Cafeteria</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cafeteria</em>'.
   * @see org.eclipse.emf.test.models.lib.Library#getCafeteria()
   * @see #getLibrary()
   * @generated
   */
  EReference<Library, Cafeteria> getLibrary_Cafeteria();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.models.lib.Book <em>Book</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Book</em>'.
   * @see org.eclipse.emf.test.models.lib.Book
   * @generated
   */
  EClass<Book> getBook();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.test.models.lib.Book#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.eclipse.emf.test.models.lib.Book#getTitle()
   * @see #getBook()
   * @generated
   */
  EAttribute<Book, String> getBook_Title();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.models.lib.Address <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Address</em>'.
   * @see org.eclipse.emf.test.models.lib.Address
   * @generated
   */
  EClass<Address> getAddress();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.test.models.lib.Address#getPostalCode <em>Postal Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Postal Code</em>'.
   * @see org.eclipse.emf.test.models.lib.Address#getPostalCode()
   * @see #getAddress()
   * @generated
   */
  EAttribute<Address, String> getAddress_PostalCode();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.models.lib.Person <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Person</em>'.
   * @see org.eclipse.emf.test.models.lib.Person
   * @generated
   */
  EClass<Person> getPerson();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.test.models.lib.Person#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.test.models.lib.Person#getName()
   * @see #getPerson()
   * @generated
   */
  EAttribute<Person, String> getPerson_Name();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.emf.test.models.lib.Person#getLibrary <em>Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Library</em>'.
   * @see org.eclipse.emf.test.models.lib.Person#getLibrary()
   * @see #getPerson()
   * @generated
   */
  EReference<Person, Library> getPerson_Library();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.models.lib.Cafeteria <em>Cafeteria</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cafeteria</em>'.
   * @see org.eclipse.emf.test.models.lib.Cafeteria
   * @generated
   */
  EClass<Cafeteria> getCafeteria();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.test.models.lib.Cafeteria#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.test.models.lib.Cafeteria#getName()
   * @see #getCafeteria()
   * @generated
   */
  EAttribute<Cafeteria, String> getCafeteria_Name();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.emf.test.models.lib.Cafeteria#getLibrary <em>Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Library</em>'.
   * @see org.eclipse.emf.test.models.lib.Cafeteria#getLibrary()
   * @see #getCafeteria()
   * @generated
   */
  EReference<Cafeteria, Library> getCafeteria_Library();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LibFactory getLibFactory();

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
     * The meta object literal for the '{@link org.eclipse.emf.test.models.lib.impl.LibraryImpl <em>Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.models.lib.impl.LibraryImpl
     * @see org.eclipse.emf.test.models.lib.impl.LibPackageImpl#getLibrary()
     * @generated
     */
    EClass<Library> LIBRARY = eINSTANCE.getLibrary();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute<Library, String> LIBRARY__NAME = eINSTANCE.getLibrary_Name();

    /**
     * The meta object literal for the '<em><b>Books</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Library, EList<Book>> LIBRARY__BOOKS = eINSTANCE.getLibrary_Books();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Library, Address> LIBRARY__ADDRESS = eINSTANCE.getLibrary_Address();

    /**
     * The meta object literal for the '<em><b>Writers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Library, EList<Person>> LIBRARY__WRITERS = eINSTANCE.getLibrary_Writers();

    /**
     * The meta object literal for the '<em><b>Cafeteria</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Library, Cafeteria> LIBRARY__CAFETERIA = eINSTANCE.getLibrary_Cafeteria();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.models.lib.impl.BookImpl <em>Book</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.models.lib.impl.BookImpl
     * @see org.eclipse.emf.test.models.lib.impl.LibPackageImpl#getBook()
     * @generated
     */
    EClass<Book> BOOK = eINSTANCE.getBook();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute<Book, String> BOOK__TITLE = eINSTANCE.getBook_Title();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.models.lib.impl.AddressImpl <em>Address</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.models.lib.impl.AddressImpl
     * @see org.eclipse.emf.test.models.lib.impl.LibPackageImpl#getAddress()
     * @generated
     */
    EClass<Address> ADDRESS = eINSTANCE.getAddress();

    /**
     * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute<Address, String> ADDRESS__POSTAL_CODE = eINSTANCE.getAddress_PostalCode();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.models.lib.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.models.lib.impl.PersonImpl
     * @see org.eclipse.emf.test.models.lib.impl.LibPackageImpl#getPerson()
     * @generated
     */
    EClass<Person> PERSON = eINSTANCE.getPerson();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute<Person, String> PERSON__NAME = eINSTANCE.getPerson_Name();

    /**
     * The meta object literal for the '<em><b>Library</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Person, Library> PERSON__LIBRARY = eINSTANCE.getPerson_Library();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.models.lib.impl.CafeteriaImpl <em>Cafeteria</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.models.lib.impl.CafeteriaImpl
     * @see org.eclipse.emf.test.models.lib.impl.LibPackageImpl#getCafeteria()
     * @generated
     */
    EClass<Cafeteria> CAFETERIA = eINSTANCE.getCafeteria();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute<Cafeteria, String> CAFETERIA__NAME = eINSTANCE.getCafeteria_Name();

    /**
     * The meta object literal for the '<em><b>Library</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Cafeteria, Library> CAFETERIA__LIBRARY = eINSTANCE.getCafeteria_Library();

  }

} //LibPackage
