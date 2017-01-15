// Generated from La.g4 by ANTLR 4.5.3
package t3;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, COMENTARIO=27, IDENT=28, NUM_INT=29, NUM_REAL=30, 
		ENTER=31, COMENTARIO_ERRADO=32, SIMBOLO_NAO_INDENTIFICADO=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "COMENTARIO", "IDENT", "NUM_INT", "NUM_REAL", "ENTER", "COMENTARIO_ERRADO", 
		"SIMBOLO_NAO_INDENTIFICADO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'fase:'", "'inicio'", "'fim'", "'='", "'magia'", "'bloco'", "'funcao'", 
		"'()'", "'{\n'", "'}'", "'andar'", "'virar'", "'perguntar'", "'('", "')'", 
		"'usar'", "'repetir'", "'grama'", "'lava'", "'parede'", "'inimigo'", "'proximo_bloco'", 
		"'frente'", "'=='", "'?'", "'sim'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "COMENTARIO", "IDENT", "NUM_INT", "NUM_REAL", "ENTER", 
		"COMENTARIO_ERRADO", "SIMBOLO_NAO_INDENTIFICADO"
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


	    public static String grupo="<<587001, 489336>>";
	    //PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
	   


	public LaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "La.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 31:
			COMENTARIO_ERRADO_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_ERRADO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 ErrosSintaticos.comentario = true;
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u0104\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\7\34\u00d5\n\34\f\34\16\34\u00d8"+
		"\13\34\3\34\3\34\3\34\3\34\3\35\3\35\7\35\u00e0\n\35\f\35\16\35\u00e3"+
		"\13\35\3\36\6\36\u00e6\n\36\r\36\16\36\u00e7\3\37\6\37\u00eb\n\37\r\37"+
		"\16\37\u00ec\3\37\3\37\6\37\u00f1\n\37\r\37\16\37\u00f2\3 \3 \3 \3 \3"+
		"!\3!\3!\7!\u00fc\n!\f!\16!\u00ff\13!\3!\3!\3\"\3\"\3\u00d6\2#\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f%%\u0109\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5K\3\2\2\2"+
		"\7R\3\2\2\2\tV\3\2\2\2\13X\3\2\2\2\r^\3\2\2\2\17d\3\2\2\2\21k\3\2\2\2"+
		"\23n\3\2\2\2\25q\3\2\2\2\27s\3\2\2\2\31y\3\2\2\2\33\177\3\2\2\2\35\u0089"+
		"\3\2\2\2\37\u008b\3\2\2\2!\u008d\3\2\2\2#\u0092\3\2\2\2%\u009a\3\2\2\2"+
		"\'\u00a0\3\2\2\2)\u00a5\3\2\2\2+\u00ac\3\2\2\2-\u00b4\3\2\2\2/\u00c2\3"+
		"\2\2\2\61\u00c9\3\2\2\2\63\u00cc\3\2\2\2\65\u00ce\3\2\2\2\67\u00d2\3\2"+
		"\2\29\u00dd\3\2\2\2;\u00e5\3\2\2\2=\u00ea\3\2\2\2?\u00f4\3\2\2\2A\u00f8"+
		"\3\2\2\2C\u0102\3\2\2\2EF\7h\2\2FG\7c\2\2GH\7u\2\2HI\7g\2\2IJ\7<\2\2J"+
		"\4\3\2\2\2KL\7k\2\2LM\7p\2\2MN\7k\2\2NO\7e\2\2OP\7k\2\2PQ\7q\2\2Q\6\3"+
		"\2\2\2RS\7h\2\2ST\7k\2\2TU\7o\2\2U\b\3\2\2\2VW\7?\2\2W\n\3\2\2\2XY\7o"+
		"\2\2YZ\7c\2\2Z[\7i\2\2[\\\7k\2\2\\]\7c\2\2]\f\3\2\2\2^_\7d\2\2_`\7n\2"+
		"\2`a\7q\2\2ab\7e\2\2bc\7q\2\2c\16\3\2\2\2de\7h\2\2ef\7w\2\2fg\7p\2\2g"+
		"h\7e\2\2hi\7c\2\2ij\7q\2\2j\20\3\2\2\2kl\7*\2\2lm\7+\2\2m\22\3\2\2\2n"+
		"o\7}\2\2op\7\f\2\2p\24\3\2\2\2qr\7\177\2\2r\26\3\2\2\2st\7c\2\2tu\7p\2"+
		"\2uv\7f\2\2vw\7c\2\2wx\7t\2\2x\30\3\2\2\2yz\7x\2\2z{\7k\2\2{|\7t\2\2|"+
		"}\7c\2\2}~\7t\2\2~\32\3\2\2\2\177\u0080\7r\2\2\u0080\u0081\7g\2\2\u0081"+
		"\u0082\7t\2\2\u0082\u0083\7i\2\2\u0083\u0084\7w\2\2\u0084\u0085\7p\2\2"+
		"\u0085\u0086\7v\2\2\u0086\u0087\7c\2\2\u0087\u0088\7t\2\2\u0088\34\3\2"+
		"\2\2\u0089\u008a\7*\2\2\u008a\36\3\2\2\2\u008b\u008c\7+\2\2\u008c \3\2"+
		"\2\2\u008d\u008e\7w\2\2\u008e\u008f\7u\2\2\u008f\u0090\7c\2\2\u0090\u0091"+
		"\7t\2\2\u0091\"\3\2\2\2\u0092\u0093\7t\2\2\u0093\u0094\7g\2\2\u0094\u0095"+
		"\7r\2\2\u0095\u0096\7g\2\2\u0096\u0097\7v\2\2\u0097\u0098\7k\2\2\u0098"+
		"\u0099\7t\2\2\u0099$\3\2\2\2\u009a\u009b\7i\2\2\u009b\u009c\7t\2\2\u009c"+
		"\u009d\7c\2\2\u009d\u009e\7o\2\2\u009e\u009f\7c\2\2\u009f&\3\2\2\2\u00a0"+
		"\u00a1\7n\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7x\2\2\u00a3\u00a4\7c\2\2"+
		"\u00a4(\3\2\2\2\u00a5\u00a6\7r\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7t\2"+
		"\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7f\2\2\u00aa\u00ab\7g\2\2\u00ab*\3\2"+
		"\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7k\2\2\u00af\u00b0"+
		"\7o\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7i\2\2\u00b2\u00b3\7q\2\2\u00b3"+
		",\3\2\2\2\u00b4\u00b5\7r\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7q\2\2\u00b7"+
		"\u00b8\7z\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7o\2\2\u00ba\u00bb\7q\2\2"+
		"\u00bb\u00bc\7a\2\2\u00bc\u00bd\7d\2\2\u00bd\u00be\7n\2\2\u00be\u00bf"+
		"\7q\2\2\u00bf\u00c0\7e\2\2\u00c0\u00c1\7q\2\2\u00c1.\3\2\2\2\u00c2\u00c3"+
		"\7h\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7p\2\2\u00c6"+
		"\u00c7\7v\2\2\u00c7\u00c8\7g\2\2\u00c8\60\3\2\2\2\u00c9\u00ca\7?\2\2\u00ca"+
		"\u00cb\7?\2\2\u00cb\62\3\2\2\2\u00cc\u00cd\7A\2\2\u00cd\64\3\2\2\2\u00ce"+
		"\u00cf\7u\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7o\2\2\u00d1\66\3\2\2\2\u00d2"+
		"\u00d6\7%\2\2\u00d3\u00d5\13\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00da\7%\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\b\34"+
		"\2\2\u00dc8\3\2\2\2\u00dd\u00e1\t\2\2\2\u00de\u00e0\t\3\2\2\u00df\u00de"+
		"\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		":\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\4\62;\2\u00e5\u00e4\3\2\2\2"+
		"\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8<\3"+
		"\2\2\2\u00e9\u00eb\4\62;\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\7\60"+
		"\2\2\u00ef\u00f1\4\62;\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3>\3\2\2\2\u00f4\u00f5\t\4\2\2"+
		"\u00f5\u00f6\3\2\2\2\u00f6\u00f7\b \2\2\u00f7@\3\2\2\2\u00f8\u00f9\b!"+
		"\3\2\u00f9\u00fd\7%\2\2\u00fa\u00fc\n\5\2\2\u00fb\u00fa\3\2\2\2\u00fc"+
		"\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2"+
		"\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7\f\2\2\u0101B\3\2\2\2\u0102\u0103"+
		"\13\2\2\2\u0103D\3\2\2\2\t\2\u00d6\u00e1\u00e7\u00ec\u00f2\u00fd\4\b\2"+
		"\2\3!\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}