// Generated from ArnoldC.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArnoldCLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BEGINMAIN", "ENDMAIN", "AT", "TRUE", "FALSE", "PLUSOPERATOR", "MINUSOPERATOR", 
		"MULTIPLICATIONOPERATOR", "DIVISIONOPERATOR", "EQUALTO", "GREATERTHAN", 
		"OR", "AND", "PRINT", "DECLAREINT", "SETINITIALVALUE", "ASSIGNVARIABLE", 
		"SETVALUE", "ENDASSIGNVARIABLE", "IF", "ELSE", "ENDIF", "WHILE", "ENDWHILE", 
		"IDENTIFIER", "NUMBER", "STRING_LITERAL", "COMMENT", "WS", "DIGIT", "SHORT_STRING", 
		"LONG_STRING", "LONG_STRING_ITEM", "LONG_STRING_CHAR", "STRING_ESCAPE_SEQ"
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


	public ArnoldCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ArnoldC.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u022d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\6"+
		"\32\u01cf\n\32\r\32\16\32\u01d0\3\33\6\33\u01d4\n\33\r\33\16\33\u01d5"+
		"\3\34\3\34\5\34\u01da\n\34\3\35\3\35\3\35\3\35\3\35\7\35\u01e1\n\35\f"+
		"\35\16\35\u01e4\13\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\6\36\u01ed\n"+
		"\36\r\36\16\36\u01ee\3\36\3\36\3\37\3\37\3 \3 \3 \7 \u01f8\n \f \16 \u01fb"+
		"\13 \3 \3 \3 \3 \7 \u0201\n \f \16 \u0204\13 \3 \5 \u0207\n \3!\3!\3!"+
		"\3!\3!\7!\u020e\n!\f!\16!\u0211\13!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u021b\n"+
		"!\f!\16!\u021e\13!\3!\3!\3!\5!\u0223\n!\3\"\3\"\5\"\u0227\n\"\3#\3#\3"+
		"$\3$\3$\5\u01e2\u020f\u021c\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37=\2?\2A\2C\2E\2G\2\3\2\7\4\2C\\c|\5\2\13"+
		"\f\17\17\"\"\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\3\2^^\2\u0234\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3"+
		"I\3\2\2\2\5W\3\2\2\2\7q\3\2\2\2\ts\3\2\2\2\13\177\3\2\2\2\r\u0086\3\2"+
		"\2\2\17\u008d\3\2\2\2\21\u0096\3\2\2\2\23\u00a3\3\2\2\2\25\u00b3\3\2\2"+
		"\2\27\u00ce\3\2\2\2\31\u00e8\3\2\2\2\33\u0100\3\2\2\2\35\u010c\3\2\2\2"+
		"\37\u011d\3\2\2\2!\u0130\3\2\2\2#\u013e\3\2\2\2%\u0151\3\2\2\2\'\u0167"+
		"\3\2\2\2)\u0173\3\2\2\2+\u0193\3\2\2\2-\u019c\3\2\2\2/\u01ba\3\2\2\2\61"+
		"\u01c7\3\2\2\2\63\u01ce\3\2\2\2\65\u01d3\3\2\2\2\67\u01d9\3\2\2\29\u01db"+
		"\3\2\2\2;\u01ec\3\2\2\2=\u01f2\3\2\2\2?\u0206\3\2\2\2A\u0222\3\2\2\2C"+
		"\u0226\3\2\2\2E\u0228\3\2\2\2G\u022a\3\2\2\2IJ\7K\2\2JK\7V\2\2KL\7)\2"+
		"\2LM\7U\2\2MN\7\"\2\2NO\7U\2\2OP\7J\2\2PQ\7Q\2\2QR\7Y\2\2RS\7V\2\2ST\7"+
		"K\2\2TU\7O\2\2UV\7G\2\2V\4\3\2\2\2WX\7[\2\2XY\7Q\2\2YZ\7W\2\2Z[\7\"\2"+
		"\2[\\\7J\2\2\\]\7C\2\2]^\7X\2\2^_\7G\2\2_`\7\"\2\2`a\7D\2\2ab\7G\2\2b"+
		"c\7G\2\2cd\7G\2\2de\7P\2\2ef\7\"\2\2fg\7V\2\2gh\7G\2\2hi\7T\2\2ij\7O\2"+
		"\2jk\7K\2\2kl\7P\2\2lm\7C\2\2mn\7V\2\2no\7G\2\2op\7F\2\2p\6\3\2\2\2qr"+
		"\7B\2\2r\b\3\2\2\2st\7P\2\2tu\7Q\2\2uv\7\"\2\2vw\7R\2\2wx\7T\2\2xy\7Q"+
		"\2\2yz\7D\2\2z{\7N\2\2{|\7G\2\2|}\7O\2\2}~\7Q\2\2~\n\3\2\2\2\177\u0080"+
		"\7K\2\2\u0080\u0081\7\"\2\2\u0081\u0082\7N\2\2\u0082\u0083\7K\2\2\u0083"+
		"\u0084\7G\2\2\u0084\u0085\7F\2\2\u0085\f\3\2\2\2\u0086\u0087\7I\2\2\u0087"+
		"\u0088\7G\2\2\u0088\u0089\7V\2\2\u0089\u008a\7\"\2\2\u008a\u008b\7W\2"+
		"\2\u008b\u008c\7R\2\2\u008c\16\3\2\2\2\u008d\u008e\7I\2\2\u008e\u008f"+
		"\7G\2\2\u008f\u0090\7V\2\2\u0090\u0091\7\"\2\2\u0091\u0092\7F\2\2\u0092"+
		"\u0093\7Q\2\2\u0093\u0094\7Y\2\2\u0094\u0095\7P\2\2\u0095\20\3\2\2\2\u0096"+
		"\u0097\7[\2\2\u0097\u0098\7Q\2\2\u0098\u0099\7W\2\2\u0099\u009a\7)\2\2"+
		"\u009a\u009b\7T\2\2\u009b\u009c\7G\2\2\u009c\u009d\7\"\2\2\u009d\u009e"+
		"\7H\2\2\u009e\u009f\7K\2\2\u009f\u00a0\7T\2\2\u00a0\u00a1\7G\2\2\u00a1"+
		"\u00a2\7F\2\2\u00a2\22\3\2\2\2\u00a3\u00a4\7J\2\2\u00a4\u00a5\7G\2\2\u00a5"+
		"\u00a6\7\"\2\2\u00a6\u00a7\7J\2\2\u00a7\u00a8\7C\2\2\u00a8\u00a9\7F\2"+
		"\2\u00a9\u00aa\7\"\2\2\u00aa\u00ab\7V\2\2\u00ab\u00ac\7Q\2\2\u00ac\u00ad"+
		"\7\"\2\2\u00ad\u00ae\7U\2\2\u00ae\u00af\7R\2\2\u00af\u00b0\7N\2\2\u00b0"+
		"\u00b1\7K\2\2\u00b1\u00b2\7V\2\2\u00b2\24\3\2\2\2\u00b3\u00b4\7[\2\2\u00b4"+
		"\u00b5\7Q\2\2\u00b5\u00b6\7W\2\2\u00b6\u00b7\7\"\2\2\u00b7\u00b8\7C\2"+
		"\2\u00b8\u00b9\7T\2\2\u00b9\u00ba\7G\2\2\u00ba\u00bb\7\"\2\2\u00bb\u00bc"+
		"\7P\2\2\u00bc\u00bd\7Q\2\2\u00bd\u00be\7V\2\2\u00be\u00bf\7\"\2\2\u00bf"+
		"\u00c0\7[\2\2\u00c0\u00c1\7Q\2\2\u00c1\u00c2\7W\2\2\u00c2\u00c3\7\"\2"+
		"\2\u00c3\u00c4\7[\2\2\u00c4\u00c5\7Q\2\2\u00c5\u00c6\7W\2\2\u00c6\u00c7"+
		"\7\"\2\2\u00c7\u00c8\7C\2\2\u00c8\u00c9\7T\2\2\u00c9\u00ca\7G\2\2\u00ca"+
		"\u00cb\7\"\2\2\u00cb\u00cc\7O\2\2\u00cc\u00cd\7G\2\2\u00cd\26\3\2\2\2"+
		"\u00ce\u00cf\7N\2\2\u00cf\u00d0\7G\2\2\u00d0\u00d1\7V\2\2\u00d1\u00d2"+
		"\7\"\2\2\u00d2\u00d3\7Q\2\2\u00d3\u00d4\7H\2\2\u00d4\u00d5\7H\2\2\u00d5"+
		"\u00d6\7\"\2\2\u00d6\u00d7\7U\2\2\u00d7\u00d8\7Q\2\2\u00d8\u00d9\7O\2"+
		"\2\u00d9\u00da\7G\2\2\u00da\u00db\7\"\2\2\u00db\u00dc\7U\2\2\u00dc\u00dd"+
		"\7V\2\2\u00dd\u00de\7G\2\2\u00de\u00df\7C\2\2\u00df\u00e0\7O\2\2\u00e0"+
		"\u00e1\7\"\2\2\u00e1\u00e2\7D\2\2\u00e2\u00e3\7G\2\2\u00e3\u00e4\7P\2"+
		"\2\u00e4\u00e5\7P\2\2\u00e5\u00e6\7G\2\2\u00e6\u00e7\7V\2\2\u00e7\30\3"+
		"\2\2\2\u00e8\u00e9\7E\2\2\u00e9\u00ea\7Q\2\2\u00ea\u00eb\7P\2\2\u00eb"+
		"\u00ec\7U\2\2\u00ec\u00ed\7K\2\2\u00ed\u00ee\7F\2\2\u00ee\u00ef\7G\2\2"+
		"\u00ef\u00f0\7T\2\2\u00f0\u00f1\7\"\2\2\u00f1\u00f2\7V\2\2\u00f2\u00f3"+
		"\7J\2\2\u00f3\u00f4\7C\2\2\u00f4\u00f5\7V\2\2\u00f5\u00f6\7\"\2\2\u00f6"+
		"\u00f7\7C\2\2\u00f7\u00f8\7\"\2\2\u00f8\u00f9\7F\2\2\u00f9\u00fa\7K\2"+
		"\2\u00fa\u00fb\7X\2\2\u00fb\u00fc\7Q\2\2\u00fc\u00fd\7T\2\2\u00fd\u00fe"+
		"\7E\2\2\u00fe\u00ff\7G\2\2\u00ff\32\3\2\2\2\u0100\u0101\7M\2\2\u0101\u0102"+
		"\7P\2\2\u0102\u0103\7Q\2\2\u0103\u0104\7E\2\2\u0104\u0105\7M\2\2\u0105"+
		"\u0106\7\"\2\2\u0106\u0107\7M\2\2\u0107\u0108\7P\2\2\u0108\u0109\7Q\2"+
		"\2\u0109\u010a\7E\2\2\u010a\u010b\7M\2\2\u010b\34\3\2\2\2\u010c\u010d"+
		"\7V\2\2\u010d\u010e\7C\2\2\u010e\u010f\7N\2\2\u010f\u0110\7M\2\2\u0110"+
		"\u0111\7\"\2\2\u0111\u0112\7V\2\2\u0112\u0113\7Q\2\2\u0113\u0114\7\"\2"+
		"\2\u0114\u0115\7V\2\2\u0115\u0116\7J\2\2\u0116\u0117\7G\2\2\u0117\u0118"+
		"\7\"\2\2\u0118\u0119\7J\2\2\u0119\u011a\7C\2\2\u011a\u011b\7P\2\2\u011b"+
		"\u011c\7F\2\2\u011c\36\3\2\2\2\u011d\u011e\7J\2\2\u011e\u011f\7G\2\2\u011f"+
		"\u0120\7[\2\2\u0120\u0121\7\"\2\2\u0121\u0122\7E\2\2\u0122\u0123\7J\2"+
		"\2\u0123\u0124\7T\2\2\u0124\u0125\7K\2\2\u0125\u0126\7U\2\2\u0126\u0127"+
		"\7V\2\2\u0127\u0128\7O\2\2\u0128\u0129\7C\2\2\u0129\u012a\7U\2\2\u012a"+
		"\u012b\7\"\2\2\u012b\u012c\7V\2\2\u012c\u012d\7T\2\2\u012d\u012e\7G\2"+
		"\2\u012e\u012f\7G\2\2\u012f \3\2\2\2\u0130\u0131\7[\2\2\u0131\u0132\7"+
		"Q\2\2\u0132\u0133\7W\2\2\u0133\u0134\7\"\2\2\u0134\u0135\7U\2\2\u0135"+
		"\u0136\7G\2\2\u0136\u0137\7V\2\2\u0137\u0138\7\"\2\2\u0138\u0139\7W\2"+
		"\2\u0139\u013a\7U\2\2\u013a\u013b\7\"\2\2\u013b\u013c\7W\2\2\u013c\u013d"+
		"\7R\2\2\u013d\"\3\2\2\2\u013e\u013f\7I\2\2\u013f\u0140\7G\2\2\u0140\u0141"+
		"\7V\2\2\u0141\u0142\7\"\2\2\u0142\u0143\7V\2\2\u0143\u0144\7Q\2\2\u0144"+
		"\u0145\7\"\2\2\u0145\u0146\7V\2\2\u0146\u0147\7J\2\2\u0147\u0148\7G\2"+
		"\2\u0148\u0149\7\"\2\2\u0149\u014a\7E\2\2\u014a\u014b\7J\2\2\u014b\u014c"+
		"\7Q\2\2\u014c\u014d\7R\2\2\u014d\u014e\7R\2\2\u014e\u014f\7G\2\2\u014f"+
		"\u0150\7T\2\2\u0150$\3\2\2\2\u0151\u0152\7J\2\2\u0152\u0153\7G\2\2\u0153"+
		"\u0154\7T\2\2\u0154\u0155\7G\2\2\u0155\u0156\7\"\2\2\u0156\u0157\7K\2"+
		"\2\u0157\u0158\7U\2\2\u0158\u0159\7\"\2\2\u0159\u015a\7O\2\2\u015a\u015b"+
		"\7[\2\2\u015b\u015c\7\"\2\2\u015c\u015d\7K\2\2\u015d\u015e\7P\2\2\u015e"+
		"\u015f\7X\2\2\u015f\u0160\7K\2\2\u0160\u0161\7V\2\2\u0161\u0162\7C\2\2"+
		"\u0162\u0163\7V\2\2\u0163\u0164\7K\2\2\u0164\u0165\7Q\2\2\u0165\u0166"+
		"\7P\2\2\u0166&\3\2\2\2\u0167\u0168\7G\2\2\u0168\u0169\7P\2\2\u0169\u016a"+
		"\7Q\2\2\u016a\u016b\7W\2\2\u016b\u016c\7I\2\2\u016c\u016d\7J\2\2\u016d"+
		"\u016e\7\"\2\2\u016e\u016f\7V\2\2\u016f\u0170\7C\2\2\u0170\u0171\7N\2"+
		"\2\u0171\u0172\7M\2\2\u0172(\3\2\2\2\u0173\u0174\7D\2\2\u0174\u0175\7"+
		"G\2\2\u0175\u0176\7E\2\2\u0176\u0177\7C\2\2\u0177\u0178\7W\2\2\u0178\u0179"+
		"\7U\2\2\u0179\u017a\7G\2\2\u017a\u017b\7\"\2\2\u017b\u017c\7K\2\2\u017c"+
		"\u017d\7)\2\2\u017d\u017e\7O\2\2\u017e\u017f\7\"\2\2\u017f\u0180\7I\2"+
		"\2\u0180\u0181\7Q\2\2\u0181\u0182\7K\2\2\u0182\u0183\7P\2\2\u0183\u0184"+
		"\7I\2\2\u0184\u0185\7\"\2\2\u0185\u0186\7V\2\2\u0186\u0187\7Q\2\2\u0187"+
		"\u0188\7\"\2\2\u0188\u0189\7U\2\2\u0189\u018a\7C\2\2\u018a\u018b\7[\2"+
		"\2\u018b\u018c\7\"\2\2\u018c\u018d\7R\2\2\u018d\u018e\7N\2\2\u018e\u018f"+
		"\7G\2\2\u018f\u0190\7C\2\2\u0190\u0191\7U\2\2\u0191\u0192\7G\2\2\u0192"+
		"*\3\2\2\2\u0193\u0194\7D\2\2\u0194\u0195\7W\2\2\u0195\u0196\7N\2\2\u0196"+
		"\u0197\7N\2\2\u0197\u0198\7U\2\2\u0198\u0199\7J\2\2\u0199\u019a\7K\2\2"+
		"\u019a\u019b\7V\2\2\u019b,\3\2\2\2\u019c\u019d\7[\2\2\u019d\u019e\7Q\2"+
		"\2\u019e\u019f\7W\2\2\u019f\u01a0\7\"\2\2\u01a0\u01a1\7J\2\2\u01a1\u01a2"+
		"\7C\2\2\u01a2\u01a3\7X\2\2\u01a3\u01a4\7G\2\2\u01a4\u01a5\7\"\2\2\u01a5"+
		"\u01a6\7P\2\2\u01a6\u01a7\7Q\2\2\u01a7\u01a8\7\"\2\2\u01a8\u01a9\7T\2"+
		"\2\u01a9\u01aa\7G\2\2\u01aa\u01ab\7U\2\2\u01ab\u01ac\7R\2\2\u01ac\u01ad"+
		"\7G\2\2\u01ad\u01ae\7E\2\2\u01ae\u01af\7V\2\2\u01af\u01b0\7\"\2\2\u01b0"+
		"\u01b1\7H\2\2\u01b1\u01b2\7Q\2\2\u01b2\u01b3\7T\2\2\u01b3\u01b4\7\"\2"+
		"\2\u01b4\u01b5\7N\2\2\u01b5\u01b6\7Q\2\2\u01b6\u01b7\7I\2\2\u01b7\u01b8"+
		"\7K\2\2\u01b8\u01b9\7E\2\2\u01b9.\3\2\2\2\u01ba\u01bb\7U\2\2\u01bb\u01bc"+
		"\7V\2\2\u01bc\u01bd\7K\2\2\u01bd\u01be\7E\2\2\u01be\u01bf\7M\2\2\u01bf"+
		"\u01c0\7\"\2\2\u01c0\u01c1\7C\2\2\u01c1\u01c2\7T\2\2\u01c2\u01c3\7Q\2"+
		"\2\u01c3\u01c4\7W\2\2\u01c4\u01c5\7P\2\2\u01c5\u01c6\7F\2\2\u01c6\60\3"+
		"\2\2\2\u01c7\u01c8\7E\2\2\u01c8\u01c9\7J\2\2\u01c9\u01ca\7K\2\2\u01ca"+
		"\u01cb\7N\2\2\u01cb\u01cc\7N\2\2\u01cc\62\3\2\2\2\u01cd\u01cf\t\2\2\2"+
		"\u01ce\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1"+
		"\3\2\2\2\u01d1\64\3\2\2\2\u01d2\u01d4\5=\37\2\u01d3\u01d2\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\66\3\2\2"+
		"\2\u01d7\u01da\5? \2\u01d8\u01da\5A!\2\u01d9\u01d7\3\2\2\2\u01d9\u01d8"+
		"\3\2\2\2\u01da8\3\2\2\2\u01db\u01dc\7D\2\2\u01dc\u01dd\7N\2\2\u01dd\u01de"+
		"\7C\2\2\u01de\u01e2\3\2\2\2\u01df\u01e1\13\2\2\2\u01e0\u01df\3\2\2\2\u01e1"+
		"\u01e4\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e5\3\2"+
		"\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e6\7D\2\2\u01e6\u01e7\7N\2\2\u01e7\u01e8"+
		"\7C\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\b\35\2\2\u01ea:\3\2\2\2\u01eb"+
		"\u01ed\t\3\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ec\3\2"+
		"\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\b\36\2\2\u01f1"+
		"<\3\2\2\2\u01f2\u01f3\4\62;\2\u01f3>\3\2\2\2\u01f4\u01f9\7)\2\2\u01f5"+
		"\u01f8\5G$\2\u01f6\u01f8\n\4\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f6\3\2\2"+
		"\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc"+
		"\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u0207\7)\2\2\u01fd\u0202\7$\2\2\u01fe"+
		"\u0201\5G$\2\u01ff\u0201\n\5\2\2\u0200\u01fe\3\2\2\2\u0200\u01ff\3\2\2"+
		"\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205"+
		"\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u0207\7$\2\2\u0206\u01f4\3\2\2\2\u0206"+
		"\u01fd\3\2\2\2\u0207@\3\2\2\2\u0208\u0209\7)\2\2\u0209\u020a\7)\2\2\u020a"+
		"\u020b\7)\2\2\u020b\u020f\3\2\2\2\u020c\u020e\5C\"\2\u020d\u020c\3\2\2"+
		"\2\u020e\u0211\3\2\2\2\u020f\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0212"+
		"\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0213\7)\2\2\u0213\u0214\7)\2\2\u0214"+
		"\u0223\7)\2\2\u0215\u0216\7$\2\2\u0216\u0217\7$\2\2\u0217\u0218\7$\2\2"+
		"\u0218\u021c\3\2\2\2\u0219\u021b\5C\"\2\u021a\u0219\3\2\2\2\u021b\u021e"+
		"\3\2\2\2\u021c\u021d\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021f\3\2\2\2\u021e"+
		"\u021c\3\2\2\2\u021f\u0220\7$\2\2\u0220\u0221\7$\2\2\u0221\u0223\7$\2"+
		"\2\u0222\u0208\3\2\2\2\u0222\u0215\3\2\2\2\u0223B\3\2\2\2\u0224\u0227"+
		"\5E#\2\u0225\u0227\5G$\2\u0226\u0224\3\2\2\2\u0226\u0225\3\2\2\2\u0227"+
		"D\3\2\2\2\u0228\u0229\n\6\2\2\u0229F\3\2\2\2\u022a\u022b\7^\2\2\u022b"+
		"\u022c\13\2\2\2\u022cH\3\2\2\2\21\2\u01d0\u01d5\u01d9\u01e2\u01ee\u01f7"+
		"\u01f9\u0200\u0202\u0206\u020f\u021c\u0222\u0226\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}