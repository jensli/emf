package org.eclipse.emf.codegen.ecore.templates.model;

import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.emf.codegen.ecore.genmodel.impl.Literals;

public class PackageClass
{
  protected static String nl;
  public static synchronized PackageClass create(String lineSeparator)
  {
    nl = lineSeparator;
    PackageClass result = new PackageClass();
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
  protected final String TEXT_10 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * The <b>Package</b> for the model." + NL + " * It contains accessors for the meta objects to represent" + NL + " * <ul>" + NL + " *   <li>each class,</li>" + NL + " *   <li>each feature of each class,</li>";
  protected final String TEXT_11 = NL + " *   <li>each operation of each class,</li>";
  protected final String TEXT_12 = NL + " *   <li>each enum,</li>" + NL + " *   <li>and each data type</li>" + NL + " * </ul>" + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_13 = NL + " * <!-- begin-model-doc -->" + NL + " * ";
  protected final String TEXT_14 = NL + " * <!-- end-model-doc -->";
  protected final String TEXT_15 = NL + " * @see ";
  protected final String TEXT_16 = NL + " * @model ";
  protected final String TEXT_17 = NL + " *        ";
  protected final String TEXT_18 = NL + " * @model";
  protected final String TEXT_19 = NL + " * @generated" + NL + " */";
  protected final String TEXT_20 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model <b>Package</b>." + NL + " * <!-- end-user-doc -->" + NL + " * @generated" + NL + " */";
  protected final String TEXT_21 = NL + "public class ";
  protected final String TEXT_22 = " extends ";
  protected final String TEXT_23 = " implements ";
  protected final String TEXT_24 = NL + "public interface ";
  protected final String TEXT_25 = " extends ";
  protected final String TEXT_26 = NL + "{";
  protected final String TEXT_27 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_28 = " copyright = ";
  protected final String TEXT_29 = ";";
  protected final String TEXT_30 = NL;
  protected final String TEXT_31 = NL + "\t/**" + NL + "\t * The package name." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_32 = " eNAME = \"";
  protected final String TEXT_33 = "\";";
  protected final String TEXT_34 = NL + NL + "\t/**" + NL + "\t * The package namespace URI." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_35 = " eNS_URI = \"";
  protected final String TEXT_36 = "\";";
  protected final String TEXT_37 = NL + NL + "\t/**" + NL + "\t * The package namespace name." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_38 = " eNS_PREFIX = \"";
  protected final String TEXT_39 = "\";";
  protected final String TEXT_40 = NL + NL + "\t/**" + NL + "\t * The package content type ID." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_41 = " eCONTENT_TYPE = \"";
  protected final String TEXT_42 = "\";";
  protected final String TEXT_43 = NL + NL + "\t/**" + NL + "\t * The singleton instance of the package." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_44 = " eINSTANCE = ";
  protected final String TEXT_45 = ".init();" + NL;
  protected final String TEXT_46 = NL + "\t/**" + NL + "\t";
  protected final String TEXT_47 = NL + "\t  ";
  protected final String TEXT_48 = NL + "\t * The meta object id for the '{@link ";
  protected final String TEXT_49 = " <em>";
  protected final String TEXT_50 = "</em>}' class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_51 = NL + "\t  ";
  protected final String TEXT_52 = NL + "\t * The meta object id for the '{@link ";
  protected final String TEXT_53 = " <em>";
  protected final String TEXT_54 = "</em>}' class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_55 = NL + "\t  ";
  protected final String TEXT_56 = NL + "\t";
  protected final String TEXT_57 = NL + "\t * The meta object id for the '{@link ";
  protected final String TEXT_58 = " <em>";
  protected final String TEXT_59 = "</em>}' enum." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_60 = NL + "\t";
  protected final String TEXT_61 = NL + "\t * The meta object id for the '<em>";
  protected final String TEXT_62 = "</em>' data type." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t  ";
  protected final String TEXT_63 = NL + "\t * @see ";
  protected final String TEXT_64 = NL + "\t  ";
  protected final String TEXT_65 = NL + "\t";
  protected final String TEXT_66 = NL + "\t * @see ";
  protected final String TEXT_67 = "#get";
  protected final String TEXT_68 = "()" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_69 = "int ";
  protected final String TEXT_70 = " = ";
  protected final String TEXT_71 = ";" + NL + "" + NL + "\t";
  protected final String TEXT_72 = NL + "\t  ";
  protected final String TEXT_73 = NL + "\t/**" + NL + "\t * The feature id for the '<em><b>";
  protected final String TEXT_74 = "</b></em>' ";
  protected final String TEXT_75 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\t";
  protected final String TEXT_76 = "int ";
  protected final String TEXT_77 = " = ";
  protected final String TEXT_78 = ";" + NL + "" + NL + "\t  ";
  protected final String TEXT_79 = NL + "\t/**" + NL + "\t * The number of structural features of the '<em>";
  protected final String TEXT_80 = "</em>' class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\t";
  protected final String TEXT_81 = "int ";
  protected final String TEXT_82 = " = ";
  protected final String TEXT_83 = ";" + NL + "" + NL + "\t  ";
  protected final String TEXT_84 = NL + "\t";
  protected final String TEXT_85 = NL + "\t  ";
  protected final String TEXT_86 = NL + "\t/**" + NL + "\t * The operation id for the '<em>";
  protected final String TEXT_87 = "</em>' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\t";
  protected final String TEXT_88 = "int ";
  protected final String TEXT_89 = " = ";
  protected final String TEXT_90 = ";" + NL + "" + NL + "\t  ";
  protected final String TEXT_91 = NL + "\t";
  protected final String TEXT_92 = NL + "\t/**" + NL + "\t * The number of operations of the '<em>";
  protected final String TEXT_93 = "</em>' class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\t";
  protected final String TEXT_94 = "int ";
  protected final String TEXT_95 = " = ";
  protected final String TEXT_96 = ";" + NL + "" + NL + "\t  ";
  protected final String TEXT_97 = NL + "\t";
  protected final String TEXT_98 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected String packageFilename = \"";
  protected final String TEXT_99 = "\";";
  protected final String TEXT_100 = NL;
  protected final String TEXT_101 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate ";
  protected final String TEXT_102 = " ";
  protected final String TEXT_103 = " = null;" + NL;
  protected final String TEXT_104 = NL + "\t/**" + NL + "\t * Creates an instance of the model <b>Package</b>, registered with" + NL + "\t * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package" + NL + "\t * package URI value." + NL + "\t * <p>Note: the correct way to create the package is via the static" + NL + "\t * factory method {@link #init init()}, which also performs" + NL + "\t * initialization of the package, or returns the registered package," + NL + "\t * if one already exists." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see org.eclipse.emf.ecore.EPackage.Registry" + NL + "\t * @see ";
  protected final String TEXT_105 = "#eNS_URI" + NL + "\t * @see #init()" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate ";
  protected final String TEXT_106 = "()" + NL + "\t{" + NL + "\t\tsuper(eNS_URI, ";
  protected final String TEXT_107 = ");" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static boolean isInited = false;" + NL + "" + NL + "\t/**" + NL + "\t * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends." + NL + "\t * " + NL + "\t * <p>This method is used to initialize {@link ";
  protected final String TEXT_108 = "#eINSTANCE} when that field is accessed." + NL + "\t * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #eNS_URI";
  protected final String TEXT_109 = NL + "\t * @see #createPackageContents()" + NL + "\t * @see #initializePackageContents()";
  protected final String TEXT_110 = NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static ";
  protected final String TEXT_111 = " init()" + NL + "\t{" + NL + "\t\tif (isInited) return (";
  protected final String TEXT_112 = ")";
  protected final String TEXT_113 = ".Registry.INSTANCE.getEPackage(";
  protected final String TEXT_114 = ".eNS_URI);" + NL + "" + NL + "\t";
  protected final String TEXT_115 = NL + "\t\tinitializeRegistryHelpers();" + NL + "" + NL + "\t";
  protected final String TEXT_116 = NL + "\t\t// Obtain or create and register package" + NL + "\t\t";
  protected final String TEXT_117 = " the";
  protected final String TEXT_118 = " = (";
  protected final String TEXT_119 = ")(";
  protected final String TEXT_120 = ".Registry.INSTANCE.get(eNS_URI) instanceof ";
  protected final String TEXT_121 = " ? ";
  protected final String TEXT_122 = ".Registry.INSTANCE.get(eNS_URI) : new ";
  protected final String TEXT_123 = "());" + NL + "" + NL + "\t\tisInited = true;" + NL + "" + NL + "\t";
  protected final String TEXT_124 = NL + "\t\t// Initialize simple dependencies" + NL + "\t";
  protected final String TEXT_125 = NL + "\t\t";
  protected final String TEXT_126 = ".eINSTANCE.eClass();" + NL + "\t";
  protected final String TEXT_127 = NL;
  protected final String TEXT_128 = NL + "\t\t// Obtain or create and register interdependencies" + NL + "\t";
  protected final String TEXT_129 = NL + "\t\t";
  protected final String TEXT_130 = " ";
  protected final String TEXT_131 = " = (";
  protected final String TEXT_132 = ")(";
  protected final String TEXT_133 = ".Registry.INSTANCE.getEPackage(";
  protected final String TEXT_134 = ".eNS_URI) instanceof ";
  protected final String TEXT_135 = " ? ";
  protected final String TEXT_136 = ".Registry.INSTANCE.getEPackage(";
  protected final String TEXT_137 = ".eNS_URI) : ";
  protected final String TEXT_138 = ".eINSTANCE);" + NL + "\t";
  protected final String TEXT_139 = NL;
  protected final String TEXT_140 = NL + "\t\t// Load packages" + NL + "\t";
  protected final String TEXT_141 = NL + "\t\tthe";
  protected final String TEXT_142 = ".loadPackage();" + NL + "\t";
  protected final String TEXT_143 = NL + "\t";
  protected final String TEXT_144 = NL + "\t  ";
  protected final String TEXT_145 = NL + "\t\t";
  protected final String TEXT_146 = ".loadPackage();" + NL + "\t  ";
  protected final String TEXT_147 = NL + "\t";
  protected final String TEXT_148 = NL;
  protected final String TEXT_149 = NL + "\t\t// Create package meta-data objects" + NL + "\t";
  protected final String TEXT_150 = NL + "\t\tthe";
  protected final String TEXT_151 = ".createPackageContents();" + NL + "\t";
  protected final String TEXT_152 = NL + "\t";
  protected final String TEXT_153 = NL + "\t\t";
  protected final String TEXT_154 = ".createPackageContents();" + NL + "\t";
  protected final String TEXT_155 = NL + NL + "\t\t// Initialize created meta-data" + NL + "\t";
  protected final String TEXT_156 = NL + "\t\tthe";
  protected final String TEXT_157 = ".initializePackageContents();" + NL + "\t";
  protected final String TEXT_158 = NL + "\t";
  protected final String TEXT_159 = NL + "\t\t";
  protected final String TEXT_160 = ".initializePackageContents();" + NL + "\t";
  protected final String TEXT_161 = NL;
  protected final String TEXT_162 = NL + "\t\t// Fix loaded packages" + NL + "\t";
  protected final String TEXT_163 = NL + "\t\tthe";
  protected final String TEXT_164 = ".fixPackageContents();" + NL + "\t";
  protected final String TEXT_165 = NL + "\t";
  protected final String TEXT_166 = NL + "\t\t";
  protected final String TEXT_167 = ".fixPackageContents();" + NL + "\t";
  protected final String TEXT_168 = NL;
  protected final String TEXT_169 = NL + "\t\t// Register package validator" + NL + "\t\t";
  protected final String TEXT_170 = ".Registry.INSTANCE.put" + NL + "\t\t\t(the";
  protected final String TEXT_171 = ", " + NL + "\t\t\t new ";
  protected final String TEXT_172 = ".Descriptor()" + NL + "\t\t\t {" + NL + "\t\t\t\t public ";
  protected final String TEXT_173 = " getEValidator()" + NL + "\t\t\t\t {" + NL + "\t\t\t\t\t return ";
  protected final String TEXT_174 = ".INSTANCE;" + NL + "\t\t\t\t }" + NL + "\t\t\t });" + NL;
  protected final String TEXT_175 = NL + "\t\t// Mark meta-data to indicate it can't be changed" + NL + "\t\tthe";
  protected final String TEXT_176 = ".freeze();" + NL;
  protected final String TEXT_177 = NL + "  " + NL + "\t\t// Update the registry and return the package" + NL + "\t\t";
  protected final String TEXT_178 = ".Registry.INSTANCE.put(";
  protected final String TEXT_179 = ".eNS_URI, the";
  protected final String TEXT_180 = ");" + NL + "\t\treturn the";
  protected final String TEXT_181 = ";" + NL + "\t}";
  protected final String TEXT_182 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static void initializeRegistryHelpers()" + NL + "\t{" + NL + "\t";
  protected final String TEXT_183 = NL + "\t  ";
  protected final String TEXT_184 = NL + "\t";
  protected final String TEXT_185 = NL + "\t\t";
  protected final String TEXT_186 = ".register" + NL + "\t\t\t(";
  protected final String TEXT_187 = ".class, " + NL + "\t\t\t new ";
  protected final String TEXT_188 = ".Helper() " + NL + "\t\t\t {" + NL + "\t\t\t\t public boolean isInstance(Object instance)" + NL + "\t\t\t\t {" + NL + "\t\t\t\t\t return instance instanceof ";
  protected final String TEXT_189 = ";" + NL + "\t\t\t\t }" + NL + "" + NL + "\t\t\t\t public Object newArrayInstance(int size)" + NL + "\t\t\t\t {" + NL + "\t\t\t\t\t return new ";
  protected final String TEXT_190 = "[size];" + NL + "\t\t\t\t }" + NL + "\t\t\t });" + NL + "\t";
  protected final String TEXT_191 = NL + "\t  ";
  protected final String TEXT_192 = NL + "\t";
  protected final String TEXT_193 = NL + "\t\t";
  protected final String TEXT_194 = ".register" + NL + "\t\t\t(";
  protected final String TEXT_195 = ".class, " + NL + "\t\t\t new ";
  protected final String TEXT_196 = ".Helper() " + NL + "\t\t\t {" + NL + "\t\t\t\t public boolean isInstance(Object instance)" + NL + "\t\t\t\t {" + NL + "\t\t\t\t\t return instance instanceof ";
  protected final String TEXT_197 = ";" + NL + "\t\t\t\t }" + NL + "" + NL + "\t\t\t\t public Object newArrayInstance(int size)" + NL + "\t\t\t\t {" + NL + "\t";
  protected final String TEXT_198 = NL + "\t\t\t\t\t return new ";
  protected final String TEXT_199 = "[size]";
  protected final String TEXT_200 = ";" + NL + "\t";
  protected final String TEXT_201 = NL + "\t\t\t\t\t return new ";
  protected final String TEXT_202 = "[size];" + NL + "\t";
  protected final String TEXT_203 = NL + "\t\t\t\t }" + NL + "\t\t});" + NL + "\t";
  protected final String TEXT_204 = NL + "\t  ";
  protected final String TEXT_205 = NL + "\t";
  protected final String TEXT_206 = NL + "\t}" + NL + "" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static class WhiteList implements ";
  protected final String TEXT_207 = ", EBasicWhiteList" + NL + "\t{" + NL + "\t";
  protected final String TEXT_208 = NL + "\t  ";
  protected final String TEXT_209 = NL + "\t";
  protected final String TEXT_210 = NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprotected ";
  protected final String TEXT_211 = " ";
  protected final String TEXT_212 = ";" + NL + "" + NL + "\t";
  protected final String TEXT_213 = NL + "\t  ";
  protected final String TEXT_214 = NL + "\t";
  protected final String TEXT_215 = NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprotected ";
  protected final String TEXT_216 = " ";
  protected final String TEXT_217 = ";" + NL + "" + NL + "\t";
  protected final String TEXT_218 = NL + "\t  ";
  protected final String TEXT_219 = NL + "\t";
  protected final String TEXT_220 = NL + "\t}";
  protected final String TEXT_221 = NL;
  protected final String TEXT_222 = NL;
  protected final String TEXT_223 = NL + "\t/**" + NL + "\t";
  protected final String TEXT_224 = NL + "\t * Returns the meta object for class '{@link ";
  protected final String TEXT_225 = " <em>";
  protected final String TEXT_226 = "</em>}'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return the meta object for class '<em>";
  protected final String TEXT_227 = "</em>'." + NL + "\t * @see ";
  protected final String TEXT_228 = NL + "\t  ";
  protected final String TEXT_229 = NL + "\t * @model ";
  protected final String TEXT_230 = NL + "\t";
  protected final String TEXT_231 = NL + "\t *        ";
  protected final String TEXT_232 = NL + "\t";
  protected final String TEXT_233 = NL + "\t * @model" + NL + "\t  ";
  protected final String TEXT_234 = NL + "\t";
  protected final String TEXT_235 = NL + "\t * Returns the meta object for enum '{@link ";
  protected final String TEXT_236 = " <em>";
  protected final String TEXT_237 = "</em>}'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return the meta object for enum '<em>";
  protected final String TEXT_238 = "</em>'." + NL + "\t * @see ";
  protected final String TEXT_239 = NL + "\t";
  protected final String TEXT_240 = NL + "\t  ";
  protected final String TEXT_241 = NL + "\t * Returns the meta object for data type '<em>";
  protected final String TEXT_242 = "</em>'." + NL + "\t  ";
  protected final String TEXT_243 = NL + "\t * Returns the meta object for data type '{@link ";
  protected final String TEXT_244 = " <em>";
  protected final String TEXT_245 = "</em>}'." + NL + "\t  ";
  protected final String TEXT_246 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return the meta object for data type '<em>";
  protected final String TEXT_247 = "</em>'." + NL + "\t  ";
  protected final String TEXT_248 = NL + "\t * @see ";
  protected final String TEXT_249 = NL + "\t  ";
  protected final String TEXT_250 = NL + "\t  ";
  protected final String TEXT_251 = NL + "\t * @model ";
  protected final String TEXT_252 = NL + "\t  ";
  protected final String TEXT_253 = NL + "\t *        ";
  protected final String TEXT_254 = NL + "\t  ";
  protected final String TEXT_255 = NL + "\t * @model" + NL + "\t  ";
  protected final String TEXT_256 = NL + "\t";
  protected final String TEXT_257 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_258 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_259 = NL + "\tpublic ";
  protected final String TEXT_260 = " get";
  protected final String TEXT_261 = "()" + NL + "\t{" + NL + "\t";
  protected final String TEXT_262 = NL + "\t\tif (";
  protected final String TEXT_263 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_264 = " = (";
  protected final String TEXT_265 = ")";
  protected final String TEXT_266 = ".Registry.INSTANCE.getEPackage(";
  protected final String TEXT_267 = ".eNS_URI).getEClassifiers().get(";
  protected final String TEXT_268 = ");" + NL + "\t\t}" + NL + "\t";
  protected final String TEXT_269 = NL + "\t\treturn ";
  protected final String TEXT_270 = ";" + NL + "\t}" + NL;
  protected final String TEXT_271 = NL + "\t// CHANGE j: Class accessor" + NL + "\t";
  protected final String TEXT_272 = " get";
  protected final String TEXT_273 = "();";
  protected final String TEXT_274 = NL + "\t";
  protected final String TEXT_275 = NL + "\t  ";
  protected final String TEXT_276 = NL + "\t/**" + NL + "\t * Returns the meta object for the ";
  protected final String TEXT_277 = " '{@link ";
  protected final String TEXT_278 = "#";
  protected final String TEXT_279 = " <em>";
  protected final String TEXT_280 = "</em>}'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return the meta object for the ";
  protected final String TEXT_281 = " '<em>";
  protected final String TEXT_282 = "</em>'." + NL + "\t * @see ";
  protected final String TEXT_283 = "#";
  protected final String TEXT_284 = "()";
  protected final String TEXT_285 = NL + "\t * @see #get";
  protected final String TEXT_286 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_287 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_288 = NL + "\tpublic ";
  protected final String TEXT_289 = " get";
  protected final String TEXT_290 = "()" + NL + "\t{" + NL + "\t";
  protected final String TEXT_291 = NL + "\t\treturn (";
  protected final String TEXT_292 = ")";
  protected final String TEXT_293 = ".getEStructuralFeatures().get(";
  protected final String TEXT_294 = ");" + NL + "\t";
  protected final String TEXT_295 = NL + "\treturn (";
  protected final String TEXT_296 = ")get";
  protected final String TEXT_297 = "().getEStructuralFeatures().get(";
  protected final String TEXT_298 = ");" + NL + "\t";
  protected final String TEXT_299 = NL + "\t}";
  protected final String TEXT_300 = NL + "\t// CHANGE j: Feature accessor" + NL + "\t";
  protected final String TEXT_301 = " get";
  protected final String TEXT_302 = "();";
  protected final String TEXT_303 = NL + NL + "\t  ";
  protected final String TEXT_304 = NL + "\t  ";
  protected final String TEXT_305 = NL + "\t";
  protected final String TEXT_306 = NL + "\t/**" + NL + "\t * Returns the meta object for the '{@link ";
  protected final String TEXT_307 = "#";
  protected final String TEXT_308 = "(";
  protected final String TEXT_309 = ") <em>";
  protected final String TEXT_310 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return the meta object for the '<em>";
  protected final String TEXT_311 = "</em>' operation." + NL + "\t * @see ";
  protected final String TEXT_312 = "#";
  protected final String TEXT_313 = "(";
  protected final String TEXT_314 = ")" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_315 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_316 = NL + "\tpublic ";
  protected final String TEXT_317 = " get";
  protected final String TEXT_318 = "()" + NL + "\t{" + NL + "\t";
  protected final String TEXT_319 = NL + "\t\treturn ";
  protected final String TEXT_320 = ".getEOperations().get(";
  protected final String TEXT_321 = ");" + NL + "\t";
  protected final String TEXT_322 = NL + "\treturn get";
  protected final String TEXT_323 = "().getEOperations().get(";
  protected final String TEXT_324 = ");" + NL + "\t";
  protected final String TEXT_325 = NL + "\t}";
  protected final String TEXT_326 = NL + "\t";
  protected final String TEXT_327 = " get";
  protected final String TEXT_328 = "();";
  protected final String TEXT_329 = NL + NL + "\t";
  protected final String TEXT_330 = NL + "\t  ";
  protected final String TEXT_331 = NL + "\t";
  protected final String TEXT_332 = NL + "\t/**" + NL + "\t * Returns the factory that creates the instances of the model." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return the factory that creates the instances of the model." + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_333 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_334 = NL + "\tpublic ";
  protected final String TEXT_335 = " get";
  protected final String TEXT_336 = "()" + NL + "\t{" + NL + "\t\treturn (";
  protected final String TEXT_337 = ")getEFactoryInstance();" + NL + "\t}";
  protected final String TEXT_338 = NL + "\t";
  protected final String TEXT_339 = " get";
  protected final String TEXT_340 = "();";
  protected final String TEXT_341 = NL;
  protected final String TEXT_342 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate boolean isCreated = false;" + NL + "" + NL + "\t/**" + NL + "\t * Creates the meta-model objects for the package.  This method is" + NL + "\t * guarded to have no affect on any invocation but its first." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void createPackageContents()" + NL + "\t{" + NL + "\t\tif (isCreated) return;" + NL + "\t\tisCreated = true;" + NL + "\t";
  protected final String TEXT_343 = NL + NL + "\t\t// Create classes and their features" + NL + "\t  ";
  protected final String TEXT_344 = NL + "\t\t";
  protected final String TEXT_345 = " = create";
  protected final String TEXT_346 = "(";
  protected final String TEXT_347 = ");" + NL + "\t";
  protected final String TEXT_348 = NL + "\t\tcreate";
  protected final String TEXT_349 = "(";
  protected final String TEXT_350 = ", ";
  protected final String TEXT_351 = ");" + NL + "\t";
  protected final String TEXT_352 = NL + "\t";
  protected final String TEXT_353 = NL + "\t  ";
  protected final String TEXT_354 = NL + "\t\tcreateEOperation(";
  protected final String TEXT_355 = ", ";
  protected final String TEXT_356 = ");" + NL + "\t  ";
  protected final String TEXT_357 = NL + "\t";
  protected final String TEXT_358 = NL + "\t";
  protected final String TEXT_359 = NL + NL + "\t";
  protected final String TEXT_360 = NL + "\t  ";
  protected final String TEXT_361 = NL + "\t";
  protected final String TEXT_362 = NL + "\t";
  protected final String TEXT_363 = NL + NL + "\t\t// Create enums" + NL + "\t  ";
  protected final String TEXT_364 = NL + "\t\t";
  protected final String TEXT_365 = " = createEEnum(";
  protected final String TEXT_366 = ");" + NL + "\t  ";
  protected final String TEXT_367 = NL + "\t";
  protected final String TEXT_368 = NL + "\t";
  protected final String TEXT_369 = NL + NL + "\t\t// Create data types" + NL + "\t  ";
  protected final String TEXT_370 = NL + "\t\t";
  protected final String TEXT_371 = " = createEDataType(";
  protected final String TEXT_372 = ");" + NL + "\t  ";
  protected final String TEXT_373 = NL + "\t";
  protected final String TEXT_374 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate boolean isInitialized = false;" + NL;
  protected final String TEXT_375 = NL + "\t/**" + NL + "\t * Complete the initialization of the package and its meta-model.  This" + NL + "\t * method is guarded to have no affect on any invocation but its first." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void initializePackageContents()" + NL + "\t{" + NL + "\t\tif (isInitialized) return;" + NL + "\t\tisInitialized = true;" + NL + "" + NL + "\t\t// Initialize package" + NL + "\t\tsetName(eNAME);" + NL + "\t\tsetNsPrefix(eNS_PREFIX);" + NL + "\t\tsetNsURI(eNS_URI);" + NL + "\t";
  protected final String TEXT_376 = NL + NL + "\t\t// Obtain other dependent packages" + NL + "\t  ";
  protected final String TEXT_377 = NL + "\t\t";
  protected final String TEXT_378 = " ";
  protected final String TEXT_379 = " = (";
  protected final String TEXT_380 = ")";
  protected final String TEXT_381 = ".Registry.INSTANCE.getEPackage(";
  protected final String TEXT_382 = ".eNS_URI);" + NL + "\t  ";
  protected final String TEXT_383 = NL + "\t";
  protected final String TEXT_384 = NL + "\t";
  protected final String TEXT_385 = NL + NL + "\t\t// Add subpackages" + NL + "\t  ";
  protected final String TEXT_386 = NL + "\t\tgetESubpackages().add(";
  protected final String TEXT_387 = ");" + NL + "\t  ";
  protected final String TEXT_388 = NL + "\t";
  protected final String TEXT_389 = NL + "\t";
  protected final String TEXT_390 = NL + "\t  ";
  protected final String TEXT_391 = NL + NL + "\t\t// Create type parameters" + NL + "\t";
  protected final String TEXT_392 = NL + "\t  ";
  protected final String TEXT_393 = NL + "\t";
  protected final String TEXT_394 = NL + "\t\t";
  protected final String TEXT_395 = " ";
  protected final String TEXT_396 = "_";
  protected final String TEXT_397 = " = addETypeParameter(";
  protected final String TEXT_398 = ", \"";
  protected final String TEXT_399 = "\");";
  protected final String TEXT_400 = NL + "\t";
  protected final String TEXT_401 = NL + "\t\taddETypeParameter(";
  protected final String TEXT_402 = ", \"";
  protected final String TEXT_403 = "\");";
  protected final String TEXT_404 = NL + "\t";
  protected final String TEXT_405 = NL + "\t  ";
  protected final String TEXT_406 = NL + "\t";
  protected final String TEXT_407 = NL + "\t  ";
  protected final String TEXT_408 = NL + "\t  ";
  protected final String TEXT_409 = NL + NL + "\t\t// Set bounds for type parameters" + NL + "\t";
  protected final String TEXT_410 = NL + "\t  ";
  protected final String TEXT_411 = NL + "\t";
  protected final String TEXT_412 = NL + "\t  ";
  protected final String TEXT_413 = NL + "\t\t";
  protected final String TEXT_414 = "g";
  protected final String TEXT_415 = " = createEGenericType(";
  protected final String TEXT_416 = ");" + NL + "\t";
  protected final String TEXT_417 = NL + "\t\tg";
  protected final String TEXT_418 = ".";
  protected final String TEXT_419 = "(g";
  protected final String TEXT_420 = ");" + NL + "\t";
  protected final String TEXT_421 = NL + "\t  ";
  protected final String TEXT_422 = NL + "\t\t";
  protected final String TEXT_423 = "_";
  protected final String TEXT_424 = ".getEBounds().add(g1);" + NL + "\t";
  protected final String TEXT_425 = NL + "\t  ";
  protected final String TEXT_426 = NL + "\t";
  protected final String TEXT_427 = NL + "\t  ";
  protected final String TEXT_428 = NL + NL + "\t\t// Add supertypes to classes" + NL + "\t  ";
  protected final String TEXT_429 = NL + "\t";
  protected final String TEXT_430 = NL + "\t  ";
  protected final String TEXT_431 = NL + "\t\t";
  protected final String TEXT_432 = ".getESuperTypes().add(";
  protected final String TEXT_433 = ".get";
  protected final String TEXT_434 = "());" + NL + "\t  ";
  protected final String TEXT_435 = NL + "\t";
  protected final String TEXT_436 = NL + "\t  ";
  protected final String TEXT_437 = NL + "\t";
  protected final String TEXT_438 = NL + "\t\t";
  protected final String TEXT_439 = "g";
  protected final String TEXT_440 = " = createEGenericType(";
  protected final String TEXT_441 = ");" + NL + "\t  ";
  protected final String TEXT_442 = NL + "\t\tg";
  protected final String TEXT_443 = ".";
  protected final String TEXT_444 = "(g";
  protected final String TEXT_445 = ");" + NL + "\t  ";
  protected final String TEXT_446 = NL + "\t";
  protected final String TEXT_447 = NL + "\t\t";
  protected final String TEXT_448 = ".getEGenericSuperTypes().add(g1);" + NL + "\t  ";
  protected final String TEXT_449 = NL + "\t";
  protected final String TEXT_450 = NL + "\t  ";
  protected final String TEXT_451 = NL + NL + "\t\t// Initialize classes";
  protected final String TEXT_452 = ", features, and operations; add parameters";
  protected final String TEXT_453 = " and features; add operations and parameters";
  protected final String TEXT_454 = NL + "\t  ";
  protected final String TEXT_455 = NL + "\t\tinitEClass(";
  protected final String TEXT_456 = ", ";
  protected final String TEXT_457 = "null";
  protected final String TEXT_458 = ".class";
  protected final String TEXT_459 = ", \"";
  protected final String TEXT_460 = "\", ";
  protected final String TEXT_461 = ", ";
  protected final String TEXT_462 = ", ";
  protected final String TEXT_463 = ", \"";
  protected final String TEXT_464 = "\"";
  protected final String TEXT_465 = ");";
  protected final String TEXT_466 = NL + "\t";
  protected final String TEXT_467 = NL + "\t  ";
  protected final String TEXT_468 = NL + "\t";
  protected final String TEXT_469 = NL + "\t\t";
  protected final String TEXT_470 = "g";
  protected final String TEXT_471 = " = createEGenericType(";
  protected final String TEXT_472 = ");" + NL + "\t  ";
  protected final String TEXT_473 = NL + "\t\tg";
  protected final String TEXT_474 = ".";
  protected final String TEXT_475 = "(g";
  protected final String TEXT_476 = ");" + NL + "\t  ";
  protected final String TEXT_477 = NL + "\t";
  protected final String TEXT_478 = NL + "\t  ";
  protected final String TEXT_479 = NL + "\t  ";
  protected final String TEXT_480 = NL + "\t  ";
  protected final String TEXT_481 = NL + "\t\tinitEReference(get";
  protected final String TEXT_482 = "(), ";
  protected final String TEXT_483 = "g1";
  protected final String TEXT_484 = ".get";
  protected final String TEXT_485 = "()";
  protected final String TEXT_486 = ", ";
  protected final String TEXT_487 = ", \"";
  protected final String TEXT_488 = "\", ";
  protected final String TEXT_489 = ", ";
  protected final String TEXT_490 = ", ";
  protected final String TEXT_491 = ", ";
  protected final String TEXT_492 = ", ";
  protected final String TEXT_493 = ", ";
  protected final String TEXT_494 = ", ";
  protected final String TEXT_495 = ", ";
  protected final String TEXT_496 = ", ";
  protected final String TEXT_497 = ", ";
  protected final String TEXT_498 = ", ";
  protected final String TEXT_499 = ", ";
  protected final String TEXT_500 = ", ";
  protected final String TEXT_501 = ");";
  protected final String TEXT_502 = NL + "\t";
  protected final String TEXT_503 = NL + "\t\tget";
  protected final String TEXT_504 = "().getEKeys().add(";
  protected final String TEXT_505 = ".get";
  protected final String TEXT_506 = "());" + NL + "\t";
  protected final String TEXT_507 = NL + "\t  ";
  protected final String TEXT_508 = NL + "\t\tinitEAttribute(get";
  protected final String TEXT_509 = "(), ";
  protected final String TEXT_510 = "g1";
  protected final String TEXT_511 = ".get";
  protected final String TEXT_512 = "()";
  protected final String TEXT_513 = ", \"";
  protected final String TEXT_514 = "\", ";
  protected final String TEXT_515 = ", ";
  protected final String TEXT_516 = ", ";
  protected final String TEXT_517 = ", ";
  protected final String TEXT_518 = ", ";
  protected final String TEXT_519 = ", ";
  protected final String TEXT_520 = ", ";
  protected final String TEXT_521 = ", ";
  protected final String TEXT_522 = ", ";
  protected final String TEXT_523 = ", ";
  protected final String TEXT_524 = ", ";
  protected final String TEXT_525 = ", ";
  protected final String TEXT_526 = ");";
  protected final String TEXT_527 = NL + "\t  ";
  protected final String TEXT_528 = NL + "\t";
  protected final String TEXT_529 = NL + "\t";
  protected final String TEXT_530 = NL + NL + "\t  ";
  protected final String TEXT_531 = NL + "\t\t";
  protected final String TEXT_532 = "initEOperation(get";
  protected final String TEXT_533 = "()";
  protected final String TEXT_534 = "addEOperation(";
  protected final String TEXT_535 = ", ";
  protected final String TEXT_536 = "null";
  protected final String TEXT_537 = ".get";
  protected final String TEXT_538 = "()";
  protected final String TEXT_539 = ", \"";
  protected final String TEXT_540 = "\", ";
  protected final String TEXT_541 = ", ";
  protected final String TEXT_542 = ", ";
  protected final String TEXT_543 = ", ";
  protected final String TEXT_544 = ");";
  protected final String TEXT_545 = NL + "\t  ";
  protected final String TEXT_546 = NL + "\t";
  protected final String TEXT_547 = NL + "\t\t";
  protected final String TEXT_548 = "initEOperation(get";
  protected final String TEXT_549 = "()";
  protected final String TEXT_550 = "addEOperation(";
  protected final String TEXT_551 = ", ";
  protected final String TEXT_552 = ".get";
  protected final String TEXT_553 = "(), \"";
  protected final String TEXT_554 = "\", ";
  protected final String TEXT_555 = ", ";
  protected final String TEXT_556 = ", ";
  protected final String TEXT_557 = ", ";
  protected final String TEXT_558 = ");";
  protected final String TEXT_559 = NL + "\t";
  protected final String TEXT_560 = NL + "\t\t";
  protected final String TEXT_561 = "initEOperation(get";
  protected final String TEXT_562 = "()";
  protected final String TEXT_563 = "addEOperation(";
  protected final String TEXT_564 = ", ";
  protected final String TEXT_565 = ".get";
  protected final String TEXT_566 = "(), \"";
  protected final String TEXT_567 = "\", ";
  protected final String TEXT_568 = ", ";
  protected final String TEXT_569 = ");";
  protected final String TEXT_570 = NL + "\t";
  protected final String TEXT_571 = NL + "\t  ";
  protected final String TEXT_572 = NL + "\t\t";
  protected final String TEXT_573 = "initEOperation(get";
  protected final String TEXT_574 = "()";
  protected final String TEXT_575 = "addEOperation(";
  protected final String TEXT_576 = ", null, \"";
  protected final String TEXT_577 = "\");";
  protected final String TEXT_578 = NL + "\t  ";
  protected final String TEXT_579 = NL + "\t  ";
  protected final String TEXT_580 = NL + "\t";
  protected final String TEXT_581 = NL + "\t\t";
  protected final String TEXT_582 = "addETypeParameter(op, \"";
  protected final String TEXT_583 = "\");";
  protected final String TEXT_584 = NL + "\t  ";
  protected final String TEXT_585 = NL + "\t";
  protected final String TEXT_586 = NL + "\t\t";
  protected final String TEXT_587 = "g";
  protected final String TEXT_588 = " = createEGenericType(";
  protected final String TEXT_589 = ");" + NL + "\t  ";
  protected final String TEXT_590 = NL + "\t\tg";
  protected final String TEXT_591 = ".";
  protected final String TEXT_592 = "(g";
  protected final String TEXT_593 = ");" + NL + "\t  ";
  protected final String TEXT_594 = NL + "\t";
  protected final String TEXT_595 = NL + "\t\tt";
  protected final String TEXT_596 = ".getEBounds().add(g1);" + NL + "\t  ";
  protected final String TEXT_597 = NL + "\t";
  protected final String TEXT_598 = NL + "\t  ";
  protected final String TEXT_599 = NL + "\t  ";
  protected final String TEXT_600 = NL + "\t";
  protected final String TEXT_601 = NL + "\t  ";
  protected final String TEXT_602 = NL + "\t\t";
  protected final String TEXT_603 = "g";
  protected final String TEXT_604 = " = createEGenericType(";
  protected final String TEXT_605 = ");" + NL + "\t";
  protected final String TEXT_606 = NL + "\t\tg";
  protected final String TEXT_607 = ".";
  protected final String TEXT_608 = "(g";
  protected final String TEXT_609 = ");" + NL + "\t";
  protected final String TEXT_610 = NL + "\t  ";
  protected final String TEXT_611 = NL + "\t";
  protected final String TEXT_612 = NL + "\t";
  protected final String TEXT_613 = NL + "\t\taddEParameter(op, ";
  protected final String TEXT_614 = "g1";
  protected final String TEXT_615 = ".get";
  protected final String TEXT_616 = "()";
  protected final String TEXT_617 = ", \"";
  protected final String TEXT_618 = "\", ";
  protected final String TEXT_619 = ", ";
  protected final String TEXT_620 = ", ";
  protected final String TEXT_621 = ", ";
  protected final String TEXT_622 = ");";
  protected final String TEXT_623 = NL + "\t";
  protected final String TEXT_624 = NL + "\t\taddEParameter(op, ";
  protected final String TEXT_625 = "g1";
  protected final String TEXT_626 = ".get";
  protected final String TEXT_627 = "()";
  protected final String TEXT_628 = ", \"";
  protected final String TEXT_629 = "\", ";
  protected final String TEXT_630 = ", ";
  protected final String TEXT_631 = ", ";
  protected final String TEXT_632 = ", ";
  protected final String TEXT_633 = ");";
  protected final String TEXT_634 = NL + "\t";
  protected final String TEXT_635 = NL + "\t\taddEParameter(op, ";
  protected final String TEXT_636 = "g1";
  protected final String TEXT_637 = ".get";
  protected final String TEXT_638 = "()";
  protected final String TEXT_639 = ", \"";
  protected final String TEXT_640 = "\", ";
  protected final String TEXT_641 = ", ";
  protected final String TEXT_642 = ");";
  protected final String TEXT_643 = NL + "\t";
  protected final String TEXT_644 = NL + "\t  ";
  protected final String TEXT_645 = NL + "\t  ";
  protected final String TEXT_646 = NL + "\t  ";
  protected final String TEXT_647 = NL + "\t";
  protected final String TEXT_648 = NL + "\t\t";
  protected final String TEXT_649 = "g";
  protected final String TEXT_650 = " = createEGenericType(";
  protected final String TEXT_651 = ");" + NL + "\t  ";
  protected final String TEXT_652 = NL + "\t\tg";
  protected final String TEXT_653 = ".";
  protected final String TEXT_654 = "(g";
  protected final String TEXT_655 = ");" + NL + "\t  ";
  protected final String TEXT_656 = NL + "\t\taddEException(op, g";
  protected final String TEXT_657 = ");" + NL + "\t";
  protected final String TEXT_658 = NL + "\t  ";
  protected final String TEXT_659 = NL + "\t  ";
  protected final String TEXT_660 = NL + "\t";
  protected final String TEXT_661 = NL + "\t\taddEException(op, ";
  protected final String TEXT_662 = ".get";
  protected final String TEXT_663 = "());" + NL + "\t";
  protected final String TEXT_664 = NL + "\t  ";
  protected final String TEXT_665 = NL + "\t  ";
  protected final String TEXT_666 = NL + "\t";
  protected final String TEXT_667 = NL + "\t\t";
  protected final String TEXT_668 = "g";
  protected final String TEXT_669 = " = createEGenericType(";
  protected final String TEXT_670 = ");" + NL + "\t  ";
  protected final String TEXT_671 = NL + "\t\tg";
  protected final String TEXT_672 = ".";
  protected final String TEXT_673 = "(g";
  protected final String TEXT_674 = ");" + NL + "\t  ";
  protected final String TEXT_675 = NL + "\t";
  protected final String TEXT_676 = NL + "\t\tinitEOperation(op, g1);" + NL + "\t  ";
  protected final String TEXT_677 = NL + "\t";
  protected final String TEXT_678 = NL + "\t";
  protected final String TEXT_679 = NL + NL + "\t";
  protected final String TEXT_680 = NL + "\t  ";
  protected final String TEXT_681 = NL + "\t";
  protected final String TEXT_682 = NL + "\t";
  protected final String TEXT_683 = NL + NL + "\t\t// Initialize enums and add enum literals" + NL + "\t  ";
  protected final String TEXT_684 = NL + "\t\tinitEEnum(";
  protected final String TEXT_685 = ", ";
  protected final String TEXT_686 = ".class, \"";
  protected final String TEXT_687 = "\");";
  protected final String TEXT_688 = NL + "\t";
  protected final String TEXT_689 = NL + "\t\taddEEnumLiteral(";
  protected final String TEXT_690 = ", ";
  protected final String TEXT_691 = ".";
  protected final String TEXT_692 = ");" + NL + "\t";
  protected final String TEXT_693 = NL + "\t";
  protected final String TEXT_694 = NL + NL + "\t";
  protected final String TEXT_695 = NL + "\t  ";
  protected final String TEXT_696 = NL + "\t";
  protected final String TEXT_697 = NL + "\t";
  protected final String TEXT_698 = NL + NL + "\t\t// Initialize data types" + NL + "\t  ";
  protected final String TEXT_699 = NL + "\t\tinitEDataType(";
  protected final String TEXT_700 = ", ";
  protected final String TEXT_701 = ".class, \"";
  protected final String TEXT_702 = "\", ";
  protected final String TEXT_703 = ", ";
  protected final String TEXT_704 = ", \"";
  protected final String TEXT_705 = "\"";
  protected final String TEXT_706 = ");";
  protected final String TEXT_707 = NL + "\t  ";
  protected final String TEXT_708 = NL + "\t";
  protected final String TEXT_709 = NL + "\t";
  protected final String TEXT_710 = NL + NL + "\t\t// Create resource" + NL + "\t\tcreateResource(";
  protected final String TEXT_711 = ");" + NL + "\t";
  protected final String TEXT_712 = NL + "\t";
  protected final String TEXT_713 = NL + NL + "\t\t// Create annotations" + NL + "\t  ";
  protected final String TEXT_714 = NL + "\t\t// ";
  protected final String TEXT_715 = NL + "\t\tcreate";
  protected final String TEXT_716 = "Annotations();" + NL + "\t  ";
  protected final String TEXT_717 = NL + "\t";
  protected final String TEXT_718 = NL + "\t}" + NL + "" + NL + "\t";
  protected final String TEXT_719 = NL + "\t/**" + NL + "\t * Initializes the annotations for <b>";
  protected final String TEXT_720 = "</b>." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void create";
  protected final String TEXT_721 = "Annotations()" + NL + "\t{" + NL + "\t\tString source = ";
  protected final String TEXT_722 = "null;";
  protected final String TEXT_723 = "\"";
  protected final String TEXT_724 = "\";";
  protected final String TEXT_725 = NL + "\t  ";
  protected final String TEXT_726 = NL + "\t";
  protected final String TEXT_727 = "\t" + NL + "\t\taddAnnotation" + NL + "\t\t  (";
  protected final String TEXT_728 = ", " + NL + "\t\t   source, " + NL + "\t\t   new String[] " + NL + "\t\t   {" + NL + "\t  ";
  protected final String TEXT_729 = NL + "\t\t\t ";
  protected final String TEXT_730 = ", ";
  protected final String TEXT_731 = NL + "\t  ";
  protected final String TEXT_732 = NL + "\t\t   }";
  protected final String TEXT_733 = ");";
  protected final String TEXT_734 = ",";
  protected final String TEXT_735 = NL + "\t  ";
  protected final String TEXT_736 = NL + "\t\t   new ";
  protected final String TEXT_737 = "[] " + NL + "\t\t   {" + NL + "\t";
  protected final String TEXT_738 = NL + "\t\t\t ";
  protected final String TEXT_739 = ".createURI(";
  protected final String TEXT_740 = ".";
  protected final String TEXT_741 = "eNS_URI).appendFragment(\"";
  protected final String TEXT_742 = "\")";
  protected final String TEXT_743 = ",";
  protected final String TEXT_744 = NL + "\t";
  protected final String TEXT_745 = NL + "\t\t   });" + NL + "\t  ";
  protected final String TEXT_746 = NL + "\t  ";
  protected final String TEXT_747 = NL + "\t\taddAnnotation" + NL + "\t\t  (";
  protected final String TEXT_748 = ", " + NL + "\t\t   ";
  protected final String TEXT_749 = "new boolean[] { ";
  protected final String TEXT_750 = " }";
  protected final String TEXT_751 = "," + NL + "\t\t   ";
  protected final String TEXT_752 = "null,";
  protected final String TEXT_753 = "\"";
  protected final String TEXT_754 = "\",";
  protected final String TEXT_755 = NL + "\t\t   new String[] " + NL + "\t\t   {" + NL + "\t";
  protected final String TEXT_756 = NL + "\t\t\t ";
  protected final String TEXT_757 = ", ";
  protected final String TEXT_758 = NL + "\t";
  protected final String TEXT_759 = NL + "\t\t   }";
  protected final String TEXT_760 = ");";
  protected final String TEXT_761 = ",";
  protected final String TEXT_762 = NL + "\t";
  protected final String TEXT_763 = NL + "\t\t   new ";
  protected final String TEXT_764 = "[] " + NL + "\t\t   {" + NL + "\t";
  protected final String TEXT_765 = NL + "\t\t\t ";
  protected final String TEXT_766 = ".createURI(";
  protected final String TEXT_767 = ".";
  protected final String TEXT_768 = "eNS_URI).appendFragment(\"";
  protected final String TEXT_769 = "\")";
  protected final String TEXT_770 = ",";
  protected final String TEXT_771 = NL + "\t";
  protected final String TEXT_772 = NL + "\t\t   });" + NL + "\t";
  protected final String TEXT_773 = NL + "\t  ";
  protected final String TEXT_774 = NL + "\t";
  protected final String TEXT_775 = NL + "\t  ";
  protected final String TEXT_776 = NL + "\t}" + NL + "" + NL + "\t";
  protected final String TEXT_777 = NL + "\t";
  protected final String TEXT_778 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate boolean isLoaded = false;" + NL + "" + NL + "\t/**" + NL + "\t * Laods the package and any sub-packages from their serialized form." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void loadPackage()" + NL + "\t{" + NL + "\t\tif (isLoaded) return;" + NL + "\t\tisLoaded = true;" + NL + "" + NL + "\t\t";
  protected final String TEXT_779 = " url = getClass().getResource(packageFilename);" + NL + "\t\tif (url == null)" + NL + "\t\t{" + NL + "\t\t\tthrow new RuntimeException(\"Missing serialized package: \" + packageFilename);";
  protected final String TEXT_780 = NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_781 = " uri = ";
  protected final String TEXT_782 = ".createURI(url.toString());" + NL + "\t\t";
  protected final String TEXT_783 = " resource = new ";
  protected final String TEXT_784 = "().createResource(uri);" + NL + "\t\ttry" + NL + "\t\t{" + NL + "\t\t\tresource.load(null);" + NL + "\t\t}" + NL + "\t\tcatch (";
  protected final String TEXT_785 = " exception)" + NL + "\t\t{" + NL + "\t\t\tthrow new ";
  protected final String TEXT_786 = "(exception);" + NL + "\t\t}" + NL + "\t\tinitializeFromLoadedEPackage(this, (";
  protected final String TEXT_787 = ")resource.getContents().get(0));" + NL + "\t\tcreateResource(eNS_URI);" + NL + "\t}" + NL + "" + NL + "\t";
  protected final String TEXT_788 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate boolean isFixed = false;" + NL + "" + NL + "\t/**" + NL + "\t * Fixes up the loaded package, to make it appear as if it had been programmatically built." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void fixPackageContents()" + NL + "\t{" + NL + "\t\tif (isFixed) return;" + NL + "\t\tisFixed = true;" + NL + "\t\tfixEClassifiers();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Sets the instance class on the given classifier." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_789 = NL + "\t@Override" + NL + "\t";
  protected final String TEXT_790 = NL + "\tprotected void fixInstanceClass(";
  protected final String TEXT_791 = " eClassifier)" + NL + "\t{" + NL + "\t\tif (eClassifier.getInstanceClassName() == null)" + NL + "\t\t{" + NL + "\t";
  protected final String TEXT_792 = NL + "\t";
  protected final String TEXT_793 = NL + "\t\t\teClassifier.setInstanceClassName(\"";
  protected final String TEXT_794 = ".\" + eClassifier.getName());";
  protected final String TEXT_795 = NL + "\t\t\tsetGeneratedClassName(eClassifier);" + NL + "\t";
  protected final String TEXT_796 = NL + "\t\t\tswitch (eClassifier.getClassifierID())" + NL + "\t\t\t{" + NL + "\t  ";
  protected final String TEXT_797 = NL + "\t";
  protected final String TEXT_798 = NL + "\t\t\t\tcase ";
  protected final String TEXT_799 = ":" + NL + "\t";
  protected final String TEXT_800 = NL + "\t  ";
  protected final String TEXT_801 = NL + "\t\t\t\t{" + NL + "\t\t\t\t\tbreak;" + NL + "\t\t\t\t}" + NL + "\t\t\t\tdefault:" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\teClassifier.setInstanceClassName(\"";
  protected final String TEXT_802 = ".\" + eClassifier.getName());";
  protected final String TEXT_803 = NL + "\t\t\t\t\tsetGeneratedClassName(eClassifier);" + NL + "\t\t\t\t\tbreak;" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t";
  protected final String TEXT_804 = NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_805 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_806 = " addEOperation(";
  protected final String TEXT_807 = " owner, ";
  protected final String TEXT_808 = " type, String name, int lowerBound, int upperBound, boolean isUnique, boolean isOrdered)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_809 = " o = addEOperation(owner, type, name, lowerBound, upperBound);" + NL + "\t\to.setUnique(isUnique);" + NL + "\t\to.setOrdered(isOrdered);" + NL + "\t\treturn o;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_810 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_811 = " addEParameter(";
  protected final String TEXT_812 = " owner, ";
  protected final String TEXT_813 = " type, String name, int lowerBound, int upperBound, boolean isUnique, boolean isOrdered)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_814 = " p = ecoreFactory.createEParameter();" + NL + "\t\tp.setEType(type);" + NL + "\t\tp.setName(name);" + NL + "\t\tp.setLowerBound(lowerBound);" + NL + "\t\tp.setUpperBound(upperBound);" + NL + "\t\tp.setUnique(isUnique);" + NL + "\t\tp.setOrdered(isOrdered);" + NL + "\t\towner.getEParameters().add(p);" + NL + "\t\treturn p;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_815 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * Defines literals for the meta objects that represent" + NL + "\t * <ul>" + NL + "\t *   <li>each class,</li>" + NL + "\t *   <li>each feature of each class,</li>";
  protected final String TEXT_816 = NL + "\t *   <li>each operation of each class,</li>";
  protected final String TEXT_817 = NL + "\t *   <li>each enum,</li>" + NL + "\t *   <li>and each data type</li>" + NL + "\t * </ul>" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_818 = "public ";
  protected final String TEXT_819 = "interface Literals" + NL + "\t{";
  protected final String TEXT_820 = NL + "\t\t/**" + NL + "\t";
  protected final String TEXT_821 = NL + "\t  ";
  protected final String TEXT_822 = NL + "\t\t * The meta object literal for the '{@link ";
  protected final String TEXT_823 = " <em>";
  protected final String TEXT_824 = "</em>}' class." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @see ";
  protected final String TEXT_825 = NL + "\t  ";
  protected final String TEXT_826 = NL + "\t\t * The meta object literal for the '{@link ";
  protected final String TEXT_827 = " <em>";
  protected final String TEXT_828 = "</em>}' class." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @see ";
  protected final String TEXT_829 = NL + "\t  ";
  protected final String TEXT_830 = NL + "\t";
  protected final String TEXT_831 = NL + "\t\t * The meta object literal for the '{@link ";
  protected final String TEXT_832 = " <em>";
  protected final String TEXT_833 = "</em>}' enum." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @see ";
  protected final String TEXT_834 = NL + "\t";
  protected final String TEXT_835 = NL + "\t\t * The meta object literal for the '<em>";
  protected final String TEXT_836 = "</em>' data type." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t  ";
  protected final String TEXT_837 = NL + "\t\t * @see ";
  protected final String TEXT_838 = NL + "\t  ";
  protected final String TEXT_839 = NL + "\t";
  protected final String TEXT_840 = NL + "\t\t * @see ";
  protected final String TEXT_841 = "#get";
  protected final String TEXT_842 = "()" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\t";
  protected final String TEXT_843 = " ";
  protected final String TEXT_844 = " = eINSTANCE.get";
  protected final String TEXT_845 = "();" + NL + "" + NL + "\t";
  protected final String TEXT_846 = NL + "\t  ";
  protected final String TEXT_847 = NL + "\t\t/**" + NL + "\t\t * The meta object literal for the '<em><b>";
  protected final String TEXT_848 = "</b></em>' ";
  protected final String TEXT_849 = " feature." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\t // CHANGE j: Feature constant " + NL + "\t\t";
  protected final String TEXT_850 = " ";
  protected final String TEXT_851 = " = eINSTANCE.get";
  protected final String TEXT_852 = "();" + NL + "" + NL + "\t  ";
  protected final String TEXT_853 = NL + "\t  ";
  protected final String TEXT_854 = NL + "\t";
  protected final String TEXT_855 = NL + "\t\t/**" + NL + "\t\t * The meta object literal for the '<em><b>";
  protected final String TEXT_856 = "</b></em>' operation." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\t // CHANGE j: Operation constant" + NL + "\t\t";
  protected final String TEXT_857 = " ";
  protected final String TEXT_858 = " = eINSTANCE.get";
  protected final String TEXT_859 = "();" + NL + "" + NL + "\t";
  protected final String TEXT_860 = NL + "\t  ";
  protected final String TEXT_861 = NL + "\t";
  protected final String TEXT_862 = NL + "\t}" + NL;
  protected final String TEXT_863 = NL + "} //";
  protected final String TEXT_864 = NL;

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

    final GenPackage genPackage = (GenPackage)((Object[])argument)[0]; final GenModel genModel=genPackage.getGenModel();
    boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]);
    String publicStaticFinalFlag = isImplementation ? "public static final " : "";
    boolean needsAddEOperation = false;
    boolean needsAddEParameter = false;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    }}
    stringBuffer.append(TEXT_4);
    if (isImplementation && !genModel.isSuppressInterfaces()) {
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_6);
    } else {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genPackage.getReflectionPackageName());
    stringBuffer.append(TEXT_8);
    }
    stringBuffer.append(TEXT_9);
    genModel.markImportLocation(stringBuffer, genPackage);
    if (isImplementation) {
    genModel.addPseudoImport("org.eclipse.emf.ecore.EPackage.Registry");
    genModel.addPseudoImport("org.eclipse.emf.ecore.EPackage.Descriptor");
    genModel.addPseudoImport("org.eclipse.emf.ecore.impl.EPackageImpl.EBasicWhiteList");
    genModel.addPseudoImport("org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container");
    genModel.addPseudoImport("org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container.Dynamic");
    if (genPackage.isLiteralsInterface()) {
    genModel.addPseudoImport(genPackage.getQualifiedPackageInterfaceName() + ".Literals");
    }
    for (GenClassifier genClassifier : genPackage.getOrderedGenClassifiers()) genModel.addPseudoImport(genPackage.getQualifiedPackageInterfaceName() + "." + genPackage.getClassifierID(genClassifier));
    }
    if (isInterface) {
    stringBuffer.append(TEXT_10);
    if (genModel.isOperationReflection()) {
    stringBuffer.append(TEXT_11);
    }
    stringBuffer.append(TEXT_12);
    if (genPackage.hasDocumentation()) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genPackage.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_14);
    }
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genPackage.getQualifiedFactoryInterfaceName());
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genPackage.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_16);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_17);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_18);
    }}
    stringBuffer.append(TEXT_19);
    } else {
    stringBuffer.append(TEXT_20);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genPackage.getPackageClassName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.EPackageImpl"));
    if (!isInterface){
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    }
    } else {
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genPackage.getPackageInterfaceName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    }
    stringBuffer.append(TEXT_26);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_30);
    }
    if (isInterface) {
    stringBuffer.append(TEXT_31);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genPackage.getPackageName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(genPackage.getNSURI());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genPackage.getNSName());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genModel.getNonNLS());
    if (genPackage.isContentType()) {
    stringBuffer.append(TEXT_40);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genPackage.getContentTypeIdentifier());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genModel.getNonNLS());
    }
    stringBuffer.append(TEXT_43);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genPackage.getPackageInterfaceName());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genPackage.getQualifiedPackageClassName());
    stringBuffer.append(TEXT_45);
    for (GenClassifier genClassifier : genPackage.getOrderedGenClassifiers()) {
    stringBuffer.append(TEXT_46);
    if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
    stringBuffer.append(TEXT_47);
    if (!genClass.isInterface()) {
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_51);
    } else {
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_56);
    } else if (genClassifier instanceof GenEnum) { GenEnum genEnum = (GenEnum)genClassifier;
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genEnum.getQualifiedName());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genEnum.getFormattedName());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genEnum.getQualifiedName());
    stringBuffer.append(TEXT_60);
    } else if (genClassifier instanceof GenDataType) { GenDataType genDataType = (GenDataType)genClassifier;
    stringBuffer.append(TEXT_61);
    stringBuffer.append(genDataType.getFormattedName());
    stringBuffer.append(TEXT_62);
    if (!genDataType.isPrimitiveType() && !genDataType.isArrayType()) {
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genDataType.getRawInstanceClassName());
    stringBuffer.append(TEXT_64);
    }
    stringBuffer.append(TEXT_65);
    }
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genPackage.getQualifiedPackageClassName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genClassifier.getClassifierAccessorName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genPackage.getClassifierID(genClassifier));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genPackage.getClassifierValue(genClassifier));
    stringBuffer.append(TEXT_71);
    if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
    stringBuffer.append(TEXT_72);
    for (GenFeature genFeature : genClass.getAllGenFeatures()) {
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_75);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genClass.getFeatureID(genFeature));
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genClass.getFeatureValue(genFeature));
    stringBuffer.append(TEXT_78);
    }
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genClass.getFeatureCountID());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genClass.getFeatureCountValue());
    stringBuffer.append(TEXT_83);
    if (genModel.isOperationReflection()) {
    stringBuffer.append(TEXT_84);
    for (GenOperation genOperation : genClass.getAllGenOperations(false)) {
    stringBuffer.append(TEXT_85);
    if (genClass.getOverrideGenOperation(genOperation) == null) {
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_87);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genClass.getOperationID(genOperation, false));
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genClass.getOperationValue(genOperation));
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(TEXT_91);
    }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genClass.getOperationCountID());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genClass.getOperationCountValue());
    stringBuffer.append(TEXT_96);
    }
    stringBuffer.append(TEXT_97);
    }
    }
    }
    if (isImplementation) {
    if (genPackage.isLoadingInitialization()) {
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genPackage.getSerializedPackageFilename());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_100);
    }
    for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genClassifier.getImportedMetaType());
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genClassifier.getClassifierInstanceName());
    stringBuffer.append(TEXT_103);
    }
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genPackage.getPackageClassName());
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genPackage.getQualifiedEFactoryInstanceAccessor());
    stringBuffer.append(TEXT_107);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_108);
    if (!genPackage.isLoadedInitialization()) {
    stringBuffer.append(TEXT_109);
    }
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_114);
    if (genModel.getRuntimePlatform() == GenRuntimePlatform.GWT) {
    stringBuffer.append(TEXT_115);
    }
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genPackage.getPackageClassName());
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genPackage.getPackageClassName());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genPackage.getPackageClassName());
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genPackage.getPackageClassName());
    stringBuffer.append(TEXT_123);
    if (!genPackage.getPackageSimpleDependencies().isEmpty()) {
    stringBuffer.append(TEXT_124);
    for (GenPackage dep : genPackage.getPackageSimpleDependencies()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(dep.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_126);
    }
    stringBuffer.append(TEXT_127);
    }
    if (!genPackage.getPackageInterDependencies().isEmpty()) {
    stringBuffer.append(TEXT_128);
    for (GenPackage interdep : genPackage.getPackageInterDependencies()) {
    stringBuffer.append(TEXT_129);
    stringBuffer.append(interdep.getImportedPackageClassName());
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genPackage.getPackageInstanceVariable(interdep));
    stringBuffer.append(TEXT_131);
    stringBuffer.append(interdep.getImportedPackageClassName());
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    stringBuffer.append(TEXT_133);
    stringBuffer.append(interdep.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(interdep.getImportedPackageClassName());
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    stringBuffer.append(TEXT_136);
    stringBuffer.append(interdep.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_137);
    stringBuffer.append(interdep.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_138);
    }
    stringBuffer.append(TEXT_139);
    }
    if (genPackage.isLoadedInitialization() || !genPackage.getPackageLoadInterDependencies().isEmpty()) {
    stringBuffer.append(TEXT_140);
    if (genPackage.isLoadingInitialization()) {
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_142);
    }
    stringBuffer.append(TEXT_143);
    for (GenPackage interdep : genPackage.getPackageLoadInterDependencies()) {
    stringBuffer.append(TEXT_144);
    if (interdep.isLoadingInitialization()) {
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genPackage.getPackageInstanceVariable(interdep));
    stringBuffer.append(TEXT_146);
    }
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_148);
    }
    if (!genPackage.isLoadedInitialization() || !genPackage.getPackageBuildInterDependencies().isEmpty()) {
    stringBuffer.append(TEXT_149);
    if (!genPackage.isLoadedInitialization()) {
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_151);
    }
    stringBuffer.append(TEXT_152);
    for (GenPackage interdep : genPackage.getPackageBuildInterDependencies()) {
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genPackage.getPackageInstanceVariable(interdep));
    stringBuffer.append(TEXT_154);
    }
    stringBuffer.append(TEXT_155);
    if (!genPackage.isLoadedInitialization()) {
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_157);
    }
    stringBuffer.append(TEXT_158);
    for (GenPackage interdep : genPackage.getPackageBuildInterDependencies()) {
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genPackage.getPackageInstanceVariable(interdep));
    stringBuffer.append(TEXT_160);
    }
    stringBuffer.append(TEXT_161);
    }
    if (genPackage.isLoadedInitialization() || !genPackage.getPackageLoadInterDependencies().isEmpty()) {
    stringBuffer.append(TEXT_162);
    if (genPackage.isLoadedInitialization()) {
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_164);
    }
    stringBuffer.append(TEXT_165);
    for (GenPackage interdep : genPackage.getPackageLoadInterDependencies()) {
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genPackage.getPackageInstanceVariable(interdep));
    stringBuffer.append(TEXT_167);
    }
    stringBuffer.append(TEXT_168);
    }
    if (genPackage.hasConstraints()) {
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EValidator"));
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EValidator"));
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EValidator"));
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genPackage.getImportedValidatorClassName());
    stringBuffer.append(TEXT_174);
    }
    if (!genPackage.isEcorePackage()) {
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_176);
    }
    stringBuffer.append(TEXT_177);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_181);
    if (genModel.getRuntimePlatform() == GenRuntimePlatform.GWT) {
    stringBuffer.append(TEXT_182);
    Set<String> helpers = new HashSet<String>(); for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
    stringBuffer.append(TEXT_183);
    if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
    stringBuffer.append(TEXT_184);
    if (!genClass.isDynamic()) { String theClass = genClass.isMapEntry() ? genClass.getImportedClassName() : genClass.getRawImportedInterfaceName(); if (helpers.add(theClass)) {
    stringBuffer.append(TEXT_185);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Reflect"));
    stringBuffer.append(TEXT_186);
    stringBuffer.append(theClass);
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Reflect"));
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genClass.isMapEntry() ? genClass.getImportedClassName() : genClass.getRawImportedInterfaceName() + genClass.getInterfaceWildTypeArguments());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(theClass);
    stringBuffer.append(TEXT_190);
    }}
    stringBuffer.append(TEXT_191);
    } else if (genClassifier instanceof GenDataType) { GenDataType genDataType = (GenDataType)genClassifier;
    stringBuffer.append(TEXT_192);
    if (!genDataType.isPrimitiveType() && !genDataType.isObjectType()) { String theClass = genDataType.getRawImportedInstanceClassName(); if (helpers.add(theClass)) { 
    stringBuffer.append(TEXT_193);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Reflect"));
    stringBuffer.append(TEXT_194);
    stringBuffer.append(theClass);
    stringBuffer.append(TEXT_195);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Reflect"));
    stringBuffer.append(TEXT_196);
    stringBuffer.append(theClass);
    stringBuffer.append(TEXT_197);
    if (genDataType.isArrayType()) { String componentType = theClass; String indices = ""; while(componentType.endsWith("[]")) { componentType = componentType.substring(0, componentType.length() - 2); indices += "[]";}
    stringBuffer.append(TEXT_198);
    stringBuffer.append(componentType);
    stringBuffer.append(TEXT_199);
    stringBuffer.append(indices);
    stringBuffer.append(TEXT_200);
    } else {
    stringBuffer.append(TEXT_201);
    stringBuffer.append(theClass);
    stringBuffer.append(TEXT_202);
    }
    stringBuffer.append(TEXT_203);
    }}
    stringBuffer.append(TEXT_204);
    }
    stringBuffer.append(TEXT_205);
    }
    stringBuffer.append(TEXT_206);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.IsSerializable"));
    stringBuffer.append(TEXT_207);
    for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
    stringBuffer.append(TEXT_208);
    if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
    stringBuffer.append(TEXT_209);
    if (!genClass.isDynamic()) {
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genClass.isMapEntry() ? genClass.getImportedClassName() : genClass.getImportedWildcardInstanceClassName());
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genClass.getSafeUncapName());
    stringBuffer.append(TEXT_212);
    }
    stringBuffer.append(TEXT_213);
    } else if (genClassifier instanceof GenDataType) { GenDataType genDataType = (GenDataType)genClassifier;
    stringBuffer.append(TEXT_214);
    if (!genDataType.isObjectType() && genDataType.isSerializable()) {
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genDataType.getImportedWildcardInstanceClassName());
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genDataType.getSafeUncapName());
    stringBuffer.append(TEXT_217);
    }
    stringBuffer.append(TEXT_218);
    }
    stringBuffer.append(TEXT_219);
    }
    stringBuffer.append(TEXT_220);
    }
    stringBuffer.append(TEXT_221);
    }
    if (isInterface) { // TODO REMOVE THIS BOGUS EMPTY LINE
    stringBuffer.append(TEXT_222);
    }
    for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
    if (isInterface) {
    stringBuffer.append(TEXT_223);
    if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_228);
    if (!genModel.isSuppressEMFModelTags() && (genClass.isExternalInterface() || genClass.isDynamic())) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genClass.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_229);
    stringBuffer.append(modelInfo);
    stringBuffer.append(TEXT_230);
    } else {
    stringBuffer.append(TEXT_231);
    stringBuffer.append(modelInfo);
    stringBuffer.append(TEXT_232);
    }} if (first) {
    stringBuffer.append(TEXT_233);
    }}
    stringBuffer.append(TEXT_234);
    } else if (genClassifier instanceof GenEnum) { GenEnum genEnum = (GenEnum)genClassifier;
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genEnum.getQualifiedName());
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genEnum.getFormattedName());
    stringBuffer.append(TEXT_237);
    stringBuffer.append(genEnum.getFormattedName());
    stringBuffer.append(TEXT_238);
    stringBuffer.append(genEnum.getQualifiedName());
    stringBuffer.append(TEXT_239);
    } else if (genClassifier instanceof GenDataType) { GenDataType genDataType = (GenDataType)genClassifier;
    stringBuffer.append(TEXT_240);
    if (genDataType.isPrimitiveType() || genDataType.isArrayType()) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genDataType.getFormattedName());
    stringBuffer.append(TEXT_242);
    } else {
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genDataType.getRawInstanceClassName());
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genDataType.getFormattedName());
    stringBuffer.append(TEXT_245);
    }
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genDataType.getFormattedName());
    stringBuffer.append(TEXT_247);
    if (!genDataType.isPrimitiveType() && !genDataType.isArrayType()) {
    stringBuffer.append(TEXT_248);
    stringBuffer.append(genDataType.getRawInstanceClassName());
    stringBuffer.append(TEXT_249);
    }
    stringBuffer.append(TEXT_250);
    if (!genModel.isSuppressEMFModelTags()) {boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genDataType.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_251);
    stringBuffer.append(modelInfo);
    stringBuffer.append(TEXT_252);
    } else {
    stringBuffer.append(TEXT_253);
    stringBuffer.append(modelInfo);
    stringBuffer.append(TEXT_254);
    }} if (first) {
    stringBuffer.append(TEXT_255);
    }}
    stringBuffer.append(TEXT_256);
    }
    stringBuffer.append(TEXT_257);
    } else {
    stringBuffer.append(TEXT_258);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genClassifier.getImportedMetaType());
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genClassifier.getClassifierAccessorName());
    stringBuffer.append(TEXT_261);
    if (genPackage.isLoadedInitialization()) {
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genClassifier.getClassifierInstanceName());
    stringBuffer.append(TEXT_263);
    stringBuffer.append(genClassifier.getClassifierInstanceName());
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genClassifier.getImportedMetaType());
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genPackage.getLocalClassifierIndex(genClassifier));
    stringBuffer.append(TEXT_268);
    }
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genClassifier.getClassifierInstanceName());
    stringBuffer.append(TEXT_270);
    } else {
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genClassifier.getImportedMetaType());
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genClassifier.getClassifierAccessorName());
    stringBuffer.append(TEXT_273);
    }
    stringBuffer.append(TEXT_274);
    if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
    stringBuffer.append(TEXT_275);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    if (isInterface) {
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    if (!genClass.isMapEntry() && !genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_279);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_280);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_281);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_282);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    if (!genClass.isMapEntry() && !genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_284);
    }
    stringBuffer.append(TEXT_285);
    stringBuffer.append(genClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_286);
    } else {
    stringBuffer.append(TEXT_287);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genFeature.getImportedMetaType());
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_290);
    if (!genPackage.isLoadedInitialization()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getImportedMetaType());
    stringBuffer.append(TEXT_292);
    stringBuffer.append(genClass.getClassifierInstanceName());
    stringBuffer.append(TEXT_293);
    stringBuffer.append(genClass.getLocalFeatureIndex(genFeature));
    stringBuffer.append(TEXT_294);
    } else {
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genFeature.getImportedMetaType());
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genClassifier.getClassifierAccessorName());
    stringBuffer.append(TEXT_297);
    stringBuffer.append(genClass.getLocalFeatureIndex(genFeature));
    stringBuffer.append(TEXT_298);
    }
    stringBuffer.append(TEXT_299);
    } else {
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genFeature.getImportedMetaType());
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_302);
    }
    stringBuffer.append(TEXT_303);
    }
    stringBuffer.append(TEXT_304);
    if (genModel.isOperationReflection()) {
    stringBuffer.append(TEXT_305);
    for (GenOperation genOperation : genClass.getGenOperations()) {
    if (isInterface) {
    stringBuffer.append(TEXT_306);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_307);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_314);
    } else {
    stringBuffer.append(TEXT_315);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genOperation.getImportedMetaType());
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genOperation.getOperationAccessorName());
    stringBuffer.append(TEXT_318);
    if (!genPackage.isLoadedInitialization()) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genClass.getClassifierInstanceName());
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genClass.getLocalOperationIndex(genOperation));
    stringBuffer.append(TEXT_321);
    } else {
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genClassifier.getClassifierAccessorName());
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genClass.getLocalOperationIndex(genOperation));
    stringBuffer.append(TEXT_324);
    }
    stringBuffer.append(TEXT_325);
    } else {
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genOperation.getImportedMetaType());
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genOperation.getOperationAccessorName());
    stringBuffer.append(TEXT_328);
    }
    stringBuffer.append(TEXT_329);
    }
    stringBuffer.append(TEXT_330);
    }
    stringBuffer.append(TEXT_331);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_332);
    } else {
    stringBuffer.append(TEXT_333);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_334);
    stringBuffer.append(genPackage.getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genPackage.getFactoryName());
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genPackage.getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_337);
    } else {
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genPackage.getFactoryInterfaceName());
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genPackage.getFactoryName());
    stringBuffer.append(TEXT_340);
    }
    stringBuffer.append(TEXT_341);
    if (isImplementation) {
    if (!genPackage.isLoadedInitialization()) {
    stringBuffer.append(TEXT_342);
    if (!genPackage.getGenClasses().isEmpty()) {
    stringBuffer.append(TEXT_343);
    for (Iterator<GenClass> c=genPackage.getGenClasses().iterator(); c.hasNext();) { GenClass genClass = c.next();
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genClass.getClassifierInstanceName());
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genClass.getRawImportedMetaType());
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genClass.getClassifierID());
    stringBuffer.append(TEXT_347);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getRawImportedMetaType());
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genClass.getClassifierInstanceName());
    stringBuffer.append(TEXT_350);
    stringBuffer.append(genClass.getFeatureID(genFeature));
    stringBuffer.append(TEXT_351);
    }
    stringBuffer.append(TEXT_352);
    if (genModel.isOperationReflection()) {
    stringBuffer.append(TEXT_353);
    for (GenOperation genOperation : genClass.getGenOperations()) {
    stringBuffer.append(TEXT_354);
    stringBuffer.append(genClass.getClassifierInstanceName());
    stringBuffer.append(TEXT_355);
    stringBuffer.append(genClass.getOperationID(genOperation, false));
    stringBuffer.append(TEXT_356);
    }
    stringBuffer.append(TEXT_357);
    }
    stringBuffer.append(TEXT_358);
    if (c.hasNext()) {
    stringBuffer.append(TEXT_359);
    }
    stringBuffer.append(TEXT_360);
    }
    stringBuffer.append(TEXT_361);
    }
    stringBuffer.append(TEXT_362);
    if (!genPackage.getGenEnums().isEmpty()) {
    stringBuffer.append(TEXT_363);
    for (GenEnum genEnum : genPackage.getGenEnums()) {
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genEnum.getClassifierInstanceName());
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genEnum.getClassifierID());
    stringBuffer.append(TEXT_366);
    }
    stringBuffer.append(TEXT_367);
    }
    stringBuffer.append(TEXT_368);
    if (!genPackage.getGenDataTypes().isEmpty()) {
    stringBuffer.append(TEXT_369);
    for (GenDataType genDataType : genPackage.getGenDataTypes()) {
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genDataType.getClassifierInstanceName());
    stringBuffer.append(TEXT_371);
    stringBuffer.append(genDataType.getClassifierID());
    stringBuffer.append(TEXT_372);
    }
    stringBuffer.append(TEXT_373);
    }
    stringBuffer.append(TEXT_374);
    
///////////////////////
class Information
{
  @SuppressWarnings("unused")
  EGenericType eGenericType;
  int depth;
  String type;
  String accessor;
}

class InformationIterator
{
  Iterator<Object> iterator;
  InformationIterator(EGenericType eGenericType)
  {
	iterator = EcoreUtil.getAllContents(Collections.singleton(eGenericType));
  }

  boolean hasNext()
  {
	return iterator.hasNext();
  }

  Information next()
  {
	Information information = new Information();
	EGenericType eGenericType = information.eGenericType = (EGenericType)iterator.next();
	for (EObject container = eGenericType.eContainer(); container instanceof EGenericType; container = container.eContainer())
	{
	  ++information.depth;
	}
	if (eGenericType.getEClassifier() != null )
	{
	  GenClassifier genClassifier = genModel.findGenClassifier(eGenericType.getEClassifier());
	  information.type = genPackage.getPackageInstanceVariable(genClassifier.getGenPackage()) + ".get" + genClassifier.getClassifierAccessorName() + "()";
	}
	else if (eGenericType.getETypeParameter() != null)
	{
	  ETypeParameter eTypeParameter = eGenericType.getETypeParameter();
	  if (eTypeParameter.eContainer() instanceof EClass)
	  {
	information.type = genModel.findGenClassifier((EClass)eTypeParameter.eContainer()).getClassifierInstanceName() + "_" + eGenericType.getETypeParameter().getName();
	  }
	  else
	  {
	information.type = "t" + (((EOperation)eTypeParameter.eContainer()).getETypeParameters().indexOf(eTypeParameter) + 1);
	  }
	}
	else
	{
	  information.type ="";
	}
	if (information.depth > 0)
	{
	  if (eGenericType.eContainmentFeature().isMany())
	  {
	information.accessor = "getE" + eGenericType.eContainmentFeature().getName().substring(1) + "().add";
	  }
	  else
	  {
	information.accessor = "setE" + eGenericType.eContainmentFeature().getName().substring(1);
	  }
	}
	return information;
  }
}
///////////////////////
int maxGenericTypeAssignment = 0;

    stringBuffer.append(TEXT_375);
    if (!genPackage.getPackageInitializationDependencies().isEmpty()) {
    stringBuffer.append(TEXT_376);
    for (GenPackage dep : genPackage.getPackageInitializationDependencies()) {
    stringBuffer.append(TEXT_377);
    stringBuffer.append(dep.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genPackage.getPackageInstanceVariable(dep));
    stringBuffer.append(TEXT_379);
    stringBuffer.append(dep.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    stringBuffer.append(TEXT_381);
    stringBuffer.append(dep.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_382);
    }
    stringBuffer.append(TEXT_383);
    }
    stringBuffer.append(TEXT_384);
    if (!genPackage.getSubGenPackages().isEmpty()) {
    stringBuffer.append(TEXT_385);
    for (GenPackage sub : genPackage.getSubGenPackages()) {
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genPackage.getPackageInstanceVariable(sub));
    stringBuffer.append(TEXT_387);
    }
    stringBuffer.append(TEXT_388);
    }
    stringBuffer.append(TEXT_389);
    if (!genPackage.getGenClasses().isEmpty()) { boolean firstOperationAssignment = true; int maxTypeParameterAssignment = 0;
    stringBuffer.append(TEXT_390);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_391);
    for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
    stringBuffer.append(TEXT_392);
    for (GenTypeParameter genTypeParameter : genClassifier.getGenTypeParameters()) {
    stringBuffer.append(TEXT_393);
    if (!genTypeParameter.getEcoreTypeParameter().getEBounds().isEmpty() || genTypeParameter.isUsed()) {
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.ETypeParameter"));
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genClassifier.getClassifierInstanceName());
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genTypeParameter.getName());
    stringBuffer.append(TEXT_397);
    stringBuffer.append(genClassifier.getClassifierInstanceName());
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genTypeParameter.getName());
    stringBuffer.append(TEXT_399);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_400);
    } else {
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genClassifier.getClassifierInstanceName());
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genTypeParameter.getName());
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_404);
    }
    stringBuffer.append(TEXT_405);
    }
    stringBuffer.append(TEXT_406);
    }
    stringBuffer.append(TEXT_407);
    }
    stringBuffer.append(TEXT_408);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_409);
    for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
    stringBuffer.append(TEXT_410);
    for (GenTypeParameter genTypeParameter : genClassifier.getGenTypeParameters()) {
    stringBuffer.append(TEXT_411);
    for (EGenericType bound : genTypeParameter.getEcoreTypeParameter().getEBounds()) {
    stringBuffer.append(TEXT_412);
    for (InformationIterator i=new InformationIterator(bound); i.hasNext(); ) { Information info = i.next(); String prefix = ""; if (maxGenericTypeAssignment <= info.depth) { ++maxGenericTypeAssignment; prefix = genModel.getImportedName("org.eclipse.emf.ecore.EGenericType") + " "; }
    stringBuffer.append(TEXT_413);
    stringBuffer.append(prefix);
    stringBuffer.append(TEXT_414);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_415);
    stringBuffer.append(info.type);
    stringBuffer.append(TEXT_416);
    if (info.depth > 0) {
    stringBuffer.append(TEXT_417);
    stringBuffer.append(info.depth);
    stringBuffer.append(TEXT_418);
    stringBuffer.append(info.accessor);
    stringBuffer.append(TEXT_419);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_420);
    }
    stringBuffer.append(TEXT_421);
    }
    stringBuffer.append(TEXT_422);
    stringBuffer.append(genClassifier.getClassifierInstanceName());
    stringBuffer.append(TEXT_423);
    stringBuffer.append(genTypeParameter.getName());
    stringBuffer.append(TEXT_424);
    }
    stringBuffer.append(TEXT_425);
    }
    stringBuffer.append(TEXT_426);
    }
    stringBuffer.append(TEXT_427);
    }
    stringBuffer.append(TEXT_428);
    for (GenClass genClass : genPackage.getGenClasses()) {
    stringBuffer.append(TEXT_429);
    if (!genClass.hasGenericSuperTypes()) {
    stringBuffer.append(TEXT_430);
    for (GenClass baseGenClass : genClass.getBaseGenClasses()) {
    stringBuffer.append(TEXT_431);
    stringBuffer.append(genClass.getClassifierInstanceName());
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genPackage.getPackageInstanceVariable(baseGenClass.getGenPackage()));
    stringBuffer.append(TEXT_433);
    stringBuffer.append(baseGenClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_434);
    }
    stringBuffer.append(TEXT_435);
    } else {
    stringBuffer.append(TEXT_436);
    for (EGenericType superType : genClass.getEcoreClass().getEGenericSuperTypes()) {
    stringBuffer.append(TEXT_437);
    for (InformationIterator i=new InformationIterator(superType); i.hasNext(); ) { Information info = i.next(); String prefix = ""; if (maxGenericTypeAssignment <= info.depth) { ++maxGenericTypeAssignment; prefix = genModel.getImportedName("org.eclipse.emf.ecore.EGenericType") + " "; }
    stringBuffer.append(TEXT_438);
    stringBuffer.append(prefix);
    stringBuffer.append(TEXT_439);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_440);
    stringBuffer.append(info.type);
    stringBuffer.append(TEXT_441);
    if (info.depth > 0) {
    stringBuffer.append(TEXT_442);
    stringBuffer.append(info.depth);
    stringBuffer.append(TEXT_443);
    stringBuffer.append(info.accessor);
    stringBuffer.append(TEXT_444);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_445);
    }
    stringBuffer.append(TEXT_446);
    }
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genClass.getClassifierInstanceName());
    stringBuffer.append(TEXT_448);
    }
    stringBuffer.append(TEXT_449);
    }
    stringBuffer.append(TEXT_450);
    }
    stringBuffer.append(TEXT_451);
    if (genModel.isOperationReflection()) {
    stringBuffer.append(TEXT_452);
    } else {
    stringBuffer.append(TEXT_453);
    }
    stringBuffer.append(TEXT_454);
    for (Iterator<GenClass> c=genPackage.getGenClasses().iterator(); c.hasNext();) { GenClass genClass = c.next(); boolean hasInstanceTypeName = genModel.useGenerics() && genClass.getEcoreClass().getInstanceTypeName() != null && genClass.getEcoreClass().getInstanceTypeName().contains("<");
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genClass.getClassifierInstanceName());
    stringBuffer.append(TEXT_456);
    if (genClass.isDynamic()) {
    stringBuffer.append(TEXT_457);
    } else {
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_458);
    }
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genClass.getAbstractFlag());
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genClass.getInterfaceFlag());
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genClass.getGeneratedInstanceClassFlag());
    if (hasInstanceTypeName) {
    stringBuffer.append(TEXT_463);
    stringBuffer.append(genClass.getEcoreClass().getInstanceTypeName());
    stringBuffer.append(TEXT_464);
    }
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genModel.getNonNLS());
    if (hasInstanceTypeName) {
    stringBuffer.append(genModel.getNonNLS(2));
    }
    stringBuffer.append(TEXT_466);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_467);
    if (genFeature.hasGenericType()) {
    stringBuffer.append(TEXT_468);
    for (InformationIterator i=new InformationIterator(genFeature.getEcoreFeature().getEGenericType()); i.hasNext(); ) { Information info = i.next(); String prefix = ""; if (maxGenericTypeAssignment <= info.depth) { ++maxGenericTypeAssignment; prefix = genModel.getImportedName("org.eclipse.emf.ecore.EGenericType") + " "; }
    stringBuffer.append(TEXT_469);
    stringBuffer.append(prefix);
    stringBuffer.append(TEXT_470);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_471);
    stringBuffer.append(info.type);
    stringBuffer.append(TEXT_472);
    if (info.depth > 0) {
    stringBuffer.append(TEXT_473);
    stringBuffer.append(info.depth);
    stringBuffer.append(TEXT_474);
    stringBuffer.append(info.accessor);
    stringBuffer.append(TEXT_475);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_476);
    }
    stringBuffer.append(TEXT_477);
    }
    stringBuffer.append(TEXT_478);
    }
    stringBuffer.append(TEXT_479);
    if (genFeature.isReferenceType()) { GenFeature reverseGenFeature = genFeature.getReverse();
    stringBuffer.append(TEXT_480);
    String reverse = reverseGenFeature == null ? "null" : genPackage.getPackageInstanceVariable(reverseGenFeature.getGenPackage()) + ".get" + reverseGenFeature.getFeatureAccessorName() + "()";
    stringBuffer.append(TEXT_481);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_482);
    if (genFeature.hasGenericType()) {
    stringBuffer.append(TEXT_483);
    } else {
    stringBuffer.append(genPackage.getPackageInstanceVariable(genFeature.getTypeGenPackage()));
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genFeature.getTypeClassifierAccessorName());
    stringBuffer.append(TEXT_485);
    }
    stringBuffer.append(TEXT_486);
    stringBuffer.append(reverse);
    stringBuffer.append(TEXT_487);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_488);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genFeature.getLowerBound());
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genFeature.getUpperBound());
    stringBuffer.append(TEXT_491);
    stringBuffer.append(genFeature.getContainerClass());
    stringBuffer.append(TEXT_492);
    stringBuffer.append(genFeature.getTransientFlag());
    stringBuffer.append(TEXT_493);
    stringBuffer.append(genFeature.getVolatileFlag());
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genFeature.getChangeableFlag());
    stringBuffer.append(TEXT_495);
    stringBuffer.append(genFeature.getContainmentFlag());
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genFeature.getResolveProxiesFlag());
    stringBuffer.append(TEXT_497);
    stringBuffer.append(genFeature.getUnsettableFlag());
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genFeature.getUniqueFlag());
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genFeature.getDerivedFlag());
    stringBuffer.append(TEXT_500);
    stringBuffer.append(genFeature.getOrderedFlag());
    stringBuffer.append(TEXT_501);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(genFeature.getDefaultValue(), 2));
    stringBuffer.append(TEXT_502);
    for (GenFeature keyFeature : genFeature.getKeys()) {
    stringBuffer.append(TEXT_503);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_504);
    stringBuffer.append(genPackage.getPackageInstanceVariable(keyFeature.getGenPackage()));
    stringBuffer.append(TEXT_505);
    stringBuffer.append(keyFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_506);
    }
    stringBuffer.append(TEXT_507);
    } else {
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_509);
    if (genFeature.hasGenericType()) {
    stringBuffer.append(TEXT_510);
    } else {
    stringBuffer.append(genPackage.getPackageInstanceVariable(genFeature.getTypeGenPackage()));
    stringBuffer.append(TEXT_511);
    stringBuffer.append(genFeature.getTypeClassifierAccessorName());
    stringBuffer.append(TEXT_512);
    }
    stringBuffer.append(TEXT_513);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_514);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_515);
    stringBuffer.append(genFeature.getLowerBound());
    stringBuffer.append(TEXT_516);
    stringBuffer.append(genFeature.getUpperBound());
    stringBuffer.append(TEXT_517);
    stringBuffer.append(genFeature.getContainerClass());
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genFeature.getTransientFlag());
    stringBuffer.append(TEXT_519);
    stringBuffer.append(genFeature.getVolatileFlag());
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genFeature.getChangeableFlag());
    stringBuffer.append(TEXT_521);
    stringBuffer.append(genFeature.getUnsettableFlag());
    stringBuffer.append(TEXT_522);
    stringBuffer.append(genFeature.getIDFlag());
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getUniqueFlag());
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genFeature.getDerivedFlag());
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genFeature.getOrderedFlag());
    stringBuffer.append(TEXT_526);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(genFeature.getDefaultValue(), 2));
    stringBuffer.append(TEXT_527);
    }
    stringBuffer.append(TEXT_528);
    }
    stringBuffer.append(TEXT_529);
    for (GenOperation genOperation : genClass.getGenOperations()) {String prefix = ""; if (genOperation.hasGenericType() || !genOperation.getGenParameters().isEmpty() || !genOperation.getGenExceptions().isEmpty() || !genOperation.getGenTypeParameters().isEmpty()) { if (firstOperationAssignment) { firstOperationAssignment = false; prefix = genModel.getImportedName("org.eclipse.emf.ecore.EOperation") + " op = "; } else { prefix = "op = "; }} 
    stringBuffer.append(TEXT_530);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_531);
    stringBuffer.append(prefix);
    if (genModel.isOperationReflection()) {
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genOperation.getOperationAccessorName());
    stringBuffer.append(TEXT_533);
    } else {
    stringBuffer.append(TEXT_534);
    stringBuffer.append(genClass.getClassifierInstanceName());
    }
    stringBuffer.append(TEXT_535);
    if (genOperation.isVoid() || genOperation.hasGenericType()) {
    stringBuffer.append(TEXT_536);
    } else {
    stringBuffer.append(genPackage.getPackageInstanceVariable(genOperation.getTypeGenPackage()));
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genOperation.getTypeClassifierAccessorName());
    stringBuffer.append(TEXT_538);
    }
    stringBuffer.append(TEXT_539);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genOperation.getLowerBound());
    stringBuffer.append(TEXT_541);
    stringBuffer.append(genOperation.getUpperBound());
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genOperation.getUniqueFlag());
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genOperation.getOrderedFlag());
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_545);
    } else if (!genOperation.isVoid()) {
    stringBuffer.append(TEXT_546);
    if (!genOperation.getEcoreOperation().isOrdered() || !genOperation.getEcoreOperation().isUnique()) { needsAddEOperation = true;
    stringBuffer.append(TEXT_547);
    stringBuffer.append(prefix);
    if (genModel.isOperationReflection()) {
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genOperation.getOperationAccessorName());
    stringBuffer.append(TEXT_549);
    } else {
    stringBuffer.append(TEXT_550);
    stringBuffer.append(genClass.getClassifierInstanceName());
    }
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genPackage.getPackageInstanceVariable(genOperation.getTypeGenPackage()));
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genOperation.getTypeClassifierAccessorName());
    stringBuffer.append(TEXT_553);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genOperation.getLowerBound());
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genOperation.getUpperBound());
    stringBuffer.append(TEXT_556);
    stringBuffer.append(genOperation.getUniqueFlag());
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genOperation.getOrderedFlag());
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_559);
    } else {
    stringBuffer.append(TEXT_560);
    stringBuffer.append(prefix);
    if (genModel.isOperationReflection()) {
    stringBuffer.append(TEXT_561);
    stringBuffer.append(genOperation.getOperationAccessorName());
    stringBuffer.append(TEXT_562);
    } else {
    stringBuffer.append(TEXT_563);
    stringBuffer.append(genClass.getClassifierInstanceName());
    }
    stringBuffer.append(TEXT_564);
    stringBuffer.append(genPackage.getPackageInstanceVariable(genOperation.getTypeGenPackage()));
    stringBuffer.append(TEXT_565);
    stringBuffer.append(genOperation.getTypeClassifierAccessorName());
    stringBuffer.append(TEXT_566);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_567);
    stringBuffer.append(genOperation.getLowerBound());
    stringBuffer.append(TEXT_568);
    stringBuffer.append(genOperation.getUpperBound());
    stringBuffer.append(TEXT_569);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_570);
    }
    stringBuffer.append(TEXT_571);
    } else {
    stringBuffer.append(TEXT_572);
    stringBuffer.append(prefix);
    if (genModel.isOperationReflection()) {
    stringBuffer.append(TEXT_573);
    stringBuffer.append(genOperation.getOperationAccessorName());
    stringBuffer.append(TEXT_574);
    } else {
    stringBuffer.append(TEXT_575);
    stringBuffer.append(genClass.getClassifierInstanceName());
    }
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_577);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_578);
    }
    stringBuffer.append(TEXT_579);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_580);
    for (ListIterator<GenTypeParameter> t=genOperation.getGenTypeParameters().listIterator(); t.hasNext(); ) { GenTypeParameter genTypeParameter = t.next(); String typeParameterVariable = ""; if (!genTypeParameter.getEcoreTypeParameter().getEBounds().isEmpty() || genTypeParameter.isUsed()) { if (maxTypeParameterAssignment <= t.previousIndex()) { ++maxTypeParameterAssignment; typeParameterVariable = genModel.getImportedName("org.eclipse.emf.ecore.ETypeParameter") + " t" + t.nextIndex() + " = "; } else { typeParameterVariable = "t" + t.nextIndex() + " = "; }} 
    stringBuffer.append(TEXT_581);
    stringBuffer.append(typeParameterVariable);
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genTypeParameter.getName());
    stringBuffer.append(TEXT_583);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_584);
    for (EGenericType typeParameter : genTypeParameter.getEcoreTypeParameter().getEBounds()) {
    stringBuffer.append(TEXT_585);
    for (InformationIterator i=new InformationIterator(typeParameter); i.hasNext(); ) { Information info = i.next(); String typePrefix = ""; if (maxGenericTypeAssignment <= info.depth) { ++maxGenericTypeAssignment; typePrefix = genModel.getImportedName("org.eclipse.emf.ecore.EGenericType") + " "; }
    stringBuffer.append(TEXT_586);
    stringBuffer.append(typePrefix);
    stringBuffer.append(TEXT_587);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_588);
    stringBuffer.append(info.type);
    stringBuffer.append(TEXT_589);
    if (info.depth > 0) {
    stringBuffer.append(TEXT_590);
    stringBuffer.append(info.depth);
    stringBuffer.append(TEXT_591);
    stringBuffer.append(info.accessor);
    stringBuffer.append(TEXT_592);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_593);
    }
    stringBuffer.append(TEXT_594);
    }
    stringBuffer.append(TEXT_595);
    stringBuffer.append(t.nextIndex());
    stringBuffer.append(TEXT_596);
    }
    stringBuffer.append(TEXT_597);
    }
    stringBuffer.append(TEXT_598);
    }
    stringBuffer.append(TEXT_599);
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    stringBuffer.append(TEXT_600);
    if (genParameter.hasGenericType()) {
    stringBuffer.append(TEXT_601);
    for (InformationIterator i=new InformationIterator(genParameter.getEcoreParameter().getEGenericType()); i.hasNext(); ) { Information info = i.next(); String typePrefix = ""; if (maxGenericTypeAssignment <= info.depth) { ++maxGenericTypeAssignment; typePrefix = genModel.getImportedName("org.eclipse.emf.ecore.EGenericType") + " "; }
    stringBuffer.append(TEXT_602);
    stringBuffer.append(typePrefix);
    stringBuffer.append(TEXT_603);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_604);
    stringBuffer.append(info.type);
    stringBuffer.append(TEXT_605);
    if (info.depth > 0) {
    stringBuffer.append(TEXT_606);
    stringBuffer.append(info.depth);
    stringBuffer.append(TEXT_607);
    stringBuffer.append(info.accessor);
    stringBuffer.append(TEXT_608);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_609);
    }
    stringBuffer.append(TEXT_610);
    }
    stringBuffer.append(TEXT_611);
    }
    stringBuffer.append(TEXT_612);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_613);
    if (genParameter.hasGenericType()){
    stringBuffer.append(TEXT_614);
    } else {
    stringBuffer.append(genPackage.getPackageInstanceVariable(genParameter.getTypeGenPackage()));
    stringBuffer.append(TEXT_615);
    stringBuffer.append(genParameter.getTypeClassifierAccessorName());
    stringBuffer.append(TEXT_616);
    }
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_618);
    stringBuffer.append(genParameter.getLowerBound());
    stringBuffer.append(TEXT_619);
    stringBuffer.append(genParameter.getUpperBound());
    stringBuffer.append(TEXT_620);
    stringBuffer.append(genParameter.getUniqueFlag());
    stringBuffer.append(TEXT_621);
    stringBuffer.append(genParameter.getOrderedFlag());
    stringBuffer.append(TEXT_622);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_623);
    } else if (!genParameter.getEcoreParameter().isOrdered() || !genParameter.getEcoreParameter().isUnique()) { needsAddEParameter = true;
    stringBuffer.append(TEXT_624);
    if (genParameter.hasGenericType()){
    stringBuffer.append(TEXT_625);
    } else {
    stringBuffer.append(genPackage.getPackageInstanceVariable(genParameter.getTypeGenPackage()));
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genParameter.getTypeClassifierAccessorName());
    stringBuffer.append(TEXT_627);
    }
    stringBuffer.append(TEXT_628);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genParameter.getLowerBound());
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genParameter.getUpperBound());
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genParameter.getUniqueFlag());
    stringBuffer.append(TEXT_632);
    stringBuffer.append(genParameter.getOrderedFlag());
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_634);
    } else {
    stringBuffer.append(TEXT_635);
    if (genParameter.hasGenericType()){
    stringBuffer.append(TEXT_636);
    } else {
    stringBuffer.append(genPackage.getPackageInstanceVariable(genParameter.getTypeGenPackage()));
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genParameter.getTypeClassifierAccessorName());
    stringBuffer.append(TEXT_638);
    }
    stringBuffer.append(TEXT_639);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genParameter.getLowerBound());
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genParameter.getUpperBound());
    stringBuffer.append(TEXT_642);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_643);
    }
    stringBuffer.append(TEXT_644);
    }
    stringBuffer.append(TEXT_645);
    if (genOperation.hasGenericExceptions()) {
    stringBuffer.append(TEXT_646);
    for (EGenericType genericExceptions : genOperation.getEcoreOperation().getEGenericExceptions()) {
    stringBuffer.append(TEXT_647);
    for (InformationIterator i=new InformationIterator(genericExceptions); i.hasNext(); ) { Information info = i.next(); String typePrefix = ""; if (maxGenericTypeAssignment <= info.depth) { ++maxGenericTypeAssignment; typePrefix = genModel.getImportedName("org.eclipse.emf.ecore.EGenericType") + " "; }
    stringBuffer.append(TEXT_648);
    stringBuffer.append(typePrefix);
    stringBuffer.append(TEXT_649);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_650);
    stringBuffer.append(info.type);
    stringBuffer.append(TEXT_651);
    if (info.depth > 0) {
    stringBuffer.append(TEXT_652);
    stringBuffer.append(info.depth);
    stringBuffer.append(TEXT_653);
    stringBuffer.append(info.accessor);
    stringBuffer.append(TEXT_654);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_655);
    }
    stringBuffer.append(TEXT_656);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_657);
    }
    stringBuffer.append(TEXT_658);
    }
    stringBuffer.append(TEXT_659);
    } else {
    stringBuffer.append(TEXT_660);
    for (GenClassifier genException : genOperation.getGenExceptions()) {
    stringBuffer.append(TEXT_661);
    stringBuffer.append(genPackage.getPackageInstanceVariable(genException.getGenPackage()));
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genException.getClassifierAccessorName());
    stringBuffer.append(TEXT_663);
    }
    stringBuffer.append(TEXT_664);
    }
    stringBuffer.append(TEXT_665);
    if (!genOperation.isVoid() && genOperation.hasGenericType()) {
    stringBuffer.append(TEXT_666);
    for (InformationIterator i=new InformationIterator(genOperation.getEcoreOperation().getEGenericType()); i.hasNext(); ) { Information info = i.next(); String typePrefix = ""; if (maxGenericTypeAssignment <= info.depth) { ++maxGenericTypeAssignment; typePrefix = genModel.getImportedName("org.eclipse.emf.ecore.EGenericType") + " "; }
    stringBuffer.append(TEXT_667);
    stringBuffer.append(typePrefix);
    stringBuffer.append(TEXT_668);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_669);
    stringBuffer.append(info.type);
    stringBuffer.append(TEXT_670);
    if (info.depth > 0) {
    stringBuffer.append(TEXT_671);
    stringBuffer.append(info.depth);
    stringBuffer.append(TEXT_672);
    stringBuffer.append(info.accessor);
    stringBuffer.append(TEXT_673);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_674);
    }
    stringBuffer.append(TEXT_675);
    }
    stringBuffer.append(TEXT_676);
    }
    stringBuffer.append(TEXT_677);
    }
    stringBuffer.append(TEXT_678);
    if (c.hasNext()) {
    stringBuffer.append(TEXT_679);
    }
    stringBuffer.append(TEXT_680);
    }
    stringBuffer.append(TEXT_681);
    }
    stringBuffer.append(TEXT_682);
    if (!genPackage.getGenEnums().isEmpty()) {
    stringBuffer.append(TEXT_683);
    for (Iterator<GenEnum> e=genPackage.getGenEnums().iterator(); e.hasNext();) { GenEnum genEnum = e.next();
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genEnum.getClassifierInstanceName());
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genEnum.getImportedName());
    stringBuffer.append(TEXT_686);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_687);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_688);
    for (GenEnumLiteral genEnumLiteral : genEnum.getGenEnumLiterals()) {
    stringBuffer.append(TEXT_689);
    stringBuffer.append(genEnum.getClassifierInstanceName());
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genEnum.getImportedName().equals(genEnum.getClassifierID()) ? genEnum.getQualifiedName() : genEnum.getImportedName());
    stringBuffer.append(TEXT_691);
    stringBuffer.append(genEnumLiteral.getEnumLiteralInstanceConstantName());
    stringBuffer.append(TEXT_692);
    }
    stringBuffer.append(TEXT_693);
    if (e.hasNext()) {
    stringBuffer.append(TEXT_694);
    }
    stringBuffer.append(TEXT_695);
    }
    stringBuffer.append(TEXT_696);
    }
    stringBuffer.append(TEXT_697);
    if (!genPackage.getGenDataTypes().isEmpty()) {
    stringBuffer.append(TEXT_698);
    for (GenDataType genDataType : genPackage.getGenDataTypes()) {boolean hasInstanceTypeName = genModel.useGenerics() && genDataType.getEcoreDataType().getInstanceTypeName() != null && genDataType.getEcoreDataType().getInstanceTypeName().contains("<");
    stringBuffer.append(TEXT_699);
    stringBuffer.append(genDataType.getClassifierInstanceName());
    stringBuffer.append(TEXT_700);
    stringBuffer.append(genDataType.getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_701);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_702);
    stringBuffer.append(genDataType.getSerializableFlag());
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genDataType.getGeneratedInstanceClassFlag());
    if (hasInstanceTypeName) {
    stringBuffer.append(TEXT_704);
    stringBuffer.append(genDataType.getEcoreDataType().getInstanceTypeName());
    stringBuffer.append(TEXT_705);
    }
    stringBuffer.append(TEXT_706);
    stringBuffer.append(genModel.getNonNLS());
    if (hasInstanceTypeName) {
    stringBuffer.append(genModel.getNonNLS(2));
    }
    stringBuffer.append(TEXT_707);
    }
    stringBuffer.append(TEXT_708);
    }
    stringBuffer.append(TEXT_709);
    if (genPackage.getSuperGenPackage() == null) {
    stringBuffer.append(TEXT_710);
    stringBuffer.append(genPackage.getSchemaLocation());
    stringBuffer.append(TEXT_711);
    }
    stringBuffer.append(TEXT_712);
    if (!genPackage.isEcorePackage() && !genPackage.getAnnotationSources().isEmpty()) {
    stringBuffer.append(TEXT_713);
    for (String annotationSource : genPackage.getAnnotationSources()) {
    stringBuffer.append(TEXT_714);
    stringBuffer.append(annotationSource);
    stringBuffer.append(TEXT_715);
    stringBuffer.append(genPackage.getAnnotationSourceIdentifier(annotationSource));
    stringBuffer.append(TEXT_716);
    }
    stringBuffer.append(TEXT_717);
    }
    stringBuffer.append(TEXT_718);
    for (String annotationSource : genPackage.getAnnotationSources()) {
    stringBuffer.append(TEXT_719);
    stringBuffer.append(annotationSource);
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genPackage.getAnnotationSourceIdentifier(annotationSource));
    stringBuffer.append(TEXT_721);
    if (annotationSource == null) {
    stringBuffer.append(TEXT_722);
    } else {
    stringBuffer.append(TEXT_723);
    stringBuffer.append(annotationSource);
    stringBuffer.append(TEXT_724);
    stringBuffer.append(genModel.getNonNLS());
    }
    stringBuffer.append(TEXT_725);
    for (EAnnotation eAnnotation : genPackage.getAllAnnotations()) { List<GenPackage.AnnotationReferenceData> annotationReferenceDataList = genPackage.getReferenceData(eAnnotation);
    stringBuffer.append(TEXT_726);
    if (annotationSource == null ? eAnnotation.getSource() == null : annotationSource.equals(eAnnotation.getSource())) {
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genPackage.getAnnotatedModelElementAccessor(eAnnotation));
    stringBuffer.append(TEXT_728);
    for (Iterator<Map.Entry<String, String>> k = eAnnotation.getDetails().iterator(); k.hasNext();) { Map.Entry<String, String> detail = k.next(); String key = Literals.toStringLiteral(detail.getKey(), genModel); String value = Literals.toStringLiteral(detail.getValue(), genModel);
    stringBuffer.append(TEXT_729);
    stringBuffer.append(key);
    stringBuffer.append(TEXT_730);
    stringBuffer.append(value);
    stringBuffer.append(k.hasNext() ? "," : "");
    stringBuffer.append(genModel.getNonNLS(key + value));
    stringBuffer.append(TEXT_731);
    }
    stringBuffer.append(TEXT_732);
    if (annotationReferenceDataList.isEmpty()) {
    stringBuffer.append(TEXT_733);
    } else {
    stringBuffer.append(TEXT_734);
    }
    stringBuffer.append(TEXT_735);
    if (!annotationReferenceDataList.isEmpty()) {
    stringBuffer.append(TEXT_736);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.URI"));
    stringBuffer.append(TEXT_737);
    for (Iterator<GenPackage.AnnotationReferenceData> k = annotationReferenceDataList.iterator(); k.hasNext();) { GenPackage.AnnotationReferenceData annotationReferenceData = k.next();
    stringBuffer.append(TEXT_738);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.URI"));
    stringBuffer.append(TEXT_739);
    if (annotationReferenceData.containingGenPackage != genPackage) {
    stringBuffer.append(annotationReferenceData.containingGenPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_740);
    }
    stringBuffer.append(TEXT_741);
    stringBuffer.append(annotationReferenceData.uriFragment);
    stringBuffer.append(TEXT_742);
    if (k.hasNext()) {
    stringBuffer.append(TEXT_743);
    }
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_744);
    }
    stringBuffer.append(TEXT_745);
    }
    stringBuffer.append(TEXT_746);
    for (EAnnotation nestedEAnnotation : genPackage.getAllNestedAnnotations(eAnnotation)) {String nestedAnnotationSource = nestedEAnnotation.getSource();  int depth = 0; boolean nonContentAnnotation = false; StringBuilder path = new StringBuilder();  for (EObject eContainer = nestedEAnnotation.eContainer(), child = nestedEAnnotation; child != eAnnotation; child = eContainer, eContainer = eContainer.eContainer())  {  boolean nonContentChild = child.eContainmentFeature() != EcorePackage.Literals.EANNOTATION__CONTENTS; if (path.length() != 0) { path.insert(0, ", ");  } path.insert(0, nonContentChild); if (nonContentChild) { nonContentAnnotation = true; } ++depth;  } List<GenPackage.AnnotationReferenceData> nestedAnnotationReferenceDataList = genPackage.getReferenceData(nestedEAnnotation);
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genPackage.getAnnotatedModelElementAccessor(eAnnotation));
    stringBuffer.append(TEXT_748);
    if (nonContentAnnotation && genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF210_VALUE) {
    stringBuffer.append(TEXT_749);
    stringBuffer.append(path.toString());
    stringBuffer.append(TEXT_750);
    } else {
    stringBuffer.append(depth);
    }
    stringBuffer.append(TEXT_751);
    if (nestedAnnotationSource == null) {
    stringBuffer.append(TEXT_752);
    } else {
    stringBuffer.append(TEXT_753);
    stringBuffer.append(nestedAnnotationSource);
    stringBuffer.append(TEXT_754);
    stringBuffer.append(genModel.getNonNLS());
    }
    stringBuffer.append(TEXT_755);
    for (Iterator<Map.Entry<String, String>> l = nestedEAnnotation.getDetails().iterator(); l.hasNext();) { Map.Entry<String, String> detail = l.next(); String key = Literals.toStringLiteral(detail.getKey(), genModel); String value = Literals.toStringLiteral(detail.getValue(), genModel);
    stringBuffer.append(TEXT_756);
    stringBuffer.append(key);
    stringBuffer.append(TEXT_757);
    stringBuffer.append(value);
    stringBuffer.append(l.hasNext() ? "," : "");
    stringBuffer.append(genModel.getNonNLS(key + value));
    stringBuffer.append(TEXT_758);
    }
    stringBuffer.append(TEXT_759);
    if (nestedAnnotationReferenceDataList.isEmpty()) {
    stringBuffer.append(TEXT_760);
    } else {
    stringBuffer.append(TEXT_761);
    }
    stringBuffer.append(TEXT_762);
    if (!nestedAnnotationReferenceDataList.isEmpty()) {
    stringBuffer.append(TEXT_763);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.URI"));
    stringBuffer.append(TEXT_764);
    for (Iterator<GenPackage.AnnotationReferenceData> l = nestedAnnotationReferenceDataList.iterator(); l.hasNext();) { GenPackage.AnnotationReferenceData annotationReferenceData = l.next();
    stringBuffer.append(TEXT_765);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.URI"));
    stringBuffer.append(TEXT_766);
    if (annotationReferenceData.containingGenPackage != genPackage) {
    stringBuffer.append(annotationReferenceData.containingGenPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_767);
    }
    stringBuffer.append(TEXT_768);
    stringBuffer.append(annotationReferenceData.uriFragment);
    stringBuffer.append(TEXT_769);
    if (l.hasNext()) {
    stringBuffer.append(TEXT_770);
    }
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_771);
    }
    stringBuffer.append(TEXT_772);
    }
    stringBuffer.append(TEXT_773);
    }
    stringBuffer.append(TEXT_774);
    }
    stringBuffer.append(TEXT_775);
    }
    stringBuffer.append(TEXT_776);
    }
    } else {
    stringBuffer.append(TEXT_777);
    if (genPackage.isLoadingInitialization()) {
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genModel.getImportedName("java.net.URL"));
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.URI"));
    stringBuffer.append(TEXT_781);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.URI"));
    stringBuffer.append(TEXT_782);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl"));
    stringBuffer.append(TEXT_784);
    stringBuffer.append(genModel.getImportedName("java.io.IOException"));
    stringBuffer.append(TEXT_785);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.WrappedException"));
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    stringBuffer.append(TEXT_787);
    }
    stringBuffer.append(TEXT_788);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_789);
    }
    stringBuffer.append(TEXT_790);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
    stringBuffer.append(TEXT_791);
    ArrayList<GenClass> dynamicGenClasses = new ArrayList<GenClass>(); for (GenClass genClass : genPackage.getGenClasses()) { if (genClass.isDynamic()) { dynamicGenClasses.add(genClass); } }
    stringBuffer.append(TEXT_792);
    if (dynamicGenClasses.isEmpty()) {
    stringBuffer.append(TEXT_793);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_794);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_795);
    } else {
    stringBuffer.append(TEXT_796);
    for (GenClass genClass : dynamicGenClasses) {
    stringBuffer.append(TEXT_797);
    if (genClass.isDynamic()) {
    stringBuffer.append(TEXT_798);
    stringBuffer.append(genPackage.getClassifierID(genClass));
    stringBuffer.append(TEXT_799);
    }
    stringBuffer.append(TEXT_800);
    }
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_803);
    }
    stringBuffer.append(TEXT_804);
    }
    if (needsAddEOperation) {
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_806);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_807);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
    stringBuffer.append(TEXT_808);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_809);
    }
    if (needsAddEParameter) {
    stringBuffer.append(TEXT_810);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EParameter"));
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_812);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
    stringBuffer.append(TEXT_813);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EParameter"));
    stringBuffer.append(TEXT_814);
    }
    }
    if (isInterface && genPackage.isLiteralsInterface()) {
    stringBuffer.append(TEXT_815);
    if (genModel.isOperationReflection()) {
    stringBuffer.append(TEXT_816);
    }
    stringBuffer.append(TEXT_817);
    if (isImplementation) {
    stringBuffer.append(TEXT_818);
    }
    stringBuffer.append(TEXT_819);
    for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
    stringBuffer.append(TEXT_820);
    if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
    stringBuffer.append(TEXT_821);
    if (!genClass.isInterface()) {
    stringBuffer.append(TEXT_822);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_823);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_825);
    } else {
    stringBuffer.append(TEXT_826);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_828);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_829);
    }
    stringBuffer.append(TEXT_830);
    } else if (genClassifier instanceof GenEnum) { GenEnum genEnum = (GenEnum)genClassifier;
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genEnum.getQualifiedName());
    stringBuffer.append(TEXT_832);
    stringBuffer.append(genEnum.getFormattedName());
    stringBuffer.append(TEXT_833);
    stringBuffer.append(genEnum.getQualifiedName());
    stringBuffer.append(TEXT_834);
    } else if (genClassifier instanceof GenDataType) { GenDataType genDataType = (GenDataType)genClassifier;
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genDataType.getFormattedName());
    stringBuffer.append(TEXT_836);
    if (!genDataType.isPrimitiveType() && !genDataType.isArrayType()) {
    stringBuffer.append(TEXT_837);
    stringBuffer.append(genDataType.getRawInstanceClassName());
    stringBuffer.append(TEXT_838);
    }
    stringBuffer.append(TEXT_839);
    }
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genPackage.getQualifiedPackageClassName());
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genClassifier.getClassifierAccessorName());
    stringBuffer.append(TEXT_842);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genClassifier.getImportedMetaType());
    stringBuffer.append(TEXT_843);
    stringBuffer.append(genPackage.getClassifierID(genClassifier));
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genClassifier.getClassifierAccessorName());
    stringBuffer.append(TEXT_845);
    if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
    stringBuffer.append(TEXT_846);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_849);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genFeature.getImportedMetaType());
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genClass.getFeatureID(genFeature));
    stringBuffer.append(TEXT_851);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_852);
    }
    stringBuffer.append(TEXT_853);
    if (genModel.isOperationReflection()) {
    stringBuffer.append(TEXT_854);
    for (GenOperation genOperation : genClass.getGenOperations()) {
    stringBuffer.append(TEXT_855);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_856);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genOperation.getImportedMetaType());
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genClass.getOperationID(genOperation, false));
    stringBuffer.append(TEXT_858);
    stringBuffer.append(genOperation.getOperationAccessorName());
    stringBuffer.append(TEXT_859);
    }
    stringBuffer.append(TEXT_860);
    }
    stringBuffer.append(TEXT_861);
    }
    }
    stringBuffer.append(TEXT_862);
    }
    stringBuffer.append(TEXT_863);
    stringBuffer.append(isInterface ? genPackage.getPackageInterfaceName() : genPackage.getPackageClassName());
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_864);
    return stringBuffer.toString();
  }
}
