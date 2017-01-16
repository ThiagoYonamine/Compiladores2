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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, COMENTARIO=33, IDENT=34, NUM_INT=35, NUM_REAL=36, ENTER=37, 
		COMENTARIO_ERRADO=38, SIMBOLO_NAO_INDENTIFICADO=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "COMENTARIO", 
		"IDENT", "NUM_INT", "NUM_REAL", "ENTER", "COMENTARIO_ERRADO", "SIMBOLO_NAO_INDENTIFICADO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'fase:'", "'inicio'", "'fim'", "'='", "'magia'", "'bloco'", "'funcao'", 
		"'()'", "'{\n'", "'}'", "'andar'", "'virar'", "'perguntar'", "'('", "')'", 
		"'usar'", "'repetir'", "'grama'", "'lava'", "'pedra'", "'gelo'", "'espinho'", 
		"'arvore'", "'caixa'", "'inimigo'", "'fogueira'", "'tronco'", "'fogueira_apagada'", 
		"'frente'", "'=='", "'?'", "'{'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "COMENTARIO", "IDENT", 
		"NUM_INT", "NUM_REAL", "ENTER", "COMENTARIO_ERRADO", "SIMBOLO_NAO_INDENTIFICADO"
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
		case 37:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u013a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\7\"\u010b\n\"\f\"\16\"\u010e\13\"\3\"\3\"\3\"\3\"\3#\3#\7#\u0116\n#\f"+
		"#\16#\u0119\13#\3$\6$\u011c\n$\r$\16$\u011d\3%\6%\u0121\n%\r%\16%\u0122"+
		"\3%\3%\6%\u0127\n%\r%\16%\u0128\3&\3&\3&\3&\3\'\3\'\3\'\7\'\u0132\n\'"+
		"\f\'\16\'\u0135\13\'\3\'\3\'\3(\3(\3\u010c\2)\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2"+
		"\6\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f%%\u013f\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5W\3\2\2\2\7^\3\2"+
		"\2\2\tb\3\2\2\2\13d\3\2\2\2\rj\3\2\2\2\17p\3\2\2\2\21w\3\2\2\2\23z\3\2"+
		"\2\2\25}\3\2\2\2\27\177\3\2\2\2\31\u0085\3\2\2\2\33\u008b\3\2\2\2\35\u0095"+
		"\3\2\2\2\37\u0097\3\2\2\2!\u0099\3\2\2\2#\u009e\3\2\2\2%\u00a6\3\2\2\2"+
		"\'\u00ac\3\2\2\2)\u00b1\3\2\2\2+\u00b7\3\2\2\2-\u00bc\3\2\2\2/\u00c4\3"+
		"\2\2\2\61\u00cb\3\2\2\2\63\u00d1\3\2\2\2\65\u00d9\3\2\2\2\67\u00e2\3\2"+
		"\2\29\u00e9\3\2\2\2;\u00fa\3\2\2\2=\u0101\3\2\2\2?\u0104\3\2\2\2A\u0106"+
		"\3\2\2\2C\u0108\3\2\2\2E\u0113\3\2\2\2G\u011b\3\2\2\2I\u0120\3\2\2\2K"+
		"\u012a\3\2\2\2M\u012e\3\2\2\2O\u0138\3\2\2\2QR\7h\2\2RS\7c\2\2ST\7u\2"+
		"\2TU\7g\2\2UV\7<\2\2V\4\3\2\2\2WX\7k\2\2XY\7p\2\2YZ\7k\2\2Z[\7e\2\2[\\"+
		"\7k\2\2\\]\7q\2\2]\6\3\2\2\2^_\7h\2\2_`\7k\2\2`a\7o\2\2a\b\3\2\2\2bc\7"+
		"?\2\2c\n\3\2\2\2de\7o\2\2ef\7c\2\2fg\7i\2\2gh\7k\2\2hi\7c\2\2i\f\3\2\2"+
		"\2jk\7d\2\2kl\7n\2\2lm\7q\2\2mn\7e\2\2no\7q\2\2o\16\3\2\2\2pq\7h\2\2q"+
		"r\7w\2\2rs\7p\2\2st\7e\2\2tu\7c\2\2uv\7q\2\2v\20\3\2\2\2wx\7*\2\2xy\7"+
		"+\2\2y\22\3\2\2\2z{\7}\2\2{|\7\f\2\2|\24\3\2\2\2}~\7\177\2\2~\26\3\2\2"+
		"\2\177\u0080\7c\2\2\u0080\u0081\7p\2\2\u0081\u0082\7f\2\2\u0082\u0083"+
		"\7c\2\2\u0083\u0084\7t\2\2\u0084\30\3\2\2\2\u0085\u0086\7x\2\2\u0086\u0087"+
		"\7k\2\2\u0087\u0088\7t\2\2\u0088\u0089\7c\2\2\u0089\u008a\7t\2\2\u008a"+
		"\32\3\2\2\2\u008b\u008c\7r\2\2\u008c\u008d\7g\2\2\u008d\u008e\7t\2\2\u008e"+
		"\u008f\7i\2\2\u008f\u0090\7w\2\2\u0090\u0091\7p\2\2\u0091\u0092\7v\2\2"+
		"\u0092\u0093\7c\2\2\u0093\u0094\7t\2\2\u0094\34\3\2\2\2\u0095\u0096\7"+
		"*\2\2\u0096\36\3\2\2\2\u0097\u0098\7+\2\2\u0098 \3\2\2\2\u0099\u009a\7"+
		"w\2\2\u009a\u009b\7u\2\2\u009b\u009c\7c\2\2\u009c\u009d\7t\2\2\u009d\""+
		"\3\2\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7r\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7t\2\2"+
		"\u00a5$\3\2\2\2\u00a6\u00a7\7i\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7c\2"+
		"\2\u00a9\u00aa\7o\2\2\u00aa\u00ab\7c\2\2\u00ab&\3\2\2\2\u00ac\u00ad\7"+
		"n\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7x\2\2\u00af\u00b0\7c\2\2\u00b0("+
		"\3\2\2\2\u00b1\u00b2\7r\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7f\2\2\u00b4"+
		"\u00b5\7t\2\2\u00b5\u00b6\7c\2\2\u00b6*\3\2\2\2\u00b7\u00b8\7i\2\2\u00b8"+
		"\u00b9\7g\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7q\2\2\u00bb,\3\2\2\2\u00bc"+
		"\u00bd\7g\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7r\2\2\u00bf\u00c0\7k\2\2"+
		"\u00c0\u00c1\7p\2\2\u00c1\u00c2\7j\2\2\u00c2\u00c3\7q\2\2\u00c3.\3\2\2"+
		"\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7x\2\2\u00c7\u00c8"+
		"\7q\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7g\2\2\u00ca\60\3\2\2\2\u00cb\u00cc"+
		"\7e\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7z\2\2\u00cf"+
		"\u00d0\7c\2\2\u00d0\62\3\2\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7p\2\2\u00d3"+
		"\u00d4\7k\2\2\u00d4\u00d5\7o\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7i\2\2"+
		"\u00d7\u00d8\7q\2\2\u00d8\64\3\2\2\2\u00d9\u00da\7h\2\2\u00da\u00db\7"+
		"q\2\2\u00db\u00dc\7i\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de\7g\2\2\u00de\u00df"+
		"\7k\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7c\2\2\u00e1\66\3\2\2\2\u00e2\u00e3"+
		"\7v\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7p\2\2\u00e6"+
		"\u00e7\7e\2\2\u00e7\u00e8\7q\2\2\u00e88\3\2\2\2\u00e9\u00ea\7h\2\2\u00ea"+
		"\u00eb\7q\2\2\u00eb\u00ec\7i\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7g\2\2"+
		"\u00ee\u00ef\7k\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2"+
		"\7a\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7r\2\2\u00f4\u00f5\7c\2\2\u00f5"+
		"\u00f6\7i\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7f\2\2\u00f8\u00f9\7c\2\2"+
		"\u00f9:\3\2\2\2\u00fa\u00fb\7h\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7g\2"+
		"\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7g\2\2\u0100<\3\2"+
		"\2\2\u0101\u0102\7?\2\2\u0102\u0103\7?\2\2\u0103>\3\2\2\2\u0104\u0105"+
		"\7A\2\2\u0105@\3\2\2\2\u0106\u0107\7}\2\2\u0107B\3\2\2\2\u0108\u010c\7"+
		"%\2\2\u0109\u010b\13\2\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010f\u0110\7%\2\2\u0110\u0111\3\2\2\2\u0111\u0112\b\"\2\2\u0112"+
		"D\3\2\2\2\u0113\u0117\t\2\2\2\u0114\u0116\t\3\2\2\u0115\u0114\3\2\2\2"+
		"\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118F\3"+
		"\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c\4\62;\2\u011b\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011eH\3\2\2\2"+
		"\u011f\u0121\4\62;\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\7\60\2\2"+
		"\u0125\u0127\4\62;\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129J\3\2\2\2\u012a\u012b\t\4\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\b&\2\2\u012dL\3\2\2\2\u012e\u012f\b\'\3\2\u012f"+
		"\u0133\7%\2\2\u0130\u0132\n\5\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0136\u0137\7\f\2\2\u0137N\3\2\2\2\u0138\u0139\13\2\2\2"+
		"\u0139P\3\2\2\2\t\2\u010c\u0117\u011d\u0122\u0128\u0133\4\b\2\2\3\'\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}