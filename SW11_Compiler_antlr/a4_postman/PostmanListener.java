// Generated from Postman.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PostmanParser}.
 */
public interface PostmanListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PostmanParser#satz}.
	 * @param ctx the parse tree
	 */
	void enterSatz(PostmanParser.SatzContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostmanParser#satz}.
	 * @param ctx the parse tree
	 */
	void exitSatz(PostmanParser.SatzContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubjectArtSubst}
	 * labeled alternative in {@link PostmanParser#subjekt}.
	 * @param ctx the parse tree
	 */
	void enterSubjectArtSubst(PostmanParser.SubjectArtSubstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubjectArtSubst}
	 * labeled alternative in {@link PostmanParser#subjekt}.
	 * @param ctx the parse tree
	 */
	void exitSubjectArtSubst(PostmanParser.SubjectArtSubstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectArtSubst}
	 * labeled alternative in {@link PostmanParser#objekt}.
	 * @param ctx the parse tree
	 */
	void enterObjectArtSubst(PostmanParser.ObjectArtSubstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectArtSubst}
	 * labeled alternative in {@link PostmanParser#objekt}.
	 * @param ctx the parse tree
	 */
	void exitObjectArtSubst(PostmanParser.ObjectArtSubstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostmanParser#praedikat}.
	 * @param ctx the parse tree
	 */
	void enterPraedikat(PostmanParser.PraedikatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostmanParser#praedikat}.
	 * @param ctx the parse tree
	 */
	void exitPraedikat(PostmanParser.PraedikatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostmanParser#substantiv}.
	 * @param ctx the parse tree
	 */
	void enterSubstantiv(PostmanParser.SubstantivContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostmanParser#substantiv}.
	 * @param ctx the parse tree
	 */
	void exitSubstantiv(PostmanParser.SubstantivContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostmanParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(PostmanParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostmanParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(PostmanParser.VerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostmanParser#artikel}.
	 * @param ctx the parse tree
	 */
	void enterArtikel(PostmanParser.ArtikelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostmanParser#artikel}.
	 * @param ctx the parse tree
	 */
	void exitArtikel(PostmanParser.ArtikelContext ctx);
}