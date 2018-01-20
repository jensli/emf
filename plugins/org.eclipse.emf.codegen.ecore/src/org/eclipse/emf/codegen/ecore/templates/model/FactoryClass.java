package org.eclipse.emf.codegen.ecore.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;

public class FactoryClass
{
  protected static String nl;
  public static synchronized FactoryClass create(String lineSeparator)
  {
    nl = lineSeparator;
    FactoryClass result = new FactoryClass();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**";
  protected final String TEXT_3 = NL + " * ";
  protected final String TEXT_4 = NL + " */";
  protected final String TEXT_5 = NL + "package ";
  protected final String TEXT_6 = ";";
  protected final String TEXT_7 = NL + "package ";
  protected final String TEXT_8 = ";";
  protected final String TEXT_9 = NL;
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * The <b>Factory</b> for the model." + NL + " * It provides a create method for each non-abstract class of the model." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_12 = NL + " * @see ";
  protected final String TEXT_13 = NL + " * @generated" + NL + " */";
  protected final String TEXT_14 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model <b>Factory</b>." + NL + " * <!-- end-user-doc -->" + NL + " * @generated" + NL + " */";
  protected final String TEXT_15 = NL + "public class ";
  protected final String TEXT_16 = " extends ";
  protected final String TEXT_17 = " implements ";
  protected final String TEXT_18 = NL + "public interface ";
  protected final String TEXT_19 = " extends ";
  protected final String TEXT_20 = NL + "{";
  protected final String TEXT_21 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_22 = " copyright = ";
  protected final String TEXT_23 = ";";
  protected final String TEXT_24 = NL;
  protected final String TEXT_25 = NL + "\t/**" + NL + "\t * The singleton instance of the factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_26 = " eINSTANCE = init();" + NL;
  protected final String TEXT_27 = NL + "\t/**" + NL + "\t * The singleton instance of the factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_28 = " INSTANCE = ";
  protected final String TEXT_29 = ".eINSTANCE;" + NL;
  protected final String TEXT_30 = NL + "\t/**" + NL + "\t * The singleton instance of the factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_31 = " eINSTANCE = ";
  protected final String TEXT_32 = ".init();" + NL;
  protected final String TEXT_33 = NL + "\t/**" + NL + "\t * Creates the default factory implementation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_34 = NL + "\tpublic static ";
  protected final String TEXT_35 = " init()" + NL + "\t{" + NL + "\t\ttry" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_36 = " the";
  protected final String TEXT_37 = " = (";
  protected final String TEXT_38 = ")";
  protected final String TEXT_39 = ".Registry.INSTANCE.getEFactory(";
  protected final String TEXT_40 = ".eNS_URI);" + NL + "\t\t\tif (the";
  protected final String TEXT_41 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\treturn the";
  protected final String TEXT_42 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tcatch (Exception exception)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_43 = ".INSTANCE.log(exception);" + NL + "\t\t}" + NL + "\t\treturn new ";
  protected final String TEXT_44 = "();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Creates an instance of the factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_45 = "()" + NL + "\t{" + NL + "\t\tsuper();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_46 = NL + "\t@Override";
  protected final String TEXT_47 = NL + "\t// CHANGE gen: Added generics and annotation" + NL + "\t@SuppressWarnings(\"unchecked\")" + NL + "\tpublic <T extends EObject> T create(EClass<T> eClass)" + NL + "\t{" + NL + "\t\tswitch (eClass.getClassifierID())" + NL + "\t\t{";
  protected final String TEXT_48 = NL + "\t\t\tcase ";
  protected final String TEXT_49 = ".";
  protected final String TEXT_50 = ": return (T) ";
  protected final String TEXT_51 = "create";
  protected final String TEXT_52 = "();";
  protected final String TEXT_53 = NL + "\t\t\tdefault:" + NL + "\t\t\t\tthrow new IllegalArgumentException(\"The class '\" + eClass.getName() + \"' is not a valid classifier\");";
  protected final String TEXT_54 = NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_55 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_56 = NL + "\t@Override";
  protected final String TEXT_57 = NL + "\t// CHANGE gen: Added generics and annotation" + NL + "\t@SuppressWarnings(\"unchecked\")" + NL + "\tpublic <T> T createFromString(";
  protected final String TEXT_58 = "<T> eDataType, String initialValue)" + NL + "\t{" + NL + "\t\t// CHANGE gen: Cast added 1" + NL + "\t\tswitch (eDataType.getClassifierID())" + NL + "\t\t{";
  protected final String TEXT_59 = NL + "\t\t\tcase ";
  protected final String TEXT_60 = ".";
  protected final String TEXT_61 = ":" + NL + "\t\t\t\treturn (T) create";
  protected final String TEXT_62 = "FromString((";
  protected final String TEXT_63 = "<";
  protected final String TEXT_64 = ">) eDataType, initialValue);";
  protected final String TEXT_65 = NL + "\t\t\tdefault:" + NL + "\t\t\t\tthrow new IllegalArgumentException(\"The datatype '\" + eDataType.getName() + \"' is not a valid classifier\");";
  protected final String TEXT_66 = NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_67 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_68 = NL + "\t@Override";
  protected final String TEXT_69 = NL + "\tpublic <T> String convertToString(";
  protected final String TEXT_70 = "<T> eDataType, T instanceValue)" + NL + "\t{" + NL + "\t\tswitch (eDataType.getClassifierID())" + NL + "\t\t{";
  protected final String TEXT_71 = NL + "\t\t\tcase ";
  protected final String TEXT_72 = ".";
  protected final String TEXT_73 = ":" + NL + "\t\t\t\treturn convert";
  protected final String TEXT_74 = "ToString((";
  protected final String TEXT_75 = "<";
  protected final String TEXT_76 = ">) eDataType, (";
  protected final String TEXT_77 = ") instanceValue);";
  protected final String TEXT_78 = NL + "\t\t\tdefault:" + NL + "\t\t\t\tthrow new IllegalArgumentException(\"The datatype '\" + eDataType.getName() + \"' is not a valid classifier\");";
  protected final String TEXT_79 = NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_80 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_81 = " create";
  protected final String TEXT_82 = "()" + NL + "\t{";
  protected final String TEXT_83 = NL + "\t\t";
  protected final String TEXT_84 = " ";
  protected final String TEXT_85 = " = ";
  protected final String TEXT_86 = "super.create(";
  protected final String TEXT_87 = ");";
  protected final String TEXT_88 = NL + "\t\t";
  protected final String TEXT_89 = " ";
  protected final String TEXT_90 = " = new ";
  protected final String TEXT_91 = "()";
  protected final String TEXT_92 = "{}";
  protected final String TEXT_93 = ";";
  protected final String TEXT_94 = NL + "\t\treturn ";
  protected final String TEXT_95 = ";" + NL + "\t}" + NL;
  protected final String TEXT_96 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_97 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_98 = NL + "\tpublic ";
  protected final String TEXT_99 = " create";
  protected final String TEXT_100 = "(";
  protected final String TEXT_101 = "final ";
  protected final String TEXT_102 = "String ";
  protected final String TEXT_103 = "it";
  protected final String TEXT_104 = "literal";
  protected final String TEXT_105 = ")" + NL + "\t{";
  protected final String TEXT_106 = NL + "\t\t";
  protected final String TEXT_107 = NL + "\t\t";
  protected final String TEXT_108 = " result = ";
  protected final String TEXT_109 = ".get(literal);" + NL + "\t\tif (result == null) throw new IllegalArgumentException(\"The value '\" + literal + \"' is not a valid enumerator of '\" + ";
  protected final String TEXT_110 = ".getName() + \"'\");";
  protected final String TEXT_111 = NL + "\t\treturn result;";
  protected final String TEXT_112 = NL + "\t\treturn new ";
  protected final String TEXT_113 = "(create";
  protected final String TEXT_114 = "(literal));";
  protected final String TEXT_115 = NL + "\t\treturn create";
  protected final String TEXT_116 = "(literal);";
  protected final String TEXT_117 = NL + "\t\treturn new ";
  protected final String TEXT_118 = "(";
  protected final String TEXT_119 = ".create";
  protected final String TEXT_120 = "(literal));";
  protected final String TEXT_121 = NL + "\t\treturn ";
  protected final String TEXT_122 = ".create";
  protected final String TEXT_123 = "(literal);";
  protected final String TEXT_124 = NL + "\t\treturn ";
  protected final String TEXT_125 = "(";
  protected final String TEXT_126 = ")";
  protected final String TEXT_127 = ".createFromString(";
  protected final String TEXT_128 = ", literal);";
  protected final String TEXT_129 = NL + "\t\tif (literal == null) return null;" + NL + "\t\t";
  protected final String TEXT_130 = " result = new ";
  protected final String TEXT_131 = "<";
  protected final String TEXT_132 = ">";
  protected final String TEXT_133 = "();";
  protected final String TEXT_134 = NL + "\t\tfor (";
  protected final String TEXT_135 = " stringTokenizer = new ";
  protected final String TEXT_136 = "(literal); stringTokenizer.hasMoreTokens(); )";
  protected final String TEXT_137 = NL + "\t\tfor (String item : split(literal))";
  protected final String TEXT_138 = NL + "\t\t{";
  protected final String TEXT_139 = NL + "\t\t\tString item = stringTokenizer.nextToken();";
  protected final String TEXT_140 = NL + "\t\t\tresult.add(create";
  protected final String TEXT_141 = "(item));";
  protected final String TEXT_142 = NL + "\t\t\tresult.add(create";
  protected final String TEXT_143 = "FromString(";
  protected final String TEXT_144 = ", item));";
  protected final String TEXT_145 = NL + "\t\t\tresult.add(";
  protected final String TEXT_146 = ".create";
  protected final String TEXT_147 = "(item));";
  protected final String TEXT_148 = NL + "\t\t\tresult.add(";
  protected final String TEXT_149 = ".createFromString(";
  protected final String TEXT_150 = ", item));";
  protected final String TEXT_151 = NL + "\t\t}" + NL + "\t\treturn result;";
  protected final String TEXT_152 = NL + "\t\tif (literal == null) return ";
  protected final String TEXT_153 = ";" + NL + "\t\t";
  protected final String TEXT_154 = " result = ";
  protected final String TEXT_155 = ";" + NL + "\t\tRuntimeException exception = null;";
  protected final String TEXT_156 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_157 = NL + "\t\t\tresult = create";
  protected final String TEXT_158 = "(literal);";
  protected final String TEXT_159 = NL + "\t\t\tresult = (";
  protected final String TEXT_160 = ")create";
  protected final String TEXT_161 = "FromString(";
  protected final String TEXT_162 = ", literal);";
  protected final String TEXT_163 = NL + "\t\t\tresult = ";
  protected final String TEXT_164 = ".create";
  protected final String TEXT_165 = "(literal);";
  protected final String TEXT_166 = NL + "\t\t\tresult = (";
  protected final String TEXT_167 = ")";
  protected final String TEXT_168 = ".createFromString(";
  protected final String TEXT_169 = ", literal);";
  protected final String TEXT_170 = NL + "\t\t\tif (";
  protected final String TEXT_171 = "result != null && ";
  protected final String TEXT_172 = ".INSTANCE.validate(";
  protected final String TEXT_173 = ", ";
  protected final String TEXT_174 = "new ";
  protected final String TEXT_175 = "(result)";
  protected final String TEXT_176 = "result";
  protected final String TEXT_177 = ", null, null))" + NL + "\t\t\t{" + NL + "\t\t\t\treturn result;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tcatch (RuntimeException e)" + NL + "\t\t{" + NL + "\t\t\texception = e;" + NL + "\t\t}";
  protected final String TEXT_178 = NL + "\t\tif (";
  protected final String TEXT_179 = "result != null || ";
  protected final String TEXT_180 = "exception == null) return result;" + NL + "    " + NL + "\t\tthrow exception;";
  protected final String TEXT_181 = NL + "\t\treturn (";
  protected final String TEXT_182 = ")super.createFromString(literal);";
  protected final String TEXT_183 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new ";
  protected final String TEXT_184 = "();";
  protected final String TEXT_185 = NL + "\t\treturn ((";
  protected final String TEXT_186 = ")super.createFromString(";
  protected final String TEXT_187 = ", literal)).";
  protected final String TEXT_188 = "();";
  protected final String TEXT_189 = NL + "\t\treturn ";
  protected final String TEXT_190 = "(";
  protected final String TEXT_191 = ")";
  protected final String TEXT_192 = "super.createFromString(";
  protected final String TEXT_193 = ", literal);";
  protected final String TEXT_194 = NL + "\t}" + NL;
  protected final String TEXT_195 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_196 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_197 = NL + "\tpublic ";
  protected final String TEXT_198 = " create";
  protected final String TEXT_199 = "FromString(";
  protected final String TEXT_200 = "<";
  protected final String TEXT_201 = "> eDataType, String initialValue)" + NL + "\t{";
  protected final String TEXT_202 = NL + "\t\treturn create";
  protected final String TEXT_203 = "(initialValue);";
  protected final String TEXT_204 = NL + "\t\t";
  protected final String TEXT_205 = " result = ";
  protected final String TEXT_206 = ".get(initialValue);" + NL + "\t\tif (result == null) throw new IllegalArgumentException(\"The value '\" + initialValue + \"' is not a valid enumerator of '\" + eDataType.getName() + \"'\");";
  protected final String TEXT_207 = NL + "\t\treturn result;";
  protected final String TEXT_208 = NL + "\t\treturn ";
  protected final String TEXT_209 = "(";
  protected final String TEXT_210 = ")";
  protected final String TEXT_211 = "create";
  protected final String TEXT_212 = "FromString(";
  protected final String TEXT_213 = ", initialValue);";
  protected final String TEXT_214 = NL + "\t\treturn ";
  protected final String TEXT_215 = "(";
  protected final String TEXT_216 = ")";
  protected final String TEXT_217 = ".createFromString(";
  protected final String TEXT_218 = ", initialValue);";
  protected final String TEXT_219 = NL + "\t\treturn create";
  protected final String TEXT_220 = "(initialValue);";
  protected final String TEXT_221 = NL + "\t\tif (initialValue == null) return null;" + NL + "\t\t";
  protected final String TEXT_222 = " result = new ";
  protected final String TEXT_223 = "<";
  protected final String TEXT_224 = ">";
  protected final String TEXT_225 = "();";
  protected final String TEXT_226 = NL + "\t\tfor (";
  protected final String TEXT_227 = " stringTokenizer = new ";
  protected final String TEXT_228 = "(initialValue); stringTokenizer.hasMoreTokens(); )";
  protected final String TEXT_229 = NL + "\t\tfor (String item : split(initialValue))";
  protected final String TEXT_230 = NL + "\t\t{";
  protected final String TEXT_231 = NL + "\t\t\tString item = stringTokenizer.nextToken();";
  protected final String TEXT_232 = NL + "\t\t\tresult.add(create";
  protected final String TEXT_233 = "FromString(";
  protected final String TEXT_234 = ", item));";
  protected final String TEXT_235 = NL + "\t\t\tresult.add(";
  protected final String TEXT_236 = "(";
  protected final String TEXT_237 = ")";
  protected final String TEXT_238 = ".createFromString(";
  protected final String TEXT_239 = ", item));";
  protected final String TEXT_240 = NL + "\t\t}" + NL + "\t\treturn result;";
  protected final String TEXT_241 = NL + "\t\treturn new ";
  protected final String TEXT_242 = "(create";
  protected final String TEXT_243 = "(initialValue));";
  protected final String TEXT_244 = NL + "\t\treturn create";
  protected final String TEXT_245 = "(initialValue);";
  protected final String TEXT_246 = NL + "\t\tif (initialValue == null) return null;" + NL + "\t\t";
  protected final String TEXT_247 = " result = null;" + NL + "\t\tRuntimeException exception = null;";
  protected final String TEXT_248 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_249 = NL + "\t\t\tresult = ";
  protected final String TEXT_250 = "(";
  protected final String TEXT_251 = ")";
  protected final String TEXT_252 = "create";
  protected final String TEXT_253 = "FromString(";
  protected final String TEXT_254 = ", initialValue);";
  protected final String TEXT_255 = NL + "\t\t\tresult = ";
  protected final String TEXT_256 = "(";
  protected final String TEXT_257 = ")";
  protected final String TEXT_258 = ".createFromString(";
  protected final String TEXT_259 = ", initialValue);";
  protected final String TEXT_260 = NL + "\t\t\tif (result != null && ";
  protected final String TEXT_261 = ".INSTANCE.validate(eDataType, result, null, null))" + NL + "\t\t\t{" + NL + "\t\t\t\treturn result;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tcatch (RuntimeException e)" + NL + "\t\t{" + NL + "\t\t\texception = e;" + NL + "\t\t}";
  protected final String TEXT_262 = NL + "\t\tif (result != null || exception == null) return result;" + NL + "    " + NL + "\t\tthrow exception;";
  protected final String TEXT_263 = NL + "\t\treturn create";
  protected final String TEXT_264 = "(initialValue);";
  protected final String TEXT_265 = NL + "\t\treturn ";
  protected final String TEXT_266 = "(";
  protected final String TEXT_267 = ")";
  protected final String TEXT_268 = "super.createFromString(initialValue);";
  protected final String TEXT_269 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new ";
  protected final String TEXT_270 = "();";
  protected final String TEXT_271 = NL + "\t\treturn ";
  protected final String TEXT_272 = "(";
  protected final String TEXT_273 = ")";
  protected final String TEXT_274 = "super.createFromString(eDataType, initialValue);";
  protected final String TEXT_275 = NL + "\t}" + NL;
  protected final String TEXT_276 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic String convert";
  protected final String TEXT_277 = "(";
  protected final String TEXT_278 = "final ";
  protected final String TEXT_279 = " ";
  protected final String TEXT_280 = "it";
  protected final String TEXT_281 = "instanceValue";
  protected final String TEXT_282 = ")" + NL + "\t{";
  protected final String TEXT_283 = NL + "\t\t";
  protected final String TEXT_284 = NL + "\t\treturn instanceValue == null ? null : instanceValue.toString();";
  protected final String TEXT_285 = NL + "\t\treturn instanceValue == null ? null : convert";
  protected final String TEXT_286 = "(instanceValue";
  protected final String TEXT_287 = ".";
  protected final String TEXT_288 = "()";
  protected final String TEXT_289 = ");";
  protected final String TEXT_290 = NL + "\t\treturn convert";
  protected final String TEXT_291 = "(instanceValue);";
  protected final String TEXT_292 = NL + "\t\treturn ";
  protected final String TEXT_293 = ".convert";
  protected final String TEXT_294 = "(instanceValue);";
  protected final String TEXT_295 = NL + "\t\treturn ";
  protected final String TEXT_296 = ".convertToString(";
  protected final String TEXT_297 = ", instanceValue);";
  protected final String TEXT_298 = NL + "\t\tif (instanceValue == null) return null;" + NL + "\t\tif (instanceValue.isEmpty()) return \"\";" + NL + "\t\t";
  protected final String TEXT_299 = " result = new ";
  protected final String TEXT_300 = "();";
  protected final String TEXT_301 = NL + "\t\tfor (";
  protected final String TEXT_302 = " i = instanceValue.iterator(); i.hasNext(); )";
  protected final String TEXT_303 = NL + "\t\t// CHANGE gen: Cast added 4" + NL + "\t\tfor (";
  protected final String TEXT_304 = " item : instanceValue)";
  protected final String TEXT_305 = NL + "\t\t{";
  protected final String TEXT_306 = NL + "\t\t\tresult.append(convert";
  protected final String TEXT_307 = "((";
  protected final String TEXT_308 = ") ";
  protected final String TEXT_309 = "));";
  protected final String TEXT_310 = NL + "\t\t\tresult.append(convert";
  protected final String TEXT_311 = "ToString(";
  protected final String TEXT_312 = ", (";
  protected final String TEXT_313 = ") ";
  protected final String TEXT_314 = "));";
  protected final String TEXT_315 = NL + "\t\t\tresult.append(";
  protected final String TEXT_316 = ".convert";
  protected final String TEXT_317 = "((";
  protected final String TEXT_318 = ")";
  protected final String TEXT_319 = "));";
  protected final String TEXT_320 = NL + "\t\t\tresult.append(";
  protected final String TEXT_321 = ".convertToString(";
  protected final String TEXT_322 = ", (";
  protected final String TEXT_323 = ") ";
  protected final String TEXT_324 = "));";
  protected final String TEXT_325 = NL + "\t\t\tresult.append(' ');" + NL + "\t\t}" + NL + "\t\treturn result.substring(0, result.length() - 1);";
  protected final String TEXT_326 = NL + "\t\tif (instanceValue == null) return null;";
  protected final String TEXT_327 = NL + "\t\tif (";
  protected final String TEXT_328 = ".isInstance(instanceValue))" + NL + "\t\t{" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t// CHANGE gen: Cast added 2";
  protected final String TEXT_329 = NL + "\t\t\t\tString value = convert";
  protected final String TEXT_330 = "(instanceValue);";
  protected final String TEXT_331 = NL + "\t\t\t\tString value = convert";
  protected final String TEXT_332 = "(((";
  protected final String TEXT_333 = ")instanceValue).";
  protected final String TEXT_334 = "());";
  protected final String TEXT_335 = NL + "\t\t\t\tString value = convert";
  protected final String TEXT_336 = "((";
  protected final String TEXT_337 = ")instanceValue);";
  protected final String TEXT_338 = NL + "\t\t\t\tString value = convert";
  protected final String TEXT_339 = "ToString(";
  protected final String TEXT_340 = ", instanceValue);";
  protected final String TEXT_341 = NL + "\t\t\t\tString value = ";
  protected final String TEXT_342 = ".convert";
  protected final String TEXT_343 = "((";
  protected final String TEXT_344 = ") instanceValue);";
  protected final String TEXT_345 = NL + "\t\t\t\tString value = ";
  protected final String TEXT_346 = ".convertToString(";
  protected final String TEXT_347 = ", (";
  protected final String TEXT_348 = ") instanceValue);";
  protected final String TEXT_349 = NL + "\t\t\t\tif (value != null) return value;" + NL + "\t\t\t}" + NL + "\t\t\tcatch (Exception e)" + NL + "\t\t\t{" + NL + "\t\t\t\t// Keep trying other member types until all have failed." + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_350 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_351 = NL + "\t\t\tString value = convert";
  protected final String TEXT_352 = "(instanceValue);";
  protected final String TEXT_353 = NL + "\t\t\tString value = convert";
  protected final String TEXT_354 = "ToString(";
  protected final String TEXT_355 = ", ";
  protected final String TEXT_356 = "new ";
  protected final String TEXT_357 = "(instanceValue)";
  protected final String TEXT_358 = "instanceValue";
  protected final String TEXT_359 = ");";
  protected final String TEXT_360 = NL + "\t\t\tString value = ";
  protected final String TEXT_361 = ".convert";
  protected final String TEXT_362 = "(instanceValue);";
  protected final String TEXT_363 = NL + "\t\t\tString value = ";
  protected final String TEXT_364 = ".convertToString(";
  protected final String TEXT_365 = ", ";
  protected final String TEXT_366 = "new ";
  protected final String TEXT_367 = "(instanceValue)";
  protected final String TEXT_368 = "instanceValue";
  protected final String TEXT_369 = ");";
  protected final String TEXT_370 = NL + "\t\t\tif (value != null) return value;" + NL + "\t\t}" + NL + "\t\tcatch (Exception e)" + NL + "\t\t{" + NL + "\t\t\t// Keep trying other member types until all have failed." + NL + "\t\t}";
  protected final String TEXT_371 = NL + "\t\tthrow new IllegalArgumentException(\"Invalid value: '\"+instanceValue+\"' for datatype :\"+";
  protected final String TEXT_372 = ".getName());";
  protected final String TEXT_373 = NL + "\t\treturn super.convertToString(instanceValue);";
  protected final String TEXT_374 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new ";
  protected final String TEXT_375 = "();";
  protected final String TEXT_376 = NL + "\t\treturn super.convertToString(";
  protected final String TEXT_377 = ", new ";
  protected final String TEXT_378 = "(instanceValue));";
  protected final String TEXT_379 = NL + "\t\treturn super.convertToString(";
  protected final String TEXT_380 = ", instanceValue);";
  protected final String TEXT_381 = NL + "\t}" + NL;
  protected final String TEXT_382 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_383 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_384 = NL + "\tpublic String convert";
  protected final String TEXT_385 = "ToString(";
  protected final String TEXT_386 = "<";
  protected final String TEXT_387 = "> eDataType, Object instanceValue)" + NL + "\t{";
  protected final String TEXT_388 = NL + "\t\treturn convert";
  protected final String TEXT_389 = "((";
  protected final String TEXT_390 = ")instanceValue);";
  protected final String TEXT_391 = NL + "\t\treturn instanceValue == null ? null : instanceValue.toString();";
  protected final String TEXT_392 = NL + "\t\treturn convert";
  protected final String TEXT_393 = "ToString(";
  protected final String TEXT_394 = ", instanceValue);";
  protected final String TEXT_395 = NL + "\t\treturn ";
  protected final String TEXT_396 = ".convertToString(";
  protected final String TEXT_397 = ", instanceValue);";
  protected final String TEXT_398 = NL + "\t\treturn convert";
  protected final String TEXT_399 = "((";
  protected final String TEXT_400 = ")instanceValue);";
  protected final String TEXT_401 = NL + "\t\tif (instanceValue == null) return null;" + NL + "\t\t";
  protected final String TEXT_402 = " list = (";
  protected final String TEXT_403 = ")instanceValue;" + NL + "\t\tif (list.isEmpty()) return \"\";" + NL + "\t\t";
  protected final String TEXT_404 = " result = new ";
  protected final String TEXT_405 = "();";
  protected final String TEXT_406 = NL + "\t\tfor (";
  protected final String TEXT_407 = " i = list.iterator(); i.hasNext(); )";
  protected final String TEXT_408 = NL + "\t\tfor (";
  protected final String TEXT_409 = " item : list)";
  protected final String TEXT_410 = NL + "\t\t{";
  protected final String TEXT_411 = NL + "\t\t\tresult.append(convert";
  protected final String TEXT_412 = "ToString(";
  protected final String TEXT_413 = ", (";
  protected final String TEXT_414 = ") ";
  protected final String TEXT_415 = "));";
  protected final String TEXT_416 = NL + "\t\t\tresult.append(";
  protected final String TEXT_417 = ".convertToString(";
  protected final String TEXT_418 = ", (";
  protected final String TEXT_419 = ") ";
  protected final String TEXT_420 = "));";
  protected final String TEXT_421 = NL + "\t\t\tresult.append(' ');" + NL + "\t\t}" + NL + "\t\treturn result.substring(0, result.length() - 1);";
  protected final String TEXT_422 = NL + "\t\treturn instanceValue == null ? null : convert";
  protected final String TEXT_423 = "(((";
  protected final String TEXT_424 = ")instanceValue)";
  protected final String TEXT_425 = ".";
  protected final String TEXT_426 = "()";
  protected final String TEXT_427 = ");";
  protected final String TEXT_428 = NL + "\t\treturn convert";
  protected final String TEXT_429 = "(instanceValue);";
  protected final String TEXT_430 = NL + "\t\tif (instanceValue == null) return null;";
  protected final String TEXT_431 = NL + "\t\tif (";
  protected final String TEXT_432 = ".isInstance(instanceValue))" + NL + "\t\t{" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t// CHANGE gen: Cast added 3";
  protected final String TEXT_433 = NL + "\t\t\t\tString value = convert";
  protected final String TEXT_434 = "ToString(";
  protected final String TEXT_435 = ", (";
  protected final String TEXT_436 = ") instanceValue);";
  protected final String TEXT_437 = NL + "\t\t\t\tString value = ";
  protected final String TEXT_438 = ".convertToString(";
  protected final String TEXT_439 = ", (";
  protected final String TEXT_440 = ") instanceValue);";
  protected final String TEXT_441 = NL + "\t\t\t\tif (value != null) return value;" + NL + "\t\t\t}" + NL + "\t\t\tcatch (Exception e)" + NL + "\t\t\t{" + NL + "\t\t\t\t// Keep trying other member types until all have failed." + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_442 = NL + "\t\tthrow new IllegalArgumentException(\"Invalid value: '\"+instanceValue+\"' for datatype :\"+eDataType.getName());";
  protected final String TEXT_443 = NL + "\t\treturn instanceValue == null ? null : convert";
  protected final String TEXT_444 = "(";
  protected final String TEXT_445 = "(";
  protected final String TEXT_446 = "(";
  protected final String TEXT_447 = ")instanceValue";
  protected final String TEXT_448 = ").";
  protected final String TEXT_449 = "()";
  protected final String TEXT_450 = ");";
  protected final String TEXT_451 = NL + "\t\treturn convert";
  protected final String TEXT_452 = "((";
  protected final String TEXT_453 = ")instanceValue);";
  protected final String TEXT_454 = NL + "\t\treturn super.convertToString(instanceValue);";
  protected final String TEXT_455 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new ";
  protected final String TEXT_456 = "();";
  protected final String TEXT_457 = NL + "\t\treturn super.convertToString(eDataType, instanceValue);";
  protected final String TEXT_458 = NL + "\t}" + NL;
  protected final String TEXT_459 = NL + "\t/**" + NL + "\t * Returns a new object of class '<em>";
  protected final String TEXT_460 = "</em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return a new object of class '<em>";
  protected final String TEXT_461 = "</em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_462 = " create";
  protected final String TEXT_463 = "();" + NL;
  protected final String TEXT_464 = NL + "\t/**" + NL + "\t * Returns an instance of data type '<em>";
  protected final String TEXT_465 = "</em>' corresponding the given literal." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param literal a literal of the data type." + NL + "\t * @return a new instance value of the data type." + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_466 = " create";
  protected final String TEXT_467 = "(String literal);" + NL + "" + NL + "\t/**" + NL + "\t * Returns a literal representation of an instance of data type '<em>";
  protected final String TEXT_468 = "</em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param instanceValue an instance value of the data type." + NL + "\t * @return a literal representation of the instance value." + NL + "\t * @generated" + NL + "\t */" + NL + "\tString convert";
  protected final String TEXT_469 = "(";
  protected final String TEXT_470 = " instanceValue);" + NL;
  protected final String TEXT_471 = NL + "\t/**" + NL + "\t * Returns the package supported by this factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return the package supported by this factory." + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_472 = " get";
  protected final String TEXT_473 = "();" + NL;
  protected final String TEXT_474 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_475 = " get";
  protected final String TEXT_476 = "()" + NL + "\t{" + NL + "\t\treturn (";
  protected final String TEXT_477 = ")getEPackage();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @deprecated" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_478 = NL + "\t@Deprecated";
  protected final String TEXT_479 = NL + "\tpublic static ";
  protected final String TEXT_480 = " getPackage()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_481 = ".eINSTANCE;" + NL + "\t}" + NL;
  protected final String TEXT_482 = NL + "} //";
  protected final String TEXT_483 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * Copyright (c) 2002-2010 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */

    GenPackage genPackage = (GenPackage)((Object[])argument)[0]; GenModel genModel=genPackage.getGenModel(); /* Trick to import java.util.* without warnings */Iterator.class.getName();
    boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]);
    String publicStaticFinalFlag = isImplementation ? "public static final " : "";
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    }}
    stringBuffer.append(TEXT_4);
    if (isInterface || genModel.isSuppressInterfaces()) {
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genPackage.getReflectionPackageName());
    stringBuffer.append(TEXT_6);
    } else {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_8);
    }
    stringBuffer.append(TEXT_9);
    if (isImplementation) {
    genModel.addPseudoImport("org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container");
    genModel.addPseudoImport("org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container.Dynamic");
    genModel.addImport("org.eclipse.emf.ecore.EClass");
    genModel.addImport("org.eclipse.emf.ecore.EObject");
    if (!genPackage.hasJavaLangConflict() && !genPackage.hasInterfaceImplConflict() && !genPackage.getClassPackageName().equals(genPackage.getInterfacePackageName())) genModel.addImport(genPackage.getInterfacePackageName() + ".*");
    }
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_10);
    if (isInterface) {
    stringBuffer.append(TEXT_11);
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    }
    stringBuffer.append(TEXT_13);
    } else {
    stringBuffer.append(TEXT_14);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genPackage.getFactoryClassName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.EFactoryImpl"));
    if (!genModel.isSuppressInterfaces()) {
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genPackage.getImportedFactoryInterfaceName());
    }
    } else {
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genPackage.getFactoryInterfaceName());
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EFactory"));
    }
    }
    stringBuffer.append(TEXT_20);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_21);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_24);
    }
    if (isImplementation && (genModel.isSuppressEMFMetaData() || genModel.isSuppressInterfaces())) {
    stringBuffer.append(TEXT_25);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genPackage.getFactoryClassName());
    stringBuffer.append(TEXT_26);
    }
    if (isInterface && genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genPackage.getFactoryInterfaceName());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genPackage.getQualifiedFactoryClassName());
    stringBuffer.append(TEXT_29);
    } else if (isInterface && !genModel.isSuppressInterfaces()) {
    stringBuffer.append(TEXT_30);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genPackage.getFactoryInterfaceName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genPackage.getQualifiedFactoryClassName());
    stringBuffer.append(TEXT_32);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_33);
    String factoryType = genModel.isSuppressEMFMetaData() ? genPackage.getFactoryClassName() : genPackage.getImportedFactoryInterfaceName();
    stringBuffer.append(TEXT_34);
    stringBuffer.append(factoryType);
    stringBuffer.append(TEXT_35);
    stringBuffer.append(factoryType);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genPackage.getFactoryName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(factoryType);
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genPackage.getPackageInterfaceName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genPackage.getFactoryName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genPackage.getFactoryName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genPackage.getImportedFactoryClassName());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genPackage.getFactoryClassName());
    stringBuffer.append(TEXT_45);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_46);
    }
    stringBuffer.append(TEXT_47);
    for (GenClass genClass : genPackage.getGenClasses()) {
    if (!genClass.isAbstract()) {
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genClass.getClassifierID());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(!genClass.isEObjectExtension() ? "(EObject)" : "" );
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_52);
    }
    }
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_54);
    if (!genPackage.getAllGenDataTypes().isEmpty()) {
    stringBuffer.append(TEXT_55);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_56);
    }
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EDataType"));
    stringBuffer.append(TEXT_58);
    for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
    if (genDataType.isSerializable()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genDataType.getClassifierID());
    stringBuffer.append(TEXT_61);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EDataType"));
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_64);
    }
    }
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_66);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_67);
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_68);
    }
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EDataType"));
    stringBuffer.append(TEXT_70);
    for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
    if (genDataType.isSerializable()) {
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genDataType.getClassifierID());
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EDataType"));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_77);
    }
    }
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_79);
    }
    for (GenClass genClass : genPackage.getGenClasses()) {
    if (!genClass.isAbstract()) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genClass.getTypeParameters());
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(genClass.getInterfaceTypeArguments());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_82);
    if (genClass.isDynamic()) {
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(genClass.getInterfaceTypeArguments());
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genClass.getSafeUncapName());
    stringBuffer.append(TEXT_85);
    stringBuffer.append(genClass.getCastFromEObject());
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_87);
    } else {
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genClass.getImportedClassName());
    stringBuffer.append(genClass.getClassTypeArguments());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genClass.getSafeUncapName());
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genClass.getImportedClassName());
    stringBuffer.append(genClass.getClassTypeArguments());
    stringBuffer.append(TEXT_91);
    if (genModel.isSuppressInterfaces() && !genPackage.getReflectionPackageName().equals(genPackage.getInterfacePackageName())) {
    stringBuffer.append(TEXT_92);
    }
    stringBuffer.append(TEXT_93);
    }
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genClass.getSafeUncapName());
    stringBuffer.append(TEXT_95);
    }
    }
    for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
    if (genDataType.isSerializable()) {
    if (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody()) { String eDataType = genDataType.getQualifiedClassifierAccessor();
    stringBuffer.append(TEXT_96);
    if (genModel.useGenerics() && genDataType.isUncheckedCast() && !genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_97);
    }
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genDataType.getImportedParameterizedInstanceClassName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_100);
    if (genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_101);
    }
    stringBuffer.append(TEXT_102);
    if (genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_103);
    } else {
    stringBuffer.append(TEXT_104);
    }
    stringBuffer.append(TEXT_105);
    if (genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genDataType.getCreatorBody(genModel.getIndentation(stringBuffer)));
    } else if (genDataType instanceof GenEnum) {
    stringBuffer.append(TEXT_107);
    stringBuffer.append(genDataType.getImportedInstanceClassName());
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genDataType.getImportedInstanceClassName());
    stringBuffer.append(TEXT_109);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(genModel.getNonNLS(3));
    stringBuffer.append(TEXT_111);
    } else if (genDataType.getBaseType() != null) { GenDataType genBaseType = genDataType.getBaseType(); boolean isPrimitiveConversion = !genDataType.isPrimitiveType() && genBaseType.isPrimitiveType();
    if (genBaseType.getGenPackage() == genPackage) {
    if (isPrimitiveConversion && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_114);
    } else {
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_116);
    }
    } else if (genBaseType.getGenPackage().isDataTypeConverters()) {
    if (isPrimitiveConversion && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_120);
    } else {
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_123);
    }
    } else {
    stringBuffer.append(TEXT_124);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_126);
    }
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_128);
    }
    } else if (genDataType.getItemType() != null) { GenDataType genItemType = genDataType.getItemType(); 
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genDataType.getImportedParameterizedInstanceClassName());
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genModel.getImportedName("java.util.ArrayList"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genItemType.getObjectType().getImportedParameterizedInstanceClassName());
    stringBuffer.append(TEXT_132);
    }
    stringBuffer.append(TEXT_133);
    if (genModel.getRuntimeVersion().getValue() < GenRuntimeVersion.EMF26_VALUE) {
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genModel.getImportedName("java.util.StringTokenizer"));
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genModel.getImportedName("java.util.StringTokenizer"));
    stringBuffer.append(TEXT_136);
    } else {
    stringBuffer.append(TEXT_137);
    }
    stringBuffer.append(TEXT_138);
    if (genModel.getRuntimeVersion().getValue() < GenRuntimeVersion.EMF26_VALUE) {
    stringBuffer.append(TEXT_139);
    }
    if (genItemType.getGenPackage() == genPackage) {
    if (genPackage.isDataTypeConverters()) { genItemType = genItemType.getObjectType();
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_141);
    } else {
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_144);
    }
    } else {
    if (genItemType.getGenPackage().isDataTypeConverters()) { genItemType = genItemType.getObjectType();
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_150);
    }
    }
    stringBuffer.append(TEXT_151);
    } else if (!genDataType.getMemberTypes().isEmpty()) {
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genDataType.getStaticValue(null));
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genDataType.getImportedInstanceClassName());
    stringBuffer.append(TEXT_154);
    stringBuffer.append(genDataType.getStaticValue(null));
    stringBuffer.append(TEXT_155);
    for (GenDataType genMemberType : genDataType.getMemberTypes()) {
    stringBuffer.append(TEXT_156);
    if (genMemberType.getGenPackage() == genPackage) {
    if (genPackage.isDataTypeConverters()) { if (!genDataType.isPrimitiveType()) genMemberType = genMemberType.getObjectType();
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_158);
    } else {
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_161);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_162);
    }
    } else {
    if (genPackage.isDataTypeConverters()) { if (!genDataType.isPrimitiveType()) genMemberType = genMemberType.getObjectType();
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_164);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_165);
    } else {
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_169);
    }
    }
    stringBuffer.append(TEXT_170);
    if (!genDataType.isPrimitiveType()) {
    stringBuffer.append(TEXT_171);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.Diagnostician"));
    stringBuffer.append(TEXT_172);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_173);
    if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_175);
    } else {
    stringBuffer.append(TEXT_176);
    }
    stringBuffer.append(TEXT_177);
    }
    stringBuffer.append(TEXT_178);
    if (!genDataType.isPrimitiveType()) {
    stringBuffer.append(TEXT_179);
    }
    stringBuffer.append(TEXT_180);
    } else if (!genDataType.hasConversionDelegate() && genModel.useGenerics() && (genDataType.isArrayType() || !genDataType.getEcoreDataType().getETypeParameters().isEmpty() || genDataType.getEcoreDataType().getInstanceTypeName().contains("<"))) {
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_182);
    } else if (!genDataType.hasConversionDelegate() && genDataType.isArrayType()) {
    stringBuffer.append(TEXT_183);
    stringBuffer.append(genModel.getImportedName("java.lang.UnsupportedOperationException"));
    stringBuffer.append(TEXT_184);
    } else if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_185);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_186);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genDataType.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_188);
    } else {
    stringBuffer.append(TEXT_189);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_191);
    }
    stringBuffer.append(TEXT_192);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_193);
    }
    stringBuffer.append(TEXT_194);
    }
    stringBuffer.append(TEXT_195);
    if (!genPackage.isDataTypeConverters() && genModel.useGenerics() && genDataType.isUncheckedCast() && !genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_196);
    }
    stringBuffer.append(TEXT_197);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_198);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EDataType"));
    stringBuffer.append(TEXT_200);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_201);
    if (genDataType instanceof GenEnum) {
    if (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_202);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_203);
    } else {
    stringBuffer.append(TEXT_204);
    stringBuffer.append(((GenEnum)genDataType).getImportedInstanceClassName());
    stringBuffer.append(TEXT_205);
    stringBuffer.append(((GenEnum)genDataType).getImportedInstanceClassName());
    stringBuffer.append(TEXT_206);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(genModel.getNonNLS(3));
    stringBuffer.append(TEXT_207);
    }
    } else if (genDataType.getBaseType() != null) { GenDataType genBaseType = genDataType.getBaseType(); 
    if (genBaseType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_208);
    if (!genDataType.getObjectInstanceClassName().equals(genBaseType.getObjectInstanceClassName())) {
    stringBuffer.append(TEXT_209);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_210);
    }
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_212);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_213);
    } else {
    stringBuffer.append(TEXT_214);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_216);
    }
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_218);
    }
    } else if (genDataType.getItemType() != null) { GenDataType genItemType = genDataType.getItemType(); 
    if (genPackage.isDataTypeConverters()) {
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_220);
    } else {
    stringBuffer.append(TEXT_221);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_222);
    stringBuffer.append(genModel.getImportedName("java.util.ArrayList"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_223);
    stringBuffer.append(genItemType.getObjectType().getImportedParameterizedInstanceClassName());
    stringBuffer.append(TEXT_224);
    }
    stringBuffer.append(TEXT_225);
    if (genModel.getRuntimeVersion().getValue() < GenRuntimeVersion.EMF26_VALUE) {
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genModel.getImportedName("java.util.StringTokenizer"));
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genModel.getImportedName("java.util.StringTokenizer"));
    stringBuffer.append(TEXT_228);
    } else {
    stringBuffer.append(TEXT_229);
    }
    stringBuffer.append(TEXT_230);
    if (genModel.getRuntimeVersion().getValue() < GenRuntimeVersion.EMF26_VALUE) {
    stringBuffer.append(TEXT_231);
    }
    if (genItemType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_232);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_234);
    } else {
    stringBuffer.append(TEXT_235);
    if (!genItemType.isObjectType()) {
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genItemType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_237);
    }
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_238);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_239);
    }
    stringBuffer.append(TEXT_240);
    }
    } else if (!genDataType.getMemberTypes().isEmpty()) {
    if (genPackage.isDataTypeConverters()) {
    if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_243);
    } else {
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_245);
    }
    } else {
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_247);
    for (GenDataType genMemberType : genDataType.getMemberTypes()) {
    stringBuffer.append(TEXT_248);
    if (genMemberType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_249);
    if (!genDataType.isObjectType() && !genDataType.getObjectInstanceClassName().equals(genMemberType.getObjectInstanceClassName())) {
    stringBuffer.append(TEXT_250);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_251);
    }
    stringBuffer.append(TEXT_252);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_253);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_254);
    } else {
    stringBuffer.append(TEXT_255);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_257);
    }
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_259);
    }
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.Diagnostician"));
    stringBuffer.append(TEXT_261);
    }
    stringBuffer.append(TEXT_262);
    }
    } else if (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_263);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_264);
    } else if (!genDataType.hasConversionDelegate() && genModel.useGenerics() && (genDataType.isArrayType() || !genDataType.getEcoreDataType().getETypeParameters().isEmpty() || genDataType.getEcoreDataType().getInstanceTypeName().contains("<"))) {
    stringBuffer.append(TEXT_265);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_267);
    }
    stringBuffer.append(TEXT_268);
    } else if (!genDataType.hasConversionDelegate() && genDataType.isArrayType()) {
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genModel.getImportedName("java.lang.UnsupportedOperationException"));
    stringBuffer.append(TEXT_270);
    } else {
    stringBuffer.append(TEXT_271);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_273);
    }
    stringBuffer.append(TEXT_274);
    }
    stringBuffer.append(TEXT_275);
    if (genPackage.isDataTypeConverters() || genDataType.hasConverterBody()) { String eDataType = genDataType.getQualifiedClassifierAccessor();
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_277);
    if (genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_278);
    }
    stringBuffer.append(genDataType.getImportedBoundedWildcardInstanceClassName());
    stringBuffer.append(TEXT_279);
    if (genDataType.hasConverterBody()) {
    stringBuffer.append(TEXT_280);
    } else {
    stringBuffer.append(TEXT_281);
    }
    stringBuffer.append(TEXT_282);
    if (genDataType.hasConverterBody()) {
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genDataType.getConverterBody(genModel.getIndentation(stringBuffer)));
    } else if (genDataType instanceof GenEnum) {
    stringBuffer.append(TEXT_284);
    } else if (genDataType.getBaseType() != null) { GenDataType genBaseType = genDataType.getBaseType(); boolean isPrimitiveConversion = !genDataType.isPrimitiveType() && genBaseType.isPrimitiveType();
    if (genBaseType.getGenPackage() == genPackage) {
    if (isPrimitiveConversion) {
    stringBuffer.append(TEXT_285);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_286);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genBaseType.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_288);
    }
    stringBuffer.append(TEXT_289);
    } else {
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_291);
    }
    } else if (genBaseType.getGenPackage().isDataTypeConverters()) {
    stringBuffer.append(TEXT_292);
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedFactoryInstanceAccessor());
    stringBuffer.append(TEXT_293);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_294);
    } else {
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_297);
    }
    } else if (genDataType.getItemType() != null) { GenDataType genItemType = genDataType.getItemType(); 
    stringBuffer.append(TEXT_298);
    stringBuffer.append(genModel.getImportedName("java.lang.StringBuffer"));
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genModel.getImportedName("java.lang.StringBuffer"));
    stringBuffer.append(TEXT_300);
    String item; if (!genModel.useGenerics()) { item = "i.next()"; 
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_302);
    } else { item = "item";
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genModel.getImportedName("java.lang.Object"));
    stringBuffer.append(TEXT_304);
    }
    stringBuffer.append(TEXT_305);
    if (genItemType.getGenPackage() == genPackage) {
    if (genPackage.isDataTypeConverters()) { genItemType = genItemType.getObjectType();
    stringBuffer.append(TEXT_306);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_307);
    stringBuffer.append(genItemType.getImportedWildcardObjectInstanceClassName());
    stringBuffer.append(TEXT_308);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_309);
    } else {
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genItemType.getImportedWildcardObjectInstanceClassName());
    stringBuffer.append(TEXT_313);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_314);
    }
    } else {
    if (genItemType.getGenPackage().isDataTypeConverters()) { genItemType = genItemType.getObjectType();
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genItemType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_318);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_319);
    } else {
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_321);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genItemType.getImportedWildcardObjectInstanceClassName());
    stringBuffer.append(TEXT_323);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_324);
    }
    }
    stringBuffer.append(TEXT_325);
    } else if (!genDataType.getMemberTypes().isEmpty()) {
    if (!genDataType.isPrimitiveType()) {
    stringBuffer.append(TEXT_326);
    for (GenDataType genMemberType : genDataType.getMemberTypes()) {
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_328);
    if (genMemberType.getGenPackage() == genPackage) {
    if (genPackage.isDataTypeConverters()) {
    if (genMemberType.getQualifiedInstanceClassName().equals(genDataType.getQualifiedInstanceClassName())) {
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_330);
    } else if (genMemberType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genMemberType.getObjectType().getImportedWildcardObjectInstanceClassName());
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genMemberType.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_334);
    } else {
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genMemberType.getObjectType().getImportedWildcardObjectInstanceClassName());
    stringBuffer.append(TEXT_337);
    }
    } else {
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_340);
    }
    } else {
    if (genMemberType.getGenPackage().isDataTypeConverters()) { genMemberType = genMemberType.getObjectType();
    stringBuffer.append(TEXT_341);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genMemberType.getImportedWildcardObjectInstanceClassName());
    stringBuffer.append(TEXT_344);
    } else {
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genMemberType.getImportedWildcardObjectInstanceClassName());
    stringBuffer.append(TEXT_348);
    }
    }
    stringBuffer.append(TEXT_349);
    }
    } else {
    for (GenDataType genMemberType : genDataType.getMemberTypes()) {
    stringBuffer.append(TEXT_350);
    if (genMemberType.getGenPackage() == genPackage) {
    if (genPackage.isDataTypeConverters()) {
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_352);
    } else {
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_354);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_355);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_356);
    stringBuffer.append(genMemberType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_357);
    } else {
    stringBuffer.append(TEXT_358);
    }
    stringBuffer.append(TEXT_359);
    }
    } else {
    if (genMemberType.getGenPackage().isDataTypeConverters()) {
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_362);
    } else {
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_365);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genMemberType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_367);
    } else {
    stringBuffer.append(TEXT_368);
    }
    stringBuffer.append(TEXT_369);
    }
    }
    stringBuffer.append(TEXT_370);
    }
    }
    stringBuffer.append(TEXT_371);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_372);
    } else if (!genDataType.hasConversionDelegate() && genModel.useGenerics() && (genDataType.isArrayType() || !genDataType.getEcoreDataType().getETypeParameters().isEmpty() || genDataType.getEcoreDataType().getInstanceTypeName().contains("<"))) {
    stringBuffer.append(TEXT_373);
    } else if (!genDataType.hasConversionDelegate() && genDataType.isArrayType()) {
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genModel.getImportedName("java.lang.UnsupportedOperationException"));
    stringBuffer.append(TEXT_375);
    } else if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_376);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_378);
    } else {
    stringBuffer.append(TEXT_379);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_380);
    }
    stringBuffer.append(TEXT_381);
    }
    stringBuffer.append(TEXT_382);
    if (genModel.useGenerics() && (genDataType.getItemType() != null || genDataType.isUncheckedCast()) && (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody())) {
    stringBuffer.append(TEXT_383);
    }
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_385);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EDataType"));
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_387);
    if (genDataType instanceof GenEnum) {
    if (genPackage.isDataTypeConverters() || genDataType.hasConverterBody()) {
    stringBuffer.append(TEXT_388);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genDataType.getImportedInstanceClassName());
    stringBuffer.append(TEXT_390);
    } else {
    stringBuffer.append(TEXT_391);
    }
    } else if (genDataType.getBaseType() != null) { GenDataType genBaseType = genDataType.getBaseType(); 
    if (genBaseType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_394);
    } else {
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_397);
    }
    } else if (genDataType.getItemType() != null) { GenDataType genItemType = genDataType.getItemType(); 
    if (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_399);
    stringBuffer.append(genDataType.getImportedBoundedWildcardInstanceClassName());
    stringBuffer.append(TEXT_400);
    } else { final String singleWildcard = genModel.useGenerics() ? "<?>" : "";
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genModel.getImportedName("java.lang.StringBuffer"));
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genModel.getImportedName("java.lang.StringBuffer"));
    stringBuffer.append(TEXT_405);
    String item; if (!genModel.useGenerics()) { item = "i.next()"; 
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_407);
    } else { item = "item";
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genModel.getImportedName("java.lang.Object"));
    stringBuffer.append(TEXT_409);
    }
    stringBuffer.append(TEXT_410);
    if (genItemType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_412);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_413);
    stringBuffer.append(genItemType.getImportedWildcardObjectInstanceClassName());
    stringBuffer.append(TEXT_414);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_415);
    } else {
    stringBuffer.append(TEXT_416);
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genItemType.getImportedWildcardObjectInstanceClassName());
    stringBuffer.append(TEXT_419);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_420);
    }
    stringBuffer.append(TEXT_421);
    }
    } else if (!genDataType.getMemberTypes().isEmpty()) {
    if (genPackage.isDataTypeConverters() || genDataType.hasConverterBody()) {
    if (genDataType.isPrimitiveType()) {
    stringBuffer.append(TEXT_422);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_423);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_424);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genDataType.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_426);
    }
    stringBuffer.append(TEXT_427);
    } else {
    stringBuffer.append(TEXT_428);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_429);
    }
    } else {
    stringBuffer.append(TEXT_430);
    for (GenDataType genMemberType : genDataType.getMemberTypes()) {
    stringBuffer.append(TEXT_431);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_432);
    if (genMemberType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_433);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genMemberType.getImportedWildcardObjectInstanceClassName());
    stringBuffer.append(TEXT_436);
    } else {
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genMemberType.getImportedWildcardObjectInstanceClassName());
    stringBuffer.append(TEXT_440);
    }
    stringBuffer.append(TEXT_441);
    }
    stringBuffer.append(TEXT_442);
    }
    } else if (genPackage.isDataTypeConverters() || genDataType.hasConverterBody()) {
    if (genDataType.isPrimitiveType()) {
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_444);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_445);
    }
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_447);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genDataType.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_449);
    }
    stringBuffer.append(TEXT_450);
    } else {
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genDataType.getImportedBoundedWildcardInstanceClassName());
    stringBuffer.append(TEXT_453);
    }
    } else if (!genDataType.hasConversionDelegate() && genModel.useGenerics() && (genDataType.isArrayType() || !genDataType.getEcoreDataType().getETypeParameters().isEmpty() || genDataType.getEcoreDataType().getInstanceTypeName().contains("<"))) {
    stringBuffer.append(TEXT_454);
    } else if (!genDataType.hasConversionDelegate() && genDataType.isArrayType()) {
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genModel.getImportedName("java.lang.UnsupportedOperationException"));
    stringBuffer.append(TEXT_456);
    } else {
    stringBuffer.append(TEXT_457);
    }
    stringBuffer.append(TEXT_458);
    }
    }
    } else {
    for (GenClass genClass : genPackage.getGenClasses()) {
    if (genClass.hasFactoryInterfaceCreateMethod()) {
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genClass.getTypeParameters());
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(genClass.getInterfaceTypeArguments());
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_463);
    }
    }
    if (genPackage.isDataTypeConverters()) {
    for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
    if (genDataType.isSerializable()) {
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genDataType.getFormattedName());
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genDataType.getImportedParameterizedInstanceClassName());
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_467);
    stringBuffer.append(genDataType.getFormattedName());
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_469);
    stringBuffer.append(genDataType.getImportedBoundedWildcardInstanceClassName());
    stringBuffer.append(TEXT_470);
    }
    }
    }
    }
    if (!isImplementation && !genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_471);
    stringBuffer.append(genPackage.getPackageInterfaceName());
    stringBuffer.append(TEXT_472);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_473);
    } else if (isImplementation) {
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_476);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_477);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_478);
    }
    stringBuffer.append(TEXT_479);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_480);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_481);
    }
    stringBuffer.append(TEXT_482);
    stringBuffer.append(isInterface ? genPackage.getFactoryInterfaceName() : genPackage.getFactoryClassName());
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_483);
    return stringBuffer.toString();
  }
}
