// Generated from /Users/harryharbuck-marlowe/Downloads/Q/src/main/java/qlang/core/internal/Q.g4 by ANTLR 4.9.2
package qlang.core.interp;

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
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, Println = 14, Async = 15, Var = 16, Import = 17,
            Print = 18, Input = 19, Assert = 20, Def = 21, If = 22, Else = 23, Package = 24, Return = 25,
            For = 26, While = 27, JavaJuice = 28, To = 29, Do = 30, End = 31, In = 32, Null = 33,
            Try = 34, Class = 35, Const = 36, Self = 37, Native = 38, Or = 39, Accessor = 40, And = 41,
            Equals = 42, NEquals = 43, GTEquals = 44, LTEquals = 45, Pow = 46, Excl = 47, GT = 48,
            LT = 49, Add = 50, Subtract = 51, Multiply = 52, Divide = 53, Modulus = 54, OBrace = 55,
            CBrace = 56, OBracket = 57, CBracket = 58, OParen = 59, CParen = 60, SColon = 61,
            Assign = 62, Comma = 63, QMark = 64, Colon = 65, Bool = 66, Number = 67, Identifier = 68,
            String = 69, Comment = 70, Space = 71;
    public static final int
            RULE_parse = 0, RULE_block = 1, RULE_statement = 2, RULE_reAssignment = 3,
            RULE_assignment = 4, RULE_functionCall = 5, RULE_allImport = 6, RULE_objFunctionCall = 7,
            RULE_folderImport = 8, RULE_packageStatement = 9, RULE_header = 10, RULE_ifStatement = 11,
            RULE_ifStat = 12, RULE_hereStatement = 13, RULE_varHereStatement = 14,
            RULE_elseIfStat = 15, RULE_constructorStatement = 16, RULE_objCreateStatement = 17,
            RULE_sysFunctionCall = 18, RULE_fileWriteStatement = 19, RULE_elseStat = 20,
            RULE_functionDecl = 21, RULE_nativeFunction = 22, RULE_forStatement = 23,
            RULE_forInStatement = 24, RULE_importStatement = 25, RULE_anonymousFunction = 26,
            RULE_importFromGithubStatement = 27, RULE_importAllStatement = 28, RULE_atStatement = 29,
            RULE_tryCatchStatement = 30, RULE_whileStatement = 31, RULE_mainFunctionStatement = 32,
            RULE_idList = 33, RULE_classStatement = 34, RULE_exprList = 35, RULE_expression = 36,
            RULE_list = 37, RULE_objVar = 38, RULE_indexes = 39;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u023e\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\5\2T\n\2\3" +
                    "\2\5\2W\n\2\3\2\3\2\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\2\3\2\3\2\3\3\3\3\7" +
                    "\3f\n\3\f\3\16\3i\13\3\3\3\3\3\3\3\3\3\5\3o\n\3\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0084\n\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0094\n\4\3" +
                    "\5\3\5\5\5\u0098\n\5\3\5\5\5\u009b\n\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6\u00a3" +
                    "\n\6\3\6\3\6\5\6\u00a7\n\6\3\7\3\7\3\7\5\7\u00ac\n\7\3\7\3\7\3\7\3\7\5" +
                    "\7\u00b2\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3" +
                    "\7\3\7\5\7\u00c4\n\7\3\7\5\7\u00c7\n\7\3\b\3\b\3\b\3\b\5\b\u00cd\n\b\3" +
                    "\t\3\t\3\t\3\t\3\t\5\t\u00d4\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00de" +
                    "\n\n\f\n\16\n\u00e1\13\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u00e9\n\13\f" +
                    "\13\16\13\u00ec\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\7\r\u00f6\n\r" +
                    "\f\r\16\r\u00f9\13\r\3\r\5\r\u00fc\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16" +
                    "\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21" +
                    "\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u011d\n\22\3\22" +
                    "\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u012a\n\23\3\23" +
                    "\5\23\u012d\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u0134\n\24\3\24\3\24\3" +
                    "\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\5\27\u0144" +
                    "\n\27\3\27\3\27\3\27\3\27\5\27\u014a\n\27\3\27\3\27\3\27\3\27\3\27\3\30" +
                    "\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0159\n\30\f\30\16\30\u015c\13" +
                    "\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3" +
                    "\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3" +
                    "\33\3\33\3\33\3\33\3\33\7\33\u017e\n\33\f\33\16\33\u0181\13\33\3\34\3" +
                    "\34\3\34\5\34\u0186\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35" +
                    "\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3" +
                    " \3 \3 \3 \3 \7 \u01a5\n \f \16 \u01a8\13 \3 \3 \3 \3!\3!\3!\3!\3!\3!" +
                    "\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\7#\u01c1\n#\f#\16" +
                    "#\u01c4\13#\3$\5$\u01c7\n$\3$\3$\3$\3$\5$\u01cd\n$\3$\3$\3$\3%\3%\3%\7" +
                    "%\u01d5\n%\f%\16%\u01d8\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01e4\n&" +
                    "\3&\3&\5&\u01e8\n&\3&\3&\5&\u01ec\n&\3&\3&\5&\u01f0\n&\3&\3&\3&\3&\5&" +
                    "\u01f6\n&\3&\3&\3&\5&\u01fb\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0207" +
                    "\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&" +
                    "\3&\3&\3&\3&\3&\3&\3&\3&\7&\u0227\n&\f&\16&\u022a\13&\3\'\3\'\5\'\u022e" +
                    "\n\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\6)\u023a\n)\r)\16)\u023b\3)\b]\u00df" +
                    "\u00ea\u015a\u017f\u01a6\3J*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"" +
                    "$&(*,.\60\62\64\668:<>@BDFHJLNP\2\7\4\2\22\22&&\3\2\668\3\2\64\65\4\2" +
                    "./\62\63\3\2,-\2\u026e\2S\3\2\2\2\4g\3\2\2\2\6\u0093\3\2\2\2\b\u0097\3" +
                    "\2\2\2\n\u009f\3\2\2\2\f\u00c6\3\2\2\2\16\u00cc\3\2\2\2\20\u00ce\3\2\2" +
                    "\2\22\u00d7\3\2\2\2\24\u00e4\3\2\2\2\26\u00ef\3\2\2\2\30\u00f3\3\2\2\2" +
                    "\32\u00ff\3\2\2\2\34\u0106\3\2\2\2\36\u010c\3\2\2\2 \u0110\3\2\2\2\"\u0118" +
                    "\3\2\2\2$\u0123\3\2\2\2&\u012e\3\2\2\2(\u0137\3\2\2\2*\u013e\3\2\2\2," +
                    "\u0143\3\2\2\2.\u0150\3\2\2\2\60\u015f\3\2\2\2\62\u016b\3\2\2\2\64\u0178" +
                    "\3\2\2\2\66\u0182\3\2\2\28\u018e\3\2\2\2:\u0192\3\2\2\2<\u0198\3\2\2\2" +
                    ">\u019b\3\2\2\2@\u01ac\3\2\2\2B\u01b4\3\2\2\2D\u01bd\3\2\2\2F\u01c6\3" +
                    "\2\2\2H\u01d1\3\2\2\2J\u0206\3\2\2\2L\u022b\3\2\2\2N\u0231\3\2\2\2P\u0239" +
                    "\3\2\2\2RT\5\26\f\2SR\3\2\2\2ST\3\2\2\2TV\3\2\2\2UW\5\24\13\2VU\3\2\2" +
                    "\2VW\3\2\2\2W]\3\2\2\2XY\5\16\b\2YZ\7?\2\2Z\\\3\2\2\2[X\3\2\2\2\\_\3\2" +
                    "\2\2]^\3\2\2\2][\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\5\4\3\2ab\7\2\2\3b\3\3" +
                    "\2\2\2cf\5\6\4\2df\5,\27\2ec\3\2\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3" +
                    "\2\2\2hn\3\2\2\2ig\3\2\2\2jk\7\33\2\2kl\5J&\2lm\7?\2\2mo\3\2\2\2nj\3\2" +
                    "\2\2no\3\2\2\2o\5\3\2\2\2pq\5\f\7\2qr\7?\2\2r\u0094\3\2\2\2s\u0094\5\30" +
                    "\r\2t\u0094\5\60\31\2u\u0094\5\62\32\2v\u0094\5@!\2w\u0094\5> \2x\u0094" +
                    "\5B\"\2yz\5\b\5\2z{\7?\2\2{\u0094\3\2\2\2|\u0094\5F$\2}\u0094\5\"\22\2" +
                    "~\177\5(\25\2\177\u0080\7?\2\2\u0080\u0094\3\2\2\2\u0081\u0083\5\20\t" +
                    "\2\u0082\u0084\7?\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0094" +
                    "\3\2\2\2\u0085\u0086\5$\23\2\u0086\u0087\7?\2\2\u0087\u0094\3\2\2\2\u0088" +
                    "\u0089\5&\24\2\u0089\u008a\7?\2\2\u008a\u0094\3\2\2\2\u008b\u0094\5\66" +
                    "\34\2\u008c\u008d\5\34\17\2\u008d\u008e\7?\2\2\u008e\u0094\3\2\2\2\u008f" +
                    "\u0090\5\n\6\2\u0090\u0091\7?\2\2\u0091\u0094\3\2\2\2\u0092\u0094\5.\30" +
                    "\2\u0093p\3\2\2\2\u0093s\3\2\2\2\u0093t\3\2\2\2\u0093u\3\2\2\2\u0093v" +
                    "\3\2\2\2\u0093w\3\2\2\2\u0093x\3\2\2\2\u0093y\3\2\2\2\u0093|\3\2\2\2\u0093" +
                    "}\3\2\2\2\u0093~\3\2\2\2\u0093\u0081\3\2\2\2\u0093\u0085\3\2\2\2\u0093" +
                    "\u0088\3\2\2\2\u0093\u008b\3\2\2\2\u0093\u008c\3\2\2\2\u0093\u008f\3\2" +
                    "\2\2\u0093\u0092\3\2\2\2\u0094\7\3\2\2\2\u0095\u0098\7F\2\2\u0096\u0098" +
                    "\5N(\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u009a\3\2\2\2\u0099" +
                    "\u009b\5P)\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2" +
                    "\2\u009c\u009d\7@\2\2\u009d\u009e\5J&\2\u009e\t\3\2\2\2\u009f\u00a0\t" +
                    "\2\2\2\u00a0\u00a6\7F\2\2\u00a1\u00a3\5P)\2\u00a2\u00a1\3\2\2\2\u00a2" +
                    "\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7@\2\2\u00a5\u00a7\5J&" +
                    "\2\u00a6\u00a2\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\13\3\2\2\2\u00a8\u00a9" +
                    "\7F\2\2\u00a9\u00ab\7=\2\2\u00aa\u00ac\5H%\2\u00ab\u00aa\3\2\2\2\u00ab" +
                    "\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00c7\7>\2\2\u00ae\u00af\7\20" +
                    "\2\2\u00af\u00b1\7=\2\2\u00b0\u00b2\5J&\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2" +
                    "\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00c7\7>\2\2\u00b4\u00b5\7\24\2\2\u00b5" +
                    "\u00b6\7=\2\2\u00b6\u00b7\5J&\2\u00b7\u00b8\7>\2\2\u00b8\u00c7\3\2\2\2" +
                    "\u00b9\u00ba\7\26\2\2\u00ba\u00bb\7=\2\2\u00bb\u00bc\5J&\2\u00bc\u00bd" +
                    "\7>\2\2\u00bd\u00c7\3\2\2\2\u00be\u00bf\7F\2\2\u00bf\u00c0\7*\2\2\u00c0" +
                    "\u00c1\7F\2\2\u00c1\u00c3\7=\2\2\u00c2\u00c4\5H%\2\u00c3\u00c2\3\2\2\2" +
                    "\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\7>\2\2\u00c6\u00a8" +
                    "\3\2\2\2\u00c6\u00ae\3\2\2\2\u00c6\u00b4\3\2\2\2\u00c6\u00b9\3\2\2\2\u00c6" +
                    "\u00be\3\2\2\2\u00c7\r\3\2\2\2\u00c8\u00cd\5\64\33\2\u00c9\u00cd\58\35" +
                    "\2\u00ca\u00cd\5:\36\2\u00cb\u00cd\5\22\n\2\u00cc\u00c8\3\2\2\2\u00cc" +
                    "\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\17\3\2\2" +
                    "\2\u00ce\u00cf\7F\2\2\u00cf\u00d0\7*\2\2\u00d0\u00d1\7F\2\2\u00d1\u00d3" +
                    "\7=\2\2\u00d2\u00d4\5H%\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4" +
                    "\u00d5\3\2\2\2\u00d5\u00d6\7>\2\2\u00d6\21\3\2\2\2\u00d7\u00d8\7\3\2\2" +
                    "\u00d8\u00d9\7\23\2\2\u00d9\u00da\7;\2\2\u00da\u00df\7F\2\2\u00db\u00dc" +
                    "\7\4\2\2\u00dc\u00de\7F\2\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df" +
                    "\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2" +
                    "\2\2\u00e2\u00e3\7<\2\2\u00e3\23\3\2\2\2\u00e4\u00e5\7\32\2\2\u00e5\u00ea" +
                    "\7F\2\2\u00e6\u00e7\7\4\2\2\u00e7\u00e9\7F\2\2\u00e8\u00e6\3\2\2\2\u00e9" +
                    "\u00ec\3\2\2\2\u00ea\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed\3\2" +
                    "\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7?\2\2\u00ee\25\3\2\2\2\u00ef\u00f0" +
                    "\7\5\2\2\u00f0\u00f1\7\6\2\2\u00f1\u00f2\7F\2\2\u00f2\27\3\2\2\2\u00f3" +
                    "\u00f7\5\32\16\2\u00f4\u00f6\5 \21\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3" +
                    "\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9" +
                    "\u00f7\3\2\2\2\u00fa\u00fc\5*\26\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2" +
                    "\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7!\2\2\u00fe\31\3\2\2\2\u00ff\u0100" +
                    "\7\30\2\2\u0100\u0101\7=\2\2\u0101\u0102\5J&\2\u0102\u0103\7>\2\2\u0103" +
                    "\u0104\7C\2\2\u0104\u0105\5\4\3\2\u0105\33\3\2\2\2\u0106\u0107\7\'\2\2" +
                    "\u0107\u0108\7*\2\2\u0108\u0109\7F\2\2\u0109\u010a\7@\2\2\u010a\u010b" +
                    "\5J&\2\u010b\35\3\2\2\2\u010c\u010d\7\'\2\2\u010d\u010e\7*\2\2\u010e\u010f" +
                    "\7F\2\2\u010f\37\3\2\2\2\u0110\u0111\7\31\2\2\u0111\u0112\7\30\2\2\u0112" +
                    "\u0113\7=\2\2\u0113\u0114\5J&\2\u0114\u0115\7>\2\2\u0115\u0116\7C\2\2" +
                    "\u0116\u0117\5\4\3\2\u0117!\3\2\2\2\u0118\u0119\7\7\2\2\u0119\u011a\7" +
                    "F\2\2\u011a\u011c\7=\2\2\u011b\u011d\5H%\2\u011c\u011b\3\2\2\2\u011c\u011d" +
                    "\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7>\2\2\u011f\u0120\7C\2\2\u0120" +
                    "\u0121\5\4\3\2\u0121\u0122\7!\2\2\u0122#\3\2\2\2\u0123\u0124\7\b\2\2\u0124" +
                    "\u0125\7F\2\2\u0125\u0126\7\t\2\2\u0126\u012c\7F\2\2\u0127\u0129\7=\2" +
                    "\2\u0128\u012a\5H%\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b" +
                    "\3\2\2\2\u012b\u012d\7>\2\2\u012c\u0127\3\2\2\2\u012c\u012d\3\2\2\2\u012d" +
                    "%\3\2\2\2\u012e\u012f\7\n\2\2\u012f\u0130\7*\2\2\u0130\u0131\7F\2\2\u0131" +
                    "\u0133\7=\2\2\u0132\u0134\5J&\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2" +
                    "\2\u0134\u0135\3\2\2\2\u0135\u0136\7>\2\2\u0136\'\3\2\2\2\u0137\u0138" +
                    "\7F\2\2\u0138\u0139\7*\2\2\u0139\u013a\7\13\2\2\u013a\u013b\7=\2\2\u013b" +
                    "\u013c\5J&\2\u013c\u013d\7>\2\2\u013d)\3\2\2\2\u013e\u013f\7\31\2\2\u013f" +
                    "\u0140\7C\2\2\u0140\u0141\5\4\3\2\u0141+\3\2\2\2\u0142\u0144\7\21\2\2" +
                    "\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146" +
                    "\7\27\2\2\u0146\u0147\7F\2\2\u0147\u0149\7=\2\2\u0148\u014a\5D#\2\u0149" +
                    "\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\7>" +
                    "\2\2\u014c\u014d\7C\2\2\u014d\u014e\5\4\3\2\u014e\u014f\7!\2\2\u014f-" +
                    "\3\2\2\2\u0150\u0151\7(\2\2\u0151\u0152\7\27\2\2\u0152\u0153\7F\2\2\u0153" +
                    "\u0154\79\2\2\u0154\u0155\7;\2\2\u0155\u0156\7F\2\2\u0156\u015a\7<\2\2" +
                    "\u0157\u0159\7G\2\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u015b" +
                    "\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d" +
                    "\u015e\7:\2\2\u015e/\3\2\2\2\u015f\u0160\7\34\2\2\u0160\u0161\7=\2\2\u0161" +
                    "\u0162\7F\2\2\u0162\u0163\7@\2\2\u0163\u0164\5J&\2\u0164\u0165\7\37\2" +
                    "\2\u0165\u0166\5J&\2\u0166\u0167\7>\2\2\u0167\u0168\7C\2\2\u0168\u0169" +
                    "\5\4\3\2\u0169\u016a\7!\2\2\u016a\61\3\2\2\2\u016b\u016c\7\34\2\2\u016c" +
                    "\u016d\7=\2\2\u016d\u016e\7F\2\2\u016e\u016f\7\"\2\2\u016f\u0170\7\f\2" +
                    "\2\u0170\u0171\7=\2\2\u0171\u0172\5J&\2\u0172\u0173\7>\2\2\u0173\u0174" +
                    "\7>\2\2\u0174\u0175\7C\2\2\u0175\u0176\5\4\3\2\u0176\u0177\7!\2\2\u0177" +
                    "\63\3\2\2\2\u0178\u0179\7\3\2\2\u0179\u017a\7\23\2\2\u017a\u017f\7F\2" +
                    "\2\u017b\u017c\7\4\2\2\u017c\u017e\7F\2\2\u017d\u017b\3\2\2\2\u017e\u0181" +
                    "\3\2\2\2\u017f\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180\65\3\2\2\2\u0181" +
                    "\u017f\3\2\2\2\u0182\u0183\7\27\2\2\u0183\u0185\7=\2\2\u0184\u0186\5H" +
                    "%\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187" +
                    "\u0188\7>\2\2\u0188\u0189\7C\2\2\u0189\u018a\7\65\2\2\u018a\u018b\7\62" +
                    "\2\2\u018b\u018c\5\4\3\2\u018c\u018d\7!\2\2\u018d\67\3\2\2\2\u018e\u018f" +
                    "\7\3\2\2\u018f\u0190\7\23\2\2\u0190\u0191\5J&\2\u01919\3\2\2\2\u0192\u0193" +
                    "\7\3\2\2\u0193\u0194\7\23\2\2\u0194\u0195\7;\2\2\u0195\u0196\7\66\2\2" +
                    "\u0196\u0197\7<\2\2\u0197;\3\2\2\2\u0198\u0199\7\5\2\2\u0199\u019a\7F" +
                    "\2\2\u019a=\3\2\2\2\u019b\u019c\7$\2\2\u019c\u019d\7C\2\2\u019d\u019e" +
                    "\5\4\3\2\u019e\u019f\7\r\2\2\u019f\u01a6\7C\2\2\u01a0\u01a1\7\63\2\2\u01a1" +
                    "\u01a2\5J&\2\u01a2\u01a3\7\62\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a0\3\2" +
                    "\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7" +
                    "\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\5\4\3\2\u01aa\u01ab\7!" +
                    "\2\2\u01ab?\3\2\2\2\u01ac\u01ad\7\35\2\2\u01ad\u01ae\7=\2\2\u01ae\u01af" +
                    "\5J&\2\u01af\u01b0\7>\2\2\u01b0\u01b1\7C\2\2\u01b1\u01b2\5\4\3\2\u01b2" +
                    "\u01b3\7!\2\2\u01b3A\3\2\2\2\u01b4\u01b5\7\27\2\2\u01b5\u01b6\7\16\2\2" +
                    "\u01b6\u01b7\7=\2\2\u01b7\u01b8\7F\2\2\u01b8\u01b9\7>\2\2\u01b9\u01ba" +
                    "\7C\2\2\u01ba\u01bb\5\4\3\2\u01bb\u01bc\7!\2\2\u01bcC\3\2\2\2\u01bd\u01c2" +
                    "\7F\2\2\u01be\u01bf\7A\2\2\u01bf\u01c1\7F\2\2\u01c0\u01be\3\2\2\2\u01c1" +
                    "\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3E\3\2\2\2" +
                    "\u01c4\u01c2\3\2\2\2\u01c5\u01c7\5<\37\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7" +
                    "\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\7%\2\2\u01c9\u01cc\7F\2\2\u01ca" +
                    "\u01cb\7C\2\2\u01cb\u01cd\7F\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2" +
                    "\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\5\4\3\2\u01cf\u01d0\7!\2\2\u01d0G\3" +
                    "\2\2\2\u01d1\u01d6\5J&\2\u01d2\u01d3\7A\2\2\u01d3\u01d5\5J&\2\u01d4\u01d2" +
                    "\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7" +
                    "I\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da\b&\1\2\u01da\u01db\7\65\2\2" +
                    "\u01db\u0207\5J&\33\u01dc\u01dd\7\61\2\2\u01dd\u0207\5J&\32\u01de\u0207" +
                    "\7E\2\2\u01df\u0207\7D\2\2\u01e0\u0207\7#\2\2\u01e1\u01e3\5\f\7\2\u01e2" +
                    "\u01e4\5P)\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u0207\3\2\2" +
                    "\2\u01e5\u01e7\5L\'\2\u01e6\u01e8\5P)\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8" +
                    "\3\2\2\2\u01e8\u0207\3\2\2\2\u01e9\u01eb\7F\2\2\u01ea\u01ec\5P)\2\u01eb" +
                    "\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u0207\3\2\2\2\u01ed\u01ef\7G" +
                    "\2\2\u01ee\u01f0\5P)\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u0207" +
                    "\3\2\2\2\u01f1\u01f2\7=\2\2\u01f2\u01f3\5J&\2\u01f3\u01f5\7>\2\2\u01f4" +
                    "\u01f6\5P)\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u0207\3\2\2" +
                    "\2\u01f7\u01f8\7\25\2\2\u01f8\u01fa\7=\2\2\u01f9\u01fb\7G\2\2\u01fa\u01f9" +
                    "\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0207\7>\2\2\u01fd" +
                    "\u0207\5\36\20\2\u01fe\u01ff\7\17\2\2\u01ff\u0200\7=\2\2\u0200\u0201\5" +
                    "J&\2\u0201\u0202\7>\2\2\u0202\u0207\3\2\2\2\u0203\u0207\5\66\34\2\u0204" +
                    "\u0207\5\36\20\2\u0205\u0207\5N(\2\u0206\u01d9\3\2\2\2\u0206\u01dc\3\2" +
                    "\2\2\u0206\u01de\3\2\2\2\u0206\u01df\3\2\2\2\u0206\u01e0\3\2\2\2\u0206" +
                    "\u01e1\3\2\2\2\u0206\u01e5\3\2\2\2\u0206\u01e9\3\2\2\2\u0206\u01ed\3\2" +
                    "\2\2\u0206\u01f1\3\2\2\2\u0206\u01f7\3\2\2\2\u0206\u01fd\3\2\2\2\u0206" +
                    "\u01fe\3\2\2\2\u0206\u0203\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2" +
                    "\2\2\u0207\u0228\3\2\2\2\u0208\u0209\f\31\2\2\u0209\u020a\7\60\2\2\u020a" +
                    "\u0227\5J&\31\u020b\u020c\f\30\2\2\u020c\u020d\t\3\2\2\u020d\u0227\5J" +
                    "&\31\u020e\u020f\f\27\2\2\u020f\u0210\t\4\2\2\u0210\u0227\5J&\30\u0211" +
                    "\u0212\f\26\2\2\u0212\u0213\t\5\2\2\u0213\u0227\5J&\27\u0214\u0215\f\25" +
                    "\2\2\u0215\u0216\t\6\2\2\u0216\u0227\5J&\26\u0217\u0218\f\24\2\2\u0218" +
                    "\u0219\7+\2\2\u0219\u0227\5J&\25\u021a\u021b\f\23\2\2\u021b\u021c\7)\2" +
                    "\2\u021c\u0227\5J&\24\u021d\u021e\f\22\2\2\u021e\u021f\7B\2\2\u021f\u0220" +
                    "\5J&\2\u0220\u0221\7C\2\2\u0221\u0222\5J&\23\u0222\u0227\3\2\2\2\u0223" +
                    "\u0224\f\21\2\2\u0224\u0225\7\"\2\2\u0225\u0227\5J&\22\u0226\u0208\3\2" +
                    "\2\2\u0226\u020b\3\2\2\2\u0226\u020e\3\2\2\2\u0226\u0211\3\2\2\2\u0226" +
                    "\u0214\3\2\2\2\u0226\u0217\3\2\2\2\u0226\u021a\3\2\2\2\u0226\u021d\3\2" +
                    "\2\2\u0226\u0223\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228" +
                    "\u0229\3\2\2\2\u0229K\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022d\7;\2\2\u022c" +
                    "\u022e\5H%\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2" +
                    "\2\u022f\u0230\7<\2\2\u0230M\3\2\2\2\u0231\u0232\7F\2\2\u0232\u0233\7" +
                    "*\2\2\u0233\u0234\7F\2\2\u0234O\3\2\2\2\u0235\u0236\7;\2\2\u0236\u0237" +
                    "\5J&\2\u0237\u0238\7<\2\2\u0238\u023a\3\2\2\2\u0239\u0235\3\2\2\2\u023a" +
                    "\u023b\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023cQ\3\2\2\2" +
                    "\61SV]egn\u0083\u0093\u0097\u009a\u00a2\u00a6\u00ab\u00b1\u00c3\u00c6" +
                    "\u00cc\u00d3\u00df\u00ea\u00f7\u00fb\u011c\u0129\u012c\u0133\u0143\u0149" +
                    "\u015a\u017f\u0185\u01a6\u01c2\u01c6\u01cc\u01d6\u01e3\u01e7\u01eb\u01ef" +
                    "\u01f5\u01fa\u0206\u0226\u0228\u022d\u023b";
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
                "parse", "block", "statement", "reAssignment", "assignment", "functionCall",
                "allImport", "objFunctionCall", "folderImport", "packageStatement", "header",
                "ifStatement", "ifStat", "hereStatement", "varHereStatement", "elseIfStat",
                "constructorStatement", "objCreateStatement", "sysFunctionCall", "fileWriteStatement",
                "elseStat", "functionDecl", "nativeFunction", "forStatement", "forInStatement",
                "importStatement", "anonymousFunction", "importFromGithubStatement",
                "importAllStatement", "atStatement", "tryCatchStatement", "whileStatement",
                "mainFunctionStatement", "idList", "classStatement", "exprList", "expression",
                "list", "objVar", "indexes"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'#'", "'.'", "'@'", "'header'", "'cn'", "'new'", "'as'", "'sys'",
                "'i3v8wm08wxpudwty0'", "'range'", "'except'", "'main'", "'3YCMPJ8W8VVTUA48TIHR8K332PYKTXOKVDFG'",
                null, "'async'", "'var'", "'import'", null, null, "'assert'", "'fn'",
                "'if'", "'else'", "'namespace'", "'return'", "'for'", "'while'", "'Java'",
                "'to'", "'do'", "'end'", "'in'", "'null'", "'try'", "'class'", "'const'",
                "'self'", "'native'", "'||'", "'::'", "'&&'", "'=='", "'!='", "'>='",
                "'<='", "'^'", "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'",
                "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "'='", "','", "'?'",
                "':'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, "Println", "Async", "Var", "Import", "Print", "Input", "Assert",
                "Def", "If", "Else", "Package", "Return", "For", "While", "JavaJuice",
                "To", "Do", "End", "In", "Null", "Try", "Class", "Const", "Self", "Native",
                "Or", "Accessor", "And", "Equals", "NEquals", "GTEquals", "LTEquals",
                "Pow", "Excl", "GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus",
                "OBrace", "CBrace", "OBracket", "CBracket", "OParen", "CParen", "SColon",
                "Assign", "Comma", "QMark", "Colon", "Bool", "Number", "Identifier",
                "String", "Comment", "Space"
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
                setState(81);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                    case 1: {
                        setState(80);
                        header();
                    }
                    break;
                }
                setState(84);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Package) {
                    {
                        setState(83);
                        packageStatement();
                    }
                }

                setState(91);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(86);
                                allImport();
                                setState(87);
                                match(SColon);
                            }
                        }
                    }
                    setState(93);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
                }
                setState(94);
                block();
                setState(95);
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
                setState(101);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << Println) | (1L << Async) | (1L << Var) | (1L << Print) | (1L << Assert) | (1L << Def) | (1L << If) | (1L << For) | (1L << While) | (1L << Try) | (1L << Class) | (1L << Const) | (1L << Self) | (1L << Native))) != 0) || _la == Identifier) {
                    {
                        setState(99);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                            case 1: {
                                setState(97);
                                statement();
                            }
                            break;
                            case 2: {
                                setState(98);
                                functionDecl();
                            }
                            break;
                        }
                    }
                    setState(103);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(108);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Return) {
                    {
                        setState(104);
                        match(Return);
                        setState(105);
                        expression(0);
                        setState(106);
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
            setState(145);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(110);
                    functionCall();
                    setState(111);
                    match(SColon);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(113);
                    ifStatement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(114);
                    forStatement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(115);
                    forInStatement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(116);
                    whileStatement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(117);
                    tryCatchStatement();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(118);
                    mainFunctionStatement();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(119);
                    reAssignment();
                    setState(120);
                    match(SColon);
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(122);
                    classStatement();
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(123);
                    constructorStatement();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(124);
                    fileWriteStatement();
                    setState(125);
                    match(SColon);
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(127);
                    objFunctionCall();
                    setState(129);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == SColon) {
                        {
                            setState(128);
                            match(SColon);
                        }
                    }

                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(131);
                    objCreateStatement();
                    setState(132);
                    match(SColon);
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(134);
                    sysFunctionCall();
                    setState(135);
                    match(SColon);
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(137);
                    anonymousFunction();
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(138);
                    hereStatement();
                    setState(139);
                    match(SColon);
                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(141);
                    assignment();
                    setState(142);
                    match(SColon);
                }
                break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(144);
                    nativeFunction();
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
            enterOuterAlt(_localctx, 1);
            {
                setState(149);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
                    case 1: {
                        setState(147);
                        match(Identifier);
                    }
                    break;
                    case 2: {
                        setState(148);
                        objVar();
                    }
                    break;
                }
                setState(152);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OBracket) {
                    {
                        setState(151);
                        indexes();
                    }
                }

                setState(154);
                match(Assign);
                setState(155);
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

    public final AssignmentContext assignment() throws RecognitionException {
        AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_assignment);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(157);
                _la = _input.LA(1);
                if (!(_la == Var || _la == Const)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
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
        enterRule(_localctx, 10, RULE_functionCall);
        int _la;
        try {
            setState(196);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
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
                    if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Def - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
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
                    if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Def - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
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
                    _localctx = new ObjFunctionCallExpressionContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(188);
                    match(Identifier);
                    setState(189);
                    match(Accessor);
                    setState(190);
                    match(Identifier);
                    setState(191);
                    match(OParen);
                    setState(193);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Def - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
                        {
                            setState(192);
                            exprList();
                        }
                    }

                    setState(195);
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
        enterRule(_localctx, 12, RULE_allImport);
        try {
            setState(202);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                case 1:
                    _localctx = new FileSystemImportStatementContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(198);
                    importStatement();
                }
                break;
                case 2:
                    _localctx = new GithubImportStatementContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(199);
                    importFromGithubStatement();
                }
                break;
                case 3:
                    _localctx = new ImportAllContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(200);
                    importAllStatement();
                }
                break;
                case 4:
                    _localctx = new FolderImportStatementContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(201);
                    folderImport();
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
        enterRule(_localctx, 14, RULE_objFunctionCall);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(204);
                match(Identifier);
                setState(205);
                match(Accessor);
                setState(206);
                match(Identifier);
                setState(207);
                match(OParen);
                setState(209);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Def - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
                    {
                        setState(208);
                        exprList();
                    }
                }

                setState(211);
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

    public final FolderImportContext folderImport() throws RecognitionException {
        FolderImportContext _localctx = new FolderImportContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_folderImport);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(213);
                match(T__0);
                setState(214);
                match(Import);
                setState(215);
                match(OBracket);
                setState(216);
                match(Identifier);
                setState(221);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(217);
                                match(T__1);
                                setState(218);
                                match(Identifier);
                            }
                        }
                    }
                    setState(223);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
                }
                setState(224);
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

    public final PackageStatementContext packageStatement() throws RecognitionException {
        PackageStatementContext _localctx = new PackageStatementContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_packageStatement);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(226);
                match(Package);
                setState(227);
                match(Identifier);
                setState(232);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 19, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(228);
                                match(T__1);
                                setState(229);
                                match(Identifier);
                            }
                        }
                    }
                    setState(234);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 19, _ctx);
                }
                setState(235);
                match(SColon);
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
        enterRule(_localctx, 20, RULE_header);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(237);
                match(T__2);
                setState(238);
                match(T__3);
                setState(239);
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
        enterRule(_localctx, 22, RULE_ifStatement);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(241);
                ifStat();
                setState(245);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 20, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(242);
                                elseIfStat();
                            }
                        }
                    }
                    setState(247);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 20, _ctx);
                }
                setState(249);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Else) {
                    {
                        setState(248);
                        elseStat();
                    }
                }

                setState(251);
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
        enterRule(_localctx, 24, RULE_ifStat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(253);
                match(If);
                setState(254);
                match(OParen);
                setState(255);
                expression(0);
                setState(256);
                match(CParen);
                setState(257);
                match(Colon);
                setState(258);
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
        enterRule(_localctx, 26, RULE_hereStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(260);
                match(Self);
                setState(261);
                match(Accessor);
                setState(262);
                match(Identifier);
                setState(263);
                match(Assign);
                setState(264);
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
        enterRule(_localctx, 28, RULE_varHereStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(266);
                match(Self);
                setState(267);
                match(Accessor);
                setState(268);
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
        enterRule(_localctx, 30, RULE_elseIfStat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(270);
                match(Else);
                setState(271);
                match(If);
                setState(272);
                match(OParen);
                setState(273);
                expression(0);
                setState(274);
                match(CParen);
                setState(275);
                match(Colon);
                setState(276);
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
        enterRule(_localctx, 32, RULE_constructorStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(278);
                match(T__4);
                setState(279);
                match(Identifier);
                setState(280);
                match(OParen);
                setState(282);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Def - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
                    {
                        setState(281);
                        exprList();
                    }
                }

                setState(284);
                match(CParen);
                setState(285);
                match(Colon);
                setState(286);
                block();
                setState(287);
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

    public final ObjCreateStatementContext objCreateStatement() throws RecognitionException {
        ObjCreateStatementContext _localctx = new ObjCreateStatementContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_objCreateStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(289);
                match(T__5);
                setState(290);
                match(Identifier);
                setState(291);
                match(T__6);
                setState(292);
                match(Identifier);
                setState(298);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OParen) {
                    {
                        setState(293);
                        match(OParen);
                        setState(295);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Def - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
                            {
                                setState(294);
                                exprList();
                            }
                        }

                        setState(297);
                        match(CParen);
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

    public final SysFunctionCallContext sysFunctionCall() throws RecognitionException {
        SysFunctionCallContext _localctx = new SysFunctionCallContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_sysFunctionCall);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(300);
                match(T__7);
                setState(301);
                match(Accessor);
                setState(302);
                match(Identifier);
                setState(303);
                match(OParen);
                setState(305);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Def - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
                    {
                        setState(304);
                        expression(0);
                    }
                }

                setState(307);
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
        enterRule(_localctx, 38, RULE_fileWriteStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(309);
                match(Identifier);
                setState(310);
                match(Accessor);
                setState(311);
                match(T__8);
                setState(312);
                match(OParen);
                setState(313);
                expression(0);
                setState(314);
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
        enterRule(_localctx, 40, RULE_elseStat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(316);
                match(Else);
                setState(317);
                match(Colon);
                setState(318);
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
        enterRule(_localctx, 42, RULE_functionDecl);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(321);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Async) {
                    {
                        setState(320);
                        match(Async);
                    }
                }

                setState(323);
                match(Def);
                setState(324);
                match(Identifier);
                setState(325);
                match(OParen);
                setState(327);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Identifier) {
                    {
                        setState(326);
                        idList();
                    }
                }

                setState(329);
                match(CParen);
                setState(330);
                match(Colon);
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

    public final NativeFunctionContext nativeFunction() throws RecognitionException {
        NativeFunctionContext _localctx = new NativeFunctionContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_nativeFunction);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(334);
                match(Native);
                setState(335);
                match(Def);
                setState(336);
                match(Identifier);
                setState(337);
                match(OBrace);
                setState(338);
                match(OBracket);
                setState(339);
                match(Identifier);
                setState(340);
                match(CBracket);
                setState(344);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(341);
                                match(String);
                            }
                        }
                    }
                    setState(346);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
                }
                setState(347);
                match(CBrace);
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
        enterRule(_localctx, 46, RULE_forStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(349);
                match(For);
                setState(350);
                match(OParen);
                setState(351);
                match(Identifier);
                setState(352);
                match(Assign);
                setState(353);
                expression(0);
                setState(354);
                match(To);
                setState(355);
                expression(0);
                setState(356);
                match(CParen);
                setState(357);
                match(Colon);
                setState(358);
                block();
                setState(359);
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
        enterRule(_localctx, 48, RULE_forInStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(361);
                match(For);
                setState(362);
                match(OParen);
                setState(363);
                match(Identifier);
                setState(364);
                match(In);
                setState(365);
                match(T__9);
                setState(366);
                match(OParen);
                setState(367);
                expression(0);
                setState(368);
                match(CParen);
                setState(369);
                match(CParen);
                setState(370);
                match(Colon);
                setState(371);
                block();
                setState(372);
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
        enterRule(_localctx, 50, RULE_importStatement);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(374);
                match(T__0);
                setState(375);
                match(Import);
                setState(376);
                match(Identifier);
                setState(381);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(377);
                                match(T__1);
                                setState(378);
                                match(Identifier);
                            }
                        }
                    }
                    setState(383);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
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
        enterRule(_localctx, 52, RULE_anonymousFunction);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(384);
                match(Def);
                setState(385);
                match(OParen);
                setState(387);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Def - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
                    {
                        setState(386);
                        exprList();
                    }
                }

                setState(389);
                match(CParen);
                setState(390);
                match(Colon);
                setState(391);
                match(Subtract);
                setState(392);
                match(GT);
                setState(393);
                block();
                setState(394);
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
        enterRule(_localctx, 54, RULE_importFromGithubStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(396);
                match(T__0);
                setState(397);
                match(Import);
                setState(398);
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
        enterRule(_localctx, 56, RULE_importAllStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(400);
                match(T__0);
                setState(401);
                match(Import);
                setState(402);
                match(OBracket);
                setState(403);
                match(Multiply);
                setState(404);
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

    public final AtStatementContext atStatement() throws RecognitionException {
        AtStatementContext _localctx = new AtStatementContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_atStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(406);
                match(T__2);
                setState(407);
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

    public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
        TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_tryCatchStatement);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(409);
                match(Try);
                setState(410);
                match(Colon);
                setState(411);
                block();
                setState(412);
                match(T__10);
                setState(413);
                match(Colon);
                setState(420);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 31, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(414);
                                match(LT);
                                setState(415);
                                expression(0);
                                setState(416);
                                match(GT);
                            }
                        }
                    }
                    setState(422);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 31, _ctx);
                }
                setState(423);
                block();
                setState(424);
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
        enterRule(_localctx, 62, RULE_whileStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(426);
                match(While);
                setState(427);
                match(OParen);
                setState(428);
                expression(0);
                setState(429);
                match(CParen);
                setState(430);
                match(Colon);
                setState(431);
                block();
                setState(432);
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

    public final MainFunctionStatementContext mainFunctionStatement() throws RecognitionException {
        MainFunctionStatementContext _localctx = new MainFunctionStatementContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_mainFunctionStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(434);
                match(Def);
                setState(435);
                match(T__11);
                setState(436);
                match(OParen);
                setState(437);
                match(Identifier);
                setState(438);
                match(CParen);
                setState(439);
                match(Colon);
                setState(440);
                block();
                setState(441);
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
                setState(443);
                match(Identifier);
                setState(448);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(444);
                            match(Comma);
                            setState(445);
                            match(Identifier);
                        }
                    }
                    setState(450);
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
                setState(452);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__2) {
                    {
                        setState(451);
                        atStatement();
                    }
                }

                setState(454);
                match(Class);
                setState(455);
                match(Identifier);
                setState(458);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Colon) {
                    {
                        setState(456);
                        match(Colon);
                        setState(457);
                        match(Identifier);
                    }
                }

                setState(460);
                block();
                setState(461);
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
                setState(463);
                expression(0);
                setState(468);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(464);
                            match(Comma);
                            setState(465);
                            expression(0);
                        }
                    }
                    setState(470);
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
                setState(516);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 42, _ctx)) {
                    case 1: {
                        _localctx = new UnaryMinusExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(472);
                        match(Subtract);
                        setState(473);
                        expression(25);
                    }
                    break;
                    case 2: {
                        _localctx = new NotExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(474);
                        match(Excl);
                        setState(475);
                        expression(24);
                    }
                    break;
                    case 3: {
                        _localctx = new NumberExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(476);
                        match(Number);
                    }
                    break;
                    case 4: {
                        _localctx = new BoolExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(477);
                        match(Bool);
                    }
                    break;
                    case 5: {
                        _localctx = new NullExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(478);
                        match(Null);
                    }
                    break;
                    case 6: {
                        _localctx = new FunctionCallExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(479);
                        functionCall();
                        setState(481);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 36, _ctx)) {
                            case 1: {
                                setState(480);
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
                        setState(483);
                        list();
                        setState(485);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 37, _ctx)) {
                            case 1: {
                                setState(484);
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
                        setState(487);
                        match(Identifier);
                        setState(489);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 38, _ctx)) {
                            case 1: {
                                setState(488);
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
                        setState(491);
                        match(String);
                        setState(493);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 39, _ctx)) {
                            case 1: {
                                setState(492);
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
                        setState(495);
                        match(OParen);
                        setState(496);
                        expression(0);
                        setState(497);
                        match(CParen);
                        setState(499);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 40, _ctx)) {
                            case 1: {
                                setState(498);
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
                        setState(501);
                        match(Input);
                        setState(502);
                        match(OParen);
                        setState(504);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == String) {
                            {
                                setState(503);
                                match(String);
                            }
                        }

                        setState(506);
                        match(CParen);
                    }
                    break;
                    case 12: {
                        _localctx = new HereVarExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(507);
                        varHereStatement();
                    }
                    break;
                    case 13: {
                        _localctx = new RandomExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(508);
                        match(T__12);
                        setState(509);
                        match(OParen);
                        setState(510);
                        expression(0);
                        setState(511);
                        match(CParen);
                    }
                    break;
                    case 14: {
                        _localctx = new AnonymousFunctionExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(513);
                        anonymousFunction();
                    }
                    break;
                    case 15: {
                        _localctx = new SelfExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(514);
                        varHereStatement();
                    }
                    break;
                    case 16: {
                        _localctx = new ObjVarExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(515);
                        objVar();
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(550);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 44, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(548);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 43, _ctx)) {
                                case 1: {
                                    _localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(518);
                                    if (!(precpred(_ctx, 23)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 23)");
                                    setState(519);
                                    match(Pow);
                                    setState(520);
                                    expression(23);
                                }
                                break;
                                case 2: {
                                    _localctx = new MultExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(521);
                                    if (!(precpred(_ctx, 22)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 22)");
                                    setState(522);
                                    ((MultExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0))) {
                                        ((MultExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(523);
                                    expression(23);
                                }
                                break;
                                case 3: {
                                    _localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(524);
                                    if (!(precpred(_ctx, 21)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 21)");
                                    setState(525);
                                    ((AddExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == Add || _la == Subtract)) {
                                        ((AddExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(526);
                                    expression(22);
                                }
                                break;
                                case 4: {
                                    _localctx = new CompExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(527);
                                    if (!(precpred(_ctx, 20)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 20)");
                                    setState(528);
                                    ((CompExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GTEquals) | (1L << LTEquals) | (1L << GT) | (1L << LT))) != 0))) {
                                        ((CompExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(529);
                                    expression(21);
                                }
                                break;
                                case 5: {
                                    _localctx = new EqExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(530);
                                    if (!(precpred(_ctx, 19)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 19)");
                                    setState(531);
                                    ((EqExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == Equals || _la == NEquals)) {
                                        ((EqExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(532);
                                    expression(20);
                                }
                                break;
                                case 6: {
                                    _localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(533);
                                    if (!(precpred(_ctx, 18)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                                    setState(534);
                                    match(And);
                                    setState(535);
                                    expression(19);
                                }
                                break;
                                case 7: {
                                    _localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(536);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(537);
                                    match(Or);
                                    setState(538);
                                    expression(18);
                                }
                                break;
                                case 8: {
                                    _localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(539);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(540);
                                    match(QMark);
                                    setState(541);
                                    expression(0);
                                    setState(542);
                                    match(Colon);
                                    setState(543);
                                    expression(17);
                                }
                                break;
                                case 9: {
                                    _localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(545);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(546);
                                    match(In);
                                    setState(547);
                                    expression(16);
                                }
                                break;
                            }
                        }
                    }
                    setState(552);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 44, _ctx);
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
                setState(553);
                match(OBracket);
                setState(555);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Def - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
                    {
                        setState(554);
                        exprList();
                    }
                }

                setState(557);
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

    public final ObjVarContext objVar() throws RecognitionException {
        ObjVarContext _localctx = new ObjVarContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_objVar);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(559);
                match(Identifier);
                setState(560);
                match(Accessor);
                setState(561);
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

    public final IndexesContext indexes() throws RecognitionException {
        IndexesContext _localctx = new IndexesContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_indexes);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(567);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(563);
                                match(OBracket);
                                setState(564);
                                expression(0);
                                setState(565);
                                match(CBracket);
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(569);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 46, _ctx);
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
                return precpred(_ctx, 23);
            case 1:
                return precpred(_ctx, 22);
            case 2:
                return precpred(_ctx, 21);
            case 3:
                return precpred(_ctx, 20);
            case 4:
                return precpred(_ctx, 19);
            case 5:
                return precpred(_ctx, 18);
            case 6:
                return precpred(_ctx, 17);
            case 7:
                return precpred(_ctx, 16);
            case 8:
                return precpred(_ctx, 15);
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

        public PackageStatementContext packageStatement() {
            return getRuleContext(PackageStatementContext.class, 0);
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

        public ReAssignmentContext reAssignment() {
            return getRuleContext(ReAssignmentContext.class, 0);
        }

        public ClassStatementContext classStatement() {
            return getRuleContext(ClassStatementContext.class, 0);
        }

        public ConstructorStatementContext constructorStatement() {
            return getRuleContext(ConstructorStatementContext.class, 0);
        }

        public FileWriteStatementContext fileWriteStatement() {
            return getRuleContext(FileWriteStatementContext.class, 0);
        }

        public ObjFunctionCallContext objFunctionCall() {
            return getRuleContext(ObjFunctionCallContext.class, 0);
        }

        public ObjCreateStatementContext objCreateStatement() {
            return getRuleContext(ObjCreateStatementContext.class, 0);
        }

        public SysFunctionCallContext sysFunctionCall() {
            return getRuleContext(SysFunctionCallContext.class, 0);
        }

        public AnonymousFunctionContext anonymousFunction() {
            return getRuleContext(AnonymousFunctionContext.class, 0);
        }

        public HereStatementContext hereStatement() {
            return getRuleContext(HereStatementContext.class, 0);
        }

        public AssignmentContext assignment() {
            return getRuleContext(AssignmentContext.class, 0);
        }

        public NativeFunctionContext nativeFunction() {
            return getRuleContext(NativeFunctionContext.class, 0);
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

        public TerminalNode Assign() {
            return getToken(QParser.Assign, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public ObjVarContext objVar() {
            return getRuleContext(ObjVarContext.class, 0);
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

    public static class AssignmentContext extends ParserRuleContext {
        public AssignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode Const() {
            return getToken(QParser.Const, 0);
        }

        public TerminalNode Var() {
            return getToken(QParser.Var, 0);
        }

        public TerminalNode Assign() {
            return getToken(QParser.Assign, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public IndexesContext indexes() {
            return getRuleContext(IndexesContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterAssignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitAssignment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitAssignment(this);
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

        public TerminalNode Accessor() {
            return getToken(QParser.Accessor, 0);
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

    public static class FolderImportStatementContext extends AllImportContext {
        public FolderImportStatementContext(AllImportContext ctx) {
            copyFrom(ctx);
        }

        public FolderImportContext folderImport() {
            return getRuleContext(FolderImportContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterFolderImportStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitFolderImportStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitFolderImportStatement(this);
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

        public TerminalNode Accessor() {
            return getToken(QParser.Accessor, 0);
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

    public static class FolderImportContext extends ParserRuleContext {
        public FolderImportContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Import() {
            return getToken(QParser.Import, 0);
        }

        public TerminalNode OBracket() {
            return getToken(QParser.OBracket, 0);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(QParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(QParser.Identifier, i);
        }

        public TerminalNode CBracket() {
            return getToken(QParser.CBracket, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_folderImport;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterFolderImport(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitFolderImport(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitFolderImport(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PackageStatementContext extends ParserRuleContext {
        public PackageStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Package() {
            return getToken(QParser.Package, 0);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(QParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(QParser.Identifier, i);
        }

        public TerminalNode SColon() {
            return getToken(QParser.SColon, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_packageStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterPackageStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitPackageStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitPackageStatement(this);
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

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
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

        public TerminalNode Accessor() {
            return getToken(QParser.Accessor, 0);
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

        public TerminalNode Accessor() {
            return getToken(QParser.Accessor, 0);
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

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
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

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
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

    public static class SysFunctionCallContext extends ParserRuleContext {
        public SysFunctionCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Accessor() {
            return getToken(QParser.Accessor, 0);
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
            return RULE_sysFunctionCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterSysFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitSysFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitSysFunctionCall(this);
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

        public TerminalNode Accessor() {
            return getToken(QParser.Accessor, 0);
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

    public static class ElseStatContext extends ParserRuleContext {
        public ElseStatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Else() {
            return getToken(QParser.Else, 0);
        }

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
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

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
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

    public static class NativeFunctionContext extends ParserRuleContext {
        public NativeFunctionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Native() {
            return getToken(QParser.Native, 0);
        }

        public TerminalNode Def() {
            return getToken(QParser.Def, 0);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(QParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(QParser.Identifier, i);
        }

        public TerminalNode OBrace() {
            return getToken(QParser.OBrace, 0);
        }

        public TerminalNode OBracket() {
            return getToken(QParser.OBracket, 0);
        }

        public TerminalNode CBracket() {
            return getToken(QParser.CBracket, 0);
        }

        public TerminalNode CBrace() {
            return getToken(QParser.CBrace, 0);
        }

        public List<TerminalNode> String() {
            return getTokens(QParser.String);
        }

        public TerminalNode String(int i) {
            return getToken(QParser.String, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_nativeFunction;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterNativeFunction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitNativeFunction(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitNativeFunction(this);
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

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
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

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
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

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
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

    public static class AtStatementContext extends ParserRuleContext {
        public AtStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_atStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterAtStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitAtStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitAtStatement(this);
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

        public List<TerminalNode> Colon() {
            return getTokens(QParser.Colon);
        }

        public TerminalNode Colon(int i) {
            return getToken(QParser.Colon, i);
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

        public List<TerminalNode> LT() {
            return getTokens(QParser.LT);
        }

        public TerminalNode LT(int i) {
            return getToken(QParser.LT, i);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<TerminalNode> GT() {
            return getTokens(QParser.GT);
        }

        public TerminalNode GT(int i) {
            return getToken(QParser.GT, i);
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

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
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

    public static class MainFunctionStatementContext extends ParserRuleContext {
        public MainFunctionStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Def() {
            return getToken(QParser.Def, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
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

        public AtStatementContext atStatement() {
            return getRuleContext(AtStatementContext.class, 0);
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

    public static class AnonymousFunctionExpressionContext extends ExpressionContext {
        public AnonymousFunctionExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public AnonymousFunctionContext anonymousFunction() {
            return getRuleContext(AnonymousFunctionContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterAnonymousFunctionExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitAnonymousFunctionExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor)
                return ((QVisitor<? extends T>) visitor).visitAnonymousFunctionExpression(this);
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

    public static class ObjVarExpressionContext extends ExpressionContext {
        public ObjVarExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public ObjVarContext objVar() {
            return getRuleContext(ObjVarContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterObjVarExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitObjVarExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitObjVarExpression(this);
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

    public static class SelfExpressionContext extends ExpressionContext {
        public SelfExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public VarHereStatementContext varHereStatement() {
            return getRuleContext(VarHereStatementContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterSelfExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitSelfExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitSelfExpression(this);
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

    public static class ObjVarContext extends ParserRuleContext {
        public ObjVarContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(QParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(QParser.Identifier, i);
        }

        public TerminalNode Accessor() {
            return getToken(QParser.Accessor, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_objVar;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterObjVar(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitObjVar(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitObjVar(this);
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