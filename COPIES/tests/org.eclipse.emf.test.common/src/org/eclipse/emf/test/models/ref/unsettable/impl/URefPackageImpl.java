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
package org.eclipse.emf.test.models.ref.unsettable.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.test.models.ext.ExtPackage;
import org.eclipse.emf.test.models.ext.impl.ExtPackageImpl;
import org.eclipse.emf.test.models.ref.RefPackage;
import org.eclipse.emf.test.models.ref.impl.RefPackageImpl;
import org.eclipse.emf.test.models.ref.unsettable.URefFactory;
import org.eclipse.emf.test.models.ref.unsettable.URefPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class URefPackageImpl extends EPackageImpl implements URefPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.models.ref.unsettable.C1U> c1UEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.models.ref.unsettable.C2U> c2UEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.models.ref.unsettable.AU> auEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.models.ref.unsettable.BU> buEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.models.ref.unsettable.CU> cuEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.models.ref.unsettable.DU> duEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.models.ref.unsettable.C4U> c4UEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.models.ref.unsettable.C3U> c3UEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.models.ref.unsettable.EU> euEClass = null;

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
   * @see org.eclipse.emf.test.models.ref.unsettable.URefPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private URefPackageImpl()
  {
    super(eNS_URI, URefFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link URefPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static URefPackage init()
  {
    if (isInited) return (URefPackage)EPackage.Registry.INSTANCE.getEPackage(URefPackage.eNS_URI);

    // Obtain or create and register package
    URefPackageImpl theURefPackage = (URefPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof URefPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new URefPackageImpl());

    isInited = true;

    // Obtain or create and register interdependencies
    RefPackageImpl theRefPackage = (RefPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RefPackage.eNS_URI) instanceof RefPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RefPackage.eNS_URI) : RefPackage.eINSTANCE);
    ExtPackageImpl theExtPackage = (ExtPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtPackage.eNS_URI) instanceof ExtPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtPackage.eNS_URI) : ExtPackage.eINSTANCE);

    // Create package meta-data objects
    theURefPackage.createPackageContents();
    theRefPackage.createPackageContents();
    theExtPackage.createPackageContents();

    // Initialize created meta-data
    theURefPackage.initializePackageContents();
    theRefPackage.initializePackageContents();
    theExtPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theURefPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(URefPackage.eNS_URI, theURefPackage);
    return theURefPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.models.ref.unsettable.C1U> getC1U()
  {
    return c1UEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.unsettable.C1U, org.eclipse.emf.test.models.ref.unsettable.AU> getC1U_Au()
  {
    return (EReference<org.eclipse.emf.test.models.ref.unsettable.C1U, org.eclipse.emf.test.models.ref.unsettable.AU>) c1UEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.unsettable.C1U, EList<org.eclipse.emf.test.models.ref.unsettable.BU>> getC1U_Bu()
  {
    return (EReference<org.eclipse.emf.test.models.ref.unsettable.C1U, EList<org.eclipse.emf.test.models.ref.unsettable.BU>>) c1UEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.models.ref.unsettable.C2U> getC2U()
  {
    return c2UEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.unsettable.C2U, org.eclipse.emf.test.models.ref.unsettable.AU> getC2U_Au()
  {
    return (EReference<org.eclipse.emf.test.models.ref.unsettable.C2U, org.eclipse.emf.test.models.ref.unsettable.AU>) c2UEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.unsettable.C2U, EList<org.eclipse.emf.test.models.ref.unsettable.BU>> getC2U_Bu()
  {
    return (EReference<org.eclipse.emf.test.models.ref.unsettable.C2U, EList<org.eclipse.emf.test.models.ref.unsettable.BU>>) c2UEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.models.ref.unsettable.AU> getAU()
  {
    return auEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.unsettable.AU, org.eclipse.emf.test.models.ref.unsettable.BU> getAU_Bu()
  {
    return (EReference<org.eclipse.emf.test.models.ref.unsettable.AU, org.eclipse.emf.test.models.ref.unsettable.BU>) auEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.unsettable.AU, org.eclipse.emf.test.models.ref.unsettable.C2U> getAU_C2u()
  {
    return (EReference<org.eclipse.emf.test.models.ref.unsettable.AU, org.eclipse.emf.test.models.ref.unsettable.C2U>) auEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.unsettable.AU, org.eclipse.emf.test.models.ref.unsettable.CU> getAU_Cu()
  {
    return (EReference<org.eclipse.emf.test.models.ref.unsettable.AU, org.eclipse.emf.test.models.ref.unsettable.CU>) auEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.models.ref.unsettable.BU> getBU()
  {
    return buEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.unsettable.BU, org.eclipse.emf.test.models.ref.unsettable.AU> getBU_Au()
  {
    return (EReference<org.eclipse.emf.test.models.ref.unsettable.BU, org.eclipse.emf.test.models.ref.unsettable.AU>) buEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.unsettable.BU, org.eclipse.emf.test.models.ref.unsettable.C2U> getBU_C2u()
  {
    return (EReference<org.eclipse.emf.test.models.ref.unsettable.BU, org.eclipse.emf.test.models.ref.unsettable.C2U>) buEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.unsettable.BU, EList<org.eclipse.emf.test.models.ref.unsettable.DU>> getBU_Du()
  {
    return (EReference<org.eclipse.emf.test.models.ref.unsettable.BU, EList<org.eclipse.emf.test.models.ref.unsettable.DU>>) buEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.models.ref.unsettable.CU> getCU()
  {
    return cuEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.unsettable.CU, EList<org.eclipse.emf.test.models.ref.unsettable.DU>> getCU_Du()
  {
    return (EReference<org.eclipse.emf.test.models.ref.unsettable.CU, EList<org.eclipse.emf.test.models.ref.unsettable.DU>>) cuEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.unsettable.CU, org.eclipse.emf.test.models.ref.unsettable.C4U> getCU_C4u()
  {
    return (EReference<org.eclipse.emf.test.models.ref.unsettable.CU, org.eclipse.emf.test.models.ref.unsettable.C4U>) cuEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.models.ref.unsettable.DU> getDU()
  {
    return duEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.unsettable.DU, org.eclipse.emf.test.models.ref.unsettable.CU> getDU_Cu()
  {
    return (EReference<org.eclipse.emf.test.models.ref.unsettable.DU, org.eclipse.emf.test.models.ref.unsettable.CU>) duEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.unsettable.DU, org.eclipse.emf.test.models.ref.unsettable.C4U> getDU_C4u()
  {
    return (EReference<org.eclipse.emf.test.models.ref.unsettable.DU, org.eclipse.emf.test.models.ref.unsettable.C4U>) duEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.unsettable.DU, EList<org.eclipse.emf.test.models.ref.unsettable.EU>> getDU_Eu()
  {
    return (EReference<org.eclipse.emf.test.models.ref.unsettable.DU, EList<org.eclipse.emf.test.models.ref.unsettable.EU>>) duEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.models.ref.unsettable.C4U> getC4U()
  {
    return c4UEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.unsettable.C4U, org.eclipse.emf.test.models.ref.unsettable.CU> getC4U_Cu()
  {
    return (EReference<org.eclipse.emf.test.models.ref.unsettable.C4U, org.eclipse.emf.test.models.ref.unsettable.CU>) c4UEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.unsettable.C4U, EList<org.eclipse.emf.test.models.ref.unsettable.DU>> getC4U_Du()
  {
    return (EReference<org.eclipse.emf.test.models.ref.unsettable.C4U, EList<org.eclipse.emf.test.models.ref.unsettable.DU>>) c4UEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.models.ref.unsettable.C3U> getC3U()
  {
    return c3UEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.unsettable.C3U, org.eclipse.emf.test.models.ref.unsettable.CU> getC3U_Cu()
  {
    return (EReference<org.eclipse.emf.test.models.ref.unsettable.C3U, org.eclipse.emf.test.models.ref.unsettable.CU>) c3UEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.unsettable.C3U, EList<org.eclipse.emf.test.models.ref.unsettable.DU>> getC3U_Du()
  {
    return (EReference<org.eclipse.emf.test.models.ref.unsettable.C3U, EList<org.eclipse.emf.test.models.ref.unsettable.DU>>) c3UEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.models.ref.unsettable.EU> getEU()
  {
    return euEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<org.eclipse.emf.test.models.ref.unsettable.EU, String> getEU_Name()
  {
    return (EAttribute<org.eclipse.emf.test.models.ref.unsettable.EU, String>) euEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<org.eclipse.emf.test.models.ref.unsettable.EU, EList<String>> getEU_Ids()
  {
    return (EAttribute<org.eclipse.emf.test.models.ref.unsettable.EU, EList<String>>) euEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<org.eclipse.emf.test.models.ref.unsettable.EU, EList<String>> getEU_Labels()
  {
    return (EAttribute<org.eclipse.emf.test.models.ref.unsettable.EU, EList<String>>) euEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<org.eclipse.emf.test.models.ref.unsettable.EU, EList<org.eclipse.emf.test.models.ref.unsettable.DU>> getEU_Du()
  {
    return (EReference<org.eclipse.emf.test.models.ref.unsettable.EU, EList<org.eclipse.emf.test.models.ref.unsettable.DU>>) euEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public URefFactory getURefFactory()
  {
    return (URefFactory)getEFactoryInstance();
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
    c1UEClass = (EClass<org.eclipse.emf.test.models.ref.unsettable.C1U>) createEClass(C1U);
    // CHANGE gen: Use raw type
    createEReference(c1UEClass, C1U__AU);
    // CHANGE gen: Use raw type
    createEReference(c1UEClass, C1U__BU);

    // CHANGE gen: Add cast
    c2UEClass = (EClass<org.eclipse.emf.test.models.ref.unsettable.C2U>) createEClass(C2U);
    // CHANGE gen: Use raw type
    createEReference(c2UEClass, C2U__AU);
    // CHANGE gen: Use raw type
    createEReference(c2UEClass, C2U__BU);

    // CHANGE gen: Add cast
    auEClass = (EClass<org.eclipse.emf.test.models.ref.unsettable.AU>) createEClass(AU);
    // CHANGE gen: Use raw type
    createEReference(auEClass, AU__BU);
    // CHANGE gen: Use raw type
    createEReference(auEClass, AU__C2U);
    // CHANGE gen: Use raw type
    createEReference(auEClass, AU__CU);

    // CHANGE gen: Add cast
    buEClass = (EClass<org.eclipse.emf.test.models.ref.unsettable.BU>) createEClass(BU);
    // CHANGE gen: Use raw type
    createEReference(buEClass, BU__AU);
    // CHANGE gen: Use raw type
    createEReference(buEClass, BU__C2U);
    // CHANGE gen: Use raw type
    createEReference(buEClass, BU__DU);

    // CHANGE gen: Add cast
    cuEClass = (EClass<org.eclipse.emf.test.models.ref.unsettable.CU>) createEClass(CU);
    // CHANGE gen: Use raw type
    createEReference(cuEClass, CU__DU);
    // CHANGE gen: Use raw type
    createEReference(cuEClass, CU__C4U);

    // CHANGE gen: Add cast
    duEClass = (EClass<org.eclipse.emf.test.models.ref.unsettable.DU>) createEClass(DU);
    // CHANGE gen: Use raw type
    createEReference(duEClass, DU__CU);
    // CHANGE gen: Use raw type
    createEReference(duEClass, DU__C4U);
    // CHANGE gen: Use raw type
    createEReference(duEClass, DU__EU);

    // CHANGE gen: Add cast
    c4UEClass = (EClass<org.eclipse.emf.test.models.ref.unsettable.C4U>) createEClass(C4U);
    // CHANGE gen: Use raw type
    createEReference(c4UEClass, C4U__CU);
    // CHANGE gen: Use raw type
    createEReference(c4UEClass, C4U__DU);

    // CHANGE gen: Add cast
    c3UEClass = (EClass<org.eclipse.emf.test.models.ref.unsettable.C3U>) createEClass(C3U);
    // CHANGE gen: Use raw type
    createEReference(c3UEClass, C3U__CU);
    // CHANGE gen: Use raw type
    createEReference(c3UEClass, C3U__DU);

    // CHANGE gen: Add cast
    euEClass = (EClass<org.eclipse.emf.test.models.ref.unsettable.EU>) createEClass(EU);
    // CHANGE gen: Use raw type
    createEAttribute(euEClass, EU__NAME);
    // CHANGE gen: Use raw type
    createEAttribute(euEClass, EU__IDS);
    // CHANGE gen: Use raw type
    createEAttribute(euEClass, EU__LABELS);
    // CHANGE gen: Use raw type
    createEReference(euEClass, EU__DU);
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
    initEClass(c1UEClass, org.eclipse.emf.test.models.ref.unsettable.C1U.class, "C1U", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getC1U_Au(), this.getAU(), null, "au", null, 1, 1, org.eclipse.emf.test.models.ref.unsettable.C1U.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getC1U_Bu(), this.getBU(), null, "bu", null, 0, -1, org.eclipse.emf.test.models.ref.unsettable.C1U.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(c2UEClass, org.eclipse.emf.test.models.ref.unsettable.C2U.class, "C2U", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getC2U_Au(), this.getAU(), this.getAU_C2u(), "au", null, 1, 1, org.eclipse.emf.test.models.ref.unsettable.C2U.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getC2U_Bu(), this.getBU(), this.getBU_C2u(), "bu", null, 0, -1, org.eclipse.emf.test.models.ref.unsettable.C2U.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(auEClass, org.eclipse.emf.test.models.ref.unsettable.AU.class, "AU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAU_Bu(), this.getBU(), this.getBU_Au(), "bu", null, 1, 1, org.eclipse.emf.test.models.ref.unsettable.AU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAU_C2u(), this.getC2U(), this.getC2U_Au(), "c2u", null, 0, 1, org.eclipse.emf.test.models.ref.unsettable.AU.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAU_Cu(), this.getCU(), null, "cu", null, 0, 1, org.eclipse.emf.test.models.ref.unsettable.AU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buEClass, org.eclipse.emf.test.models.ref.unsettable.BU.class, "BU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBU_Au(), this.getAU(), this.getAU_Bu(), "au", null, 1, 1, org.eclipse.emf.test.models.ref.unsettable.BU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBU_C2u(), this.getC2U(), this.getC2U_Bu(), "c2u", null, 0, 1, org.eclipse.emf.test.models.ref.unsettable.BU.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBU_Du(), this.getDU(), null, "du", null, 0, -1, org.eclipse.emf.test.models.ref.unsettable.BU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cuEClass, org.eclipse.emf.test.models.ref.unsettable.CU.class, "CU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCU_Du(), this.getDU(), this.getDU_Cu(), "du", null, 0, -1, org.eclipse.emf.test.models.ref.unsettable.CU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCU_C4u(), this.getC4U(), this.getC4U_Cu(), "c4u", null, 0, 1, org.eclipse.emf.test.models.ref.unsettable.CU.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(duEClass, org.eclipse.emf.test.models.ref.unsettable.DU.class, "DU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDU_Cu(), this.getCU(), this.getCU_Du(), "cu", null, 1, 1, org.eclipse.emf.test.models.ref.unsettable.DU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDU_C4u(), this.getC4U(), this.getC4U_Du(), "c4u", null, 0, 1, org.eclipse.emf.test.models.ref.unsettable.DU.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDU_Eu(), this.getEU(), this.getEU_Du(), "eu", null, 0, -1, org.eclipse.emf.test.models.ref.unsettable.DU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(c4UEClass, org.eclipse.emf.test.models.ref.unsettable.C4U.class, "C4U", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getC4U_Cu(), this.getCU(), this.getCU_C4u(), "cu", null, 1, 1, org.eclipse.emf.test.models.ref.unsettable.C4U.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getC4U_Du(), this.getDU(), this.getDU_C4u(), "du", null, 0, -1, org.eclipse.emf.test.models.ref.unsettable.C4U.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(c3UEClass, org.eclipse.emf.test.models.ref.unsettable.C3U.class, "C3U", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getC3U_Cu(), this.getCU(), null, "cu", null, 1, 1, org.eclipse.emf.test.models.ref.unsettable.C3U.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getC3U_Du(), this.getDU(), null, "du", null, 0, -1, org.eclipse.emf.test.models.ref.unsettable.C3U.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(euEClass, org.eclipse.emf.test.models.ref.unsettable.EU.class, "EU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEU_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.eclipse.emf.test.models.ref.unsettable.EU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEU_Ids(), ecorePackage.getEString(), "ids", null, 0, -1, org.eclipse.emf.test.models.ref.unsettable.EU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEU_Labels(), ecorePackage.getEString(), "labels", null, 0, -1, org.eclipse.emf.test.models.ref.unsettable.EU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEU_Du(), this.getDU(), this.getDU_Eu(), "du", null, 0, -1, org.eclipse.emf.test.models.ref.unsettable.EU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  }

} //URefPackageImpl
