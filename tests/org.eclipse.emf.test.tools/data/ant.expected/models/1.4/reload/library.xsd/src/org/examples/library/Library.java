/**
 * This is my code.
 */
package org.examples.library;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.examples.library.Library#getName <em>Name</em>}</li>
 *   <li>{@link org.examples.library.Library#getSite <em>Site</em>}</li>
 *   <li>{@link org.examples.library.Library#getWriters <em>Writers</em>}</li>
 *   <li>{@link org.examples.library.Library#getBooks <em>Books</em>}</li>
 * </ul>
 *
 * @see org.examples.library.LibraryPackage#getLibrary()
 * @model extendedMetaData="name='Library' kind='elementOnly'"
 * @generated
 */
public interface Library extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.examples.library.LibraryPackage#getLibrary_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.examples.library.Library#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Site</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Site</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Site</em>' attribute.
   * @see #setSite(String)
   * @see org.examples.library.LibraryPackage#getLibrary_Site()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='site'"
   * @generated
   */
  String getSite();

  /**
   * Sets the value of the '{@link org.examples.library.Library#getSite <em>Site</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Site</em>' attribute.
   * @see #getSite()
   * @generated
   */
  void setSite(String value);

  /**
   * Returns the value of the '<em><b>Writers</b></em>' containment reference list.
   * The list contents are of type {@link org.examples.library.Writer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Writers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Writers</em>' containment reference list.
   * @see org.examples.library.LibraryPackage#getLibrary_Writers()
   * @model type="org.examples.library.Writer" containment="true"
   *        extendedMetaData="kind='element' name='writers'"
   * @generated
   */
  EList getWriters();

  /**
   * Returns the value of the '<em><b>Books</b></em>' containment reference list.
   * The list contents are of type {@link org.examples.library.Book}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Books</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Books</em>' containment reference list.
   * @see org.examples.library.LibraryPackage#getLibrary_Books()
   * @model type="org.examples.library.Book" containment="true"
   *        extendedMetaData="kind='element' name='books'"
   * @generated
   */
  EList getBooks();

} // Library
