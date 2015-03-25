// Generated from /Users/franco/college/tex/articles/13/cogwed/software/cogwed-mc/src/grammars/CogwedFormulaGrammar.g by ANTLR 4.1
package cogwedmc.formula.formulareader.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CogwedFormulaGrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, INT=20, WS=21, LINE_COMMENT=22, COMMENT=23, 
		ID=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'->'", "']'", "')'", "'.'", "','", "'implies'", "'B'", "'or'", "'['", 
		"'('", "'not'", "'<'", "'='", "'EG'", "'>'", "'and'", "'EX'", "'0'", "'!'", 
		"INT", "WS", "LINE_COMMENT", "COMMENT", "ID"
	};
	public static final String[] ruleNames = {
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "INT", "WS", "LINE_COMMENT", "COMMENT", "ID", "ID_LETTER", 
		"DIGIT"
	};


	public CogwedFormulaGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CogwedFormulaGrammar.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 20: WS_action((RuleContext)_localctx, actionIndex); break;

		case 21: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 22: COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\32\u00a1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\6\25m\n\25\r\25\16"+
		"\25n\3\26\6\26r\n\26\r\26\16\26s\3\26\3\26\3\27\3\27\3\27\3\27\7\27|\n"+
		"\27\f\27\16\27\177\13\27\3\27\5\27\u0082\n\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\7\30\u008c\n\30\f\30\16\30\u008f\13\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\7\31\u0099\n\31\f\31\16\31\u009c\13\31\3\32"+
		"\3\32\3\33\3\33\4}\u008d\34\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t"+
		"\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1"+
		"#\23\1%\24\1\'\25\1)\26\1+\27\2-\30\3/\31\4\61\32\1\63\2\1\65\2\1\3\2"+
		"\5\3\2\62;\5\2\13\f\17\17\"\"\5\2C\\aac|\u00a5\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\67\3\2"+
		"\2\2\5:\3\2\2\2\7<\3\2\2\2\t>\3\2\2\2\13@\3\2\2\2\rB\3\2\2\2\17J\3\2\2"+
		"\2\21L\3\2\2\2\23O\3\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31W\3\2\2\2\33Y\3\2"+
		"\2\2\35[\3\2\2\2\37^\3\2\2\2!`\3\2\2\2#d\3\2\2\2%g\3\2\2\2\'i\3\2\2\2"+
		")l\3\2\2\2+q\3\2\2\2-w\3\2\2\2/\u0087\3\2\2\2\61\u0095\3\2\2\2\63\u009d"+
		"\3\2\2\2\65\u009f\3\2\2\2\678\7/\2\289\7@\2\29\4\3\2\2\2:;\7_\2\2;\6\3"+
		"\2\2\2<=\7+\2\2=\b\3\2\2\2>?\7\60\2\2?\n\3\2\2\2@A\7.\2\2A\f\3\2\2\2B"+
		"C\7k\2\2CD\7o\2\2DE\7r\2\2EF\7n\2\2FG\7k\2\2GH\7g\2\2HI\7u\2\2I\16\3\2"+
		"\2\2JK\7D\2\2K\20\3\2\2\2LM\7q\2\2MN\7t\2\2N\22\3\2\2\2OP\7]\2\2P\24\3"+
		"\2\2\2QR\7*\2\2R\26\3\2\2\2ST\7p\2\2TU\7q\2\2UV\7v\2\2V\30\3\2\2\2WX\7"+
		">\2\2X\32\3\2\2\2YZ\7?\2\2Z\34\3\2\2\2[\\\7G\2\2\\]\7I\2\2]\36\3\2\2\2"+
		"^_\7@\2\2_ \3\2\2\2`a\7c\2\2ab\7p\2\2bc\7f\2\2c\"\3\2\2\2de\7G\2\2ef\7"+
		"Z\2\2f$\3\2\2\2gh\7\62\2\2h&\3\2\2\2ij\7#\2\2j(\3\2\2\2km\t\2\2\2lk\3"+
		"\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o*\3\2\2\2pr\t\3\2\2qp\3\2\2\2rs\3"+
		"\2\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\b\26\2\2v,\3\2\2\2wx\7\61\2\2x"+
		"y\7\61\2\2y}\3\2\2\2z|\13\2\2\2{z\3\2\2\2|\177\3\2\2\2}~\3\2\2\2}{\3\2"+
		"\2\2~\u0081\3\2\2\2\177}\3\2\2\2\u0080\u0082\7\17\2\2\u0081\u0080\3\2"+
		"\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\f\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\b\27\3\2\u0086.\3\2\2\2\u0087\u0088\7\61\2"+
		"\2\u0088\u0089\7,\2\2\u0089\u008d\3\2\2\2\u008a\u008c\13\2\2\2\u008b\u008a"+
		"\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7,\2\2\u0091\u0092\7\61"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\30\4\2\u0094\60\3\2\2\2\u0095\u009a"+
		"\5\63\32\2\u0096\u0099\5\63\32\2\u0097\u0099\5\65\33\2\u0098\u0096\3\2"+
		"\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\62\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\t\4\2"+
		"\2\u009e\64\3\2\2\2\u009f\u00a0\4\62;\2\u00a0\66\3\2\2\2\n\2ns}\u0081"+
		"\u008d\u0098\u009a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}