// Generated from PostmanV2.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PostmanV2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, WS=13;
	public static final int
		RULE_satz = 0, RULE_subjekt = 1, RULE_objekt = 2, RULE_praedikat = 3, 
		RULE_substantiv = 4, RULE_verb = 5, RULE_artikel = 6;
	public static final String[] ruleNames = {
		"satz", "subjekt", "objekt", "praedikat", "substantiv", "verb", "artikel"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'hund'", "'brieftr\u00C3\u00A4ger'", "'milchmann'", "'katze'", 
		"'brief'", "'milch'", "'beisst'", "'liefert'", "'der'", "'den'", "'die'", 
		"'das'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "WS"
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
	public String getGrammarFileName() { return "PostmanV2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PostmanV2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SatzContext extends ParserRuleContext {
		public SubjektContext subjekt() {
			return getRuleContext(SubjektContext.class,0);
		}
		public PraedikatContext praedikat() {
			return getRuleContext(PraedikatContext.class,0);
		}
		public ObjektContext objekt() {
			return getRuleContext(ObjektContext.class,0);
		}
		public SatzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_satz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostmanV2Listener ) ((PostmanV2Listener)listener).enterSatz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostmanV2Listener ) ((PostmanV2Listener)listener).exitSatz(this);
		}
	}

	public final SatzContext satz() throws RecognitionException {
		SatzContext _localctx = new SatzContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_satz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			subjekt();
			setState(15);
			praedikat();
			setState(16);
			objekt();
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

	public static class SubjektContext extends ParserRuleContext {
		public ArtikelContext artikel() {
			return getRuleContext(ArtikelContext.class,0);
		}
		public SubstantivContext substantiv() {
			return getRuleContext(SubstantivContext.class,0);
		}
		public SubjektContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subjekt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostmanV2Listener ) ((PostmanV2Listener)listener).enterSubjekt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostmanV2Listener ) ((PostmanV2Listener)listener).exitSubjekt(this);
		}
	}

	public final SubjektContext subjekt() throws RecognitionException {
		SubjektContext _localctx = new SubjektContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_subjekt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			artikel();
			setState(19);
			substantiv();
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

	public static class ObjektContext extends ParserRuleContext {
		public ArtikelContext artikel() {
			return getRuleContext(ArtikelContext.class,0);
		}
		public SubstantivContext substantiv() {
			return getRuleContext(SubstantivContext.class,0);
		}
		public ObjektContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objekt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostmanV2Listener ) ((PostmanV2Listener)listener).enterObjekt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostmanV2Listener ) ((PostmanV2Listener)listener).exitObjekt(this);
		}
	}

	public final ObjektContext objekt() throws RecognitionException {
		ObjektContext _localctx = new ObjektContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_objekt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			artikel();
			setState(22);
			substantiv();
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

	public static class PraedikatContext extends ParserRuleContext {
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public PraedikatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_praedikat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostmanV2Listener ) ((PostmanV2Listener)listener).enterPraedikat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostmanV2Listener ) ((PostmanV2Listener)listener).exitPraedikat(this);
		}
	}

	public final PraedikatContext praedikat() throws RecognitionException {
		PraedikatContext _localctx = new PraedikatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_praedikat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			verb();
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

	public static class SubstantivContext extends ParserRuleContext {
		public SubstantivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substantiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostmanV2Listener ) ((PostmanV2Listener)listener).enterSubstantiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostmanV2Listener ) ((PostmanV2Listener)listener).exitSubstantiv(this);
		}
	}

	public final SubstantivContext substantiv() throws RecognitionException {
		SubstantivContext _localctx = new SubstantivContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_substantiv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class VerbContext extends ParserRuleContext {
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostmanV2Listener ) ((PostmanV2Listener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostmanV2Listener ) ((PostmanV2Listener)listener).exitVerb(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_verb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ArtikelContext extends ParserRuleContext {
		public ArtikelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_artikel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostmanV2Listener ) ((PostmanV2Listener)listener).enterArtikel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostmanV2Listener ) ((PostmanV2Listener)listener).exitArtikel(this);
		}
	}

	public final ArtikelContext artikel() throws RecognitionException {
		ArtikelContext _localctx = new ArtikelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_artikel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17#\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16"+
		"\2\5\3\2\3\b\3\2\t\n\3\2\13\16\2\33\2\20\3\2\2\2\4\24\3\2\2\2\6\27\3\2"+
		"\2\2\b\32\3\2\2\2\n\34\3\2\2\2\f\36\3\2\2\2\16 \3\2\2\2\20\21\5\4\3\2"+
		"\21\22\5\b\5\2\22\23\5\6\4\2\23\3\3\2\2\2\24\25\5\16\b\2\25\26\5\n\6\2"+
		"\26\5\3\2\2\2\27\30\5\16\b\2\30\31\5\n\6\2\31\7\3\2\2\2\32\33\5\f\7\2"+
		"\33\t\3\2\2\2\34\35\t\2\2\2\35\13\3\2\2\2\36\37\t\3\2\2\37\r\3\2\2\2 "+
		"!\t\4\2\2!\17\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}