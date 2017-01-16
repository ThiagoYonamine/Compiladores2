// Generated from La.g4 by ANTLR 4.5.3
package t3;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, COMENTARIO=30, IDENT=31, 
		NUM_INT=32, NUM_REAL=33, ENTER=34, COMENTARIO_ERRADO=35, SIMBOLO_NAO_INDENTIFICADO=36;
	public static final int
		RULE_programa = 0, RULE_corpo = 1, RULE_declaracoes_objetos = 2, RULE_atribuicao = 3, 
		RULE_obj_magia = 4, RULE_obj_bloco = 5, RULE_declaracoes_funcao = 6, RULE_declaracoes = 7, 
		RULE_comandos = 8, RULE_cmd = 9, RULE_repetir = 10, RULE_tipo = 11, RULE_tipo_bloco = 12, 
		RULE_tipo_magia = 13, RULE_expressao = 14, RULE_resultado = 15;
	public static final String[] ruleNames = {
		"programa", "corpo", "declaracoes_objetos", "atribuicao", "obj_magia", 
		"obj_bloco", "declaracoes_funcao", "declaracoes", "comandos", "cmd", "repetir", 
		"tipo", "tipo_bloco", "tipo_magia", "expressao", "resultado"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'fase:'", "'inicio'", "'fim'", "'='", "'magia'", "'bloco'", "'funcao'", 
		"'()'", "'{\n'", "'}'", "'andar'", "'virar'", "'perguntar'", "'('", "')'", 
		"'usar'", "'repetir'", "'grama'", "'lava'", "'pedra'", "'gelo'", "'espinho'", 
		"'arvore'", "'caixa'", "'inimigo'", "'frente'", "'=='", "'?'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "COMENTARIO", "IDENT", "NUM_INT", 
		"NUM_REAL", "ENTER", "COMENTARIO_ERRADO", "SIMBOLO_NAO_INDENTIFICADO"
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
	public String getGrammarFileName() { return "La.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public static String grupo="<<587001, 489336>>";
	    //PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
	   

	public LaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(LaParser.NUM_INT, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__0);
			setState(33);
			match(NUM_INT);
			setState(34);
			match(T__1);
			setState(35);
			corpo();
			setState(36);
			match(T__2);
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

	public static class CorpoContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_corpo);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				comandos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Declaracoes_objetosContext extends ParserRuleContext {
		public Obj_magiaContext obj_magia() {
			return getRuleContext(Obj_magiaContext.class,0);
		}
		public Obj_blocoContext obj_bloco() {
			return getRuleContext(Obj_blocoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public Declaracoes_objetosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes_objetos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterDeclaracoes_objetos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitDeclaracoes_objetos(this);
		}
	}

	public final Declaracoes_objetosContext declaracoes_objetos() throws RecognitionException {
		Declaracoes_objetosContext _localctx = new Declaracoes_objetosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracoes_objetos);
		try {
			setState(45);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				obj_magia();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				obj_bloco();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				atribuicao();
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(IDENT);
			setState(48);
			match(T__3);
			setState(49);
			tipo();
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

	public static class Obj_magiaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public Obj_magiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj_magia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterObj_magia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitObj_magia(this);
		}
	}

	public final Obj_magiaContext obj_magia() throws RecognitionException {
		Obj_magiaContext _localctx = new Obj_magiaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_obj_magia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__4);
			setState(52);
			match(IDENT);
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

	public static class Obj_blocoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public Obj_blocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterObj_bloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitObj_bloco(this);
		}
	}

	public final Obj_blocoContext obj_bloco() throws RecognitionException {
		Obj_blocoContext _localctx = new Obj_blocoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_obj_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__5);
			setState(55);
			match(IDENT);
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

	public static class Declaracoes_funcaoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Declaracoes_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterDeclaracoes_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitDeclaracoes_funcao(this);
		}
	}

	public final Declaracoes_funcaoContext declaracoes_funcao() throws RecognitionException {
		Declaracoes_funcaoContext _localctx = new Declaracoes_funcaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracoes_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__6);
			setState(58);
			match(IDENT);
			setState(59);
			match(T__7);
			setState(60);
			match(T__8);
			setState(61);
			comandos();
			setState(62);
			match(T__9);
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public Declaracoes_objetosContext declaracoes_objetos() {
			return getRuleContext(Declaracoes_objetosContext.class,0);
		}
		public Declaracoes_funcaoContext declaracoes_funcao() {
			return getRuleContext(Declaracoes_funcaoContext.class,0);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracoes);
		try {
			setState(66);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				declaracoes_objetos();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				declaracoes_funcao();
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

	public static class ComandosContext extends ParserRuleContext {
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << IDENT))) != 0)) {
				{
				setState(68);
				cmd();
				setState(69);
				comandos();
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

	public static class CmdContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ResultadoContext resultado() {
			return getRuleContext(ResultadoContext.class,0);
		}
		public RepetirContext repetir() {
			return getRuleContext(RepetirContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmd);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(T__10);
				setState(74);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(T__11);
				setState(76);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(T__12);
				setState(78);
				match(T__13);
				setState(79);
				expressao();
				setState(80);
				match(T__14);
				setState(81);
				resultado();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				repetir();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				match(IDENT);
				setState(85);
				match(T__7);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				match(T__15);
				setState(87);
				match(T__13);
				setState(88);
				match(IDENT);
				setState(89);
				match(T__14);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				declaracoes();
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

	public static class RepetirContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(LaParser.NUM_INT, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public RepetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterRepetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitRepetir(this);
		}
	}

	public final RepetirContext repetir() throws RecognitionException {
		RepetirContext _localctx = new RepetirContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_repetir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__16);
			setState(94);
			match(T__13);
			setState(95);
			match(NUM_INT);
			setState(96);
			match(T__14);
			setState(97);
			match(T__8);
			setState(98);
			comandos();
			setState(99);
			match(T__9);
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

	public static class TipoContext extends ParserRuleContext {
		public Tipo_blocoContext tipo_bloco() {
			return getRuleContext(Tipo_blocoContext.class,0);
		}
		public Tipo_magiaContext tipo_magia() {
			return getRuleContext(Tipo_magiaContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo);
		try {
			setState(103);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				tipo_bloco();
				}
				break;
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				tipo_magia();
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

	public static class Tipo_blocoContext extends ParserRuleContext {
		public Tipo_blocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterTipo_bloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitTipo_bloco(this);
		}
	}

	public final Tipo_blocoContext tipo_bloco() throws RecognitionException {
		Tipo_blocoContext _localctx = new Tipo_blocoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipo_bloco);
		try {
			setState(113);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				match(T__20);
				setState(109);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 7);
				{
				setState(112);
				match(T__24);
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

	public static class Tipo_magiaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public TerminalNode NUM_INT() { return getToken(LaParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LaParser.NUM_REAL, 0); }
		public Tipo_magiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_magia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterTipo_magia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitTipo_magia(this);
		}
	}

	public final Tipo_magiaContext tipo_magia() throws RecognitionException {
		Tipo_magiaContext _localctx = new Tipo_magiaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo_magia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENT) | (1L << NUM_INT) | (1L << NUM_REAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ExpressaoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__25);
			setState(118);
			match(T__26);
			setState(119);
			tipo();
			setState(120);
			match(T__27);
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

	public static class ResultadoContext extends ParserRuleContext {
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ResultadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterResultado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitResultado(this);
		}
	}

	public final ResultadoContext resultado() throws RecognitionException {
		ResultadoContext _localctx = new ResultadoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_resultado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__28);
			setState(123);
			cmd();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u0080\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\5\4\60\n\4\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\tE\n\t"+
		"\3\n\3\n\3\n\5\nJ\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13^\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\5\rj\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16t\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\2\2"+
		"\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\3\2!#\u0081\2\"\3\2\2"+
		"\2\4*\3\2\2\2\6/\3\2\2\2\b\61\3\2\2\2\n\65\3\2\2\2\f8\3\2\2\2\16;\3\2"+
		"\2\2\20D\3\2\2\2\22I\3\2\2\2\24]\3\2\2\2\26_\3\2\2\2\30i\3\2\2\2\32s\3"+
		"\2\2\2\34u\3\2\2\2\36w\3\2\2\2 |\3\2\2\2\"#\7\3\2\2#$\7\"\2\2$%\7\4\2"+
		"\2%&\5\4\3\2&\'\7\5\2\2\'\3\3\2\2\2(+\5\22\n\2)+\3\2\2\2*(\3\2\2\2*)\3"+
		"\2\2\2+\5\3\2\2\2,\60\5\n\6\2-\60\5\f\7\2.\60\5\b\5\2/,\3\2\2\2/-\3\2"+
		"\2\2/.\3\2\2\2\60\7\3\2\2\2\61\62\7!\2\2\62\63\7\6\2\2\63\64\5\30\r\2"+
		"\64\t\3\2\2\2\65\66\7\7\2\2\66\67\7!\2\2\67\13\3\2\2\289\7\b\2\29:\7!"+
		"\2\2:\r\3\2\2\2;<\7\t\2\2<=\7!\2\2=>\7\n\2\2>?\7\13\2\2?@\5\22\n\2@A\7"+
		"\f\2\2A\17\3\2\2\2BE\5\6\4\2CE\5\16\b\2DB\3\2\2\2DC\3\2\2\2E\21\3\2\2"+
		"\2FG\5\24\13\2GH\5\22\n\2HJ\3\2\2\2IF\3\2\2\2IJ\3\2\2\2J\23\3\2\2\2KL"+
		"\7\r\2\2L^\7\n\2\2MN\7\16\2\2N^\7\n\2\2OP\7\17\2\2PQ\7\20\2\2QR\5\36\20"+
		"\2RS\7\21\2\2ST\5 \21\2T^\3\2\2\2U^\5\26\f\2VW\7!\2\2W^\7\n\2\2XY\7\22"+
		"\2\2YZ\7\20\2\2Z[\7!\2\2[^\7\21\2\2\\^\5\20\t\2]K\3\2\2\2]M\3\2\2\2]O"+
		"\3\2\2\2]U\3\2\2\2]V\3\2\2\2]X\3\2\2\2]\\\3\2\2\2^\25\3\2\2\2_`\7\23\2"+
		"\2`a\7\20\2\2ab\7\"\2\2bc\7\21\2\2cd\7\13\2\2de\5\22\n\2ef\7\f\2\2f\27"+
		"\3\2\2\2gj\5\32\16\2hj\5\34\17\2ig\3\2\2\2ih\3\2\2\2j\31\3\2\2\2kt\7\24"+
		"\2\2lt\7\25\2\2mt\7\26\2\2no\7\27\2\2ot\7\30\2\2pt\7\31\2\2qt\7\32\2\2"+
		"rt\7\33\2\2sk\3\2\2\2sl\3\2\2\2sm\3\2\2\2sn\3\2\2\2sp\3\2\2\2sq\3\2\2"+
		"\2sr\3\2\2\2t\33\3\2\2\2uv\t\2\2\2v\35\3\2\2\2wx\7\34\2\2xy\7\35\2\2y"+
		"z\5\30\r\2z{\7\36\2\2{\37\3\2\2\2|}\7\37\2\2}~\5\24\13\2~!\3\2\2\2\t*"+
		"/DI]is";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}