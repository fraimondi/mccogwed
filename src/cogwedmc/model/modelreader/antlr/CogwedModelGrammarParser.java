// Generated from /Users/franco/college/tex/articles/13/cogwed/software/cogwed-mc/src/grammars/CogwedModelGrammar.g by ANTLR 4.1
package cogwedmc.model.modelreader.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CogwedModelGrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, NONZEROINT=11, INT=12, WS=13, LINE_COMMENT=14, COMMENT=15, ID=16;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "')'", "','", "'n'", "'RT'", "'('", "'='", "'}'", 
		"';'", "'N'", "NONZEROINT", "INT", "WS", "LINE_COMMENT", "COMMENT", "ID"
	};
	public static final int
		RULE_cogwed_model_file = 0, RULE_nofagents = 1, RULE_statesdef = 2, RULE_statedef = 3, 
		RULE_lstateslist = 4, RULE_tempreldef = 5, RULE_pairofstates = 6, RULE_atomsdef = 7, 
		RULE_singledef = 8, RULE_gstateslist = 9;
	public static final String[] ruleNames = {
		"cogwed_model_file", "nofagents", "statesdef", "statedef", "lstateslist", 
		"tempreldef", "pairofstates", "atomsdef", "singledef", "gstateslist"
	};

	@Override
	public String getGrammarFileName() { return "CogwedModelGrammar.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CogwedModelGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Cogwed_model_fileContext extends ParserRuleContext {
		public StatesdefContext statesdef() {
			return getRuleContext(StatesdefContext.class,0);
		}
		public TempreldefContext tempreldef() {
			return getRuleContext(TempreldefContext.class,0);
		}
		public NofagentsContext nofagents() {
			return getRuleContext(NofagentsContext.class,0);
		}
		public AtomsdefContext atomsdef() {
			return getRuleContext(AtomsdefContext.class,0);
		}
		public Cogwed_model_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cogwed_model_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedModelGrammarListener ) ((CogwedModelGrammarListener)listener).enterCogwed_model_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedModelGrammarListener ) ((CogwedModelGrammarListener)listener).exitCogwed_model_file(this);
		}
	}

	public final Cogwed_model_fileContext cogwed_model_file() throws RecognitionException {
		Cogwed_model_fileContext _localctx = new Cogwed_model_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cogwed_model_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); nofagents();
			setState(21); statesdef();
			setState(22); tempreldef();
			setState(23); atomsdef();
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

	public static class NofagentsContext extends ParserRuleContext {
		public TerminalNode NONZEROINT() { return getToken(CogwedModelGrammarParser.NONZEROINT, 0); }
		public NofagentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nofagents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedModelGrammarListener ) ((CogwedModelGrammarListener)listener).enterNofagents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedModelGrammarListener ) ((CogwedModelGrammarListener)listener).exitNofagents(this);
		}
	}

	public final NofagentsContext nofagents() throws RecognitionException {
		NofagentsContext _localctx = new NofagentsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nofagents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_la = _input.LA(1);
			if ( !(_la==4 || _la==10) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(26); match(7);
			setState(27); match(NONZEROINT);
			setState(28); match(9);
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

	public static class StatesdefContext extends ParserRuleContext {
		public StatedefContext statedef(int i) {
			return getRuleContext(StatedefContext.class,i);
		}
		public List<StatedefContext> statedef() {
			return getRuleContexts(StatedefContext.class);
		}
		public StatesdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statesdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedModelGrammarListener ) ((CogwedModelGrammarListener)listener).enterStatesdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedModelGrammarListener ) ((CogwedModelGrammarListener)listener).exitStatesdef(this);
		}
	}

	public final StatesdefContext statesdef() throws RecognitionException {
		StatesdefContext _localctx = new StatesdefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statesdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30); statedef();
				setState(31); match(9);
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class StatedefContext extends ParserRuleContext {
		public LstateslistContext lstateslist() {
			return getRuleContext(LstateslistContext.class,0);
		}
		public TerminalNode ID() { return getToken(CogwedModelGrammarParser.ID, 0); }
		public StatedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statedef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedModelGrammarListener ) ((CogwedModelGrammarListener)listener).enterStatedef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedModelGrammarListener ) ((CogwedModelGrammarListener)listener).exitStatedef(this);
		}
	}

	public final StatedefContext statedef() throws RecognitionException {
		StatedefContext _localctx = new StatedefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statedef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(ID);
			setState(38); match(7);
			setState(39); lstateslist();
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

	public static class LstateslistContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CogwedModelGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CogwedModelGrammarParser.ID, i);
		}
		public LstateslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lstateslist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedModelGrammarListener ) ((CogwedModelGrammarListener)listener).enterLstateslist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedModelGrammarListener ) ((CogwedModelGrammarListener)listener).exitLstateslist(this);
		}
	}

	public final LstateslistContext lstateslist() throws RecognitionException {
		LstateslistContext _localctx = new LstateslistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lstateslist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); match(6);
			setState(42); match(ID);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(43); match(3);
				setState(44); match(ID);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50); match(2);
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

	public static class TempreldefContext extends ParserRuleContext {
		public List<PairofstatesContext> pairofstates() {
			return getRuleContexts(PairofstatesContext.class);
		}
		public PairofstatesContext pairofstates(int i) {
			return getRuleContext(PairofstatesContext.class,i);
		}
		public TempreldefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempreldef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedModelGrammarListener ) ((CogwedModelGrammarListener)listener).enterTempreldef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedModelGrammarListener ) ((CogwedModelGrammarListener)listener).exitTempreldef(this);
		}
	}

	public final TempreldefContext tempreldef() throws RecognitionException {
		TempreldefContext _localctx = new TempreldefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tempreldef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(5);
			setState(53); match(7);
			setState(54); match(1);
			setState(55); pairofstates();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(56); match(3);
				setState(57); pairofstates();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63); match(8);
			setState(64); match(9);
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

	public static class PairofstatesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CogwedModelGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CogwedModelGrammarParser.ID, i);
		}
		public PairofstatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairofstates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedModelGrammarListener ) ((CogwedModelGrammarListener)listener).enterPairofstates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedModelGrammarListener ) ((CogwedModelGrammarListener)listener).exitPairofstates(this);
		}
	}

	public final PairofstatesContext pairofstates() throws RecognitionException {
		PairofstatesContext _localctx = new PairofstatesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pairofstates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(6);
			setState(67); match(ID);
			setState(68); match(3);
			setState(69); match(ID);
			setState(70); match(2);
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

	public static class AtomsdefContext extends ParserRuleContext {
		public List<SingledefContext> singledef() {
			return getRuleContexts(SingledefContext.class);
		}
		public SingledefContext singledef(int i) {
			return getRuleContext(SingledefContext.class,i);
		}
		public AtomsdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomsdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedModelGrammarListener ) ((CogwedModelGrammarListener)listener).enterAtomsdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedModelGrammarListener ) ((CogwedModelGrammarListener)listener).exitAtomsdef(this);
		}
	}

	public final AtomsdefContext atomsdef() throws RecognitionException {
		AtomsdefContext _localctx = new AtomsdefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atomsdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(72); singledef();
				setState(73); match(9);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SingledefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CogwedModelGrammarParser.ID, 0); }
		public GstateslistContext gstateslist() {
			return getRuleContext(GstateslistContext.class,0);
		}
		public SingledefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singledef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedModelGrammarListener ) ((CogwedModelGrammarListener)listener).enterSingledef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedModelGrammarListener ) ((CogwedModelGrammarListener)listener).exitSingledef(this);
		}
	}

	public final SingledefContext singledef() throws RecognitionException {
		SingledefContext _localctx = new SingledefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_singledef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(ID);
			setState(81); match(7);
			setState(82); match(1);
			setState(83); gstateslist();
			setState(84); match(8);
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

	public static class GstateslistContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CogwedModelGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CogwedModelGrammarParser.ID, i);
		}
		public GstateslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gstateslist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedModelGrammarListener ) ((CogwedModelGrammarListener)listener).enterGstateslist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CogwedModelGrammarListener ) ((CogwedModelGrammarListener)listener).exitGstateslist(this);
		}
	}

	public final GstateslistContext gstateslist() throws RecognitionException {
		GstateslistContext _localctx = new GstateslistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_gstateslist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(ID);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(87); match(3);
				setState(88); match(ID);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\22a\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\6\4$\n\4\r\4\16\4%"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\60\n\6\f\6\16\6\63\13\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7=\n\7\f\7\16\7@\13\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\7\tN\n\t\f\t\16\tQ\13\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\7\13\\\n\13\f\13\16\13_\13\13\3\13\2\f\2\4\6\b\n\f\16"+
		"\20\22\24\2\3\4\2\6\6\f\f[\2\26\3\2\2\2\4\33\3\2\2\2\6#\3\2\2\2\b\'\3"+
		"\2\2\2\n+\3\2\2\2\f\66\3\2\2\2\16D\3\2\2\2\20O\3\2\2\2\22R\3\2\2\2\24"+
		"X\3\2\2\2\26\27\5\4\3\2\27\30\5\6\4\2\30\31\5\f\7\2\31\32\5\20\t\2\32"+
		"\3\3\2\2\2\33\34\t\2\2\2\34\35\7\t\2\2\35\36\7\r\2\2\36\37\7\13\2\2\37"+
		"\5\3\2\2\2 !\5\b\5\2!\"\7\13\2\2\"$\3\2\2\2# \3\2\2\2$%\3\2\2\2%#\3\2"+
		"\2\2%&\3\2\2\2&\7\3\2\2\2\'(\7\22\2\2()\7\t\2\2)*\5\n\6\2*\t\3\2\2\2+"+
		",\7\b\2\2,\61\7\22\2\2-.\7\5\2\2.\60\7\22\2\2/-\3\2\2\2\60\63\3\2\2\2"+
		"\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\4\2\2\65"+
		"\13\3\2\2\2\66\67\7\7\2\2\678\7\t\2\289\7\3\2\29>\5\16\b\2:;\7\5\2\2;"+
		"=\5\16\b\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2"+
		"AB\7\n\2\2BC\7\13\2\2C\r\3\2\2\2DE\7\b\2\2EF\7\22\2\2FG\7\5\2\2GH\7\22"+
		"\2\2HI\7\4\2\2I\17\3\2\2\2JK\5\22\n\2KL\7\13\2\2LN\3\2\2\2MJ\3\2\2\2N"+
		"Q\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\21\3\2\2\2QO\3\2\2\2RS\7\22\2\2ST\7\t\2"+
		"\2TU\7\3\2\2UV\5\24\13\2VW\7\n\2\2W\23\3\2\2\2X]\7\22\2\2YZ\7\5\2\2Z\\"+
		"\7\22\2\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\25\3\2\2\2_]\3\2\2"+
		"\2\7%\61>O]";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}