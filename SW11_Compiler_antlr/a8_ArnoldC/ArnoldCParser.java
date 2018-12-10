// Generated from ArnoldC.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArnoldCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGINMAIN=1, ENDMAIN=2, AT=3, TRUE=4, FALSE=5, PLUSOPERATOR=6, MINUSOPERATOR=7, 
		MULTIPLICATIONOPERATOR=8, DIVISIONOPERATOR=9, EQUALTO=10, GREATERTHAN=11, 
		OR=12, AND=13, PRINT=14, DECLAREINT=15, SETINITIALVALUE=16, ASSIGNVARIABLE=17, 
		SETVALUE=18, ENDASSIGNVARIABLE=19, IF=20, ELSE=21, ENDIF=22, WHILE=23, 
		ENDWHILE=24, IDENTIFIER=25, NUMBER=26, STRING_LITERAL=27, COMMENT=28, 
		WS=29;
	public static final int
		RULE_program = 0, RULE_main_function = 1, RULE_statements = 2, RULE_statement = 3, 
		RULE_print_stmt = 4, RULE_print_sconst_stmt = 5, RULE_print_var_stmt = 6, 
		RULE_var_decl_stmt = 7, RULE_condition_stmt = 8, RULE_while_stmt = 9, 
		RULE_expression = 10, RULE_var_assign_stmt = 11, RULE_operations = 12, 
		RULE_operation = 13, RULE_comment = 14;
	public static final String[] ruleNames = {
		"program", "main_function", "statements", "statement", "print_stmt", "print_sconst_stmt", 
		"print_var_stmt", "var_decl_stmt", "condition_stmt", "while_stmt", "expression", 
		"var_assign_stmt", "operations", "operation", "comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'IT'S SHOWTIME'", "'YOU HAVE BEEEN TERMINATED'", "'@'", "'NO PROBLEMO'", 
		"'I LIED'", "'GET UP'", "'GET DOWN'", "'YOU'RE FIRED'", "'HE HAD TO SPLIT'", 
		"'YOU ARE NOT YOU YOU ARE ME'", "'LET OFF SOME STEAM BENNET'", "'CONSIDER THAT A DIVORCE'", 
		"'KNOCK KNOCK'", "'TALK TO THE HAND'", "'HEY CHRISTMAS TREE'", "'YOU SET US UP'", 
		"'GET TO THE CHOPPER'", "'HERE IS MY INVITATION'", "'ENOUGH TALK'", "'BECAUSE I'M GOING TO SAY PLEASE'", 
		"'BULLSHIT'", "'YOU HAVE NO RESPECT FOR LOGIC'", "'STICK AROUND'", "'CHILL'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGINMAIN", "ENDMAIN", "AT", "TRUE", "FALSE", "PLUSOPERATOR", "MINUSOPERATOR", 
		"MULTIPLICATIONOPERATOR", "DIVISIONOPERATOR", "EQUALTO", "GREATERTHAN", 
		"OR", "AND", "PRINT", "DECLAREINT", "SETINITIALVALUE", "ASSIGNVARIABLE", 
		"SETVALUE", "ENDASSIGNVARIABLE", "IF", "ELSE", "ENDIF", "WHILE", "ENDWHILE", 
		"IDENTIFIER", "NUMBER", "STRING_LITERAL", "COMMENT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ArnoldC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArnoldCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			main_function();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_functionContext extends ParserRuleContext {
		public TerminalNode BEGINMAIN() { return getToken(ArnoldCParser.BEGINMAIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ENDMAIN() { return getToken(ArnoldCParser.ENDMAIN, 0); }
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterMain_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitMain_function(this);
		}
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main_function);
		try {
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(BEGINMAIN);
				setState(33);
				statements();
				setState(34);
				match(ENDMAIN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(BEGINMAIN);
				setState(37);
				match(ENDMAIN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << DECLAREINT) | (1L << ASSIGNVARIABLE) | (1L << IF) | (1L << WHILE) | (1L << COMMENT))) != 0)) {
				{
				{
				setState(40);
				statement();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Var_decl_stmtContext var_decl_stmt() {
			return getRuleContext(Var_decl_stmtContext.class,0);
		}
		public Var_assign_stmtContext var_assign_stmt() {
			return getRuleContext(Var_assign_stmtContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public Condition_stmtContext condition_stmt() {
			return getRuleContext(Condition_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLAREINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				var_decl_stmt();
				}
				break;
			case ASSIGNVARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				var_assign_stmt();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				print_stmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				condition_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				while_stmt();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				comment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_stmtContext extends ParserRuleContext {
		public Print_var_stmtContext print_var_stmt() {
			return getRuleContext(Print_var_stmtContext.class,0);
		}
		public Print_sconst_stmtContext print_sconst_stmt() {
			return getRuleContext(Print_sconst_stmtContext.class,0);
		}
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitPrint_stmt(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print_stmt);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				print_var_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				print_sconst_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_sconst_stmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ArnoldCParser.PRINT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ArnoldCParser.STRING_LITERAL, 0); }
		public Print_sconst_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_sconst_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterPrint_sconst_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitPrint_sconst_stmt(this);
		}
	}

	public final Print_sconst_stmtContext print_sconst_stmt() throws RecognitionException {
		Print_sconst_stmtContext _localctx = new Print_sconst_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print_sconst_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(PRINT);
			setState(59);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_var_stmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ArnoldCParser.PRINT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArnoldCParser.IDENTIFIER, 0); }
		public Print_var_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_var_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterPrint_var_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitPrint_var_stmt(this);
		}
	}

	public final Print_var_stmtContext print_var_stmt() throws RecognitionException {
		Print_var_stmtContext _localctx = new Print_var_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print_var_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(PRINT);
			setState(62);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_decl_stmtContext extends ParserRuleContext {
		public TerminalNode DECLAREINT() { return getToken(ArnoldCParser.DECLAREINT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArnoldCParser.IDENTIFIER, 0); }
		public TerminalNode SETINITIALVALUE() { return getToken(ArnoldCParser.SETINITIALVALUE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Var_decl_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterVar_decl_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitVar_decl_stmt(this);
		}
	}

	public final Var_decl_stmtContext var_decl_stmt() throws RecognitionException {
		Var_decl_stmtContext _localctx = new Var_decl_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_decl_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(DECLAREINT);
			setState(65);
			match(IDENTIFIER);
			setState(66);
			match(SETINITIALVALUE);
			setState(67);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_stmtContext extends ParserRuleContext {
		public Condition_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_stmt; }
	 
		public Condition_stmtContext() { }
		public void copyFrom(Condition_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfelseendifContext extends Condition_stmtContext {
		public TerminalNode IF() { return getToken(ArnoldCParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ArnoldCParser.ELSE, 0); }
		public TerminalNode ENDIF() { return getToken(ArnoldCParser.ENDIF, 0); }
		public IfelseendifContext(Condition_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterIfelseendif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitIfelseendif(this);
		}
	}
	public static class IfendidContext extends Condition_stmtContext {
		public TerminalNode IF() { return getToken(ArnoldCParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(ArnoldCParser.ENDIF, 0); }
		public IfendidContext(Condition_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterIfendid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitIfendid(this);
		}
	}

	public final Condition_stmtContext condition_stmt() throws RecognitionException {
		Condition_stmtContext _localctx = new Condition_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition_stmt);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new IfelseendifContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(IF);
				setState(70);
				expression();
				setState(71);
				statements();
				setState(72);
				match(ELSE);
				setState(73);
				statements();
				setState(74);
				match(ENDIF);
				}
				break;
			case 2:
				_localctx = new IfendidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(IF);
				setState(77);
				expression();
				setState(78);
				statements();
				setState(79);
				match(ENDIF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ArnoldCParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ENDWHILE() { return getToken(ArnoldCParser.ENDWHILE, 0); }
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(WHILE);
			setState(84);
			expression();
			setState(85);
			statements();
			setState(86);
			match(ENDWHILE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarexprContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(ArnoldCParser.IDENTIFIER, 0); }
		public VarexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterVarexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitVarexpr(this);
		}
	}
	public static class TrueexprContext extends ExpressionContext {
		public TerminalNode AT() { return getToken(ArnoldCParser.AT, 0); }
		public TerminalNode TRUE() { return getToken(ArnoldCParser.TRUE, 0); }
		public TrueexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterTrueexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitTrueexpr(this);
		}
	}
	public static class NumberexprContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(ArnoldCParser.NUMBER, 0); }
		public NumberexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterNumberexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitNumberexpr(this);
		}
	}
	public static class FalseexprContext extends ExpressionContext {
		public TerminalNode AT() { return getToken(ArnoldCParser.AT, 0); }
		public TerminalNode FALSE() { return getToken(ArnoldCParser.FALSE, 0); }
		public FalseexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterFalseexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitFalseexpr(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new VarexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new NumberexprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(NUMBER);
				}
				break;
			case 3:
				_localctx = new TrueexprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(AT);
				setState(91);
				match(TRUE);
				}
				break;
			case 4:
				_localctx = new FalseexprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				match(AT);
				setState(93);
				match(FALSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_assign_stmtContext extends ParserRuleContext {
		public TerminalNode ASSIGNVARIABLE() { return getToken(ArnoldCParser.ASSIGNVARIABLE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArnoldCParser.IDENTIFIER, 0); }
		public TerminalNode SETVALUE() { return getToken(ArnoldCParser.SETVALUE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public TerminalNode ENDASSIGNVARIABLE() { return getToken(ArnoldCParser.ENDASSIGNVARIABLE, 0); }
		public Var_assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterVar_assign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitVar_assign_stmt(this);
		}
	}

	public final Var_assign_stmtContext var_assign_stmt() throws RecognitionException {
		Var_assign_stmtContext _localctx = new Var_assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(ASSIGNVARIABLE);
			setState(97);
			match(IDENTIFIER);
			setState(98);
			match(SETVALUE);
			setState(99);
			expression();
			setState(100);
			operations(0);
			setState(101);
			match(ENDASSIGNVARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationsContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitOperations(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		return operations(0);
	}

	private OperationsContext operations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperationsContext _localctx = new OperationsContext(_ctx, _parentState);
		OperationsContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_operations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(104);
			operation();
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operations);
					setState(106);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(107);
					operation();
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	 
		public OperationContext() { }
		public void copyFrom(OperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OropContext extends OperationContext {
		public TerminalNode OR() { return getToken(ArnoldCParser.OR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OropContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterOrop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitOrop(this);
		}
	}
	public static class EqualopContext extends OperationContext {
		public TerminalNode EQUALTO() { return getToken(ArnoldCParser.EQUALTO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EqualopContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterEqualop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitEqualop(this);
		}
	}
	public static class AndopContext extends OperationContext {
		public TerminalNode AND() { return getToken(ArnoldCParser.AND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AndopContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterAndop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitAndop(this);
		}
	}
	public static class GreateropContext extends OperationContext {
		public TerminalNode GREATERTHAN() { return getToken(ArnoldCParser.GREATERTHAN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GreateropContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterGreaterop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitGreaterop(this);
		}
	}
	public static class MinusopContext extends OperationContext {
		public TerminalNode MINUSOPERATOR() { return getToken(ArnoldCParser.MINUSOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MinusopContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterMinusop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitMinusop(this);
		}
	}
	public static class PlusopContext extends OperationContext {
		public TerminalNode PLUSOPERATOR() { return getToken(ArnoldCParser.PLUSOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PlusopContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterPlusop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitPlusop(this);
		}
	}
	public static class MultiplicationopContext extends OperationContext {
		public TerminalNode MULTIPLICATIONOPERATOR() { return getToken(ArnoldCParser.MULTIPLICATIONOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MultiplicationopContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterMultiplicationop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitMultiplicationop(this);
		}
	}
	public static class DivisionopContext extends OperationContext {
		public TerminalNode DIVISIONOPERATOR() { return getToken(ArnoldCParser.DIVISIONOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DivisionopContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterDivisionop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitDivisionop(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operation);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUSOPERATOR:
				_localctx = new PlusopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(PLUSOPERATOR);
				setState(114);
				expression();
				}
				break;
			case MINUSOPERATOR:
				_localctx = new MinusopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(MINUSOPERATOR);
				setState(116);
				expression();
				}
				break;
			case MULTIPLICATIONOPERATOR:
				_localctx = new MultiplicationopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(MULTIPLICATIONOPERATOR);
				setState(118);
				expression();
				}
				break;
			case DIVISIONOPERATOR:
				_localctx = new DivisionopContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				match(DIVISIONOPERATOR);
				setState(120);
				expression();
				}
				break;
			case EQUALTO:
				_localctx = new EqualopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				match(EQUALTO);
				setState(122);
				expression();
				}
				break;
			case GREATERTHAN:
				_localctx = new GreateropContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				match(GREATERTHAN);
				setState(124);
				expression();
				}
				break;
			case OR:
				_localctx = new OropContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				match(OR);
				setState(126);
				expression();
				}
				break;
			case AND:
				_localctx = new AndopContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(127);
				match(AND);
				setState(128);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(ArnoldCParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return operations_sempred((OperationsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operations_sempred(OperationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0088\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3)\n\3\3\4\7\4,\n\4\f\4\16\4/\13\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\67\n\5\3\6\3\6\5\6;\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nT\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\fa\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16o\n\16\f\16\16\16r\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0084\n\17\3\20\3\20\3\20\2\3\32\21\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36\2\2\2\u008c\2 \3\2\2\2\4(\3\2\2\2\6-\3\2\2\2\b\66\3\2"+
		"\2\2\n:\3\2\2\2\f<\3\2\2\2\16?\3\2\2\2\20B\3\2\2\2\22S\3\2\2\2\24U\3\2"+
		"\2\2\26`\3\2\2\2\30b\3\2\2\2\32i\3\2\2\2\34\u0083\3\2\2\2\36\u0085\3\2"+
		"\2\2 !\5\4\3\2!\3\3\2\2\2\"#\7\3\2\2#$\5\6\4\2$%\7\4\2\2%)\3\2\2\2&\'"+
		"\7\3\2\2\')\7\4\2\2(\"\3\2\2\2(&\3\2\2\2)\5\3\2\2\2*,\5\b\5\2+*\3\2\2"+
		"\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\7\3\2\2\2/-\3\2\2\2\60\67\5\20\t\2\61"+
		"\67\5\30\r\2\62\67\5\n\6\2\63\67\5\22\n\2\64\67\5\24\13\2\65\67\5\36\20"+
		"\2\66\60\3\2\2\2\66\61\3\2\2\2\66\62\3\2\2\2\66\63\3\2\2\2\66\64\3\2\2"+
		"\2\66\65\3\2\2\2\67\t\3\2\2\28;\5\16\b\29;\5\f\7\2:8\3\2\2\2:9\3\2\2\2"+
		";\13\3\2\2\2<=\7\20\2\2=>\7\35\2\2>\r\3\2\2\2?@\7\20\2\2@A\7\33\2\2A\17"+
		"\3\2\2\2BC\7\21\2\2CD\7\33\2\2DE\7\22\2\2EF\5\26\f\2F\21\3\2\2\2GH\7\26"+
		"\2\2HI\5\26\f\2IJ\5\6\4\2JK\7\27\2\2KL\5\6\4\2LM\7\30\2\2MT\3\2\2\2NO"+
		"\7\26\2\2OP\5\26\f\2PQ\5\6\4\2QR\7\30\2\2RT\3\2\2\2SG\3\2\2\2SN\3\2\2"+
		"\2T\23\3\2\2\2UV\7\31\2\2VW\5\26\f\2WX\5\6\4\2XY\7\32\2\2Y\25\3\2\2\2"+
		"Za\7\33\2\2[a\7\34\2\2\\]\7\5\2\2]a\7\6\2\2^_\7\5\2\2_a\7\7\2\2`Z\3\2"+
		"\2\2`[\3\2\2\2`\\\3\2\2\2`^\3\2\2\2a\27\3\2\2\2bc\7\23\2\2cd\7\33\2\2"+
		"de\7\24\2\2ef\5\26\f\2fg\5\32\16\2gh\7\25\2\2h\31\3\2\2\2ij\b\16\1\2j"+
		"k\5\34\17\2kp\3\2\2\2lm\f\3\2\2mo\5\34\17\2nl\3\2\2\2or\3\2\2\2pn\3\2"+
		"\2\2pq\3\2\2\2q\33\3\2\2\2rp\3\2\2\2st\7\b\2\2t\u0084\5\26\f\2uv\7\t\2"+
		"\2v\u0084\5\26\f\2wx\7\n\2\2x\u0084\5\26\f\2yz\7\13\2\2z\u0084\5\26\f"+
		"\2{|\7\f\2\2|\u0084\5\26\f\2}~\7\r\2\2~\u0084\5\26\f\2\177\u0080\7\16"+
		"\2\2\u0080\u0084\5\26\f\2\u0081\u0082\7\17\2\2\u0082\u0084\5\26\f\2\u0083"+
		"s\3\2\2\2\u0083u\3\2\2\2\u0083w\3\2\2\2\u0083y\3\2\2\2\u0083{\3\2\2\2"+
		"\u0083}\3\2\2\2\u0083\177\3\2\2\2\u0083\u0081\3\2\2\2\u0084\35\3\2\2\2"+
		"\u0085\u0086\7\36\2\2\u0086\37\3\2\2\2\n(-\66:S`p\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}