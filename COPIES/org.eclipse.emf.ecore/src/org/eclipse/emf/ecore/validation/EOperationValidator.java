/**
 *
 * $Id$
 */
package org.eclipse.emf.ecore.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.ETypeParameter;

/**
 * A sample validator interface for {@link org.eclipse.emf.ecore.EOperation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EOperationValidator {
	boolean validate();

	boolean validateEContainingClass(EClass<EObject> value);
	boolean validateETypeParameters(EList<ETypeParameter> value);
	boolean validateEParameters(EList<EParameter<?>> value);
	boolean validateEExceptions(EList<EClassifier<?>> value);
	boolean validateEGenericExceptions(EList<EGenericType> value);
}