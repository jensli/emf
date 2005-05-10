/**
 * <copyright>
 *
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: ModelImporterPage.java,v 1.1 2005/05/10 17:35:19 davidms Exp $
 */
package org.eclipse.emf.importer.ui.wizard.base;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

import org.eclipse.emf.importer.ImporterPlugin;
import org.eclipse.emf.importer.ModelImporter;


/**
 * @since 2.1.0
 */
public abstract class ModelImporterPage extends WizardPage implements Listener
{
  protected ModelImporter modelImporter;
  protected boolean neverVisible = true;
  protected boolean handlingEvent = true;

  public ModelImporterPage(ModelImporter modelImporter, String pageName)
  {
    super(pageName);
    this.modelImporter = modelImporter;
    setPageComplete(false);
  }

  public void dispose()
  {
    modelImporter = null;
    super.dispose();
  }

  public ModelImporter getModelImporter()
  {
    return modelImporter;
  }

  protected void pageActivated(boolean firstTime)
  {

  }

  protected void pageDeactivated(boolean performFinish)
  {

  }

  public boolean isPageComplete()
  {
    return getErrorMessage() == null;
  }
  
  public boolean isHandlingEvent()
  {
    return handlingEvent;
  }
  
  public void setHandlingEvent(boolean handlingEvent)
  {
    this.handlingEvent = handlingEvent;
  }

  public void handleEvent(Event event)
  {
    if (isHandlingEvent())
    {
      doHandleEvent(event);
    }
  }
  
  protected void doHandleEvent(Event event)
  {
    
  }

  protected boolean isInJavaOutput(IResource resource)
  {
    IProject project = resource.getProject();
    IJavaProject javaProject = JavaCore.create(project);
    try
    {
      if (javaProject.exists() && project != project.getWorkspace().getRoot().findMember(javaProject.getOutputLocation())
        && javaProject.getOutputLocation().isPrefixOf(resource.getFullPath()))
      {
        return true;
      }
    }
    catch (JavaModelException exception)
    {
      ImporterPlugin.INSTANCE.log(exception);
    }

    return false;
  }
}
