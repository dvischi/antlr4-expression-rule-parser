// Generated from src/main/antlr4/io/github/dvischi/expr_rule_parser/ExprRuleParser.g4 by ANTLR 4.13.2
package io.github.dvischi.expr_rule_parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprRuleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, FUNC=2, RULE=3, DQUOTE=4, LPAREN=5, RPAREN=6, LBRACK=7, RBRACK=8, 
		COLON=9, SEMI=10, COMMA=11, ARROW=12, NOT=13, AND=14, OR=15, ASSIGNMENT=16, 
		GT=17, LT=18, EQUAL=19, NOTEQUAL=20, ADD=21, SUB=22, MUL=23, DIV=24, CONTAINS=25, 
		CONTAINSALL=26, WS=27, BOOLEAN=28, NUMBER=29, WORD=30, STRING=31;
	public static final int
		RULE_stmts = 0, RULE_stmt = 1, RULE_varDefStmt = 2, RULE_funcDefStmt = 3, 
		RULE_funcDefParams = 4, RULE_ruleStmt = 5, RULE_baseExpr = 6, RULE_andExpr = 7, 
		RULE_notExpr = 8, RULE_relExpr = 9, RULE_addExpr = 10, RULE_mulExpr = 11, 
		RULE_relOpr = 12, RULE_addOpr = 13, RULE_mulOpr = 14, RULE_literal = 15, 
		RULE_listItem = 16, RULE_list = 17, RULE_funcParams = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"stmts", "stmt", "varDefStmt", "funcDefStmt", "funcDefParams", "ruleStmt", 
			"baseExpr", "andExpr", "notExpr", "relExpr", "addExpr", "mulExpr", "relOpr", 
			"addOpr", "mulOpr", "literal", "listItem", "list", "funcParams"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'func'", "'rule'", "'\"'", "'('", "')'", "'['", "']'", 
			"':'", "';'", "','", "'->'", "'not'", "'and'", "'or'", "'='", "'>'", 
			"'<'", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'contains'", "'contains all'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VAR", "FUNC", "RULE", "DQUOTE", "LPAREN", "RPAREN", "LBRACK", 
			"RBRACK", "COLON", "SEMI", "COMMA", "ARROW", "NOT", "AND", "OR", "ASSIGNMENT", 
			"GT", "LT", "EQUAL", "NOTEQUAL", "ADD", "SUB", "MUL", "DIV", "CONTAINS", 
			"CONTAINSALL", "WS", "BOOLEAN", "NUMBER", "WORD", "STRING"
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
	public String getGrammarFileName() { return "ExprRuleParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprRuleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtsContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(ExprRuleParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ExprRuleParser.WS, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).exitStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRuleParserVisitor ) return ((ExprRuleParserVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(38);
				match(WS);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
				{
				{
				setState(44);
				stmt();
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(45);
					match(WS);
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(55);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public VarDefStmtContext varDefStmt() {
			return getRuleContext(VarDefStmtContext.class,0);
		}
		public FuncDefStmtContext funcDefStmt() {
			return getRuleContext(FuncDefStmtContext.class,0);
		}
		public RuleStmtContext ruleStmt() {
			return getRuleContext(RuleStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRuleParserVisitor ) return ((ExprRuleParserVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				varDefStmt();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				funcDefStmt();
				}
				break;
			case RULE:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				ruleStmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDefStmtContext extends ParserRuleContext {
		public Token varName;
		public BaseExprContext varDef;
		public TerminalNode VAR() { return getToken(ExprRuleParser.VAR, 0); }
		public TerminalNode COLON() { return getToken(ExprRuleParser.COLON, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(ExprRuleParser.ASSIGNMENT, 0); }
		public TerminalNode SEMI() { return getToken(ExprRuleParser.SEMI, 0); }
		public TerminalNode WORD() { return getToken(ExprRuleParser.WORD, 0); }
		public BaseExprContext baseExpr() {
			return getRuleContext(BaseExprContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ExprRuleParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ExprRuleParser.WS, i);
		}
		public VarDefStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).enterVarDefStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).exitVarDefStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRuleParserVisitor ) return ((ExprRuleParserVisitor<? extends T>)visitor).visitVarDefStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefStmtContext varDefStmt() throws RecognitionException {
		VarDefStmtContext _localctx = new VarDefStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDefStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(VAR);
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				match(WS);
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(67);
			((VarDefStmtContext)_localctx).varName = match(WORD);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(68);
				match(WS);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(COLON);
			setState(75);
			match(ASSIGNMENT);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(76);
				match(WS);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			((VarDefStmtContext)_localctx).varDef = baseExpr();
			setState(83);
			match(SEMI);
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
	public static class FuncDefStmtContext extends ParserRuleContext {
		public Token funcName;
		public BaseExprContext funcDef;
		public TerminalNode FUNC() { return getToken(ExprRuleParser.FUNC, 0); }
		public TerminalNode COLON() { return getToken(ExprRuleParser.COLON, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(ExprRuleParser.ASSIGNMENT, 0); }
		public TerminalNode LPAREN() { return getToken(ExprRuleParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ExprRuleParser.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(ExprRuleParser.ARROW, 0); }
		public TerminalNode SEMI() { return getToken(ExprRuleParser.SEMI, 0); }
		public TerminalNode WORD() { return getToken(ExprRuleParser.WORD, 0); }
		public BaseExprContext baseExpr() {
			return getRuleContext(BaseExprContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ExprRuleParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ExprRuleParser.WS, i);
		}
		public FuncDefParamsContext funcDefParams() {
			return getRuleContext(FuncDefParamsContext.class,0);
		}
		public FuncDefStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).enterFuncDefStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).exitFuncDefStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRuleParserVisitor ) return ((ExprRuleParserVisitor<? extends T>)visitor).visitFuncDefStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefStmtContext funcDefStmt() throws RecognitionException {
		FuncDefStmtContext _localctx = new FuncDefStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcDefStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(FUNC);
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				match(WS);
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(91);
			((FuncDefStmtContext)_localctx).funcName = match(WORD);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(92);
				match(WS);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(COLON);
			setState(99);
			match(ASSIGNMENT);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(100);
				match(WS);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(LPAREN);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==WORD) {
				{
				setState(107);
				funcDefParams();
				}
			}

			setState(110);
			match(RPAREN);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(111);
				match(WS);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(ARROW);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(118);
				match(WS);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			((FuncDefStmtContext)_localctx).funcDef = baseExpr();
			setState(125);
			match(SEMI);
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
	public static class FuncDefParamsContext extends ParserRuleContext {
		public Token paramName;
		public Token addParamName;
		public List<TerminalNode> WORD() { return getTokens(ExprRuleParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ExprRuleParser.WORD, i);
		}
		public List<TerminalNode> WS() { return getTokens(ExprRuleParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ExprRuleParser.WS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExprRuleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExprRuleParser.COMMA, i);
		}
		public FuncDefParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).enterFuncDefParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).exitFuncDefParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRuleParserVisitor ) return ((ExprRuleParserVisitor<? extends T>)visitor).visitFuncDefParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefParamsContext funcDefParams() throws RecognitionException {
		FuncDefParamsContext _localctx = new FuncDefParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcDefParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(127);
				match(WS);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			((FuncDefParamsContext)_localctx).paramName = match(WORD);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(134);
						match(WS);
						}
						}
						setState(139);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(140);
					match(COMMA);
					setState(141);
					((FuncDefParamsContext)_localctx).addParamName = match(WORD);
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(147);
				match(WS);
				}
				}
				setState(152);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RuleStmtContext extends ParserRuleContext {
		public Token ruleName;
		public BaseExprContext ruleDef;
		public TerminalNode RULE() { return getToken(ExprRuleParser.RULE, 0); }
		public TerminalNode COLON() { return getToken(ExprRuleParser.COLON, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(ExprRuleParser.ASSIGNMENT, 0); }
		public TerminalNode SEMI() { return getToken(ExprRuleParser.SEMI, 0); }
		public TerminalNode WORD() { return getToken(ExprRuleParser.WORD, 0); }
		public BaseExprContext baseExpr() {
			return getRuleContext(BaseExprContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ExprRuleParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ExprRuleParser.WS, i);
		}
		public RuleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).enterRuleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).exitRuleStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRuleParserVisitor ) return ((ExprRuleParserVisitor<? extends T>)visitor).visitRuleStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleStmtContext ruleStmt() throws RecognitionException {
		RuleStmtContext _localctx = new RuleStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ruleStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(RULE);
			setState(155); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(154);
				match(WS);
				}
				}
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(159);
			((RuleStmtContext)_localctx).ruleName = match(WORD);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(160);
				match(WS);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(COLON);
			setState(167);
			match(ASSIGNMENT);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(168);
				match(WS);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			((RuleStmtContext)_localctx).ruleDef = baseExpr();
			setState(175);
			match(SEMI);
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
	public static class BaseExprContext extends ParserRuleContext {
		public List<AndExprContext> andExpr() {
			return getRuleContexts(AndExprContext.class);
		}
		public AndExprContext andExpr(int i) {
			return getRuleContext(AndExprContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ExprRuleParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ExprRuleParser.OR, i);
		}
		public List<TerminalNode> WS() { return getTokens(ExprRuleParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ExprRuleParser.WS, i);
		}
		public BaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).enterBaseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).exitBaseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRuleParserVisitor ) return ((ExprRuleParserVisitor<? extends T>)visitor).visitBaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseExprContext baseExpr() throws RecognitionException {
		BaseExprContext _localctx = new BaseExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_baseExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			andExpr();
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(179); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(178);
						match(WS);
						}
						}
						setState(181); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WS );
					setState(183);
					match(OR);
					setState(185); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(184);
						match(WS);
						}
						}
						setState(187); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WS );
					setState(189);
					andExpr();
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ParserRuleContext {
		public List<NotExprContext> notExpr() {
			return getRuleContexts(NotExprContext.class);
		}
		public NotExprContext notExpr(int i) {
			return getRuleContext(NotExprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ExprRuleParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ExprRuleParser.AND, i);
		}
		public List<TerminalNode> WS() { return getTokens(ExprRuleParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ExprRuleParser.WS, i);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRuleParserVisitor ) return ((ExprRuleParserVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_andExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			notExpr();
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(196);
						match(WS);
						}
						}
						setState(199); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WS );
					setState(201);
					match(AND);
					setState(203); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(202);
						match(WS);
						}
						}
						setState(205); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WS );
					setState(207);
					notExpr();
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ParserRuleContext {
		public RelExprContext relExpr() {
			return getRuleContext(RelExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ExprRuleParser.NOT, 0); }
		public List<TerminalNode> WS() { return getTokens(ExprRuleParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ExprRuleParser.WS, i);
		}
		public TerminalNode LPAREN() { return getToken(ExprRuleParser.LPAREN, 0); }
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ExprRuleParser.RPAREN, 0); }
		public NotExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRuleParserVisitor ) return ((ExprRuleParserVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExprContext notExpr() throws RecognitionException {
		NotExprContext _localctx = new NotExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_notExpr);
		int _la;
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(213);
					match(NOT);
					setState(215); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(214);
						match(WS);
						}
						}
						setState(217); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WS );
					}
				}

				setState(221);
				relExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(NOT);
				setState(223);
				match(LPAREN);
				setState(224);
				notExpr();
				setState(225);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelExprContext extends ParserRuleContext {
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
		}
		public RelOprContext relOpr() {
			return getRuleContext(RelOprContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ExprRuleParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ExprRuleParser.WS, i);
		}
		public RelExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).enterRelExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).exitRelExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRuleParserVisitor ) return ((ExprRuleParserVisitor<? extends T>)visitor).visitRelExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelExprContext relExpr() throws RecognitionException {
		RelExprContext _localctx = new RelExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_relExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			addExpr();
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(230);
					match(WS);
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236);
				relOpr();
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(237);
					match(WS);
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243);
				addExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddExprContext extends ParserRuleContext {
		public List<MulExprContext> mulExpr() {
			return getRuleContexts(MulExprContext.class);
		}
		public MulExprContext mulExpr(int i) {
			return getRuleContext(MulExprContext.class,i);
		}
		public List<AddOprContext> addOpr() {
			return getRuleContexts(AddOprContext.class);
		}
		public AddOprContext addOpr(int i) {
			return getRuleContext(AddOprContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(ExprRuleParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ExprRuleParser.WS, i);
		}
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRuleParserVisitor ) return ((ExprRuleParserVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_addExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			mulExpr();
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(248);
						match(WS);
						}
						}
						setState(253);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(254);
					addOpr();
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(255);
						match(WS);
						}
						}
						setState(260);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(261);
					mulExpr();
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MulExprContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<MulOprContext> mulOpr() {
			return getRuleContexts(MulOprContext.class);
		}
		public MulOprContext mulOpr(int i) {
			return getRuleContext(MulOprContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(ExprRuleParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ExprRuleParser.WS, i);
		}
		public MulExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).exitMulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRuleParserVisitor ) return ((ExprRuleParserVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulExprContext mulExpr() throws RecognitionException {
		MulExprContext _localctx = new MulExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mulExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			literal();
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(269);
						match(WS);
						}
						}
						setState(274);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(275);
					mulOpr();
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(276);
						match(WS);
						}
						}
						setState(281);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(282);
					literal();
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelOprContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(ExprRuleParser.GT, 0); }
		public TerminalNode LT() { return getToken(ExprRuleParser.LT, 0); }
		public TerminalNode EQUAL() { return getToken(ExprRuleParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ExprRuleParser.NOTEQUAL, 0); }
		public TerminalNode CONTAINS() { return getToken(ExprRuleParser.CONTAINS, 0); }
		public TerminalNode CONTAINSALL() { return getToken(ExprRuleParser.CONTAINSALL, 0); }
		public RelOprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).enterRelOpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).exitRelOpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRuleParserVisitor ) return ((ExprRuleParserVisitor<? extends T>)visitor).visitRelOpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOprContext relOpr() throws RecognitionException {
		RelOprContext _localctx = new RelOprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relOpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 102629376L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddOprContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(ExprRuleParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ExprRuleParser.SUB, 0); }
		public AddOprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).enterAddOpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).exitAddOpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRuleParserVisitor ) return ((ExprRuleParserVisitor<? extends T>)visitor).visitAddOpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOprContext addOpr() throws RecognitionException {
		AddOprContext _localctx = new AddOprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_addOpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class MulOprContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(ExprRuleParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExprRuleParser.DIV, 0); }
		public MulOprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).enterMulOpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).exitMulOpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRuleParserVisitor ) return ((ExprRuleParserVisitor<? extends T>)visitor).visitMulOpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulOprContext mulOpr() throws RecognitionException {
		MulOprContext _localctx = new MulOprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mulOpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ( !(_la==MUL || _la==DIV) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public Token funcName;
		public Token varName;
		public TerminalNode LPAREN() { return getToken(ExprRuleParser.LPAREN, 0); }
		public BaseExprContext baseExpr() {
			return getRuleContext(BaseExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ExprRuleParser.RPAREN, 0); }
		public List<TerminalNode> WS() { return getTokens(ExprRuleParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ExprRuleParser.WS, i);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(ExprRuleParser.BOOLEAN, 0); }
		public TerminalNode NUMBER() { return getToken(ExprRuleParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(ExprRuleParser.STRING, 0); }
		public TerminalNode WORD() { return getToken(ExprRuleParser.WORD, 0); }
		public FuncParamsContext funcParams() {
			return getRuleContext(FuncParamsContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRuleParserVisitor ) return ((ExprRuleParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literal);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(LPAREN);
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(296);
					match(WS);
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(302);
				baseExpr();
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(303);
					match(WS);
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(309);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				match(BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				match(NUMBER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(314);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(315);
				((LiteralContext)_localctx).funcName = match(WORD);
				setState(316);
				match(LPAREN);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4160757920L) != 0)) {
					{
					setState(317);
					funcParams();
					}
				}

				setState(320);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(321);
				((LiteralContext)_localctx).varName = match(WORD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListItemContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ExprRuleParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(ExprRuleParser.NUMBER, 0); }
		public ListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).enterListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).exitListItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRuleParserVisitor ) return ((ExprRuleParserVisitor<? extends T>)visitor).visitListItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListItemContext listItem() throws RecognitionException {
		ListItemContext _localctx = new ListItemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==STRING) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ExprRuleParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ExprRuleParser.RBRACK, 0); }
		public List<ListItemContext> listItem() {
			return getRuleContexts(ListItemContext.class);
		}
		public ListItemContext listItem(int i) {
			return getRuleContext(ListItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExprRuleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExprRuleParser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRuleParserVisitor ) return ((ExprRuleParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(LBRACK);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER || _la==STRING) {
				{
				setState(327);
				listItem();
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(328);
					match(COMMA);
					setState(329);
					listItem();
					}
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(337);
			match(RBRACK);
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
	public static class FuncParamsContext extends ParserRuleContext {
		public BaseExprContext paramDef;
		public BaseExprContext addParamDef;
		public List<TerminalNode> WS() { return getTokens(ExprRuleParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ExprRuleParser.WS, i);
		}
		public List<BaseExprContext> baseExpr() {
			return getRuleContexts(BaseExprContext.class);
		}
		public BaseExprContext baseExpr(int i) {
			return getRuleContext(BaseExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExprRuleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExprRuleParser.COMMA, i);
		}
		public FuncParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).enterFuncParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRuleParserListener ) ((ExprRuleParserListener)listener).exitFuncParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRuleParserVisitor ) return ((ExprRuleParserVisitor<? extends T>)visitor).visitFuncParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParamsContext funcParams() throws RecognitionException {
		FuncParamsContext _localctx = new FuncParamsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(339);
				match(WS);
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(345);
			((FuncParamsContext)_localctx).paramDef = baseExpr();
			}
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(346);
						match(WS);
						}
						}
						setState(351);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(352);
					match(COMMA);
					{
					setState(353);
					((FuncParamsContext)_localctx).addParamDef = baseExpr();
					}
					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(359);
				match(WS);
				}
				}
				setState(364);
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
		"\u0004\u0001\u001f\u016e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000/\b\u0000\n\u0000\f\u00002\t\u0000\u0005"+
		"\u00004\b\u0000\n\u0000\f\u00007\t\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001<\b\u0001\u0001\u0002\u0001\u0002\u0004\u0002@\b\u0002"+
		"\u000b\u0002\f\u0002A\u0001\u0002\u0001\u0002\u0005\u0002F\b\u0002\n\u0002"+
		"\f\u0002I\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002N\b\u0002"+
		"\n\u0002\f\u0002Q\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0004\u0003X\b\u0003\u000b\u0003\f\u0003Y\u0001\u0003\u0001"+
		"\u0003\u0005\u0003^\b\u0003\n\u0003\f\u0003a\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003f\b\u0003\n\u0003\f\u0003i\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003m\b\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003q\b\u0003\n\u0003\f\u0003t\t\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003x\b\u0003\n\u0003\f\u0003{\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0005\u0004\u0081\b\u0004\n\u0004\f\u0004\u0084\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u0088\b\u0004\n\u0004\f\u0004\u008b"+
		"\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u008f\b\u0004\n\u0004\f\u0004"+
		"\u0092\t\u0004\u0001\u0004\u0005\u0004\u0095\b\u0004\n\u0004\f\u0004\u0098"+
		"\t\u0004\u0001\u0005\u0001\u0005\u0004\u0005\u009c\b\u0005\u000b\u0005"+
		"\f\u0005\u009d\u0001\u0005\u0001\u0005\u0005\u0005\u00a2\b\u0005\n\u0005"+
		"\f\u0005\u00a5\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00aa\b\u0005\n\u0005\f\u0005\u00ad\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0004\u0006\u00b4\b\u0006\u000b\u0006\f"+
		"\u0006\u00b5\u0001\u0006\u0001\u0006\u0004\u0006\u00ba\b\u0006\u000b\u0006"+
		"\f\u0006\u00bb\u0001\u0006\u0005\u0006\u00bf\b\u0006\n\u0006\f\u0006\u00c2"+
		"\t\u0006\u0001\u0007\u0001\u0007\u0004\u0007\u00c6\b\u0007\u000b\u0007"+
		"\f\u0007\u00c7\u0001\u0007\u0001\u0007\u0004\u0007\u00cc\b\u0007\u000b"+
		"\u0007\f\u0007\u00cd\u0001\u0007\u0005\u0007\u00d1\b\u0007\n\u0007\f\u0007"+
		"\u00d4\t\u0007\u0001\b\u0001\b\u0004\b\u00d8\b\b\u000b\b\f\b\u00d9\u0003"+
		"\b\u00dc\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00e4"+
		"\b\b\u0001\t\u0001\t\u0005\t\u00e8\b\t\n\t\f\t\u00eb\t\t\u0001\t\u0001"+
		"\t\u0005\t\u00ef\b\t\n\t\f\t\u00f2\t\t\u0001\t\u0001\t\u0003\t\u00f6\b"+
		"\t\u0001\n\u0001\n\u0005\n\u00fa\b\n\n\n\f\n\u00fd\t\n\u0001\n\u0001\n"+
		"\u0005\n\u0101\b\n\n\n\f\n\u0104\t\n\u0001\n\u0001\n\u0005\n\u0108\b\n"+
		"\n\n\f\n\u010b\t\n\u0001\u000b\u0001\u000b\u0005\u000b\u010f\b\u000b\n"+
		"\u000b\f\u000b\u0112\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0116"+
		"\b\u000b\n\u000b\f\u000b\u0119\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u011d\b\u000b\n\u000b\f\u000b\u0120\t\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u012a\b"+
		"\u000f\n\u000f\f\u000f\u012d\t\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u0131\b\u000f\n\u000f\f\u000f\u0134\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u013f\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0143"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u014b\b\u0011\n\u0011\f\u0011\u014e\t\u0011\u0003\u0011"+
		"\u0150\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0005\u0012\u0155\b"+
		"\u0012\n\u0012\f\u0012\u0158\t\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u015c\b\u0012\n\u0012\f\u0012\u015f\t\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u0163\b\u0012\n\u0012\f\u0012\u0166\t\u0012\u0001\u0012\u0005\u0012"+
		"\u0169\b\u0012\n\u0012\f\u0012\u016c\t\u0012\u0001\u0012\u0000\u0000\u0013"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$\u0000\u0004\u0002\u0000\u0011\u0014\u0019\u001a\u0001"+
		"\u0000\u0015\u0016\u0001\u0000\u0017\u0018\u0002\u0000\u001d\u001d\u001f"+
		"\u001f\u0190\u0000)\u0001\u0000\u0000\u0000\u0002;\u0001\u0000\u0000\u0000"+
		"\u0004=\u0001\u0000\u0000\u0000\u0006U\u0001\u0000\u0000\u0000\b\u0082"+
		"\u0001\u0000\u0000\u0000\n\u0099\u0001\u0000\u0000\u0000\f\u00b1\u0001"+
		"\u0000\u0000\u0000\u000e\u00c3\u0001\u0000\u0000\u0000\u0010\u00e3\u0001"+
		"\u0000\u0000\u0000\u0012\u00e5\u0001\u0000\u0000\u0000\u0014\u00f7\u0001"+
		"\u0000\u0000\u0000\u0016\u010c\u0001\u0000\u0000\u0000\u0018\u0121\u0001"+
		"\u0000\u0000\u0000\u001a\u0123\u0001\u0000\u0000\u0000\u001c\u0125\u0001"+
		"\u0000\u0000\u0000\u001e\u0142\u0001\u0000\u0000\u0000 \u0144\u0001\u0000"+
		"\u0000\u0000\"\u0146\u0001\u0000\u0000\u0000$\u0156\u0001\u0000\u0000"+
		"\u0000&(\u0005\u001b\u0000\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*5\u0001"+
		"\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,0\u0003\u0002\u0001\u0000"+
		"-/\u0005\u001b\u0000\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000"+
		"\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000014\u0001\u0000"+
		"\u0000\u000020\u0001\u0000\u0000\u00003,\u0001\u0000\u0000\u000047\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"6\u0001\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u00008<\u0003\u0004"+
		"\u0002\u00009<\u0003\u0006\u0003\u0000:<\u0003\n\u0005\u0000;8\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000<\u0003"+
		"\u0001\u0000\u0000\u0000=?\u0005\u0001\u0000\u0000>@\u0005\u001b\u0000"+
		"\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CG\u0005"+
		"\u001e\u0000\u0000DF\u0005\u001b\u0000\u0000ED\u0001\u0000\u0000\u0000"+
		"FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0005\t\u0000"+
		"\u0000KO\u0005\u0010\u0000\u0000LN\u0005\u001b\u0000\u0000ML\u0001\u0000"+
		"\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000"+
		"RS\u0003\f\u0006\u0000ST\u0005\n\u0000\u0000T\u0005\u0001\u0000\u0000"+
		"\u0000UW\u0005\u0002\u0000\u0000VX\u0005\u001b\u0000\u0000WV\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[_\u0005\u001e\u0000\u0000"+
		"\\^\u0005\u001b\u0000\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0005\t\u0000\u0000cg\u0005\u0010"+
		"\u0000\u0000df\u0005\u001b\u0000\u0000ed\u0001\u0000\u0000\u0000fi\u0001"+
		"\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000"+
		"hj\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jl\u0005\u0005\u0000"+
		"\u0000km\u0003\b\u0004\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000nr\u0005\u0006\u0000\u0000oq\u0005\u001b"+
		"\u0000\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000"+
		"tr\u0001\u0000\u0000\u0000uy\u0005\f\u0000\u0000vx\u0005\u001b\u0000\u0000"+
		"wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000|}\u0003\f\u0006\u0000}~\u0005\n\u0000\u0000~\u0007\u0001"+
		"\u0000\u0000\u0000\u007f\u0081\u0005\u001b\u0000\u0000\u0080\u007f\u0001"+
		"\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085\u0001"+
		"\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0090\u0005"+
		"\u001e\u0000\u0000\u0086\u0088\u0005\u001b\u0000\u0000\u0087\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0001"+
		"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d\u0005"+
		"\u000b\u0000\u0000\u008d\u008f\u0005\u001e\u0000\u0000\u008e\u0089\u0001"+
		"\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0096\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0095\u0005"+
		"\u001b\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0098\u0001"+
		"\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097\t\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000"+
		"\u0000\u0000\u0099\u009b\u0005\u0003\u0000\u0000\u009a\u009c\u0005\u001b"+
		"\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000"+
		"\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a3\u0005\u001e"+
		"\u0000\u0000\u00a0\u00a2\u0005\u001b\u0000\u0000\u00a1\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\t\u0000"+
		"\u0000\u00a7\u00ab\u0005\u0010\u0000\u0000\u00a8\u00aa\u0005\u001b\u0000"+
		"\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0003\f\u0006\u0000\u00af\u00b0\u0005\n\u0000\u0000"+
		"\u00b0\u000b\u0001\u0000\u0000\u0000\u00b1\u00c0\u0003\u000e\u0007\u0000"+
		"\u00b2\u00b4\u0005\u001b\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b9\u0005\u000f\u0000\u0000\u00b8\u00ba\u0005\u001b\u0000\u0000"+
		"\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0003\u000e\u0007\u0000"+
		"\u00be\u00b3\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c1\r\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3"+
		"\u00d2\u0003\u0010\b\u0000\u00c4\u00c6\u0005\u001b\u0000\u0000\u00c5\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c9\u00cb\u0005\u000e\u0000\u0000\u00ca\u00cc"+
		"\u0005\u001b\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d1"+
		"\u0003\u0010\b\u0000\u00d0\u00c5\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d3\u000f\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d7\u0005\r\u0000\u0000\u00d6\u00d8\u0005\u001b"+
		"\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000"+
		"\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00d5\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00e4\u0003\u0012\t\u0000\u00de\u00df\u0005\r\u0000"+
		"\u0000\u00df\u00e0\u0005\u0005\u0000\u0000\u00e0\u00e1\u0003\u0010\b\u0000"+
		"\u00e1\u00e2\u0005\u0006\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e3\u00db\u0001\u0000\u0000\u0000\u00e3\u00de\u0001\u0000\u0000\u0000"+
		"\u00e4\u0011\u0001\u0000\u0000\u0000\u00e5\u00f5\u0003\u0014\n\u0000\u00e6"+
		"\u00e8\u0005\u001b\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8"+
		"\u00eb\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e9\u0001\u0000\u0000\u0000\u00ec\u00f0\u0003\u0018\f\u0000\u00ed\u00ef"+
		"\u0005\u001b\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f4\u0003\u0014\n\u0000\u00f4\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f5\u00e9\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f6\u0013\u0001\u0000\u0000\u0000\u00f7\u0109\u0003"+
		"\u0016\u000b\u0000\u00f8\u00fa\u0005\u001b\u0000\u0000\u00f9\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u0102\u0003"+
		"\u001a\r\u0000\u00ff\u0101\u0005\u001b\u0000\u0000\u0100\u00ff\u0001\u0000"+
		"\u0000\u0000\u0101\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0105\u0001\u0000"+
		"\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105\u0106\u0003\u0016"+
		"\u000b\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107\u00fb\u0001\u0000"+
		"\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u0015\u0001\u0000"+
		"\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u011e\u0003\u001e"+
		"\u000f\u0000\u010d\u010f\u0005\u001b\u0000\u0000\u010e\u010d\u0001\u0000"+
		"\u0000\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0113\u0001\u0000"+
		"\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0117\u0003\u001c"+
		"\u000e\u0000\u0114\u0116\u0005\u001b\u0000\u0000\u0115\u0114\u0001\u0000"+
		"\u0000\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u011a\u0001\u0000"+
		"\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u011b\u0003\u001e"+
		"\u000f\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u0110\u0001\u0000"+
		"\u0000\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0017\u0001\u0000"+
		"\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0122\u0007\u0000"+
		"\u0000\u0000\u0122\u0019\u0001\u0000\u0000\u0000\u0123\u0124\u0007\u0001"+
		"\u0000\u0000\u0124\u001b\u0001\u0000\u0000\u0000\u0125\u0126\u0007\u0002"+
		"\u0000\u0000\u0126\u001d\u0001\u0000\u0000\u0000\u0127\u012b\u0005\u0005"+
		"\u0000\u0000\u0128\u012a\u0005\u001b\u0000\u0000\u0129\u0128\u0001\u0000"+
		"\u0000\u0000\u012a\u012d\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012e\u0001\u0000"+
		"\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e\u0132\u0003\f\u0006"+
		"\u0000\u012f\u0131\u0005\u001b\u0000\u0000\u0130\u012f\u0001\u0000\u0000"+
		"\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0135\u0001\u0000\u0000"+
		"\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u0006\u0000"+
		"\u0000\u0136\u0143\u0001\u0000\u0000\u0000\u0137\u0143\u0003\"\u0011\u0000"+
		"\u0138\u0143\u0005\u001c\u0000\u0000\u0139\u0143\u0005\u001d\u0000\u0000"+
		"\u013a\u0143\u0005\u001f\u0000\u0000\u013b\u013c\u0005\u001e\u0000\u0000"+
		"\u013c\u013e\u0005\u0005\u0000\u0000\u013d\u013f\u0003$\u0012\u0000\u013e"+
		"\u013d\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f"+
		"\u0140\u0001\u0000\u0000\u0000\u0140\u0143\u0005\u0006\u0000\u0000\u0141"+
		"\u0143\u0005\u001e\u0000\u0000\u0142\u0127\u0001\u0000\u0000\u0000\u0142"+
		"\u0137\u0001\u0000\u0000\u0000\u0142\u0138\u0001\u0000\u0000\u0000\u0142"+
		"\u0139\u0001\u0000\u0000\u0000\u0142\u013a\u0001\u0000\u0000\u0000\u0142"+
		"\u013b\u0001\u0000\u0000\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0143"+
		"\u001f\u0001\u0000\u0000\u0000\u0144\u0145\u0007\u0003\u0000\u0000\u0145"+
		"!\u0001\u0000\u0000\u0000\u0146\u014f\u0005\u0007\u0000\u0000\u0147\u014c"+
		"\u0003 \u0010\u0000\u0148\u0149\u0005\u000b\u0000\u0000\u0149\u014b\u0003"+
		" \u0010\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000"+
		"\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000"+
		"\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000"+
		"\u0000\u0000\u014f\u0147\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0005\b\u0000"+
		"\u0000\u0152#\u0001\u0000\u0000\u0000\u0153\u0155\u0005\u001b\u0000\u0000"+
		"\u0154\u0153\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000\u0000\u0000"+
		"\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000"+
		"\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000"+
		"\u0159\u0164\u0003\f\u0006\u0000\u015a\u015c\u0005\u001b\u0000\u0000\u015b"+
		"\u015a\u0001\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d"+
		"\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e"+
		"\u0160\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160"+
		"\u0161\u0005\u000b\u0000\u0000\u0161\u0163\u0003\f\u0006\u0000\u0162\u015d"+
		"\u0001\u0000\u0000\u0000\u0163\u0166\u0001\u0000\u0000\u0000\u0164\u0162"+
		"\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u016a"+
		"\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u0169"+
		"\u0005\u001b\u0000\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0169\u016c"+
		"\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u016b"+
		"\u0001\u0000\u0000\u0000\u016b%\u0001\u0000\u0000\u0000\u016c\u016a\u0001"+
		"\u0000\u0000\u00000)05;AGOY_glry\u0082\u0089\u0090\u0096\u009d\u00a3\u00ab"+
		"\u00b5\u00bb\u00c0\u00c7\u00cd\u00d2\u00d9\u00db\u00e3\u00e9\u00f0\u00f5"+
		"\u00fb\u0102\u0109\u0110\u0117\u011e\u012b\u0132\u013e\u0142\u014c\u014f"+
		"\u0156\u015d\u0164\u016a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}