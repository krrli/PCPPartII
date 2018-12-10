// Generated from C:/Code/PCPPartII/SW11_Compiler_FromMavenTemplate/src/main/java/ch/hslu/pcp/compiler/a5PostmanV2\a5PostmanV2.g4 by ANTLR 4.7
package ch.hslu.pcp.compiler.a5PostmanV2;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PostmanV2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "WS"
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


	public PostmanV2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "a5PostmanV2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\6"+
		"\16l\n\16\r\16\16\16m\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\3\2\3\5\2\13\f\17\17\"\"\2q\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\3\35\3\2\2\2\5\"\3\2\2\2\7/\3\2\2\2\t9\3\2\2\2\13?\3\2\2"+
		"\2\rE\3\2\2\2\17K\3\2\2\2\21R\3\2\2\2\23Z\3\2\2\2\25^\3\2\2\2\27b\3\2"+
		"\2\2\31f\3\2\2\2\33k\3\2\2\2\35\36\7j\2\2\36\37\7w\2\2\37 \7p\2\2 !\7"+
		"f\2\2!\4\3\2\2\2\"#\7d\2\2#$\7t\2\2$%\7k\2\2%&\7g\2\2&\'\7h\2\2\'(\7v"+
		"\2\2()\7t\2\2)*\7\u00c5\2\2*+\7\u00a6\2\2+,\7i\2\2,-\7g\2\2-.\7t\2\2."+
		"\6\3\2\2\2/\60\7o\2\2\60\61\7k\2\2\61\62\7n\2\2\62\63\7e\2\2\63\64\7j"+
		"\2\2\64\65\7o\2\2\65\66\7c\2\2\66\67\7p\2\2\678\7p\2\28\b\3\2\2\29:\7"+
		"m\2\2:;\7c\2\2;<\7v\2\2<=\7|\2\2=>\7g\2\2>\n\3\2\2\2?@\7d\2\2@A\7t\2\2"+
		"AB\7k\2\2BC\7g\2\2CD\7h\2\2D\f\3\2\2\2EF\7o\2\2FG\7k\2\2GH\7n\2\2HI\7"+
		"e\2\2IJ\7j\2\2J\16\3\2\2\2KL\7d\2\2LM\7g\2\2MN\7k\2\2NO\7u\2\2OP\7u\2"+
		"\2PQ\7v\2\2Q\20\3\2\2\2RS\7n\2\2ST\7k\2\2TU\7g\2\2UV\7h\2\2VW\7g\2\2W"+
		"X\7t\2\2XY\7v\2\2Y\22\3\2\2\2Z[\7f\2\2[\\\7g\2\2\\]\7t\2\2]\24\3\2\2\2"+
		"^_\7f\2\2_`\7g\2\2`a\7p\2\2a\26\3\2\2\2bc\7f\2\2cd\7k\2\2de\7g\2\2e\30"+
		"\3\2\2\2fg\7f\2\2gh\7c\2\2hi\7u\2\2i\32\3\2\2\2jl\t\2\2\2kj\3\2\2\2lm"+
		"\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\b\16\2\2p\34\3\2\2\2\4\2m\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}