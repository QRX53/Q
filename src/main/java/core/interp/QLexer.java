// Generated from /Users/harryharbuck-marlowe/Downloads/Q/src/main/java/core/etc/Q.g4 by ANTLR 4.9.2
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
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, Println = 14, Async = 15, Var = 16, Import = 17,
            Print = 18, Input = 19, Assert = 20, Def = 21, ToInt = 22, If = 23, Else = 24, Package = 25,
            Return = 26, For = 27, While = 28, To = 29, Do = 30, End = 31, In = 32, Null = 33, Try = 34,
            Class = 35, Const = 36, Noval = 37, Self = 38, Native = 39, Or = 40, Accessor = 41,
            And = 42, Equals = 43, NEquals = 44, GTEquals = 45, LTEquals = 46, Pow = 47, Excl = 48,
            GT = 49, LT = 50, Add = 51, Subtract = 52, Multiply = 53, Divide = 54, Modulus = 55,
            OBrace = 56, CBrace = 57, OBracket = 58, CBracket = 59, OParen = 60, CParen = 61,
            SColon = 62, Assign = 63, Comma = 64, QMark = 65, Colon = 66, Bool = 67, Number = 68,
            Identifier = 69, String = 70, Comment = 71, Space = 72;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2J\u0259\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" +
                    "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3" +
                    "\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3" +
                    "\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3" +
                    "\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3" +
                    "\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3" +
                    "\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3" +
                    "\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3" +
                    "\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3" +
                    "\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3" +
                    "\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3" +
                    "\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3" +
                    "\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3" +
                    "\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3" +
                    "\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3" +
                    "\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3" +
                    "\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3" +
                    "&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+" +
                    "\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3" +
                    "\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3" +
                    ":\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3D\3D\3" +
                    "D\3D\3D\3D\3D\5D\u01ef\nD\3E\3E\3E\7E\u01f4\nE\fE\16E\u01f7\13E\5E\u01f9" +
                    "\nE\3F\3F\7F\u01fd\nF\fF\16F\u0200\13F\3G\3G\3G\6G\u0205\nG\rG\16G\u0206" +
                    "\3G\3G\3G\3G\6G\u020d\nG\rG\16G\u020e\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\7" +
                    "G\u021b\nG\fG\16G\u021e\13G\3G\3G\3G\5G\u0223\nG\3H\3H\3H\3H\7H\u0229" +
                    "\nH\fH\16H\u022c\13H\3H\3H\3H\3H\7H\u0232\nH\fH\16H\u0235\13H\3H\3H\5" +
                    "H\u0239\nH\3H\3H\3I\3I\3I\3I\3J\3J\7J\u0243\nJ\fJ\16J\u0246\13J\3J\5J" +
                    "\u0249\nJ\3K\3K\3L\3L\3L\5L\u0250\nL\3M\3M\3M\3M\3M\3M\3N\3N\4\u021c\u0233" +
                    "\2O\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35" +
                    "\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36" +
                    ";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67" +
                    "m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d" +
                    "H\u008fI\u0091J\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\3\2\f\5\2C\\a" +
                    "ac|\6\2\62;C\\aac|\6\2\f\f\17\17$$^^\5\2\f\f\17\17^^\4\2\f\f\17\17\5\2" +
                    "\13\f\16\17\"\"\3\2\63;\3\2\62;\t\2$$^^ddhhppttvv\5\2\62;CHch\2\u0267" +
                    "\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2" +
                    "\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2" +
                    "\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2" +
                    "\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2" +
                    "\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3" +
                    "\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2" +
                    "\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2" +
                    "U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3" +
                    "\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2" +
                    "\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2" +
                    "{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085" +
                    "\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2" +
                    "\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\3\u009d\3\2\2\2\5\u009f\3\2\2\2\7\u00a1" +
                    "\3\2\2\2\t\u00a8\3\2\2\2\13\u00ab\3\2\2\2\r\u00af\3\2\2\2\17\u00b2\3\2" +
                    "\2\2\21\u00b6\3\2\2\2\23\u00bc\3\2\2\2\25\u00c2\3\2\2\2\27\u00c4\3\2\2" +
                    "\2\31\u00cb\3\2\2\2\33\u00d2\3\2\2\2\35\u00f7\3\2\2\2\37\u010f\3\2\2\2" +
                    "!\u0115\3\2\2\2#\u0119\3\2\2\2%\u0120\3\2\2\2\'\u0138\3\2\2\2)\u0141\3" +
                    "\2\2\2+\u0148\3\2\2\2-\u014b\3\2\2\2/\u0151\3\2\2\2\61\u0154\3\2\2\2\63" +
                    "\u0159\3\2\2\2\65\u0163\3\2\2\2\67\u016a\3\2\2\29\u016e\3\2\2\2;\u0174" +
                    "\3\2\2\2=\u0177\3\2\2\2?\u017a\3\2\2\2A\u017e\3\2\2\2C\u0181\3\2\2\2E" +
                    "\u0186\3\2\2\2G\u018a\3\2\2\2I\u0190\3\2\2\2K\u0196\3\2\2\2M\u019c\3\2" +
                    "\2\2O\u01a1\3\2\2\2Q\u01a8\3\2\2\2S\u01ab\3\2\2\2U\u01ae\3\2\2\2W\u01b1" +
                    "\3\2\2\2Y\u01b4\3\2\2\2[\u01b7\3\2\2\2]\u01ba\3\2\2\2_\u01bd\3\2\2\2a" +
                    "\u01bf\3\2\2\2c\u01c1\3\2\2\2e\u01c3\3\2\2\2g\u01c5\3\2\2\2i\u01c7\3\2" +
                    "\2\2k\u01c9\3\2\2\2m\u01cb\3\2\2\2o\u01cd\3\2\2\2q\u01cf\3\2\2\2s\u01d1" +
                    "\3\2\2\2u\u01d3\3\2\2\2w\u01d5\3\2\2\2y\u01d7\3\2\2\2{\u01d9\3\2\2\2}" +
                    "\u01db\3\2\2\2\177\u01dd\3\2\2\2\u0081\u01df\3\2\2\2\u0083\u01e1\3\2\2" +
                    "\2\u0085\u01e3\3\2\2\2\u0087\u01ee\3\2\2\2\u0089\u01f0\3\2\2\2\u008b\u01fa" +
                    "\3\2\2\2\u008d\u0222\3\2\2\2\u008f\u0238\3\2\2\2\u0091\u023c\3\2\2\2\u0093" +
                    "\u0248\3\2\2\2\u0095\u024a\3\2\2\2\u0097\u024c\3\2\2\2\u0099\u0251\3\2" +
                    "\2\2\u009b\u0257\3\2\2\2\u009d\u009e\7\60\2\2\u009e\4\3\2\2\2\u009f\u00a0" +
                    "\7B\2\2\u00a0\6\3\2\2\2\u00a1\u00a2\7j\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4" +
                    "\7c\2\2\u00a4\u00a5\7f\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7t\2\2\u00a7" +
                    "\b\3\2\2\2\u00a8\u00a9\7e\2\2\u00a9\u00aa\7p\2\2\u00aa\n\3\2\2\2\u00ab" +
                    "\u00ac\7p\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7y\2\2\u00ae\f\3\2\2\2\u00af" +
                    "\u00b0\7c\2\2\u00b0\u00b1\7u\2\2\u00b1\16\3\2\2\2\u00b2\u00b3\7u\2\2\u00b3" +
                    "\u00b4\7{\2\2\u00b4\u00b5\7u\2\2\u00b5\20\3\2\2\2\u00b6\u00b7\7y\2\2\u00b7" +
                    "\u00b8\7t\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7g\2\2" +
                    "\u00bb\22\3\2\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7" +
                    "p\2\2\u00bf\u00c0\7i\2\2\u00c0\u00c1\7g\2\2\u00c1\24\3\2\2\2\u00c2\u00c3" +
                    "\7%\2\2\u00c3\26\3\2\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7z\2\2\u00c6\u00c7" +
                    "\7e\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7r\2\2\u00c9\u00ca\7v\2\2\u00ca" +
                    "\30\3\2\2\2\u00cb\u00cc\7o\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7k\2\2\u00ce" +
                    "\u00cf\7p\2\2\u00cf\u00d0\7*\2\2\u00d0\u00d1\7+\2\2\u00d1\32\3\2\2\2\u00d2" +
                    "\u00d3\7\65\2\2\u00d3\u00d4\7[\2\2\u00d4\u00d5\7E\2\2\u00d5\u00d6\7O\2" +
                    "\2\u00d6\u00d7\7R\2\2\u00d7\u00d8\7L\2\2\u00d8\u00d9\7:\2\2\u00d9\u00da" +
                    "\7Y\2\2\u00da\u00db\7:\2\2\u00db\u00dc\7X\2\2\u00dc\u00dd\7X\2\2\u00dd" +
                    "\u00de\7V\2\2\u00de\u00df\7W\2\2\u00df\u00e0\7C\2\2\u00e0\u00e1\7\66\2" +
                    "\2\u00e1\u00e2\7:\2\2\u00e2\u00e3\7V\2\2\u00e3\u00e4\7K\2\2\u00e4\u00e5" +
                    "\7J\2\2\u00e5\u00e6\7T\2\2\u00e6\u00e7\7:\2\2\u00e7\u00e8\7M\2\2\u00e8" +
                    "\u00e9\7\65\2\2\u00e9\u00ea\7\65\2\2\u00ea\u00eb\7\64\2\2\u00eb\u00ec" +
                    "\7R\2\2\u00ec\u00ed\7[\2\2\u00ed\u00ee\7M\2\2\u00ee\u00ef\7V\2\2\u00ef" +
                    "\u00f0\7Z\2\2\u00f0\u00f1\7Q\2\2\u00f1\u00f2\7M\2\2\u00f2\u00f3\7X\2\2" +
                    "\u00f3\u00f4\7F\2\2\u00f4\u00f5\7H\2\2\u00f5\u00f6\7I\2\2\u00f6\34\3\2" +
                    "\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7f\2\2\u00fa\u00fb" +
                    "\3\2\2\2\u00fb\u00fc\5S*\2\u00fc\u00fd\7S\2\2\u00fd\u00fe\7C\2\2\u00fe" +
                    "\u00ff\7X\2\2\u00ff\u0100\7D\2\2\u0100\u0101\7:\2\2\u0101\u0102\7M\2\2" +
                    "\u0102\u0103\7K\2\2\u0103\u0104\79\2\2\u0104\u0105\7\64\2\2\u0105\u0106" +
                    "\7L\2\2\u0106\u0107\78\2\2\u0107\u0108\7\67\2\2\u0108\u0109\7;\2\2\u0109" +
                    "\u010a\7\63\2\2\u010a\u010b\7;\2\2\u010b\u010c\7[\2\2\u010c\u010d\7N\2" +
                    "\2\u010d\u010e\7E\2\2\u010e\36\3\2\2\2\u010f\u0110\7c\2\2\u0110\u0111" +
                    "\7u\2\2\u0111\u0112\7{\2\2\u0112\u0113\7p\2\2\u0113\u0114\7e\2\2\u0114" +
                    " \3\2\2\2\u0115\u0116\7x\2\2\u0116\u0117\7c\2\2\u0117\u0118\7t\2\2\u0118" +
                    "\"\3\2\2\2\u0119\u011a\7k\2\2\u011a\u011b\7o\2\2\u011b\u011c\7r\2\2\u011c" +
                    "\u011d\7q\2\2\u011d\u011e\7t\2\2\u011e\u011f\7v\2\2\u011f$\3\2\2\2\u0120" +
                    "\u0121\7u\2\2\u0121\u0122\7v\2\2\u0122\u0123\7f\2\2\u0123\u0124\3\2\2" +
                    "\2\u0124\u0125\5S*\2\u0125\u0126\7C\2\2\u0126\u0127\7Z\2\2\u0127\u0128" +
                    "\79\2\2\u0128\u0129\7O\2\2\u0129\u012a\7T\2\2\u012a\u012b\7U\2\2\u012b" +
                    "\u012c\7W\2\2\u012c\u012d\7Z\2\2\u012d\u012e\7S\2\2\u012e\u012f\78\2\2" +
                    "\u012f\u0130\7\63\2\2\u0130\u0131\7I\2\2\u0131\u0132\7:\2\2\u0132\u0133" +
                    "\7F\2\2\u0133\u0134\7Z\2\2\u0134\u0135\7K\2\2\u0135\u0136\7\\\2\2\u0136" +
                    "\u0137\7Y\2\2\u0137&\3\2\2\2\u0138\u0139\7u\2\2\u0139\u013a\7v\2\2\u013a" +
                    "\u013b\7f\2\2\u013b\u013c\3\2\2\2\u013c\u013d\5S*\2\u013d\u013e\7e\2\2" +
                    "\u013e\u013f\7k\2\2\u013f\u0140\7p\2\2\u0140(\3\2\2\2\u0141\u0142\7c\2" +
                    "\2\u0142\u0143\7u\2\2\u0143\u0144\7u\2\2\u0144\u0145\7g\2\2\u0145\u0146" +
                    "\7t\2\2\u0146\u0147\7v\2\2\u0147*\3\2\2\2\u0148\u0149\7h\2\2\u0149\u014a" +
                    "\7p\2\2\u014a,\3\2\2\2\u014b\u014c\7v\2\2\u014c\u014d\7q\2\2\u014d\u014e" +
                    "\7K\2\2\u014e\u014f\7p\2\2\u014f\u0150\7v\2\2\u0150.\3\2\2\2\u0151\u0152" +
                    "\7k\2\2\u0152\u0153\7h\2\2\u0153\60\3\2\2\2\u0154\u0155\7g\2\2\u0155\u0156" +
                    "\7n\2\2\u0156\u0157\7u\2\2\u0157\u0158\7g\2\2\u0158\62\3\2\2\2\u0159\u015a" +
                    "\7p\2\2\u015a\u015b\7c\2\2\u015b\u015c\7o\2\2\u015c\u015d\7g\2\2\u015d" +
                    "\u015e\7u\2\2\u015e\u015f\7r\2\2\u015f\u0160\7c\2\2\u0160\u0161\7e\2\2" +
                    "\u0161\u0162\7g\2\2\u0162\64\3\2\2\2\u0163\u0164\7t\2\2\u0164\u0165\7" +
                    "g\2\2\u0165\u0166\7v\2\2\u0166\u0167\7w\2\2\u0167\u0168\7t\2\2\u0168\u0169" +
                    "\7p\2\2\u0169\66\3\2\2\2\u016a\u016b\7h\2\2\u016b\u016c\7q\2\2\u016c\u016d" +
                    "\7t\2\2\u016d8\3\2\2\2\u016e\u016f\7y\2\2\u016f\u0170\7j\2\2\u0170\u0171" +
                    "\7k\2\2\u0171\u0172\7n\2\2\u0172\u0173\7g\2\2\u0173:\3\2\2\2\u0174\u0175" +
                    "\7v\2\2\u0175\u0176\7q\2\2\u0176<\3\2\2\2\u0177\u0178\7f\2\2\u0178\u0179" +
                    "\7q\2\2\u0179>\3\2\2\2\u017a\u017b\7g\2\2\u017b\u017c\7p\2\2\u017c\u017d" +
                    "\7f\2\2\u017d@\3\2\2\2\u017e\u017f\7k\2\2\u017f\u0180\7p\2\2\u0180B\3" +
                    "\2\2\2\u0181\u0182\7p\2\2\u0182\u0183\7w\2\2\u0183\u0184\7n\2\2\u0184" +
                    "\u0185\7n\2\2\u0185D\3\2\2\2\u0186\u0187\7v\2\2\u0187\u0188\7t\2\2\u0188" +
                    "\u0189\7{\2\2\u0189F\3\2\2\2\u018a\u018b\7e\2\2\u018b\u018c\7n\2\2\u018c" +
                    "\u018d\7c\2\2\u018d\u018e\7u\2\2\u018e\u018f\7u\2\2\u018fH\3\2\2\2\u0190" +
                    "\u0191\7e\2\2\u0191\u0192\7q\2\2\u0192\u0193\7p\2\2\u0193\u0194\7u\2\2" +
                    "\u0194\u0195\7v\2\2\u0195J\3\2\2\2\u0196\u0197\7p\2\2\u0197\u0198\7q\2" +
                    "\2\u0198\u0199\7x\2\2\u0199\u019a\7c\2\2\u019a\u019b\7n\2\2\u019bL\3\2" +
                    "\2\2\u019c\u019d\7u\2\2\u019d\u019e\7g\2\2\u019e\u019f\7n\2\2\u019f\u01a0" +
                    "\7h\2\2\u01a0N\3\2\2\2\u01a1\u01a2\7p\2\2\u01a2\u01a3\7c\2\2\u01a3\u01a4" +
                    "\7v\2\2\u01a4\u01a5\7k\2\2\u01a5\u01a6\7x\2\2\u01a6\u01a7\7g\2\2\u01a7" +
                    "P\3\2\2\2\u01a8\u01a9\7~\2\2\u01a9\u01aa\7~\2\2\u01aaR\3\2\2\2\u01ab\u01ac" +
                    "\7<\2\2\u01ac\u01ad\7<\2\2\u01adT\3\2\2\2\u01ae\u01af\7(\2\2\u01af\u01b0" +
                    "\7(\2\2\u01b0V\3\2\2\2\u01b1\u01b2\7?\2\2\u01b2\u01b3\7?\2\2\u01b3X\3" +
                    "\2\2\2\u01b4\u01b5\7#\2\2\u01b5\u01b6\7?\2\2\u01b6Z\3\2\2\2\u01b7\u01b8" +
                    "\7@\2\2\u01b8\u01b9\7?\2\2\u01b9\\\3\2\2\2\u01ba\u01bb\7>\2\2\u01bb\u01bc" +
                    "\7?\2\2\u01bc^\3\2\2\2\u01bd\u01be\7`\2\2\u01be`\3\2\2\2\u01bf\u01c0\7" +
                    "#\2\2\u01c0b\3\2\2\2\u01c1\u01c2\7@\2\2\u01c2d\3\2\2\2\u01c3\u01c4\7>" +
                    "\2\2\u01c4f\3\2\2\2\u01c5\u01c6\7-\2\2\u01c6h\3\2\2\2\u01c7\u01c8\7/\2" +
                    "\2\u01c8j\3\2\2\2\u01c9\u01ca\7,\2\2\u01cal\3\2\2\2\u01cb\u01cc\7\61\2" +
                    "\2\u01ccn\3\2\2\2\u01cd\u01ce\7\'\2\2\u01cep\3\2\2\2\u01cf\u01d0\7}\2" +
                    "\2\u01d0r\3\2\2\2\u01d1\u01d2\7\177\2\2\u01d2t\3\2\2\2\u01d3\u01d4\7]" +
                    "\2\2\u01d4v\3\2\2\2\u01d5\u01d6\7_\2\2\u01d6x\3\2\2\2\u01d7\u01d8\7*\2" +
                    "\2\u01d8z\3\2\2\2\u01d9\u01da\7+\2\2\u01da|\3\2\2\2\u01db\u01dc\7=\2\2" +
                    "\u01dc~\3\2\2\2\u01dd\u01de\7?\2\2\u01de\u0080\3\2\2\2\u01df\u01e0\7." +
                    "\2\2\u01e0\u0082\3\2\2\2\u01e1\u01e2\7A\2\2\u01e2\u0084\3\2\2\2\u01e3" +
                    "\u01e4\7<\2\2\u01e4\u0086\3\2\2\2\u01e5\u01e6\7v\2\2\u01e6\u01e7\7t\2" +
                    "\2\u01e7\u01e8\7w\2\2\u01e8\u01ef\7g\2\2\u01e9\u01ea\7h\2\2\u01ea\u01eb" +
                    "\7c\2\2\u01eb\u01ec\7n\2\2\u01ec\u01ed\7u\2\2\u01ed\u01ef\7g\2\2\u01ee" +
                    "\u01e5\3\2\2\2\u01ee\u01e9\3\2\2\2\u01ef\u0088\3\2\2\2\u01f0\u01f8\5\u0093" +
                    "J\2\u01f1\u01f5\7\60\2\2\u01f2\u01f4\5\u0095K\2\u01f3\u01f2\3\2\2\2\u01f4" +
                    "\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f9\3\2" +
                    "\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f1\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9" +
                    "\u008a\3\2\2\2\u01fa\u01fe\t\2\2\2\u01fb\u01fd\t\3\2\2\u01fc\u01fb\3\2" +
                    "\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff" +
                    "\u008c\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0204\7$\2\2\u0202\u0205\5\u0097" +
                    "L\2\u0203\u0205\n\4\2\2\u0204\u0202\3\2\2\2\u0204\u0203\3\2\2\2\u0205" +
                    "\u0206\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\3\2" +
                    "\2\2\u0208\u0223\7$\2\2\u0209\u020c\7)\2\2\u020a\u020d\5\u0097L\2\u020b" +
                    "\u020d\n\5\2\2\u020c\u020a\3\2\2\2\u020c\u020b\3\2\2\2\u020d\u020e\3\2" +
                    "\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210" +
                    "\u0223\7)\2\2\u0211\u0212\7$\2\2\u0212\u0213\7$\2\2\u0213\u0214\7$\2\2" +
                    "\u0214\u021c\3\2\2\2\u0215\u021b\13\2\2\2\u0216\u021b\5\u0097L\2\u0217" +
                    "\u021b\n\5\2\2\u0218\u0219\7^\2\2\u0219\u021b\7p\2\2\u021a\u0215\3\2\2" +
                    "\2\u021a\u0216\3\2\2\2\u021a\u0217\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021e" +
                    "\3\2\2\2\u021c\u021d\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021f\3\2\2\2\u021e" +
                    "\u021c\3\2\2\2\u021f\u0220\7$\2\2\u0220\u0221\7$\2\2\u0221\u0223\7$\2" +
                    "\2\u0222\u0201\3\2\2\2\u0222\u0209\3\2\2\2\u0222\u0211\3\2\2\2\u0223\u008e" +
                    "\3\2\2\2\u0224\u0225\7\61\2\2\u0225\u0226\7\61\2\2\u0226\u022a\3\2\2\2" +
                    "\u0227\u0229\n\6\2\2\u0228\u0227\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228" +
                    "\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0239\3\2\2\2\u022c\u022a\3\2\2\2\u022d" +
                    "\u022e\7\61\2\2\u022e\u022f\7,\2\2\u022f\u0233\3\2\2\2\u0230\u0232\13" +
                    "\2\2\2\u0231\u0230\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0234\3\2\2\2\u0233" +
                    "\u0231\3\2\2\2\u0234\u0236\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0237\7," +
                    "\2\2\u0237\u0239\7\61\2\2\u0238\u0224\3\2\2\2\u0238\u022d\3\2\2\2\u0239" +
                    "\u023a\3\2\2\2\u023a\u023b\bH\2\2\u023b\u0090\3\2\2\2\u023c\u023d\t\7" +
                    "\2\2\u023d\u023e\3\2\2\2\u023e\u023f\bI\2\2\u023f\u0092\3\2\2\2\u0240" +
                    "\u0244\t\b\2\2\u0241\u0243\5\u0095K\2\u0242\u0241\3\2\2\2\u0243\u0246" +
                    "\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0249\3\2\2\2\u0246" +
                    "\u0244\3\2\2\2\u0247\u0249\7\62\2\2\u0248\u0240\3\2\2\2\u0248\u0247\3" +
                    "\2\2\2\u0249\u0094\3\2\2\2\u024a\u024b\t\t\2\2\u024b\u0096\3\2\2\2\u024c" +
                    "\u024f\7^\2\2\u024d\u0250\t\n\2\2\u024e\u0250\5\u0099M\2\u024f\u024d\3" +
                    "\2\2\2\u024f\u024e\3\2\2\2\u0250\u0098\3\2\2\2\u0251\u0252\7w\2\2\u0252" +
                    "\u0253\5\u009bN\2\u0253\u0254\5\u009bN\2\u0254\u0255\5\u009bN\2\u0255" +
                    "\u0256\5\u009bN\2\u0256\u009a\3\2\2\2\u0257\u0258\t\13\2\2\u0258\u009c" +
                    "\3\2\2\2\24\2\u01ee\u01f5\u01f8\u01fe\u0204\u0206\u020c\u020e\u021a\u021c" +
                    "\u0222\u022a\u0233\u0238\u0244\u0248\u024f\3\b\2\2";
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
                "T__9", "T__10", "T__11", "T__12", "Println", "Async", "Var", "Import",
                "Print", "Input", "Assert", "Def", "ToInt", "If", "Else", "Package",
                "Return", "For", "While", "To", "Do", "End", "In", "Null", "Try", "Class",
                "Const", "Noval", "Self", "Native", "Or", "Accessor", "And", "Equals",
                "NEquals", "GTEquals", "LTEquals", "Pow", "Excl", "GT", "LT", "Add",
                "Subtract", "Multiply", "Divide", "Modulus", "OBrace", "CBrace", "OBracket",
                "CBracket", "OParen", "CParen", "SColon", "Assign", "Comma", "QMark",
                "Colon", "Bool", "Number", "Identifier", "String", "Comment", "Space",
                "Int", "Digit", "ESC", "UNICODE", "HEX"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'.'", "'@'", "'header'", "'cn'", "'new'", "'as'", "'sys'", "'write'",
                "'range'", "'#'", "'except'", "'main()'", "'3YCMPJ8W8VVTUA48TIHR8K332PYKTXOKVDFG'",
                null, "'async'", "'var'", "'import'", null, null, "'assert'", "'fn'",
                "'toInt'", "'if'", "'else'", "'namespace'", "'return'", "'for'", "'while'",
                "'to'", "'do'", "'end'", "'in'", "'null'", "'try'", "'class'", "'const'",
                "'noval'", "'self'", "'native'", "'||'", "'::'", "'&&'", "'=='", "'!='",
                "'>='", "'<='", "'^'", "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'",
                "'%'", "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "'='", "','",
                "'?'", "':'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, "Println", "Async", "Var", "Import", "Print", "Input", "Assert",
                "Def", "ToInt", "If", "Else", "Package", "Return", "For", "While", "To",
                "Do", "End", "In", "Null", "Try", "Class", "Const", "Noval", "Self",
                "Native", "Or", "Accessor", "And", "Equals", "NEquals", "GTEquals", "LTEquals",
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