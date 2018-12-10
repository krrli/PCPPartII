// Generated from C:/Code/PCPPartII/SW11_Compiler_FromMavenTemplate/src/main/java/ch/hslu/pcp/compiler/a4Postman\a4Postman.g4 by ANTLR 4.7
package ch.hslu.pcp.compiler.a4Postman;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PostmanLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, WS=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'hund'", "'brieftr\u00C3\u00A4ger'", "'beisst'", "'der'", "'den'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "WS"
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


	public PostmanLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "a4Postman.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b\67\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\6\7\62\n\7\r\7\16\7\63\3\7\3\7\2"+
		"\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\3\5\2\13\f\17\17\"\"\2\67\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\17\3"+
		"\2\2\2\5\24\3\2\2\2\7!\3\2\2\2\t(\3\2\2\2\13,\3\2\2\2\r\61\3\2\2\2\17"+
		"\20\7j\2\2\20\21\7w\2\2\21\22\7p\2\2\22\23\7f\2\2\23\4\3\2\2\2\24\25\7"+
		"d\2\2\25\26\7t\2\2\26\27\7k\2\2\27\30\7g\2\2\30\31\7h\2\2\31\32\7v\2\2"+
		"\32\33\7t\2\2\33\34\7\u00c5\2\2\34\35\7\u00a6\2\2\35\36\7i\2\2\36\37\7"+
		"g\2\2\37 \7t\2\2 \6\3\2\2\2!\"\7d\2\2\"#\7g\2\2#$\7k\2\2$%\7u\2\2%&\7"+
		"u\2\2&\'\7v\2\2\'\b\3\2\2\2()\7f\2\2)*\7g\2\2*+\7t\2\2+\n\3\2\2\2,-\7"+
		"f\2\2-.\7g\2\2./\7p\2\2/\f\3\2\2\2\60\62\t\2\2\2\61\60\3\2\2\2\62\63\3"+
		"\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\b\7\2\2\66\16\3"+
		"\2\2\2\4\2\63\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}