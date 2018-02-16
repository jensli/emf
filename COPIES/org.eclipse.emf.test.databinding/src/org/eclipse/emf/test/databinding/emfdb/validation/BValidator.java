/**
 *
 * $Id$
 */
package org.eclipse.emf.test.databinding.emfdb.validation;

import org.eclipse.emf.test.databinding.emfdb.D;

/**
 * A sample validator interface for {@link org.eclipse.emf.test.databinding.emfdb.B}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BValidator
{
  boolean validate();

  boolean validateString(String value);
  boolean validateD(D value);
}