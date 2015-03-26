// Generated from /Users/franco/college/mysoft/mccogwed/src/grammars/CogwedModelGrammar.g by ANTLR 4.5
package cogwedmc.model.modelreader.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CogwedModelGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NONZEROINT=11, INT=12, WS=13, LINE_COMMENT=14, COMMENT=15, ID=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "NONZEROINT", "INT", "WS", "LINE_COMMENT", "COMMENT", "ID", "ID_LETTER", 
		"DIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'N'", "'n'", "'='", "';'", "'('", "','", "')'", "'RT'", "'{'", 
		"'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "NONZEROINT", 
		"INT", "WS", "LINE_COMMENT", "COMMENT", "ID"
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


	public CogwedModelGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CogwedModelGrammar.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\7\f?\n\f\f\f\16\fB\13\f\3\r\6\rE\n"+
		"\r\r\r\16\rF\3\16\6\16J\n\16\r\16\16\16K\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\7\17T\n\17\f\17\16\17W\13\17\3\17\5\17Z\n\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\7\20d\n\20\f\20\16\20g\13\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\7\21q\n\21\f\21\16\21t\13\21\3\22\3\22\3\23\3\23\4Ue\2"+
		"\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\2%\2\3\2\6\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\5\2C\\aa"+
		"c|~\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3\'"+
		"\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r\61\3\2\2\2\17"+
		"\63\3\2\2\2\21\65\3\2\2\2\238\3\2\2\2\25:\3\2\2\2\27<\3\2\2\2\31D\3\2"+
		"\2\2\33I\3\2\2\2\35O\3\2\2\2\37_\3\2\2\2!m\3\2\2\2#u\3\2\2\2%w\3\2\2\2"+
		"\'(\7P\2\2(\4\3\2\2\2)*\7p\2\2*\6\3\2\2\2+,\7?\2\2,\b\3\2\2\2-.\7=\2\2"+
		".\n\3\2\2\2/\60\7*\2\2\60\f\3\2\2\2\61\62\7.\2\2\62\16\3\2\2\2\63\64\7"+
		"+\2\2\64\20\3\2\2\2\65\66\7T\2\2\66\67\7V\2\2\67\22\3\2\2\289\7}\2\29"+
		"\24\3\2\2\2:;\7\177\2\2;\26\3\2\2\2<@\t\2\2\2=?\t\3\2\2>=\3\2\2\2?B\3"+
		"\2\2\2@>\3\2\2\2@A\3\2\2\2A\30\3\2\2\2B@\3\2\2\2CE\t\3\2\2DC\3\2\2\2E"+
		"F\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\32\3\2\2\2HJ\t\4\2\2IH\3\2\2\2JK\3\2\2"+
		"\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\b\16\2\2N\34\3\2\2\2OP\7\61\2\2PQ\7"+
		"\61\2\2QU\3\2\2\2RT\13\2\2\2SR\3\2\2\2TW\3\2\2\2UV\3\2\2\2US\3\2\2\2V"+
		"Y\3\2\2\2WU\3\2\2\2XZ\7\17\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\f\2"+
		"\2\\]\3\2\2\2]^\b\17\2\2^\36\3\2\2\2_`\7\61\2\2`a\7,\2\2ae\3\2\2\2bd\13"+
		"\2\2\2cb\3\2\2\2dg\3\2\2\2ef\3\2\2\2ec\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7"+
		",\2\2ij\7\61\2\2jk\3\2\2\2kl\b\20\2\2l \3\2\2\2mr\5#\22\2nq\5#\22\2oq"+
		"\5%\23\2pn\3\2\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\"\3\2\2\2"+
		"tr\3\2\2\2uv\t\5\2\2v$\3\2\2\2wx\4\62;\2x&\3\2\2\2\13\2@FKUYepr\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}