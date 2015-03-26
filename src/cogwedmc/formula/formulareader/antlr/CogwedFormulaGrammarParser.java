// Generated from /Users/franco/college/mysoft/mccogwed/src/grammars/CogwedFormulaGrammar.g by ANTLR 4.5
package cogwedmc.formula.formulareader.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CogwedFormulaGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, INT=20, WS=21, LINE_COMMENT=22, COMMENT=23, ID=24;
	public static final int
		RULE_start = 0, RULE_formula = 1, RULE_comparisonexpr = 2, RULE_comparisonoperator = 3, 
		RULE_comparisonvalue = 4, RULE_agentid = 5;
	public static final String[] ruleNames = {
		"start", "formula", "comparisonexpr", "comparisonoperator", "comparisonvalue", 
		"agentid"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", "'not'", "'and'", "'or'", "'implies'", "'->'", "'EX'", "'EG'", 
		"'B'", "'('", "','", "')'", "'['", "']'", "'<'", "'>'", "'='", "'0'", 
		"'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "INT", "WS", "LINE_COMMENT", 
		"COMMENT", "ID"
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
	public String getGrammarFileName() { return "CogwedFormulaGrammar.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CogwedFormulaGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			formula(0);
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

	public static class FormulaContext extends ParserRuleContext {
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
	 
		public FormulaContext() { }
		public void copyFrom(FormulaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BeliefContext extends FormulaContext {
		public ComparisonexprContext comparisonexpr() {
			return getRuleContext(ComparisonexprContext.class,0);
		}
		public AgentidContext agentid() {
			return getRuleContext(AgentidContext.class,0);
		}
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public BeliefContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).enterBelief(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).exitBelief(this);
		}
	}
	public static class EgContext extends FormulaContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public EgContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).enterEg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).exitEg(this);
		}
	}
	public static class ParensContext extends FormulaContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public ParensContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).exitParens(this);
		}
	}
	public static class DisjunctionContext extends FormulaContext {
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public DisjunctionContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).exitDisjunction(this);
		}
	}
	public static class ExContext extends FormulaContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public ExContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).enterEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).exitEx(this);
		}
	}
	public static class NegationContext extends FormulaContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public NegationContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).exitNegation(this);
		}
	}
	public static class ConjunctionContext extends FormulaContext {
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ConjunctionContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).exitConjunction(this);
		}
	}
	public static class IdContext extends FormulaContext {
		public TerminalNode ID() { return getToken(CogwedFormulaGrammarParser.ID, 0); }
		public IdContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).exitId(this);
		}
	}
	public static class ImplicationContext extends FormulaContext {
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ImplicationContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).enterImplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).exitImplication(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		return formula(0);
	}

	private FormulaContext formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FormulaContext _localctx = new FormulaContext(_ctx, _parentState);
		FormulaContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_formula, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(15);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(16);
				formula(9);
				}
				break;
			case T__6:
				{
				_localctx = new ExContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(17);
				match(T__6);
				setState(18);
				formula(5);
				}
				break;
			case T__7:
				{
				_localctx = new EgContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(19);
				match(T__7);
				setState(20);
				formula(4);
				}
				break;
			case T__8:
				{
				_localctx = new BeliefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(21);
				match(T__8);
				setState(22);
				comparisonexpr();
				setState(23);
				match(T__9);
				setState(24);
				agentid();
				setState(25);
				match(T__10);
				setState(26);
				formula(0);
				setState(27);
				match(T__11);
				}
				break;
			case T__9:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				match(T__9);
				setState(30);
				formula(0);
				setState(31);
				match(T__11);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(45);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ConjunctionContext(new FormulaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(36);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(37);
						match(T__2);
						setState(38);
						formula(9);
						}
						break;
					case 2:
						{
						_localctx = new DisjunctionContext(new FormulaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(39);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(40);
						match(T__3);
						setState(41);
						formula(8);
						}
						break;
					case 3:
						{
						_localctx = new ImplicationContext(new FormulaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(42);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(43);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(44);
						formula(7);
						}
						break;
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonexprContext extends ParserRuleContext {
		public ComparisonoperatorContext comparisonoperator() {
			return getRuleContext(ComparisonoperatorContext.class,0);
		}
		public ComparisonvalueContext comparisonvalue() {
			return getRuleContext(ComparisonvalueContext.class,0);
		}
		public ComparisonexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).enterComparisonexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).exitComparisonexpr(this);
		}
	}

	public final ComparisonexprContext comparisonexpr() throws RecognitionException {
		ComparisonexprContext _localctx = new ComparisonexprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comparisonexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__12);
			setState(51);
			comparisonoperator();
			setState(52);
			comparisonvalue();
			setState(53);
			match(T__13);
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

	public static class ComparisonoperatorContext extends ParserRuleContext {
		public ComparisonoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).enterComparisonoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).exitComparisonoperator(this);
		}
	}

	public final ComparisonoperatorContext comparisonoperator() throws RecognitionException {
		ComparisonoperatorContext _localctx = new ComparisonoperatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comparisonoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
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

	public static class ComparisonvalueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CogwedFormulaGrammarParser.INT, 0); }
		public ComparisonvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).enterComparisonvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).exitComparisonvalue(this);
		}
	}

	public final ComparisonvalueContext comparisonvalue() throws RecognitionException {
		ComparisonvalueContext _localctx = new ComparisonvalueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comparisonvalue);
		int _la;
		try {
			setState(63);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(57);
					match(T__17);
					}
				}

				setState(60);
				match(T__18);
				setState(61);
				match(INT);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(INT);
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

	public static class AgentidContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CogwedFormulaGrammarParser.INT, 0); }
		public AgentidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agentid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).enterAgentid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedFormulaGrammarListener ) ((CogwedFormulaGrammarListener)listener).exitAgentid(this);
		}
	}

	public final AgentidContext agentid() throws RecognitionException {
		AgentidContext _localctx = new AgentidContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_agentid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(INT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return formula_sempred((FormulaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean formula_sempred(FormulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32F\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3%\n\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3\63\13\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\5\6=\n\6\3\6\3\6\3\6\5\6B\n\6\3\7\3\7\3\7\2\3\4\b\2"+
		"\4\6\b\n\f\2\5\3\2\3\4\3\2\7\b\3\2\21\23I\2\16\3\2\2\2\4$\3\2\2\2\6\64"+
		"\3\2\2\2\b9\3\2\2\2\nA\3\2\2\2\fC\3\2\2\2\16\17\5\4\3\2\17\3\3\2\2\2\20"+
		"\21\b\3\1\2\21\22\t\2\2\2\22%\5\4\3\13\23\24\7\t\2\2\24%\5\4\3\7\25\26"+
		"\7\n\2\2\26%\5\4\3\6\27\30\7\13\2\2\30\31\5\6\4\2\31\32\7\f\2\2\32\33"+
		"\5\f\7\2\33\34\7\r\2\2\34\35\5\4\3\2\35\36\7\16\2\2\36%\3\2\2\2\37 \7"+
		"\f\2\2 !\5\4\3\2!\"\7\16\2\2\"%\3\2\2\2#%\7\32\2\2$\20\3\2\2\2$\23\3\2"+
		"\2\2$\25\3\2\2\2$\27\3\2\2\2$\37\3\2\2\2$#\3\2\2\2%\61\3\2\2\2&\'\f\n"+
		"\2\2\'(\7\5\2\2(\60\5\4\3\13)*\f\t\2\2*+\7\6\2\2+\60\5\4\3\n,-\f\b\2\2"+
		"-.\t\3\2\2.\60\5\4\3\t/&\3\2\2\2/)\3\2\2\2/,\3\2\2\2\60\63\3\2\2\2\61"+
		"/\3\2\2\2\61\62\3\2\2\2\62\5\3\2\2\2\63\61\3\2\2\2\64\65\7\17\2\2\65\66"+
		"\5\b\5\2\66\67\5\n\6\2\678\7\20\2\28\7\3\2\2\29:\t\4\2\2:\t\3\2\2\2;="+
		"\7\24\2\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\25\2\2?B\7\26\2\2@B\7\26\2"+
		"\2A<\3\2\2\2A@\3\2\2\2B\13\3\2\2\2CD\7\26\2\2D\r\3\2\2\2\7$/\61<A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}