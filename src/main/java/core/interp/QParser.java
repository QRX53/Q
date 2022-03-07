package core.interp;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QParser extends Parser {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, Println = 22, Async = 23, AddComponent = 24,
            Var = 25, Import = 26, Print = 27, Input = 28, Assert = 29, Def = 30, ToInt = 31, If = 32,
            Else = 33, Return = 34, For = 35, While = 36, To = 37, Do = 38, End = 39, In = 40, Null = 41,
            Try = 42, Class = 43, Const = 44, Noval = 45, Self = 46, Or = 47, And = 48, Equals = 49,
            NEquals = 50, GTEquals = 51, LTEquals = 52, Pow = 53, Excl = 54, GT = 55, LT = 56, Add = 57,
            Subtract = 58, Multiply = 59, Divide = 60, Modulus = 61, OBrace = 62, CBrace = 63,
            OBracket = 64, CBracket = 65, OParen = 66, CParen = 67, SColon = 68, Assign = 69,
            Comma = 70, QMark = 71, Colon = 72, Bool = 73, Number = 74, Identifier = 75, String = 76,
            Comment = 77, Space = 78;
    public static final int
            RULE_parse = 0, RULE_block = 1, RULE_statement = 2, RULE_reAssignment = 3,
            RULE_functionCall = 4, RULE_allImport = 5, RULE_objFunctionCall = 6, RULE_header = 7,
            RULE_ifStatement = 8, RULE_ifStat = 9, RULE_hereStatement = 10, RULE_varHereStatement = 11,
            RULE_elseIfStat = 12, RULE_constructorStatement = 13, RULE_objCreateStatement = 14,
            RULE_osExecStatement = 15, RULE_fileWriteStatement = 16, RULE_verifyFileStatement = 17,
            RULE_elseStat = 18, RULE_functionDecl = 19, RULE_forStatement = 20, RULE_forInStatement = 21,
            RULE_importStatement = 22, RULE_anonymousFunction = 23, RULE_importFromGithubStatement = 24,
            RULE_importAllStatement = 25, RULE_customClass = 26, RULE_tryCatchStatement = 27,
            RULE_whileStatement = 28, RULE_windowRenderStatement = 29, RULE_windowAddCompStatement = 30,
            RULE_addWebServerTextStatement = 31, RULE_mainFunctionStatement = 32,
            RULE_idList = 33, RULE_classStatement = 34, RULE_exprList = 35, RULE_expression = 36,
            RULE_list = 37, RULE_indexes = 38;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u0225\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\5\2R\n\2\3\2\3\2" +
                    "\3\2\7\2W\n\2\f\2\16\2Z\13\2\3\2\3\2\3\2\3\3\3\3\7\3a\n\3\f\3\16\3d\13" +
                    "\3\3\3\3\3\3\3\3\3\5\3j\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\5\4\u008d\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\5\4\u0099\n\4\3\5\7\5\u009c\n\5\f\5\16\5\u009f\13\5\3\5\3\5\5\5\u00a3" +
                    "\n\5\3\5\3\5\5\5\u00a7\n\5\3\6\3\6\3\6\5\6\u00ac\n\6\3\6\3\6\3\6\3\6\5" +
                    "\6\u00b2\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3" +
                    "\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c9\n\6\3\6\5\6\u00cc\n\6\3\7\3\7\3\7" +
                    "\5\7\u00d1\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u00d8\n\b\3\b\3\b\3\t\3\t\3\t\3" +
                    "\t\3\n\3\n\7\n\u00e2\n\n\f\n\16\n\u00e5\13\n\3\n\5\n\u00e8\n\n\3\n\3\n" +
                    "\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r" +
                    "\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u0107\n\17" +
                    "\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0111\n\20\3\20\3\20\3\21" +
                    "\3\21\3\21\3\21\3\21\5\21\u011a\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22" +
                    "\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\5\25\u012e\n\25" +
                    "\3\25\3\25\3\25\3\25\5\25\u0134\n\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26" +
                    "\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27" +
                    "\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\7\30\u0156\n\30" +
                    "\f\30\16\30\u0159\13\30\3\31\3\31\3\31\5\31\u015e\n\31\3\31\3\31\3\31" +
                    "\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33" +
                    "\3\33\3\33\3\33\5\33\u0174\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34" +
                    "\3\34\3\34\3\34\3\34\7\34\u0182\n\34\f\34\16\34\u0185\13\34\3\34\3\34" +
                    "\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36" +
                    "\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!" +
                    "\3!\3\"\3\"\3\"\3\"\3#\3#\3#\7#\u01b2\n#\f#\16#\u01b5\13#\3$\3$\3$\3$" +
                    "\5$\u01bb\n$\3$\3$\3$\3%\3%\3%\7%\u01c3\n%\f%\16%\u01c6\13%\3&\3&\3&\3" +
                    "&\3&\3&\3&\3&\3&\3&\5&\u01d2\n&\3&\3&\5&\u01d6\n&\3&\3&\5&\u01da\n&\3" +
                    "&\3&\5&\u01de\n&\3&\3&\3&\3&\5&\u01e4\n&\3&\3&\3&\5&\u01e9\n&\3&\3&\3" +
                    "&\3&\3&\3&\3&\5&\u01f2\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3" +
                    "&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u0212\n&\f&\16&\u0215" +
                    "\13&\3\'\3\'\5\'\u0219\n\'\3\'\3\'\3(\3(\3(\3(\6(\u0221\n(\r(\16(\u0222" +
                    "\3(\6X\u009d\u0157\u0183\3J)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"" +
                    "$&(*,.\60\62\64\668:<>@BDFHJLN\2\7\3\2./\3\2=?\3\2;<\4\2\65\669:\3\2\63" +
                    "\64\2\u024f\2Q\3\2\2\2\4b\3\2\2\2\6\u0098\3\2\2\2\b\u009d\3\2\2\2\n\u00cb" +
                    "\3\2\2\2\f\u00d0\3\2\2\2\16\u00d2\3\2\2\2\20\u00db\3\2\2\2\22\u00df\3" +
                    "\2\2\2\24\u00eb\3\2\2\2\26\u00f1\3\2\2\2\30\u00f7\3\2\2\2\32\u00fb\3\2" +
                    "\2\2\34\u0102\3\2\2\2\36\u010a\3\2\2\2 \u0114\3\2\2\2\"\u011d\3\2\2\2" +
                    "$\u0124\3\2\2\2&\u0129\3\2\2\2(\u012d\3\2\2\2*\u0139\3\2\2\2,\u0144\3" +
                    "\2\2\2.\u0150\3\2\2\2\60\u015a\3\2\2\2\62\u0165\3\2\2\2\64\u0173\3\2\2" +
                    "\2\66\u0175\3\2\2\28\u0189\3\2\2\2:\u018f\3\2\2\2<\u0196\3\2\2\2>\u019c" +
                    "\3\2\2\2@\u01a3\3\2\2\2B\u01aa\3\2\2\2D\u01ae\3\2\2\2F\u01b6\3\2\2\2H" +
                    "\u01bf\3\2\2\2J\u01f1\3\2\2\2L\u0216\3\2\2\2N\u0220\3\2\2\2PR\5\20\t\2" +
                    "QP\3\2\2\2QR\3\2\2\2RX\3\2\2\2ST\5\f\7\2TU\7F\2\2UW\3\2\2\2VS\3\2\2\2" +
                    "WZ\3\2\2\2XY\3\2\2\2XV\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\5\4\3\2\\]\7\2\2" +
                    "\3]\3\3\2\2\2^a\5\6\4\2_a\5(\25\2`^\3\2\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2" +
                    "\2\2bc\3\2\2\2ci\3\2\2\2db\3\2\2\2ef\7$\2\2fg\5J&\2gh\7F\2\2hj\3\2\2\2" +
                    "ie\3\2\2\2ij\3\2\2\2j\5\3\2\2\2kl\5\n\6\2lm\7F\2\2m\u0099\3\2\2\2n\u0099" +
                    "\5\22\n\2o\u0099\5*\26\2p\u0099\5,\27\2q\u0099\5:\36\2r\u0099\58\35\2" +
                    "s\u0099\5B\"\2tu\5@!\2uv\7F\2\2v\u0099\3\2\2\2wx\5\b\5\2xy\7F\2\2y\u0099" +
                    "\3\2\2\2z\u0099\5F$\2{|\5\34\17\2|}\7F\2\2}\u0099\3\2\2\2~\177\5> \2\177" +
                    "\u0080\7F\2\2\u0080\u0099\3\2\2\2\u0081\u0082\5<\37\2\u0082\u0083\7F\2" +
                    "\2\u0083\u0099\3\2\2\2\u0084\u0085\5\"\22\2\u0085\u0086\7F\2\2\u0086\u0099" +
                    "\3\2\2\2\u0087\u0088\5$\23\2\u0088\u0089\7F\2\2\u0089\u0099\3\2\2\2\u008a" +
                    "\u008c\5\16\b\2\u008b\u008d\7F\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2" +
                    "\2\2\u008d\u0099\3\2\2\2\u008e\u008f\5\36\20\2\u008f\u0090\7F\2\2\u0090" +
                    "\u0099\3\2\2\2\u0091\u0092\5 \21\2\u0092\u0093\7F\2\2\u0093\u0099\3\2" +
                    "\2\2\u0094\u0099\5\60\31\2\u0095\u0096\5\26\f\2\u0096\u0097\7F\2\2\u0097" +
                    "\u0099\3\2\2\2\u0098k\3\2\2\2\u0098n\3\2\2\2\u0098o\3\2\2\2\u0098p\3\2" +
                    "\2\2\u0098q\3\2\2\2\u0098r\3\2\2\2\u0098s\3\2\2\2\u0098t\3\2\2\2\u0098" +
                    "w\3\2\2\2\u0098z\3\2\2\2\u0098{\3\2\2\2\u0098~\3\2\2\2\u0098\u0081\3\2" +
                    "\2\2\u0098\u0084\3\2\2\2\u0098\u0087\3\2\2\2\u0098\u008a\3\2\2\2\u0098" +
                    "\u008e\3\2\2\2\u0098\u0091\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0095\3\2" +
                    "\2\2\u0099\7\3\2\2\2\u009a\u009c\t\2\2\2\u009b\u009a\3\2\2\2\u009c\u009f" +
                    "\3\2\2\2\u009d\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\3\2\2\2\u009f" +
                    "\u009d\3\2\2\2\u00a0\u00a6\7M\2\2\u00a1\u00a3\5N(\2\u00a2\u00a1\3\2\2" +
                    "\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7G\2\2\u00a5\u00a7" +
                    "\5J&\2\u00a6\u00a2\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\t\3\2\2\2\u00a8\u00a9" +
                    "\7M\2\2\u00a9\u00ab\7D\2\2\u00aa\u00ac\5H%\2\u00ab\u00aa\3\2\2\2\u00ab" +
                    "\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00cc\7E\2\2\u00ae\u00af\7\30" +
                    "\2\2\u00af\u00b1\7D\2\2\u00b0\u00b2\5J&\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2" +
                    "\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00cc\7E\2\2\u00b4\u00b5\7\35\2\2\u00b5" +
                    "\u00b6\7D\2\2\u00b6\u00b7\5J&\2\u00b7\u00b8\7E\2\2\u00b8\u00cc\3\2\2\2" +
                    "\u00b9\u00ba\7\37\2\2\u00ba\u00bb\7D\2\2\u00bb\u00bc\5J&\2\u00bc\u00bd" +
                    "\7E\2\2\u00bd\u00cc\3\2\2\2\u00be\u00bf\7!\2\2\u00bf\u00c0\7D\2\2\u00c0" +
                    "\u00c1\5J&\2\u00c1\u00c2\7E\2\2\u00c2\u00cc\3\2\2\2\u00c3\u00c4\7M\2\2" +
                    "\u00c4\u00c5\7\3\2\2\u00c5\u00c6\7M\2\2\u00c6\u00c8\7D\2\2\u00c7\u00c9" +
                    "\5H%\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca" +
                    "\u00cc\7E\2\2\u00cb\u00a8\3\2\2\2\u00cb\u00ae\3\2\2\2\u00cb\u00b4\3\2" +
                    "\2\2\u00cb\u00b9\3\2\2\2\u00cb\u00be\3\2\2\2\u00cb\u00c3\3\2\2\2\u00cc" +
                    "\13\3\2\2\2\u00cd\u00d1\5.\30\2\u00ce\u00d1\5\62\32\2\u00cf\u00d1\5\64" +
                    "\33\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1" +
                    "\r\3\2\2\2\u00d2\u00d3\7M\2\2\u00d3\u00d4\7\3\2\2\u00d4\u00d5\7M\2\2\u00d5" +
                    "\u00d7\7D\2\2\u00d6\u00d8\5H%\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2" +
                    "\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7E\2\2\u00da\17\3\2\2\2\u00db\u00dc" +
                    "\7\4\2\2\u00dc\u00dd\7\5\2\2\u00dd\u00de\7M\2\2\u00de\21\3\2\2\2\u00df" +
                    "\u00e3\5\24\13\2\u00e0\u00e2\5\32\16\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5" +
                    "\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5" +
                    "\u00e3\3\2\2\2\u00e6\u00e8\5&\24\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2" +
                    "\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7)\2\2\u00ea\23\3\2\2\2\u00eb\u00ec" +
                    "\7\"\2\2\u00ec\u00ed\7D\2\2\u00ed\u00ee\5J&\2\u00ee\u00ef\7E\2\2\u00ef" +
                    "\u00f0\5\4\3\2\u00f0\25\3\2\2\2\u00f1\u00f2\7\60\2\2\u00f2\u00f3\7\3\2" +
                    "\2\u00f3\u00f4\7M\2\2\u00f4\u00f5\7G\2\2\u00f5\u00f6\5J&\2\u00f6\27\3" +
                    "\2\2\2\u00f7\u00f8\7\60\2\2\u00f8\u00f9\7\3\2\2\u00f9\u00fa\7M\2\2\u00fa" +
                    "\31\3\2\2\2\u00fb\u00fc\7#\2\2\u00fc\u00fd\7\"\2\2\u00fd\u00fe\7D\2\2" +
                    "\u00fe\u00ff\5J&\2\u00ff\u0100\7E\2\2\u0100\u0101\5\4\3\2\u0101\33\3\2" +
                    "\2\2\u0102\u0103\7\6\2\2\u0103\u0104\7M\2\2\u0104\u0106\7D\2\2\u0105\u0107" +
                    "\5H%\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108" +
                    "\u0109\7E\2\2\u0109\35\3\2\2\2\u010a\u010b\7\7\2\2\u010b\u010c\7M\2\2" +
                    "\u010c\u010d\7\b\2\2\u010d\u010e\7M\2\2\u010e\u0110\7D\2\2\u010f\u0111" +
                    "\5H%\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112" +
                    "\u0113\7E\2\2\u0113\37\3\2\2\2\u0114\u0115\7\t\2\2\u0115\u0116\7\3\2\2" +
                    "\u0116\u0117\7M\2\2\u0117\u0119\7D\2\2\u0118\u011a\5J&\2\u0119\u0118\3" +
                    "\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7E\2\2\u011c" +
                    "!\3\2\2\2\u011d\u011e\7M\2\2\u011e\u011f\7\3\2\2\u011f\u0120\7\n\2\2\u0120" +
                    "\u0121\7D\2\2\u0121\u0122\5J&\2\u0122\u0123\7E\2\2\u0123#\3\2\2\2\u0124" +
                    "\u0125\7\13\2\2\u0125\u0126\7D\2\2\u0126\u0127\5J&\2\u0127\u0128\7E\2" +
                    "\2\u0128%\3\2\2\2\u0129\u012a\7#\2\2\u012a\u012b\5\4\3\2\u012b\'\3\2\2" +
                    "\2\u012c\u012e\7\31\2\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e" +
                    "\u012f\3\2\2\2\u012f\u0130\7 \2\2\u0130\u0131\7M\2\2\u0131\u0133\7D\2" +
                    "\2\u0132\u0134\5D#\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135" +
                    "\3\2\2\2\u0135\u0136\7E\2\2\u0136\u0137\5\4\3\2\u0137\u0138\7)\2\2\u0138" +
                    ")\3\2\2\2\u0139\u013a\7%\2\2\u013a\u013b\7D\2\2\u013b\u013c\7M\2\2\u013c" +
                    "\u013d\7G\2\2\u013d\u013e\5J&\2\u013e\u013f\7\'\2\2\u013f\u0140\5J&\2" +
                    "\u0140\u0141\7E\2\2\u0141\u0142\5\4\3\2\u0142\u0143\7)\2\2\u0143+\3\2" +
                    "\2\2\u0144\u0145\7%\2\2\u0145\u0146\7D\2\2\u0146\u0147\7M\2\2\u0147\u0148" +
                    "\7*\2\2\u0148\u0149\7\f\2\2\u0149\u014a\7D\2\2\u014a\u014b\5J&\2\u014b" +
                    "\u014c\7E\2\2\u014c\u014d\7E\2\2\u014d\u014e\5\4\3\2\u014e\u014f\7)\2" +
                    "\2\u014f-\3\2\2\2\u0150\u0151\7\r\2\2\u0151\u0152\7\34\2\2\u0152\u0157" +
                    "\7M\2\2\u0153\u0154\7\16\2\2\u0154\u0156\7M\2\2\u0155\u0153\3\2\2\2\u0156" +
                    "\u0159\3\2\2\2\u0157\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158/\3\2\2\2" +
                    "\u0159\u0157\3\2\2\2\u015a\u015b\7 \2\2\u015b\u015d\7D\2\2\u015c\u015e" +
                    "\5H%\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f" +
                    "\u0160\7E\2\2\u0160\u0161\7<\2\2\u0161\u0162\79\2\2\u0162\u0163\5\4\3" +
                    "\2\u0163\u0164\7)\2\2\u0164\61\3\2\2\2\u0165\u0166\7\r\2\2\u0166\u0167" +
                    "\7\34\2\2\u0167\u0168\5J&\2\u0168\63\3\2\2\2\u0169\u016a\7\r\2\2\u016a" +
                    "\u016b\7\34\2\2\u016b\u016c\7B\2\2\u016c\u016d\7=\2\2\u016d\u0174\7C\2" +
                    "\2\u016e\u016f\7\r\2\2\u016f\u0170\7\34\2\2\u0170\u0171\7B\2\2\u0171\u0172" +
                    "\7\17\2\2\u0172\u0174\7C\2\2\u0173\u0169\3\2\2\2\u0173\u016e\3\2\2\2\u0174" +
                    "\65\3\2\2\2\u0175\u0176\7\20\2\2\u0176\u0177\7-\2\2\u0177\u0183\7M\2\2" +
                    "\u0178\u0179\7B\2\2\u0179\u017a\7\21\2\2\u017a\u017b\7C\2\2\u017b\u017c" +
                    "\7\22\2\2\u017c\u017d\7M\2\2\u017d\u017e\7\22\2\2\u017e\u017f\7J\2\2\u017f" +
                    "\u0180\7M\2\2\u0180\u0182\7F\2\2\u0181\u0178\3\2\2\2\u0182\u0185\3\2\2" +
                    "\2\u0183\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183" +
                    "\3\2\2\2\u0186\u0187\5\4\3\2\u0187\u0188\7)\2\2\u0188\67\3\2\2\2\u0189" +
                    "\u018a\7,\2\2\u018a\u018b\5\4\3\2\u018b\u018c\7\23\2\2\u018c\u018d\5\4" +
                    "\3\2\u018d\u018e\7)\2\2\u018e9\3\2\2\2\u018f\u0190\7&\2\2\u0190\u0191" +
                    "\7D\2\2\u0191\u0192\5J&\2\u0192\u0193\7E\2\2\u0193\u0194\5\4\3\2\u0194" +
                    "\u0195\7)\2\2\u0195;\3\2\2\2\u0196\u0197\7M\2\2\u0197\u0198\7\3\2\2\u0198" +
                    "\u0199\7\24\2\2\u0199\u019a\7D\2\2\u019a\u019b\7E\2\2\u019b=\3\2\2\2\u019c" +
                    "\u019d\7M\2\2\u019d\u019e\7\3\2\2\u019e\u019f\7\32\2\2\u019f\u01a0\7D" +
                    "\2\2\u01a0\u01a1\5J&\2\u01a1\u01a2\7E\2\2\u01a2?\3\2\2\2\u01a3\u01a4\7" +
                    "M\2\2\u01a4\u01a5\7\3\2\2\u01a5\u01a6\7\25\2\2\u01a6\u01a7\7D\2\2\u01a7" +
                    "\u01a8\5J&\2\u01a8\u01a9\7E\2\2\u01a9A\3\2\2\2\u01aa\u01ab\7\26\2\2\u01ab" +
                    "\u01ac\5\4\3\2\u01ac\u01ad\7)\2\2\u01adC\3\2\2\2\u01ae\u01b3\7M\2\2\u01af" +
                    "\u01b0\7H\2\2\u01b0\u01b2\7M\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b5\3\2\2" +
                    "\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4E\3\2\2\2\u01b5\u01b3" +
                    "\3\2\2\2\u01b6\u01b7\7-\2\2\u01b7\u01ba\7M\2\2\u01b8\u01b9\7J\2\2\u01b9" +
                    "\u01bb\7M\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2" +
                    "\2\2\u01bc\u01bd\5\4\3\2\u01bd\u01be\7)\2\2\u01beG\3\2\2\2\u01bf\u01c4" +
                    "\5J&\2\u01c0\u01c1\7H\2\2\u01c1\u01c3\5J&\2\u01c2\u01c0\3\2\2\2\u01c3" +
                    "\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5I\3\2\2\2" +
                    "\u01c6\u01c4\3\2\2\2\u01c7\u01c8\b&\1\2\u01c8\u01c9\7<\2\2\u01c9\u01f2" +
                    "\5J&\30\u01ca\u01cb\78\2\2\u01cb\u01f2\5J&\27\u01cc\u01f2\7L\2\2\u01cd" +
                    "\u01f2\7K\2\2\u01ce\u01f2\7+\2\2\u01cf\u01d1\5\n\6\2\u01d0\u01d2\5N(\2" +
                    "\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01f2\3\2\2\2\u01d3\u01d5" +
                    "\5L\'\2\u01d4\u01d6\5N(\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6" +
                    "\u01f2\3\2\2\2\u01d7\u01d9\7M\2\2\u01d8\u01da\5N(\2\u01d9\u01d8\3\2\2" +
                    "\2\u01d9\u01da\3\2\2\2\u01da\u01f2\3\2\2\2\u01db\u01dd\7N\2\2\u01dc\u01de" +
                    "\5N(\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01f2\3\2\2\2\u01df" +
                    "\u01e0\7D\2\2\u01e0\u01e1\5J&\2\u01e1\u01e3\7E\2\2\u01e2\u01e4\5N(\2\u01e3" +
                    "\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01f2\3\2\2\2\u01e5\u01e6\7\36" +
                    "\2\2\u01e6\u01e8\7D\2\2\u01e7\u01e9\7N\2\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9" +
                    "\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01f2\7E\2\2\u01eb\u01f2\5\30\r\2\u01ec" +
                    "\u01ed\7\27\2\2\u01ed\u01ee\7D\2\2\u01ee\u01ef\5J&\2\u01ef\u01f0\7E\2" +
                    "\2\u01f0\u01f2\3\2\2\2\u01f1\u01c7\3\2\2\2\u01f1\u01ca\3\2\2\2\u01f1\u01cc" +
                    "\3\2\2\2\u01f1\u01cd\3\2\2\2\u01f1\u01ce\3\2\2\2\u01f1\u01cf\3\2\2\2\u01f1" +
                    "\u01d3\3\2\2\2\u01f1\u01d7\3\2\2\2\u01f1\u01db\3\2\2\2\u01f1\u01df\3\2" +
                    "\2\2\u01f1\u01e5\3\2\2\2\u01f1\u01eb\3\2\2\2\u01f1\u01ec\3\2\2\2\u01f2" +
                    "\u0213\3\2\2\2\u01f3\u01f4\f\26\2\2\u01f4\u01f5\7\67\2\2\u01f5\u0212\5" +
                    "J&\26\u01f6\u01f7\f\25\2\2\u01f7\u01f8\t\3\2\2\u01f8\u0212\5J&\26\u01f9" +
                    "\u01fa\f\24\2\2\u01fa\u01fb\t\4\2\2\u01fb\u0212\5J&\25\u01fc\u01fd\f\23" +
                    "\2\2\u01fd\u01fe\t\5\2\2\u01fe\u0212\5J&\24\u01ff\u0200\f\22\2\2\u0200" +
                    "\u0201\t\6\2\2\u0201\u0212\5J&\23\u0202\u0203\f\21\2\2\u0203\u0204\7\62" +
                    "\2\2\u0204\u0212\5J&\22\u0205\u0206\f\20\2\2\u0206\u0207\7\61\2\2\u0207" +
                    "\u0212\5J&\21\u0208\u0209\f\17\2\2\u0209\u020a\7I\2\2\u020a\u020b\5J&" +
                    "\2\u020b\u020c\7J\2\2\u020c\u020d\5J&\20\u020d\u0212\3\2\2\2\u020e\u020f" +
                    "\f\16\2\2\u020f\u0210\7*\2\2\u0210\u0212\5J&\17\u0211\u01f3\3\2\2\2\u0211" +
                    "\u01f6\3\2\2\2\u0211\u01f9\3\2\2\2\u0211\u01fc\3\2\2\2\u0211\u01ff\3\2" +
                    "\2\2\u0211\u0202\3\2\2\2\u0211\u0205\3\2\2\2\u0211\u0208\3\2\2\2\u0211" +
                    "\u020e\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2" +
                    "\2\2\u0214K\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0218\7B\2\2\u0217\u0219" +
                    "\5H%\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a" +
                    "\u021b\7C\2\2\u021bM\3\2\2\2\u021c\u021d\7B\2\2\u021d\u021e\5J&\2\u021e" +
                    "\u021f\7C\2\2\u021f\u0221\3\2\2\2\u0220\u021c\3\2\2\2\u0221\u0222\3\2" +
                    "\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223O\3\2\2\2+QX`bi\u008c" +
                    "\u0098\u009d\u00a2\u00a6\u00ab\u00b1\u00c8\u00cb\u00d0\u00d7\u00e3\u00e7" +
                    "\u0106\u0110\u0119\u012d\u0133\u0157\u015d\u0173\u0183\u01b3\u01ba\u01c4" +
                    "\u01d1\u01d5\u01d9\u01dd\u01e3\u01e8\u01f1\u0211\u0213\u0218\u0222";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    static {
        RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public QParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "parse", "block", "statement", "reAssignment", "functionCall", "allImport",
                "objFunctionCall", "header", "ifStatement", "ifStat", "hereStatement",
                "varHereStatement", "elseIfStat", "constructorStatement", "objCreateStatement",
                "osExecStatement", "fileWriteStatement", "verifyFileStatement", "elseStat",
                "functionDecl", "forStatement", "forInStatement", "importStatement",
                "anonymousFunction", "importFromGithubStatement", "importAllStatement",
                "customClass", "tryCatchStatement", "whileStatement", "windowRenderStatement",
                "windowAddCompStatement", "addWebServerTextStatement", "mainFunctionStatement",
                "idList", "classStatement", "exprList", "expression", "list", "indexes"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'::'", "'@'", "'header'", "'cn'", "'new'", "'as'", "'sys'", "'write'",
                "'verify'", "'range'", "'#'", "'.'", "'all'", "'custom'", "'define'",
                "'\"'", "'onerr'", "'render'", "'changeText'", "'fn main()'", "'random'",
                "'std::ln'", "'async'", "'addComp'", "'var'", "'import'", "'std::out'",
                "'std::in'", "'assert'", "'fn'", "'toInt'", "'if'", "'else'", "'return'",
                "'for'", "'while'", "'to'", "'do'", "'end'", "'in'", "'null'", "'try'",
                "'class'", "'const'", "'noval'", "'self'", "'||'", "'&&'", "'=='", "'!='",
                "'>='", "'<='", "'^'", "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'",
                "'%'", "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "'='", "','",
                "'?'", "':'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, "Println",
                "Async", "AddComponent", "Var", "Import", "Print", "Input", "Assert",
                "Def", "ToInt", "If", "Else", "Return", "For", "While", "To", "Do", "End",
                "In", "Null", "Try", "Class", "Const", "Noval", "Self", "Or", "And",
                "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", "Excl", "GT", "LT",
                "Add", "Subtract", "Multiply", "Divide", "Modulus", "OBrace", "CBrace",
                "OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign", "Comma",
                "QMark", "Colon", "Bool", "Number", "Identifier", "String", "Comment",
                "Space"
        };
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
    public String getGrammarFileName() {
        return "Q.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public final ParseContext parse() throws RecognitionException {
        ParseContext _localctx = new ParseContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_parse);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(79);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__1) {
                    {
                        setState(78);
                        header();
                    }
                }

                setState(86);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(81);
                                allImport();
                                setState(82);
                                match(SColon);
                            }
                        }
                    }
                    setState(88);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
                }
                setState(89);
                block();
                setState(90);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(96);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__19) | (1L << Println) | (1L << Async) | (1L << Print) | (1L << Assert) | (1L << Def) | (1L << ToInt) | (1L << If) | (1L << For) | (1L << While) | (1L << Try) | (1L << Class) | (1L << Const) | (1L << Noval) | (1L << Self))) != 0) || _la == Identifier) {
                    {
                        setState(94);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                            case 1: {
                                setState(92);
                                statement();
                            }
                            break;
                            case 2: {
                                setState(93);
                                functionDecl();
                            }
                            break;
                        }
                    }
                    setState(98);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(103);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Return) {
                    {
                        setState(99);
                        match(Return);
                        setState(100);
                        expression(0);
                        setState(101);
                        match(SColon);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_statement);
        int _la;
        try {
            setState(150);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(105);
                    functionCall();
                    setState(106);
                    match(SColon);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(108);
                    ifStatement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(109);
                    forStatement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(110);
                    forInStatement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(111);
                    whileStatement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(112);
                    tryCatchStatement();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(113);
                    mainFunctionStatement();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(114);
                    addWebServerTextStatement();
                    setState(115);
                    match(SColon);
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(117);
                    reAssignment();
                    setState(118);
                    match(SColon);
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(120);
                    classStatement();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(121);
                    constructorStatement();
                    setState(122);
                    match(SColon);
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(124);
                    windowAddCompStatement();
                    setState(125);
                    match(SColon);
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(127);
                    windowRenderStatement();
                    setState(128);
                    match(SColon);
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(130);
                    fileWriteStatement();
                    setState(131);
                    match(SColon);
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(133);
                    verifyFileStatement();
                    setState(134);
                    match(SColon);
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(136);
                    objFunctionCall();
                    setState(138);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == SColon) {
                        {
                            setState(137);
                            match(SColon);
                        }
                    }

                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(140);
                    objCreateStatement();
                    setState(141);
                    match(SColon);
                }
                break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(143);
                    osExecStatement();
                    setState(144);
                    match(SColon);
                }
                break;
                case 19:
                    enterOuterAlt(_localctx, 19);
                {
                    setState(146);
                    anonymousFunction();
                }
                break;
                case 20:
                    enterOuterAlt(_localctx, 20);
                {
                    setState(147);
                    hereStatement();
                    setState(148);
                    match(SColon);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ReAssignmentContext reAssignment() throws RecognitionException {
        ReAssignmentContext _localctx = new ReAssignmentContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_reAssignment);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(155);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(152);
                                _la = _input.LA(1);
                                if (!(_la == Const || _la == Noval)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                            }
                        }
                    }
                    setState(157);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                }
                setState(158);
                match(Identifier);
                setState(164);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OBracket || _la == Assign) {
                    {
                        setState(160);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == OBracket) {
                            {
                                setState(159);
                                indexes();
                            }
                        }

                        setState(162);
                        match(Assign);
                        setState(163);
                        expression(0);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FunctionCallContext functionCall() throws RecognitionException {
        FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_functionCall);
        int _la;
        try {
            setState(201);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
                case 1:
                    _localctx = new IdentifierFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(166);
                    match(Identifier);
                    setState(167);
                    match(OParen);
                    setState(169);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (Println - 21)) | (1L << (Print - 21)) | (1L << (Input - 21)) | (1L << (Assert - 21)) | (1L << (ToInt - 21)) | (1L << (Null - 21)) | (1L << (Self - 21)) | (1L << (Excl - 21)) | (1L << (Subtract - 21)) | (1L << (OBracket - 21)) | (1L << (OParen - 21)) | (1L << (Bool - 21)) | (1L << (Number - 21)) | (1L << (Identifier - 21)) | (1L << (String - 21)))) != 0)) {
                        {
                            setState(168);
                            exprList();
                        }
                    }

                    setState(171);
                    match(CParen);
                }
                break;
                case 2:
                    _localctx = new PrintlnFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(172);
                    match(Println);
                    setState(173);
                    match(OParen);
                    setState(175);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (Println - 21)) | (1L << (Print - 21)) | (1L << (Input - 21)) | (1L << (Assert - 21)) | (1L << (ToInt - 21)) | (1L << (Null - 21)) | (1L << (Self - 21)) | (1L << (Excl - 21)) | (1L << (Subtract - 21)) | (1L << (OBracket - 21)) | (1L << (OParen - 21)) | (1L << (Bool - 21)) | (1L << (Number - 21)) | (1L << (Identifier - 21)) | (1L << (String - 21)))) != 0)) {
                        {
                            setState(174);
                            expression(0);
                        }
                    }

                    setState(177);
                    match(CParen);
                }
                break;
                case 3:
                    _localctx = new PrintFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(178);
                    match(Print);
                    setState(179);
                    match(OParen);
                    setState(180);
                    expression(0);
                    setState(181);
                    match(CParen);
                }
                break;
                case 4:
                    _localctx = new AssertFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(183);
                    match(Assert);
                    setState(184);
                    match(OParen);
                    setState(185);
                    expression(0);
                    setState(186);
                    match(CParen);
                }
                break;
                case 5:
                    _localctx = new ToIntFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(188);
                    match(ToInt);
                    setState(189);
                    match(OParen);
                    setState(190);
                    expression(0);
                    setState(191);
                    match(CParen);
                }
                break;
                case 6:
                    _localctx = new ObjFunctionCallExpressionContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(193);
                    match(Identifier);
                    setState(194);
                    match(T__0);
                    setState(195);
                    match(Identifier);
                    setState(196);
                    match(OParen);
                    setState(198);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (Println - 21)) | (1L << (Print - 21)) | (1L << (Input - 21)) | (1L << (Assert - 21)) | (1L << (ToInt - 21)) | (1L << (Null - 21)) | (1L << (Self - 21)) | (1L << (Excl - 21)) | (1L << (Subtract - 21)) | (1L << (OBracket - 21)) | (1L << (OParen - 21)) | (1L << (Bool - 21)) | (1L << (Number - 21)) | (1L << (Identifier - 21)) | (1L << (String - 21)))) != 0)) {
                        {
                            setState(197);
                            exprList();
                        }
                    }

                    setState(200);
                    match(CParen);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AllImportContext allImport() throws RecognitionException {
        AllImportContext _localctx = new AllImportContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_allImport);
        try {
            setState(206);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                case 1:
                    _localctx = new FileSystemImportStatementContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(203);
                    importStatement();
                }
                break;
                case 2:
                    _localctx = new GithubImportStatementContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(204);
                    importFromGithubStatement();
                }
                break;
                case 3:
                    _localctx = new ImportAllContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(205);
                    importAllStatement();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ObjFunctionCallContext objFunctionCall() throws RecognitionException {
        ObjFunctionCallContext _localctx = new ObjFunctionCallContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_objFunctionCall);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(208);
                match(Identifier);
                setState(209);
                match(T__0);
                setState(210);
                match(Identifier);
                setState(211);
                match(OParen);
                setState(213);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (Println - 21)) | (1L << (Print - 21)) | (1L << (Input - 21)) | (1L << (Assert - 21)) | (1L << (ToInt - 21)) | (1L << (Null - 21)) | (1L << (Self - 21)) | (1L << (Excl - 21)) | (1L << (Subtract - 21)) | (1L << (OBracket - 21)) | (1L << (OParen - 21)) | (1L << (Bool - 21)) | (1L << (Number - 21)) | (1L << (Identifier - 21)) | (1L << (String - 21)))) != 0)) {
                    {
                        setState(212);
                        exprList();
                    }
                }

                setState(215);
                match(CParen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final HeaderContext header() throws RecognitionException {
        HeaderContext _localctx = new HeaderContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_header);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(217);
                match(T__1);
                setState(218);
                match(T__2);
                setState(219);
                match(Identifier);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IfStatementContext ifStatement() throws RecognitionException {
        IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_ifStatement);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(221);
                ifStat();
                setState(225);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(222);
                                elseIfStat();
                            }
                        }
                    }
                    setState(227);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
                }
                setState(229);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Else) {
                    {
                        setState(228);
                        elseStat();
                    }
                }

                setState(231);
                match(End);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IfStatContext ifStat() throws RecognitionException {
        IfStatContext _localctx = new IfStatContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_ifStat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(233);
                match(If);
                setState(234);
                match(OParen);
                setState(235);
                expression(0);
                setState(236);
                match(CParen);
                setState(237);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final HereStatementContext hereStatement() throws RecognitionException {
        HereStatementContext _localctx = new HereStatementContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_hereStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(239);
                match(Self);
                setState(240);
                match(T__0);
                setState(241);
                match(Identifier);
                setState(242);
                match(Assign);
                setState(243);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VarHereStatementContext varHereStatement() throws RecognitionException {
        VarHereStatementContext _localctx = new VarHereStatementContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_varHereStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(245);
                match(Self);
                setState(246);
                match(T__0);
                setState(247);
                match(Identifier);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ElseIfStatContext elseIfStat() throws RecognitionException {
        ElseIfStatContext _localctx = new ElseIfStatContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_elseIfStat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(249);
                match(Else);
                setState(250);
                match(If);
                setState(251);
                match(OParen);
                setState(252);
                expression(0);
                setState(253);
                match(CParen);
                setState(254);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ConstructorStatementContext constructorStatement() throws RecognitionException {
        ConstructorStatementContext _localctx = new ConstructorStatementContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_constructorStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(256);
                match(T__3);
                setState(257);
                match(Identifier);
                setState(258);
                match(OParen);
                setState(260);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (Println - 21)) | (1L << (Print - 21)) | (1L << (Input - 21)) | (1L << (Assert - 21)) | (1L << (ToInt - 21)) | (1L << (Null - 21)) | (1L << (Self - 21)) | (1L << (Excl - 21)) | (1L << (Subtract - 21)) | (1L << (OBracket - 21)) | (1L << (OParen - 21)) | (1L << (Bool - 21)) | (1L << (Number - 21)) | (1L << (Identifier - 21)) | (1L << (String - 21)))) != 0)) {
                    {
                        setState(259);
                        exprList();
                    }
                }

                setState(262);
                match(CParen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ObjCreateStatementContext objCreateStatement() throws RecognitionException {
        ObjCreateStatementContext _localctx = new ObjCreateStatementContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_objCreateStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(264);
                match(T__4);
                setState(265);
                match(Identifier);
                setState(266);
                match(T__5);
                setState(267);
                match(Identifier);
                setState(268);
                match(OParen);
                setState(270);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (Println - 21)) | (1L << (Print - 21)) | (1L << (Input - 21)) | (1L << (Assert - 21)) | (1L << (ToInt - 21)) | (1L << (Null - 21)) | (1L << (Self - 21)) | (1L << (Excl - 21)) | (1L << (Subtract - 21)) | (1L << (OBracket - 21)) | (1L << (OParen - 21)) | (1L << (Bool - 21)) | (1L << (Number - 21)) | (1L << (Identifier - 21)) | (1L << (String - 21)))) != 0)) {
                    {
                        setState(269);
                        exprList();
                    }
                }

                setState(272);
                match(CParen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final OsExecStatementContext osExecStatement() throws RecognitionException {
        OsExecStatementContext _localctx = new OsExecStatementContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_osExecStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(274);
                match(T__6);
                setState(275);
                match(T__0);
                setState(276);
                match(Identifier);
                setState(277);
                match(OParen);
                setState(279);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (Println - 21)) | (1L << (Print - 21)) | (1L << (Input - 21)) | (1L << (Assert - 21)) | (1L << (ToInt - 21)) | (1L << (Null - 21)) | (1L << (Self - 21)) | (1L << (Excl - 21)) | (1L << (Subtract - 21)) | (1L << (OBracket - 21)) | (1L << (OParen - 21)) | (1L << (Bool - 21)) | (1L << (Number - 21)) | (1L << (Identifier - 21)) | (1L << (String - 21)))) != 0)) {
                    {
                        setState(278);
                        expression(0);
                    }
                }

                setState(281);
                match(CParen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FileWriteStatementContext fileWriteStatement() throws RecognitionException {
        FileWriteStatementContext _localctx = new FileWriteStatementContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_fileWriteStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(283);
                match(Identifier);
                setState(284);
                match(T__0);
                setState(285);
                match(T__7);
                setState(286);
                match(OParen);
                setState(287);
                expression(0);
                setState(288);
                match(CParen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VerifyFileStatementContext verifyFileStatement() throws RecognitionException {
        VerifyFileStatementContext _localctx = new VerifyFileStatementContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_verifyFileStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(290);
                match(T__8);
                setState(291);
                match(OParen);
                setState(292);
                expression(0);
                setState(293);
                match(CParen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ElseStatContext elseStat() throws RecognitionException {
        ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_elseStat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(295);
                match(Else);
                setState(296);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FunctionDeclContext functionDecl() throws RecognitionException {
        FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_functionDecl);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(299);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Async) {
                    {
                        setState(298);
                        match(Async);
                    }
                }

                setState(301);
                match(Def);
                setState(302);
                match(Identifier);
                setState(303);
                match(OParen);
                setState(305);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Identifier) {
                    {
                        setState(304);
                        idList();
                    }
                }

                setState(307);
                match(CParen);
                setState(308);
                block();
                setState(309);
                match(End);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ForStatementContext forStatement() throws RecognitionException {
        ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_forStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(311);
                match(For);
                setState(312);
                match(OParen);
                setState(313);
                match(Identifier);
                setState(314);
                match(Assign);
                setState(315);
                expression(0);
                setState(316);
                match(To);
                setState(317);
                expression(0);
                setState(318);
                match(CParen);
                setState(319);
                block();
                setState(320);
                match(End);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ForInStatementContext forInStatement() throws RecognitionException {
        ForInStatementContext _localctx = new ForInStatementContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_forInStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(322);
                match(For);
                setState(323);
                match(OParen);
                setState(324);
                match(Identifier);
                setState(325);
                match(In);
                setState(326);
                match(T__9);
                setState(327);
                match(OParen);
                setState(328);
                expression(0);
                setState(329);
                match(CParen);
                setState(330);
                match(CParen);
                setState(331);
                block();
                setState(332);
                match(End);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ImportStatementContext importStatement() throws RecognitionException {
        ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_importStatement);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(334);
                match(T__10);
                setState(335);
                match(Import);
                setState(336);
                match(Identifier);
                setState(341);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(337);
                                match(T__11);
                                setState(338);
                                match(Identifier);
                            }
                        }
                    }
                    setState(343);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AnonymousFunctionContext anonymousFunction() throws RecognitionException {
        AnonymousFunctionContext _localctx = new AnonymousFunctionContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_anonymousFunction);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(344);
                match(Def);
                setState(345);
                match(OParen);
                setState(347);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (Println - 21)) | (1L << (Print - 21)) | (1L << (Input - 21)) | (1L << (Assert - 21)) | (1L << (ToInt - 21)) | (1L << (Null - 21)) | (1L << (Self - 21)) | (1L << (Excl - 21)) | (1L << (Subtract - 21)) | (1L << (OBracket - 21)) | (1L << (OParen - 21)) | (1L << (Bool - 21)) | (1L << (Number - 21)) | (1L << (Identifier - 21)) | (1L << (String - 21)))) != 0)) {
                    {
                        setState(346);
                        exprList();
                    }
                }

                setState(349);
                match(CParen);
                setState(350);
                match(Subtract);
                setState(351);
                match(GT);
                setState(352);
                block();
                setState(353);
                match(End);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ImportFromGithubStatementContext importFromGithubStatement() throws RecognitionException {
        ImportFromGithubStatementContext _localctx = new ImportFromGithubStatementContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_importFromGithubStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(355);
                match(T__10);
                setState(356);
                match(Import);
                setState(357);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ImportAllStatementContext importAllStatement() throws RecognitionException {
        ImportAllStatementContext _localctx = new ImportAllStatementContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_importAllStatement);
        try {
            setState(369);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(359);
                    match(T__10);
                    setState(360);
                    match(Import);
                    setState(361);
                    match(OBracket);
                    setState(362);
                    match(Multiply);
                    setState(363);
                    match(CBracket);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(364);
                    match(T__10);
                    setState(365);
                    match(Import);
                    setState(366);
                    match(OBracket);
                    setState(367);
                    match(T__12);
                    setState(368);
                    match(CBracket);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final CustomClassContext customClass() throws RecognitionException {
        CustomClassContext _localctx = new CustomClassContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_customClass);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(371);
                match(T__13);
                setState(372);
                match(Class);
                setState(373);
                match(Identifier);
                setState(385);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(374);
                                match(OBracket);
                                setState(375);
                                match(T__14);
                                setState(376);
                                match(CBracket);
                                setState(377);
                                match(T__15);
                                setState(378);
                                match(Identifier);
                                setState(379);
                                match(T__15);
                                setState(380);
                                match(Colon);
                                setState(381);
                                match(Identifier);
                                setState(382);
                                match(SColon);
                            }
                        }
                    }
                    setState(387);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
                }
                setState(388);
                block();
                setState(389);
                match(End);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
        TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_tryCatchStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(391);
                match(Try);
                setState(392);
                block();
                setState(393);
                match(T__16);
                setState(394);
                block();
                setState(395);
                match(End);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final WhileStatementContext whileStatement() throws RecognitionException {
        WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_whileStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(397);
                match(While);
                setState(398);
                match(OParen);
                setState(399);
                expression(0);
                setState(400);
                match(CParen);
                setState(401);
                block();
                setState(402);
                match(End);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final WindowRenderStatementContext windowRenderStatement() throws RecognitionException {
        WindowRenderStatementContext _localctx = new WindowRenderStatementContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_windowRenderStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(404);
                match(Identifier);
                setState(405);
                match(T__0);
                setState(406);
                match(T__17);
                setState(407);
                match(OParen);
                setState(408);
                match(CParen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final WindowAddCompStatementContext windowAddCompStatement() throws RecognitionException {
        WindowAddCompStatementContext _localctx = new WindowAddCompStatementContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_windowAddCompStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(410);
                match(Identifier);
                setState(411);
                match(T__0);
                setState(412);
                match(AddComponent);
                setState(413);
                match(OParen);
                setState(414);
                expression(0);
                setState(415);
                match(CParen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AddWebServerTextStatementContext addWebServerTextStatement() throws RecognitionException {
        AddWebServerTextStatementContext _localctx = new AddWebServerTextStatementContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_addWebServerTextStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(417);
                match(Identifier);
                setState(418);
                match(T__0);
                setState(419);
                match(T__18);
                setState(420);
                match(OParen);
                setState(421);
                expression(0);
                setState(422);
                match(CParen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final MainFunctionStatementContext mainFunctionStatement() throws RecognitionException {
        MainFunctionStatementContext _localctx = new MainFunctionStatementContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_mainFunctionStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(424);
                match(T__19);
                setState(425);
                block();
                setState(426);
                match(End);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IdListContext idList() throws RecognitionException {
        IdListContext _localctx = new IdListContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_idList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(428);
                match(Identifier);
                setState(433);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(429);
                            match(Comma);
                            setState(430);
                            match(Identifier);
                        }
                    }
                    setState(435);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ClassStatementContext classStatement() throws RecognitionException {
        ClassStatementContext _localctx = new ClassStatementContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_classStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(436);
                match(Class);
                setState(437);
                match(Identifier);
                setState(440);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Colon) {
                    {
                        setState(438);
                        match(Colon);
                        setState(439);
                        match(Identifier);
                    }
                }

                setState(442);
                block();
                setState(443);
                match(End);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExprListContext exprList() throws RecognitionException {
        ExprListContext _localctx = new ExprListContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_exprList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(445);
                expression(0);
                setState(450);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(446);
                            match(Comma);
                            setState(447);
                            expression(0);
                        }
                    }
                    setState(452);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExpressionContext expression() throws RecognitionException {
        return expression(0);
    }

    private ExpressionContext expression(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
        ExpressionContext _prevctx = _localctx;
        int _startState = 72;
        enterRecursionRule(_localctx, 72, RULE_expression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(495);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 36, _ctx)) {
                    case 1: {
                        _localctx = new UnaryMinusExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(454);
                        match(Subtract);
                        setState(455);
                        expression(22);
                    }
                    break;
                    case 2: {
                        _localctx = new NotExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(456);
                        match(Excl);
                        setState(457);
                        expression(21);
                    }
                    break;
                    case 3: {
                        _localctx = new NumberExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(458);
                        match(Number);
                    }
                    break;
                    case 4: {
                        _localctx = new BoolExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(459);
                        match(Bool);
                    }
                    break;
                    case 5: {
                        _localctx = new NullExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(460);
                        match(Null);
                    }
                    break;
                    case 6: {
                        _localctx = new FunctionCallExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(461);
                        functionCall();
                        setState(463);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 30, _ctx)) {
                            case 1: {
                                setState(462);
                                indexes();
                            }
                            break;
                        }
                    }
                    break;
                    case 7: {
                        _localctx = new ListExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(465);
                        list();
                        setState(467);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 31, _ctx)) {
                            case 1: {
                                setState(466);
                                indexes();
                            }
                            break;
                        }
                    }
                    break;
                    case 8: {
                        _localctx = new IdentifierExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(469);
                        match(Identifier);
                        setState(471);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 32, _ctx)) {
                            case 1: {
                                setState(470);
                                indexes();
                            }
                            break;
                        }
                    }
                    break;
                    case 9: {
                        _localctx = new StringExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(473);
                        match(String);
                        setState(475);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 33, _ctx)) {
                            case 1: {
                                setState(474);
                                indexes();
                            }
                            break;
                        }
                    }
                    break;
                    case 10: {
                        _localctx = new ExpressionExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(477);
                        match(OParen);
                        setState(478);
                        expression(0);
                        setState(479);
                        match(CParen);
                        setState(481);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 34, _ctx)) {
                            case 1: {
                                setState(480);
                                indexes();
                            }
                            break;
                        }
                    }
                    break;
                    case 11: {
                        _localctx = new InputExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(483);
                        match(Input);
                        setState(484);
                        match(OParen);
                        setState(486);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == String) {
                            {
                                setState(485);
                                match(String);
                            }
                        }

                        setState(488);
                        match(CParen);
                    }
                    break;
                    case 12: {
                        _localctx = new HereVarExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(489);
                        varHereStatement();
                    }
                    break;
                    case 13: {
                        _localctx = new RandomExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(490);
                        match(T__20);
                        setState(491);
                        match(OParen);
                        setState(492);
                        expression(0);
                        setState(493);
                        match(CParen);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(529);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 38, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(527);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 37, _ctx)) {
                                case 1: {
                                    _localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(497);
                                    if (!(precpred(_ctx, 20)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 20)");
                                    setState(498);
                                    match(Pow);
                                    setState(499);
                                    expression(20);
                                }
                                break;
                                case 2: {
                                    _localctx = new MultExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(500);
                                    if (!(precpred(_ctx, 19)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 19)");
                                    setState(501);
                                    ((MultExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0))) {
                                        ((MultExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(502);
                                    expression(20);
                                }
                                break;
                                case 3: {
                                    _localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(503);
                                    if (!(precpred(_ctx, 18)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                                    setState(504);
                                    ((AddExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == Add || _la == Subtract)) {
                                        ((AddExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(505);
                                    expression(19);
                                }
                                break;
                                case 4: {
                                    _localctx = new CompExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(506);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(507);
                                    ((CompExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GTEquals) | (1L << LTEquals) | (1L << GT) | (1L << LT))) != 0))) {
                                        ((CompExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(508);
                                    expression(18);
                                }
                                break;
                                case 5: {
                                    _localctx = new EqExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(509);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(510);
                                    ((EqExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == Equals || _la == NEquals)) {
                                        ((EqExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(511);
                                    expression(17);
                                }
                                break;
                                case 6: {
                                    _localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(512);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(513);
                                    match(And);
                                    setState(514);
                                    expression(16);
                                }
                                break;
                                case 7: {
                                    _localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(515);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(516);
                                    match(Or);
                                    setState(517);
                                    expression(15);
                                }
                                break;
                                case 8: {
                                    _localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(518);
                                    if (!(precpred(_ctx, 13)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(519);
                                    match(QMark);
                                    setState(520);
                                    expression(0);
                                    setState(521);
                                    match(Colon);
                                    setState(522);
                                    expression(14);
                                }
                                break;
                                case 9: {
                                    _localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(524);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(525);
                                    match(In);
                                    setState(526);
                                    expression(13);
                                }
                                break;
                            }
                        }
                    }
                    setState(531);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 38, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final ListContext list() throws RecognitionException {
        ListContext _localctx = new ListContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(532);
                match(OBracket);
                setState(534);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (Println - 21)) | (1L << (Print - 21)) | (1L << (Input - 21)) | (1L << (Assert - 21)) | (1L << (ToInt - 21)) | (1L << (Null - 21)) | (1L << (Self - 21)) | (1L << (Excl - 21)) | (1L << (Subtract - 21)) | (1L << (OBracket - 21)) | (1L << (OParen - 21)) | (1L << (Bool - 21)) | (1L << (Number - 21)) | (1L << (Identifier - 21)) | (1L << (String - 21)))) != 0)) {
                    {
                        setState(533);
                        exprList();
                    }
                }

                setState(536);
                match(CBracket);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IndexesContext indexes() throws RecognitionException {
        IndexesContext _localctx = new IndexesContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_indexes);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(542);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(538);
                                match(OBracket);
                                setState(539);
                                expression(0);
                                setState(540);
                                match(CBracket);
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(544);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 40, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 36:
                return expression_sempred((ExpressionContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 20);
            case 1:
                return precpred(_ctx, 19);
            case 2:
                return precpred(_ctx, 18);
            case 3:
                return precpred(_ctx, 17);
            case 4:
                return precpred(_ctx, 16);
            case 5:
                return precpred(_ctx, 15);
            case 6:
                return precpred(_ctx, 14);
            case 7:
                return precpred(_ctx, 13);
            case 8:
                return precpred(_ctx, 12);
        }
        return true;
    }

    public static class ParseContext extends ParserRuleContext {
        public ParseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(QParser.EOF, 0);
        }

        public HeaderContext header() {
            return getRuleContext(HeaderContext.class, 0);
        }

        public List<AllImportContext> allImport() {
            return getRuleContexts(AllImportContext.class);
        }

        public AllImportContext allImport(int i) {
            return getRuleContext(AllImportContext.class, i);
        }

        public List<TerminalNode> SColon() {
            return getTokens(QParser.SColon);
        }

        public TerminalNode SColon(int i) {
            return getToken(QParser.SColon, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parse;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterParse(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitParse(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitParse(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BlockContext extends ParserRuleContext {
        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public List<FunctionDeclContext> functionDecl() {
            return getRuleContexts(FunctionDeclContext.class);
        }

        public FunctionDeclContext functionDecl(int i) {
            return getRuleContext(FunctionDeclContext.class, i);
        }

        public TerminalNode Return() {
            return getToken(QParser.Return, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode SColon() {
            return getToken(QParser.SColon, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitBlock(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StatementContext extends ParserRuleContext {
        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public FunctionCallContext functionCall() {
            return getRuleContext(FunctionCallContext.class, 0);
        }

        public TerminalNode SColon() {
            return getToken(QParser.SColon, 0);
        }

        public IfStatementContext ifStatement() {
            return getRuleContext(IfStatementContext.class, 0);
        }

        public ForStatementContext forStatement() {
            return getRuleContext(ForStatementContext.class, 0);
        }

        public ForInStatementContext forInStatement() {
            return getRuleContext(ForInStatementContext.class, 0);
        }

        public WhileStatementContext whileStatement() {
            return getRuleContext(WhileStatementContext.class, 0);
        }

        public TryCatchStatementContext tryCatchStatement() {
            return getRuleContext(TryCatchStatementContext.class, 0);
        }

        public MainFunctionStatementContext mainFunctionStatement() {
            return getRuleContext(MainFunctionStatementContext.class, 0);
        }

        public AddWebServerTextStatementContext addWebServerTextStatement() {
            return getRuleContext(AddWebServerTextStatementContext.class, 0);
        }

        public ReAssignmentContext reAssignment() {
            return getRuleContext(ReAssignmentContext.class, 0);
        }

        public ClassStatementContext classStatement() {
            return getRuleContext(ClassStatementContext.class, 0);
        }

        public ConstructorStatementContext constructorStatement() {
            return getRuleContext(ConstructorStatementContext.class, 0);
        }

        public WindowAddCompStatementContext windowAddCompStatement() {
            return getRuleContext(WindowAddCompStatementContext.class, 0);
        }

        public WindowRenderStatementContext windowRenderStatement() {
            return getRuleContext(WindowRenderStatementContext.class, 0);
        }

        public FileWriteStatementContext fileWriteStatement() {
            return getRuleContext(FileWriteStatementContext.class, 0);
        }

        public VerifyFileStatementContext verifyFileStatement() {
            return getRuleContext(VerifyFileStatementContext.class, 0);
        }

        public ObjFunctionCallContext objFunctionCall() {
            return getRuleContext(ObjFunctionCallContext.class, 0);
        }

        public ObjCreateStatementContext objCreateStatement() {
            return getRuleContext(ObjCreateStatementContext.class, 0);
        }

        public OsExecStatementContext osExecStatement() {
            return getRuleContext(OsExecStatementContext.class, 0);
        }

        public AnonymousFunctionContext anonymousFunction() {
            return getRuleContext(AnonymousFunctionContext.class, 0);
        }

        public HereStatementContext hereStatement() {
            return getRuleContext(HereStatementContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ReAssignmentContext extends ParserRuleContext {
        public ReAssignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode Assign() {
            return getToken(QParser.Assign, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public List<TerminalNode> Const() {
            return getTokens(QParser.Const);
        }

        public TerminalNode Const(int i) {
            return getToken(QParser.Const, i);
        }

        public List<TerminalNode> Noval() {
            return getTokens(QParser.Noval);
        }

        public TerminalNode Noval(int i) {
            return getToken(QParser.Noval, i);
        }

        public IndexesContext indexes() {
            return getRuleContext(IndexesContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_reAssignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterReAssignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitReAssignment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitReAssignment(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunctionCallContext extends ParserRuleContext {
        public FunctionCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public FunctionCallContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionCall;
        }

        public void copyFrom(FunctionCallContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class AssertFunctionCallContext extends FunctionCallContext {
        public AssertFunctionCallContext(FunctionCallContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Assert() {
            return getToken(QParser.Assert, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterAssertFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitAssertFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitAssertFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PrintlnFunctionCallContext extends FunctionCallContext {
        public PrintlnFunctionCallContext(FunctionCallContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Println() {
            return getToken(QParser.Println, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterPrintlnFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitPrintlnFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitPrintlnFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ObjFunctionCallExpressionContext extends FunctionCallContext {
        public ObjFunctionCallExpressionContext(FunctionCallContext ctx) {
            copyFrom(ctx);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(QParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(QParser.Identifier, i);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public ExprListContext exprList() {
            return getRuleContext(ExprListContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterObjFunctionCallExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitObjFunctionCallExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor)
                return ((QVisitor<? extends T>) visitor).visitObjFunctionCallExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ToIntFunctionCallContext extends FunctionCallContext {
        public ToIntFunctionCallContext(FunctionCallContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ToInt() {
            return getToken(QParser.ToInt, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterToIntFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitToIntFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitToIntFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IdentifierFunctionCallContext extends FunctionCallContext {
        public IdentifierFunctionCallContext(FunctionCallContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public ExprListContext exprList() {
            return getRuleContext(ExprListContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterIdentifierFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitIdentifierFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitIdentifierFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PrintFunctionCallContext extends FunctionCallContext {
        public PrintFunctionCallContext(FunctionCallContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Print() {
            return getToken(QParser.Print, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterPrintFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitPrintFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitPrintFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AllImportContext extends ParserRuleContext {
        public AllImportContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public AllImportContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_allImport;
        }

        public void copyFrom(AllImportContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class FileSystemImportStatementContext extends AllImportContext {
        public FileSystemImportStatementContext(AllImportContext ctx) {
            copyFrom(ctx);
        }

        public ImportStatementContext importStatement() {
            return getRuleContext(ImportStatementContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterFileSystemImportStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitFileSystemImportStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor)
                return ((QVisitor<? extends T>) visitor).visitFileSystemImportStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class GithubImportStatementContext extends AllImportContext {
        public GithubImportStatementContext(AllImportContext ctx) {
            copyFrom(ctx);
        }

        public ImportFromGithubStatementContext importFromGithubStatement() {
            return getRuleContext(ImportFromGithubStatementContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterGithubImportStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitGithubImportStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitGithubImportStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ImportAllContext extends AllImportContext {
        public ImportAllContext(AllImportContext ctx) {
            copyFrom(ctx);
        }

        public ImportAllStatementContext importAllStatement() {
            return getRuleContext(ImportAllStatementContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterImportAll(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitImportAll(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitImportAll(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ObjFunctionCallContext extends ParserRuleContext {
        public ObjFunctionCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(QParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(QParser.Identifier, i);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public ExprListContext exprList() {
            return getRuleContext(ExprListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_objFunctionCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterObjFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitObjFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitObjFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class HeaderContext extends ParserRuleContext {
        public HeaderContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_header;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterHeader(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitHeader(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitHeader(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IfStatementContext extends ParserRuleContext {
        public IfStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public IfStatContext ifStat() {
            return getRuleContext(IfStatContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(QParser.End, 0);
        }

        public List<ElseIfStatContext> elseIfStat() {
            return getRuleContexts(ElseIfStatContext.class);
        }

        public ElseIfStatContext elseIfStat(int i) {
            return getRuleContext(ElseIfStatContext.class, i);
        }

        public ElseStatContext elseStat() {
            return getRuleContext(ElseStatContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterIfStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitIfStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitIfStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IfStatContext extends ParserRuleContext {
        public IfStatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode If() {
            return getToken(QParser.If, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifStat;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterIfStat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitIfStat(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitIfStat(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class HereStatementContext extends ParserRuleContext {
        public HereStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Self() {
            return getToken(QParser.Self, 0);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode Assign() {
            return getToken(QParser.Assign, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_hereStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterHereStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitHereStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitHereStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VarHereStatementContext extends ParserRuleContext {
        public VarHereStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Self() {
            return getToken(QParser.Self, 0);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_varHereStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterVarHereStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitVarHereStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitVarHereStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ElseIfStatContext extends ParserRuleContext {
        public ElseIfStatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Else() {
            return getToken(QParser.Else, 0);
        }

        public TerminalNode If() {
            return getToken(QParser.If, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elseIfStat;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterElseIfStat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitElseIfStat(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitElseIfStat(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ConstructorStatementContext extends ParserRuleContext {
        public ConstructorStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public ExprListContext exprList() {
            return getRuleContext(ExprListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constructorStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterConstructorStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitConstructorStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitConstructorStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ObjCreateStatementContext extends ParserRuleContext {
        public ObjCreateStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(QParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(QParser.Identifier, i);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public ExprListContext exprList() {
            return getRuleContext(ExprListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_objCreateStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterObjCreateStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitObjCreateStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitObjCreateStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class OsExecStatementContext extends ParserRuleContext {
        public OsExecStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_osExecStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterOsExecStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitOsExecStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitOsExecStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FileWriteStatementContext extends ParserRuleContext {
        public FileWriteStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fileWriteStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterFileWriteStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitFileWriteStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitFileWriteStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VerifyFileStatementContext extends ParserRuleContext {
        public VerifyFileStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_verifyFileStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterVerifyFileStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitVerifyFileStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitVerifyFileStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ElseStatContext extends ParserRuleContext {
        public ElseStatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Else() {
            return getToken(QParser.Else, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elseStat;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterElseStat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitElseStat(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitElseStat(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunctionDeclContext extends ParserRuleContext {
        public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Def() {
            return getToken(QParser.Def, 0);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(QParser.End, 0);
        }

        public TerminalNode Async() {
            return getToken(QParser.Async, 0);
        }

        public IdListContext idList() {
            return getRuleContext(IdListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionDecl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterFunctionDecl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitFunctionDecl(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitFunctionDecl(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ForStatementContext extends ParserRuleContext {
        public ForStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode For() {
            return getToken(QParser.For, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode Assign() {
            return getToken(QParser.Assign, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode To() {
            return getToken(QParser.To, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(QParser.End, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_forStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterForStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitForStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitForStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ForInStatementContext extends ParserRuleContext {
        public ForInStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode For() {
            return getToken(QParser.For, 0);
        }

        public List<TerminalNode> OParen() {
            return getTokens(QParser.OParen);
        }

        public TerminalNode OParen(int i) {
            return getToken(QParser.OParen, i);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode In() {
            return getToken(QParser.In, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public List<TerminalNode> CParen() {
            return getTokens(QParser.CParen);
        }

        public TerminalNode CParen(int i) {
            return getToken(QParser.CParen, i);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(QParser.End, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_forInStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterForInStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitForInStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitForInStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ImportStatementContext extends ParserRuleContext {
        public ImportStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Import() {
            return getToken(QParser.Import, 0);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(QParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(QParser.Identifier, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_importStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterImportStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitImportStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitImportStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AnonymousFunctionContext extends ParserRuleContext {
        public AnonymousFunctionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Def() {
            return getToken(QParser.Def, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public TerminalNode Subtract() {
            return getToken(QParser.Subtract, 0);
        }

        public TerminalNode GT() {
            return getToken(QParser.GT, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(QParser.End, 0);
        }

        public ExprListContext exprList() {
            return getRuleContext(ExprListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_anonymousFunction;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterAnonymousFunction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitAnonymousFunction(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitAnonymousFunction(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ImportFromGithubStatementContext extends ParserRuleContext {
        public ImportFromGithubStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Import() {
            return getToken(QParser.Import, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_importFromGithubStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterImportFromGithubStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitImportFromGithubStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor)
                return ((QVisitor<? extends T>) visitor).visitImportFromGithubStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ImportAllStatementContext extends ParserRuleContext {
        public ImportAllStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Import() {
            return getToken(QParser.Import, 0);
        }

        public TerminalNode OBracket() {
            return getToken(QParser.OBracket, 0);
        }

        public TerminalNode Multiply() {
            return getToken(QParser.Multiply, 0);
        }

        public TerminalNode CBracket() {
            return getToken(QParser.CBracket, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_importAllStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterImportAllStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitImportAllStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitImportAllStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CustomClassContext extends ParserRuleContext {
        public CustomClassContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Class() {
            return getToken(QParser.Class, 0);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(QParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(QParser.Identifier, i);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(QParser.End, 0);
        }

        public List<TerminalNode> OBracket() {
            return getTokens(QParser.OBracket);
        }

        public TerminalNode OBracket(int i) {
            return getToken(QParser.OBracket, i);
        }

        public List<TerminalNode> CBracket() {
            return getTokens(QParser.CBracket);
        }

        public TerminalNode CBracket(int i) {
            return getToken(QParser.CBracket, i);
        }

        public List<TerminalNode> Colon() {
            return getTokens(QParser.Colon);
        }

        public TerminalNode Colon(int i) {
            return getToken(QParser.Colon, i);
        }

        public List<TerminalNode> SColon() {
            return getTokens(QParser.SColon);
        }

        public TerminalNode SColon(int i) {
            return getToken(QParser.SColon, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_customClass;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterCustomClass(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitCustomClass(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitCustomClass(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TryCatchStatementContext extends ParserRuleContext {
        public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Try() {
            return getToken(QParser.Try, 0);
        }

        public List<BlockContext> block() {
            return getRuleContexts(BlockContext.class);
        }

        public BlockContext block(int i) {
            return getRuleContext(BlockContext.class, i);
        }

        public TerminalNode End() {
            return getToken(QParser.End, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tryCatchStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterTryCatchStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitTryCatchStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitTryCatchStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class WhileStatementContext extends ParserRuleContext {
        public WhileStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode While() {
            return getToken(QParser.While, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(QParser.End, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_whileStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterWhileStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitWhileStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitWhileStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class WindowRenderStatementContext extends ParserRuleContext {
        public WindowRenderStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_windowRenderStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterWindowRenderStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitWindowRenderStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitWindowRenderStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class WindowAddCompStatementContext extends ParserRuleContext {
        public WindowAddCompStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode AddComponent() {
            return getToken(QParser.AddComponent, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_windowAddCompStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterWindowAddCompStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitWindowAddCompStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitWindowAddCompStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AddWebServerTextStatementContext extends ParserRuleContext {
        public AddWebServerTextStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_addWebServerTextStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterAddWebServerTextStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitAddWebServerTextStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor)
                return ((QVisitor<? extends T>) visitor).visitAddWebServerTextStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class MainFunctionStatementContext extends ParserRuleContext {
        public MainFunctionStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(QParser.End, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mainFunctionStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterMainFunctionStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitMainFunctionStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitMainFunctionStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IdListContext extends ParserRuleContext {
        public IdListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(QParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(QParser.Identifier, i);
        }

        public List<TerminalNode> Comma() {
            return getTokens(QParser.Comma);
        }

        public TerminalNode Comma(int i) {
            return getToken(QParser.Comma, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_idList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterIdList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitIdList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitIdList(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ClassStatementContext extends ParserRuleContext {
        public ClassStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Class() {
            return getToken(QParser.Class, 0);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(QParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(QParser.Identifier, i);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(QParser.End, 0);
        }

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterClassStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitClassStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitClassStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExprListContext extends ParserRuleContext {
        public ExprListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<TerminalNode> Comma() {
            return getTokens(QParser.Comma);
        }

        public TerminalNode Comma(int i) {
            return getToken(QParser.Comma, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exprList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterExprList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitExprList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitExprList(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExpressionContext extends ParserRuleContext {
        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExpressionContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        public void copyFrom(ExpressionContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class BoolExpressionContext extends ExpressionContext {
        public BoolExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Bool() {
            return getToken(QParser.Bool, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterBoolExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitBoolExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitBoolExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NumberExpressionContext extends ExpressionContext {
        public NumberExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Number() {
            return getToken(QParser.Number, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterNumberExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitNumberExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitNumberExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IdentifierExpressionContext extends ExpressionContext {
        public IdentifierExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public IndexesContext indexes() {
            return getRuleContext(IndexesContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterIdentifierExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitIdentifierExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitIdentifierExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NotExpressionContext extends ExpressionContext {
        public NotExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Excl() {
            return getToken(QParser.Excl, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterNotExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitNotExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitNotExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class OrExpressionContext extends ExpressionContext {
        public OrExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode Or() {
            return getToken(QParser.Or, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterOrExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitOrExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitOrExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class UnaryMinusExpressionContext extends ExpressionContext {
        public UnaryMinusExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Subtract() {
            return getToken(QParser.Subtract, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterUnaryMinusExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitUnaryMinusExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitUnaryMinusExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PowerExpressionContext extends ExpressionContext {
        public PowerExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode Pow() {
            return getToken(QParser.Pow, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterPowerExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitPowerExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitPowerExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class HereVarExpressionContext extends ExpressionContext {
        public HereVarExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public VarHereStatementContext varHereStatement() {
            return getRuleContext(VarHereStatementContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterHereVarExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitHereVarExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitHereVarExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class EqExpressionContext extends ExpressionContext {
        public Token op;

        public EqExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode Equals() {
            return getToken(QParser.Equals, 0);
        }

        public TerminalNode NEquals() {
            return getToken(QParser.NEquals, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterEqExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitEqExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitEqExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AndExpressionContext extends ExpressionContext {
        public AndExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode And() {
            return getToken(QParser.And, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterAndExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitAndExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitAndExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class InExpressionContext extends ExpressionContext {
        public InExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode In() {
            return getToken(QParser.In, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterInExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitInExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitInExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StringExpressionContext extends ExpressionContext {
        public StringExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode String() {
            return getToken(QParser.String, 0);
        }

        public IndexesContext indexes() {
            return getRuleContext(IndexesContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterStringExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitStringExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitStringExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExpressionExpressionContext extends ExpressionContext {
        public ExpressionExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public IndexesContext indexes() {
            return getRuleContext(IndexesContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterExpressionExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitExpressionExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitExpressionExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AddExpressionContext extends ExpressionContext {
        public Token op;

        public AddExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode Add() {
            return getToken(QParser.Add, 0);
        }

        public TerminalNode Subtract() {
            return getToken(QParser.Subtract, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterAddExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitAddExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitAddExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CompExpressionContext extends ExpressionContext {
        public Token op;

        public CompExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode GTEquals() {
            return getToken(QParser.GTEquals, 0);
        }

        public TerminalNode LTEquals() {
            return getToken(QParser.LTEquals, 0);
        }

        public TerminalNode GT() {
            return getToken(QParser.GT, 0);
        }

        public TerminalNode LT() {
            return getToken(QParser.LT, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterCompExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitCompExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitCompExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NullExpressionContext extends ExpressionContext {
        public NullExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Null() {
            return getToken(QParser.Null, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterNullExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitNullExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitNullExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunctionCallExpressionContext extends ExpressionContext {
        public FunctionCallExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public FunctionCallContext functionCall() {
            return getRuleContext(FunctionCallContext.class, 0);
        }

        public IndexesContext indexes() {
            return getRuleContext(IndexesContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterFunctionCallExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitFunctionCallExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitFunctionCallExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class MultExpressionContext extends ExpressionContext {
        public Token op;

        public MultExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode Multiply() {
            return getToken(QParser.Multiply, 0);
        }

        public TerminalNode Divide() {
            return getToken(QParser.Divide, 0);
        }

        public TerminalNode Modulus() {
            return getToken(QParser.Modulus, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterMultExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitMultExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitMultExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ListExpressionContext extends ExpressionContext {
        public ListExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public ListContext list() {
            return getRuleContext(ListContext.class, 0);
        }

        public IndexesContext indexes() {
            return getRuleContext(IndexesContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterListExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitListExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitListExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class RandomExpressionContext extends ExpressionContext {
        public RandomExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterRandomExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitRandomExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitRandomExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TernaryExpressionContext extends ExpressionContext {
        public TernaryExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode QMark() {
            return getToken(QParser.QMark, 0);
        }

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterTernaryExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitTernaryExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitTernaryExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class InputExpressionContext extends ExpressionContext {
        public InputExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Input() {
            return getToken(QParser.Input, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public TerminalNode String() {
            return getToken(QParser.String, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterInputExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitInputExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitInputExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ListContext extends ParserRuleContext {
        public ListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode OBracket() {
            return getToken(QParser.OBracket, 0);
        }

        public TerminalNode CBracket() {
            return getToken(QParser.CBracket, 0);
        }

        public ExprListContext exprList() {
            return getRuleContext(ExprListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitList(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IndexesContext extends ParserRuleContext {
        public IndexesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> OBracket() {
            return getTokens(QParser.OBracket);
        }

        public TerminalNode OBracket(int i) {
            return getToken(QParser.OBracket, i);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<TerminalNode> CBracket() {
            return getTokens(QParser.CBracket);
        }

        public TerminalNode CBracket(int i) {
            return getToken(QParser.CBracket, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_indexes;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterIndexes(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitIndexes(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitIndexes(this);
            else return visitor.visitChildren(this);
        }
    }
}