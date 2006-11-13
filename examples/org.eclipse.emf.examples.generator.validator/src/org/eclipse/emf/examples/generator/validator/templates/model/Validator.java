package org.eclipse.emf.examples.generator.validator.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.emf.examples.generator.validator.ValidatorGeneratorUtil;

public class Validator
{
  protected static String nl;
  public static synchronized Validator create(String lineSeparator)
  {
    nl = lineSeparator;
    Validator result = new Validator();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**" + NL + " * <copyright>" + NL + " * </copyright>" + NL + " *" + NL + " * ";
  protected final String TEXT_3 = "Id";
  protected final String TEXT_4 = NL + " */" + NL + "package ";
  protected final String TEXT_5 = ";" + NL;
  protected final String TEXT_6 = NL + NL + "/**" + NL + " * A sample validator interface for {@link ";
  protected final String TEXT_7 = "}." + NL + " * This doesn't really do anything, and it's not a real EMF artifact." + NL + " * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended." + NL + " * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false." + NL + " */" + NL + "public interface ";
  protected final String TEXT_8 = NL + "{" + NL + "\tboolean validate();" + NL;
  protected final String TEXT_9 = NL + "\tboolean validate";
  protected final String TEXT_10 = "(";
  protected final String TEXT_11 = " value);";
  protected final String TEXT_12 = NL + "}";
  protected final String TEXT_13 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    GenClass genClass = (GenClass)argument; GenPackage genPackage = genClass.getGenPackage(); GenModel genModel = genPackage.getGenModel();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_3);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_4);
    stringBuffer.append(ValidatorGeneratorUtil.getValidationPackageName(genPackage));
    stringBuffer.append(TEXT_5);
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(ValidatorGeneratorUtil.getValidatorInterfaceName(genClass));
    stringBuffer.append(TEXT_8);
    for (Iterator fIter = genClass.getGenFeatures().iterator(); fIter.hasNext(); ) { GenFeature genFeature = (GenFeature)fIter.next(); 
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_11);
    }
    stringBuffer.append(TEXT_12);
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_13);
    return stringBuffer.toString();
  }
}
