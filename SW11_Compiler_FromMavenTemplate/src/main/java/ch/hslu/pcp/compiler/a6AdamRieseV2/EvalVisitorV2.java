package ch.hslu.pcp.compiler.a6AdamRieseV2;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ch.hslu.pcp.compiler.a0AdamRiese.FinalAdamRieseBaseVisitor;
import ch.hslu.pcp.compiler.a0AdamRiese.FinalAdamRieseParser;

/**
 *
 * @author zadiehl
 */
public class EvalVisitorV2 extends FinalAdamRieseBaseVisitor<Integer> {

    @Override
    public Integer visitNumber(FinalAdamRieseParser.NumberContext ctx) {
        return Integer.valueOf(ctx.getText());
    }

    @Override
    public Integer visitAddSubOp(FinalAdamRieseParser.AddSubOpContext ctx) {
        int left = visit(ctx.term());
        int right = visit(ctx.expr());
        if (ctx.op.getType() == FinalAdamRieseParser.ADD) {
            return left + right;
        } else {
            return left - right;
        }
    }

    @Override
    public Integer visitMulDivOp(FinalAdamRieseParser.MulDivOpContext ctx) {
        int left = visit(ctx.factor());
        int right = visit(ctx.term());
        if (ctx.op.getType() == FinalAdamRieseParser.MUL) {
            return left * right;
        } else {
            return left / right;
        }
    }

    @Override
    public Integer visitParens(FinalAdamRieseParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitStmt(FinalAdamRieseParser.StmtContext ctx) {
        Integer value = visit(ctx.expr());
        return value;
    }
}
