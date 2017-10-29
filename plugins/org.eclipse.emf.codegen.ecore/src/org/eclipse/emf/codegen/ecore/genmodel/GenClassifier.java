/**
 * Copyright (c) 2002-2009 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 */
package org.eclipse.emf.codegen.ecore.genmodel;


import org.eclipse.emf.common.util.EList;
import java.util.List;

import org.eclipse.emf.ecore.EClassifier;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Meta Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenClassifier#getGenPackage <em>Gen Package</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenClassifier#getGenTypeParameters <em>Gen Type Parameters</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage#getGenClassifier()
 * @model abstract="true"
 * @generated
 */
public interface GenClassifier extends GenBase
{
  /**
   * Returns the value of the '<em><b>Gen Package</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.emf.codegen.ecore.genmodel.GenPackage#getGenClassifiers <em>Gen Classifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gen Package</em>' reference.
   * @see org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage#getGenClassifier_GenPackage()
   * @see org.eclipse.emf.codegen.ecore.genmodel.GenPackage#getGenClassifiers
   * @model opposite="genClassifiers" resolveProxies="false" required="true" transient="true" changeable="false" volatile="true"
   * @generated
   */
  GenPackage getGenPackage();

  /**
   * Returns the value of the '<em><b>Gen Type Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.codegen.ecore.genmodel.GenTypeParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * </p>
   * @since 2.3
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gen Type Parameters</em>' containment reference list.
   * @see org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage#getGenClassifier_GenTypeParameters()
   * @model containment="true"
   * @generated
   */
  EList<GenTypeParameter> getGenTypeParameters();

  EClassifier getEcoreClassifier();
  
  /**
   * @return The imported name of the metatype, that is "EClass" or "EDataType", etc. It includes type parameters.  
   */
  String getImportedMetaType();
  
  // CHANGE: Added
  /**
   * @return The imported name of the metatype, that is "EClass" or "EDataType", etc. It excludes type parameters.  
   */
  String getRawImportedMetaType();
  
  // TODO j: getMetaType, this is unnessecary isn't is? Name never has '.' in it?
  // String getMetaType();

  String getName();
  String getClassifierAccessorName();
  String getQualifiedClassifierAccessor();

  String getSafeUncapName();
  
  /**
   * The name of the Java type which this classifier represents.
   */
  String getImportedInstanceClassName();
  
  /**
   * @since 2.3
   */
  String getRawImportedInstanceClassName();

  /**
   * @since 2.3
   */
  String getRawInstanceClassName();
  
  /**
   * @since 2.3
   */
  String getImportedParameterizedInstanceClassName();

  /**
   * The name of the Java type of instances of the model class. With wildcard type arguments (if any).
   * @since 2.3
   */
  String getImportedWildcardInstanceClassName();

  // CHANGE: Moved here from GenDataType
  /**
   * @return The class name of this gen object, with unbounted wildcard type arguments.
   */
  String getImportedWildcardObjectInstanceClassName();

  /**
   * @since 2.3
   */
  String getImportedBoundedWildcardInstanceClassName();

  /**
   * @since 2.3
   */
  boolean isUncheckedCast();

  /**
   * This returns a name like 'XSDElementDeclaration' formatted like 'XSD Element Declaration'
   */
  String getFormattedName();

  /**
   * The name of the classifier field in a generated package implementation. 
   */
  String getClassifierInstanceName();
  String getClassifierID();

  List<String> getGenConstraints();
  List<String> getAllGenConstraints();
  GenClassifier getConstraintImplementor(String constraint);
  GenClassifier getConstraintDelegate(String constraint);
  boolean hasOnlyDefaultConstraints();

  String getGeneratedInstanceClassFlag();

  /**
   * @since 2.6
   */
  boolean hasConstraintExpression(String constraint);

  /**
   * @since 2.6
   */
  String getConstraintExpression(String constraint, String indentation);

  /**
   * @since 2.6
   */
  String getValidationDelegate(String constraint);
  
  
  // CHANGE j: Added implementsEobject
  /**
   * @return Whether represtented class implements EObject. 
   */
  boolean isImplementingEobject();
}
