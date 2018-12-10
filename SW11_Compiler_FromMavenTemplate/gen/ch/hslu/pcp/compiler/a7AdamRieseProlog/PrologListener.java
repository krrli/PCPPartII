// Generated from C:/Code/PCPPartII/SW11_Compiler_FromMavenTemplate/src/main/java/ch/hslu/pcp/compiler/a7AdamRieseProlog\Prolog.g4 by ANTLR 4.7
package ch.hslu.pcp.compiler.a7AdamRieseProlog;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PrologParser}.
 */
public interface PrologListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PrologParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PrologParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrologParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PrologParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrologParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(PrologParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrologParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(PrologParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrologParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PrologParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrologParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PrologParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrologParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PrologParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrologParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PrologParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrologParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PrologParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrologParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PrologParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrologParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(PrologParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrologParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(PrologParser.NumberContext ctx);
}