// Generated from C:/Code/PCPPartII/SW11_Compiler_FromMavenTemplate/src/main/java/ch/hslu/pcp/compiler/a7AdamRieseProlog\Prolog.g4 by ANTLR 4.7
package ch.hslu.pcp.compiler.a7AdamRieseProlog;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PrologParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PrologVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PrologParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PrologParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrologParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(PrologParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrologParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PrologParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrologParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(PrologParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrologParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(PrologParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrologParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(PrologParser.NumberContext ctx);
}