// Generated from /Users/harryharbuck-marlowe/Desktop/Q/src/main/java/core/etc/Q.g4 by ANTLR 4.9.2
package core.interp;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QLexer extends Lexer {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            Println = 18, Async = 19, Var = 20, Import = 21, Print = 22, Input = 23, Assert = 24,
            Def = 25, ToInt = 26, If = 27, Else = 28, Return = 29, For = 30, While = 31, To = 32,
            Do = 33, End = 34, In = 35, Null = 36, Try = 37, Class = 38, Const = 39, Noval = 40, Self = 41,
            Native = 42, Or = 43, Accessor = 44, And = 45, Equals = 46, NEquals = 47, GTEquals = 48,
            LTEquals = 49, Pow = 50, Excl = 51, GT = 52, LT = 53, Add = 54, Subtract = 55, Multiply = 56,
            Divide = 57, Modulus = 58, OBrace = 59, CBrace = 60, OBracket = 61, CBracket = 62,
            OParen = 63, CParen = 64, SColon = 65, Assign = 66, Comma = 67, QMark = 68, Colon = 69,
            Bool = 70, Number = 71, Identifier = 72, String = 73, Comment = 74, Space = 75;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2M\u0241\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" +
                    "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\3\3\3\3" +
                    "\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7" +
                    "\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3" +
                    "\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16" +
                    "\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20" +
                    "\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21" +
                    "\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23" +
                    "\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23" +
                    "\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24" +
                    "\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27" +
                    "\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27" +
                    "\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30" +
                    "\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33" +
                    "\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36" +
                    "\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!" +
                    "\3!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3" +
                    "\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*" +
                    "\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3" +
                    "\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3" +
                    "\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3" +
                    "A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u01f1" +
                    "\nG\3H\3H\3H\7H\u01f6\nH\fH\16H\u01f9\13H\5H\u01fb\nH\3I\3I\7I\u01ff\n" +
                    "I\fI\16I\u0202\13I\3J\3J\3J\6J\u0207\nJ\rJ\16J\u0208\3J\3J\3K\3K\3K\3" +
                    "K\7K\u0211\nK\fK\16K\u0214\13K\3K\3K\3K\3K\7K\u021a\nK\fK\16K\u021d\13" +
                    "K\3K\3K\5K\u0221\nK\3K\3K\3L\3L\3L\3L\3M\3M\7M\u022b\nM\fM\16M\u022e\13" +
                    "M\3M\5M\u0231\nM\3N\3N\3O\3O\3O\5O\u0238\nO\3P\3P\3P\3P\3P\3P\3Q\3Q\3" +
                    "\u021b\2R\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33" +
                    "\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67" +
                    "\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65" +
                    "i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008b" +
                    "G\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099\2\u009b\2\u009d\2\u009f" +
                    "\2\u00a1\2\3\2\13\5\2C\\aac|\6\2\62;C\\aac|\6\2\f\f\17\17$$^^\4\2\f\f" +
                    "\17\17\5\2\13\f\16\17\"\"\3\2\63;\3\2\62;\t\2$$^^ddhhppttvv\5\2\62;CH" +
                    "ch\2\u0247\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2" +
                    "\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27" +
                    "\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2" +
                    "\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2" +
                    "\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2" +
                    "\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2" +
                    "\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S" +
                    "\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2" +
                    "\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2" +
                    "\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y" +
                    "\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3" +
                    "\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2" +
                    "\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095" +
                    "\3\2\2\2\2\u0097\3\2\2\2\3\u00a3\3\2\2\2\5\u00a5\3\2\2\2\7\u00ac\3\2\2" +
                    "\2\t\u00af\3\2\2\2\13\u00b3\3\2\2\2\r\u00b6\3\2\2\2\17\u00ba\3\2\2\2\21" +
                    "\u00c0\3\2\2\2\23\u00c7\3\2\2\2\25\u00cd\3\2\2\2\27\u00cf\3\2\2\2\31\u00d1" +
                    "\3\2\2\2\33\u00d8\3\2\2\2\35\u00df\3\2\2\2\37\u00e7\3\2\2\2!\u00f2\3\2" +
                    "\2\2#\u00fc\3\2\2\2%\u0103\3\2\2\2\'\u011b\3\2\2\2)\u0121\3\2\2\2+\u0125" +
                    "\3\2\2\2-\u012c\3\2\2\2/\u0144\3\2\2\2\61\u014d\3\2\2\2\63\u0154\3\2\2" +
                    "\2\65\u0157\3\2\2\2\67\u015d\3\2\2\29\u0160\3\2\2\2;\u0165\3\2\2\2=\u016c" +
                    "\3\2\2\2?\u0170\3\2\2\2A\u0176\3\2\2\2C\u0179\3\2\2\2E\u017c\3\2\2\2G" +
                    "\u0180\3\2\2\2I\u0183\3\2\2\2K\u0188\3\2\2\2M\u018c\3\2\2\2O\u0192\3\2" +
                    "\2\2Q\u0198\3\2\2\2S\u019e\3\2\2\2U\u01a3\3\2\2\2W\u01aa\3\2\2\2Y\u01ad" +
                    "\3\2\2\2[\u01b0\3\2\2\2]\u01b3\3\2\2\2_\u01b6\3\2\2\2a\u01b9\3\2\2\2c" +
                    "\u01bc\3\2\2\2e\u01bf\3\2\2\2g\u01c1\3\2\2\2i\u01c3\3\2\2\2k\u01c5\3\2" +
                    "\2\2m\u01c7\3\2\2\2o\u01c9\3\2\2\2q\u01cb\3\2\2\2s\u01cd\3\2\2\2u\u01cf" +
                    "\3\2\2\2w\u01d1\3\2\2\2y\u01d3\3\2\2\2{\u01d5\3\2\2\2}\u01d7\3\2\2\2\177" +
                    "\u01d9\3\2\2\2\u0081\u01db\3\2\2\2\u0083\u01dd\3\2\2\2\u0085\u01df\3\2" +
                    "\2\2\u0087\u01e1\3\2\2\2\u0089\u01e3\3\2\2\2\u008b\u01e5\3\2\2\2\u008d" +
                    "\u01f0\3\2\2\2\u008f\u01f2\3\2\2\2\u0091\u01fc\3\2\2\2\u0093\u0203\3\2" +
                    "\2\2\u0095\u0220\3\2\2\2\u0097\u0224\3\2\2\2\u0099\u0230\3\2\2\2\u009b" +
                    "\u0232\3\2\2\2\u009d\u0234\3\2\2\2\u009f\u0239\3\2\2\2\u00a1\u023f\3\2" +
                    "\2\2\u00a3\u00a4\7B\2\2\u00a4\4\3\2\2\2\u00a5\u00a6\7j\2\2\u00a6\u00a7" +
                    "\7g\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7f\2\2\u00a9\u00aa\7g\2\2\u00aa" +
                    "\u00ab\7t\2\2\u00ab\6\3\2\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae\7p\2\2\u00ae" +
                    "\b\3\2\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7y\2\2\u00b2" +
                    "\n\3\2\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7u\2\2\u00b5\f\3\2\2\2\u00b6" +
                    "\u00b7\7u\2\2\u00b7\u00b8\7{\2\2\u00b8\u00b9\7u\2\2\u00b9\16\3\2\2\2\u00ba" +
                    "\u00bb\7y\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7v\2\2" +
                    "\u00be\u00bf\7g\2\2\u00bf\20\3\2\2\2\u00c0\u00c1\7x\2\2\u00c1\u00c2\7" +
                    "g\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7h\2\2\u00c5\u00c6" +
                    "\7{\2\2\u00c6\22\3\2\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca" +
                    "\7p\2\2\u00ca\u00cb\7i\2\2\u00cb\u00cc\7g\2\2\u00cc\24\3\2\2\2\u00cd\u00ce" +
                    "\7%\2\2\u00ce\26\3\2\2\2\u00cf\u00d0\7\60\2\2\u00d0\30\3\2\2\2\u00d1\u00d2" +
                    "\7g\2\2\u00d2\u00d3\7z\2\2\u00d3\u00d4\7e\2\2\u00d4\u00d5\7g\2\2\u00d5" +
                    "\u00d6\7r\2\2\u00d6\u00d7\7v\2\2\u00d7\32\3\2\2\2\u00d8\u00d9\7t\2\2\u00d9" +
                    "\u00da\7g\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7g\2\2" +
                    "\u00dd\u00de\7t\2\2\u00de\34\3\2\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7" +
                    "f\2\2\u00e1\u00e2\7f\2\2\u00e2\u00e3\7E\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5" +
                    "\7o\2\2\u00e5\u00e6\7r\2\2\u00e6\36\3\2\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9" +
                    "\7j\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7i\2\2\u00ec" +
                    "\u00ed\7g\2\2\u00ed\u00ee\7V\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7z\2\2" +
                    "\u00f0\u00f1\7v\2\2\u00f1 \3\2\2\2\u00f2\u00f3\7h\2\2\u00f3\u00f4\7p\2" +
                    "\2\u00f4\u00f5\7\"\2\2\u00f5\u00f6\7o\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8" +
                    "\7k\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7*\2\2\u00fa\u00fb\7+\2\2\u00fb" +
                    "\"\3\2\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7p\2\2\u00ff" +
                    "\u0100\7f\2\2\u0100\u0101\7q\2\2\u0101\u0102\7o\2\2\u0102$\3\2\2\2\u0103" +
                    "\u0104\7u\2\2\u0104\u0105\7v\2\2\u0105\u0106\7f\2\2\u0106\u0107\3\2\2" +
                    "\2\u0107\u0108\5Y-\2\u0108\u0109\7S\2\2\u0109\u010a\7C\2\2\u010a\u010b" +
                    "\7X\2\2\u010b\u010c\7D\2\2\u010c\u010d\7:\2\2\u010d\u010e\7M\2\2\u010e" +
                    "\u010f\7K\2\2\u010f\u0110\79\2\2\u0110\u0111\7\64\2\2\u0111\u0112\7L\2" +
                    "\2\u0112\u0113\78\2\2\u0113\u0114\7\67\2\2\u0114\u0115\7;\2\2\u0115\u0116" +
                    "\7\63\2\2\u0116\u0117\7;\2\2\u0117\u0118\7[\2\2\u0118\u0119\7N\2\2\u0119" +
                    "\u011a\7E\2\2\u011a&\3\2\2\2\u011b\u011c\7c\2\2\u011c\u011d\7u\2\2\u011d" +
                    "\u011e\7{\2\2\u011e\u011f\7p\2\2\u011f\u0120\7e\2\2\u0120(\3\2\2\2\u0121" +
                    "\u0122\7x\2\2\u0122\u0123\7c\2\2\u0123\u0124\7t\2\2\u0124*\3\2\2\2\u0125" +
                    "\u0126\7k\2\2\u0126\u0127\7o\2\2\u0127\u0128\7r\2\2\u0128\u0129\7q\2\2" +
                    "\u0129\u012a\7t\2\2\u012a\u012b\7v\2\2\u012b,\3\2\2\2\u012c\u012d\7u\2" +
                    "\2\u012d\u012e\7v\2\2\u012e\u012f\7f\2\2\u012f\u0130\3\2\2\2\u0130\u0131" +
                    "\5Y-\2\u0131\u0132\7C\2\2\u0132\u0133\7Z\2\2\u0133\u0134\79\2\2\u0134" +
                    "\u0135\7O\2\2\u0135\u0136\7T\2\2\u0136\u0137\7U\2\2\u0137\u0138\7W\2\2" +
                    "\u0138\u0139\7Z\2\2\u0139\u013a\7S\2\2\u013a\u013b\78\2\2\u013b\u013c" +
                    "\7\63\2\2\u013c\u013d\7I\2\2\u013d\u013e\7:\2\2\u013e\u013f\7F\2\2\u013f" +
                    "\u0140\7Z\2\2\u0140\u0141\7K\2\2\u0141\u0142\7\\\2\2\u0142\u0143\7Y\2" +
                    "\2\u0143.\3\2\2\2\u0144\u0145\7u\2\2\u0145\u0146\7v\2\2\u0146\u0147\7" +
                    "f\2\2\u0147\u0148\3\2\2\2\u0148\u0149\5Y-\2\u0149\u014a\7e\2\2\u014a\u014b" +
                    "\7k\2\2\u014b\u014c\7p\2\2\u014c\60\3\2\2\2\u014d\u014e\7c\2\2\u014e\u014f" +
                    "\7u\2\2\u014f\u0150\7u\2\2\u0150\u0151\7g\2\2\u0151\u0152\7t\2\2\u0152" +
                    "\u0153\7v\2\2\u0153\62\3\2\2\2\u0154\u0155\7h\2\2\u0155\u0156\7p\2\2\u0156" +
                    "\64\3\2\2\2\u0157\u0158\7v\2\2\u0158\u0159\7q\2\2\u0159\u015a\7K\2\2\u015a" +
                    "\u015b\7p\2\2\u015b\u015c\7v\2\2\u015c\66\3\2\2\2\u015d\u015e\7k\2\2\u015e" +
                    "\u015f\7h\2\2\u015f8\3\2\2\2\u0160\u0161\7g\2\2\u0161\u0162\7n\2\2\u0162" +
                    "\u0163\7u\2\2\u0163\u0164\7g\2\2\u0164:\3\2\2\2\u0165\u0166\7t\2\2\u0166" +
                    "\u0167\7g\2\2\u0167\u0168\7v\2\2\u0168\u0169\7w\2\2\u0169\u016a\7t\2\2" +
                    "\u016a\u016b\7p\2\2\u016b<\3\2\2\2\u016c\u016d\7h\2\2\u016d\u016e\7q\2" +
                    "\2\u016e\u016f\7t\2\2\u016f>\3\2\2\2\u0170\u0171\7y\2\2\u0171\u0172\7" +
                    "j\2\2\u0172\u0173\7k\2\2\u0173\u0174\7n\2\2\u0174\u0175\7g\2\2\u0175@" +
                    "\3\2\2\2\u0176\u0177\7v\2\2\u0177\u0178\7q\2\2\u0178B\3\2\2\2\u0179\u017a" +
                    "\7f\2\2\u017a\u017b\7q\2\2\u017bD\3\2\2\2\u017c\u017d\7g\2\2\u017d\u017e" +
                    "\7p\2\2\u017e\u017f\7f\2\2\u017fF\3\2\2\2\u0180\u0181\7k\2\2\u0181\u0182" +
                    "\7p\2\2\u0182H\3\2\2\2\u0183\u0184\7p\2\2\u0184\u0185\7w\2\2\u0185\u0186" +
                    "\7n\2\2\u0186\u0187\7n\2\2\u0187J\3\2\2\2\u0188\u0189\7v\2\2\u0189\u018a" +
                    "\7t\2\2\u018a\u018b\7{\2\2\u018bL\3\2\2\2\u018c\u018d\7e\2\2\u018d\u018e" +
                    "\7n\2\2\u018e\u018f\7c\2\2\u018f\u0190\7u\2\2\u0190\u0191\7u\2\2\u0191" +
                    "N\3\2\2\2\u0192\u0193\7e\2\2\u0193\u0194\7q\2\2\u0194\u0195\7p\2\2\u0195" +
                    "\u0196\7u\2\2\u0196\u0197\7v\2\2\u0197P\3\2\2\2\u0198\u0199\7p\2\2\u0199" +
                    "\u019a\7q\2\2\u019a\u019b\7x\2\2\u019b\u019c\7c\2\2\u019c\u019d\7n\2\2" +
                    "\u019dR\3\2\2\2\u019e\u019f\7u\2\2\u019f\u01a0\7g\2\2\u01a0\u01a1\7n\2" +
                    "\2\u01a1\u01a2\7h\2\2\u01a2T\3\2\2\2\u01a3\u01a4\7p\2\2\u01a4\u01a5\7" +
                    "c\2\2\u01a5\u01a6\7v\2\2\u01a6\u01a7\7k\2\2\u01a7\u01a8\7x\2\2\u01a8\u01a9" +
                    "\7g\2\2\u01a9V\3\2\2\2\u01aa\u01ab\7~\2\2\u01ab\u01ac\7~\2\2\u01acX\3" +
                    "\2\2\2\u01ad\u01ae\7<\2\2\u01ae\u01af\7<\2\2\u01afZ\3\2\2\2\u01b0\u01b1" +
                    "\7(\2\2\u01b1\u01b2\7(\2\2\u01b2\\\3\2\2\2\u01b3\u01b4\7?\2\2\u01b4\u01b5" +
                    "\7?\2\2\u01b5^\3\2\2\2\u01b6\u01b7\7#\2\2\u01b7\u01b8\7?\2\2\u01b8`\3" +
                    "\2\2\2\u01b9\u01ba\7@\2\2\u01ba\u01bb\7?\2\2\u01bbb\3\2\2\2\u01bc\u01bd" +
                    "\7>\2\2\u01bd\u01be\7?\2\2\u01bed\3\2\2\2\u01bf\u01c0\7`\2\2\u01c0f\3" +
                    "\2\2\2\u01c1\u01c2\7#\2\2\u01c2h\3\2\2\2\u01c3\u01c4\7@\2\2\u01c4j\3\2" +
                    "\2\2\u01c5\u01c6\7>\2\2\u01c6l\3\2\2\2\u01c7\u01c8\7-\2\2\u01c8n\3\2\2" +
                    "\2\u01c9\u01ca\7/\2\2\u01cap\3\2\2\2\u01cb\u01cc\7,\2\2\u01ccr\3\2\2\2" +
                    "\u01cd\u01ce\7\61\2\2\u01cet\3\2\2\2\u01cf\u01d0\7\'\2\2\u01d0v\3\2\2" +
                    "\2\u01d1\u01d2\7}\2\2\u01d2x\3\2\2\2\u01d3\u01d4\7\177\2\2\u01d4z\3\2" +
                    "\2\2\u01d5\u01d6\7]\2\2\u01d6|\3\2\2\2\u01d7\u01d8\7_\2\2\u01d8~\3\2\2" +
                    "\2\u01d9\u01da\7*\2\2\u01da\u0080\3\2\2\2\u01db\u01dc\7+\2\2\u01dc\u0082" +
                    "\3\2\2\2\u01dd\u01de\7=\2\2\u01de\u0084\3\2\2\2\u01df\u01e0\7?\2\2\u01e0" +
                    "\u0086\3\2\2\2\u01e1\u01e2\7.\2\2\u01e2\u0088\3\2\2\2\u01e3\u01e4\7A\2" +
                    "\2\u01e4\u008a\3\2\2\2\u01e5\u01e6\7<\2\2\u01e6\u008c\3\2\2\2\u01e7\u01e8" +
                    "\7v\2\2\u01e8\u01e9\7t\2\2\u01e9\u01ea\7w\2\2\u01ea\u01f1\7g\2\2\u01eb" +
                    "\u01ec\7h\2\2\u01ec\u01ed\7c\2\2\u01ed\u01ee\7n\2\2\u01ee\u01ef\7u\2\2" +
                    "\u01ef\u01f1\7g\2\2\u01f0\u01e7\3\2\2\2\u01f0\u01eb\3\2\2\2\u01f1\u008e" +
                    "\3\2\2\2\u01f2\u01fa\5\u0099M\2\u01f3\u01f7\7\60\2\2\u01f4\u01f6\5\u009b" +
                    "N\2\u01f5\u01f4\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7" +
                    "\u01f8\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01f3\3\2" +
                    "\2\2\u01fa\u01fb\3\2\2\2\u01fb\u0090\3\2\2\2\u01fc\u0200\t\2\2\2\u01fd" +
                    "\u01ff\t\3\2\2\u01fe\u01fd\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2" +
                    "\2\2\u0200\u0201\3\2\2\2\u0201\u0092\3\2\2\2\u0202\u0200\3\2\2\2\u0203" +
                    "\u0206\7$\2\2\u0204\u0207\5\u009dO\2\u0205\u0207\n\4\2\2\u0206\u0204\3" +
                    "\2\2\2\u0206\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0206\3\2\2\2\u0208" +
                    "\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\7$\2\2\u020b\u0094\3\2" +
                    "\2\2\u020c\u020d\7\61\2\2\u020d\u020e\7\61\2\2\u020e\u0212\3\2\2\2\u020f" +
                    "\u0211\n\5\2\2\u0210\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2" +
                    "\2\2\u0212\u0213\3\2\2\2\u0213\u0221\3\2\2\2\u0214\u0212\3\2\2\2\u0215" +
                    "\u0216\7\61\2\2\u0216\u0217\7,\2\2\u0217\u021b\3\2\2\2\u0218\u021a\13" +
                    "\2\2\2\u0219\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u021c\3\2\2\2\u021b" +
                    "\u0219\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u021f\7," +
                    "\2\2\u021f\u0221\7\61\2\2\u0220\u020c\3\2\2\2\u0220\u0215\3\2\2\2\u0221" +
                    "\u0222\3\2\2\2\u0222\u0223\bK\2\2\u0223\u0096\3\2\2\2\u0224\u0225\t\6" +
                    "\2\2\u0225\u0226\3\2\2\2\u0226\u0227\bL\2\2\u0227\u0098\3\2\2\2\u0228" +
                    "\u022c\t\7\2\2\u0229\u022b\5\u009bN\2\u022a\u0229\3\2\2\2\u022b\u022e" +
                    "\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u0231\3\2\2\2\u022e" +
                    "\u022c\3\2\2\2\u022f\u0231\7\62\2\2\u0230\u0228\3\2\2\2\u0230\u022f\3" +
                    "\2\2\2\u0231\u009a\3\2\2\2\u0232\u0233\t\b\2\2\u0233\u009c\3\2\2\2\u0234" +
                    "\u0237\7^\2\2\u0235\u0238\t\t\2\2\u0236\u0238\5\u009fP\2\u0237\u0235\3" +
                    "\2\2\2\u0237\u0236\3\2\2\2\u0238\u009e\3\2\2\2\u0239\u023a\7w\2\2\u023a" +
                    "\u023b\5\u00a1Q\2\u023b\u023c\5\u00a1Q\2\u023c\u023d\5\u00a1Q\2\u023d" +
                    "\u023e\5\u00a1Q\2\u023e\u00a0\3\2\2\2\u023f\u0240\t\n\2\2\u0240\u00a2" +
                    "\3\2\2\2\17\2\u01f0\u01f7\u01fa\u0200\u0206\u0208\u0212\u021b\u0220\u022c" +
                    "\u0230\u0237\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

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

    public QLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
                "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16",
                "Println", "Async", "Var", "Import", "Print", "Input", "Assert", "Def",
                "ToInt", "If", "Else", "Return", "For", "While", "To", "Do", "End", "In",
                "Null", "Try", "Class", "Const", "Noval", "Self", "Native", "Or", "Accessor",
                "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", "Excl", "GT",
                "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", "OBrace", "CBrace",
                "OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign", "Comma",
                "QMark", "Colon", "Bool", "Number", "Identifier", "String", "Comment",
                "Space", "Int", "Digit", "ESC", "UNICODE", "HEX"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'@'", "'header'", "'cn'", "'new'", "'as'", "'sys'", "'write'",
                "'verify'", "'range'", "'#'", "'.'", "'except'", "'render'", "'addComp'",
                "'changeText'", "'fn main()'", "'random'", null, "'async'", "'var'",
                "'import'", null, null, "'assert'", "'fn'", "'toInt'", "'if'", "'else'",
                "'return'", "'for'", "'while'", "'to'", "'do'", "'end'", "'in'", "'null'",
                "'try'", "'class'", "'const'", "'noval'", "'self'", "'native'", "'||'",
                "'::'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'^'", "'!'", "'>'",
                "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'{'", "'}'", "'['", "']'",
                "'('", "')'", "';'", "'='", "','", "'?'", "':'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, "Println", "Async", "Var", "Import",
                "Print", "Input", "Assert", "Def", "ToInt", "If", "Else", "Return", "For",
                "While", "To", "Do", "End", "In", "Null", "Try", "Class", "Const", "Noval",
                "Self", "Native", "Or", "Accessor", "And", "Equals", "NEquals", "GTEquals",
                "LTEquals", "Pow", "Excl", "GT", "LT", "Add", "Subtract", "Multiply",
                "Divide", "Modulus", "OBrace", "CBrace", "OBracket", "CBracket", "OParen",
                "CParen", "SColon", "Assign", "Comma", "QMark", "Colon", "Bool", "Number",
                "Identifier", "String", "Comment", "Space"
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
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}