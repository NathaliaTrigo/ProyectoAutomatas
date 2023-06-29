package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_codigo = 1, RULE_escritura = 2, RULE_lectura = 3, 
		RULE_si = 4, RULE_mientras = 5, RULE_hacer = 6, RULE_declaracion = 7, 
		RULE_condicion = 8, RULE_calculo = 9, RULE_suma = 10, RULE_resta = 11, 
		RULE_multiplicacion = 12, RULE_division = 13, RULE_funcionmatematica = 14, 
		RULE_raiz = 15, RULE_seno = 16, RULE_coseno = 17;
	public static final String[] ruleNames = {
		"program", "codigo", "escritura", "lectura", "si", "mientras", "hacer", 
		"declaracion", "condicion", "calculo", "suma", "resta", "multiplicacion", 
		"division", "funcionmatematica", "raiz", "seno", "coseno"
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

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(ParserTParser.BEGIN, 0); }
		public TerminalNode MAIN() { return getToken(ParserTParser.MAIN, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ParserTParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(ParserTParser.BRACE_CLOSE, 0); }
		public TerminalNode END() { return getToken(ParserTParser.END, 0); }
		public List<CodigoContext> codigo() {
			return getRuleContexts(CodigoContext.class);
		}
		public CodigoContext codigo(int i) {
			return getRuleContext(CodigoContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(BEGIN);
			setState(37);
			match(MAIN);
			setState(38);
			match(BRACE_OPEN);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << READ) | (1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << NAME_VAR))) != 0)) {
				{
				{
				setState(39);
				codigo();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(BRACE_CLOSE);
			setState(46);
			match(END);
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

	public static class CodigoContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public EscrituraContext escritura() {
			return getRuleContext(EscrituraContext.class,0);
		}
		public LecturaContext lectura() {
			return getRuleContext(LecturaContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public HacerContext hacer() {
			return getRuleContext(HacerContext.class,0);
		}
		public CalculoContext calculo() {
			return getRuleContext(CalculoContext.class,0);
		}
		public FuncionmatematicaContext funcionmatematica() {
			return getRuleContext(FuncionmatematicaContext.class,0);
		}
		public CodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitCodigo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCodigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_codigo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(48);
				declaracion();
				}
				break;
			case 2:
				{
				setState(49);
				escritura();
				}
				break;
			case 3:
				{
				setState(50);
				lectura();
				}
				break;
			case 4:
				{
				setState(51);
				si();
				}
				break;
			case 5:
				{
				setState(52);
				mientras();
				}
				break;
			case 6:
				{
				setState(53);
				hacer();
				}
				break;
			case 7:
				{
				setState(54);
				calculo();
				}
				break;
			case 8:
				{
				setState(55);
				funcionmatematica();
				}
				break;
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

	public static class EscrituraContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ParserTParser.PRINT, 0); }
		public TerminalNode PAR_OPEN() { return getToken(ParserTParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(ParserTParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserTParser.SEMICOLON, 0); }
		public List<TerminalNode> NAME_VAR() { return getTokens(ParserTParser.NAME_VAR); }
		public TerminalNode NAME_VAR(int i) {
			return getToken(ParserTParser.NAME_VAR, i);
		}
		public List<TerminalNode> WORDS() { return getTokens(ParserTParser.WORDS); }
		public TerminalNode WORDS(int i) {
			return getToken(ParserTParser.WORDS, i);
		}
		public EscrituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escritura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterEscritura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitEscritura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitEscritura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscrituraContext escritura() throws RecognitionException {
		EscrituraContext _localctx = new EscrituraContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_escritura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(PRINT);
			setState(59);
			match(PAR_OPEN);
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				_la = _input.LA(1);
				if ( !(_la==NAME_VAR || _la==WORDS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME_VAR || _la==WORDS );
			setState(65);
			match(PAR_CLOSE);
			setState(66);
			match(SEMICOLON);
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

	public static class LecturaContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(ParserTParser.READ, 0); }
		public TerminalNode PAR_OPEN() { return getToken(ParserTParser.PAR_OPEN, 0); }
		public TerminalNode WORDS() { return getToken(ParserTParser.WORDS, 0); }
		public TerminalNode COMMA() { return getToken(ParserTParser.COMMA, 0); }
		public TerminalNode NAME_VAR() { return getToken(ParserTParser.NAME_VAR, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(ParserTParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserTParser.SEMICOLON, 0); }
		public LecturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lectura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterLectura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitLectura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitLectura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LecturaContext lectura() throws RecognitionException {
		LecturaContext _localctx = new LecturaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lectura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(READ);
			setState(69);
			match(PAR_OPEN);
			setState(70);
			match(WORDS);
			setState(71);
			match(COMMA);
			setState(72);
			match(NAME_VAR);
			setState(73);
			match(PAR_CLOSE);
			setState(74);
			match(SEMICOLON);
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

	public static class SiContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ParserTParser.IF, 0); }
		public TerminalNode PAR_OPEN() { return getToken(ParserTParser.PAR_OPEN, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(ParserTParser.PAR_CLOSE, 0); }
		public List<TerminalNode> BRACE_OPEN() { return getTokens(ParserTParser.BRACE_OPEN); }
		public TerminalNode BRACE_OPEN(int i) {
			return getToken(ParserTParser.BRACE_OPEN, i);
		}
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(ParserTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(ParserTParser.BRACE_CLOSE, i);
		}
		public List<CodigoContext> codigo() {
			return getRuleContexts(CodigoContext.class);
		}
		public CodigoContext codigo(int i) {
			return getRuleContext(CodigoContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ParserTParser.ELSE, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(IF);
			setState(77);
			match(PAR_OPEN);
			setState(78);
			condicion();
			setState(79);
			match(PAR_CLOSE);
			setState(80);
			match(BRACE_OPEN);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				codigo();
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << READ) | (1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << NAME_VAR))) != 0) );
			setState(86);
			match(BRACE_CLOSE);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(87);
				match(ELSE);
				setState(88);
				match(BRACE_OPEN);
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(89);
					codigo();
					}
					}
					setState(92); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << READ) | (1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << NAME_VAR))) != 0) );
				setState(94);
				match(BRACE_CLOSE);
				}
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

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ParserTParser.WHILE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(ParserTParser.PAR_OPEN, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(ParserTParser.PAR_CLOSE, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ParserTParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(ParserTParser.BRACE_CLOSE, 0); }
		public List<CodigoContext> codigo() {
			return getRuleContexts(CodigoContext.class);
		}
		public CodigoContext codigo(int i) {
			return getRuleContext(CodigoContext.class,i);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(WHILE);
			setState(99);
			match(PAR_OPEN);
			setState(100);
			condicion();
			setState(101);
			match(PAR_CLOSE);
			setState(102);
			match(BRACE_OPEN);
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				codigo();
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << READ) | (1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << NAME_VAR))) != 0) );
			setState(108);
			match(BRACE_CLOSE);
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

	public static class HacerContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(ParserTParser.DO, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ParserTParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(ParserTParser.BRACE_CLOSE, 0); }
		public TerminalNode WHILE() { return getToken(ParserTParser.WHILE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(ParserTParser.PAR_OPEN, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(ParserTParser.PAR_CLOSE, 0); }
		public List<CodigoContext> codigo() {
			return getRuleContexts(CodigoContext.class);
		}
		public CodigoContext codigo(int i) {
			return getRuleContext(CodigoContext.class,i);
		}
		public HacerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hacer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterHacer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitHacer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitHacer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HacerContext hacer() throws RecognitionException {
		HacerContext _localctx = new HacerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_hacer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(DO);
			setState(111);
			match(BRACE_OPEN);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				codigo();
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << READ) | (1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << NAME_VAR))) != 0) );
			setState(117);
			match(BRACE_CLOSE);
			setState(118);
			match(WHILE);
			setState(119);
			match(PAR_OPEN);
			setState(120);
			condicion();
			setState(121);
			match(PAR_CLOSE);
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

	public static class DeclaracionContext extends ParserRuleContext {
		public List<TerminalNode> NAME_VAR() { return getTokens(ParserTParser.NAME_VAR); }
		public TerminalNode NAME_VAR(int i) {
			return getToken(ParserTParser.NAME_VAR, i);
		}
		public TerminalNode ASSIGN() { return getToken(ParserTParser.ASSIGN, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(ParserTParser.BOOLEAN, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public TerminalNode VAL_BOOLEAN() { return getToken(ParserTParser.VAL_BOOLEAN, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserTParser.SEMICOLON, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(124);
			match(NAME_VAR);
			setState(125);
			match(ASSIGN);
			setState(126);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAL_BOOLEAN) | (1L << NAME_VAR) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(127);
				match(SEMICOLON);
				}
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

	public static class CondicionContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(ParserTParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserTParser.NUMBER, i);
		}
		public List<TerminalNode> NAME_VAR() { return getTokens(ParserTParser.NAME_VAR); }
		public TerminalNode NAME_VAR(int i) {
			return getToken(ParserTParser.NAME_VAR, i);
		}
		public TerminalNode GREATER() { return getToken(ParserTParser.GREATER, 0); }
		public TerminalNode LESSER() { return getToken(ParserTParser.LESSER, 0); }
		public TerminalNode GREATER_OR_EQUAL() { return getToken(ParserTParser.GREATER_OR_EQUAL, 0); }
		public TerminalNode LESSER_OR_EQUAL() { return getToken(ParserTParser.LESSER_OR_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(ParserTParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(ParserTParser.NOT_EQUAL, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !(_la==NAME_VAR || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << GREATER) | (1L << LESSER) | (1L << GREATER_OR_EQUAL) | (1L << LESSER_OR_EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==NAME_VAR || _la==NUMBER) ) {
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

	public static class CalculoContext extends ParserRuleContext {
		public SumaContext suma() {
			return getRuleContext(SumaContext.class,0);
		}
		public RestaContext resta() {
			return getRuleContext(RestaContext.class,0);
		}
		public MultiplicacionContext multiplicacion() {
			return getRuleContext(MultiplicacionContext.class,0);
		}
		public DivisionContext division() {
			return getRuleContext(DivisionContext.class,0);
		}
		public CalculoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterCalculo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitCalculo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCalculo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculoContext calculo() throws RecognitionException {
		CalculoContext _localctx = new CalculoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_calculo);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				suma();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				resta();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				multiplicacion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				division();
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

	public static class SumaContext extends ParserRuleContext {
		public List<TerminalNode> NAME_VAR() { return getTokens(ParserTParser.NAME_VAR); }
		public TerminalNode NAME_VAR(int i) {
			return getToken(ParserTParser.NAME_VAR, i);
		}
		public TerminalNode ASSIGN() { return getToken(ParserTParser.ASSIGN, 0); }
		public TerminalNode PLUS() { return getToken(ParserTParser.PLUS, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserTParser.SEMICOLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(ParserTParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserTParser.NUMBER, i);
		}
		public SumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitSuma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSuma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_suma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(NAME_VAR);
			setState(141);
			match(ASSIGN);
			setState(142);
			_la = _input.LA(1);
			if ( !(_la==NAME_VAR || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(143);
			match(PLUS);
			setState(144);
			_la = _input.LA(1);
			if ( !(_la==NAME_VAR || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(145);
			match(SEMICOLON);
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

	public static class RestaContext extends ParserRuleContext {
		public List<TerminalNode> NAME_VAR() { return getTokens(ParserTParser.NAME_VAR); }
		public TerminalNode NAME_VAR(int i) {
			return getToken(ParserTParser.NAME_VAR, i);
		}
		public TerminalNode ASSIGN() { return getToken(ParserTParser.ASSIGN, 0); }
		public TerminalNode MINUS() { return getToken(ParserTParser.MINUS, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserTParser.SEMICOLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(ParserTParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserTParser.NUMBER, i);
		}
		public RestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterResta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitResta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitResta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestaContext resta() throws RecognitionException {
		RestaContext _localctx = new RestaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_resta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(NAME_VAR);
			setState(148);
			match(ASSIGN);
			setState(149);
			_la = _input.LA(1);
			if ( !(_la==NAME_VAR || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(150);
			match(MINUS);
			setState(151);
			_la = _input.LA(1);
			if ( !(_la==NAME_VAR || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(152);
			match(SEMICOLON);
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

	public static class MultiplicacionContext extends ParserRuleContext {
		public List<TerminalNode> NAME_VAR() { return getTokens(ParserTParser.NAME_VAR); }
		public TerminalNode NAME_VAR(int i) {
			return getToken(ParserTParser.NAME_VAR, i);
		}
		public TerminalNode ASSIGN() { return getToken(ParserTParser.ASSIGN, 0); }
		public TerminalNode MULT() { return getToken(ParserTParser.MULT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserTParser.SEMICOLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(ParserTParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserTParser.NUMBER, i);
		}
		public MultiplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterMultiplicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitMultiplicacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMultiplicacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicacionContext multiplicacion() throws RecognitionException {
		MultiplicacionContext _localctx = new MultiplicacionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multiplicacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(NAME_VAR);
			setState(155);
			match(ASSIGN);
			setState(156);
			_la = _input.LA(1);
			if ( !(_la==NAME_VAR || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(157);
			match(MULT);
			setState(158);
			_la = _input.LA(1);
			if ( !(_la==NAME_VAR || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(159);
			match(SEMICOLON);
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

	public static class DivisionContext extends ParserRuleContext {
		public List<TerminalNode> NAME_VAR() { return getTokens(ParserTParser.NAME_VAR); }
		public TerminalNode NAME_VAR(int i) {
			return getToken(ParserTParser.NAME_VAR, i);
		}
		public TerminalNode ASSIGN() { return getToken(ParserTParser.ASSIGN, 0); }
		public TerminalNode DIV() { return getToken(ParserTParser.DIV, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserTParser.SEMICOLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(ParserTParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserTParser.NUMBER, i);
		}
		public DivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_division; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_division);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(NAME_VAR);
			setState(162);
			match(ASSIGN);
			setState(163);
			_la = _input.LA(1);
			if ( !(_la==NAME_VAR || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(164);
			match(DIV);
			setState(165);
			_la = _input.LA(1);
			if ( !(_la==NAME_VAR || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(166);
			match(SEMICOLON);
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

	public static class FuncionmatematicaContext extends ParserRuleContext {
		public RaizContext raiz() {
			return getRuleContext(RaizContext.class,0);
		}
		public SenoContext seno() {
			return getRuleContext(SenoContext.class,0);
		}
		public CosenoContext coseno() {
			return getRuleContext(CosenoContext.class,0);
		}
		public FuncionmatematicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionmatematica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterFuncionmatematica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitFuncionmatematica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitFuncionmatematica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionmatematicaContext funcionmatematica() throws RecognitionException {
		FuncionmatematicaContext _localctx = new FuncionmatematicaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcionmatematica);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				raiz();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				seno();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				coseno();
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

	public static class RaizContext extends ParserRuleContext {
		public List<TerminalNode> NAME_VAR() { return getTokens(ParserTParser.NAME_VAR); }
		public TerminalNode NAME_VAR(int i) {
			return getToken(ParserTParser.NAME_VAR, i);
		}
		public TerminalNode ASSIGN() { return getToken(ParserTParser.ASSIGN, 0); }
		public TerminalNode SQRT() { return getToken(ParserTParser.SQRT, 0); }
		public TerminalNode PAR_OPEN() { return getToken(ParserTParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(ParserTParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserTParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public RaizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterRaiz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitRaiz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitRaiz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RaizContext raiz() throws RecognitionException {
		RaizContext _localctx = new RaizContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_raiz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(NAME_VAR);
			setState(174);
			match(ASSIGN);
			setState(175);
			match(SQRT);
			setState(176);
			match(PAR_OPEN);
			setState(177);
			_la = _input.LA(1);
			if ( !(_la==NAME_VAR || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(178);
			match(PAR_CLOSE);
			setState(179);
			match(SEMICOLON);
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

	public static class SenoContext extends ParserRuleContext {
		public List<TerminalNode> NAME_VAR() { return getTokens(ParserTParser.NAME_VAR); }
		public TerminalNode NAME_VAR(int i) {
			return getToken(ParserTParser.NAME_VAR, i);
		}
		public TerminalNode ASSIGN() { return getToken(ParserTParser.ASSIGN, 0); }
		public TerminalNode SIN() { return getToken(ParserTParser.SIN, 0); }
		public TerminalNode PAR_OPEN() { return getToken(ParserTParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(ParserTParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserTParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public SenoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterSeno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitSeno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSeno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenoContext seno() throws RecognitionException {
		SenoContext _localctx = new SenoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_seno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(NAME_VAR);
			setState(182);
			match(ASSIGN);
			setState(183);
			match(SIN);
			setState(184);
			match(PAR_OPEN);
			setState(185);
			_la = _input.LA(1);
			if ( !(_la==NAME_VAR || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(186);
			match(PAR_CLOSE);
			setState(187);
			match(SEMICOLON);
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

	public static class CosenoContext extends ParserRuleContext {
		public List<TerminalNode> NAME_VAR() { return getTokens(ParserTParser.NAME_VAR); }
		public TerminalNode NAME_VAR(int i) {
			return getToken(ParserTParser.NAME_VAR, i);
		}
		public TerminalNode ASSIGN() { return getToken(ParserTParser.ASSIGN, 0); }
		public TerminalNode COS() { return getToken(ParserTParser.COS, 0); }
		public TerminalNode PAR_OPEN() { return getToken(ParserTParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(ParserTParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserTParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public CosenoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coseno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterCoseno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitCoseno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCoseno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CosenoContext coseno() throws RecognitionException {
		CosenoContext _localctx = new CosenoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_coseno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(NAME_VAR);
			setState(190);
			match(ASSIGN);
			setState(191);
			match(COS);
			setState(192);
			match(PAR_OPEN);
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==NAME_VAR || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(194);
			match(PAR_CLOSE);
			setState(195);
			match(SEMICOLON);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u00c8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\6\4@\n\4\r\4\16\4A\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\6\6U\n"+
		"\6\r\6\16\6V\3\6\3\6\3\6\3\6\6\6]\n\6\r\6\16\6^\3\6\3\6\5\6c\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\6\7k\n\7\r\7\16\7l\3\7\3\7\3\b\3\b\3\b\6\bt\n\b\r\b"+
		"\16\bu\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u0083\n\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u008d\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00ae\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$\2\7\4\2\61\61\63\63\4\2\t\n\f\f\4\2--"+
		"\61\62\3\2\61\62\3\2\27\34\2\u00c9\2&\3\2\2\2\4:\3\2\2\2\6<\3\2\2\2\b"+
		"F\3\2\2\2\nN\3\2\2\2\fd\3\2\2\2\16p\3\2\2\2\20}\3\2\2\2\22\u0084\3\2\2"+
		"\2\24\u008c\3\2\2\2\26\u008e\3\2\2\2\30\u0095\3\2\2\2\32\u009c\3\2\2\2"+
		"\34\u00a3\3\2\2\2\36\u00ad\3\2\2\2 \u00af\3\2\2\2\"\u00b7\3\2\2\2$\u00bf"+
		"\3\2\2\2&\'\7\3\2\2\'(\7\5\2\2(,\7\35\2\2)+\5\4\3\2*)\3\2\2\2+.\3\2\2"+
		"\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\36\2\2\60\61\7\4\2\2"+
		"\61\3\3\2\2\2\62;\5\20\t\2\63;\5\6\4\2\64;\5\b\5\2\65;\5\n\6\2\66;\5\f"+
		"\7\2\67;\5\16\b\28;\5\24\13\29;\5\36\20\2:\62\3\2\2\2:\63\3\2\2\2:\64"+
		"\3\2\2\2:\65\3\2\2\2:\66\3\2\2\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;\5\3"+
		"\2\2\2<=\7\6\2\2=?\7!\2\2>@\t\2\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3"+
		"\2\2\2BC\3\2\2\2CD\7\"\2\2DE\7#\2\2E\7\3\2\2\2FG\7\7\2\2GH\7!\2\2HI\7"+
		"\63\2\2IJ\7$\2\2JK\7\61\2\2KL\7\"\2\2LM\7#\2\2M\t\3\2\2\2NO\7%\2\2OP\7"+
		"!\2\2PQ\5\22\n\2QR\7\"\2\2RT\7\35\2\2SU\5\4\3\2TS\3\2\2\2UV\3\2\2\2VT"+
		"\3\2\2\2VW\3\2\2\2WX\3\2\2\2Xb\7\36\2\2YZ\7&\2\2Z\\\7\35\2\2[]\5\4\3\2"+
		"\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\36\2\2ac\3\2"+
		"\2\2bY\3\2\2\2bc\3\2\2\2c\13\3\2\2\2de\7(\2\2ef\7!\2\2fg\5\22\n\2gh\7"+
		"\"\2\2hj\7\35\2\2ik\5\4\3\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn"+
		"\3\2\2\2no\7\36\2\2o\r\3\2\2\2pq\7\'\2\2qs\7\35\2\2rt\5\4\3\2sr\3\2\2"+
		"\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\36\2\2xy\7(\2\2yz\7!\2"+
		"\2z{\5\22\n\2{|\7\"\2\2|\17\3\2\2\2}~\t\3\2\2~\177\7\61\2\2\177\u0080"+
		"\7\23\2\2\u0080\u0082\t\4\2\2\u0081\u0083\7#\2\2\u0082\u0081\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\21\3\2\2\2\u0084\u0085\t\5\2\2\u0085\u0086\t\6\2"+
		"\2\u0086\u0087\t\5\2\2\u0087\23\3\2\2\2\u0088\u008d\5\26\f\2\u0089\u008d"+
		"\5\30\r\2\u008a\u008d\5\32\16\2\u008b\u008d\5\34\17\2\u008c\u0088\3\2"+
		"\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\25\3\2\2\2\u008e\u008f\7\61\2\2\u008f\u0090\7\23\2\2\u0090\u0091\t\5"+
		"\2\2\u0091\u0092\7\r\2\2\u0092\u0093\t\5\2\2\u0093\u0094\7#\2\2\u0094"+
		"\27\3\2\2\2\u0095\u0096\7\61\2\2\u0096\u0097\7\23\2\2\u0097\u0098\t\5"+
		"\2\2\u0098\u0099\7\16\2\2\u0099\u009a\t\5\2\2\u009a\u009b\7#\2\2\u009b"+
		"\31\3\2\2\2\u009c\u009d\7\61\2\2\u009d\u009e\7\23\2\2\u009e\u009f\t\5"+
		"\2\2\u009f\u00a0\7\17\2\2\u00a0\u00a1\t\5\2\2\u00a1\u00a2\7#\2\2\u00a2"+
		"\33\3\2\2\2\u00a3\u00a4\7\61\2\2\u00a4\u00a5\7\23\2\2\u00a5\u00a6\t\5"+
		"\2\2\u00a6\u00a7\7\20\2\2\u00a7\u00a8\t\5\2\2\u00a8\u00a9\7#\2\2\u00a9"+
		"\35\3\2\2\2\u00aa\u00ae\5 \21\2\u00ab\u00ae\5\"\22\2\u00ac\u00ae\5$\23"+
		"\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\37"+
		"\3\2\2\2\u00af\u00b0\7\61\2\2\u00b0\u00b1\7\23\2\2\u00b1\u00b2\7.\2\2"+
		"\u00b2\u00b3\7!\2\2\u00b3\u00b4\t\5\2\2\u00b4\u00b5\7\"\2\2\u00b5\u00b6"+
		"\7#\2\2\u00b6!\3\2\2\2\u00b7\u00b8\7\61\2\2\u00b8\u00b9\7\23\2\2\u00b9"+
		"\u00ba\7/\2\2\u00ba\u00bb\7!\2\2\u00bb\u00bc\t\5\2\2\u00bc\u00bd\7\"\2"+
		"\2\u00bd\u00be\7#\2\2\u00be#\3\2\2\2\u00bf\u00c0\7\61\2\2\u00c0\u00c1"+
		"\7\23\2\2\u00c1\u00c2\7\60\2\2\u00c2\u00c3\7!\2\2\u00c3\u00c4\t\5\2\2"+
		"\u00c4\u00c5\7\"\2\2\u00c5\u00c6\7#\2\2\u00c6%\3\2\2\2\r,:AV^blu\u0082"+
		"\u008c\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}