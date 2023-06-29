// Generated from LexerT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerT extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, MAIN=3, PRINT=4, READ=5, CHAR=6, INT=7, FLOAT=8, VOID=9, 
		BOOLEAN=10, PLUS=11, MINUS=12, MULT=13, DIV=14, MOD=15, POW=16, ASSIGN=17, 
		AND=18, OR=19, NOT=20, EQUAL=21, NOT_EQUAL=22, GREATER=23, LESSER=24, 
		GREATER_OR_EQUAL=25, LESSER_OR_EQUAL=26, BRACE_OPEN=27, BRACE_CLOSE=28, 
		BRACKET_OPEN=29, BRACKET_CLOSE=30, PAR_OPEN=31, PAR_CLOSE=32, SEMICOLON=33, 
		COMMA=34, IF=35, ELSE=36, DO=37, WHILE=38, FOR=39, NULL=40, RETURN=41, 
		CONSTANT=42, VAL_BOOLEAN=43, SQRT=44, SIN=45, COS=46, NAME_VAR=47, NUMBER=48, 
		WORDS=49, LOWER_CHAR=50, UPPER_CHAR=51, DIGIT=52, WS=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BEGIN", "END", "MAIN", "PRINT", "READ", "CHAR", "INT", "FLOAT", "VOID", 
		"BOOLEAN", "PLUS", "MINUS", "MULT", "DIV", "MOD", "POW", "ASSIGN", "AND", 
		"OR", "NOT", "EQUAL", "NOT_EQUAL", "GREATER", "LESSER", "GREATER_OR_EQUAL", 
		"LESSER_OR_EQUAL", "BRACE_OPEN", "BRACE_CLOSE", "BRACKET_OPEN", "BRACKET_CLOSE", 
		"PAR_OPEN", "PAR_CLOSE", "SEMICOLON", "COMMA", "IF", "ELSE", "DO", "WHILE", 
		"FOR", "NULL", "RETURN", "CONSTANT", "VAL_BOOLEAN", "SQRT", "SIN", "COS", 
		"NAME_VAR", "NUMBER", "WORDS", "LOWER_CHAR", "UPPER_CHAR", "DIGIT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'ipinipicipiapar'", "'fipin'", "'pripincipiapal'", "'epescripibipir'", 
		"'lepeeper'", "'caparapacteper'", "'epenteperopo'", "'flopotapantepe'", 
		"'vapacipiopo'", "'lopogipicopo'", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'^'", "'='", "'&'", "'|'", "'!'", "'=='", "'!='", "'>'", "'<'", "'>='", 
		"'<='", "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "','", "'sipi'", 
		"'sipinopo'", "'hapaceper'", "'mipiepentrapas'", "'paparapa'", "'nupulopo'", 
		"'depevupuepelvepe'", "'coponstapantepe'", null, "'rapaipiz'", "'sipin'", 
		"'copos'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "END", "MAIN", "PRINT", "READ", "CHAR", "INT", "FLOAT", 
		"VOID", "BOOLEAN", "PLUS", "MINUS", "MULT", "DIV", "MOD", "POW", "ASSIGN", 
		"AND", "OR", "NOT", "EQUAL", "NOT_EQUAL", "GREATER", "LESSER", "GREATER_OR_EQUAL", 
		"LESSER_OR_EQUAL", "BRACE_OPEN", "BRACE_CLOSE", "BRACKET_OPEN", "BRACKET_CLOSE", 
		"PAR_OPEN", "PAR_CLOSE", "SEMICOLON", "COMMA", "IF", "ELSE", "DO", "WHILE", 
		"FOR", "NULL", "RETURN", "CONSTANT", "VAL_BOOLEAN", "SQRT", "SIN", "COS", 
		"NAME_VAR", "NUMBER", "WORDS", "LOWER_CHAR", "UPPER_CHAR", "DIGIT", "WS"
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


	public LexerT(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerT.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u01d8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0197\n,\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\5"+
		"\60\u01b1\n\60\3\60\3\60\3\60\3\60\6\60\u01b7\n\60\r\60\16\60\u01b8\3"+
		"\61\6\61\u01bc\n\61\r\61\16\61\u01bd\3\62\3\62\3\62\3\62\3\62\7\62\u01c5"+
		"\n\62\f\62\16\62\u01c8\13\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3"+
		"\66\6\66\u01d3\n\66\r\66\16\66\u01d4\3\66\3\66\2\2\67\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67\3\2\6\3\2c|\3\2C\\"+
		"\3\2\62;\5\2\13\f\17\17\"\"\2\u01e4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5}\3\2\2\2\7\u0083\3\2\2\2\t\u0092"+
		"\3\2\2\2\13\u00a1\3\2\2\2\r\u00aa\3\2\2\2\17\u00b9\3\2\2\2\21\u00c6\3"+
		"\2\2\2\23\u00d5\3\2\2\2\25\u00e1\3\2\2\2\27\u00ee\3\2\2\2\31\u00f0\3\2"+
		"\2\2\33\u00f2\3\2\2\2\35\u00f4\3\2\2\2\37\u00f6\3\2\2\2!\u00f8\3\2\2\2"+
		"#\u00fa\3\2\2\2%\u00fc\3\2\2\2\'\u00fe\3\2\2\2)\u0100\3\2\2\2+\u0102\3"+
		"\2\2\2-\u0105\3\2\2\2/\u0108\3\2\2\2\61\u010a\3\2\2\2\63\u010c\3\2\2\2"+
		"\65\u010f\3\2\2\2\67\u0112\3\2\2\29\u0114\3\2\2\2;\u0116\3\2\2\2=\u0118"+
		"\3\2\2\2?\u011a\3\2\2\2A\u011c\3\2\2\2C\u011e\3\2\2\2E\u0120\3\2\2\2G"+
		"\u0122\3\2\2\2I\u0127\3\2\2\2K\u0130\3\2\2\2M\u013a\3\2\2\2O\u0149\3\2"+
		"\2\2Q\u0152\3\2\2\2S\u015b\3\2\2\2U\u016c\3\2\2\2W\u0196\3\2\2\2Y\u0198"+
		"\3\2\2\2[\u01a1\3\2\2\2]\u01a7\3\2\2\2_\u01b0\3\2\2\2a\u01bb\3\2\2\2c"+
		"\u01bf\3\2\2\2e\u01cb\3\2\2\2g\u01cd\3\2\2\2i\u01cf\3\2\2\2k\u01d2\3\2"+
		"\2\2mn\7k\2\2no\7r\2\2op\7k\2\2pq\7p\2\2qr\7k\2\2rs\7r\2\2st\7k\2\2tu"+
		"\7e\2\2uv\7k\2\2vw\7r\2\2wx\7k\2\2xy\7c\2\2yz\7r\2\2z{\7c\2\2{|\7t\2\2"+
		"|\4\3\2\2\2}~\7h\2\2~\177\7k\2\2\177\u0080\7r\2\2\u0080\u0081\7k\2\2\u0081"+
		"\u0082\7p\2\2\u0082\6\3\2\2\2\u0083\u0084\7r\2\2\u0084\u0085\7t\2\2\u0085"+
		"\u0086\7k\2\2\u0086\u0087\7r\2\2\u0087\u0088\7k\2\2\u0088\u0089\7p\2\2"+
		"\u0089\u008a\7e\2\2\u008a\u008b\7k\2\2\u008b\u008c\7r\2\2\u008c\u008d"+
		"\7k\2\2\u008d\u008e\7c\2\2\u008e\u008f\7r\2\2\u008f\u0090\7c\2\2\u0090"+
		"\u0091\7n\2\2\u0091\b\3\2\2\2\u0092\u0093\7g\2\2\u0093\u0094\7r\2\2\u0094"+
		"\u0095\7g\2\2\u0095\u0096\7u\2\2\u0096\u0097\7e\2\2\u0097\u0098\7t\2\2"+
		"\u0098\u0099\7k\2\2\u0099\u009a\7r\2\2\u009a\u009b\7k\2\2\u009b\u009c"+
		"\7d\2\2\u009c\u009d\7k\2\2\u009d\u009e\7r\2\2\u009e\u009f\7k\2\2\u009f"+
		"\u00a0\7t\2\2\u00a0\n\3\2\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\u00a4\7r\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7r\2\2"+
		"\u00a7\u00a8\7g\2\2\u00a8\u00a9\7t\2\2\u00a9\f\3\2\2\2\u00aa\u00ab\7e"+
		"\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7r\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af"+
		"\7t\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7r\2\2\u00b1\u00b2\7c\2\2\u00b2"+
		"\u00b3\7e\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7r\2\2"+
		"\u00b6\u00b7\7g\2\2\u00b7\u00b8\7t\2\2\u00b8\16\3\2\2\2\u00b9\u00ba\7"+
		"g\2\2\u00ba\u00bb\7r\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be"+
		"\7v\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7r\2\2\u00c0\u00c1\7g\2\2\u00c1"+
		"\u00c2\7t\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7r\2\2\u00c4\u00c5\7q\2\2"+
		"\u00c5\20\3\2\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7"+
		"q\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd"+
		"\7c\2\2\u00cd\u00ce\7r\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7p\2\2\u00d0"+
		"\u00d1\7v\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7r\2\2\u00d3\u00d4\7g\2\2"+
		"\u00d4\22\3\2\2\2\u00d5\u00d6\7x\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7"+
		"r\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7e\2\2\u00da\u00db\7k\2\2\u00db\u00dc"+
		"\7r\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7r\2\2\u00df"+
		"\u00e0\7q\2\2\u00e0\24\3\2\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7q\2\2\u00e3"+
		"\u00e4\7r\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7i\2\2\u00e6\u00e7\7k\2\2"+
		"\u00e7\u00e8\7r\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb"+
		"\7q\2\2\u00eb\u00ec\7r\2\2\u00ec\u00ed\7q\2\2\u00ed\26\3\2\2\2\u00ee\u00ef"+
		"\7-\2\2\u00ef\30\3\2\2\2\u00f0\u00f1\7/\2\2\u00f1\32\3\2\2\2\u00f2\u00f3"+
		"\7,\2\2\u00f3\34\3\2\2\2\u00f4\u00f5\7\61\2\2\u00f5\36\3\2\2\2\u00f6\u00f7"+
		"\7\'\2\2\u00f7 \3\2\2\2\u00f8\u00f9\7`\2\2\u00f9\"\3\2\2\2\u00fa\u00fb"+
		"\7?\2\2\u00fb$\3\2\2\2\u00fc\u00fd\7(\2\2\u00fd&\3\2\2\2\u00fe\u00ff\7"+
		"~\2\2\u00ff(\3\2\2\2\u0100\u0101\7#\2\2\u0101*\3\2\2\2\u0102\u0103\7?"+
		"\2\2\u0103\u0104\7?\2\2\u0104,\3\2\2\2\u0105\u0106\7#\2\2\u0106\u0107"+
		"\7?\2\2\u0107.\3\2\2\2\u0108\u0109\7@\2\2\u0109\60\3\2\2\2\u010a\u010b"+
		"\7>\2\2\u010b\62\3\2\2\2\u010c\u010d\7@\2\2\u010d\u010e\7?\2\2\u010e\64"+
		"\3\2\2\2\u010f\u0110\7>\2\2\u0110\u0111\7?\2\2\u0111\66\3\2\2\2\u0112"+
		"\u0113\7}\2\2\u01138\3\2\2\2\u0114\u0115\7\177\2\2\u0115:\3\2\2\2\u0116"+
		"\u0117\7]\2\2\u0117<\3\2\2\2\u0118\u0119\7_\2\2\u0119>\3\2\2\2\u011a\u011b"+
		"\7*\2\2\u011b@\3\2\2\2\u011c\u011d\7+\2\2\u011dB\3\2\2\2\u011e\u011f\7"+
		"=\2\2\u011fD\3\2\2\2\u0120\u0121\7.\2\2\u0121F\3\2\2\2\u0122\u0123\7u"+
		"\2\2\u0123\u0124\7k\2\2\u0124\u0125\7r\2\2\u0125\u0126\7k\2\2\u0126H\3"+
		"\2\2\2\u0127\u0128\7u\2\2\u0128\u0129\7k\2\2\u0129\u012a\7r\2\2\u012a"+
		"\u012b\7k\2\2\u012b\u012c\7p\2\2\u012c\u012d\7q\2\2\u012d\u012e\7r\2\2"+
		"\u012e\u012f\7q\2\2\u012fJ\3\2\2\2\u0130\u0131\7j\2\2\u0131\u0132\7c\2"+
		"\2\u0132\u0133\7r\2\2\u0133\u0134\7c\2\2\u0134\u0135\7e\2\2\u0135\u0136"+
		"\7g\2\2\u0136\u0137\7r\2\2\u0137\u0138\7g\2\2\u0138\u0139\7t\2\2\u0139"+
		"L\3\2\2\2\u013a\u013b\7o\2\2\u013b\u013c\7k\2\2\u013c\u013d\7r\2\2\u013d"+
		"\u013e\7k\2\2\u013e\u013f\7g\2\2\u013f\u0140\7r\2\2\u0140\u0141\7g\2\2"+
		"\u0141\u0142\7p\2\2\u0142\u0143\7v\2\2\u0143\u0144\7t\2\2\u0144\u0145"+
		"\7c\2\2\u0145\u0146\7r\2\2\u0146\u0147\7c\2\2\u0147\u0148\7u\2\2\u0148"+
		"N\3\2\2\2\u0149\u014a\7r\2\2\u014a\u014b\7c\2\2\u014b\u014c\7r\2\2\u014c"+
		"\u014d\7c\2\2\u014d\u014e\7t\2\2\u014e\u014f\7c\2\2\u014f\u0150\7r\2\2"+
		"\u0150\u0151\7c\2\2\u0151P\3\2\2\2\u0152\u0153\7p\2\2\u0153\u0154\7w\2"+
		"\2\u0154\u0155\7r\2\2\u0155\u0156\7w\2\2\u0156\u0157\7n\2\2\u0157\u0158"+
		"\7q\2\2\u0158\u0159\7r\2\2\u0159\u015a\7q\2\2\u015aR\3\2\2\2\u015b\u015c"+
		"\7f\2\2\u015c\u015d\7g\2\2\u015d\u015e\7r\2\2\u015e\u015f\7g\2\2\u015f"+
		"\u0160\7x\2\2\u0160\u0161\7w\2\2\u0161\u0162\7r\2\2\u0162\u0163\7w\2\2"+
		"\u0163\u0164\7g\2\2\u0164\u0165\7r\2\2\u0165\u0166\7g\2\2\u0166\u0167"+
		"\7n\2\2\u0167\u0168\7x\2\2\u0168\u0169\7g\2\2\u0169\u016a\7r\2\2\u016a"+
		"\u016b\7g\2\2\u016bT\3\2\2\2\u016c\u016d\7e\2\2\u016d\u016e\7q\2\2\u016e"+
		"\u016f\7r\2\2\u016f\u0170\7q\2\2\u0170\u0171\7p\2\2\u0171\u0172\7u\2\2"+
		"\u0172\u0173\7v\2\2\u0173\u0174\7c\2\2\u0174\u0175\7r\2\2\u0175\u0176"+
		"\7c\2\2\u0176\u0177\7p\2\2\u0177\u0178\7v\2\2\u0178\u0179\7g\2\2\u0179"+
		"\u017a\7r\2\2\u017a\u017b\7g\2\2\u017bV\3\2\2\2\u017c\u017d\7x\2\2\u017d"+
		"\u017e\7g\2\2\u017e\u017f\7r\2\2\u017f\u0180\7g\2\2\u0180\u0181\7t\2\2"+
		"\u0181\u0182\7f\2\2\u0182\u0183\7c\2\2\u0183\u0184\7r\2\2\u0184\u0185"+
		"\7c\2\2\u0185\u0186\7f\2\2\u0186\u0187\7g\2\2\u0187\u0188\7r\2\2\u0188"+
		"\u0189\7g\2\2\u0189\u018a\7t\2\2\u018a\u018b\7q\2\2\u018b\u018c\7r\2\2"+
		"\u018c\u0197\7q\2\2\u018d\u018e\7h\2\2\u018e\u018f\7c\2\2\u018f\u0190"+
		"\7r\2\2\u0190\u0191\7c\2\2\u0191\u0192\7n\2\2\u0192\u0193\7u\2\2\u0193"+
		"\u0194\7q\2\2\u0194\u0195\7r\2\2\u0195\u0197\7q\2\2\u0196\u017c\3\2\2"+
		"\2\u0196\u018d\3\2\2\2\u0197X\3\2\2\2\u0198\u0199\7t\2\2\u0199\u019a\7"+
		"c\2\2\u019a\u019b\7r\2\2\u019b\u019c\7c\2\2\u019c\u019d\7k\2\2\u019d\u019e"+
		"\7r\2\2\u019e\u019f\7k\2\2\u019f\u01a0\7|\2\2\u01a0Z\3\2\2\2\u01a1\u01a2"+
		"\7u\2\2\u01a2\u01a3\7k\2\2\u01a3\u01a4\7r\2\2\u01a4\u01a5\7k\2\2\u01a5"+
		"\u01a6\7p\2\2\u01a6\\\3\2\2\2\u01a7\u01a8\7e\2\2\u01a8\u01a9\7q\2\2\u01a9"+
		"\u01aa\7r\2\2\u01aa\u01ab\7q\2\2\u01ab\u01ac\7u\2\2\u01ac^\3\2\2\2\u01ad"+
		"\u01b1\5e\63\2\u01ae\u01b1\5g\64\2\u01af\u01b1\7a\2\2\u01b0\u01ad\3\2"+
		"\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b6\3\2\2\2\u01b2"+
		"\u01b7\5e\63\2\u01b3\u01b7\5g\64\2\u01b4\u01b7\5i\65\2\u01b5\u01b7\7a"+
		"\2\2\u01b6\u01b2\3\2\2\2\u01b6\u01b3\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6"+
		"\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2"+
		"\2\2\u01b9`\3\2\2\2\u01ba\u01bc\5i\65\2\u01bb\u01ba\3\2\2\2\u01bc\u01bd"+
		"\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01beb\3\2\2\2\u01bf"+
		"\u01c6\7$\2\2\u01c0\u01c5\5e\63\2\u01c1\u01c5\5g\64\2\u01c2\u01c5\7\""+
		"\2\2\u01c3\u01c5\5i\65\2\u01c4\u01c0\3\2\2\2\u01c4\u01c1\3\2\2\2\u01c4"+
		"\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2"+
		"\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9"+
		"\u01ca\7$\2\2\u01cad\3\2\2\2\u01cb\u01cc\t\2\2\2\u01ccf\3\2\2\2\u01cd"+
		"\u01ce\t\3\2\2\u01ceh\3\2\2\2\u01cf\u01d0\t\4\2\2\u01d0j\3\2\2\2\u01d1"+
		"\u01d3\t\5\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d2\3\2"+
		"\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\b\66\2\2\u01d7"+
		"l\3\2\2\2\13\2\u0196\u01b0\u01b6\u01b8\u01bd\u01c4\u01c6\u01d4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}