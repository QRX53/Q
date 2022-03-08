// Generated from /Users/harryharbuck-marlowe/Desktop/Q/src/main/java/core/etc/Q.g4 by ANTLR 4.9.2
package core.interp;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, Println=21, Async=22, AddComponent=23, Var=24, 
		Import=25, Print=26, Input=27, Assert=28, Def=29, ToInt=30, If=31, Else=32, 
		Return=33, For=34, While=35, To=36, Do=37, End=38, In=39, Null=40, Try=41, 
		Class=42, Const=43, Noval=44, Self=45, Native=46, Or=47, Accessor=48, 
		And=49, Equals=50, NEquals=51, GTEquals=52, LTEquals=53, Pow=54, Excl=55, 
		GT=56, LT=57, Add=58, Subtract=59, Multiply=60, Divide=61, Modulus=62, 
		OBrace=63, CBrace=64, OBracket=65, CBracket=66, OParen=67, CParen=68, 
		SColon=69, Assign=70, Comma=71, QMark=72, Colon=73, Bool=74, Number=75, 
		Identifier=76, String=77, Comment=78, Space=79;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "Println", "Async", "AddComponent", "Var", 
			"Import", "Print", "Input", "Assert", "Def", "ToInt", "If", "Else", "Return", 
			"For", "While", "To", "Do", "End", "In", "Null", "Try", "Class", "Const", 
			"Noval", "Self", "Native", "Or", "Accessor", "And", "Equals", "NEquals", 
			"GTEquals", "LTEquals", "Pow", "Excl", "GT", "LT", "Add", "Subtract", 
			"Multiply", "Divide", "Modulus", "OBrace", "CBrace", "OBracket", "CBracket", 
			"OParen", "CParen", "SColon", "Assign", "Comma", "QMark", "Colon", "Bool", 
			"Number", "Identifier", "String", "Comment", "Space", "Int", "Digit", 
			"ESC", "UNICODE", "HEX"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'header'", "'cn'", "'new'", "'as'", "'sys'", "'write'", 
			"'verify'", "'range'", "'#'", "'.'", "'all'", "'custom'", "'define'", 
			"'\"'", "'onerr'", "'render'", "'changeText'", "'fn main()'", "'random'", 
			null, "'async'", "'addComp'", "'var'", "'import'", null, null, "'assert'", 
			"'fn'", "'toInt'", "'if'", "'else'", "'return'", "'for'", "'while'", 
			"'to'", "'do'", "'end'", "'in'", "'null'", "'try'", "'class'", "'const'", 
			"'noval'", "'self'", "'native'", "'||'", "'::'", "'&&'", "'=='", "'!='", 
			"'>='", "'<='", "'^'", "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "'='", "','", 
			"'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "Println", "Async", 
			"AddComponent", "Var", "Import", "Print", "Input", "Assert", "Def", "ToInt", 
			"If", "Else", "Return", "For", "While", "To", "Do", "End", "In", "Null", 
			"Try", "Class", "Const", "Noval", "Self", "Native", "Or", "Accessor", 
			"And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", "Excl", "GT", 
			"LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", "OBrace", "CBrace", 
			"OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign", "Comma", 
			"QMark", "Colon", "Bool", "Number", "Identifier", "String", "Comment", 
			"Space"
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


	public QLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Q.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Q\u023c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3"+
		"+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3"+
		"/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\38\38\39"+
		"\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D"+
		"\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u01ec"+
		"\nK\3L\3L\3L\7L\u01f1\nL\fL\16L\u01f4\13L\5L\u01f6\nL\3M\3M\7M\u01fa\n"+
		"M\fM\16M\u01fd\13M\3N\3N\3N\6N\u0202\nN\rN\16N\u0203\3N\3N\3O\3O\3O\3"+
		"O\7O\u020c\nO\fO\16O\u020f\13O\3O\3O\3O\3O\7O\u0215\nO\fO\16O\u0218\13"+
		"O\3O\3O\5O\u021c\nO\3O\3O\3P\3P\3P\3P\3Q\3Q\7Q\u0226\nQ\fQ\16Q\u0229\13"+
		"Q\3Q\5Q\u022c\nQ\3R\3R\3S\3S\3S\5S\u0233\nS\3T\3T\3T\3T\3T\3T\3U\3U\3"+
		"\u0216\2V\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008b"+
		"G\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009f"+
		"Q\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\3\2\13\5\2C\\aac|\6\2\62;C\\"+
		"aac|\6\2\f\f\17\17$$^^\4\2\f\f\17\17\5\2\13\f\16\17\"\"\3\2\63;\3\2\62"+
		";\t\2$$^^ddhhppttvv\5\2\62;CHch\2\u0242\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3"+
		"\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2"+
		"\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\3\u00ab\3\2\2\2\5\u00ad"+
		"\3\2\2\2\7\u00b4\3\2\2\2\t\u00b7\3\2\2\2\13\u00bb\3\2\2\2\r\u00be\3\2"+
		"\2\2\17\u00c2\3\2\2\2\21\u00c8\3\2\2\2\23\u00cf\3\2\2\2\25\u00d5\3\2\2"+
		"\2\27\u00d7\3\2\2\2\31\u00d9\3\2\2\2\33\u00dd\3\2\2\2\35\u00e4\3\2\2\2"+
		"\37\u00eb\3\2\2\2!\u00ed\3\2\2\2#\u00f3\3\2\2\2%\u00fa\3\2\2\2\'\u0105"+
		"\3\2\2\2)\u010f\3\2\2\2+\u0116\3\2\2\2-\u011e\3\2\2\2/\u0124\3\2\2\2\61"+
		"\u012c\3\2\2\2\63\u0130\3\2\2\2\65\u0137\3\2\2\2\67\u0140\3\2\2\29\u0148"+
		"\3\2\2\2;\u014f\3\2\2\2=\u0152\3\2\2\2?\u0158\3\2\2\2A\u015b\3\2\2\2C"+
		"\u0160\3\2\2\2E\u0167\3\2\2\2G\u016b\3\2\2\2I\u0171\3\2\2\2K\u0174\3\2"+
		"\2\2M\u0177\3\2\2\2O\u017b\3\2\2\2Q\u017e\3\2\2\2S\u0183\3\2\2\2U\u0187"+
		"\3\2\2\2W\u018d\3\2\2\2Y\u0193\3\2\2\2[\u0199\3\2\2\2]\u019e\3\2\2\2_"+
		"\u01a5\3\2\2\2a\u01a8\3\2\2\2c\u01ab\3\2\2\2e\u01ae\3\2\2\2g\u01b1\3\2"+
		"\2\2i\u01b4\3\2\2\2k\u01b7\3\2\2\2m\u01ba\3\2\2\2o\u01bc\3\2\2\2q\u01be"+
		"\3\2\2\2s\u01c0\3\2\2\2u\u01c2\3\2\2\2w\u01c4\3\2\2\2y\u01c6\3\2\2\2{"+
		"\u01c8\3\2\2\2}\u01ca\3\2\2\2\177\u01cc\3\2\2\2\u0081\u01ce\3\2\2\2\u0083"+
		"\u01d0\3\2\2\2\u0085\u01d2\3\2\2\2\u0087\u01d4\3\2\2\2\u0089\u01d6\3\2"+
		"\2\2\u008b\u01d8\3\2\2\2\u008d\u01da\3\2\2\2\u008f\u01dc\3\2\2\2\u0091"+
		"\u01de\3\2\2\2\u0093\u01e0\3\2\2\2\u0095\u01eb\3\2\2\2\u0097\u01ed\3\2"+
		"\2\2\u0099\u01f7\3\2\2\2\u009b\u01fe\3\2\2\2\u009d\u021b\3\2\2\2\u009f"+
		"\u021f\3\2\2\2\u00a1\u022b\3\2\2\2\u00a3\u022d\3\2\2\2\u00a5\u022f\3\2"+
		"\2\2\u00a7\u0234\3\2\2\2\u00a9\u023a\3\2\2\2\u00ab\u00ac\7B\2\2\u00ac"+
		"\4\3\2\2\2\u00ad\u00ae\7j\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7c\2\2\u00b0"+
		"\u00b1\7f\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7t\2\2\u00b3\6\3\2\2\2\u00b4"+
		"\u00b5\7e\2\2\u00b5\u00b6\7p\2\2\u00b6\b\3\2\2\2\u00b7\u00b8\7p\2\2\u00b8"+
		"\u00b9\7g\2\2\u00b9\u00ba\7y\2\2\u00ba\n\3\2\2\2\u00bb\u00bc\7c\2\2\u00bc"+
		"\u00bd\7u\2\2\u00bd\f\3\2\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7{\2\2\u00c0"+
		"\u00c1\7u\2\2\u00c1\16\3\2\2\2\u00c2\u00c3\7y\2\2\u00c3\u00c4\7t\2\2\u00c4"+
		"\u00c5\7k\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7g\2\2\u00c7\20\3\2\2\2\u00c8"+
		"\u00c9\7x\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7k\2\2"+
		"\u00cc\u00cd\7h\2\2\u00cd\u00ce\7{\2\2\u00ce\22\3\2\2\2\u00cf\u00d0\7"+
		"t\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7i\2\2\u00d3\u00d4"+
		"\7g\2\2\u00d4\24\3\2\2\2\u00d5\u00d6\7%\2\2\u00d6\26\3\2\2\2\u00d7\u00d8"+
		"\7\60\2\2\u00d8\30\3\2\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7n\2\2\u00db"+
		"\u00dc\7n\2\2\u00dc\32\3\2\2\2\u00dd\u00de\7e\2\2\u00de\u00df\7w\2\2\u00df"+
		"\u00e0\7u\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7o\2\2"+
		"\u00e3\34\3\2\2\2\u00e4\u00e5\7f\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7"+
		"h\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7g\2\2\u00ea\36"+
		"\3\2\2\2\u00eb\u00ec\7$\2\2\u00ec \3\2\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef"+
		"\7p\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7t\2\2\u00f2"+
		"\"\3\2\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7p\2\2\u00f6"+
		"\u00f7\7f\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7t\2\2\u00f9$\3\2\2\2\u00fa"+
		"\u00fb\7e\2\2\u00fb\u00fc\7j\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7p\2\2"+
		"\u00fe\u00ff\7i\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7V\2\2\u0101\u0102"+
		"\7g\2\2\u0102\u0103\7z\2\2\u0103\u0104\7v\2\2\u0104&\3\2\2\2\u0105\u0106"+
		"\7h\2\2\u0106\u0107\7p\2\2\u0107\u0108\7\"\2\2\u0108\u0109\7o\2\2\u0109"+
		"\u010a\7c\2\2\u010a\u010b\7k\2\2\u010b\u010c\7p\2\2\u010c\u010d\7*\2\2"+
		"\u010d\u010e\7+\2\2\u010e(\3\2\2\2\u010f\u0110\7t\2\2\u0110\u0111\7c\2"+
		"\2\u0111\u0112\7p\2\2\u0112\u0113\7f\2\2\u0113\u0114\7q\2\2\u0114\u0115"+
		"\7o\2\2\u0115*\3\2\2\2\u0116\u0117\7u\2\2\u0117\u0118\7v\2\2\u0118\u0119"+
		"\7f\2\2\u0119\u011a\3\2\2\2\u011a\u011b\5a\61\2\u011b\u011c\7n\2\2\u011c"+
		"\u011d\7p\2\2\u011d,\3\2\2\2\u011e\u011f\7c\2\2\u011f\u0120\7u\2\2\u0120"+
		"\u0121\7{\2\2\u0121\u0122\7p\2\2\u0122\u0123\7e\2\2\u0123.\3\2\2\2\u0124"+
		"\u0125\7c\2\2\u0125\u0126\7f\2\2\u0126\u0127\7f\2\2\u0127\u0128\7E\2\2"+
		"\u0128\u0129\7q\2\2\u0129\u012a\7o\2\2\u012a\u012b\7r\2\2\u012b\60\3\2"+
		"\2\2\u012c\u012d\7x\2\2\u012d\u012e\7c\2\2\u012e\u012f\7t\2\2\u012f\62"+
		"\3\2\2\2\u0130\u0131\7k\2\2\u0131\u0132\7o\2\2\u0132\u0133\7r\2\2\u0133"+
		"\u0134\7q\2\2\u0134\u0135\7t\2\2\u0135\u0136\7v\2\2\u0136\64\3\2\2\2\u0137"+
		"\u0138\7u\2\2\u0138\u0139\7v\2\2\u0139\u013a\7f\2\2\u013a\u013b\3\2\2"+
		"\2\u013b\u013c\5a\61\2\u013c\u013d\7q\2\2\u013d\u013e\7w\2\2\u013e\u013f"+
		"\7v\2\2\u013f\66\3\2\2\2\u0140\u0141\7u\2\2\u0141\u0142\7v\2\2\u0142\u0143"+
		"\7f\2\2\u0143\u0144\3\2\2\2\u0144\u0145\5a\61\2\u0145\u0146\7k\2\2\u0146"+
		"\u0147\7p\2\2\u01478\3\2\2\2\u0148\u0149\7c\2\2\u0149\u014a\7u\2\2\u014a"+
		"\u014b\7u\2\2\u014b\u014c\7g\2\2\u014c\u014d\7t\2\2\u014d\u014e\7v\2\2"+
		"\u014e:\3\2\2\2\u014f\u0150\7h\2\2\u0150\u0151\7p\2\2\u0151<\3\2\2\2\u0152"+
		"\u0153\7v\2\2\u0153\u0154\7q\2\2\u0154\u0155\7K\2\2\u0155\u0156\7p\2\2"+
		"\u0156\u0157\7v\2\2\u0157>\3\2\2\2\u0158\u0159\7k\2\2\u0159\u015a\7h\2"+
		"\2\u015a@\3\2\2\2\u015b\u015c\7g\2\2\u015c\u015d\7n\2\2\u015d\u015e\7"+
		"u\2\2\u015e\u015f\7g\2\2\u015fB\3\2\2\2\u0160\u0161\7t\2\2\u0161\u0162"+
		"\7g\2\2\u0162\u0163\7v\2\2\u0163\u0164\7w\2\2\u0164\u0165\7t\2\2\u0165"+
		"\u0166\7p\2\2\u0166D\3\2\2\2\u0167\u0168\7h\2\2\u0168\u0169\7q\2\2\u0169"+
		"\u016a\7t\2\2\u016aF\3\2\2\2\u016b\u016c\7y\2\2\u016c\u016d\7j\2\2\u016d"+
		"\u016e\7k\2\2\u016e\u016f\7n\2\2\u016f\u0170\7g\2\2\u0170H\3\2\2\2\u0171"+
		"\u0172\7v\2\2\u0172\u0173\7q\2\2\u0173J\3\2\2\2\u0174\u0175\7f\2\2\u0175"+
		"\u0176\7q\2\2\u0176L\3\2\2\2\u0177\u0178\7g\2\2\u0178\u0179\7p\2\2\u0179"+
		"\u017a\7f\2\2\u017aN\3\2\2\2\u017b\u017c\7k\2\2\u017c\u017d\7p\2\2\u017d"+
		"P\3\2\2\2\u017e\u017f\7p\2\2\u017f\u0180\7w\2\2\u0180\u0181\7n\2\2\u0181"+
		"\u0182\7n\2\2\u0182R\3\2\2\2\u0183\u0184\7v\2\2\u0184\u0185\7t\2\2\u0185"+
		"\u0186\7{\2\2\u0186T\3\2\2\2\u0187\u0188\7e\2\2\u0188\u0189\7n\2\2\u0189"+
		"\u018a\7c\2\2\u018a\u018b\7u\2\2\u018b\u018c\7u\2\2\u018cV\3\2\2\2\u018d"+
		"\u018e\7e\2\2\u018e\u018f\7q\2\2\u018f\u0190\7p\2\2\u0190\u0191\7u\2\2"+
		"\u0191\u0192\7v\2\2\u0192X\3\2\2\2\u0193\u0194\7p\2\2\u0194\u0195\7q\2"+
		"\2\u0195\u0196\7x\2\2\u0196\u0197\7c\2\2\u0197\u0198\7n\2\2\u0198Z\3\2"+
		"\2\2\u0199\u019a\7u\2\2\u019a\u019b\7g\2\2\u019b\u019c\7n\2\2\u019c\u019d"+
		"\7h\2\2\u019d\\\3\2\2\2\u019e\u019f\7p\2\2\u019f\u01a0\7c\2\2\u01a0\u01a1"+
		"\7v\2\2\u01a1\u01a2\7k\2\2\u01a2\u01a3\7x\2\2\u01a3\u01a4\7g\2\2\u01a4"+
		"^\3\2\2\2\u01a5\u01a6\7~\2\2\u01a6\u01a7\7~\2\2\u01a7`\3\2\2\2\u01a8\u01a9"+
		"\7<\2\2\u01a9\u01aa\7<\2\2\u01aab\3\2\2\2\u01ab\u01ac\7(\2\2\u01ac\u01ad"+
		"\7(\2\2\u01add\3\2\2\2\u01ae\u01af\7?\2\2\u01af\u01b0\7?\2\2\u01b0f\3"+
		"\2\2\2\u01b1\u01b2\7#\2\2\u01b2\u01b3\7?\2\2\u01b3h\3\2\2\2\u01b4\u01b5"+
		"\7@\2\2\u01b5\u01b6\7?\2\2\u01b6j\3\2\2\2\u01b7\u01b8\7>\2\2\u01b8\u01b9"+
		"\7?\2\2\u01b9l\3\2\2\2\u01ba\u01bb\7`\2\2\u01bbn\3\2\2\2\u01bc\u01bd\7"+
		"#\2\2\u01bdp\3\2\2\2\u01be\u01bf\7@\2\2\u01bfr\3\2\2\2\u01c0\u01c1\7>"+
		"\2\2\u01c1t\3\2\2\2\u01c2\u01c3\7-\2\2\u01c3v\3\2\2\2\u01c4\u01c5\7/\2"+
		"\2\u01c5x\3\2\2\2\u01c6\u01c7\7,\2\2\u01c7z\3\2\2\2\u01c8\u01c9\7\61\2"+
		"\2\u01c9|\3\2\2\2\u01ca\u01cb\7\'\2\2\u01cb~\3\2\2\2\u01cc\u01cd\7}\2"+
		"\2\u01cd\u0080\3\2\2\2\u01ce\u01cf\7\177\2\2\u01cf\u0082\3\2\2\2\u01d0"+
		"\u01d1\7]\2\2\u01d1\u0084\3\2\2\2\u01d2\u01d3\7_\2\2\u01d3\u0086\3\2\2"+
		"\2\u01d4\u01d5\7*\2\2\u01d5\u0088\3\2\2\2\u01d6\u01d7\7+\2\2\u01d7\u008a"+
		"\3\2\2\2\u01d8\u01d9\7=\2\2\u01d9\u008c\3\2\2\2\u01da\u01db\7?\2\2\u01db"+
		"\u008e\3\2\2\2\u01dc\u01dd\7.\2\2\u01dd\u0090\3\2\2\2\u01de\u01df\7A\2"+
		"\2\u01df\u0092\3\2\2\2\u01e0\u01e1\7<\2\2\u01e1\u0094\3\2\2\2\u01e2\u01e3"+
		"\7v\2\2\u01e3\u01e4\7t\2\2\u01e4\u01e5\7w\2\2\u01e5\u01ec\7g\2\2\u01e6"+
		"\u01e7\7h\2\2\u01e7\u01e8\7c\2\2\u01e8\u01e9\7n\2\2\u01e9\u01ea\7u\2\2"+
		"\u01ea\u01ec\7g\2\2\u01eb\u01e2\3\2\2\2\u01eb\u01e6\3\2\2\2\u01ec\u0096"+
		"\3\2\2\2\u01ed\u01f5\5\u00a1Q\2\u01ee\u01f2\7\60\2\2\u01ef\u01f1\5\u00a3"+
		"R\2\u01f0\u01ef\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2"+
		"\u01f3\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01ee\3\2"+
		"\2\2\u01f5\u01f6\3\2\2\2\u01f6\u0098\3\2\2\2\u01f7\u01fb\t\2\2\2\u01f8"+
		"\u01fa\t\3\2\2\u01f9\u01f8\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2"+
		"\2\2\u01fb\u01fc\3\2\2\2\u01fc\u009a\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe"+
		"\u0201\7$\2\2\u01ff\u0202\5\u00a5S\2\u0200\u0202\n\4\2\2\u0201\u01ff\3"+
		"\2\2\2\u0201\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0201\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\7$\2\2\u0206\u009c\3\2"+
		"\2\2\u0207\u0208\7\61\2\2\u0208\u0209\7\61\2\2\u0209\u020d\3\2\2\2\u020a"+
		"\u020c\n\5\2\2\u020b\u020a\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2"+
		"\2\2\u020d\u020e\3\2\2\2\u020e\u021c\3\2\2\2\u020f\u020d\3\2\2\2\u0210"+
		"\u0211\7\61\2\2\u0211\u0212\7,\2\2\u0212\u0216\3\2\2\2\u0213\u0215\13"+
		"\2\2\2\u0214\u0213\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0217\3\2\2\2\u0216"+
		"\u0214\3\2\2\2\u0217\u0219\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021a\7,"+
		"\2\2\u021a\u021c\7\61\2\2\u021b\u0207\3\2\2\2\u021b\u0210\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d\u021e\bO\2\2\u021e\u009e\3\2\2\2\u021f\u0220\t\6"+
		"\2\2\u0220\u0221\3\2\2\2\u0221\u0222\bP\2\2\u0222\u00a0\3\2\2\2\u0223"+
		"\u0227\t\7\2\2\u0224\u0226\5\u00a3R\2\u0225\u0224\3\2\2\2\u0226\u0229"+
		"\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022c\3\2\2\2\u0229"+
		"\u0227\3\2\2\2\u022a\u022c\7\62\2\2\u022b\u0223\3\2\2\2\u022b\u022a\3"+
		"\2\2\2\u022c\u00a2\3\2\2\2\u022d\u022e\t\b\2\2\u022e\u00a4\3\2\2\2\u022f"+
		"\u0232\7^\2\2\u0230\u0233\t\t\2\2\u0231\u0233\5\u00a7T\2\u0232\u0230\3"+
		"\2\2\2\u0232\u0231\3\2\2\2\u0233\u00a6\3\2\2\2\u0234\u0235\7w\2\2\u0235"+
		"\u0236\5\u00a9U\2\u0236\u0237\5\u00a9U\2\u0237\u0238\5\u00a9U\2\u0238"+
		"\u0239\5\u00a9U\2\u0239\u00a8\3\2\2\2\u023a\u023b\t\n\2\2\u023b\u00aa"+
		"\3\2\2\2\17\2\u01eb\u01f2\u01f5\u01fb\u0201\u0203\u020d\u0216\u021b\u0227"+
		"\u022b\u0232\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}