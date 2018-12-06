// Generated from C:/Code/PCPPartII/SW11_Compiler_FromMavenTemplate/src/main/compiler/AdamRiese\FinalAdamRiese.g4 by ANTLR 4.7
package ch.hslu.pcp.compiler.AdamRiese;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FinalAdamRieseParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FinalAdamRieseVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FinalAdamRieseParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(FinalAdamRieseParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermOnly}
	 * labeled alternative in {@link FinalAdamRieseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermOnly(FinalAdamRieseParser.TermOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubOp}
	 * labeled alternative in {@link FinalAdamRieseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubOp(FinalAdamRieseParser.AddSubOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FactorOnly}
	 * labeled alternative in {@link FinalAdamRieseParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorOnly(FinalAdamRieseParser.FactorOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivOp}
	 * labeled alternative in {@link FinalAdamRieseParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivOp(FinalAdamRieseParser.MulDivOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberOnly}
	 * labeled alternative in {@link FinalAdamRieseParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberOnly(FinalAdamRieseParser.NumberOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link FinalAdamRieseParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(FinalAdamRieseParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link FinalAdamRieseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(FinalAdamRieseParser.NumberContext ctx);
}