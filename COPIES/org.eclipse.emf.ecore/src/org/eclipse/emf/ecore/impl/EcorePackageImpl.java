/**
 * Copyright (c) 2002-2009 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *   Christian Damus (Zeligsoft) - 255469
 */
package org.eclipse.emf.ecore.impl;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreValidator;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class EcorePackageImpl extends EPackageImpl implements EcorePackage {
	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.ecore.EcorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcorePackageImpl() {
    super(eNS_URI, EcoreFactory.eINSTANCE);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private static boolean isInited = false;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass<EAttribute<?, ?>> eAttributeEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass<EAnnotation> eAnnotationEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass<EClass<?>> eClassEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass<EDataType<?>> eDataTypeEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass<EEnum<?>> eEnumEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass<EEnumLiteral> eEnumLiteralEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass<EFactory> eFactoryEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass<EClassifier<?>> eClassifierEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass<EModelElement> eModelElementEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass<ENamedElement> eNamedElementEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass<EObject> eObjectEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass<EOperation<?, ?>> eOperationEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass<EPackage> ePackageEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass<EParameter<?>> eParameterEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass<EReference<?, ?>> eReferenceEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass<EStructuralFeature<?, ?>> eStructuralFeatureEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass<ETypedElement<?>> eTypedElementEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass<?> eStringToStringMapEntryEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass<EGenericType> eGenericTypeEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EClass<ETypeParameter> eTypeParameterEClass = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eBigDecimalEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eBigIntegerEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eBooleanObjectEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eCharacterObjectEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eDateEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eDiagnosticChainEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eDoubleObjectEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eFloatObjectEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eIntegerObjectEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eBooleanEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eByteObjectEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eByteEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eByteArrayEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eCharEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eDoubleEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eFloatEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eIntEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eJavaClassEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eJavaObjectEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eLongObjectEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eMapEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eShortObjectEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eLongEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eShortEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eTreeIteratorEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eInvocationTargetExceptionEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eFeatureMapEntryEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eEnumeratorEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eFeatureMapEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eStringEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eeListEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eResourceEDataType = null;

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private EDataType<?> eResourceSetEDataType = null;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link EcorePackage#eINSTANCE} when
	 * that field is accessed. Clients should not invoke it directly. Instead,
	 * they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcorePackage init() {
    if (isInited) return (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

  
    // Obtain or create and register package
    EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EcorePackageImpl());

    isInited = true;

  
    // Create package meta-data objects
  
    theEcorePackage.createPackageContents();
  
  

    // Initialize created meta-data
  
    theEcorePackage.initializePackageContents();
  
  

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theEcorePackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return EcoreValidator.INSTANCE;
         }
       });

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, theEcorePackage);
    return theEcorePackage;
  }

	private static ArrayList<EGenericTypeImpl> eGenericTypes = new ArrayList<EGenericTypeImpl>();

	@Override
	protected EGenericType createEGenericType() {
		EGenericTypeImpl eGenericType = (EGenericTypeImpl) super.createEGenericType();
		eGenericTypes.add(eGenericType);
		return eGenericType;
	}

	public static boolean internalBootstrap() {
		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		((EcorePackageImpl) EcorePackage.eINSTANCE).createExtendedMetaDataAnnotations();

		((EPackageImpl) EcorePackage.eINSTANCE).freeze();

		// This is needed for internal bootstrapping of EGenericType's default
		// value for eRawType.
		// It's simply not available before Ecore is constructed so we make it
		// available and then patch what's missing.
		//
		EGenericTypeImpl.eJavaObject = EcorePackage.Literals.EJAVA_OBJECT;
		for (EGenericTypeImpl eGenericType : eGenericTypes) {
			eGenericType.setERawType(EcorePackage.Literals.EJAVA_OBJECT, null);
		}

		return true;
	}

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass<EClass<?>> getEClass() {
  
    return eClassEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EClass<?>, Boolean> getEClass_Abstract() {
  
    return (EAttribute<EClass<?>, Boolean>) eClassEClass.getEStructuralFeatures().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EClass<?>, Boolean> getEClass_Interface() {
  
    return (EAttribute<EClass<?>, Boolean>) eClassEClass.getEStructuralFeatures().get(1);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EClass<?>, EList<EClass<?>>> getEClass_ESuperTypes() {
  
    return (EReference<EClass<?>, EList<EClass<?>>>) eClassEClass.getEStructuralFeatures().get(2);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EClass<?>, EList<EOperation<?, ?>>> getEClass_EOperations() {
  
    return (EReference<EClass<?>, EList<EOperation<?, ?>>>) eClassEClass.getEStructuralFeatures().get(3);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EClass<?>, EList<EAttribute<?, ?>>> getEClass_EAllAttributes() {
  
    return (EReference<EClass<?>, EList<EAttribute<?, ?>>>) eClassEClass.getEStructuralFeatures().get(4);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EClass<?>, EList<EReference<?, ?>>> getEClass_EAllReferences() {
  
    return (EReference<EClass<?>, EList<EReference<?, ?>>>) eClassEClass.getEStructuralFeatures().get(5);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EClass<?>, EList<EReference<?, ?>>> getEClass_EReferences() {
  
    return (EReference<EClass<?>, EList<EReference<?, ?>>>) eClassEClass.getEStructuralFeatures().get(6);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EClass<?>, EList<EAttribute<?, ?>>> getEClass_EAttributes() {
  
    return (EReference<EClass<?>, EList<EAttribute<?, ?>>>) eClassEClass.getEStructuralFeatures().get(7);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EClass<?>, EList<EReference<?, ?>>> getEClass_EAllContainments() {
  
    return (EReference<EClass<?>, EList<EReference<?, ?>>>) eClassEClass.getEStructuralFeatures().get(8);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EClass<?>, EList<EOperation<?, ?>>> getEClass_EAllOperations() {
  
    return (EReference<EClass<?>, EList<EOperation<?, ?>>>) eClassEClass.getEStructuralFeatures().get(9);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EClass<?>, EList<EStructuralFeature<?, ?>>> getEClass_EAllStructuralFeatures() {
  
    return (EReference<EClass<?>, EList<EStructuralFeature<?, ?>>>) eClassEClass.getEStructuralFeatures().get(10);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EClass<?>, EList<EClass<?>>> getEClass_EAllSuperTypes() {
  
    return (EReference<EClass<?>, EList<EClass<?>>>) eClassEClass.getEStructuralFeatures().get(11);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EClass<?>, EAttribute<?, ?>> getEClass_EIDAttribute() {
  
    return (EReference<EClass<?>, EAttribute<?, ?>>) eClassEClass.getEStructuralFeatures().get(12);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EClass<?>, EList<EStructuralFeature<?, ?>>> getEClass_EStructuralFeatures() {
  
    return (EReference<EClass<?>, EList<EStructuralFeature<?, ?>>>) eClassEClass.getEStructuralFeatures().get(13);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EClass<?>, EList<EGenericType>> getEClass_EGenericSuperTypes() {
  
    return (EReference<EClass<?>, EList<EGenericType>>) eClassEClass.getEStructuralFeatures().get(14);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EClass<?>, EList<EGenericType>> getEClass_EAllGenericSuperTypes() {
  
    return (EReference<EClass<?>, EList<EGenericType>>) eClassEClass.getEStructuralFeatures().get(15);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EClass<?>, Boolean> getEClass__IsSuperTypeOf__EClass() {
  
    return (EOperation<EClass<?>, Boolean>) eClassEClass.getEOperations().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EClass<?>, Integer> getEClass__GetFeatureCount() {
  
    return (EOperation<EClass<?>, Integer>) eClassEClass.getEOperations().get(1);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EClass<?>, EStructuralFeature<?, ?>> getEClass__GetEStructuralFeature__int() {
  
    return (EOperation<EClass<?>, EStructuralFeature<?, ?>>) eClassEClass.getEOperations().get(2);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EClass<?>, Integer> getEClass__GetFeatureID__EStructuralFeature() {
  
    return (EOperation<EClass<?>, Integer>) eClassEClass.getEOperations().get(3);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EClass<?>, EStructuralFeature<?, ?>> getEClass__GetEStructuralFeature__String() {
  
    return (EOperation<EClass<?>, EStructuralFeature<?, ?>>) eClassEClass.getEOperations().get(4);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EClass<?>, Integer> getEClass__GetOperationCount() {
  
    return (EOperation<EClass<?>, Integer>) eClassEClass.getEOperations().get(5);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EClass<?>, EOperation<?, ?>> getEClass__GetEOperation__int() {
  
    return (EOperation<EClass<?>, EOperation<?, ?>>) eClassEClass.getEOperations().get(6);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EClass<?>, Integer> getEClass__GetOperationID__EOperation() {
  
    return (EOperation<EClass<?>, Integer>) eClassEClass.getEOperations().get(7);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EClass<?>, EOperation<?, ?>> getEClass__GetOverride__EOperation() {
  
    return (EOperation<EClass<?>, EOperation<?, ?>>) eClassEClass.getEOperations().get(8);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EClass<?>, EGenericType> getEClass__GetFeatureType__EStructuralFeature() {
  
    return (EOperation<EClass<?>, EGenericType>) eClassEClass.getEOperations().get(9);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass<EDataType<?>> getEDataType() {
  
    return eDataTypeEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EDataType<?>, Boolean> getEDataType_Serializable() {
  
    return (EAttribute<EDataType<?>, Boolean>) eDataTypeEClass.getEStructuralFeatures().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass<EClassifier<?>> getEClassifier() {
  
    return eClassifierEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EClassifier<?>, String> getEClassifier_InstanceClassName() {
  
    return (EAttribute<EClassifier<?>, String>) eClassifierEClass.getEStructuralFeatures().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EClassifier<?>, Class<?>> getEClassifier_InstanceClass() {
  
    return (EAttribute<EClassifier<?>, Class<?>>) eClassifierEClass.getEStructuralFeatures().get(1);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EClassifier<?>, ?> getEClassifier_DefaultValue() {
  
    return (EAttribute<EClassifier<?>, ?>) eClassifierEClass.getEStructuralFeatures().get(2);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EClassifier<?>, String> getEClassifier_InstanceTypeName() {
  
    return (EAttribute<EClassifier<?>, String>) eClassifierEClass.getEStructuralFeatures().get(3);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EClassifier<?>, EPackage> getEClassifier_EPackage() {
  
    return (EReference<EClassifier<?>, EPackage>) eClassifierEClass.getEStructuralFeatures().get(4);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EClassifier<?>, EList<ETypeParameter>> getEClassifier_ETypeParameters() {
  
    return (EReference<EClassifier<?>, EList<ETypeParameter>>) eClassifierEClass.getEStructuralFeatures().get(5);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EClassifier<?>, Boolean> getEClassifier__IsInstance__Object() {
  
    return (EOperation<EClassifier<?>, Boolean>) eClassifierEClass.getEOperations().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EClassifier<?>, Integer> getEClassifier__GetClassifierID() {
  
    return (EOperation<EClassifier<?>, Integer>) eClassifierEClass.getEOperations().get(1);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass<ENamedElement> getENamedElement() {
  
    return eNamedElementEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<ENamedElement, String> getENamedElement_Name() {
  
    return (EAttribute<ENamedElement, String>) eNamedElementEClass.getEStructuralFeatures().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass<EOperation<?, ?>> getEOperation() {
  
    return eOperationEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EOperation<?, ?>, EClass<?>> getEOperation_EContainingClass() {
  
    return (EReference<EOperation<?, ?>, EClass<?>>) eOperationEClass.getEStructuralFeatures().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EOperation<?, ?>, EList<EParameter<?>>> getEOperation_EParameters() {
  
    return (EReference<EOperation<?, ?>, EList<EParameter<?>>>) eOperationEClass.getEStructuralFeatures().get(2);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EOperation<?, ?>, EList<EClassifier<?>>> getEOperation_EExceptions() {
  
    return (EReference<EOperation<?, ?>, EList<EClassifier<?>>>) eOperationEClass.getEStructuralFeatures().get(3);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EOperation<?, ?>, EList<EGenericType>> getEOperation_EGenericExceptions() {
  
    return (EReference<EOperation<?, ?>, EList<EGenericType>>) eOperationEClass.getEStructuralFeatures().get(4);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EOperation<?, ?>, Integer> getEOperation__GetOperationID() {
  
    return (EOperation<EOperation<?, ?>, Integer>) eOperationEClass.getEOperations().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EOperation<?, ?>, Boolean> getEOperation__IsOverrideOf__EOperation() {
  
    return (EOperation<EOperation<?, ?>, Boolean>) eOperationEClass.getEOperations().get(1);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EOperation<?, ?>, EList<ETypeParameter>> getEOperation_ETypeParameters() {
  
    return (EReference<EOperation<?, ?>, EList<ETypeParameter>>) eOperationEClass.getEStructuralFeatures().get(1);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass<EModelElement> getEModelElement() {
  
    return eModelElementEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EModelElement, EList<EAnnotation>> getEModelElement_EAnnotations() {
  
    return (EReference<EModelElement, EList<EAnnotation>>) eModelElementEClass.getEStructuralFeatures().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EModelElement, EAnnotation> getEModelElement__GetEAnnotation__String() {
  
    return (EOperation<EModelElement, EAnnotation>) eModelElementEClass.getEOperations().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass<EStructuralFeature<?, ?>> getEStructuralFeature() {
  
    return eStructuralFeatureEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EStructuralFeature<?, ?>, Boolean> getEStructuralFeature_Transient() {
  
    return (EAttribute<EStructuralFeature<?, ?>, Boolean>) eStructuralFeatureEClass.getEStructuralFeatures().get(2);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EStructuralFeature<?, ?>, Boolean> getEStructuralFeature_Volatile() {
  
    return (EAttribute<EStructuralFeature<?, ?>, Boolean>) eStructuralFeatureEClass.getEStructuralFeatures().get(1);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EStructuralFeature<?, ?>, Boolean> getEStructuralFeature_Changeable() {
  
    return (EAttribute<EStructuralFeature<?, ?>, Boolean>) eStructuralFeatureEClass.getEStructuralFeatures().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EStructuralFeature<?, ?>, String> getEStructuralFeature_DefaultValueLiteral() {
  
    return (EAttribute<EStructuralFeature<?, ?>, String>) eStructuralFeatureEClass.getEStructuralFeatures().get(3);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EStructuralFeature<?, ?>, ?> getEStructuralFeature_DefaultValue() {
  
    return (EAttribute<EStructuralFeature<?, ?>, ?>) eStructuralFeatureEClass.getEStructuralFeatures().get(4);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EStructuralFeature<?, ?>, Boolean> getEStructuralFeature_Unsettable() {
  
    return (EAttribute<EStructuralFeature<?, ?>, Boolean>) eStructuralFeatureEClass.getEStructuralFeatures().get(5);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EStructuralFeature<?, ?>, Boolean> getEStructuralFeature_Derived() {
  
    return (EAttribute<EStructuralFeature<?, ?>, Boolean>) eStructuralFeatureEClass.getEStructuralFeatures().get(6);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EStructuralFeature<?, ?>, EClass<?>> getEStructuralFeature_EContainingClass() {
  
    return (EReference<EStructuralFeature<?, ?>, EClass<?>>) eStructuralFeatureEClass.getEStructuralFeatures().get(7);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EStructuralFeature<?, ?>, Integer> getEStructuralFeature__GetFeatureID() {
  
    return (EOperation<EStructuralFeature<?, ?>, Integer>) eStructuralFeatureEClass.getEOperations().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EStructuralFeature<?, ?>, Class<?>> getEStructuralFeature__GetContainerClass() {
  
    return (EOperation<EStructuralFeature<?, ?>, Class<?>>) eStructuralFeatureEClass.getEOperations().get(1);
  
  }

	/**
	 * @deprecated
	 */
	@Deprecated
	public EAttribute getEStructuralFeature_Unique() {
		return getETypedElement_Unique();
	}

	/**
	 * @deprecated
	 */
	@Deprecated
	public EAttribute getEStructuralFeature_LowerBound() {
		return getETypedElement_LowerBound();
	}

	/**
	 * @deprecated
	 */
	@Deprecated
	public EAttribute getEStructuralFeature_UpperBound() {
		return getETypedElement_UpperBound();
	}

	/**
	 * @deprecated
	 */
	@Deprecated
	public EAttribute getEStructuralFeature_Many() {
		return getETypedElement_Many();
	}

	/**
	 * @deprecated
	 */
	@Deprecated
	public EAttribute getEStructuralFeature_Required() {
		return getETypedElement_Required();
	}

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass<EAttribute<?, ?>> getEAttribute() {
  
    return eAttributeEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EAttribute<?, ?>, Boolean> getEAttribute_ID() {
  
    return (EAttribute<EAttribute<?, ?>, Boolean>) eAttributeEClass.getEStructuralFeatures().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EAttribute<?, ?>, EDataType<?>> getEAttribute_EAttributeType() {
  
    return (EReference<EAttribute<?, ?>, EDataType<?>>) eAttributeEClass.getEStructuralFeatures().get(1);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass<EAnnotation> getEAnnotation() {
  
    return eAnnotationEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EAnnotation, String> getEAnnotation_Source() {
  
    return (EAttribute<EAnnotation, String>) eAnnotationEClass.getEStructuralFeatures().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EAnnotation, EMap<String, String>> getEAnnotation_Details() {
  
    return (EReference<EAnnotation, EMap<String, String>>) eAnnotationEClass.getEStructuralFeatures().get(1);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EAnnotation, EModelElement> getEAnnotation_EModelElement() {
  
    return (EReference<EAnnotation, EModelElement>) eAnnotationEClass.getEStructuralFeatures().get(2);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EAnnotation, EList<EObject>> getEAnnotation_Contents() {
  
    return (EReference<EAnnotation, EList<EObject>>) eAnnotationEClass.getEStructuralFeatures().get(3);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EAnnotation, EList<EObject>> getEAnnotation_References() {
  
    return (EReference<EAnnotation, EList<EObject>>) eAnnotationEClass.getEStructuralFeatures().get(4);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass<EReference<?, ?>> getEReference() {
  
    return eReferenceEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EReference<?, ?>, Boolean> getEReference_Containment() {
  
    return (EAttribute<EReference<?, ?>, Boolean>) eReferenceEClass.getEStructuralFeatures().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EReference<?, ?>, Boolean> getEReference_Container() {
  
    return (EAttribute<EReference<?, ?>, Boolean>) eReferenceEClass.getEStructuralFeatures().get(1);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EReference<?, ?>, Boolean> getEReference_ResolveProxies() {
  
    return (EAttribute<EReference<?, ?>, Boolean>) eReferenceEClass.getEStructuralFeatures().get(2);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EReference<?, ?>, EReference<?, ?>> getEReference_EOpposite() {
  
    return (EReference<EReference<?, ?>, EReference<?, ?>>) eReferenceEClass.getEStructuralFeatures().get(3);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EReference<?, ?>, EClass<?>> getEReference_EReferenceType() {
  
    return (EReference<EReference<?, ?>, EClass<?>>) eReferenceEClass.getEStructuralFeatures().get(4);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EReference<?, ?>, EList<EAttribute<?, ?>>> getEReference_EKeys() {
  
    return (EReference<EReference<?, ?>, EList<EAttribute<?, ?>>>) eReferenceEClass.getEStructuralFeatures().get(5);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEEList() {
  
    return eeListEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEResource() {
  
    return eResourceEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEResourceSet() {
  
    return eResourceSetEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEBooleanObject() {
  
    return eBooleanObjectEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getECharacterObject() {
  
    return eCharacterObjectEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEDate() {
  
    return eDateEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEDiagnosticChain() {
  
    return eDiagnosticChainEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEDoubleObject() {
  
    return eDoubleObjectEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEFloatObject() {
  
    return eFloatObjectEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEIntegerObject() {
  
    return eIntegerObjectEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass<ETypedElement<?>> getETypedElement() {
  
    return eTypedElementEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<ETypedElement<?>, Boolean> getETypedElement_Ordered() {
  
    return (EAttribute<ETypedElement<?>, Boolean>) eTypedElementEClass.getEStructuralFeatures().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<ETypedElement<?>, Boolean> getETypedElement_Unique() {
  
    return (EAttribute<ETypedElement<?>, Boolean>) eTypedElementEClass.getEStructuralFeatures().get(1);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<ETypedElement<?>, Integer> getETypedElement_LowerBound() {
  
    return (EAttribute<ETypedElement<?>, Integer>) eTypedElementEClass.getEStructuralFeatures().get(2);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<ETypedElement<?>, Integer> getETypedElement_UpperBound() {
  
    return (EAttribute<ETypedElement<?>, Integer>) eTypedElementEClass.getEStructuralFeatures().get(3);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<ETypedElement<?>, Boolean> getETypedElement_Many() {
  
    return (EAttribute<ETypedElement<?>, Boolean>) eTypedElementEClass.getEStructuralFeatures().get(4);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<ETypedElement<?>, Boolean> getETypedElement_Required() {
  
    return (EAttribute<ETypedElement<?>, Boolean>) eTypedElementEClass.getEStructuralFeatures().get(5);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<ETypedElement<?>, EClassifier<?>> getETypedElement_EType() {
  
    return (EReference<ETypedElement<?>, EClassifier<?>>) eTypedElementEClass.getEStructuralFeatures().get(6);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<ETypedElement<?>, EGenericType> getETypedElement_EGenericType() {
  
    return (EReference<ETypedElement<?>, EGenericType>) eTypedElementEClass.getEStructuralFeatures().get(7);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass<?> getEStringToStringMapEntry() {
  
    return eStringToStringMapEntryEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<?, String> getEStringToStringMapEntry_Key() {
  
    return (EAttribute<?, String>) eStringToStringMapEntryEClass.getEStructuralFeatures().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<?, String> getEStringToStringMapEntry_Value() {
  
    return (EAttribute<?, String>) eStringToStringMapEntryEClass.getEStructuralFeatures().get(1);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass<EGenericType> getEGenericType() {
  
    return eGenericTypeEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EGenericType, EGenericType> getEGenericType_EUpperBound() {
  
    return (EReference<EGenericType, EGenericType>) eGenericTypeEClass.getEStructuralFeatures().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EGenericType, EList<EGenericType>> getEGenericType_ETypeArguments() {
  
    return (EReference<EGenericType, EList<EGenericType>>) eGenericTypeEClass.getEStructuralFeatures().get(1);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EGenericType, EClassifier<?>> getEGenericType_ERawType() {
  
    return (EReference<EGenericType, EClassifier<?>>) eGenericTypeEClass.getEStructuralFeatures().get(2);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EGenericType, EGenericType> getEGenericType_ELowerBound() {
  
    return (EReference<EGenericType, EGenericType>) eGenericTypeEClass.getEStructuralFeatures().get(3);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EGenericType, ETypeParameter> getEGenericType_ETypeParameter() {
  
    return (EReference<EGenericType, ETypeParameter>) eGenericTypeEClass.getEStructuralFeatures().get(4);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EGenericType, EClassifier<?>> getEGenericType_EClassifier() {
  
    return (EReference<EGenericType, EClassifier<?>>) eGenericTypeEClass.getEStructuralFeatures().get(5);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EGenericType, Boolean> getEGenericType__IsInstance__Object() {
  
    return (EOperation<EGenericType, Boolean>) eGenericTypeEClass.getEOperations().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass<ETypeParameter> getETypeParameter() {
  
    return eTypeParameterEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<ETypeParameter, EList<EGenericType>> getETypeParameter_EBounds() {
  
    return (EReference<ETypeParameter, EList<EGenericType>>) eTypeParameterEClass.getEStructuralFeatures().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEBigDecimal() {
  
    return eBigDecimalEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEBigInteger() {
  
    return eBigIntegerEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass<EParameter<?>> getEParameter() {
  
    return eParameterEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EParameter<?>, EOperation<?, ?>> getEParameter_EOperation() {
  
    return (EReference<EParameter<?>, EOperation<?, ?>>) eParameterEClass.getEStructuralFeatures().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass<EObject> getEObject() {
  
    return eObjectEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EObject, EClass<?>> getEObject__EClass() {
  
    return (EOperation<EObject, EClass<?>>) eObjectEClass.getEOperations().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EObject, Boolean> getEObject__EIsProxy() {
  
    return (EOperation<EObject, Boolean>) eObjectEClass.getEOperations().get(1);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EObject, Resource> getEObject__EResource() {
  
    return (EOperation<EObject, Resource>) eObjectEClass.getEOperations().get(2);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EObject, EObject> getEObject__EContainer() {
  
    return (EOperation<EObject, EObject>) eObjectEClass.getEOperations().get(3);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EObject, EStructuralFeature<?, ?>> getEObject__EContainingFeature() {
  
    return (EOperation<EObject, EStructuralFeature<?, ?>>) eObjectEClass.getEOperations().get(4);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EObject, EReference<?, ?>> getEObject__EContainmentFeature() {
  
    return (EOperation<EObject, EReference<?, ?>>) eObjectEClass.getEOperations().get(5);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EObject, EList<?>> getEObject__EContents() {
  
    return (EOperation<EObject, EList<?>>) eObjectEClass.getEOperations().get(6);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EObject, TreeIterator<?>> getEObject__EAllContents() {
  
    return (EOperation<EObject, TreeIterator<?>>) eObjectEClass.getEOperations().get(7);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EObject, EList<?>> getEObject__ECrossReferences() {
  
    return (EOperation<EObject, EList<?>>) eObjectEClass.getEOperations().get(8);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EObject, Object> getEObject__EGet__EStructuralFeature() {
  
    return (EOperation<EObject, Object>) eObjectEClass.getEOperations().get(9);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EObject, Object> getEObject__EGet__EStructuralFeature_boolean() {
  
    return (EOperation<EObject, Object>) eObjectEClass.getEOperations().get(10);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EObject, Void> getEObject__ESet__EStructuralFeature_Object() {
  
    return (EOperation<EObject, Void>) eObjectEClass.getEOperations().get(11);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EObject, Boolean> getEObject__EIsSet__EStructuralFeature() {
  
    return (EOperation<EObject, Boolean>) eObjectEClass.getEOperations().get(12);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EObject, Void> getEObject__EUnset__EStructuralFeature() {
  
    return (EOperation<EObject, Void>) eObjectEClass.getEOperations().get(13);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EObject, Object> getEObject__EInvoke__EOperation_EList() {
  
    return (EOperation<EObject, Object>) eObjectEClass.getEOperations().get(14);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass<EPackage> getEPackage() {
  
    return ePackageEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EPackage, String> getEPackage_NsURI() {
  
    return (EAttribute<EPackage, String>) ePackageEClass.getEStructuralFeatures().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EPackage, String> getEPackage_NsPrefix() {
  
    return (EAttribute<EPackage, String>) ePackageEClass.getEStructuralFeatures().get(1);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EPackage, EFactory> getEPackage_EFactoryInstance() {
  
    return (EReference<EPackage, EFactory>) ePackageEClass.getEStructuralFeatures().get(2);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EPackage, EList<EClassifier<?>>> getEPackage_EClassifiers() {
  
    return (EReference<EPackage, EList<EClassifier<?>>>) ePackageEClass.getEStructuralFeatures().get(3);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EPackage, EList<EPackage>> getEPackage_ESubpackages() {
  
    return (EReference<EPackage, EList<EPackage>>) ePackageEClass.getEStructuralFeatures().get(4);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EPackage, EPackage> getEPackage_ESuperPackage() {
  
    return (EReference<EPackage, EPackage>) ePackageEClass.getEStructuralFeatures().get(5);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EPackage, EClassifier<?>> getEPackage__GetEClassifier__String() {
  
    return (EOperation<EPackage, EClassifier<?>>) ePackageEClass.getEOperations().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass<EEnum<?>> getEEnum() {
  
    return eEnumEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EEnum<?>, EList<EEnumLiteral>> getEEnum_ELiterals() {
  
    return (EReference<EEnum<?>, EList<EEnumLiteral>>) eEnumEClass.getEStructuralFeatures().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EEnum<?>, EEnumLiteral> getEEnum__GetEEnumLiteral__String() {
  
    return (EOperation<EEnum<?>, EEnumLiteral>) eEnumEClass.getEOperations().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EEnum<?>, EEnumLiteral> getEEnum__GetEEnumLiteral__int() {
  
    return (EOperation<EEnum<?>, EEnumLiteral>) eEnumEClass.getEOperations().get(1);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EEnum<?>, EEnumLiteral> getEEnum__GetEEnumLiteralByLiteral__String() {
  
    return (EOperation<EEnum<?>, EEnumLiteral>) eEnumEClass.getEOperations().get(2);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass<EEnumLiteral> getEEnumLiteral() {
  
    return eEnumLiteralEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EEnumLiteral, Integer> getEEnumLiteral_Value() {
  
    return (EAttribute<EEnumLiteral, Integer>) eEnumLiteralEClass.getEStructuralFeatures().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EEnumLiteral, Enumerator> getEEnumLiteral_Instance() {
  
    return (EAttribute<EEnumLiteral, Enumerator>) eEnumLiteralEClass.getEStructuralFeatures().get(1);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EAttribute<EEnumLiteral, String> getEEnumLiteral_Literal() {
  
    return (EAttribute<EEnumLiteral, String>) eEnumLiteralEClass.getEStructuralFeatures().get(2);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EEnumLiteral, EEnum<?>> getEEnumLiteral_EEnum() {
  
    return (EReference<EEnumLiteral, EEnum<?>>) eEnumLiteralEClass.getEStructuralFeatures().get(3);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEBoolean() {
  
    return eBooleanEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEByteObject() {
  
    return eByteObjectEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEJavaClass() {
  
    return eJavaClassEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEJavaObject() {
  
    return eJavaObjectEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getELongObject() {
  
    return eLongObjectEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEMap() {
  
    return eMapEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEShortObject() {
  
    return eShortObjectEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEString() {
  
    return eStringEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEInt() {
  
    return eIntEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEFloat() {
  
    return eFloatEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getELong() {
  
    return eLongEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEDouble() {
  
    return eDoubleEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEShort() {
  
    return eShortEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getETreeIterator() {
  
    return eTreeIteratorEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEInvocationTargetException() {
  
    return eInvocationTargetExceptionEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEFeatureMapEntry() {
  
    return eFeatureMapEntryEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEEnumerator() {
  
    return eEnumeratorEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEFeatureMap() {
  
    return eFeatureMapEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEChar() {
  
    return eCharEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEByte() {
  
    return eByteEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EDataType<?> getEByteArray() {
  
    return eByteArrayEDataType;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EcoreFactory getEcoreFactory() {
    return (EcoreFactory)getEFactoryInstance();
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;
  

    // Create classes and their features
    
    eAttributeEClass = createEClass(EATTRIBUTE);
  
    // CHANGE: Use raw type
    createEAttribute(eAttributeEClass, EATTRIBUTE__ID);
  
    // CHANGE: Use raw type
    createEReference(eAttributeEClass, EATTRIBUTE__EATTRIBUTE_TYPE);
  
  
    
  
  

  
    
    eAnnotationEClass = createEClass(EANNOTATION);
  
    // CHANGE: Use raw type
    createEAttribute(eAnnotationEClass, EANNOTATION__SOURCE);
  
    // CHANGE: Use raw type
    createEReference(eAnnotationEClass, EANNOTATION__DETAILS);
  
    // CHANGE: Use raw type
    createEReference(eAnnotationEClass, EANNOTATION__EMODEL_ELEMENT);
  
    // CHANGE: Use raw type
    createEReference(eAnnotationEClass, EANNOTATION__CONTENTS);
  
    // CHANGE: Use raw type
    createEReference(eAnnotationEClass, EANNOTATION__REFERENCES);
  
  
    
  
  

  
    
    eClassEClass = createEClass(ECLASS);
  
    // CHANGE: Use raw type
    createEAttribute(eClassEClass, ECLASS__ABSTRACT);
  
    // CHANGE: Use raw type
    createEAttribute(eClassEClass, ECLASS__INTERFACE);
  
    // CHANGE: Use raw type
    createEReference(eClassEClass, ECLASS__ESUPER_TYPES);
  
    // CHANGE: Use raw type
    createEReference(eClassEClass, ECLASS__EOPERATIONS);
  
    // CHANGE: Use raw type
    createEReference(eClassEClass, ECLASS__EALL_ATTRIBUTES);
  
    // CHANGE: Use raw type
    createEReference(eClassEClass, ECLASS__EALL_REFERENCES);
  
    // CHANGE: Use raw type
    createEReference(eClassEClass, ECLASS__EREFERENCES);
  
    // CHANGE: Use raw type
    createEReference(eClassEClass, ECLASS__EATTRIBUTES);
  
    // CHANGE: Use raw type
    createEReference(eClassEClass, ECLASS__EALL_CONTAINMENTS);
  
    // CHANGE: Use raw type
    createEReference(eClassEClass, ECLASS__EALL_OPERATIONS);
  
    // CHANGE: Use raw type
    createEReference(eClassEClass, ECLASS__EALL_STRUCTURAL_FEATURES);
  
    // CHANGE: Use raw type
    createEReference(eClassEClass, ECLASS__EALL_SUPER_TYPES);
  
    // CHANGE: Use raw type
    createEReference(eClassEClass, ECLASS__EID_ATTRIBUTE);
  
    // CHANGE: Use raw type
    createEReference(eClassEClass, ECLASS__ESTRUCTURAL_FEATURES);
  
    // CHANGE: Use raw type
    createEReference(eClassEClass, ECLASS__EGENERIC_SUPER_TYPES);
  
    // CHANGE: Use raw type
    createEReference(eClassEClass, ECLASS__EALL_GENERIC_SUPER_TYPES);
  
  
    
    createEOperation(eClassEClass, ECLASS___IS_SUPER_TYPE_OF__ECLASS);
    
    createEOperation(eClassEClass, ECLASS___GET_FEATURE_COUNT);
    
    createEOperation(eClassEClass, ECLASS___GET_ESTRUCTURAL_FEATURE__INT);
    
    createEOperation(eClassEClass, ECLASS___GET_FEATURE_ID__ESTRUCTURALFEATURE);
    
    createEOperation(eClassEClass, ECLASS___GET_ESTRUCTURAL_FEATURE__STRING);
    
    createEOperation(eClassEClass, ECLASS___GET_OPERATION_COUNT);
    
    createEOperation(eClassEClass, ECLASS___GET_EOPERATION__INT);
    
    createEOperation(eClassEClass, ECLASS___GET_OPERATION_ID__EOPERATION);
    
    createEOperation(eClassEClass, ECLASS___GET_OVERRIDE__EOPERATION);
    
    createEOperation(eClassEClass, ECLASS___GET_FEATURE_TYPE__ESTRUCTURALFEATURE);
    
  
  

  
    
    eClassifierEClass = createEClass(ECLASSIFIER);
  
    // CHANGE: Use raw type
    createEAttribute(eClassifierEClass, ECLASSIFIER__INSTANCE_CLASS_NAME);
  
    // CHANGE: Use raw type
    createEAttribute(eClassifierEClass, ECLASSIFIER__INSTANCE_CLASS);
  
    // CHANGE: Use raw type
    createEAttribute(eClassifierEClass, ECLASSIFIER__DEFAULT_VALUE);
  
    // CHANGE: Use raw type
    createEAttribute(eClassifierEClass, ECLASSIFIER__INSTANCE_TYPE_NAME);
  
    // CHANGE: Use raw type
    createEReference(eClassifierEClass, ECLASSIFIER__EPACKAGE);
  
    // CHANGE: Use raw type
    createEReference(eClassifierEClass, ECLASSIFIER__ETYPE_PARAMETERS);
  
  
    
    createEOperation(eClassifierEClass, ECLASSIFIER___IS_INSTANCE__OBJECT);
    
    createEOperation(eClassifierEClass, ECLASSIFIER___GET_CLASSIFIER_ID);
    
  
  

  
    
    eDataTypeEClass = createEClass(EDATA_TYPE);
  
    // CHANGE: Use raw type
    createEAttribute(eDataTypeEClass, EDATA_TYPE__SERIALIZABLE);
  
  
    
  
  

  
    
    eEnumEClass = createEClass(EENUM);
  
    // CHANGE: Use raw type
    createEReference(eEnumEClass, EENUM__ELITERALS);
  
  
    
    createEOperation(eEnumEClass, EENUM___GET_EENUM_LITERAL__STRING);
    
    createEOperation(eEnumEClass, EENUM___GET_EENUM_LITERAL__INT);
    
    createEOperation(eEnumEClass, EENUM___GET_EENUM_LITERAL_BY_LITERAL__STRING);
    
  
  

  
    
    eEnumLiteralEClass = createEClass(EENUM_LITERAL);
  
    // CHANGE: Use raw type
    createEAttribute(eEnumLiteralEClass, EENUM_LITERAL__VALUE);
  
    // CHANGE: Use raw type
    createEAttribute(eEnumLiteralEClass, EENUM_LITERAL__INSTANCE);
  
    // CHANGE: Use raw type
    createEAttribute(eEnumLiteralEClass, EENUM_LITERAL__LITERAL);
  
    // CHANGE: Use raw type
    createEReference(eEnumLiteralEClass, EENUM_LITERAL__EENUM);
  
  
    
  
  

  
    
    eFactoryEClass = createEClass(EFACTORY);
  
    // CHANGE: Use raw type
    createEReference(eFactoryEClass, EFACTORY__EPACKAGE);
  
  
    
    createEOperation(eFactoryEClass, EFACTORY___CREATE__ECLASS);
    
    createEOperation(eFactoryEClass, EFACTORY___CREATE_FROM_STRING__EDATATYPE_STRING);
    
    createEOperation(eFactoryEClass, EFACTORY___CONVERT_TO_STRING__EDATATYPE_OBJECT);
    
  
  

  
    
    eModelElementEClass = createEClass(EMODEL_ELEMENT);
  
    // CHANGE: Use raw type
    createEReference(eModelElementEClass, EMODEL_ELEMENT__EANNOTATIONS);
  
  
    
    createEOperation(eModelElementEClass, EMODEL_ELEMENT___GET_EANNOTATION__STRING);
    
  
  

  
    
    eNamedElementEClass = createEClass(ENAMED_ELEMENT);
  
    // CHANGE: Use raw type
    createEAttribute(eNamedElementEClass, ENAMED_ELEMENT__NAME);
  
  
    
  
  

  
    
    eObjectEClass = createEClass(EOBJECT);
  
  
    
    createEOperation(eObjectEClass, EOBJECT___ECLASS);
    
    createEOperation(eObjectEClass, EOBJECT___EIS_PROXY);
    
    createEOperation(eObjectEClass, EOBJECT___ERESOURCE);
    
    createEOperation(eObjectEClass, EOBJECT___ECONTAINER);
    
    createEOperation(eObjectEClass, EOBJECT___ECONTAINING_FEATURE);
    
    createEOperation(eObjectEClass, EOBJECT___ECONTAINMENT_FEATURE);
    
    createEOperation(eObjectEClass, EOBJECT___ECONTENTS);
    
    createEOperation(eObjectEClass, EOBJECT___EALL_CONTENTS);
    
    createEOperation(eObjectEClass, EOBJECT___ECROSS_REFERENCES);
    
    createEOperation(eObjectEClass, EOBJECT___EGET__ESTRUCTURALFEATURE);
    
    createEOperation(eObjectEClass, EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN);
    
    createEOperation(eObjectEClass, EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT);
    
    createEOperation(eObjectEClass, EOBJECT___EIS_SET__ESTRUCTURALFEATURE);
    
    createEOperation(eObjectEClass, EOBJECT___EUNSET__ESTRUCTURALFEATURE);
    
    createEOperation(eObjectEClass, EOBJECT___EINVOKE__EOPERATION_ELIST);
    
  
  

  
    
    eOperationEClass = createEClass(EOPERATION);
  
    // CHANGE: Use raw type
    createEReference(eOperationEClass, EOPERATION__ECONTAINING_CLASS);
  
    // CHANGE: Use raw type
    createEReference(eOperationEClass, EOPERATION__ETYPE_PARAMETERS);
  
    // CHANGE: Use raw type
    createEReference(eOperationEClass, EOPERATION__EPARAMETERS);
  
    // CHANGE: Use raw type
    createEReference(eOperationEClass, EOPERATION__EEXCEPTIONS);
  
    // CHANGE: Use raw type
    createEReference(eOperationEClass, EOPERATION__EGENERIC_EXCEPTIONS);
  
  
    
    createEOperation(eOperationEClass, EOPERATION___GET_OPERATION_ID);
    
    createEOperation(eOperationEClass, EOPERATION___IS_OVERRIDE_OF__EOPERATION);
    
  
  

  
    
    ePackageEClass = createEClass(EPACKAGE);
  
    // CHANGE: Use raw type
    createEAttribute(ePackageEClass, EPACKAGE__NS_URI);
  
    // CHANGE: Use raw type
    createEAttribute(ePackageEClass, EPACKAGE__NS_PREFIX);
  
    // CHANGE: Use raw type
    createEReference(ePackageEClass, EPACKAGE__EFACTORY_INSTANCE);
  
    // CHANGE: Use raw type
    createEReference(ePackageEClass, EPACKAGE__ECLASSIFIERS);
  
    // CHANGE: Use raw type
    createEReference(ePackageEClass, EPACKAGE__ESUBPACKAGES);
  
    // CHANGE: Use raw type
    createEReference(ePackageEClass, EPACKAGE__ESUPER_PACKAGE);
  
  
    
    createEOperation(ePackageEClass, EPACKAGE___GET_ECLASSIFIER__STRING);
    
  
  

  
    
    eParameterEClass = createEClass(EPARAMETER);
  
    // CHANGE: Use raw type
    createEReference(eParameterEClass, EPARAMETER__EOPERATION);
  
  
    
  
  

  
    
    eReferenceEClass = createEClass(EREFERENCE);
  
    // CHANGE: Use raw type
    createEAttribute(eReferenceEClass, EREFERENCE__CONTAINMENT);
  
    // CHANGE: Use raw type
    createEAttribute(eReferenceEClass, EREFERENCE__CONTAINER);
  
    // CHANGE: Use raw type
    createEAttribute(eReferenceEClass, EREFERENCE__RESOLVE_PROXIES);
  
    // CHANGE: Use raw type
    createEReference(eReferenceEClass, EREFERENCE__EOPPOSITE);
  
    // CHANGE: Use raw type
    createEReference(eReferenceEClass, EREFERENCE__EREFERENCE_TYPE);
  
    // CHANGE: Use raw type
    createEReference(eReferenceEClass, EREFERENCE__EKEYS);
  
  
    
  
  

  
    
    eStructuralFeatureEClass = createEClass(ESTRUCTURAL_FEATURE);
  
    // CHANGE: Use raw type
    createEAttribute(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__CHANGEABLE);
  
    // CHANGE: Use raw type
    createEAttribute(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__VOLATILE);
  
    // CHANGE: Use raw type
    createEAttribute(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__TRANSIENT);
  
    // CHANGE: Use raw type
    createEAttribute(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL);
  
    // CHANGE: Use raw type
    createEAttribute(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__DEFAULT_VALUE);
  
    // CHANGE: Use raw type
    createEAttribute(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__UNSETTABLE);
  
    // CHANGE: Use raw type
    createEAttribute(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__DERIVED);
  
    // CHANGE: Use raw type
    createEReference(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__ECONTAINING_CLASS);
  
  
    
    createEOperation(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE___GET_FEATURE_ID);
    
    createEOperation(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE___GET_CONTAINER_CLASS);
    
  
  

  
    
    eTypedElementEClass = createEClass(ETYPED_ELEMENT);
  
    // CHANGE: Use raw type
    createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__ORDERED);
  
    // CHANGE: Use raw type
    createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__UNIQUE);
  
    // CHANGE: Use raw type
    createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__LOWER_BOUND);
  
    // CHANGE: Use raw type
    createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__UPPER_BOUND);
  
    // CHANGE: Use raw type
    createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__MANY);
  
    // CHANGE: Use raw type
    createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__REQUIRED);
  
    // CHANGE: Use raw type
    createEReference(eTypedElementEClass, ETYPED_ELEMENT__ETYPE);
  
    // CHANGE: Use raw type
    createEReference(eTypedElementEClass, ETYPED_ELEMENT__EGENERIC_TYPE);
  
  
    
  
  

  
    
    eStringToStringMapEntryEClass = createEClass(ESTRING_TO_STRING_MAP_ENTRY);
  
    // CHANGE: Use raw type
    createEAttribute(eStringToStringMapEntryEClass, ESTRING_TO_STRING_MAP_ENTRY__KEY);
  
    // CHANGE: Use raw type
    createEAttribute(eStringToStringMapEntryEClass, ESTRING_TO_STRING_MAP_ENTRY__VALUE);
  
  
    
  
  

  
    
    eGenericTypeEClass = createEClass(EGENERIC_TYPE);
  
    // CHANGE: Use raw type
    createEReference(eGenericTypeEClass, EGENERIC_TYPE__EUPPER_BOUND);
  
    // CHANGE: Use raw type
    createEReference(eGenericTypeEClass, EGENERIC_TYPE__ETYPE_ARGUMENTS);
  
    // CHANGE: Use raw type
    createEReference(eGenericTypeEClass, EGENERIC_TYPE__ERAW_TYPE);
  
    // CHANGE: Use raw type
    createEReference(eGenericTypeEClass, EGENERIC_TYPE__ELOWER_BOUND);
  
    // CHANGE: Use raw type
    createEReference(eGenericTypeEClass, EGENERIC_TYPE__ETYPE_PARAMETER);
  
    // CHANGE: Use raw type
    createEReference(eGenericTypeEClass, EGENERIC_TYPE__ECLASSIFIER);
  
  
    
    createEOperation(eGenericTypeEClass, EGENERIC_TYPE___IS_INSTANCE__OBJECT);
    
  
  

  
    
    eTypeParameterEClass = createEClass(ETYPE_PARAMETER);
  
    // CHANGE: Use raw type
    createEReference(eTypeParameterEClass, ETYPE_PARAMETER__EBOUNDS);
  
  
    
  
  
    
  
  
  

    // Create data types
    
    eBigDecimalEDataType = createEDataType(EBIG_DECIMAL);
    
    eBigIntegerEDataType = createEDataType(EBIG_INTEGER);
    
    eBooleanEDataType = createEDataType(EBOOLEAN);
    
    eBooleanObjectEDataType = createEDataType(EBOOLEAN_OBJECT);
    
    eByteEDataType = createEDataType(EBYTE);
    
    eByteArrayEDataType = createEDataType(EBYTE_ARRAY);
    
    eByteObjectEDataType = createEDataType(EBYTE_OBJECT);
    
    eCharEDataType = createEDataType(ECHAR);
    
    eCharacterObjectEDataType = createEDataType(ECHARACTER_OBJECT);
    
    eDateEDataType = createEDataType(EDATE);
    
    eDiagnosticChainEDataType = createEDataType(EDIAGNOSTIC_CHAIN);
    
    eDoubleEDataType = createEDataType(EDOUBLE);
    
    eDoubleObjectEDataType = createEDataType(EDOUBLE_OBJECT);
    
    eeListEDataType = createEDataType(EE_LIST);
    
    eEnumeratorEDataType = createEDataType(EENUMERATOR);
    
    eFeatureMapEDataType = createEDataType(EFEATURE_MAP);
    
    eFeatureMapEntryEDataType = createEDataType(EFEATURE_MAP_ENTRY);
    
    eFloatEDataType = createEDataType(EFLOAT);
    
    eFloatObjectEDataType = createEDataType(EFLOAT_OBJECT);
    
    eIntEDataType = createEDataType(EINT);
    
    eIntegerObjectEDataType = createEDataType(EINTEGER_OBJECT);
    
    eJavaClassEDataType = createEDataType(EJAVA_CLASS);
    
    eJavaObjectEDataType = createEDataType(EJAVA_OBJECT);
    
    eLongEDataType = createEDataType(ELONG);
    
    eLongObjectEDataType = createEDataType(ELONG_OBJECT);
    
    eMapEDataType = createEDataType(EMAP);
    
    eResourceEDataType = createEDataType(ERESOURCE);
    
    eResourceSetEDataType = createEDataType(ERESOURCE_SET);
    
    eShortEDataType = createEDataType(ESHORT);
    
    eShortObjectEDataType = createEDataType(ESHORT_OBJECT);
    
    eStringEDataType = createEDataType(ESTRING);
    
    eTreeIteratorEDataType = createEDataType(ETREE_ITERATOR);
    
    eInvocationTargetExceptionEDataType = createEDataType(EINVOCATION_TARGET_EXCEPTION);
    
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);
  
  
  
    

    // Create type parameters
  
    
  
    ETypeParameter eAttributeEClass_C = addETypeParameter(eAttributeEClass, "C");
  
    
  
    ETypeParameter eAttributeEClass_V = addETypeParameter(eAttributeEClass, "V");
  
    
  
    
  
    
  
    ETypeParameter eClassEClass_T = addETypeParameter(eClassEClass, "T");
  
    
  
    
  
    ETypeParameter eClassifierEClass_T = addETypeParameter(eClassifierEClass, "T");
  
    
  
    
  
    ETypeParameter eDataTypeEClass_T = addETypeParameter(eDataTypeEClass, "T");
  
    
  
    
  
    ETypeParameter eEnumEClass_T = addETypeParameter(eEnumEClass, "T");
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    ETypeParameter eOperationEClass_C = addETypeParameter(eOperationEClass, "C");
  
    
  
    ETypeParameter eOperationEClass_V = addETypeParameter(eOperationEClass, "V");
  
    
  
    
  
    
  
    ETypeParameter eParameterEClass_T = addETypeParameter(eParameterEClass, "T");
  
    
  
    
  
    ETypeParameter eReferenceEClass_C = addETypeParameter(eReferenceEClass, "C");
  
    
  
    ETypeParameter eReferenceEClass_V = addETypeParameter(eReferenceEClass, "V");
  
    
  
    
  
    ETypeParameter eStructuralFeatureEClass_C = addETypeParameter(eStructuralFeatureEClass, "C");
  
    
  
    ETypeParameter eStructuralFeatureEClass_V = addETypeParameter(eStructuralFeatureEClass, "V");
  
    
  
    
  
    ETypeParameter eTypedElementEClass_C = addETypeParameter(eTypedElementEClass, "C");
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    addETypeParameter(eeListEDataType, "E");
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    addETypeParameter(eJavaClassEDataType, "T");
  
    
  
    
  
    
  
    
  
    
  
    addETypeParameter(eMapEDataType, "K");
  
    
  
    addETypeParameter(eMapEDataType, "V");
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    addETypeParameter(eTreeIteratorEDataType, "E");
  
    
  
    
  
    
    

    // Set bounds for type parameters
  
    
  
    
    EGenericType g1 = createEGenericType(this.getEObject());
  
    
    eAttributeEClass_C.getEBounds().add(g1);
  
    
  
    
  
    
  
    
  
    
    g1 = createEGenericType(this.getEObject());
  
    
    eClassEClass_T.getEBounds().add(g1);
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
    g1 = createEGenericType(this.getEObject());
  
    
    eOperationEClass_C.getEBounds().add(g1);
  
    
  
    
  
    
  
    
  
    
  
    
  
    
    g1 = createEGenericType(this.getEObject());
  
    
    eReferenceEClass_C.getEBounds().add(g1);
  
    
  
    
  
    
  
    
    g1 = createEGenericType(this.getEObject());
  
    
    eStructuralFeatureEClass_C.getEBounds().add(g1);
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    

    // Add supertypes to classes
    
  
    
  
    g1 = createEGenericType(this.getEStructuralFeature());
    
  
    EGenericType g2 = createEGenericType(eAttributeEClass_C);
    
    g1.getETypeArguments().add(g2);
    
  
    g2 = createEGenericType(eAttributeEClass_V);
    
    g1.getETypeArguments().add(g2);
    
  
    eAttributeEClass.getEGenericSuperTypes().add(g1);
    
  
    
  
    
    eAnnotationEClass.getESuperTypes().add(this.getEModelElement());
    
  
    
  
    
  
    g1 = createEGenericType(this.getEClassifier());
    
  
    g2 = createEGenericType(eClassEClass_T);
    
    g1.getETypeArguments().add(g2);
    
  
    eClassEClass.getEGenericSuperTypes().add(g1);
    
  
    
  
    
    eClassifierEClass.getESuperTypes().add(this.getENamedElement());
    
  
    
  
    
  
    g1 = createEGenericType(this.getEClassifier());
    
  
    g2 = createEGenericType(eDataTypeEClass_T);
    
    g1.getETypeArguments().add(g2);
    
  
    eDataTypeEClass.getEGenericSuperTypes().add(g1);
    
  
    
  
    
  
    g1 = createEGenericType(this.getEDataType());
    
  
    g2 = createEGenericType(eEnumEClass_T);
    
    g1.getETypeArguments().add(g2);
    
  
    eEnumEClass.getEGenericSuperTypes().add(g1);
    
  
    
  
    
    eEnumLiteralEClass.getESuperTypes().add(this.getENamedElement());
    
  
    
  
    
    eFactoryEClass.getESuperTypes().add(this.getEModelElement());
    
  
    
  
    
  
    
  
    
    eNamedElementEClass.getESuperTypes().add(this.getEModelElement());
    
  
    
  
    
  
    
  
    
  
    g1 = createEGenericType(this.getETypedElement());
    
  
    g2 = createEGenericType(eOperationEClass_V);
    
    g1.getETypeArguments().add(g2);
    
  
    eOperationEClass.getEGenericSuperTypes().add(g1);
    
  
    
  
    
    ePackageEClass.getESuperTypes().add(this.getENamedElement());
    
  
    
  
    
  
    g1 = createEGenericType(this.getETypedElement());
    
  
    g2 = createEGenericType(eParameterEClass_T);
    
    g1.getETypeArguments().add(g2);
    
  
    eParameterEClass.getEGenericSuperTypes().add(g1);
    
  
    
  
    
  
    g1 = createEGenericType(this.getEStructuralFeature());
    
  
    g2 = createEGenericType(eReferenceEClass_C);
    
    g1.getETypeArguments().add(g2);
    
  
    g2 = createEGenericType(eReferenceEClass_V);
    
    g1.getETypeArguments().add(g2);
    
  
    eReferenceEClass.getEGenericSuperTypes().add(g1);
    
  
    
  
    
  
    g1 = createEGenericType(this.getETypedElement());
    
  
    g2 = createEGenericType(eStructuralFeatureEClass_V);
    
    g1.getETypeArguments().add(g2);
    
  
    eStructuralFeatureEClass.getEGenericSuperTypes().add(g1);
    
  
    
  
    
    eTypedElementEClass.getESuperTypes().add(this.getENamedElement());
    
  
    
  
    
  
    
  
    
  
    
  
    
    eTypeParameterEClass.getESuperTypes().add(this.getENamedElement());
    
  
    

    // Initialize classes, features, and operations; add parameters
    
    initEClass(eAttributeEClass, EAttribute.class, "EAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
    
    
    initEAttribute(getEAttribute_ID(), this.getEBoolean(), "iD", null, 0, 1, EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
  
    g1 = createEGenericType(this.getEDataType());
    
  
    g2 = createEGenericType(eAttributeEClass_V);
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEAttribute_EAttributeType(), g1, null, "eAttributeType", null, 1, 1, EAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
  
    
  
  
  

  
    
    initEClass(eAnnotationEClass, EAnnotation.class, "EAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
    
    
    initEAttribute(getEAnnotation_Source(), this.getEString(), "source", null, 0, 1, EAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
    
    
    initEReference(getEAnnotation_Details(), this.getEStringToStringMapEntry(), null, "details", null, 0, -1, EAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
    
    
    initEReference(getEAnnotation_EModelElement(), this.getEModelElement(), this.getEModelElement_EAnnotations(), "eModelElement", null, 0, 1, EAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
    
    
    initEReference(getEAnnotation_Contents(), this.getEObject(), null, "contents", null, 0, -1, EAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
    
    
    initEReference(getEAnnotation_References(), this.getEObject(), null, "references", null, 0, -1, EAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
  
  

  
    
    initEClass(eClassEClass, EClass.class, "EClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
    
    
    initEAttribute(getEClass_Abstract(), this.getEBoolean(), "abstract", null, 0, 1, EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
    
    initEAttribute(getEClass_Interface(), this.getEBoolean(), "interface", null, 0, 1, EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
  
    g1 = createEGenericType(this.getEClass());
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEClass_ESuperTypes(), g1, null, "eSuperTypes", null, 0, -1, EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
  
    g1 = createEGenericType(this.getEOperation());
    
  
    g2 = createEGenericType(eClassEClass_T);
    
    g1.getETypeArguments().add(g2);
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEClass_EOperations(), g1, this.getEOperation_EContainingClass(), "eOperations", null, 0, -1, EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
  
    g1 = createEGenericType(this.getEAttribute());
    
  
    g2 = createEGenericType(eClassEClass_T);
    
    g1.getETypeArguments().add(g2);
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEClass_EAllAttributes(), g1, null, "eAllAttributes", null, 0, -1, EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
  
    
  
    
  
    g1 = createEGenericType(this.getEReference());
    
  
    g2 = createEGenericType(eClassEClass_T);
    
    g1.getETypeArguments().add(g2);
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEClass_EAllReferences(), g1, null, "eAllReferences", null, 0, -1, EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
  
    
  
    
  
    g1 = createEGenericType(this.getEReference());
    
  
    g2 = createEGenericType(eClassEClass_T);
    
    g1.getETypeArguments().add(g2);
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEClass_EReferences(), g1, null, "eReferences", null, 0, -1, EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
  
    
  
    
  
    g1 = createEGenericType(this.getEAttribute());
    
  
    g2 = createEGenericType(eClassEClass_T);
    
    g1.getETypeArguments().add(g2);
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEClass_EAttributes(), g1, null, "eAttributes", null, 0, -1, EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
  
    
  
    
  
    g1 = createEGenericType(this.getEReference());
    
  
    g2 = createEGenericType(eClassEClass_T);
    
    g1.getETypeArguments().add(g2);
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEClass_EAllContainments(), g1, null, "eAllContainments", null, 0, -1, EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
  
    
  
    
  
    g1 = createEGenericType(this.getEOperation());
    
  
    g2 = createEGenericType(eClassEClass_T);
    
    g1.getETypeArguments().add(g2);
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEClass_EAllOperations(), g1, null, "eAllOperations", null, 0, -1, EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
  
    
  
    
  
    g1 = createEGenericType(this.getEStructuralFeature());
    
  
    g2 = createEGenericType(eClassEClass_T);
    
    g1.getETypeArguments().add(g2);
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEClass_EAllStructuralFeatures(), g1, null, "eAllStructuralFeatures", null, 0, -1, EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
  
    
  
    
  
    g1 = createEGenericType(this.getEClass());
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEClass_EAllSuperTypes(), g1, null, "eAllSuperTypes", null, 0, -1, EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
  
    
  
    
  
    g1 = createEGenericType(this.getEAttribute());
    
  
    g2 = createEGenericType(eClassEClass_T);
    
    g1.getETypeArguments().add(g2);
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEClass_EIDAttribute(), g1, null, "eIDAttribute", null, 0, 1, EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
  
    
  
    
  
    g1 = createEGenericType(this.getEStructuralFeature());
    
  
    g2 = createEGenericType(eClassEClass_T);
    
    g1.getETypeArguments().add(g2);
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEClass_EStructuralFeatures(), g1, this.getEStructuralFeature_EContainingClass(), "eStructuralFeatures", null, 0, -1, EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
    
    
    initEReference(getEClass_EGenericSuperTypes(), this.getEGenericType(), null, "eGenericSuperTypes", null, 0, -1, EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
    
    
    initEReference(getEClass_EAllGenericSuperTypes(), this.getEGenericType(), null, "eAllGenericSuperTypes", null, 0, -1, EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
  
    
  
  

    
    EOperation op = initEOperation(getEClass__IsSuperTypeOf__EClass(), this.getEBoolean(), "isSuperTypeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
  
    
    g1 = createEGenericType(this.getEClass());
  
    
    g2 = createEGenericType();
  
    g1.getETypeArguments().add(g2);
  
    
  
  
    addEParameter(op, g1, "someClass", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  

    
    initEOperation(getEClass__GetFeatureCount(), this.getEInt(), "getFeatureCount", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
    
  
    
    
  

    
    op = initEOperation(getEClass__GetEStructuralFeature__int(), null, "getEStructuralFeature", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
  
  
    addEParameter(op, this.getEInt(), "featureID", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  
    g1 = createEGenericType(this.getEStructuralFeature());
    
  
    g2 = createEGenericType(eClassEClass_T);
    
    g1.getETypeArguments().add(g2);
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    initEOperation(op, g1);
    
  

    
    op = initEOperation(getEClass__GetFeatureID__EStructuralFeature(), this.getEInt(), "getFeatureID", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
  
    
    g1 = createEGenericType(this.getEStructuralFeature());
  
    
    g2 = createEGenericType();
  
    g1.getETypeArguments().add(g2);
  
    
    g2 = createEGenericType();
  
    g1.getETypeArguments().add(g2);
  
    
  
  
    addEParameter(op, g1, "feature", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  

    
    op = initEOperation(getEClass__GetEStructuralFeature__String(), null, "getEStructuralFeature", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
  
  
    addEParameter(op, this.getEString(), "featureName", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  
    g1 = createEGenericType(this.getEStructuralFeature());
    
  
    g2 = createEGenericType(eClassEClass_T);
    
    g1.getETypeArguments().add(g2);
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    initEOperation(op, g1);
    
  

    
    initEOperation(getEClass__GetOperationCount(), this.getEInt(), "getOperationCount", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
    
  
    
    
  

    
    op = initEOperation(getEClass__GetEOperation__int(), null, "getEOperation", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
  
  
    addEParameter(op, this.getEInt(), "operationID", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  
    g1 = createEGenericType(this.getEOperation());
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    initEOperation(op, g1);
    
  

    
    op = initEOperation(getEClass__GetOperationID__EOperation(), this.getEInt(), "getOperationID", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
  
    
    g1 = createEGenericType(this.getEOperation());
  
    
    g2 = createEGenericType();
  
    g1.getETypeArguments().add(g2);
  
    
    g2 = createEGenericType();
  
    g1.getETypeArguments().add(g2);
  
    
  
  
    addEParameter(op, g1, "operation", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  

    
    op = initEOperation(getEClass__GetOverride__EOperation(), null, "getOverride", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    ETypeParameter t1 = addETypeParameter(op, "V");
    
  
    
    
  
    
    g1 = createEGenericType(this.getEOperation());
  
    
    g2 = createEGenericType();
  
    g1.getETypeArguments().add(g2);
  
    
    g2 = createEGenericType(t1);
  
    g1.getETypeArguments().add(g2);
  
    
  
  
    addEParameter(op, g1, "operation", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  
    g1 = createEGenericType(this.getEOperation());
    
  
    g2 = createEGenericType(eClassEClass_T);
    
    g1.getETypeArguments().add(g2);
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    EGenericType g3 = createEGenericType(t1);
    
    g2.setEUpperBound(g3);
    
  
    initEOperation(op, g1);
    
  

    
    op = initEOperation(getEClass__GetFeatureType__EStructuralFeature(), this.getEGenericType(), "getFeatureType", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
  
    
    g1 = createEGenericType(this.getEStructuralFeature());
  
    
    g2 = createEGenericType();
  
    g1.getETypeArguments().add(g2);
  
    
    g2 = createEGenericType();
  
    g1.getETypeArguments().add(g2);
  
    
  
  
    addEParameter(op, g1, "feature", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  
  

  
    
    initEClass(eClassifierEClass, EClassifier.class, "EClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
    
    
    initEAttribute(getEClassifier_InstanceClassName(), this.getEString(), "instanceClassName", null, 0, 1, EClassifier.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
  
    g1 = createEGenericType(this.getEJavaClass());
    
  
    g2 = createEGenericType(eClassifierEClass_T);
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    initEAttribute(getEClassifier_InstanceClass(), g1, "instanceClass", null, 0, 1, EClassifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    
  
    
  
    g1 = createEGenericType(eClassifierEClass_T);
    
  
    
    
    initEAttribute(getEClassifier_DefaultValue(), g1, "defaultValue", null, 0, 1, EClassifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    
  
    
    
    initEAttribute(getEClassifier_InstanceTypeName(), this.getEString(), "instanceTypeName", null, 0, 1, EClassifier.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
    
    
    initEReference(getEClassifier_EPackage(), this.getEPackage(), this.getEPackage_EClassifiers(), "ePackage", null, 0, 1, EClassifier.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
    
    
    initEReference(getEClassifier_ETypeParameters(), this.getETypeParameter(), null, "eTypeParameters", null, 0, -1, EClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
  

    
    op = initEOperation(getEClassifier__IsInstance__Object(), this.getEBoolean(), "isInstance", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
  
  
    addEParameter(op, this.getEJavaObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  

    
    initEOperation(getEClassifier__GetClassifierID(), this.getEInt(), "getClassifierID", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
    
  
    
    
  
  

  
    
    initEClass(eDataTypeEClass, EDataType.class, "EDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
    
    
    initEAttribute(getEDataType_Serializable(), this.getEBoolean(), "serializable", "true", 0, 1, EDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
  
  

  
    
    initEClass(eEnumEClass, EEnum.class, "EEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
    
    
    
    initEReference(getEEnum_ELiterals(), this.getEEnumLiteral(), this.getEEnumLiteral_EEnum(), "eLiterals", null, 0, -1, EEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
  

    
    op = initEOperation(getEEnum__GetEEnumLiteral__String(), this.getEEnumLiteral(), "getEEnumLiteral", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
  
  
    addEParameter(op, this.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  

    
    op = initEOperation(getEEnum__GetEEnumLiteral__int(), this.getEEnumLiteral(), "getEEnumLiteral", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
  
  
    addEParameter(op, this.getEInt(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  

    
    op = initEOperation(getEEnum__GetEEnumLiteralByLiteral__String(), this.getEEnumLiteral(), "getEEnumLiteralByLiteral", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
  
  
    addEParameter(op, this.getEString(), "literal", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  
  

  
    
    initEClass(eEnumLiteralEClass, EEnumLiteral.class, "EEnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
    
    
    initEAttribute(getEEnumLiteral_Value(), this.getEInt(), "value", null, 0, 1, EEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
    
    initEAttribute(getEEnumLiteral_Instance(), this.getEEnumerator(), "instance", null, 0, 1, EEnumLiteral.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
    
    initEAttribute(getEEnumLiteral_Literal(), this.getEString(), "literal", null, 0, 1, EEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
  
    g1 = createEGenericType(this.getEEnum());
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEEnumLiteral_EEnum(), g1, this.getEEnum_ELiterals(), "eEnum", null, 0, 1, EEnumLiteral.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
  
  

  
    
    initEClass(eFactoryEClass, EFactory.class, "EFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
    
    
    
    initEReference(getEFactory_EPackage(), this.getEPackage(), this.getEPackage_EFactoryInstance(), "ePackage", null, 1, 1, EFactory.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
  

    
    op = initEOperation(getEFactory__Create__EClass(), null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    t1 = addETypeParameter(op, "T");
    
  
    g1 = createEGenericType(this.getEObject());
    
  
    t1.getEBounds().add(g1);
    
  
    
    
  
    
    g1 = createEGenericType(this.getEClass());
  
    
    g2 = createEGenericType(t1);
  
    g1.getETypeArguments().add(g2);
  
    
  
  
    addEParameter(op, g1, "eClass", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  
    g1 = createEGenericType(t1);
    
  
    initEOperation(op, g1);
    
  

    
    op = initEOperation(getEFactory__CreateFromString__EDataType_String(), null, "createFromString", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    t1 = addETypeParameter(op, "T");
    
  
    
    
  
    
    g1 = createEGenericType(this.getEDataType());
  
    
    g2 = createEGenericType(t1);
  
    g1.getETypeArguments().add(g2);
  
    
  
  
    addEParameter(op, g1, "eDataType", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
  
  
    addEParameter(op, this.getEString(), "literalValue", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  
    g1 = createEGenericType(t1);
    
  
    initEOperation(op, g1);
    
  

    
    op = initEOperation(getEFactory__ConvertToString__EDataType_Object(), this.getEString(), "convertToString", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    t1 = addETypeParameter(op, "T");
    
  
    
    
  
    
    g1 = createEGenericType(this.getEDataType());
  
    
    g2 = createEGenericType(t1);
  
    g1.getETypeArguments().add(g2);
  
    
  
  
    addEParameter(op, g1, "eDataType", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
  
    
    g1 = createEGenericType(t1);
  
    
  
  
    addEParameter(op, g1, "instanceValue", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  
  

  
    
    initEClass(eModelElementEClass, EModelElement.class, "EModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
    
    
    
    initEReference(getEModelElement_EAnnotations(), this.getEAnnotation(), this.getEAnnotation_EModelElement(), "eAnnotations", null, 0, -1, EModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
  

    
    op = initEOperation(getEModelElement__GetEAnnotation__String(), this.getEAnnotation(), "getEAnnotation", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
  
  
    addEParameter(op, this.getEString(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  
  

  
    
    initEClass(eNamedElementEClass, ENamedElement.class, "ENamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
    
    
    initEAttribute(getENamedElement_Name(), this.getEString(), "name", null, 0, 1, ENamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
  
  

  
    
    initEClass(eObjectEClass, EObject.class, "EObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
  

    
    op = initEOperation(getEObject__EClass(), null, "eClass", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
    
  
    
    
  
    g1 = createEGenericType(this.getEClass());
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    g3 = createEGenericType(this.getEObject());
    
    g2.setEUpperBound(g3);
    
  
    initEOperation(op, g1);
    
  

    
    initEOperation(getEObject__EIsProxy(), this.getEBoolean(), "eIsProxy", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
    
  
    
    
  

    
    initEOperation(getEObject__EResource(), this.getEResource(), "eResource", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
    
  
    
    
  

    
    initEOperation(getEObject__EContainer(), this.getEObject(), "eContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
    
  
    
    
  

    
    op = initEOperation(getEObject__EContainingFeature(), null, "eContainingFeature", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
    
  
    
    
  
    g1 = createEGenericType(this.getEStructuralFeature());
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    g3 = createEGenericType(this.getEObject());
    
    g2.setEUpperBound(g3);
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    g3 = createEGenericType(this.getEObject());
    
    g2.setEUpperBound(g3);
    
  
    initEOperation(op, g1);
    
  

    
    op = initEOperation(getEObject__EContainmentFeature(), null, "eContainmentFeature", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
    
  
    
    
  
    g1 = createEGenericType(this.getEReference());
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    g3 = createEGenericType(this.getEObject());
    
    g2.setEUpperBound(g3);
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    g3 = createEGenericType(this.getEObject());
    
    g2.setEUpperBound(g3);
    
  
    initEOperation(op, g1);
    
  

    
    op = initEOperation(getEObject__EContents(), null, "eContents", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
    
  
    
    
  
    g1 = createEGenericType(this.getEEList());
    
  
    g2 = createEGenericType(this.getEObject());
    
    g1.getETypeArguments().add(g2);
    
  
    initEOperation(op, g1);
    
  

    
    op = initEOperation(getEObject__EAllContents(), null, "eAllContents", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
    
  
    
    
  
    g1 = createEGenericType(this.getETreeIterator());
    
  
    g2 = createEGenericType(this.getEObject());
    
    g1.getETypeArguments().add(g2);
    
  
    initEOperation(op, g1);
    
  

    
    op = initEOperation(getEObject__ECrossReferences(), null, "eCrossReferences", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
    
  
    
    
  
    g1 = createEGenericType(this.getEEList());
    
  
    g2 = createEGenericType(this.getEObject());
    
    g1.getETypeArguments().add(g2);
    
  
    initEOperation(op, g1);
    
  

    
    op = initEOperation(getEObject__EGet__EStructuralFeature(), null, "eGet", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    t1 = addETypeParameter(op, "T");
    
  
    
    
  
    
    g1 = createEGenericType(this.getEStructuralFeature());
  
    
    g2 = createEGenericType();
  
    g1.getETypeArguments().add(g2);
  
    
    g2 = createEGenericType(t1);
  
    g1.getETypeArguments().add(g2);
  
    
  
  
    addEParameter(op, g1, "feature", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  
    g1 = createEGenericType(t1);
    
  
    initEOperation(op, g1);
    
  

    
    op = initEOperation(getEObject__EGet__EStructuralFeature_boolean(), null, "eGet", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    t1 = addETypeParameter(op, "T");
    
  
    
    
  
    
    g1 = createEGenericType(this.getEStructuralFeature());
  
    
    g2 = createEGenericType();
  
    g1.getETypeArguments().add(g2);
  
    
    g2 = createEGenericType(t1);
  
    g1.getETypeArguments().add(g2);
  
    
  
  
    addEParameter(op, g1, "feature", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
  
  
    addEParameter(op, this.getEBoolean(), "resolve", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  
    g1 = createEGenericType(t1);
    
  
    initEOperation(op, g1);
    
  

    
    op = initEOperation(getEObject__ESet__EStructuralFeature_Object(), null, "eSet", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    t1 = addETypeParameter(op, "T");
    
  
    
    
  
    
    g1 = createEGenericType(this.getEStructuralFeature());
  
    
    g2 = createEGenericType();
  
    g1.getETypeArguments().add(g2);
  
    
    g2 = createEGenericType(t1);
  
    g1.getETypeArguments().add(g2);
  
    
  
  
    addEParameter(op, g1, "feature", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
  
    
    g1 = createEGenericType(t1);
  
    
  
  
    addEParameter(op, g1, "newValue", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  

    
    op = initEOperation(getEObject__EIsSet__EStructuralFeature(), this.getEBoolean(), "eIsSet", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
  
    
    g1 = createEGenericType(this.getEStructuralFeature());
  
    
    g2 = createEGenericType();
  
    g1.getETypeArguments().add(g2);
  
    
    g2 = createEGenericType();
  
    g1.getETypeArguments().add(g2);
  
    
  
  
    addEParameter(op, g1, "feature", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  

    
    op = initEOperation(getEObject__EUnset__EStructuralFeature(), null, "eUnset", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
  
    
    g1 = createEGenericType(this.getEStructuralFeature());
  
    
    g2 = createEGenericType();
  
    g1.getETypeArguments().add(g2);
  
    
    g2 = createEGenericType();
  
    g1.getETypeArguments().add(g2);
  
    
  
  
    addEParameter(op, g1, "feature", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  

    
    op = initEOperation(getEObject__EInvoke__EOperation_EList(), null, "eInvoke", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    t1 = addETypeParameter(op, "T");
    
  
    
    
  
    
    g1 = createEGenericType(this.getEOperation());
  
    
    g2 = createEGenericType();
  
    g1.getETypeArguments().add(g2);
  
    
    g2 = createEGenericType(t1);
  
    g1.getETypeArguments().add(g2);
  
    
  
  
    addEParameter(op, g1, "operation", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
  
    
    g1 = createEGenericType(this.getEEList());
  
    
    g2 = createEGenericType();
  
    g1.getETypeArguments().add(g2);
  
    
  
  
    addEParameter(op, g1, "arguments", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    addEException(op, this.getEInvocationTargetException());
  
    
    
  
    g1 = createEGenericType(t1);
    
  
    initEOperation(op, g1);
    
  
  

  
    
    initEClass(eOperationEClass, EOperation.class, "EOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
    
  
    g1 = createEGenericType(this.getEClass());
    
  
    g2 = createEGenericType(eOperationEClass_C);
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEOperation_EContainingClass(), g1, this.getEClass_EOperations(), "eContainingClass", null, 0, 1, EOperation.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
    
    
    initEReference(getEOperation_ETypeParameters(), this.getETypeParameter(), null, "eTypeParameters", null, 0, -1, EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
  
    g1 = createEGenericType(this.getEParameter());
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEOperation_EParameters(), g1, this.getEParameter_EOperation(), "eParameters", null, 0, -1, EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
  
    g1 = createEGenericType(this.getEClassifier());
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEOperation_EExceptions(), g1, null, "eExceptions", null, 0, -1, EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
    
    
    initEReference(getEOperation_EGenericExceptions(), this.getEGenericType(), null, "eGenericExceptions", null, 0, -1, EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
  

    
    initEOperation(getEOperation__GetOperationID(), this.getEInt(), "getOperationID", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
    
  
    
    
  

    
    op = initEOperation(getEOperation__IsOverrideOf__EOperation(), this.getEBoolean(), "isOverrideOf", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
  
    
    g1 = createEGenericType(this.getEOperation());
  
    
    g2 = createEGenericType();
  
    g1.getETypeArguments().add(g2);
  
    
    g2 = createEGenericType();
  
    g1.getETypeArguments().add(g2);
  
    
  
  
    addEParameter(op, g1, "someOperation", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  
  

  
    
    initEClass(ePackageEClass, EPackage.class, "EPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
    
    
    initEAttribute(getEPackage_NsURI(), this.getEString(), "nsURI", null, 0, 1, EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
    
    initEAttribute(getEPackage_NsPrefix(), this.getEString(), "nsPrefix", null, 0, 1, EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
    
    
    initEReference(getEPackage_EFactoryInstance(), this.getEFactory(), this.getEFactory_EPackage(), "eFactoryInstance", null, 1, 1, EPackage.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
  
    g1 = createEGenericType(this.getEClassifier());
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEPackage_EClassifiers(), g1, this.getEClassifier_EPackage(), "eClassifiers", null, 0, -1, EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
    
    
    initEReference(getEPackage_ESubpackages(), this.getEPackage(), this.getEPackage_ESuperPackage(), "eSubpackages", null, 0, -1, EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
    
    
    initEReference(getEPackage_ESuperPackage(), this.getEPackage(), this.getEPackage_ESubpackages(), "eSuperPackage", null, 0, 1, EPackage.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
  

    
    op = initEOperation(getEPackage__GetEClassifier__String(), null, "getEClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
  
  
    addEParameter(op, this.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  
    g1 = createEGenericType(this.getEClassifier());
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    initEOperation(op, g1);
    
  
  

  
    
    initEClass(eParameterEClass, EParameter.class, "EParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
    
  
    g1 = createEGenericType(this.getEOperation());
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEParameter_EOperation(), g1, this.getEOperation_EParameters(), "eOperation", null, 0, 1, EParameter.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
  
  

  
    
    initEClass(eReferenceEClass, EReference.class, "EReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
    
    
    initEAttribute(getEReference_Containment(), this.getEBoolean(), "containment", null, 0, 1, EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
    
    initEAttribute(getEReference_Container(), this.getEBoolean(), "container", null, 0, 1, EReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    
  
    
    
    initEAttribute(getEReference_ResolveProxies(), this.getEBoolean(), "resolveProxies", "true", 0, 1, EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
  
    g1 = createEGenericType(this.getEReference());
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    g2 = createEGenericType(eReferenceEClass_C);
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEReference_EOpposite(), g1, null, "eOpposite", null, 0, 1, EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
  
    g1 = createEGenericType(this.getEClass());
    
  
    g2 = createEGenericType(eReferenceEClass_C);
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEReference_EReferenceType(), g1, null, "eReferenceType", null, 1, 1, EReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
  
    
  
    
  
    g1 = createEGenericType(this.getEAttribute());
    
  
    g2 = createEGenericType(eReferenceEClass_C);
    
    g1.getETypeArguments().add(g2);
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEReference_EKeys(), g1, null, "eKeys", null, 0, -1, EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
  
  

  
    
    initEClass(eStructuralFeatureEClass, EStructuralFeature.class, "EStructuralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
    
    
    initEAttribute(getEStructuralFeature_Changeable(), this.getEBoolean(), "changeable", "true", 0, 1, EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
    
    initEAttribute(getEStructuralFeature_Volatile(), this.getEBoolean(), "volatile", null, 0, 1, EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
    
    initEAttribute(getEStructuralFeature_Transient(), this.getEBoolean(), "transient", null, 0, 1, EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
    
    initEAttribute(getEStructuralFeature_DefaultValueLiteral(), this.getEString(), "defaultValueLiteral", null, 0, 1, EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
  
    g1 = createEGenericType(eStructuralFeatureEClass_V);
    
  
    
    
    initEAttribute(getEStructuralFeature_DefaultValue(), g1, "defaultValue", null, 0, 1, EStructuralFeature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    
  
    
    
    initEAttribute(getEStructuralFeature_Unsettable(), this.getEBoolean(), "unsettable", null, 0, 1, EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
    
    initEAttribute(getEStructuralFeature_Derived(), this.getEBoolean(), "derived", null, 0, 1, EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
  
    g1 = createEGenericType(this.getEClass());
    
  
    g2 = createEGenericType(eStructuralFeatureEClass_C);
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEStructuralFeature_EContainingClass(), g1, this.getEClass_EStructuralFeatures(), "eContainingClass", null, 0, 1, EStructuralFeature.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
  

    
    initEOperation(getEStructuralFeature__GetFeatureID(), this.getEInt(), "getFeatureID", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
    
  
    
    
  

    
    op = initEOperation(getEStructuralFeature__GetContainerClass(), null, "getContainerClass", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
    
  
    
    
  
    g1 = createEGenericType(this.getEJavaClass());
    
  
    g2 = createEGenericType(eStructuralFeatureEClass_C);
    
    g1.getETypeArguments().add(g2);
    
  
    initEOperation(op, g1);
    
  
  

  
    
    initEClass(eTypedElementEClass, ETypedElement.class, "ETypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
    
    
    initEAttribute(getETypedElement_Ordered(), this.getEBoolean(), "ordered", "true", 0, 1, ETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
    
    initEAttribute(getETypedElement_Unique(), this.getEBoolean(), "unique", "true", 0, 1, ETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
    
    initEAttribute(getETypedElement_LowerBound(), this.getEInt(), "lowerBound", null, 0, 1, ETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
    
    initEAttribute(getETypedElement_UpperBound(), this.getEInt(), "upperBound", "1", 0, 1, ETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
    
    initEAttribute(getETypedElement_Many(), this.getEBoolean(), "many", null, 0, 1, ETypedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    
  
    
    
    initEAttribute(getETypedElement_Required(), this.getEBoolean(), "required", null, 0, 1, ETypedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    
  
    
  
    g1 = createEGenericType(this.getEClassifier());
    
  
    g2 = createEGenericType(eTypedElementEClass_C);
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getETypedElement_EType(), g1, null, "eType", null, 0, 1, ETypedElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
    
    
    initEReference(getETypedElement_EGenericType(), this.getEGenericType(), null, "eGenericType", null, 0, 1, ETypedElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
  
  

  
    
    initEClass(eStringToStringMapEntryEClass, Map.Entry.class, "EStringToStringMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
  
    
    
    initEAttribute(getEStringToStringMapEntry_Key(), this.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
    
    
    initEAttribute(getEStringToStringMapEntry_Value(), this.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    
  
  
  

  
    
    initEClass(eGenericTypeEClass, EGenericType.class, "EGenericType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
    
    
    
    initEReference(getEGenericType_EUpperBound(), this.getEGenericType(), null, "eUpperBound", null, 0, 1, EGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
    
    
    initEReference(getEGenericType_ETypeArguments(), this.getEGenericType(), null, "eTypeArguments", null, 0, -1, EGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
  
    g1 = createEGenericType(this.getEClassifier());
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEGenericType_ERawType(), g1, null, "eRawType", null, 1, 1, EGenericType.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
  
    
  
    
    
    
    initEReference(getEGenericType_ELowerBound(), this.getEGenericType(), null, "eLowerBound", null, 0, 1, EGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
    
    
    initEReference(getEGenericType_ETypeParameter(), this.getETypeParameter(), null, "eTypeParameter", null, 0, 1, EGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
    
  
    g1 = createEGenericType(this.getEClassifier());
    
  
    g2 = createEGenericType();
    
    g1.getETypeArguments().add(g2);
    
  
    
    
    
    initEReference(getEGenericType_EClassifier(), g1, null, "eClassifier", null, 0, 1, EGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
  

    
    op = initEOperation(getEGenericType__IsInstance__Object(), this.getEBoolean(), "isInstance", 0, 1, IS_UNIQUE, IS_ORDERED);
    
    
  
    
    
  
  
    addEParameter(op, this.getEJavaObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);
  
    
    
  
    
    
  
  

  
    
    initEClass(eTypeParameterEClass, ETypeParameter.class, "ETypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  
    
    
    
    initEReference(getETypeParameter_EBounds(), this.getEGenericType(), null, "eBounds", null, 0, -1, ETypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  
    
  
  
  
    
  
  
  

    // Initialize data types
    
    initEDataType(eBigDecimalEDataType, BigDecimal.class, "EBigDecimal", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eBigIntegerEDataType, BigInteger.class, "EBigInteger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eBooleanEDataType, boolean.class, "EBoolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eBooleanObjectEDataType, Boolean.class, "EBooleanObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eByteEDataType, byte.class, "EByte", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eByteArrayEDataType, byte[].class, "EByteArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eByteObjectEDataType, Byte.class, "EByteObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eCharEDataType, char.class, "EChar", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eCharacterObjectEDataType, Character.class, "ECharacterObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eDateEDataType, Date.class, "EDate", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eDiagnosticChainEDataType, DiagnosticChain.class, "EDiagnosticChain", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eDoubleEDataType, double.class, "EDouble", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eDoubleObjectEDataType, Double.class, "EDoubleObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eeListEDataType, EList.class, "EEList", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eEnumeratorEDataType, Enumerator.class, "EEnumerator", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eFeatureMapEDataType, FeatureMap.class, "EFeatureMap", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eFeatureMapEntryEDataType, FeatureMap.Entry.class, "EFeatureMapEntry", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eFloatEDataType, float.class, "EFloat", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eFloatObjectEDataType, Float.class, "EFloatObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eIntEDataType, int.class, "EInt", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eIntegerObjectEDataType, Integer.class, "EIntegerObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eJavaClassEDataType, Class.class, "EJavaClass", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eJavaObjectEDataType, Object.class, "EJavaObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eLongEDataType, long.class, "ELong", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eLongObjectEDataType, Long.class, "ELongObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eMapEDataType, Map.class, "EMap", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eResourceEDataType, Resource.class, "EResource", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eResourceSetEDataType, ResourceSet.class, "EResourceSet", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eShortEDataType, short.class, "EShort", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eShortObjectEDataType, Short.class, "EShortObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eStringEDataType, String.class, "EString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eTreeIteratorEDataType, TreeIterator.class, "ETreeIterator", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
    initEDataType(eInvocationTargetExceptionEDataType, InvocationTargetException.class, "EInvocationTargetException", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    
  
  

    // Create resource
    createResource(eNS_URI);
  
  
  }

	/**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createEcoreAnnotations() {
    String source = "http://www.eclipse.org/emf/2002/Ecore";
    
    
    addAnnotation
      (eAttributeEClass, 
       source, 
       new String[] 
       {
    
       "constraints", "ConsistentTransient"
    
       });
    
    
  
    
    
    addAnnotation
      (eAnnotationEClass, 
       source, 
       new String[] 
       {
    
       "constraints", "WellFormedSourceURI"
    
       });
    
    
  
    
    
    addAnnotation
      (eClassEClass, 
       source, 
       new String[] 
       {
    
       "constraints", "InterfaceIsAbstract AtMostOneID UniqueFeatureNames UniqueOperationSignatures NoCircularSuperTypes WellFormedMapEntryClass ConsistentSuperTypes DisjointFeatureAndOperationSignatures"
    
       });
    
    
  
    
  
    
  
    
    
    addAnnotation
      (eClassifierEClass, 
       source, 
       new String[] 
       {
    
       "constraints", "WellFormedInstanceTypeName UniqueTypeParameterNames"
    
       });
    
    
  
    
  
    
  
    
    
    addAnnotation
      (eEnumEClass, 
       source, 
       new String[] 
       {
    
       "constraints", "UniqueEnumeratorNames UniqueEnumeratorLiterals"
    
       });
    
    
  
    
    
    addAnnotation
      (eNamedElementEClass, 
       source, 
       new String[] 
       {
    
       "constraints", "WellFormedName"
    
       });
    
    
  
    
    
    addAnnotation
      (eOperationEClass, 
       source, 
       new String[] 
       {
    
       "constraints", "UniqueParameterNames UniqueTypeParameterNames NoRepeatingVoid"
    
       });
    
    
  
    
  
    
  
    
    
    addAnnotation
      (ePackageEClass, 
       source, 
       new String[] 
       {
    
       "constraints", "WellFormedNsURI WellFormedNsPrefix UniqueSubpackageNames UniqueClassifierNames UniqueNsURIs"
    
       });
    
    
  
    
    
    addAnnotation
      (eReferenceEClass, 
       source, 
       new String[] 
       {
    
       "constraints", "ConsistentOpposite SingleContainer ConsistentKeys ConsistentUnique ConsistentContainer"
    
       });
    
    
  
    
    
    addAnnotation
      (eStructuralFeatureEClass, 
       source, 
       new String[] 
       {
    
       "constraints", "ValidDefaultValueLiteral"
    
       });
    
    
  
    
    
    addAnnotation
      (eTypedElementEClass, 
       source, 
       new String[] 
       {
    
       "constraints", "ValidLowerBound ValidUpperBound ConsistentBounds ValidType"
    
       });
    
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
    
    addAnnotation
      (eGenericTypeEClass, 
       source, 
       new String[] 
       {
    
       "constraints", "ConsistentType ConsistentBounds ConsistentArguments"
    
       });
    
    
  
    
  }

	/**
	 * Initializes the annotations for
	 * <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
    String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
  
    
    
    addAnnotation
      (eBigDecimalEDataType, 
       source, 
       new String[] 
       {
    
       "baseType", "http://www.w3.org/2001/XMLSchema#decimal"
    
       });
    
    
  
    
    
    addAnnotation
      (eBigIntegerEDataType, 
       source, 
       new String[] 
       {
    
       "baseType", "http://www.w3.org/2001/XMLSchema#integer"
    
       });
    
    
  
    
    
    addAnnotation
      (eBooleanEDataType, 
       source, 
       new String[] 
       {
    
       "baseType", "http://www.w3.org/2001/XMLSchema#boolean"
    
       });
    
    
  
    
    
    addAnnotation
      (eBooleanObjectEDataType, 
       source, 
       new String[] 
       {
    
       "baseType", "EBoolean",
    
       "name", "EBoolean:Object"
    
       });
    
    
  
    
    
    addAnnotation
      (eByteEDataType, 
       source, 
       new String[] 
       {
    
       "baseType", "http://www.w3.org/2001/XMLSchema#byte"
    
       });
    
    
  
    
    
    addAnnotation
      (eByteArrayEDataType, 
       source, 
       new String[] 
       {
    
       "baseType", "http://www.w3.org/2001/XMLSchema#hexBinary"
    
       });
    
    
  
    
    
    addAnnotation
      (eByteObjectEDataType, 
       source, 
       new String[] 
       {
    
       "baseType", "EByte",
    
       "name", "EByte:Object"
    
       });
    
    
  
    
    
    addAnnotation
      (eCharacterObjectEDataType, 
       source, 
       new String[] 
       {
    
       "baseType", "EChar",
    
       "name", "EChar:Object"
    
       });
    
    
  
    
    
    addAnnotation
      (eDoubleEDataType, 
       source, 
       new String[] 
       {
    
       "baseType", "http://www.w3.org/2001/XMLSchema#double"
    
       });
    
    
  
    
    
    addAnnotation
      (eDoubleObjectEDataType, 
       source, 
       new String[] 
       {
    
       "baseType", "EDouble",
    
       "name", "EDouble:Object"
    
       });
    
    
  
    
    
    addAnnotation
      (eFloatEDataType, 
       source, 
       new String[] 
       {
    
       "baseType", "http://www.w3.org/2001/XMLSchema#float"
    
       });
    
    
  
    
    
    addAnnotation
      (eFloatObjectEDataType, 
       source, 
       new String[] 
       {
    
       "baseType", "EFloat",
    
       "name", "EFloat:Object"
    
       });
    
    
  
    
    
    addAnnotation
      (eIntEDataType, 
       source, 
       new String[] 
       {
    
       "baseType", "http://www.w3.org/2001/XMLSchema#int"
    
       });
    
    
  
    
    
    addAnnotation
      (eIntegerObjectEDataType, 
       source, 
       new String[] 
       {
    
       "baseType", "EInt",
    
       "name", "EInt:Object"
    
       });
    
    
  
    
    
    addAnnotation
      (eLongEDataType, 
       source, 
       new String[] 
       {
    
       "baseType", "http://www.w3.org/2001/XMLSchema#long"
    
       });
    
    
  
    
    
    addAnnotation
      (eLongObjectEDataType, 
       source, 
       new String[] 
       {
    
       "baseType", "ELong",
    
       "name", "ELong:Object"
    
       });
    
    
  
    
    
    addAnnotation
      (eShortEDataType, 
       source, 
       new String[] 
       {
    
       "baseType", "http://www.w3.org/2001/XMLSchema#short"
    
       });
    
    
  
    
    
    addAnnotation
      (eShortObjectEDataType, 
       source, 
       new String[] 
       {
    
       "baseType", "EShort",
    
       "name", "EShort:Object"
    
       });
    
    
  
    
    
    addAnnotation
      (eStringEDataType, 
       source, 
       new String[] 
       {
    
       "baseType", "http://www.w3.org/2001/XMLSchema#string"
    
       });
    
    
  
    
  
    
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EClass<EFactory> getEFactory() {
  
    return eFactoryEClass;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EReference<EFactory, EPackage> getEFactory_EPackage() {
  
    return (EReference<EFactory, EPackage>) eFactoryEClass.getEStructuralFeatures().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EFactory, EObject> getEFactory__Create__EClass() {
  
    return (EOperation<EFactory, EObject>) eFactoryEClass.getEOperations().get(0);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EFactory, Object> getEFactory__CreateFromString__EDataType_String() {
  
    return (EOperation<EFactory, Object>) eFactoryEClass.getEOperations().get(1);
  
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EOperation<EFactory, String> getEFactory__ConvertToString__EDataType_Object() {
  
    return (EOperation<EFactory, String>) eFactoryEClass.getEOperations().get(2);
  
  }

}
