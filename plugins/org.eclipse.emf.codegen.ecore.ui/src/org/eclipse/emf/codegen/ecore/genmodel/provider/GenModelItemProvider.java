/**
 * <copyright> 
 *
 * Copyright (c) 2002-2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: GenModelItemProvider.java,v 1.21 2005/11/18 19:10:22 emerks Exp $
 */
package org.eclipse.emf.codegen.ecore.genmodel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;


import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.codegen.ecore.genmodel.GenModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenModelItemProvider
  extends GenBaseItemProvider
  implements 
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenModelItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addCopyrightTextPropertyDescriptor(object);
      addModelDirectoryPropertyDescriptor(object);
      addCreationCommandsPropertyDescriptor(object);
      addCreationIconsPropertyDescriptor(object);
      addEditDirectoryPropertyDescriptor(object);
      addEditorDirectoryPropertyDescriptor(object);
      addModelPluginIDPropertyDescriptor(object);
      addTemplateDirectoryPropertyDescriptor(object);
      addRuntimeJarPropertyDescriptor(object);
      addDynamicTemplatesPropertyDescriptor(object);
      addRedirectionPropertyDescriptor(object);
      addForceOverwritePropertyDescriptor(object);
      addModelNamePropertyDescriptor(object);
      addModelPluginClassPropertyDescriptor(object);
      addEditPluginClassPropertyDescriptor(object);
      addEditorPluginClassPropertyDescriptor(object);
      addUpdateClasspathPropertyDescriptor(object);
      addGenerateSchemaPropertyDescriptor(object);
      addNonNLSMarkersPropertyDescriptor(object);
      addStaticPackagesPropertyDescriptor(object);
      addModelPluginVariablesPropertyDescriptor(object);
      addRootExtendsInterfacePropertyDescriptor(object);
      addRootExtendsClassPropertyDescriptor(object);
      addRootImplementsInterfacePropertyDescriptor(object);
      addSuppressEMFTypesPropertyDescriptor(object);
      addFeatureMapWrapperInterfacePropertyDescriptor(object);
      addFeatureMapWrapperInternalInterfacePropertyDescriptor(object);
      addFeatureMapWrapperClassPropertyDescriptor(object);
      addRuntimeCompatibilityPropertyDescriptor(object);
      addRichClientPlatformPropertyDescriptor(object);
      addCodeFormattingPropertyDescriptor(object);
      addTestsDirectoryPropertyDescriptor(object);
      addTestSuiteClassPropertyDescriptor(object);
      addBooleanFlagsFieldPropertyDescriptor(object);
      addBooleanFlagsReservedBitsPropertyDescriptor(object);
      addBundleManifestPropertyDescriptor(object);
      addFeatureDelegationPropertyDescriptor(object);
      addContainmentProxiesPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Copyright Text feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addCopyrightTextPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_copyrightText_feature"),
         getString("_UI_GenModel_copyrightText_description"),
         GenModelPackage.eINSTANCE.getGenModel_CopyrightText(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_AllPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Model Directory feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addModelDirectoryPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_modelDirectory_feature"),
         getString("_UI_GenModel_modelDirectory_description"),
         GenModelPackage.eINSTANCE.getGenModel_ModelDirectory(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_ModelPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Creation Commands feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addCreationCommandsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_creationCommands_feature"),
         getString("_UI_GenModel_creationCommands_description"),
         GenModelPackage.eINSTANCE.getGenModel_CreationCommands(),
         true,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         getString("_UI_EditPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Creation Icons feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addCreationIconsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_creationIcons_feature"),
         getString("_UI_GenModel_creationIcons_description"),
         GenModelPackage.eINSTANCE.getGenModel_CreationIcons(),
         true,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         getString("_UI_EditPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Edit Directory feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addEditDirectoryPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_editDirectory_feature"),
         getString("_UI_GenModel_editDirectory_description"),
         GenModelPackage.eINSTANCE.getGenModel_EditDirectory(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_EditPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Editor Directory feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addEditorDirectoryPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_editorDirectory_feature"),
         getString("_UI_GenModel_editorDirectory_description"),
         GenModelPackage.eINSTANCE.getGenModel_EditorDirectory(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_EditorPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Model Plugin ID feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addModelPluginIDPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_modelPluginID_feature"),
         getString("_UI_GenModel_modelPluginID_description"),
         GenModelPackage.eINSTANCE.getGenModel_ModelPluginID(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_AllPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Template Directory feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTemplateDirectoryPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_templateDirectory_feature"),
         getString("_UI_GenModel_templateDirectory_description"),
         GenModelPackage.eINSTANCE.getGenModel_TemplateDirectory(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_JETPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Runtime Jar feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addRuntimeJarPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_runtimeJar_feature"),
         getString("_UI_GenModel_runtimeJar_description"),
         GenModelPackage.eINSTANCE.getGenModel_RuntimeJar(),
         true,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         getString("_UI_AllPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Dynamic Templates feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDynamicTemplatesPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_dynamicTemplates_feature"),
         getString("_UI_GenModel_dynamicTemplates_description"),
         GenModelPackage.eINSTANCE.getGenModel_DynamicTemplates(),
         true,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         getString("_UI_JETPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Redirection feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addRedirectionPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_redirection_feature"),
         getString("_UI_GenModel_redirection_description"),
         GenModelPackage.eINSTANCE.getGenModel_Redirection(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_JETPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Force Overwrite feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addForceOverwritePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_forceOverwrite_feature"),
         getString("_UI_GenModel_forceOverwrite_description"),
         GenModelPackage.eINSTANCE.getGenModel_ForceOverwrite(),
         true,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         getString("_UI_JETPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Model Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addModelNamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_modelName_feature"),
         getString("_UI_GenModel_modelName_description"),
         GenModelPackage.eINSTANCE.getGenModel_ModelName(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_AllPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Model Plugin Class feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addModelPluginClassPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_modelPluginClass_feature"),
         getString("_UI_GenModel_modelPluginClass_description"),
         GenModelPackage.eINSTANCE.getGenModel_ModelPluginClass(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_ModelPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Edit Plugin Class feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addEditPluginClassPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_editPluginClass_feature"),
         getString("_UI_GenModel_editPluginClass_description"),
         GenModelPackage.eINSTANCE.getGenModel_EditPluginClass(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_EditPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Editor Plugin Class feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addEditorPluginClassPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_editorPluginClass_feature"),
         getString("_UI_GenModel_editorPluginClass_description"),
         GenModelPackage.eINSTANCE.getGenModel_EditorPluginClass(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_EditorPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Update Classpath feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addUpdateClasspathPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_updateClasspath_feature"),
         getString("_UI_GenModel_updateClasspath_description"),
         GenModelPackage.eINSTANCE.getGenModel_UpdateClasspath(),
         true,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         getString("_UI_JETPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Generate Schema feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addGenerateSchemaPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_generateSchema_feature"),
         getString("_UI_GenModel_generateSchema_description"),
         GenModelPackage.eINSTANCE.getGenModel_GenerateSchema(),
         true,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         getString("_UI_ModelPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Non NLS Markers feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addNonNLSMarkersPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_nonNLSMarkers_feature"),
         getString("_UI_GenModel_nonNLSMarkers_description"),
         GenModelPackage.eINSTANCE.getGenModel_NonNLSMarkers(),
         true,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         getString("_UI_AllPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Static Packages feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addStaticPackagesPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_staticPackages_feature"),
         getString("_UI_GenModel_staticPackages_description"),
         GenModelPackage.eINSTANCE.getGenModel_StaticPackages(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_ModelClassPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Model Plugin Variables feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addModelPluginVariablesPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_modelPluginVariables_feature"),
         getString("_UI_GenModel_modelPluginVariables_description"),
         GenModelPackage.eINSTANCE.getGenModel_ModelPluginVariables(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_ModelPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Root Extends Interface feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addRootExtendsInterfacePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_rootExtendsInterface_feature"),
         getString("_UI_GenModel_rootExtendsInterface_description"),
         GenModelPackage.eINSTANCE.getGenModel_RootExtendsInterface(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_ModelClassPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Root Extends Class feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addRootExtendsClassPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_rootExtendsClass_feature"),
         getString("_UI_GenModel_rootExtendsClass_description"),
         GenModelPackage.eINSTANCE.getGenModel_RootExtendsClass(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_ModelClassPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Root Implements Interface feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addRootImplementsInterfacePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_rootImplementsInterface_feature"),
         getString("_UI_GenModel_rootImplementsInterface_description"),
         GenModelPackage.eINSTANCE.getGenModel_RootImplementsInterface(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_ModelClassPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Suppress EMF Types feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSuppressEMFTypesPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_suppressEMFTypes_feature"),
         getString("_UI_GenModel_suppressEMFTypes_description"),
         GenModelPackage.eINSTANCE.getGenModel_SuppressEMFTypes(),
         true,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         getString("_UI_ModelFeaturePropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Feature Map Wrapper Interface feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addFeatureMapWrapperInterfacePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_featureMapWrapperInterface_feature"),
         getString("_UI_GenModel_featureMapWrapperInterface_description"),
         GenModelPackage.eINSTANCE.getGenModel_FeatureMapWrapperInterface(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_ModelFeaturePropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Feature Map Wrapper Internal Interface feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addFeatureMapWrapperInternalInterfacePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_featureMapWrapperInternalInterface_feature"),
         getString("_UI_GenModel_featureMapWrapperInternalInterface_description"),
         GenModelPackage.eINSTANCE.getGenModel_FeatureMapWrapperInternalInterface(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_ModelFeaturePropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Feature Map Wrapper Class feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addFeatureMapWrapperClassPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_featureMapWrapperClass_feature"),
         getString("_UI_GenModel_featureMapWrapperClass_description"),
         GenModelPackage.eINSTANCE.getGenModel_FeatureMapWrapperClass(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_ModelFeaturePropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Runtime Compatibility feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addRuntimeCompatibilityPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_runtimeCompatibility_feature"),
         getString("_UI_GenModel_runtimeCompatibility_description"),
         GenModelPackage.eINSTANCE.getGenModel_RuntimeCompatibility(),
         true,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         getString("_UI_AllPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Rich Client Platform feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addRichClientPlatformPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_richClientPlatform_feature"),
         getString("_UI_GenModel_richClientPlatform_description"),
         GenModelPackage.eINSTANCE.getGenModel_RichClientPlatform(),
         true,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         getString("_UI_EditorPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Code Formatting feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addCodeFormattingPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_codeFormatting_feature"),
         getString("_UI_GenModel_codeFormatting_description"),
         GenModelPackage.eINSTANCE.getGenModel_CodeFormatting(),
         true,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         getString("_UI_JETPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Tests Directory feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTestsDirectoryPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_testsDirectory_feature"),
         getString("_UI_GenModel_testsDirectory_description"),
         GenModelPackage.eINSTANCE.getGenModel_TestsDirectory(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_TestsPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Test Suite Class feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTestSuiteClassPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_testSuiteClass_feature"),
         getString("_UI_GenModel_testSuiteClass_description"),
         GenModelPackage.eINSTANCE.getGenModel_TestSuiteClass(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_TestsPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Boolean Flags Field feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addBooleanFlagsFieldPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_booleanFlagsField_feature"),
         getString("_UI_GenModel_booleanFlagsField_description"),
         GenModelPackage.eINSTANCE.getGenModel_BooleanFlagsField(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_ModelFeaturePropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Boolean Flags Reserved Bits feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addBooleanFlagsReservedBitsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_booleanFlagsReservedBits_feature"),
         getString("_UI_GenModel_booleanFlagsReservedBits_description"),
         GenModelPackage.eINSTANCE.getGenModel_BooleanFlagsReservedBits(),
         true,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         getString("_UI_ModelFeaturePropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Bundle Manifest feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addBundleManifestPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_bundleManifest_feature"),
         getString("_UI_GenModel_bundleManifest_description"),
         GenModelPackage.eINSTANCE.getGenModel_BundleManifest(),
         true,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         getString("_UI_AllPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Feature Delegation feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addFeatureDelegationPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_featureDelegation_feature"),
         getString("_UI_GenModel_featureDelegation_description"),
         GenModelPackage.eINSTANCE.getGenModel_FeatureDelegation(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         getString("_UI_ModelPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Containment Proxies feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addContainmentProxiesPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GenModel_containmentProxies_feature"),
         getString("_UI_GenModel_containmentProxies_description"),
         GenModelPackage.eINSTANCE.getGenModel_ContainmentProxies(),
         true,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         getString("_UI_ModelPropertyCategory"),
         null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Collection getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(GenModelPackage.eINSTANCE.getGenModel_GenPackages());
      childrenFeatures.add(GenModelPackage.eINSTANCE.getGenModel_UsedGenPackages());
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   */
  public Object getImage(Object object)
  {
    return new UnderlayedImage(getResourceLocator().getImage("full/obj16/GenModel"));
  }

  /**
   * This returns the label text for the adapted class.
   */
  public String getText(Object object)
  {
    GenModel genModel = (GenModel)object;
    return genModel.getModelName();
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(GenModel.class))
    {
      case GenModelPackage.GEN_MODEL__COPYRIGHT_TEXT:
      case GenModelPackage.GEN_MODEL__MODEL_DIRECTORY:
      case GenModelPackage.GEN_MODEL__CREATION_COMMANDS:
      case GenModelPackage.GEN_MODEL__CREATION_ICONS:
      case GenModelPackage.GEN_MODEL__EDIT_DIRECTORY:
      case GenModelPackage.GEN_MODEL__EDITOR_DIRECTORY:
      case GenModelPackage.GEN_MODEL__MODEL_PLUGIN_ID:
      case GenModelPackage.GEN_MODEL__TEMPLATE_DIRECTORY:
      case GenModelPackage.GEN_MODEL__RUNTIME_JAR:
      case GenModelPackage.GEN_MODEL__FOREIGN_MODEL:
      case GenModelPackage.GEN_MODEL__DYNAMIC_TEMPLATES:
      case GenModelPackage.GEN_MODEL__REDIRECTION:
      case GenModelPackage.GEN_MODEL__FORCE_OVERWRITE:
      case GenModelPackage.GEN_MODEL__NON_EXTERNALIZED_STRING_TAG:
      case GenModelPackage.GEN_MODEL__MODEL_NAME:
      case GenModelPackage.GEN_MODEL__MODEL_PLUGIN_CLASS:
      case GenModelPackage.GEN_MODEL__EDIT_PLUGIN_CLASS:
      case GenModelPackage.GEN_MODEL__EDITOR_PLUGIN_CLASS:
      case GenModelPackage.GEN_MODEL__UPDATE_CLASSPATH:
      case GenModelPackage.GEN_MODEL__GENERATE_SCHEMA:
      case GenModelPackage.GEN_MODEL__NON_NLS_MARKERS:
      case GenModelPackage.GEN_MODEL__STATIC_PACKAGES:
      case GenModelPackage.GEN_MODEL__MODEL_PLUGIN_VARIABLES:
      case GenModelPackage.GEN_MODEL__ROOT_EXTENDS_INTERFACE:
      case GenModelPackage.GEN_MODEL__ROOT_EXTENDS_CLASS:
      case GenModelPackage.GEN_MODEL__ROOT_IMPLEMENTS_INTERFACE:
      case GenModelPackage.GEN_MODEL__SUPPRESS_EMF_TYPES:
      case GenModelPackage.GEN_MODEL__FEATURE_MAP_WRAPPER_INTERFACE:
      case GenModelPackage.GEN_MODEL__FEATURE_MAP_WRAPPER_INTERNAL_INTERFACE:
      case GenModelPackage.GEN_MODEL__FEATURE_MAP_WRAPPER_CLASS:
      case GenModelPackage.GEN_MODEL__RUNTIME_COMPATIBILITY:
      case GenModelPackage.GEN_MODEL__RICH_CLIENT_PLATFORM:
      case GenModelPackage.GEN_MODEL__REFLECTIVE_DELEGATION:
      case GenModelPackage.GEN_MODEL__CODE_FORMATTING:
      case GenModelPackage.GEN_MODEL__TESTS_DIRECTORY:
      case GenModelPackage.GEN_MODEL__TEST_SUITE_CLASS:
      case GenModelPackage.GEN_MODEL__BOOLEAN_FLAGS_FIELD:
      case GenModelPackage.GEN_MODEL__BOOLEAN_FLAGS_RESERVED_BITS:
      case GenModelPackage.GEN_MODEL__IMPORTER_ID:
      case GenModelPackage.GEN_MODEL__BUNDLE_MANIFEST:
      case GenModelPackage.GEN_MODEL__FEATURE_DELEGATION:
      case GenModelPackage.GEN_MODEL__CONTAINMENT_PROXIES:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case GenModelPackage.GEN_MODEL__GEN_PACKAGES:
      case GenModelPackage.GEN_MODEL__USED_GEN_PACKAGES:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceLocator getResourceLocator()
  {
    return GenModelEditPlugin.INSTANCE;
  }

}

