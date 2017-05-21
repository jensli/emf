/**
 * Copyright (c) 2002-2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 */
package org.eclipse.emf.ecore;



/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecore.EcorePackage
 * @generated
 */
public interface EcoreFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * @generated
   */
  EcoreFactory eINSTANCE = org.eclipse.emf.ecore.impl.EcoreFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>EObject</em>'.
	 * @generated
	 */
  EObject createEObject();

  /**
	 * Returns a new object of class '<em>EAttribute</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAttribute</em>'.
	 * @generated
	 */
  <C extends EObject, V> EAttribute<C, V> createEAttribute();

  /**
	 * Returns a new object of class '<em>EAnnotation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAnnotation</em>'.
	 * @generated
	 */
  EAnnotation createEAnnotation();

  /**
	 * Returns a new object of class '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>EClass</em>'.
	 * @generated
	 */
  <T extends EObject> EClass<T> createEClass();

  /**
	 * Returns a new object of class '<em>EData Type</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>EData Type</em>'.
	 * @generated
	 */
  <T> EDataType<T> createEDataType();

  /**
	 * Returns a new object of class '<em>EParameter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>EParameter</em>'.
	 * @generated
	 */
  <T> EParameter<T> createEParameter();

  /**
	 * Returns a new object of class '<em>EOperation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>EOperation</em>'.
	 * @generated
	 */
  <C extends EObject, V> EOperation<C, V> createEOperation();

  /**
	 * Returns a new object of class '<em>EPackage</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>EPackage</em>'.
	 * @generated
	 */
  EPackage createEPackage();

  /**
	 * Returns a new object of class '<em>EFactory</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>EFactory</em>'.
	 * @generated
	 */
  EFactory createEFactory();

  /**
	 * Returns a new object of class '<em>EEnum Literal</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEnum Literal</em>'.
	 * @generated
	 */
  EEnumLiteral createEEnumLiteral();

  /**
	 * Returns a new object of class '<em>EEnum</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEnum</em>'.
	 * @generated
	 */
  <T> EEnum<T> createEEnum();

  /**
	 * Returns a new object of class '<em>EReference</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>EReference</em>'.
	 * @generated
	 */
  <C extends EObject, V> EReference<C, V> createEReference();

  /**
	 * Returns a new object of class '<em>EGeneric Type</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>EGeneric Type</em>'.
	 * @generated
	 */
  EGenericType createEGenericType();

  /**
	 * Returns a new object of class '<em>EType Parameter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>EType Parameter</em>'.
	 * @generated
	 */
  ETypeParameter createETypeParameter();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  EcorePackage getEcorePackage();

} //EcoreFactory
