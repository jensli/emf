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
package org.eclipse.emf.test.models.tree;

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
 * @see org.eclipse.emf.test.models.tree.TreeFactory
 * @model kind="package"
 * @generated
 */
public interface TreePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "tree";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http:///org.eclipse.emf.test.models/Tree";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "org.eclipse.emf.test.models.tree";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TreePackage eINSTANCE = org.eclipse.emf.test.models.tree.impl.TreePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.models.tree.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.models.tree.impl.NodeImpl
   * @see org.eclipse.emf.test.models.tree.impl.TreePackageImpl#getNode()
   * @generated
   */
  int NODE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__PARENT = 1;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__CHILDREN = 2;

  /**
   * The feature id for the '<em><b>Data</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__DATA = 3;

  /**
   * The feature id for the '<em><b>Related Nodes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__RELATED_NODES = 4;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.models.tree.impl.DataImpl <em>Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.models.tree.impl.DataImpl
   * @see org.eclipse.emf.test.models.tree.impl.TreePackageImpl#getData()
   * @generated
   */
  int DATA = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__NAME = 0;

  /**
   * The feature id for the '<em><b>Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__NODE = 1;

  /**
   * The number of structural features of the '<em>Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.models.tree.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see org.eclipse.emf.test.models.tree.Node
   * @generated
   */
  EClass<Node> getNode();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.test.models.tree.Node#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.test.models.tree.Node#getName()
   * @see #getNode()
   * @generated
   */
  EAttribute<Node, String> getNode_Name();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.emf.test.models.tree.Node#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see org.eclipse.emf.test.models.tree.Node#getParent()
   * @see #getNode()
   * @generated
   */
  EReference<Node, Node> getNode_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.test.models.tree.Node#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.eclipse.emf.test.models.tree.Node#getChildren()
   * @see #getNode()
   * @generated
   */
  EReference<Node, EList<Node>> getNode_Children();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.test.models.tree.Node#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Data</em>'.
   * @see org.eclipse.emf.test.models.tree.Node#getData()
   * @see #getNode()
   * @generated
   */
  EReference<Node, Data> getNode_Data();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.test.models.tree.Node#getRelatedNodes <em>Related Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Related Nodes</em>'.
   * @see org.eclipse.emf.test.models.tree.Node#getRelatedNodes()
   * @see #getNode()
   * @generated
   */
  EReference<Node, EList<Node>> getNode_RelatedNodes();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.models.tree.Data <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data</em>'.
   * @see org.eclipse.emf.test.models.tree.Data
   * @generated
   */
  EClass<Data> getData();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.test.models.tree.Data#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.test.models.tree.Data#getName()
   * @see #getData()
   * @generated
   */
  EAttribute<Data, String> getData_Name();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.test.models.tree.Data#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Node</em>'.
   * @see org.eclipse.emf.test.models.tree.Data#getNode()
   * @see #getData()
   * @generated
   */
  EReference<Data, Node> getData_Node();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TreeFactory getTreeFactory();

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
     * The meta object literal for the '{@link org.eclipse.emf.test.models.tree.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.models.tree.impl.NodeImpl
     * @see org.eclipse.emf.test.models.tree.impl.TreePackageImpl#getNode()
     * @generated
     */
    EClass<Node> NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute<Node, String> NODE__NAME = eINSTANCE.getNode_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Node, Node> NODE__PARENT = eINSTANCE.getNode_Parent();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Node, EList<Node>> NODE__CHILDREN = eINSTANCE.getNode_Children();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Node, Data> NODE__DATA = eINSTANCE.getNode_Data();

    /**
     * The meta object literal for the '<em><b>Related Nodes</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Node, EList<Node>> NODE__RELATED_NODES = eINSTANCE.getNode_RelatedNodes();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.test.models.tree.impl.DataImpl <em>Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.test.models.tree.impl.DataImpl
     * @see org.eclipse.emf.test.models.tree.impl.TreePackageImpl#getData()
     * @generated
     */
    EClass<Data> DATA = eINSTANCE.getData();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute<Data, String> DATA__NAME = eINSTANCE.getData_Name();

    /**
     * The meta object literal for the '<em><b>Node</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference<Data, Node> DATA__NODE = eINSTANCE.getData_Node();

  }

} //TreePackage
