/**
 * Copyright (c) 2013 Eclipse contributors and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.emf.test.common.reification.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.test.common.reification.Bidirectional;
import org.eclipse.emf.test.common.reification.BoundedGenericContainer;
import org.eclipse.emf.test.common.reification.BoundedTListKeyValuePair;
import org.eclipse.emf.test.common.reification.High;
import org.eclipse.emf.test.common.reification.HighBoundedContainer;
import org.eclipse.emf.test.common.reification.HighListKeyValuePair;
import org.eclipse.emf.test.common.reification.IntegerListKeyValuePair;
import org.eclipse.emf.test.common.reification.KeyValuePair;
import org.eclipse.emf.test.common.reification.KeyValuePairContainer;
import org.eclipse.emf.test.common.reification.Link;
import org.eclipse.emf.test.common.reification.LinkItem;
import org.eclipse.emf.test.common.reification.Low;
import org.eclipse.emf.test.common.reification.Medium;
import org.eclipse.emf.test.common.reification.MediumBidirectional;
import org.eclipse.emf.test.common.reification.MediumLink;
import org.eclipse.emf.test.common.reification.MediumUnboundedContainer;
import org.eclipse.emf.test.common.reification.RawKeyValuePair;
import org.eclipse.emf.test.common.reification.RawLink;
import org.eclipse.emf.test.common.reification.RawUnboundedContainer;
import org.eclipse.emf.test.common.reification.ReificationFactory;
import org.eclipse.emf.test.common.reification.ReificationPackage;
import org.eclipse.emf.test.common.reification.Root;
import org.eclipse.emf.test.common.reification.StringListKeyValuePair;
import org.eclipse.emf.test.common.reification.StringListKeyValuePairContainer;
import org.eclipse.emf.test.common.reification.TListKeyValuePair;
import org.eclipse.emf.test.common.reification.UnboundedGenericContainer;
import org.eclipse.emf.test.common.reification.VeryHigh;
import org.eclipse.emf.test.common.reification.VeryLow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReificationPackageImpl extends EPackageImpl implements ReificationPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<Root> rootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<VeryLow> veryLowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<Low> lowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<Medium> mediumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<High> highEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<VeryHigh> veryHighEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<org.eclipse.emf.test.common.reification.Container> containerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<UnboundedGenericContainer<?>> unboundedGenericContainerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<RawUnboundedContainer> rawUnboundedContainerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<MediumUnboundedContainer> mediumUnboundedContainerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<BoundedGenericContainer<?>> boundedGenericContainerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<HighBoundedContainer> highBoundedContainerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<KeyValuePair<?, ?>> keyValuePairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<RawKeyValuePair> rawKeyValuePairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<StringListKeyValuePair> stringListKeyValuePairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<TListKeyValuePair<?>> tListKeyValuePairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<BoundedTListKeyValuePair<?>> boundedTListKeyValuePairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<HighListKeyValuePair> highListKeyValuePairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<IntegerListKeyValuePair> integerListKeyValuePairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<KeyValuePairContainer<?, ?>> keyValuePairContainerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<StringListKeyValuePairContainer> stringListKeyValuePairContainerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<Bidirectional<?>> bidirectionalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<Link> linkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<RawLink> rawLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<LinkItem> linkItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<MediumBidirectional<?>> mediumBidirectionalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass<MediumLink> mediumLinkEClass = null;

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
   * @see org.eclipse.emf.test.common.reification.ReificationPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ReificationPackageImpl()
  {
    super(eNS_URI, ReificationFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ReificationPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ReificationPackage init()
  {
    if (isInited) return (ReificationPackage)EPackage.Registry.INSTANCE.getEPackage(ReificationPackage.eNS_URI);

    // Obtain or create and register package
    ReificationPackageImpl theReificationPackage = (ReificationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ReificationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ReificationPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theReificationPackage.createPackageContents();

    // Initialize created meta-data
    theReificationPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theReificationPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ReificationPackage.eNS_URI, theReificationPackage);
    return theReificationPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<Root> getRoot()
  {
    return rootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<Root, String> getRoot_Name()
  {
    return (EAttribute<Root, String>) rootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<Root, org.eclipse.emf.test.common.reification.Container> getRoot_Container()
  {
    return (EReference<Root, org.eclipse.emf.test.common.reification.Container>) rootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<Root, UnboundedGenericContainer> getRoot_UnboundedGenericContainerWithRawType()
  {
    return (EReference<Root, UnboundedGenericContainer>) rootEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<Root, UnboundedGenericContainer<?>> getRoot_UnboundedGenericContainerWithWildcard()
  {
    return (EReference<Root, UnboundedGenericContainer<?>>) rootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<Root, UnboundedGenericContainer<? super Medium>> getRoot_UnboundedGenericContainerWithSuper()
  {
    return (EReference<Root, UnboundedGenericContainer<? super Medium>>) rootEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<Root, UnboundedGenericContainer<? extends Medium>> getRoot_UnboundedGenericContainerWithExtends()
  {
    return (EReference<Root, UnboundedGenericContainer<? extends Medium>>) rootEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<Root, BoundedGenericContainer> getRoot_BoundedGenericContainerWithRawType()
  {
    return (EReference<Root, BoundedGenericContainer>) rootEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<Root, BoundedGenericContainer<?>> getRoot_BoundedGenericContainerWithWildcard()
  {
    return (EReference<Root, BoundedGenericContainer<?>>) rootEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<Root, BoundedGenericContainer<? super Medium>> getRoot_BoundedGenericContainerWithSuper()
  {
    return (EReference<Root, BoundedGenericContainer<? super Medium>>) rootEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<Root, BoundedGenericContainer<? extends Medium>> getRoot_BoundedGenericContainerWithExtends()
  {
    return (EReference<Root, BoundedGenericContainer<? extends Medium>>) rootEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<VeryLow> getVeryLow()
  {
    return veryLowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<Low> getLow()
  {
    return lowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<Medium> getMedium()
  {
    return mediumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<High> getHigh()
  {
    return highEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<VeryHigh> getVeryHigh()
  {
    return veryHighEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<org.eclipse.emf.test.common.reification.Container> getContainer()
  {
    return containerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<UnboundedGenericContainer<?>> getUnboundedGenericContainer()
  {
    return unboundedGenericContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<UnboundedGenericContainer<?>, ?> getUnboundedGenericContainer_Content()
  {
    return (EReference<UnboundedGenericContainer<?>, ?>) unboundedGenericContainerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<RawUnboundedContainer> getRawUnboundedContainer()
  {
    return rawUnboundedContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<MediumUnboundedContainer> getMediumUnboundedContainer()
  {
    return mediumUnboundedContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<BoundedGenericContainer<?>> getBoundedGenericContainer()
  {
    return boundedGenericContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<BoundedGenericContainer<?>, ?> getBoundedGenericContainer_Content()
  {
    return (EReference<BoundedGenericContainer<?>, ?>) boundedGenericContainerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<HighBoundedContainer> getHighBoundedContainer()
  {
    return highBoundedContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<KeyValuePair<?, ?>> getKeyValuePair()
  {
    return keyValuePairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EAttribute<KeyValuePair<?, ?>, ?> getKeyValuePair_Key()
  {
    return (EAttribute<KeyValuePair<?, ?>, ?>) keyValuePairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<KeyValuePair<?, ?>, ?> getKeyValuePair_Value()
  {
    return (EReference<KeyValuePair<?, ?>, ?>) keyValuePairEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<RawKeyValuePair> getRawKeyValuePair()
  {
    return rawKeyValuePairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<StringListKeyValuePair> getStringListKeyValuePair()
  {
    return stringListKeyValuePairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<TListKeyValuePair<?>> getTListKeyValuePair()
  {
    return tListKeyValuePairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<BoundedTListKeyValuePair<?>> getBoundedTListKeyValuePair()
  {
    return boundedTListKeyValuePairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<HighListKeyValuePair> getHighListKeyValuePair()
  {
    return highListKeyValuePairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<IntegerListKeyValuePair> getIntegerListKeyValuePair()
  {
    return integerListKeyValuePairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<KeyValuePairContainer<?, ?>> getKeyValuePairContainer()
  {
    return keyValuePairContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<KeyValuePairContainer<?, ?>, EList<KeyValuePair<?, ?>>> getKeyValuePairContainer_KeyValuePairs()
  {
    return (EReference<KeyValuePairContainer<?, ?>, EList<KeyValuePair<?, ?>>>) keyValuePairContainerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<StringListKeyValuePairContainer> getStringListKeyValuePairContainer()
  {
    return stringListKeyValuePairContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<Bidirectional<?>> getBidirectional()
  {
    return bidirectionalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<Bidirectional<?>, ?> getBidirectional_In()
  {
    return (EReference<Bidirectional<?>, ?>) bidirectionalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<Bidirectional<?>, ?> getBidirectional_Out()
  {
    return (EReference<Bidirectional<?>, ?>) bidirectionalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<Bidirectional<?>, ?> getBidirectional_Value()
  {
    return (EReference<Bidirectional<?>, ?>) bidirectionalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<Bidirectional<?>, EList<?>> getBidirectional_Values()
  {
    return (EReference<Bidirectional<?>, EList<?>>) bidirectionalEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<Link> getLink()
  {
    return linkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<RawLink> getRawLink()
  {
    return rawLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<LinkItem> getLinkItem()
  {
    return linkItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<MediumBidirectional<?>> getMediumBidirectional()
  {
    return mediumBidirectionalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EReference<MediumBidirectional<?>, EList<MediumBidirectional<?>>> getMediumBidirectional_Contents()
  {
    return (EReference<MediumBidirectional<?>, EList<MediumBidirectional<?>>>) mediumBidirectionalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass<MediumLink> getMediumLink()
  {
    return mediumLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReificationFactory getReificationFactory()
  {
    return (ReificationFactory)getEFactoryInstance();
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
    rootEClass = (EClass<Root>) createEClass(ROOT);
    // CHANGE gen: Use raw type
    createEAttribute(rootEClass, ROOT__NAME);
    // CHANGE gen: Use raw type
    createEReference(rootEClass, ROOT__CONTAINER);
    // CHANGE gen: Use raw type
    createEReference(rootEClass, ROOT__UNBOUNDED_GENERIC_CONTAINER_WITH_RAW_TYPE);
    // CHANGE gen: Use raw type
    createEReference(rootEClass, ROOT__UNBOUNDED_GENERIC_CONTAINER_WITH_WILDCARD);
    // CHANGE gen: Use raw type
    createEReference(rootEClass, ROOT__UNBOUNDED_GENERIC_CONTAINER_WITH_SUPER);
    // CHANGE gen: Use raw type
    createEReference(rootEClass, ROOT__UNBOUNDED_GENERIC_CONTAINER_WITH_EXTENDS);
    // CHANGE gen: Use raw type
    createEReference(rootEClass, ROOT__BOUNDED_GENERIC_CONTAINER_WITH_RAW_TYPE);
    // CHANGE gen: Use raw type
    createEReference(rootEClass, ROOT__BOUNDED_GENERIC_CONTAINER_WITH_WILDCARD);
    // CHANGE gen: Use raw type
    createEReference(rootEClass, ROOT__BOUNDED_GENERIC_CONTAINER_WITH_SUPER);
    // CHANGE gen: Use raw type
    createEReference(rootEClass, ROOT__BOUNDED_GENERIC_CONTAINER_WITH_EXTENDS);

    // CHANGE gen: Add cast
    veryLowEClass = (EClass<VeryLow>) createEClass(VERY_LOW);

    // CHANGE gen: Add cast
    lowEClass = (EClass<Low>) createEClass(LOW);

    // CHANGE gen: Add cast
    mediumEClass = (EClass<Medium>) createEClass(MEDIUM);

    // CHANGE gen: Add cast
    highEClass = (EClass<High>) createEClass(HIGH);

    // CHANGE gen: Add cast
    veryHighEClass = (EClass<VeryHigh>) createEClass(VERY_HIGH);

    // CHANGE gen: Add cast
    containerEClass = (EClass<org.eclipse.emf.test.common.reification.Container>) createEClass(CONTAINER);

    // CHANGE gen: Add cast
    unboundedGenericContainerEClass = (EClass<UnboundedGenericContainer<?>>) createEClass(UNBOUNDED_GENERIC_CONTAINER);
    // CHANGE gen: Use raw type
    createEReference(unboundedGenericContainerEClass, UNBOUNDED_GENERIC_CONTAINER__CONTENT);

    // CHANGE gen: Add cast
    rawUnboundedContainerEClass = (EClass<RawUnboundedContainer>) createEClass(RAW_UNBOUNDED_CONTAINER);

    // CHANGE gen: Add cast
    mediumUnboundedContainerEClass = (EClass<MediumUnboundedContainer>) createEClass(MEDIUM_UNBOUNDED_CONTAINER);

    // CHANGE gen: Add cast
    boundedGenericContainerEClass = (EClass<BoundedGenericContainer<?>>) createEClass(BOUNDED_GENERIC_CONTAINER);
    // CHANGE gen: Use raw type
    createEReference(boundedGenericContainerEClass, BOUNDED_GENERIC_CONTAINER__CONTENT);

    // CHANGE gen: Add cast
    highBoundedContainerEClass = (EClass<HighBoundedContainer>) createEClass(HIGH_BOUNDED_CONTAINER);

    // CHANGE gen: Add cast
    keyValuePairEClass = (EClass<KeyValuePair<?, ?>>) createEClass(KEY_VALUE_PAIR);
    // CHANGE gen: Use raw type
    createEAttribute(keyValuePairEClass, KEY_VALUE_PAIR__KEY);
    // CHANGE gen: Use raw type
    createEReference(keyValuePairEClass, KEY_VALUE_PAIR__VALUE);

    // CHANGE gen: Add cast
    rawKeyValuePairEClass = (EClass<RawKeyValuePair>) createEClass(RAW_KEY_VALUE_PAIR);

    // CHANGE gen: Add cast
    stringListKeyValuePairEClass = (EClass<StringListKeyValuePair>) createEClass(STRING_LIST_KEY_VALUE_PAIR);

    // CHANGE gen: Add cast
    tListKeyValuePairEClass = (EClass<TListKeyValuePair<?>>) createEClass(TLIST_KEY_VALUE_PAIR);

    // CHANGE gen: Add cast
    boundedTListKeyValuePairEClass = (EClass<BoundedTListKeyValuePair<?>>) createEClass(BOUNDED_TLIST_KEY_VALUE_PAIR);

    // CHANGE gen: Add cast
    highListKeyValuePairEClass = (EClass<HighListKeyValuePair>) createEClass(HIGH_LIST_KEY_VALUE_PAIR);

    // CHANGE gen: Add cast
    integerListKeyValuePairEClass = (EClass<IntegerListKeyValuePair>) createEClass(INTEGER_LIST_KEY_VALUE_PAIR);

    // CHANGE gen: Add cast
    keyValuePairContainerEClass = (EClass<KeyValuePairContainer<?, ?>>) createEClass(KEY_VALUE_PAIR_CONTAINER);
    // CHANGE gen: Use raw type
    createEReference(keyValuePairContainerEClass, KEY_VALUE_PAIR_CONTAINER__KEY_VALUE_PAIRS);

    // CHANGE gen: Add cast
    stringListKeyValuePairContainerEClass = (EClass<StringListKeyValuePairContainer>) createEClass(STRING_LIST_KEY_VALUE_PAIR_CONTAINER);

    // CHANGE gen: Add cast
    bidirectionalEClass = (EClass<Bidirectional<?>>) createEClass(BIDIRECTIONAL);
    // CHANGE gen: Use raw type
    createEReference(bidirectionalEClass, BIDIRECTIONAL__IN);
    // CHANGE gen: Use raw type
    createEReference(bidirectionalEClass, BIDIRECTIONAL__OUT);
    // CHANGE gen: Use raw type
    createEReference(bidirectionalEClass, BIDIRECTIONAL__VALUE);
    // CHANGE gen: Use raw type
    createEReference(bidirectionalEClass, BIDIRECTIONAL__VALUES);

    // CHANGE gen: Add cast
    linkEClass = (EClass<Link>) createEClass(LINK);

    // CHANGE gen: Add cast
    rawLinkEClass = (EClass<RawLink>) createEClass(RAW_LINK);

    // CHANGE gen: Add cast
    linkItemEClass = (EClass<LinkItem>) createEClass(LINK_ITEM);

    // CHANGE gen: Add cast
    mediumBidirectionalEClass = (EClass<MediumBidirectional<?>>) createEClass(MEDIUM_BIDIRECTIONAL);
    // CHANGE gen: Use raw type
    createEReference(mediumBidirectionalEClass, MEDIUM_BIDIRECTIONAL__CONTENTS);

    // CHANGE gen: Add cast
    mediumLinkEClass = (EClass<MediumLink>) createEClass(MEDIUM_LINK);
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
    ETypeParameter unboundedGenericContainerEClass_T = addETypeParameter(unboundedGenericContainerEClass, "T");
    ETypeParameter boundedGenericContainerEClass_T = addETypeParameter(boundedGenericContainerEClass, "T");
    ETypeParameter keyValuePairEClass_K = addETypeParameter(keyValuePairEClass, "K");
    ETypeParameter keyValuePairEClass_V = addETypeParameter(keyValuePairEClass, "V");
    ETypeParameter tListKeyValuePairEClass_T = addETypeParameter(tListKeyValuePairEClass, "T");
    ETypeParameter boundedTListKeyValuePairEClass_T = addETypeParameter(boundedTListKeyValuePairEClass, "T");
    ETypeParameter keyValuePairContainerEClass_K = addETypeParameter(keyValuePairContainerEClass, "K");
    ETypeParameter keyValuePairContainerEClass_V = addETypeParameter(keyValuePairContainerEClass, "V");
    ETypeParameter bidirectionalEClass_T = addETypeParameter(bidirectionalEClass, "T");
    ETypeParameter mediumBidirectionalEClass_T = addETypeParameter(mediumBidirectionalEClass, "T");

    // Set bounds for type parameters
    EGenericType g1 = createEGenericType(this.getMedium());
    boundedGenericContainerEClass_T.getEBounds().add(g1);
    g1 = createEGenericType(ecorePackage.getEEList());
    EGenericType g2 = createEGenericType();
    g1.getETypeArguments().add(g2);
    keyValuePairEClass_K.getEBounds().add(g1);
    g1 = createEGenericType(this.getKeyValuePair());
    g2 = createEGenericType(keyValuePairEClass_K);
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(keyValuePairEClass_V);
    g1.getETypeArguments().add(g2);
    keyValuePairEClass_V.getEBounds().add(g1);
    g1 = createEGenericType(this.getMedium());
    boundedTListKeyValuePairEClass_T.getEBounds().add(g1);
    g1 = createEGenericType(ecorePackage.getEEList());
    g2 = createEGenericType();
    g1.getETypeArguments().add(g2);
    keyValuePairContainerEClass_K.getEBounds().add(g1);
    g1 = createEGenericType(this.getKeyValuePair());
    g2 = createEGenericType(keyValuePairContainerEClass_K);
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(keyValuePairContainerEClass_V);
    g1.getETypeArguments().add(g2);
    keyValuePairContainerEClass_V.getEBounds().add(g1);
    g1 = createEGenericType(this.getBidirectional());
    g2 = createEGenericType(bidirectionalEClass_T);
    g1.getETypeArguments().add(g2);
    bidirectionalEClass_T.getEBounds().add(g1);
    g1 = createEGenericType(this.getMediumBidirectional());
    g2 = createEGenericType(mediumBidirectionalEClass_T);
    g1.getETypeArguments().add(g2);
    mediumBidirectionalEClass_T.getEBounds().add(g1);
    g1 = createEGenericType(this.getMedium());
    mediumBidirectionalEClass_T.getEBounds().add(g1);

    // Add supertypes to classes
    lowEClass.getESuperTypes().add(this.getVeryLow());
    mediumEClass.getESuperTypes().add(this.getLow());
    highEClass.getESuperTypes().add(this.getMedium());
    veryHighEClass.getESuperTypes().add(this.getHigh());
    rawUnboundedContainerEClass.getESuperTypes().add(this.getUnboundedGenericContainer());
    g1 = createEGenericType(this.getUnboundedGenericContainer());
    g2 = createEGenericType(this.getMedium());
    g1.getETypeArguments().add(g2);
    mediumUnboundedContainerEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getBoundedGenericContainer());
    g2 = createEGenericType(this.getHigh());
    g1.getETypeArguments().add(g2);
    highBoundedContainerEClass.getEGenericSuperTypes().add(g1);
    rawKeyValuePairEClass.getESuperTypes().add(this.getKeyValuePair());
    g1 = createEGenericType(this.getKeyValuePair());
    g2 = createEGenericType(ecorePackage.getEEList());
    g1.getETypeArguments().add(g2);
    EGenericType g3 = createEGenericType(ecorePackage.getEString());
    g2.getETypeArguments().add(g3);
    g2 = createEGenericType(this.getStringListKeyValuePair());
    g1.getETypeArguments().add(g2);
    stringListKeyValuePairEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getKeyValuePair());
    g2 = createEGenericType(ecorePackage.getEEList());
    g1.getETypeArguments().add(g2);
    g3 = createEGenericType(tListKeyValuePairEClass_T);
    g2.getETypeArguments().add(g3);
    g2 = createEGenericType(this.getTListKeyValuePair());
    g1.getETypeArguments().add(g2);
    g3 = createEGenericType(tListKeyValuePairEClass_T);
    g2.getETypeArguments().add(g3);
    tListKeyValuePairEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getTListKeyValuePair());
    g2 = createEGenericType(boundedTListKeyValuePairEClass_T);
    g1.getETypeArguments().add(g2);
    boundedTListKeyValuePairEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getBoundedTListKeyValuePair());
    g2 = createEGenericType(this.getHigh());
    g1.getETypeArguments().add(g2);
    highListKeyValuePairEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getTListKeyValuePair());
    g2 = createEGenericType(ecorePackage.getEIntegerObject());
    g1.getETypeArguments().add(g2);
    integerListKeyValuePairEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getKeyValuePairContainer());
    g2 = createEGenericType(ecorePackage.getEEList());
    g1.getETypeArguments().add(g2);
    g3 = createEGenericType(ecorePackage.getEString());
    g2.getETypeArguments().add(g3);
    g2 = createEGenericType(this.getStringListKeyValuePair());
    g1.getETypeArguments().add(g2);
    stringListKeyValuePairContainerEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getBidirectional());
    g2 = createEGenericType(this.getLink());
    g1.getETypeArguments().add(g2);
    linkEClass.getEGenericSuperTypes().add(g1);
    rawLinkEClass.getESuperTypes().add(this.getBidirectional());
    g1 = createEGenericType(this.getBidirectional());
    g2 = createEGenericType(this.getLinkItem());
    g1.getETypeArguments().add(g2);
    linkItemEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getMediumBidirectional());
    g2 = createEGenericType(this.getMediumLink());
    g1.getETypeArguments().add(g2);
    mediumLinkEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getMedium());
    mediumLinkEClass.getEGenericSuperTypes().add(g1);

    // Initialize classes and features; add operations and parameters
    initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRoot_Name(), ecorePackage.getEString(), "name", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRoot_Container(), this.getContainer(), null, "container", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRoot_UnboundedGenericContainerWithRawType(), this.getUnboundedGenericContainer(), null, "unboundedGenericContainerWithRawType", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    g1 = createEGenericType(this.getUnboundedGenericContainer());
    g2 = createEGenericType();
    g1.getETypeArguments().add(g2);
    initEReference(getRoot_UnboundedGenericContainerWithWildcard(), g1, null, "unboundedGenericContainerWithWildcard", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    g1 = createEGenericType(this.getUnboundedGenericContainer());
    g2 = createEGenericType();
    g1.getETypeArguments().add(g2);
    g3 = createEGenericType(this.getMedium());
    g2.setELowerBound(g3);
    initEReference(getRoot_UnboundedGenericContainerWithSuper(), g1, null, "unboundedGenericContainerWithSuper", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    g1 = createEGenericType(this.getUnboundedGenericContainer());
    g2 = createEGenericType();
    g1.getETypeArguments().add(g2);
    g3 = createEGenericType(this.getMedium());
    g2.setEUpperBound(g3);
    initEReference(getRoot_UnboundedGenericContainerWithExtends(), g1, null, "unboundedGenericContainerWithExtends", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRoot_BoundedGenericContainerWithRawType(), this.getBoundedGenericContainer(), null, "boundedGenericContainerWithRawType", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    g1 = createEGenericType(this.getBoundedGenericContainer());
    g2 = createEGenericType();
    g1.getETypeArguments().add(g2);
    initEReference(getRoot_BoundedGenericContainerWithWildcard(), g1, null, "boundedGenericContainerWithWildcard", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    g1 = createEGenericType(this.getBoundedGenericContainer());
    g2 = createEGenericType();
    g1.getETypeArguments().add(g2);
    g3 = createEGenericType(this.getMedium());
    g2.setELowerBound(g3);
    initEReference(getRoot_BoundedGenericContainerWithSuper(), g1, null, "boundedGenericContainerWithSuper", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    g1 = createEGenericType(this.getBoundedGenericContainer());
    g2 = createEGenericType();
    g1.getETypeArguments().add(g2);
    g3 = createEGenericType(this.getMedium());
    g2.setEUpperBound(g3);
    initEReference(getRoot_BoundedGenericContainerWithExtends(), g1, null, "boundedGenericContainerWithExtends", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(veryLowEClass, VeryLow.class, "VeryLow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lowEClass, Low.class, "Low", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mediumEClass, Medium.class, "Medium", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(highEClass, High.class, "High", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(veryHighEClass, VeryHigh.class, "VeryHigh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(containerEClass, org.eclipse.emf.test.common.reification.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unboundedGenericContainerEClass, UnboundedGenericContainer.class, "UnboundedGenericContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    g1 = createEGenericType(unboundedGenericContainerEClass_T);
    initEReference(getUnboundedGenericContainer_Content(), g1, null, "content", null, 0, 1, UnboundedGenericContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rawUnboundedContainerEClass, RawUnboundedContainer.class, "RawUnboundedContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mediumUnboundedContainerEClass, MediumUnboundedContainer.class, "MediumUnboundedContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(boundedGenericContainerEClass, BoundedGenericContainer.class, "BoundedGenericContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    g1 = createEGenericType(boundedGenericContainerEClass_T);
    initEReference(getBoundedGenericContainer_Content(), g1, null, "content", null, 0, 1, BoundedGenericContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(highBoundedContainerEClass, HighBoundedContainer.class, "HighBoundedContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(keyValuePairEClass, KeyValuePair.class, "KeyValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    g1 = createEGenericType(keyValuePairEClass_K);
    initEAttribute(getKeyValuePair_Key(), g1, "key", null, 0, 1, KeyValuePair.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    g1 = createEGenericType(keyValuePairEClass_V);
    initEReference(getKeyValuePair_Value(), g1, null, "value", null, 0, 1, KeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rawKeyValuePairEClass, RawKeyValuePair.class, "RawKeyValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringListKeyValuePairEClass, StringListKeyValuePair.class, "StringListKeyValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tListKeyValuePairEClass, TListKeyValuePair.class, "TListKeyValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(boundedTListKeyValuePairEClass, BoundedTListKeyValuePair.class, "BoundedTListKeyValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(highListKeyValuePairEClass, HighListKeyValuePair.class, "HighListKeyValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(integerListKeyValuePairEClass, IntegerListKeyValuePair.class, "IntegerListKeyValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(keyValuePairContainerEClass, KeyValuePairContainer.class, "KeyValuePairContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    g1 = createEGenericType(this.getKeyValuePair());
    g2 = createEGenericType(keyValuePairContainerEClass_K);
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(keyValuePairContainerEClass_V);
    g1.getETypeArguments().add(g2);
    initEReference(getKeyValuePairContainer_KeyValuePairs(), g1, null, "keyValuePairs", null, 0, -1, KeyValuePairContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringListKeyValuePairContainerEClass, StringListKeyValuePairContainer.class, "StringListKeyValuePairContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bidirectionalEClass, Bidirectional.class, "Bidirectional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    g1 = createEGenericType(bidirectionalEClass_T);
    initEReference(getBidirectional_In(), g1, this.getBidirectional_Out(), "in", null, 0, 1, Bidirectional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    g1 = createEGenericType(bidirectionalEClass_T);
    initEReference(getBidirectional_Out(), g1, this.getBidirectional_In(), "out", null, 0, 1, Bidirectional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    g1 = createEGenericType(bidirectionalEClass_T);
    initEReference(getBidirectional_Value(), g1, null, "value", null, 0, 1, Bidirectional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    g1 = createEGenericType(bidirectionalEClass_T);
    initEReference(getBidirectional_Values(), g1, null, "values", null, 0, -1, Bidirectional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rawLinkEClass, RawLink.class, "RawLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(linkItemEClass, LinkItem.class, "LinkItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mediumBidirectionalEClass, MediumBidirectional.class, "MediumBidirectional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    g1 = createEGenericType(this.getMediumBidirectional());
    g2 = createEGenericType(mediumBidirectionalEClass_T);
    g1.getETypeArguments().add(g2);
    initEReference(getMediumBidirectional_Contents(), g1, null, "contents", null, 0, -1, MediumBidirectional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mediumLinkEClass, MediumLink.class, "MediumLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //ReificationPackageImpl
