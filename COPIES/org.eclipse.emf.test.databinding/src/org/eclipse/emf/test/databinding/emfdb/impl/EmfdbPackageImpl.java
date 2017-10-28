/**
 * Copyright (c) 2009 BestSolution and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   Tom Schindl - Initial API and implementation
 */
package org.eclipse.emf.test.databinding.emfdb.impl;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.test.databinding.emfdb.EmfdbFactory;
import org.eclipse.emf.test.databinding.emfdb.EmfdbPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmfdbPackageImpl extends EPackageImpl implements EmfdbPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.databinding.emfdb.A> aEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.databinding.emfdb.B> bEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<?> cEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.databinding.emfdb.D> dEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.databinding.emfdb.E> eEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.emf.test.databinding.emfdb.EmfdbPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EmfdbPackageImpl()
  {
    super(eNS_URI, EmfdbFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link EmfdbPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EmfdbPackage init()
  {
    if (isInited) return (EmfdbPackage)EPackage.Registry.INSTANCE.getEPackage(EmfdbPackage.eNS_URI);

  
    // Obtain or create and register package
    EmfdbPackageImpl theEmfdbPackage = (EmfdbPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EmfdbPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EmfdbPackageImpl());

    isInited = true;

  
    // Create package meta-data objects
  
    theEmfdbPackage.createPackageContents();
  
  

    // Initialize created meta-data
  
    theEmfdbPackage.initializePackageContents();
  
  

    // Mark meta-data to indicate it can't be changed
    theEmfdbPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EmfdbPackage.eNS_URI, theEmfdbPackage);
    return theEmfdbPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.databinding.emfdb.A> getA()
  {
  
    return aEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute<org.eclipse.emf.test.databinding.emfdb.A, String> getA_String()
  {
  
    return (EAttribute<org.eclipse.emf.test.databinding.emfdb.A, String>) aEClass.getEStructuralFeatures().get(0);
  
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference<org.eclipse.emf.test.databinding.emfdb.A, EList<org.eclipse.emf.test.databinding.emfdb.B>> getA_Blist()
  {
  
    return (EReference<org.eclipse.emf.test.databinding.emfdb.A, EList<org.eclipse.emf.test.databinding.emfdb.B>>) aEClass.getEStructuralFeatures().get(1);
  
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference<org.eclipse.emf.test.databinding.emfdb.A, EMap<String, String>> getA_Cmap()
  {
  
    return (EReference<org.eclipse.emf.test.databinding.emfdb.A, EMap<String, String>>) aEClass.getEStructuralFeatures().get(2);
  
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.databinding.emfdb.B> getB()
  {
  
    return bEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute<org.eclipse.emf.test.databinding.emfdb.B, String> getB_String()
  {
  
    return (EAttribute<org.eclipse.emf.test.databinding.emfdb.B, String>) bEClass.getEStructuralFeatures().get(0);
  
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference<org.eclipse.emf.test.databinding.emfdb.B, org.eclipse.emf.test.databinding.emfdb.D> getB_D()
  {
  
    return (EReference<org.eclipse.emf.test.databinding.emfdb.B, org.eclipse.emf.test.databinding.emfdb.D>) bEClass.getEStructuralFeatures().get(1);
  
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<?> getC()
  {
  
    return cEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute<?, String> getC_Key()
  {
  
    return (EAttribute<?, String>) cEClass.getEStructuralFeatures().get(0);
  
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute<?, String> getC_Value()
  {
  
    return (EAttribute<?, String>) cEClass.getEStructuralFeatures().get(1);
  
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.databinding.emfdb.D> getD()
  {
  
    return dEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference<org.eclipse.emf.test.databinding.emfdb.D, EList<org.eclipse.emf.test.databinding.emfdb.E>> getD_Elist()
  {
  
    return (EReference<org.eclipse.emf.test.databinding.emfdb.D, EList<org.eclipse.emf.test.databinding.emfdb.E>>) dEClass.getEStructuralFeatures().get(0);
  
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute<org.eclipse.emf.test.databinding.emfdb.D, String> getD_Name()
  {
  
    return (EAttribute<org.eclipse.emf.test.databinding.emfdb.D, String>) dEClass.getEStructuralFeatures().get(1);
  
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.databinding.emfdb.E> getE()
  {
  
    return eEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute<org.eclipse.emf.test.databinding.emfdb.E, String> getE_Name()
  {
  
    return (EAttribute<org.eclipse.emf.test.databinding.emfdb.E, String>) eEClass.getEStructuralFeatures().get(0);
  
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmfdbFactory getEmfdbFactory()
  {
    return (EmfdbFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;
  

    // Create classes and their features
    
    aEClass = createEClass(A);
  
    // CHANGE: Use raw type
    createEAttribute(aEClass, A__STRING);
  
    // CHANGE: Use raw type
    createEReference(aEClass, A__BLIST);
  
    // CHANGE: Use raw type
    createEReference(aEClass, A__CMAP);
  
  
  

  
    
    bEClass = createEClass(B);
  
    // CHANGE: Use raw type
    createEAttribute(bEClass, B__STRING);
  
    // CHANGE: Use raw type
    createEReference(bEClass, B__D);
  
  
  

  
    
    cEClass = createEClass(C);
  
    // CHANGE: Use raw type
    createEAttribute(cEClass, C__KEY);
  
    // CHANGE: Use raw type
    createEAttribute(cEClass, C__VALUE);
  
  
  

  
    
    dEClass = createEClass(D);
  
    // CHANGE: Use raw type
    createEReference(dEClass, D__ELIST);
  
    // CHANGE: Use raw type
    createEAttribute(dEClass, D__NAME);
  
  
  

  
    
    eEClass = createEClass(E);
  
    // CHANGE: Use raw type
    createEAttribute(eEClass, E__NAME);
  
  
  
    
  
  
  
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);
  
  
  
    

    // Create type parameters
  
    
  
    
  
    
  
    
  
    
  
    
    

    // Set bounds for type parameters
  
    
  
    
  
    
  
    
  
    
  
    

    // Add supertypes to classes
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    

    // Initialize classes and features; add operations and parameters
    
    initEClass(aEClass, org.eclipse.emf.test.databinding.emfdb.A.class, "A", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
    
    
    initEAttribute(getA_String(), ecorePackage.getEString(), "string", null, 0, 1, org.eclipse.emf.test.databinding.emfdb.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
    
    
    initEReference(getA_Blist(), this.getB(), null, "blist", null, 0, -1, org.eclipse.emf.test.databinding.emfdb.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
    
    
    initEReference(getA_Cmap(), this.getC(), null, "cmap", null, 0, -1, org.eclipse.emf.test.databinding.emfdb.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
  
  

  
    
    initEClass(bEClass, org.eclipse.emf.test.databinding.emfdb.B.class, "B", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
    
    
    initEAttribute(getB_String(), ecorePackage.getEString(), "string", null, 0, 1, org.eclipse.emf.test.databinding.emfdb.B.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
    
    
    initEReference(getB_D(), this.getD(), null, "d", null, 1, 1, org.eclipse.emf.test.databinding.emfdb.B.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
  
  

  
    
    initEClass(cEClass, Map.Entry.class, "C", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
  
    
    
    initEAttribute(getC_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
    
    initEAttribute(getC_Value(), ecorePackage.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
  
  

  
    
    initEClass(dEClass, org.eclipse.emf.test.databinding.emfdb.D.class, "D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
    
    
    
    initEReference(getD_Elist(), this.getE(), null, "elist", null, 0, -1, org.eclipse.emf.test.databinding.emfdb.D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
    
    initEAttribute(getD_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.eclipse.emf.test.databinding.emfdb.D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
  
  

  
    
    initEClass(eEClass, org.eclipse.emf.test.databinding.emfdb.E.class, "E", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
    
    
    initEAttribute(getE_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.eclipse.emf.test.databinding.emfdb.E.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
  
  
    
  
  
  
  

    // Create resource
    createResource(eNS_URI);
  
  
  }

} //EmfdbPackageImpl
