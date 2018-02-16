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
package org.eclipse.emf.test.models.ref.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.test.models.ext.ExtPackage;
import org.eclipse.emf.test.models.ext.impl.ExtPackageImpl;
import org.eclipse.emf.test.models.ref.RefFactory;
import org.eclipse.emf.test.models.ref.RefPackage;
import org.eclipse.emf.test.models.ref.unsettable.URefPackage;
import org.eclipse.emf.test.models.ref.unsettable.impl.URefPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefPackageImpl extends EPackageImpl implements RefPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.models.ref.A> aEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.models.ref.B> bEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.models.ref.C1> c1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.models.ref.C2> c2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.models.ref.C> cEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.models.ref.D> dEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.models.ref.E> eEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.models.ref.C4> c4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.models.ref.C3> c3EClass = null;

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
   * @see org.eclipse.emf.test.models.ref.RefPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RefPackageImpl()
  {
    super(eNS_URI, RefFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link RefPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RefPackage init()
  {
    if (isInited) return (RefPackage)EPackage.Registry.INSTANCE.getEPackage(RefPackage.eNS_URI);

    // Obtain or create and register package
    RefPackageImpl theRefPackage = (RefPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RefPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RefPackageImpl());

    isInited = true;

    // Obtain or create and register interdependencies
    URefPackageImpl theURefPackage = (URefPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(URefPackage.eNS_URI) instanceof URefPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(URefPackage.eNS_URI) : URefPackage.eINSTANCE);
    ExtPackageImpl theExtPackage = (ExtPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtPackage.eNS_URI) instanceof ExtPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtPackage.eNS_URI) : ExtPackage.eINSTANCE);

    // Create package meta-data objects
    theRefPackage.createPackageContents();
    theURefPackage.createPackageContents();
    theExtPackage.createPackageContents();

    // Initialize created meta-data
    theRefPackage.initializePackageContents();
    theURefPackage.initializePackageContents();
    theExtPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRefPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RefPackage.eNS_URI, theRefPackage);
    return theRefPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.models.ref.A> getA()
  {
    return aEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.A, org.eclipse.emf.test.models.ref.B> getA_B()
  {
    return (EReference<org.eclipse.emf.test.models.ref.A, org.eclipse.emf.test.models.ref.B>) aEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.A, org.eclipse.emf.test.models.ref.C2> getA_C2()
  {
    return (EReference<org.eclipse.emf.test.models.ref.A, org.eclipse.emf.test.models.ref.C2>) aEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.A, org.eclipse.emf.test.models.ref.C> getA_C()
  {
    return (EReference<org.eclipse.emf.test.models.ref.A, org.eclipse.emf.test.models.ref.C>) aEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.models.ref.B> getB()
  {
    return bEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.B, org.eclipse.emf.test.models.ref.A> getB_A()
  {
    return (EReference<org.eclipse.emf.test.models.ref.B, org.eclipse.emf.test.models.ref.A>) bEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.B, org.eclipse.emf.test.models.ref.C2> getB_C2()
  {
    return (EReference<org.eclipse.emf.test.models.ref.B, org.eclipse.emf.test.models.ref.C2>) bEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.B, EList<org.eclipse.emf.test.models.ref.D>> getB_D()
  {
    return (EReference<org.eclipse.emf.test.models.ref.B, EList<org.eclipse.emf.test.models.ref.D>>) bEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.models.ref.C1> getC1()
  {
    return c1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.C1, org.eclipse.emf.test.models.ref.A> getC1_A()
  {
    return (EReference<org.eclipse.emf.test.models.ref.C1, org.eclipse.emf.test.models.ref.A>) c1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.C1, EList<org.eclipse.emf.test.models.ref.B>> getC1_B()
  {
    return (EReference<org.eclipse.emf.test.models.ref.C1, EList<org.eclipse.emf.test.models.ref.B>>) c1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.models.ref.C2> getC2()
  {
    return c2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.C2, EList<org.eclipse.emf.test.models.ref.B>> getC2_B()
  {
    return (EReference<org.eclipse.emf.test.models.ref.C2, EList<org.eclipse.emf.test.models.ref.B>>) c2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.C2, org.eclipse.emf.test.models.ref.A> getC2_A()
  {
    return (EReference<org.eclipse.emf.test.models.ref.C2, org.eclipse.emf.test.models.ref.A>) c2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.models.ref.C> getC()
  {
    return cEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.C, EList<org.eclipse.emf.test.models.ref.D>> getC_D()
  {
    return (EReference<org.eclipse.emf.test.models.ref.C, EList<org.eclipse.emf.test.models.ref.D>>) cEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.C, org.eclipse.emf.test.models.ref.C4> getC_C4()
  {
    return (EReference<org.eclipse.emf.test.models.ref.C, org.eclipse.emf.test.models.ref.C4>) cEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.models.ref.D> getD()
  {
    return dEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.D, org.eclipse.emf.test.models.ref.C> getD_C()
  {
    return (EReference<org.eclipse.emf.test.models.ref.D, org.eclipse.emf.test.models.ref.C>) dEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.D, EList<org.eclipse.emf.test.models.ref.E>> getD_E()
  {
    return (EReference<org.eclipse.emf.test.models.ref.D, EList<org.eclipse.emf.test.models.ref.E>>) dEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.D, org.eclipse.emf.test.models.ref.C4> getD_C4()
  {
    return (EReference<org.eclipse.emf.test.models.ref.D, org.eclipse.emf.test.models.ref.C4>) dEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.models.ref.E> getE()
  {
    return eEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<org.eclipse.emf.test.models.ref.E, String> getE_Name()
  {
    return (EAttribute<org.eclipse.emf.test.models.ref.E, String>) eEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<org.eclipse.emf.test.models.ref.E, EList<String>> getE_Ids()
  {
    return (EAttribute<org.eclipse.emf.test.models.ref.E, EList<String>>) eEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<org.eclipse.emf.test.models.ref.E, EList<String>> getE_Labels()
  {
    return (EAttribute<org.eclipse.emf.test.models.ref.E, EList<String>>) eEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.E, EList<org.eclipse.emf.test.models.ref.D>> getE_D()
  {
    return (EReference<org.eclipse.emf.test.models.ref.E, EList<org.eclipse.emf.test.models.ref.D>>) eEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.models.ref.C4> getC4()
  {
    return c4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.C4, org.eclipse.emf.test.models.ref.C> getC4_C()
  {
    return (EReference<org.eclipse.emf.test.models.ref.C4, org.eclipse.emf.test.models.ref.C>) c4EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.C4, EList<org.eclipse.emf.test.models.ref.D>> getC4_D()
  {
    return (EReference<org.eclipse.emf.test.models.ref.C4, EList<org.eclipse.emf.test.models.ref.D>>) c4EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.models.ref.C3> getC3()
  {
    return c3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.C3, EList<org.eclipse.emf.test.models.ref.D>> getC3_D()
  {
    return (EReference<org.eclipse.emf.test.models.ref.C3, EList<org.eclipse.emf.test.models.ref.D>>) c3EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.C3, org.eclipse.emf.test.models.ref.C> getC3_C()
  {
    return (EReference<org.eclipse.emf.test.models.ref.C3, org.eclipse.emf.test.models.ref.C>) c3EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefFactory getRefFactory()
  {
    return (RefFactory)getEFactoryInstance();
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
  @SuppressWarnings("unchecked")
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    // CHANGE gen: Add cast
    aEClass = (EClass<org.eclipse.emf.test.models.ref.A>) createEClass(A);
    // CHANGE gen: Use raw type
    createEReference(aEClass, A__B);
    // CHANGE gen: Use raw type
    createEReference(aEClass, A__C2);
    // CHANGE gen: Use raw type
    createEReference(aEClass, A__C);

    // CHANGE gen: Add cast
    bEClass = (EClass<org.eclipse.emf.test.models.ref.B>) createEClass(B);
    // CHANGE gen: Use raw type
    createEReference(bEClass, B__A);
    // CHANGE gen: Use raw type
    createEReference(bEClass, B__C2);
    // CHANGE gen: Use raw type
    createEReference(bEClass, B__D);

    // CHANGE gen: Add cast
    c1EClass = (EClass<org.eclipse.emf.test.models.ref.C1>) createEClass(C1);
    // CHANGE gen: Use raw type
    createEReference(c1EClass, C1__A);
    // CHANGE gen: Use raw type
    createEReference(c1EClass, C1__B);

    // CHANGE gen: Add cast
    c2EClass = (EClass<org.eclipse.emf.test.models.ref.C2>) createEClass(C2);
    // CHANGE gen: Use raw type
    createEReference(c2EClass, C2__B);
    // CHANGE gen: Use raw type
    createEReference(c2EClass, C2__A);

    // CHANGE gen: Add cast
    cEClass = (EClass<org.eclipse.emf.test.models.ref.C>) createEClass(C);
    // CHANGE gen: Use raw type
    createEReference(cEClass, C__D);
    // CHANGE gen: Use raw type
    createEReference(cEClass, C__C4);

    // CHANGE gen: Add cast
    dEClass = (EClass<org.eclipse.emf.test.models.ref.D>) createEClass(D);
    // CHANGE gen: Use raw type
    createEReference(dEClass, D__C);
    // CHANGE gen: Use raw type
    createEReference(dEClass, D__E);
    // CHANGE gen: Use raw type
    createEReference(dEClass, D__C4);

    // CHANGE gen: Add cast
    eEClass = (EClass<org.eclipse.emf.test.models.ref.E>) createEClass(E);
    // CHANGE gen: Use raw type
    createEAttribute(eEClass, E__NAME);
    // CHANGE gen: Use raw type
    createEAttribute(eEClass, E__IDS);
    // CHANGE gen: Use raw type
    createEAttribute(eEClass, E__LABELS);
    // CHANGE gen: Use raw type
    createEReference(eEClass, E__D);

    // CHANGE gen: Add cast
    c4EClass = (EClass<org.eclipse.emf.test.models.ref.C4>) createEClass(C4);
    // CHANGE gen: Use raw type
    createEReference(c4EClass, C4__C);
    // CHANGE gen: Use raw type
    createEReference(c4EClass, C4__D);

    // CHANGE gen: Add cast
    c3EClass = (EClass<org.eclipse.emf.test.models.ref.C3>) createEClass(C3);
    // CHANGE gen: Use raw type
    createEReference(c3EClass, C3__D);
    // CHANGE gen: Use raw type
    createEReference(c3EClass, C3__C);
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

    // Obtain other dependent packages
    URefPackage theURefPackage = (URefPackage)EPackage.Registry.INSTANCE.getEPackage(URefPackage.eNS_URI);

    // Add subpackages
    getESubpackages().add(theURefPackage);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(aEClass, org.eclipse.emf.test.models.ref.A.class, "A", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getA_B(), this.getB(), this.getB_A(), "b", null, 1, 1, org.eclipse.emf.test.models.ref.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getA_C2(), this.getC2(), this.getC2_A(), "c2", null, 0, 1, org.eclipse.emf.test.models.ref.A.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getA_C(), this.getC(), null, "c", null, 1, 1, org.eclipse.emf.test.models.ref.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bEClass, org.eclipse.emf.test.models.ref.B.class, "B", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getB_A(), this.getA(), this.getA_B(), "a", null, 1, 1, org.eclipse.emf.test.models.ref.B.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getB_C2(), this.getC2(), this.getC2_B(), "c2", null, 0, 1, org.eclipse.emf.test.models.ref.B.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getB_D(), this.getD(), null, "d", null, 0, -1, org.eclipse.emf.test.models.ref.B.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(c1EClass, org.eclipse.emf.test.models.ref.C1.class, "C1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getC1_A(), this.getA(), null, "a", null, 1, 1, org.eclipse.emf.test.models.ref.C1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getC1_B(), this.getB(), null, "b", null, 0, -1, org.eclipse.emf.test.models.ref.C1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(c2EClass, org.eclipse.emf.test.models.ref.C2.class, "C2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getC2_B(), this.getB(), this.getB_C2(), "b", null, 0, -1, org.eclipse.emf.test.models.ref.C2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getC2_A(), this.getA(), this.getA_C2(), "a", null, 1, 1, org.eclipse.emf.test.models.ref.C2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cEClass, org.eclipse.emf.test.models.ref.C.class, "C", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getC_D(), this.getD(), this.getD_C(), "d", null, 0, -1, org.eclipse.emf.test.models.ref.C.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getC_C4(), this.getC4(), this.getC4_C(), "c4", null, 0, 1, org.eclipse.emf.test.models.ref.C.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dEClass, org.eclipse.emf.test.models.ref.D.class, "D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getD_C(), this.getC(), this.getC_D(), "c", null, 1, 1, org.eclipse.emf.test.models.ref.D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getD_E(), this.getE(), this.getE_D(), "e", null, 0, -1, org.eclipse.emf.test.models.ref.D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getD_C4(), this.getC4(), this.getC4_D(), "c4", null, 0, 1, org.eclipse.emf.test.models.ref.D.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eEClass, org.eclipse.emf.test.models.ref.E.class, "E", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getE_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.eclipse.emf.test.models.ref.E.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getE_Ids(), ecorePackage.getEString(), "ids", null, 0, -1, org.eclipse.emf.test.models.ref.E.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getE_Labels(), ecorePackage.getEString(), "labels", null, 0, -1, org.eclipse.emf.test.models.ref.E.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getE_D(), this.getD(), this.getD_E(), "d", null, 0, -1, org.eclipse.emf.test.models.ref.E.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(c4EClass, org.eclipse.emf.test.models.ref.C4.class, "C4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getC4_C(), this.getC(), this.getC_C4(), "c", null, 1, 1, org.eclipse.emf.test.models.ref.C4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getC4_D(), this.getD(), this.getD_C4(), "d", null, 0, -1, org.eclipse.emf.test.models.ref.C4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(c3EClass, org.eclipse.emf.test.models.ref.C3.class, "C3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getC3_D(), this.getD(), null, "d", null, 0, -1, org.eclipse.emf.test.models.ref.C3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getC3_C(), this.getC(), null, "c", null, 1, 1, org.eclipse.emf.test.models.ref.C3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //RefPackageImpl
