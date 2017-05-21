/**
 *
 * $Id$
 */
package org.eclipse.emf.ecore.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * A sample validator interface for {@link org.eclipse.emf.ecore.EReference}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EReferenceValidator {
	boolean validate();

	boolean validateContainment(boolean value);
	boolean validateContainer(boolean value);
	boolean validateResolveProxies(boolean value);
	boolean validateEOpposite(EReference<? extends EObject, EObject> value);
	boolean validateEReferenceType(EClass<EObject> value);
	boolean validateEKeys(EList<EAttribute<EObject, ?>> value);
}
