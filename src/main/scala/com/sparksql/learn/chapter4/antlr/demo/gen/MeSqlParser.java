// Generated from /Users/jiatianyu/IdeaProjects/Home/sparksqlcore/src/main/scala/com/sparksql/learn/chapter4/antlr/demo/MeSqlParser.g4 by ANTLR 4.12.0
package com.sparksql.learn.chapter4.antlr.demo.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MeSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, START=2, STOP=3, AND=4, WS=5;
	public static final int
		RULE_me = 0, RULE_value = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"me", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'{'", "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "START", "STOP", "AND", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "MeSqlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MeSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MeContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(MeSqlParser.START, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode STOP() { return getToken(MeSqlParser.STOP, 0); }
		public List<TerminalNode> AND() { return getTokens(MeSqlParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(MeSqlParser.AND, i);
		}
		public MeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_me; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeSqlParserListener ) ((MeSqlParserListener)listener).enterMe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeSqlParserListener ) ((MeSqlParserListener)listener).exitMe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeSqlParserVisitor ) return ((MeSqlParserVisitor<? extends T>)visitor).visitMe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeContext me() throws RecognitionException {
		MeContext _localctx = new MeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_me);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			match(START);
			setState(5);
			value();
			setState(10);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(6);
				match(AND);
				setState(7);
				value();
				}
				}
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(13);
			match(STOP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public MeContext me() {
			return getRuleContext(MeContext.class,0);
		}
		public TerminalNode INT() { return getToken(MeSqlParser.INT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeSqlParserListener ) ((MeSqlParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeSqlParserListener ) ((MeSqlParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeSqlParserVisitor ) return ((MeSqlParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_value);
		try {
			setState(17);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				me();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0005\u0014\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\t\b\u0000"+
		"\n\u0000\f\u0000\f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0012\b\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000"+
		"\u0000\u0013\u0000\u0004\u0001\u0000\u0000\u0000\u0002\u0011\u0001\u0000"+
		"\u0000\u0000\u0004\u0005\u0005\u0002\u0000\u0000\u0005\n\u0003\u0002\u0001"+
		"\u0000\u0006\u0007\u0005\u0004\u0000\u0000\u0007\t\u0003\u0002\u0001\u0000"+
		"\b\u0006\u0001\u0000\u0000\u0000\t\f\u0001\u0000\u0000\u0000\n\b\u0001"+
		"\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000\u0000\u000b\r\u0001\u0000"+
		"\u0000\u0000\f\n\u0001\u0000\u0000\u0000\r\u000e\u0005\u0003\u0000\u0000"+
		"\u000e\u0001\u0001\u0000\u0000\u0000\u000f\u0012\u0003\u0000\u0000\u0000"+
		"\u0010\u0012\u0005\u0001\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000"+
		"\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0003\u0001\u0000\u0000\u0000"+
		"\u0002\n\u0011";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}