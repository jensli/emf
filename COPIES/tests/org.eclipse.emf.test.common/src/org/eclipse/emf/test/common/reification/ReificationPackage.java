/**
 * Copyright (c) 2013 Eclipse contributors and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.emf.test.common.reification;

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
 * @see org.eclipse.emf.test.common.reification.ReificationFactory
 * @model kind="package"
 * @generated
 */
public interface ReificationPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "reification";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/emf/test/common/Reification";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "reification";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ReificationPackage eINSTANCE = org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.RootImpl <em>Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.RootImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getRoot()
   * @generated
   */
  int ROOT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__NAME = 0;

  /**
   * The feature id for the '<em><b>Container</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__CONTAINER = 1;

  /**
   * The feature id for the '<em><b>Unbounded Generic Container With Raw Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__UNBOUNDED_GENERIC_CONTAINER_WITH_RAW_TYPE = 2;

  /**
   * The feature id for the '<em><b>Unbounded Generic Container With Wildcard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__UNBOUNDED_GENERIC_CONTAINER_WITH_WILDCARD = 3;

  /**
   * The feature id for the '<em><b>Unbounded Generic Container With Super</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__UNBOUNDED_GENERIC_CONTAINER_WITH_SUPER = 4;

  /**
   * The feature id for the '<em><b>Unbounded Generic Container With Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__UNBOUNDED_GENERIC_CONTAINER_WITH_EXTENDS = 5;

  /**
   * The feature id for the '<em><b>Bounded Generic Container With Raw Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__BOUNDED_GENERIC_CONTAINER_WITH_RAW_TYPE = 6;

  /**
   * The feature id for the '<em><b>Bounded Generic Container With Wildcard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__BOUNDED_GENERIC_CONTAINER_WITH_WILDCARD = 7;

  /**
   * The feature id for the '<em><b>Bounded Generic Container With Super</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__BOUNDED_GENERIC_CONTAINER_WITH_SUPER = 8;

  /**
   * The feature id for the '<em><b>Bounded Generic Container With Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__BOUNDED_GENERIC_CONTAINER_WITH_EXTENDS = 9;

  /**
   * The number of structural features of the '<em>Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.VeryLowImpl <em>Very Low</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.VeryLowImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getVeryLow()
   * @generated
   */
  int VERY_LOW = 1;

  /**
   * The number of structural features of the '<em>Very Low</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERY_LOW_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.LowImpl <em>Low</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.LowImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getLow()
   * @generated
   */
  int LOW = 2;

  /**
   * The number of structural features of the '<em>Low</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOW_FEATURE_COUNT = VERY_LOW_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.MediumImpl <em>Medium</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.MediumImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getMedium()
   * @generated
   */
  int MEDIUM = 3;

  /**
   * The number of structural features of the '<em>Medium</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIUM_FEATURE_COUNT = LOW_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.HighImpl <em>High</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.HighImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getHigh()
   * @generated
   */
  int HIGH = 4;

  /**
   * The number of structural features of the '<em>High</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIGH_FEATURE_COUNT = MEDIUM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.VeryHighImpl <em>Very High</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.VeryHighImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getVeryHigh()
   * @generated
   */
  int VERY_HIGH = 5;

  /**
   * The number of structural features of the '<em>Very High</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERY_HIGH_FEATURE_COUNT = HIGH_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.ContainerImpl <em>Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.ContainerImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getContainer()
   * @generated
   */
  int CONTAINER = 6;

  /**
   * The number of structural features of the '<em>Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.UnboundedGenericContainerImpl <em>Unbounded Generic Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.UnboundedGenericContainerImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getUnboundedGenericContainer()
   * @generated
   */
  int UNBOUNDED_GENERIC_CONTAINER = 7;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNBOUNDED_GENERIC_CONTAINER__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Unbounded Generic Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNBOUNDED_GENERIC_CONTAINER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.RawUnboundedContainerImpl <em>Raw Unbounded Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.RawUnboundedContainerImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getRawUnboundedContainer()
   * @generated
   */
  int RAW_UNBOUNDED_CONTAINER = 8;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAW_UNBOUNDED_CONTAINER__CONTENT = UNBOUNDED_GENERIC_CONTAINER__CONTENT;

  /**
   * The number of structural features of the '<em>Raw Unbounded Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAW_UNBOUNDED_CONTAINER_FEATURE_COUNT = UNBOUNDED_GENERIC_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.MediumUnboundedContainerImpl <em>Medium Unbounded Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.MediumUnboundedContainerImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getMediumUnboundedContainer()
   * @generated
   */
  int MEDIUM_UNBOUNDED_CONTAINER = 9;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIUM_UNBOUNDED_CONTAINER__CONTENT = UNBOUNDED_GENERIC_CONTAINER__CONTENT;

  /**
   * The number of structural features of the '<em>Medium Unbounded Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIUM_UNBOUNDED_CONTAINER_FEATURE_COUNT = UNBOUNDED_GENERIC_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.BoundedGenericContainerImpl <em>Bounded Generic Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.BoundedGenericContainerImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getBoundedGenericContainer()
   * @generated
   */
  int BOUNDED_GENERIC_CONTAINER = 10;

  /**
   * The feature id for the '<em><b>Content</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDED_GENERIC_CONTAINER__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Bounded Generic Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDED_GENERIC_CONTAINER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.HighBoundedContainerImpl <em>High Bounded Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.HighBoundedContainerImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getHighBoundedContainer()
   * @generated
   */
  int HIGH_BOUNDED_CONTAINER = 11;

  /**
   * The feature id for the '<em><b>Content</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIGH_BOUNDED_CONTAINER__CONTENT = BOUNDED_GENERIC_CONTAINER__CONTENT;

  /**
   * The number of structural features of the '<em>High Bounded Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIGH_BOUNDED_CONTAINER_FEATURE_COUNT = BOUNDED_GENERIC_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.KeyValuePairImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getKeyValuePair()
   * @generated
   */
  int KEY_VALUE_PAIR = 12;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_PAIR__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_PAIR__VALUE = 1;

  /**
   * The number of structural features of the '<em>Key Value Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_PAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.RawKeyValuePairImpl <em>Raw Key Value Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.RawKeyValuePairImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getRawKeyValuePair()
   * @generated
   */
  int RAW_KEY_VALUE_PAIR = 13;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAW_KEY_VALUE_PAIR__KEY = KEY_VALUE_PAIR__KEY;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAW_KEY_VALUE_PAIR__VALUE = KEY_VALUE_PAIR__VALUE;

  /**
   * The number of structural features of the '<em>Raw Key Value Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAW_KEY_VALUE_PAIR_FEATURE_COUNT = KEY_VALUE_PAIR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.StringListKeyValuePairImpl <em>String List Key Value Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.StringListKeyValuePairImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getStringListKeyValuePair()
   * @generated
   */
  int STRING_LIST_KEY_VALUE_PAIR = 14;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LIST_KEY_VALUE_PAIR__KEY = KEY_VALUE_PAIR__KEY;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LIST_KEY_VALUE_PAIR__VALUE = KEY_VALUE_PAIR__VALUE;

  /**
   * The number of structural features of the '<em>String List Key Value Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LIST_KEY_VALUE_PAIR_FEATURE_COUNT = KEY_VALUE_PAIR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.TListKeyValuePairImpl <em>TList Key Value Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.TListKeyValuePairImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getTListKeyValuePair()
   * @generated
   */
  int TLIST_KEY_VALUE_PAIR = 15;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TLIST_KEY_VALUE_PAIR__KEY = KEY_VALUE_PAIR__KEY;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TLIST_KEY_VALUE_PAIR__VALUE = KEY_VALUE_PAIR__VALUE;

  /**
   * The number of structural features of the '<em>TList Key Value Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TLIST_KEY_VALUE_PAIR_FEATURE_COUNT = KEY_VALUE_PAIR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.BoundedTListKeyValuePairImpl <em>Bounded TList Key Value Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.BoundedTListKeyValuePairImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getBoundedTListKeyValuePair()
   * @generated
   */
  int BOUNDED_TLIST_KEY_VALUE_PAIR = 16;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDED_TLIST_KEY_VALUE_PAIR__KEY = TLIST_KEY_VALUE_PAIR__KEY;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDED_TLIST_KEY_VALUE_PAIR__VALUE = TLIST_KEY_VALUE_PAIR__VALUE;

  /**
   * The number of structural features of the '<em>Bounded TList Key Value Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDED_TLIST_KEY_VALUE_PAIR_FEATURE_COUNT = TLIST_KEY_VALUE_PAIR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.HighListKeyValuePairImpl <em>High List Key Value Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.HighListKeyValuePairImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getHighListKeyValuePair()
   * @generated
   */
  int HIGH_LIST_KEY_VALUE_PAIR = 17;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIGH_LIST_KEY_VALUE_PAIR__KEY = BOUNDED_TLIST_KEY_VALUE_PAIR__KEY;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIGH_LIST_KEY_VALUE_PAIR__VALUE = BOUNDED_TLIST_KEY_VALUE_PAIR__VALUE;

  /**
   * The number of structural features of the '<em>High List Key Value Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIGH_LIST_KEY_VALUE_PAIR_FEATURE_COUNT = BOUNDED_TLIST_KEY_VALUE_PAIR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.IntegerListKeyValuePairImpl <em>Integer List Key Value Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.IntegerListKeyValuePairImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getIntegerListKeyValuePair()
   * @generated
   */
  int INTEGER_LIST_KEY_VALUE_PAIR = 18;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LIST_KEY_VALUE_PAIR__KEY = TLIST_KEY_VALUE_PAIR__KEY;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LIST_KEY_VALUE_PAIR__VALUE = TLIST_KEY_VALUE_PAIR__VALUE;

  /**
   * The number of structural features of the '<em>Integer List Key Value Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LIST_KEY_VALUE_PAIR_FEATURE_COUNT = TLIST_KEY_VALUE_PAIR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.KeyValuePairContainerImpl <em>Key Value Pair Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.KeyValuePairContainerImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getKeyValuePairContainer()
   * @generated
   */
  int KEY_VALUE_PAIR_CONTAINER = 19;

  /**
   * The feature id for the '<em><b>Key Value Pairs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_PAIR_CONTAINER__KEY_VALUE_PAIRS = 0;

  /**
   * The number of structural features of the '<em>Key Value Pair Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_PAIR_CONTAINER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.StringListKeyValuePairContainerImpl <em>String List Key Value Pair Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.StringListKeyValuePairContainerImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getStringListKeyValuePairContainer()
   * @generated
   */
  int STRING_LIST_KEY_VALUE_PAIR_CONTAINER = 20;

  /**
   * The feature id for the '<em><b>Key Value Pairs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LIST_KEY_VALUE_PAIR_CONTAINER__KEY_VALUE_PAIRS = KEY_VALUE_PAIR_CONTAINER__KEY_VALUE_PAIRS;

  /**
   * The number of structural features of the '<em>String List Key Value Pair Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LIST_KEY_VALUE_PAIR_CONTAINER_FEATURE_COUNT = KEY_VALUE_PAIR_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.BidirectionalImpl <em>Bidirectional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.BidirectionalImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getBidirectional()
   * @generated
   */
  int BIDIRECTIONAL = 21;

  /**
   * The feature id for the '<em><b>In</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIDIRECTIONAL__IN = 0;

  /**
   * The feature id for the '<em><b>Out</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIDIRECTIONAL__OUT = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIDIRECTIONAL__VALUE = 2;

  /**
   * The feature id for the '<em><b>Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIDIRECTIONAL__VALUES = 3;

  /**
   * The number of structural features of the '<em>Bidirectional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIDIRECTIONAL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.LinkImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getLink()
   * @generated
   */
  int LINK = 22;

  /**
   * The feature id for the '<em><b>In</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__IN = BIDIRECTIONAL__IN;

  /**
   * The feature id for the '<em><b>Out</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__OUT = BIDIRECTIONAL__OUT;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__VALUE = BIDIRECTIONAL__VALUE;

  /**
   * The feature id for the '<em><b>Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__VALUES = BIDIRECTIONAL__VALUES;

  /**
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = BIDIRECTIONAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.RawLinkImpl <em>Raw Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.RawLinkImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getRawLink()
   * @generated
   */
  int RAW_LINK = 23;

  /**
   * The feature id for the '<em><b>In</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAW_LINK__IN = BIDIRECTIONAL__IN;

  /**
   * The feature id for the '<em><b>Out</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAW_LINK__OUT = BIDIRECTIONAL__OUT;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAW_LINK__VALUE = BIDIRECTIONAL__VALUE;

  /**
   * The feature id for the '<em><b>Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAW_LINK__VALUES = BIDIRECTIONAL__VALUES;

  /**
   * The number of structural features of the '<em>Raw Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAW_LINK_FEATURE_COUNT = BIDIRECTIONAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.LinkItemImpl <em>Link Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.LinkItemImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getLinkItem()
   * @generated
   */
  int LINK_ITEM = 24;

  /**
   * The feature id for the '<em><b>In</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_ITEM__IN = BIDIRECTIONAL__IN;

  /**
   * The feature id for the '<em><b>Out</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_ITEM__OUT = BIDIRECTIONAL__OUT;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_ITEM__VALUE = BIDIRECTIONAL__VALUE;

  /**
   * The feature id for the '<em><b>Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_ITEM__VALUES = BIDIRECTIONAL__VALUES;

  /**
   * The number of structural features of the '<em>Link Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_ITEM_FEATURE_COUNT = BIDIRECTIONAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.MediumBidirectionalImpl <em>Medium Bidirectional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.MediumBidirectionalImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getMediumBidirectional()
   * @generated
   */
  int MEDIUM_BIDIRECTIONAL = 25;

  /**
   * The feature id for the '<em><b>Contents</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIUM_BIDIRECTIONAL__CONTENTS = 0;

  /**
   * The number of structural features of the '<em>Medium Bidirectional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIUM_BIDIRECTIONAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.common.reification.impl.MediumLinkImpl <em>Medium Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.common.reification.impl.MediumLinkImpl
   * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getMediumLink()
   * @generated
   */
  int MEDIUM_LINK = 26;

  /**
   * The feature id for the '<em><b>Contents</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIUM_LINK__CONTENTS = MEDIUM_BIDIRECTIONAL__CONTENTS;

  /**
   * The number of structural features of the '<em>Medium Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIUM_LINK_FEATURE_COUNT = MEDIUM_BIDIRECTIONAL_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root</em>'.
   * @see org.eclipse.emf.test.common.reification.Root
   * @generated
   */
  EClass<Root> getRoot();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.test.common.reification.Root#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.test.common.reification.Root#getName()
   * @see #getRoot()
   * @generated
   */
  EAttribute<Root, String> getRoot_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.test.common.reification.Root#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Container</em>'.
   * @see org.eclipse.emf.test.common.reification.Root#getContainer()
   * @see #getRoot()
   * @generated
   */
  EReference<Root, Container> getRoot_Container();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.test.common.reification.Root#getUnboundedGenericContainerWithRawType <em>Unbounded Generic Container With Raw Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unbounded Generic Container With Raw Type</em>'.
   * @see org.eclipse.emf.test.common.reification.Root#getUnboundedGenericContainerWithRawType()
   * @see #getRoot()
   * @generated
   */
  EReference<Root, UnboundedGenericContainer> getRoot_UnboundedGenericContainerWithRawType();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.test.common.reification.Root#getUnboundedGenericContainerWithWildcard <em>Unbounded Generic Container With Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unbounded Generic Container With Wildcard</em>'.
   * @see org.eclipse.emf.test.common.reification.Root#getUnboundedGenericContainerWithWildcard()
   * @see #getRoot()
   * @generated
   */
  EReference<Root, UnboundedGenericContainer<?>> getRoot_UnboundedGenericContainerWithWildcard();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.test.common.reification.Root#getUnboundedGenericContainerWithSuper <em>Unbounded Generic Container With Super</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unbounded Generic Container With Super</em>'.
   * @see org.eclipse.emf.test.common.reification.Root#getUnboundedGenericContainerWithSuper()
   * @see #getRoot()
   * @generated
   */
  EReference<Root, UnboundedGenericContainer<? super Medium>> getRoot_UnboundedGenericContainerWithSuper();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.test.common.reification.Root#getUnboundedGenericContainerWithExtends <em>Unbounded Generic Container With Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unbounded Generic Container With Extends</em>'.
   * @see org.eclipse.emf.test.common.reification.Root#getUnboundedGenericContainerWithExtends()
   * @see #getRoot()
   * @generated
   */
  EReference<Root, UnboundedGenericContainer<? extends Medium>> getRoot_UnboundedGenericContainerWithExtends();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.test.common.reification.Root#getBoundedGenericContainerWithRawType <em>Bounded Generic Container With Raw Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bounded Generic Container With Raw Type</em>'.
   * @see org.eclipse.emf.test.common.reification.Root#getBoundedGenericContainerWithRawType()
   * @see #getRoot()
   * @generated
   */
  EReference<Root, BoundedGenericContainer> getRoot_BoundedGenericContainerWithRawType();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.test.common.reification.Root#getBoundedGenericContainerWithWildcard <em>Bounded Generic Container With Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bounded Generic Container With Wildcard</em>'.
   * @see org.eclipse.emf.test.common.reification.Root#getBoundedGenericContainerWithWildcard()
   * @see #getRoot()
   * @generated
   */
  EReference<Root, BoundedGenericContainer<?>> getRoot_BoundedGenericContainerWithWildcard();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.test.common.reification.Root#getBoundedGenericContainerWithSuper <em>Bounded Generic Container With Super</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bounded Generic Container With Super</em>'.
   * @see org.eclipse.emf.test.common.reification.Root#getBoundedGenericContainerWithSuper()
   * @see #getRoot()
   * @generated
   */
  EReference<Root, BoundedGenericContainer<? super Medium>> getRoot_BoundedGenericContainerWithSuper();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.test.common.reification.Root#getBoundedGenericContainerWithExtends <em>Bounded Generic Container With Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bounded Generic Container With Extends</em>'.
   * @see org.eclipse.emf.test.common.reification.Root#getBoundedGenericContainerWithExtends()
   * @see #getRoot()
   * @generated
   */
  EReference<Root, BoundedGenericContainer<? extends Medium>> getRoot_BoundedGenericContainerWithExtends();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.VeryLow <em>Very Low</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Very Low</em>'.
   * @see org.eclipse.emf.test.common.reification.VeryLow
   * @generated
   */
  EClass<VeryLow> getVeryLow();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.Low <em>Low</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Low</em>'.
   * @see org.eclipse.emf.test.common.reification.Low
   * @generated
   */
  EClass<Low> getLow();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.Medium <em>Medium</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Medium</em>'.
   * @see org.eclipse.emf.test.common.reification.Medium
   * @generated
   */
  EClass<Medium> getMedium();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.High <em>High</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>High</em>'.
   * @see org.eclipse.emf.test.common.reification.High
   * @generated
   */
  EClass<High> getHigh();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.VeryHigh <em>Very High</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Very High</em>'.
   * @see org.eclipse.emf.test.common.reification.VeryHigh
   * @generated
   */
  EClass<VeryHigh> getVeryHigh();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.Container <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container</em>'.
   * @see org.eclipse.emf.test.common.reification.Container
   * @generated
   */
  EClass<Container> getContainer();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.UnboundedGenericContainer <em>Unbounded Generic Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unbounded Generic Container</em>'.
   * @see org.eclipse.emf.test.common.reification.UnboundedGenericContainer
   * @generated
   */
  EClass<UnboundedGenericContainer<?>> getUnboundedGenericContainer();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.test.common.reification.UnboundedGenericContainer#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see org.eclipse.emf.test.common.reification.UnboundedGenericContainer#getContent()
   * @see #getUnboundedGenericContainer()
   * @generated
   */
  EReference<UnboundedGenericContainer<?>, ?> getUnboundedGenericContainer_Content();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.RawUnboundedContainer <em>Raw Unbounded Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Raw Unbounded Container</em>'.
   * @see org.eclipse.emf.test.common.reification.RawUnboundedContainer
   * @generated
   */
  EClass<RawUnboundedContainer> getRawUnboundedContainer();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.MediumUnboundedContainer <em>Medium Unbounded Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Medium Unbounded Container</em>'.
   * @see org.eclipse.emf.test.common.reification.MediumUnboundedContainer
   * @generated
   */
  EClass<MediumUnboundedContainer> getMediumUnboundedContainer();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.BoundedGenericContainer <em>Bounded Generic Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bounded Generic Container</em>'.
   * @see org.eclipse.emf.test.common.reification.BoundedGenericContainer
   * @generated
   */
  EClass<BoundedGenericContainer<?>> getBoundedGenericContainer();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.test.common.reification.BoundedGenericContainer#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Content</em>'.
   * @see org.eclipse.emf.test.common.reification.BoundedGenericContainer#getContent()
   * @see #getBoundedGenericContainer()
   * @generated
   */
  EReference<BoundedGenericContainer<?>, ?> getBoundedGenericContainer_Content();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.HighBoundedContainer <em>High Bounded Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>High Bounded Container</em>'.
   * @see org.eclipse.emf.test.common.reification.HighBoundedContainer
   * @generated
   */
  EClass<HighBoundedContainer> getHighBoundedContainer();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.KeyValuePair <em>Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key Value Pair</em>'.
   * @see org.eclipse.emf.test.common.reification.KeyValuePair
   * @generated
   */
  EClass<KeyValuePair<?, ?>> getKeyValuePair();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.test.common.reification.KeyValuePair#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.eclipse.emf.test.common.reification.KeyValuePair#getKey()
   * @see #getKeyValuePair()
   * @generated
   */
  EAttribute<KeyValuePair<?, ?>, ?> getKeyValuePair_Key();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.test.common.reification.KeyValuePair#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipse.emf.test.common.reification.KeyValuePair#getValue()
   * @see #getKeyValuePair()
   * @generated
   */
  EReference<KeyValuePair<?, ?>, ?> getKeyValuePair_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.RawKeyValuePair <em>Raw Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Raw Key Value Pair</em>'.
   * @see org.eclipse.emf.test.common.reification.RawKeyValuePair
   * @generated
   */
  EClass<RawKeyValuePair> getRawKeyValuePair();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.StringListKeyValuePair <em>String List Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String List Key Value Pair</em>'.
   * @see org.eclipse.emf.test.common.reification.StringListKeyValuePair
   * @generated
   */
  EClass<StringListKeyValuePair> getStringListKeyValuePair();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.TListKeyValuePair <em>TList Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TList Key Value Pair</em>'.
   * @see org.eclipse.emf.test.common.reification.TListKeyValuePair
   * @generated
   */
  EClass<TListKeyValuePair<?>> getTListKeyValuePair();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.BoundedTListKeyValuePair <em>Bounded TList Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bounded TList Key Value Pair</em>'.
   * @see org.eclipse.emf.test.common.reification.BoundedTListKeyValuePair
   * @generated
   */
  EClass<BoundedTListKeyValuePair<?>> getBoundedTListKeyValuePair();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.HighListKeyValuePair <em>High List Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>High List Key Value Pair</em>'.
   * @see org.eclipse.emf.test.common.reification.HighListKeyValuePair
   * @generated
   */
  EClass<HighListKeyValuePair> getHighListKeyValuePair();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.IntegerListKeyValuePair <em>Integer List Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer List Key Value Pair</em>'.
   * @see org.eclipse.emf.test.common.reification.IntegerListKeyValuePair
   * @generated
   */
  EClass<IntegerListKeyValuePair> getIntegerListKeyValuePair();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.KeyValuePairContainer <em>Key Value Pair Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key Value Pair Container</em>'.
   * @see org.eclipse.emf.test.common.reification.KeyValuePairContainer
   * @generated
   */
  EClass<KeyValuePairContainer<?, ?>> getKeyValuePairContainer();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.test.common.reification.KeyValuePairContainer#getKeyValuePairsList <em>Key Value Pairs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Key Value Pairs</em>'.
   * @see org.eclipse.emf.test.common.reification.KeyValuePairContainer#getKeyValuePairsList()
   * @see #getKeyValuePairContainer()
   * @generated
   */
  EReference<KeyValuePairContainer<?, ?>, EList<KeyValuePair<?, ?>>> getKeyValuePairContainer_KeyValuePairs();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.StringListKeyValuePairContainer <em>String List Key Value Pair Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String List Key Value Pair Container</em>'.
   * @see org.eclipse.emf.test.common.reification.StringListKeyValuePairContainer
   * @generated
   */
  EClass<StringListKeyValuePairContainer> getStringListKeyValuePairContainer();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.Bidirectional <em>Bidirectional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bidirectional</em>'.
   * @see org.eclipse.emf.test.common.reification.Bidirectional
   * @generated
   */
  EClass<Bidirectional<?>> getBidirectional();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.test.common.reification.Bidirectional#getIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>In</em>'.
   * @see org.eclipse.emf.test.common.reification.Bidirectional#getIn()
   * @see #getBidirectional()
   * @generated
   */
  EReference<Bidirectional<?>, ?> getBidirectional_In();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.test.common.reification.Bidirectional#getOut <em>Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Out</em>'.
   * @see org.eclipse.emf.test.common.reification.Bidirectional#getOut()
   * @see #getBidirectional()
   * @generated
   */
  EReference<Bidirectional<?>, ?> getBidirectional_Out();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.test.common.reification.Bidirectional#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see org.eclipse.emf.test.common.reification.Bidirectional#getValue()
   * @see #getBidirectional()
   * @generated
   */
  EReference<Bidirectional<?>, ?> getBidirectional_Value();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.test.common.reification.Bidirectional#getValuesList <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Values</em>'.
   * @see org.eclipse.emf.test.common.reification.Bidirectional#getValuesList()
   * @see #getBidirectional()
   * @generated
   */
  EReference<Bidirectional<?>, EList<?>> getBidirectional_Values();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link</em>'.
   * @see org.eclipse.emf.test.common.reification.Link
   * @generated
   */
  EClass<Link> getLink();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.RawLink <em>Raw Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Raw Link</em>'.
   * @see org.eclipse.emf.test.common.reification.RawLink
   * @generated
   */
  EClass<RawLink> getRawLink();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.LinkItem <em>Link Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Item</em>'.
   * @see org.eclipse.emf.test.common.reification.LinkItem
   * @generated
   */
  EClass<LinkItem> getLinkItem();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.MediumBidirectional <em>Medium Bidirectional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Medium Bidirectional</em>'.
   * @see org.eclipse.emf.test.common.reification.MediumBidirectional
   * @generated
   */
  EClass<MediumBidirectional<?>> getMediumBidirectional();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.test.common.reification.MediumBidirectional#getContentsList <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Contents</em>'.
   * @see org.eclipse.emf.test.common.reification.MediumBidirectional#getContentsList()
   * @see #getMediumBidirectional()
   * @generated
   */
  EReference<MediumBidirectional<?>, EList<MediumBidirectional<?>>> getMediumBidirectional_Contents();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.common.reification.MediumLink <em>Medium Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Medium Link</em>'.
   * @see org.eclipse.emf.test.common.reification.MediumLink
   * @generated
   */
  EClass<MediumLink> getMediumLink();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ReificationFactory getReificationFactory();

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
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.RootImpl <em>Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.RootImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getRoot()
     * @generated
     */
    EClass<Root> ROOT = eINSTANCE.getRoot();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute<Root, String> ROOT__NAME = eINSTANCE.getRoot_Name();

    /**
     * The meta object literal for the '<em><b>Container</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Root, Container> ROOT__CONTAINER = eINSTANCE.getRoot_Container();

    /**
     * The meta object literal for the '<em><b>Unbounded Generic Container With Raw Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Root, UnboundedGenericContainer> ROOT__UNBOUNDED_GENERIC_CONTAINER_WITH_RAW_TYPE = eINSTANCE.getRoot_UnboundedGenericContainerWithRawType();

    /**
     * The meta object literal for the '<em><b>Unbounded Generic Container With Wildcard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Root, UnboundedGenericContainer<?>> ROOT__UNBOUNDED_GENERIC_CONTAINER_WITH_WILDCARD = eINSTANCE.getRoot_UnboundedGenericContainerWithWildcard();

    /**
     * The meta object literal for the '<em><b>Unbounded Generic Container With Super</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Root, UnboundedGenericContainer<? super Medium>> ROOT__UNBOUNDED_GENERIC_CONTAINER_WITH_SUPER = eINSTANCE.getRoot_UnboundedGenericContainerWithSuper();

    /**
     * The meta object literal for the '<em><b>Unbounded Generic Container With Extends</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Root, UnboundedGenericContainer<? extends Medium>> ROOT__UNBOUNDED_GENERIC_CONTAINER_WITH_EXTENDS = eINSTANCE.getRoot_UnboundedGenericContainerWithExtends();

    /**
     * The meta object literal for the '<em><b>Bounded Generic Container With Raw Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Root, BoundedGenericContainer> ROOT__BOUNDED_GENERIC_CONTAINER_WITH_RAW_TYPE = eINSTANCE.getRoot_BoundedGenericContainerWithRawType();

    /**
     * The meta object literal for the '<em><b>Bounded Generic Container With Wildcard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Root, BoundedGenericContainer<?>> ROOT__BOUNDED_GENERIC_CONTAINER_WITH_WILDCARD = eINSTANCE.getRoot_BoundedGenericContainerWithWildcard();

    /**
     * The meta object literal for the '<em><b>Bounded Generic Container With Super</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Root, BoundedGenericContainer<? super Medium>> ROOT__BOUNDED_GENERIC_CONTAINER_WITH_SUPER = eINSTANCE.getRoot_BoundedGenericContainerWithSuper();

    /**
     * The meta object literal for the '<em><b>Bounded Generic Container With Extends</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Root, BoundedGenericContainer<? extends Medium>> ROOT__BOUNDED_GENERIC_CONTAINER_WITH_EXTENDS = eINSTANCE.getRoot_BoundedGenericContainerWithExtends();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.VeryLowImpl <em>Very Low</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.VeryLowImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getVeryLow()
     * @generated
     */
    EClass<VeryLow> VERY_LOW = eINSTANCE.getVeryLow();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.LowImpl <em>Low</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.LowImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getLow()
     * @generated
     */
    EClass<Low> LOW = eINSTANCE.getLow();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.MediumImpl <em>Medium</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.MediumImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getMedium()
     * @generated
     */
    EClass<Medium> MEDIUM = eINSTANCE.getMedium();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.HighImpl <em>High</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.HighImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getHigh()
     * @generated
     */
    EClass<High> HIGH = eINSTANCE.getHigh();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.VeryHighImpl <em>Very High</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.VeryHighImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getVeryHigh()
     * @generated
     */
    EClass<VeryHigh> VERY_HIGH = eINSTANCE.getVeryHigh();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.ContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.ContainerImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getContainer()
     * @generated
     */
    EClass<Container> CONTAINER = eINSTANCE.getContainer();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.UnboundedGenericContainerImpl <em>Unbounded Generic Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.UnboundedGenericContainerImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getUnboundedGenericContainer()
     * @generated
     */
    EClass<UnboundedGenericContainer<?>> UNBOUNDED_GENERIC_CONTAINER = eINSTANCE.getUnboundedGenericContainer();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<UnboundedGenericContainer<?>, ?> UNBOUNDED_GENERIC_CONTAINER__CONTENT = eINSTANCE.getUnboundedGenericContainer_Content();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.RawUnboundedContainerImpl <em>Raw Unbounded Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.RawUnboundedContainerImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getRawUnboundedContainer()
     * @generated
     */
    EClass<RawUnboundedContainer> RAW_UNBOUNDED_CONTAINER = eINSTANCE.getRawUnboundedContainer();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.MediumUnboundedContainerImpl <em>Medium Unbounded Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.MediumUnboundedContainerImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getMediumUnboundedContainer()
     * @generated
     */
    EClass<MediumUnboundedContainer> MEDIUM_UNBOUNDED_CONTAINER = eINSTANCE.getMediumUnboundedContainer();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.BoundedGenericContainerImpl <em>Bounded Generic Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.BoundedGenericContainerImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getBoundedGenericContainer()
     * @generated
     */
    EClass<BoundedGenericContainer<?>> BOUNDED_GENERIC_CONTAINER = eINSTANCE.getBoundedGenericContainer();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<BoundedGenericContainer<?>, ?> BOUNDED_GENERIC_CONTAINER__CONTENT = eINSTANCE.getBoundedGenericContainer_Content();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.HighBoundedContainerImpl <em>High Bounded Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.HighBoundedContainerImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getHighBoundedContainer()
     * @generated
     */
    EClass<HighBoundedContainer> HIGH_BOUNDED_CONTAINER = eINSTANCE.getHighBoundedContainer();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.KeyValuePairImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getKeyValuePair()
     * @generated
     */
    EClass<KeyValuePair<?, ?>> KEY_VALUE_PAIR = eINSTANCE.getKeyValuePair();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute<KeyValuePair<?, ?>, ?> KEY_VALUE_PAIR__KEY = eINSTANCE.getKeyValuePair_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<KeyValuePair<?, ?>, ?> KEY_VALUE_PAIR__VALUE = eINSTANCE.getKeyValuePair_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.RawKeyValuePairImpl <em>Raw Key Value Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.RawKeyValuePairImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getRawKeyValuePair()
     * @generated
     */
    EClass<RawKeyValuePair> RAW_KEY_VALUE_PAIR = eINSTANCE.getRawKeyValuePair();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.StringListKeyValuePairImpl <em>String List Key Value Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.StringListKeyValuePairImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getStringListKeyValuePair()
     * @generated
     */
    EClass<StringListKeyValuePair> STRING_LIST_KEY_VALUE_PAIR = eINSTANCE.getStringListKeyValuePair();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.TListKeyValuePairImpl <em>TList Key Value Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.TListKeyValuePairImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getTListKeyValuePair()
     * @generated
     */
    EClass<TListKeyValuePair<?>> TLIST_KEY_VALUE_PAIR = eINSTANCE.getTListKeyValuePair();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.BoundedTListKeyValuePairImpl <em>Bounded TList Key Value Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.BoundedTListKeyValuePairImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getBoundedTListKeyValuePair()
     * @generated
     */
    EClass<BoundedTListKeyValuePair<?>> BOUNDED_TLIST_KEY_VALUE_PAIR = eINSTANCE.getBoundedTListKeyValuePair();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.HighListKeyValuePairImpl <em>High List Key Value Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.HighListKeyValuePairImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getHighListKeyValuePair()
     * @generated
     */
    EClass<HighListKeyValuePair> HIGH_LIST_KEY_VALUE_PAIR = eINSTANCE.getHighListKeyValuePair();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.IntegerListKeyValuePairImpl <em>Integer List Key Value Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.IntegerListKeyValuePairImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getIntegerListKeyValuePair()
     * @generated
     */
    EClass<IntegerListKeyValuePair> INTEGER_LIST_KEY_VALUE_PAIR = eINSTANCE.getIntegerListKeyValuePair();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.KeyValuePairContainerImpl <em>Key Value Pair Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.KeyValuePairContainerImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getKeyValuePairContainer()
     * @generated
     */
    EClass<KeyValuePairContainer<?, ?>> KEY_VALUE_PAIR_CONTAINER = eINSTANCE.getKeyValuePairContainer();

    /**
     * The meta object literal for the '<em><b>Key Value Pairs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<KeyValuePairContainer<?, ?>, EList<KeyValuePair<?, ?>>> KEY_VALUE_PAIR_CONTAINER__KEY_VALUE_PAIRS = eINSTANCE.getKeyValuePairContainer_KeyValuePairs();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.StringListKeyValuePairContainerImpl <em>String List Key Value Pair Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.StringListKeyValuePairContainerImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getStringListKeyValuePairContainer()
     * @generated
     */
    EClass<StringListKeyValuePairContainer> STRING_LIST_KEY_VALUE_PAIR_CONTAINER = eINSTANCE.getStringListKeyValuePairContainer();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.BidirectionalImpl <em>Bidirectional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.BidirectionalImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getBidirectional()
     * @generated
     */
    EClass<Bidirectional<?>> BIDIRECTIONAL = eINSTANCE.getBidirectional();

    /**
     * The meta object literal for the '<em><b>In</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Bidirectional<?>, ?> BIDIRECTIONAL__IN = eINSTANCE.getBidirectional_In();

    /**
     * The meta object literal for the '<em><b>Out</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Bidirectional<?>, ?> BIDIRECTIONAL__OUT = eINSTANCE.getBidirectional_Out();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Bidirectional<?>, ?> BIDIRECTIONAL__VALUE = eINSTANCE.getBidirectional_Value();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Bidirectional<?>, EList<?>> BIDIRECTIONAL__VALUES = eINSTANCE.getBidirectional_Values();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.LinkImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getLink()
     * @generated
     */
    EClass<Link> LINK = eINSTANCE.getLink();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.RawLinkImpl <em>Raw Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.RawLinkImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getRawLink()
     * @generated
     */
    EClass<RawLink> RAW_LINK = eINSTANCE.getRawLink();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.LinkItemImpl <em>Link Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.LinkItemImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getLinkItem()
     * @generated
     */
    EClass<LinkItem> LINK_ITEM = eINSTANCE.getLinkItem();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.MediumBidirectionalImpl <em>Medium Bidirectional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.MediumBidirectionalImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getMediumBidirectional()
     * @generated
     */
    EClass<MediumBidirectional<?>> MEDIUM_BIDIRECTIONAL = eINSTANCE.getMediumBidirectional();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<MediumBidirectional<?>, EList<MediumBidirectional<?>>> MEDIUM_BIDIRECTIONAL__CONTENTS = eINSTANCE.getMediumBidirectional_Contents();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.common.reification.impl.MediumLinkImpl <em>Medium Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.common.reification.impl.MediumLinkImpl
     * @see org.eclipse.emf.test.common.reification.impl.ReificationPackageImpl#getMediumLink()
     * @generated
     */
    EClass<MediumLink> MEDIUM_LINK = eINSTANCE.getMediumLink();

  }

} //ReificationPackage
