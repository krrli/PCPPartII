package ch.hslu.pcp.compiler.a7AdamRieseProlog;

import ch.hslu.pcp.compiler.a0AdamRiese.EvalVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class PrologTranslator {

    /*
     * Program Arguments:
     * "(1+2)*3=X"
     * "(42+(25-3*4))/11=N"
     * "(24+32)/7+3*(17-15)=GA"
     * "34428/38-(1103-197)=UPS"
     */

    public static void main(String[] args) throws IOException {

        for(int i = 0; i < args.length; i++){
            // create a CharStream that reads from args[0]
            ANTLRInputStream input = new ANTLRInputStream(args[i]);
            // create a lexer that feeds off of input CharStream
            PrologLexer lexer = new PrologLexer(input);
            // create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // create a parser that feeds off the tokens buffer
            PrologParser parser = new PrologParser(tokens);
            // begin parsing at start rule - stmt
            ParseTree tree = parser.stmt();
            // create a visitor
            ExtractPrologBaseVisitor eval = new ExtractPrologBaseVisitor();
            // start walking the parse tree - visit
            String res = eval.visit(tree);
            System.out.println(args[i]+ " in Prolog: " + res);
        }

    }
}
