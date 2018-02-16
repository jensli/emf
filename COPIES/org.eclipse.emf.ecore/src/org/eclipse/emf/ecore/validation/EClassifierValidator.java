/**
 *
 * $Id$
 */
package org.eclipse.emf.ecore.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;

/**
 * A sample validator interface for {@link org.eclipse.emf.ecore.EClassifier}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EClassifierValidator {
	boolean validate();

	boolean validateInstanceClassName(String value);
	boolean validateInstanceClass(Class<Object> value);
	boolean validateDefaultValue(Object value);
	boolean validateInstanceTypeName(String value);
	boolean validateEPackage(EPackage value);
	boolean validateETypeParameters(EList<ETypeParameter> value);
}