// Generated from C:/Code/PCPPartII/SW11_Compiler_FromMavenTemplate/src/main/java/ch/hslu/pcp/compiler/PostmanV2\PostmanV2.g4 by ANTLR 4.7
package ch.hslu.pcp.compiler.PostmanV2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PostmanV2Parser}.
 */
public interface PostmanV2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PostmanV2Parser#satz}.
	 * @param ctx the parse tree
	 */
	void enterSatz(PostmanV2Parser.SatzContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostmanV2Parser#satz}.
	 * @param ctx the parse tree
	 */
	void exitSatz(PostmanV2Parser.SatzContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostmanV2Parser#subjekt}.
	 * @param ctx the parse tree
	 */
	void enterSubjekt(PostmanV2Parser.SubjektContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostmanV2Parser#subjekt}.
	 * @param ctx the parse tree
	 */
	void exitSubjekt(PostmanV2Parser.SubjektContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostmanV2Parser#objekt}.
	 * @param ctx the parse tree
	 */
	void enterObjekt(PostmanV2Parser.ObjektContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostmanV2Parser#objekt}.
	 * @param ctx the parse tree
	 */
	void exitObjekt(PostmanV2Parser.ObjektContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostmanV2Parser#praedikat}.
	 * @param ctx the parse tree
	 */
	void enterPraedikat(PostmanV2Parser.PraedikatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostmanV2Parser#praedikat}.
	 * @param ctx the parse tree
	 */
	void exitPraedikat(PostmanV2Parser.PraedikatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostmanV2Parser#substantiv}.
	 * @param ctx the parse tree
	 */
	void enterSubstantiv(PostmanV2Parser.SubstantivContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostmanV2Parser#substantiv}.
	 * @param ctx the parse tree
	 */
	void exitSubstantiv(PostmanV2Parser.SubstantivContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostmanV2Parser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(PostmanV2Parser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostmanV2Parser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(PostmanV2Parser.VerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostmanV2Parser#artikel}.
	 * @param ctx the parse tree
	 */
	void enterArtikel(PostmanV2Parser.ArtikelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostmanV2Parser#artikel}.
	 * @param ctx the parse tree
	 */
	void exitArtikel(PostmanV2Parser.ArtikelContext ctx);
}