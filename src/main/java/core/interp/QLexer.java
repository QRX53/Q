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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		Println=25, Async=26, Render=27, AddComponent=28, Var=29, Import=30, Print=31, 
		Input=32, Assert=33, Def=34, ToInt=35, If=36, Else=37, Return=38, For=39, 
		While=40, To=41, Do=42, End=43, In=44, Null=45, Try=46, Catch=47, Class=48, 
		Or=49, And=50, Equals=51, NEquals=52, GTEquals=53, LTEquals=54, Pow=55, 
		Excl=56, GT=57, LT=58, Add=59, Subtract=60, Multiply=61, Divide=62, Modulus=63, 
		OBrace=64, CBrace=65, OBracket=66, CBracket=67, OParen=68, CParen=69, 
		SColon=70, Assign=71, Comma=72, QMark=73, Colon=74, Bool=75, Number=76, 
		Identifier=77, String=78, Comment=79, JavaTextBlock=80, Space=81;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "Println", 
			"Async", "Render", "AddComponent", "Var", "Import", "Print", "Input", 
			"Assert", "Def", "ToInt", "If", "Else", "Return", "For", "While", "To", 
			"Do", "End", "In", "Null", "Try", "Catch", "Class", "Or", "And", "Equals", 
			"NEquals", "GTEquals", "LTEquals", "Pow", "Excl", "GT", "LT", "Add", 
			"Subtract", "Multiply", "Divide", "Modulus", "OBrace", "CBrace", "OBracket", 
			"CBracket", "OParen", "CParen", "SColon", "Assign", "Comma", "QMark", 
			"Colon", "Bool", "Number", "Identifier", "String", "Comment", "JavaTextBlock", 
			"Space", "Int", "Digit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'@'", "'header'", "'here'", "'cn'", "'new'", "'as'", "'List'", 
			"'add'", "'remove'", "'sys'", "'write'", "'verify'", "'noval'", "'range'", 
			"'#'", "'all'", "'custom'", "'define'", "'\"'", "'onflaw'", "'changeText'", 
			"'fn main()'", "'random'", "'std:ln'", "'async'", "'render'", "'addComp'", 
			"'var'", "'import'", "'std:out'", "'std:in'", "'assert'", "'fn'", "'toInt'", 
			"'if'", "'else'", "'return'", "'for'", "'while'", "'to'", "'do'", "'end'", 
			"'in'", "'null'", "'try'", "'catch'", "'class'", "'||'", "'&&'", "'=='", 
			"'!='", "'>='", "'<='", "'^'", "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "'='", 
			"','", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "Println", "Async", "Render", "AddComponent", "Var", "Import", 
			"Print", "Input", "Assert", "Def", "ToInt", "If", "Else", "Return", "For", 
			"While", "To", "Do", "End", "In", "Null", "Try", "Catch", "Class", "Or", 
			"And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", "Excl", "GT", 
			"LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", "OBrace", "CBrace", 
			"OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign", "Comma", 
			"QMark", "Colon", "Bool", "Number", "Identifier", "String", "Comment", 
			"JavaTextBlock", "Space"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2S\u0249\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&"+
		"\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3"+
		"*\3*\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C"+
		"\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3L\3L\3L\3L"+
		"\3L\3L\3L\5L\u01ee\nL\3M\3M\3M\7M\u01f3\nM\fM\16M\u01f6\13M\5M\u01f8\n"+
		"M\3N\3N\7N\u01fc\nN\fN\16N\u01ff\13N\3O\3O\3O\3O\7O\u0205\nO\fO\16O\u0208"+
		"\13O\3O\3O\3O\3O\3O\7O\u020f\nO\fO\16O\u0212\13O\3O\5O\u0215\nO\3P\3P"+
		"\3P\3P\7P\u021b\nP\fP\16P\u021e\13P\3P\3P\3P\3P\7P\u0224\nP\fP\16P\u0227"+
		"\13P\3P\3P\5P\u022b\nP\3P\3P\3Q\3Q\3Q\3Q\7Q\u0233\nQ\fQ\16Q\u0236\13Q"+
		"\3Q\3Q\3R\3R\3R\3R\3S\3S\7S\u0240\nS\fS\16S\u0243\13S\3S\5S\u0246\nS\3"+
		"T\3T\3\u0225\2U\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5\2\u00a7\2\3\2\f\5\2C\\aac|\6\2\62;C\\aac"+
		"|\3\2$$\6\2\f\f\17\17$$^^\4\2\f\f\17\17\3\2))\6\2\f\f\17\17))^^\5\2\13"+
		"\f\16\17\"\"\3\2\63;\3\2\62;\2\u0256\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2"+
		"\2\3\u00a9\3\2\2\2\5\u00ab\3\2\2\2\7\u00ad\3\2\2\2\t\u00b4\3\2\2\2\13"+
		"\u00b9\3\2\2\2\r\u00bc\3\2\2\2\17\u00c0\3\2\2\2\21\u00c3\3\2\2\2\23\u00c8"+
		"\3\2\2\2\25\u00cc\3\2\2\2\27\u00d3\3\2\2\2\31\u00d7\3\2\2\2\33\u00dd\3"+
		"\2\2\2\35\u00e4\3\2\2\2\37\u00ea\3\2\2\2!\u00f0\3\2\2\2#\u00f2\3\2\2\2"+
		"%\u00f6\3\2\2\2\'\u00fd\3\2\2\2)\u0104\3\2\2\2+\u0106\3\2\2\2-\u010d\3"+
		"\2\2\2/\u0118\3\2\2\2\61\u0122\3\2\2\2\63\u0129\3\2\2\2\65\u0130\3\2\2"+
		"\2\67\u0136\3\2\2\29\u013d\3\2\2\2;\u0145\3\2\2\2=\u0149\3\2\2\2?\u0150"+
		"\3\2\2\2A\u0158\3\2\2\2C\u015f\3\2\2\2E\u0166\3\2\2\2G\u0169\3\2\2\2I"+
		"\u016f\3\2\2\2K\u0172\3\2\2\2M\u0177\3\2\2\2O\u017e\3\2\2\2Q\u0182\3\2"+
		"\2\2S\u0188\3\2\2\2U\u018b\3\2\2\2W\u018e\3\2\2\2Y\u0192\3\2\2\2[\u0195"+
		"\3\2\2\2]\u019a\3\2\2\2_\u019e\3\2\2\2a\u01a4\3\2\2\2c\u01aa\3\2\2\2e"+
		"\u01ad\3\2\2\2g\u01b0\3\2\2\2i\u01b3\3\2\2\2k\u01b6\3\2\2\2m\u01b9\3\2"+
		"\2\2o\u01bc\3\2\2\2q\u01be\3\2\2\2s\u01c0\3\2\2\2u\u01c2\3\2\2\2w\u01c4"+
		"\3\2\2\2y\u01c6\3\2\2\2{\u01c8\3\2\2\2}\u01ca\3\2\2\2\177\u01cc\3\2\2"+
		"\2\u0081\u01ce\3\2\2\2\u0083\u01d0\3\2\2\2\u0085\u01d2\3\2\2\2\u0087\u01d4"+
		"\3\2\2\2\u0089\u01d6\3\2\2\2\u008b\u01d8\3\2\2\2\u008d\u01da\3\2\2\2\u008f"+
		"\u01dc\3\2\2\2\u0091\u01de\3\2\2\2\u0093\u01e0\3\2\2\2\u0095\u01e2\3\2"+
		"\2\2\u0097\u01ed\3\2\2\2\u0099\u01ef\3\2\2\2\u009b\u01f9\3\2\2\2\u009d"+
		"\u0214\3\2\2\2\u009f\u022a\3\2\2\2\u00a1\u022e\3\2\2\2\u00a3\u0239\3\2"+
		"\2\2\u00a5\u0245\3\2\2\2\u00a7\u0247\3\2\2\2\u00a9\u00aa\7\60\2\2\u00aa"+
		"\4\3\2\2\2\u00ab\u00ac\7B\2\2\u00ac\6\3\2\2\2\u00ad\u00ae\7j\2\2\u00ae"+
		"\u00af\7g\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7f\2\2\u00b1\u00b2\7g\2\2"+
		"\u00b2\u00b3\7t\2\2\u00b3\b\3\2\2\2\u00b4\u00b5\7j\2\2\u00b5\u00b6\7g"+
		"\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2\2\u00b8\n\3\2\2\2\u00b9\u00ba"+
		"\7e\2\2\u00ba\u00bb\7p\2\2\u00bb\f\3\2\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be"+
		"\7g\2\2\u00be\u00bf\7y\2\2\u00bf\16\3\2\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2"+
		"\7u\2\2\u00c2\20\3\2\2\2\u00c3\u00c4\7N\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6"+
		"\7u\2\2\u00c6\u00c7\7v\2\2\u00c7\22\3\2\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca"+
		"\7f\2\2\u00ca\u00cb\7f\2\2\u00cb\24\3\2\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce"+
		"\7g\2\2\u00ce\u00cf\7o\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7x\2\2\u00d1"+
		"\u00d2\7g\2\2\u00d2\26\3\2\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7{\2\2\u00d5"+
		"\u00d6\7u\2\2\u00d6\30\3\2\2\2\u00d7\u00d8\7y\2\2\u00d8\u00d9\7t\2\2\u00d9"+
		"\u00da\7k\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7g\2\2\u00dc\32\3\2\2\2\u00dd"+
		"\u00de\7x\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7k\2\2"+
		"\u00e1\u00e2\7h\2\2\u00e2\u00e3\7{\2\2\u00e3\34\3\2\2\2\u00e4\u00e5\7"+
		"p\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7x\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9"+
		"\7n\2\2\u00e9\36\3\2\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed"+
		"\7p\2\2\u00ed\u00ee\7i\2\2\u00ee\u00ef\7g\2\2\u00ef \3\2\2\2\u00f0\u00f1"+
		"\7%\2\2\u00f1\"\3\2\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5"+
		"\7n\2\2\u00f5$\3\2\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8\7w\2\2\u00f8\u00f9"+
		"\7u\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7o\2\2\u00fc"+
		"&\3\2\2\2\u00fd\u00fe\7f\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7h\2\2\u0100"+
		"\u0101\7k\2\2\u0101\u0102\7p\2\2\u0102\u0103\7g\2\2\u0103(\3\2\2\2\u0104"+
		"\u0105\7$\2\2\u0105*\3\2\2\2\u0106\u0107\7q\2\2\u0107\u0108\7p\2\2\u0108"+
		"\u0109\7h\2\2\u0109\u010a\7n\2\2\u010a\u010b\7c\2\2\u010b\u010c\7y\2\2"+
		"\u010c,\3\2\2\2\u010d\u010e\7e\2\2\u010e\u010f\7j\2\2\u010f\u0110\7c\2"+
		"\2\u0110\u0111\7p\2\2\u0111\u0112\7i\2\2\u0112\u0113\7g\2\2\u0113\u0114"+
		"\7V\2\2\u0114\u0115\7g\2\2\u0115\u0116\7z\2\2\u0116\u0117\7v\2\2\u0117"+
		".\3\2\2\2\u0118\u0119\7h\2\2\u0119\u011a\7p\2\2\u011a\u011b\7\"\2\2\u011b"+
		"\u011c\7o\2\2\u011c\u011d\7c\2\2\u011d\u011e\7k\2\2\u011e\u011f\7p\2\2"+
		"\u011f\u0120\7*\2\2\u0120\u0121\7+\2\2\u0121\60\3\2\2\2\u0122\u0123\7"+
		"t\2\2\u0123\u0124\7c\2\2\u0124\u0125\7p\2\2\u0125\u0126\7f\2\2\u0126\u0127"+
		"\7q\2\2\u0127\u0128\7o\2\2\u0128\62\3\2\2\2\u0129\u012a\7u\2\2\u012a\u012b"+
		"\7v\2\2\u012b\u012c\7f\2\2\u012c\u012d\7<\2\2\u012d\u012e\7n\2\2\u012e"+
		"\u012f\7p\2\2\u012f\64\3\2\2\2\u0130\u0131\7c\2\2\u0131\u0132\7u\2\2\u0132"+
		"\u0133\7{\2\2\u0133\u0134\7p\2\2\u0134\u0135\7e\2\2\u0135\66\3\2\2\2\u0136"+
		"\u0137\7t\2\2\u0137\u0138\7g\2\2\u0138\u0139\7p\2\2\u0139\u013a\7f\2\2"+
		"\u013a\u013b\7g\2\2\u013b\u013c\7t\2\2\u013c8\3\2\2\2\u013d\u013e\7c\2"+
		"\2\u013e\u013f\7f\2\2\u013f\u0140\7f\2\2\u0140\u0141\7E\2\2\u0141\u0142"+
		"\7q\2\2\u0142\u0143\7o\2\2\u0143\u0144\7r\2\2\u0144:\3\2\2\2\u0145\u0146"+
		"\7x\2\2\u0146\u0147\7c\2\2\u0147\u0148\7t\2\2\u0148<\3\2\2\2\u0149\u014a"+
		"\7k\2\2\u014a\u014b\7o\2\2\u014b\u014c\7r\2\2\u014c\u014d\7q\2\2\u014d"+
		"\u014e\7t\2\2\u014e\u014f\7v\2\2\u014f>\3\2\2\2\u0150\u0151\7u\2\2\u0151"+
		"\u0152\7v\2\2\u0152\u0153\7f\2\2\u0153\u0154\7<\2\2\u0154\u0155\7q\2\2"+
		"\u0155\u0156\7w\2\2\u0156\u0157\7v\2\2\u0157@\3\2\2\2\u0158\u0159\7u\2"+
		"\2\u0159\u015a\7v\2\2\u015a\u015b\7f\2\2\u015b\u015c\7<\2\2\u015c\u015d"+
		"\7k\2\2\u015d\u015e\7p\2\2\u015eB\3\2\2\2\u015f\u0160\7c\2\2\u0160\u0161"+
		"\7u\2\2\u0161\u0162\7u\2\2\u0162\u0163\7g\2\2\u0163\u0164\7t\2\2\u0164"+
		"\u0165\7v\2\2\u0165D\3\2\2\2\u0166\u0167\7h\2\2\u0167\u0168\7p\2\2\u0168"+
		"F\3\2\2\2\u0169\u016a\7v\2\2\u016a\u016b\7q\2\2\u016b\u016c\7K\2\2\u016c"+
		"\u016d\7p\2\2\u016d\u016e\7v\2\2\u016eH\3\2\2\2\u016f\u0170\7k\2\2\u0170"+
		"\u0171\7h\2\2\u0171J\3\2\2\2\u0172\u0173\7g\2\2\u0173\u0174\7n\2\2\u0174"+
		"\u0175\7u\2\2\u0175\u0176\7g\2\2\u0176L\3\2\2\2\u0177\u0178\7t\2\2\u0178"+
		"\u0179\7g\2\2\u0179\u017a\7v\2\2\u017a\u017b\7w\2\2\u017b\u017c\7t\2\2"+
		"\u017c\u017d\7p\2\2\u017dN\3\2\2\2\u017e\u017f\7h\2\2\u017f\u0180\7q\2"+
		"\2\u0180\u0181\7t\2\2\u0181P\3\2\2\2\u0182\u0183\7y\2\2\u0183\u0184\7"+
		"j\2\2\u0184\u0185\7k\2\2\u0185\u0186\7n\2\2\u0186\u0187\7g\2\2\u0187R"+
		"\3\2\2\2\u0188\u0189\7v\2\2\u0189\u018a\7q\2\2\u018aT\3\2\2\2\u018b\u018c"+
		"\7f\2\2\u018c\u018d\7q\2\2\u018dV\3\2\2\2\u018e\u018f\7g\2\2\u018f\u0190"+
		"\7p\2\2\u0190\u0191\7f\2\2\u0191X\3\2\2\2\u0192\u0193\7k\2\2\u0193\u0194"+
		"\7p\2\2\u0194Z\3\2\2\2\u0195\u0196\7p\2\2\u0196\u0197\7w\2\2\u0197\u0198"+
		"\7n\2\2\u0198\u0199\7n\2\2\u0199\\\3\2\2\2\u019a\u019b\7v\2\2\u019b\u019c"+
		"\7t\2\2\u019c\u019d\7{\2\2\u019d^\3\2\2\2\u019e\u019f\7e\2\2\u019f\u01a0"+
		"\7c\2\2\u01a0\u01a1\7v\2\2\u01a1\u01a2\7e\2\2\u01a2\u01a3\7j\2\2\u01a3"+
		"`\3\2\2\2\u01a4\u01a5\7e\2\2\u01a5\u01a6\7n\2\2\u01a6\u01a7\7c\2\2\u01a7"+
		"\u01a8\7u\2\2\u01a8\u01a9\7u\2\2\u01a9b\3\2\2\2\u01aa\u01ab\7~\2\2\u01ab"+
		"\u01ac\7~\2\2\u01acd\3\2\2\2\u01ad\u01ae\7(\2\2\u01ae\u01af\7(\2\2\u01af"+
		"f\3\2\2\2\u01b0\u01b1\7?\2\2\u01b1\u01b2\7?\2\2\u01b2h\3\2\2\2\u01b3\u01b4"+
		"\7#\2\2\u01b4\u01b5\7?\2\2\u01b5j\3\2\2\2\u01b6\u01b7\7@\2\2\u01b7\u01b8"+
		"\7?\2\2\u01b8l\3\2\2\2\u01b9\u01ba\7>\2\2\u01ba\u01bb\7?\2\2\u01bbn\3"+
		"\2\2\2\u01bc\u01bd\7`\2\2\u01bdp\3\2\2\2\u01be\u01bf\7#\2\2\u01bfr\3\2"+
		"\2\2\u01c0\u01c1\7@\2\2\u01c1t\3\2\2\2\u01c2\u01c3\7>\2\2\u01c3v\3\2\2"+
		"\2\u01c4\u01c5\7-\2\2\u01c5x\3\2\2\2\u01c6\u01c7\7/\2\2\u01c7z\3\2\2\2"+
		"\u01c8\u01c9\7,\2\2\u01c9|\3\2\2\2\u01ca\u01cb\7\61\2\2\u01cb~\3\2\2\2"+
		"\u01cc\u01cd\7\'\2\2\u01cd\u0080\3\2\2\2\u01ce\u01cf\7}\2\2\u01cf\u0082"+
		"\3\2\2\2\u01d0\u01d1\7\177\2\2\u01d1\u0084\3\2\2\2\u01d2\u01d3\7]\2\2"+
		"\u01d3\u0086\3\2\2\2\u01d4\u01d5\7_\2\2\u01d5\u0088\3\2\2\2\u01d6\u01d7"+
		"\7*\2\2\u01d7\u008a\3\2\2\2\u01d8\u01d9\7+\2\2\u01d9\u008c\3\2\2\2\u01da"+
		"\u01db\7=\2\2\u01db\u008e\3\2\2\2\u01dc\u01dd\7?\2\2\u01dd\u0090\3\2\2"+
		"\2\u01de\u01df\7.\2\2\u01df\u0092\3\2\2\2\u01e0\u01e1\7A\2\2\u01e1\u0094"+
		"\3\2\2\2\u01e2\u01e3\7<\2\2\u01e3\u0096\3\2\2\2\u01e4\u01e5\7v\2\2\u01e5"+
		"\u01e6\7t\2\2\u01e6\u01e7\7w\2\2\u01e7\u01ee\7g\2\2\u01e8\u01e9\7h\2\2"+
		"\u01e9\u01ea\7c\2\2\u01ea\u01eb\7n\2\2\u01eb\u01ec\7u\2\2\u01ec\u01ee"+
		"\7g\2\2\u01ed\u01e4\3\2\2\2\u01ed\u01e8\3\2\2\2\u01ee\u0098\3\2\2\2\u01ef"+
		"\u01f7\5\u00a5S\2\u01f0\u01f4\7\60\2\2\u01f1\u01f3\5\u00a7T\2\u01f2\u01f1"+
		"\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f0\3\2\2\2\u01f7\u01f8\3\2"+
		"\2\2\u01f8\u009a\3\2\2\2\u01f9\u01fd\t\2\2\2\u01fa\u01fc\t\3\2\2\u01fb"+
		"\u01fa\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2"+
		"\2\2\u01fe\u009c\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0206\t\4\2\2\u0201"+
		"\u0205\n\5\2\2\u0202\u0203\7^\2\2\u0203\u0205\n\6\2\2\u0204\u0201\3\2"+
		"\2\2\u0204\u0202\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\u0209\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u0215\t\4"+
		"\2\2\u020a\u0210\t\7\2\2\u020b\u020f\n\b\2\2\u020c\u020d\7^\2\2\u020d"+
		"\u020f\n\6\2\2\u020e\u020b\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0212\3\2"+
		"\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0213\u0215\t\7\2\2\u0214\u0200\3\2\2\2\u0214\u020a\3\2"+
		"\2\2\u0215\u009e\3\2\2\2\u0216\u0217\7\61\2\2\u0217\u0218\7\61\2\2\u0218"+
		"\u021c\3\2\2\2\u0219\u021b\n\6\2\2\u021a\u0219\3\2\2\2\u021b\u021e\3\2"+
		"\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u022b\3\2\2\2\u021e"+
		"\u021c\3\2\2\2\u021f\u0220\7\61\2\2\u0220\u0221\7,\2\2\u0221\u0225\3\2"+
		"\2\2\u0222\u0224\13\2\2\2\u0223\u0222\3\2\2\2\u0224\u0227\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0228\3\2\2\2\u0227\u0225\3\2"+
		"\2\2\u0228\u0229\7,\2\2\u0229\u022b\7\61\2\2\u022a\u0216\3\2\2\2\u022a"+
		"\u021f\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\bP\2\2\u022d\u00a0\3\2"+
		"\2\2\u022e\u0234\t\4\2\2\u022f\u0233\n\4\2\2\u0230\u0231\7^\2\2\u0231"+
		"\u0233\n\6\2\2\u0232\u022f\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0236\3\2"+
		"\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236"+
		"\u0234\3\2\2\2\u0237\u0238\t\4\2\2\u0238\u00a2\3\2\2\2\u0239\u023a\t\t"+
		"\2\2\u023a\u023b\3\2\2\2\u023b\u023c\bR\2\2\u023c\u00a4\3\2\2\2\u023d"+
		"\u0241\t\n\2\2\u023e\u0240\5\u00a7T\2\u023f\u023e\3\2\2\2\u0240\u0243"+
		"\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0246\3\2\2\2\u0243"+
		"\u0241\3\2\2\2\u0244\u0246\7\62\2\2\u0245\u023d\3\2\2\2\u0245\u0244\3"+
		"\2\2\2\u0246\u00a6\3\2\2\2\u0247\u0248\t\13\2\2\u0248\u00a8\3\2\2\2\23"+
		"\2\u01ed\u01f4\u01f7\u01fd\u0204\u0206\u020e\u0210\u0214\u021c\u0225\u022a"+
		"\u0232\u0234\u0241\u0245\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}