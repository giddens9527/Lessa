package lessa;

// Generated from Expr.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ADDMINOP=11, MULDIVOP=12, CLASS=13, DEF=14, RETURN=15, CONTINUE=16, 
		FOR=17, WHILE=18, BREAK=19, IN=20, IF=21, ELSE=22, ELIF=23, NOT=24, AND=25, 
		OR=26, DEL=27, THIS=28, FROM=29, IMPORT=30, AS=31, GLOBAL=32, IS=33, NONE=34, 
		TRUE=35, FALSE=36, NUMBER=37, FLOAT=38, NOTE=39, NAME=40, ID=41, PLUSASSIGN=42, 
		MINUSASSIGN=43, TIMESASSIGN=44, DIVIDEASSIGN=45, MOD_ASSIGN=46, POWER=47, 
		TIMES=48, DIVIDE=49, PLUS=50, MINUS=51, MOD=52, EQUAL=53, NOTEQUAL=54, 
		LE=55, GE=56, ASSIGN=57, LESS=58, GREATER=59, SHARP=60, FLAT=61, COMMA=62, 
		SEMICOLON=63, STRING=64, ESC=65, SKIP=66, NEWLINE=67, LINE_BAR=68;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "ADDMINOP", "MULDIVOP", "CLASS", "DEF", "RETURN", "CONTINUE", 
		"FOR", "WHILE", "BREAK", "IN", "IF", "ELSE", "ELIF", "NOT", "AND", "OR", 
		"DEL", "THIS", "FROM", "IMPORT", "AS", "GLOBAL", "IS", "NONE", "TRUE", 
		"FALSE", "NUMBER", "FLOAT", "NOTE", "NAME", "ID", "INT", "DEC_INT", "OCT_INT", 
		"HEX_INT", "NONZERO_DIGIT", "OCT_DIGIT", "HEX_DIGIT", "PLUSASSIGN", "MINUSASSIGN", 
		"TIMESASSIGN", "DIVIDEASSIGN", "MOD_ASSIGN", "POWER", "TIMES", "DIVIDE", 
		"PLUS", "MINUS", "MOD", "EQUAL", "NOTEQUAL", "LE", "GE", "ASSIGN", "LESS", 
		"GREATER", "SHARP", "FLAT", "COMMA", "SEMICOLON", "STRING", "STRING_GUTS", 
		"ESC", "SKIP", "NEWLINE", "CMT", "SCMT", "SPACES", "LINE_BAR", "LINE_JOINING", 
		"DIGIT", "EXPONENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@'", "'('", "')'", "'.'", "'{'", "'}'", "':'", "'<>'", "'['", 
		"']'", null, null, "'class'", "'def'", "'return'", "'continue'", "'for'", 
		"'while'", "'break'", "'in'", "'if'", "'else'", "'elif'", "'not'", "'and'", 
		"'or'", "'del'", "'this'", "'from'", "'import'", "'as'", "'global'", "'is'", 
		"'None'", "'True'", "'False'", null, null, null, null, null, "'+='", "'-='", 
		"'*='", "'/='", "'%='", "'**'", "'*'", "'/'", "'+'", "'-'", "'%'", "'=='", 
		"'!='", "'<='", "'>='", "'='", "'<'", "'>'", "'#'", "'~'", "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "ADDMINOP", 
		"MULDIVOP", "CLASS", "DEF", "RETURN", "CONTINUE", "FOR", "WHILE", "BREAK", 
		"IN", "IF", "ELSE", "ELIF", "NOT", "AND", "OR", "DEL", "THIS", "FROM", 
		"IMPORT", "AS", "GLOBAL", "IS", "NONE", "TRUE", "FALSE", "NUMBER", "FLOAT", 
		"NOTE", "NAME", "ID", "PLUSASSIGN", "MINUSASSIGN", "TIMESASSIGN", "DIVIDEASSIGN", 
		"MOD_ASSIGN", "POWER", "TIMES", "DIVIDE", "PLUS", "MINUS", "MOD", "EQUAL", 
		"NOTEQUAL", "LE", "GE", "ASSIGN", "LESS", "GREATER", "SHARP", "FLAT", 
		"COMMA", "SEMICOLON", "STRING", "ESC", "SKIP", "NEWLINE", "LINE_BAR"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2F\u0218\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\5\r\u00c2\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\5&\u013d\n&\3\'\6\'\u0140\n\'\r\'\16\'"+
		"\u0141\3\'\3\'\6\'\u0146\n\'\r\'\16\'\u0147\3\'\5\'\u014b\n\'\3(\3(\3"+
		"(\3(\3(\5(\u0152\n(\3(\3(\3)\3)\3*\3*\7*\u015a\n*\f*\16*\u015d\13*\3+"+
		"\3+\3+\5+\u0162\n+\3,\3,\7,\u0166\n,\f,\16,\u0169\13,\3,\5,\u016c\n,\3"+
		"-\3-\3-\6-\u0171\n-\r-\16-\u0172\3-\3-\6-\u0177\n-\r-\16-\u0178\5-\u017b"+
		"\n-\3.\3.\3.\6.\u0180\n.\r.\16.\u0181\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\67\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3"+
		"?\3@\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3H\3H\3I\3"+
		"I\7I\u01c6\nI\fI\16I\u01c9\13I\3J\3J\3J\3K\3K\3K\3K\3K\3K\5K\u01d4\nK"+
		"\3K\3K\3L\6L\u01d9\nL\rL\16L\u01da\3M\3M\3M\3M\7M\u01e1\nM\fM\16M\u01e4"+
		"\13M\3M\3M\3M\3N\3N\3N\3N\7N\u01ed\nN\fN\16N\u01f0\13N\3O\6O\u01f3\nO"+
		"\rO\16O\u01f4\3P\3P\7P\u01f9\nP\fP\16P\u01fc\13P\3P\5P\u01ff\nP\3Q\3Q"+
		"\5Q\u0203\nQ\3Q\5Q\u0206\nQ\3Q\3Q\5Q\u020a\nQ\3R\6R\u020d\nR\rR\16R\u020e"+
		"\3S\5S\u0212\nS\3S\6S\u0215\nS\rS\16S\u0216\3\u01e2\2T\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U\2W\2Y\2[\2]\2_\2a\2c,e-g.i/k\60m\61o\62q\63s\64u\65w\66y\67"+
		"{8}9\177:\u0081;\u0083<\u0085=\u0087>\u0089?\u008b@\u008dA\u008fB\u0091"+
		"\2\u0093C\u0095D\u0097E\u0099\2\u009b\2\u009d\2\u009fF\u00a1\2\u00a3\2"+
		"\u00a5\2\3\2\21\4\2--//\5\2\'\',,\61\61\4\2CIci\7\2ggjjssuuyy\4\2TTtt"+
		"\5\2C\\aac|\6\2\62;C\\aac|\4\2QQqq\4\2ZZzz\3\2\63;\3\2\629\5\2\62;CHc"+
		"h\4\2$$^^\4\2\f\f\17\17\4\2\13\13\"\"\u022b\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u009f\3\2\2\2\3\u00a7\3\2\2\2\5\u00a9"+
		"\3\2\2\2\7\u00ab\3\2\2\2\t\u00ad\3\2\2\2\13\u00af\3\2\2\2\r\u00b1\3\2"+
		"\2\2\17\u00b3\3\2\2\2\21\u00b5\3\2\2\2\23\u00b8\3\2\2\2\25\u00ba\3\2\2"+
		"\2\27\u00bc\3\2\2\2\31\u00c1\3\2\2\2\33\u00c3\3\2\2\2\35\u00c9\3\2\2\2"+
		"\37\u00cd\3\2\2\2!\u00d4\3\2\2\2#\u00dd\3\2\2\2%\u00e1\3\2\2\2\'\u00e7"+
		"\3\2\2\2)\u00ed\3\2\2\2+\u00f0\3\2\2\2-\u00f3\3\2\2\2/\u00f8\3\2\2\2\61"+
		"\u00fd\3\2\2\2\63\u0101\3\2\2\2\65\u0105\3\2\2\2\67\u0108\3\2\2\29\u010c"+
		"\3\2\2\2;\u0111\3\2\2\2=\u0116\3\2\2\2?\u011d\3\2\2\2A\u0120\3\2\2\2C"+
		"\u0127\3\2\2\2E\u012a\3\2\2\2G\u012f\3\2\2\2I\u0134\3\2\2\2K\u013c\3\2"+
		"\2\2M\u013f\3\2\2\2O\u014c\3\2\2\2Q\u0155\3\2\2\2S\u0157\3\2\2\2U\u0161"+
		"\3\2\2\2W\u016b\3\2\2\2Y\u017a\3\2\2\2[\u017c\3\2\2\2]\u0183\3\2\2\2_"+
		"\u0185\3\2\2\2a\u0187\3\2\2\2c\u0189\3\2\2\2e\u018c\3\2\2\2g\u018f\3\2"+
		"\2\2i\u0192\3\2\2\2k\u0195\3\2\2\2m\u0198\3\2\2\2o\u019b\3\2\2\2q\u019d"+
		"\3\2\2\2s\u019f\3\2\2\2u\u01a1\3\2\2\2w\u01a3\3\2\2\2y\u01a5\3\2\2\2{"+
		"\u01a8\3\2\2\2}\u01ab\3\2\2\2\177\u01ae\3\2\2\2\u0081\u01b1\3\2\2\2\u0083"+
		"\u01b3\3\2\2\2\u0085\u01b5\3\2\2\2\u0087\u01b7\3\2\2\2\u0089\u01b9\3\2"+
		"\2\2\u008b\u01bb\3\2\2\2\u008d\u01bd\3\2\2\2\u008f\u01bf\3\2\2\2\u0091"+
		"\u01c7\3\2\2\2\u0093\u01ca\3\2\2\2\u0095\u01d3\3\2\2\2\u0097\u01d8\3\2"+
		"\2\2\u0099\u01dc\3\2\2\2\u009b\u01e8\3\2\2\2\u009d\u01f2\3\2\2\2\u009f"+
		"\u01f6\3\2\2\2\u00a1\u0200\3\2\2\2\u00a3\u020c\3\2\2\2\u00a5\u0211\3\2"+
		"\2\2\u00a7\u00a8\7B\2\2\u00a8\4\3\2\2\2\u00a9\u00aa\7*\2\2\u00aa\6\3\2"+
		"\2\2\u00ab\u00ac\7+\2\2\u00ac\b\3\2\2\2\u00ad\u00ae\7\60\2\2\u00ae\n\3"+
		"\2\2\2\u00af\u00b0\7}\2\2\u00b0\f\3\2\2\2\u00b1\u00b2\7\177\2\2\u00b2"+
		"\16\3\2\2\2\u00b3\u00b4\7<\2\2\u00b4\20\3\2\2\2\u00b5\u00b6\7>\2\2\u00b6"+
		"\u00b7\7@\2\2\u00b7\22\3\2\2\2\u00b8\u00b9\7]\2\2\u00b9\24\3\2\2\2\u00ba"+
		"\u00bb\7_\2\2\u00bb\26\3\2\2\2\u00bc\u00bd\t\2\2\2\u00bd\30\3\2\2\2\u00be"+
		"\u00c2\t\3\2\2\u00bf\u00c0\7\61\2\2\u00c0\u00c2\7\61\2\2\u00c1\u00be\3"+
		"\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\32\3\2\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5"+
		"\7n\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7u\2\2\u00c8"+
		"\34\3\2\2\2\u00c9\u00ca\7f\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7h\2\2\u00cc"+
		"\36\3\2\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7v\2\2\u00d0"+
		"\u00d1\7w\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7p\2\2\u00d3 \3\2\2\2\u00d4"+
		"\u00d5\7e\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7v\2\2"+
		"\u00d8\u00d9\7k\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7w\2\2\u00db\u00dc"+
		"\7g\2\2\u00dc\"\3\2\2\2\u00dd\u00de\7h\2\2\u00de\u00df\7q\2\2\u00df\u00e0"+
		"\7t\2\2\u00e0$\3\2\2\2\u00e1\u00e2\7y\2\2\u00e2\u00e3\7j\2\2\u00e3\u00e4"+
		"\7k\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7g\2\2\u00e6&\3\2\2\2\u00e7\u00e8"+
		"\7d\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7c\2\2\u00eb"+
		"\u00ec\7m\2\2\u00ec(\3\2\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7p\2\2\u00ef"+
		"*\3\2\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7h\2\2\u00f2,\3\2\2\2\u00f3\u00f4"+
		"\7g\2\2\u00f4\u00f5\7n\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7g\2\2\u00f7"+
		".\3\2\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7k\2\2\u00fb"+
		"\u00fc\7h\2\2\u00fc\60\3\2\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7q\2\2\u00ff"+
		"\u0100\7v\2\2\u0100\62\3\2\2\2\u0101\u0102\7c\2\2\u0102\u0103\7p\2\2\u0103"+
		"\u0104\7f\2\2\u0104\64\3\2\2\2\u0105\u0106\7q\2\2\u0106\u0107\7t\2\2\u0107"+
		"\66\3\2\2\2\u0108\u0109\7f\2\2\u0109\u010a\7g\2\2\u010a\u010b\7n\2\2\u010b"+
		"8\3\2\2\2\u010c\u010d\7v\2\2\u010d\u010e\7j\2\2\u010e\u010f\7k\2\2\u010f"+
		"\u0110\7u\2\2\u0110:\3\2\2\2\u0111\u0112\7h\2\2\u0112\u0113\7t\2\2\u0113"+
		"\u0114\7q\2\2\u0114\u0115\7o\2\2\u0115<\3\2\2\2\u0116\u0117\7k\2\2\u0117"+
		"\u0118\7o\2\2\u0118\u0119\7r\2\2\u0119\u011a\7q\2\2\u011a\u011b\7t\2\2"+
		"\u011b\u011c\7v\2\2\u011c>\3\2\2\2\u011d\u011e\7c\2\2\u011e\u011f\7u\2"+
		"\2\u011f@\3\2\2\2\u0120\u0121\7i\2\2\u0121\u0122\7n\2\2\u0122\u0123\7"+
		"q\2\2\u0123\u0124\7d\2\2\u0124\u0125\7c\2\2\u0125\u0126\7n\2\2\u0126B"+
		"\3\2\2\2\u0127\u0128\7k\2\2\u0128\u0129\7u\2\2\u0129D\3\2\2\2\u012a\u012b"+
		"\7P\2\2\u012b\u012c\7q\2\2\u012c\u012d\7p\2\2\u012d\u012e\7g\2\2\u012e"+
		"F\3\2\2\2\u012f\u0130\7V\2\2\u0130\u0131\7t\2\2\u0131\u0132\7w\2\2\u0132"+
		"\u0133\7g\2\2\u0133H\3\2\2\2\u0134\u0135\7H\2\2\u0135\u0136\7c\2\2\u0136"+
		"\u0137\7n\2\2\u0137\u0138\7u\2\2\u0138\u0139\7g\2\2\u0139J\3\2\2\2\u013a"+
		"\u013d\5U+\2\u013b\u013d\5M\'\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2"+
		"\2\u013dL\3\2\2\2\u013e\u0140\5\u00a3R\2\u013f\u013e\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0145\7\60\2\2\u0144\u0146\5\u00a3R\2\u0145\u0144\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149"+
		"\u014b\5\u00a5S\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014bN\3\2\2"+
		"\2\u014c\u0151\7)\2\2\u014d\u014e\t\4\2\2\u014e\u014f\4\64:\2\u014f\u0152"+
		"\t\5\2\2\u0150\u0152\t\6\2\2\u0151\u014d\3\2\2\2\u0151\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0154\7)\2\2\u0154P\3\2\2\2\u0155\u0156\5S*\2\u0156"+
		"R\3\2\2\2\u0157\u015b\t\7\2\2\u0158\u015a\t\b\2\2\u0159\u0158\3\2\2\2"+
		"\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015cT\3"+
		"\2\2\2\u015d\u015b\3\2\2\2\u015e\u0162\5W,\2\u015f\u0162\5Y-\2\u0160\u0162"+
		"\5[.\2\u0161\u015e\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162"+
		"V\3\2\2\2\u0163\u0167\5]/\2\u0164\u0166\5\u00a3R\2\u0165\u0164\3\2\2\2"+
		"\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016c"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016c\7\62\2\2\u016b\u0163\3\2\2\2"+
		"\u016b\u016a\3\2\2\2\u016cX\3\2\2\2\u016d\u016e\7\62\2\2\u016e\u0170\t"+
		"\t\2\2\u016f\u0171\5_\60\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u017b\3\2\2\2\u0174\u0176\7\62"+
		"\2\2\u0175\u0177\5_\60\2\u0176\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u016d\3\2"+
		"\2\2\u017a\u0174\3\2\2\2\u017bZ\3\2\2\2\u017c\u017d\7\62\2\2\u017d\u017f"+
		"\t\n\2\2\u017e\u0180\5a\61\2\u017f\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\\\3\2\2\2\u0183\u0184\t\13\2"+
		"\2\u0184^\3\2\2\2\u0185\u0186\t\f\2\2\u0186`\3\2\2\2\u0187\u0188\t\r\2"+
		"\2\u0188b\3\2\2\2\u0189\u018a\7-\2\2\u018a\u018b\7?\2\2\u018bd\3\2\2\2"+
		"\u018c\u018d\7/\2\2\u018d\u018e\7?\2\2\u018ef\3\2\2\2\u018f\u0190\7,\2"+
		"\2\u0190\u0191\7?\2\2\u0191h\3\2\2\2\u0192\u0193\7\61\2\2\u0193\u0194"+
		"\7?\2\2\u0194j\3\2\2\2\u0195\u0196\7\'\2\2\u0196\u0197\7?\2\2\u0197l\3"+
		"\2\2\2\u0198\u0199\7,\2\2\u0199\u019a\7,\2\2\u019an\3\2\2\2\u019b\u019c"+
		"\7,\2\2\u019cp\3\2\2\2\u019d\u019e\7\61\2\2\u019er\3\2\2\2\u019f\u01a0"+
		"\7-\2\2\u01a0t\3\2\2\2\u01a1\u01a2\7/\2\2\u01a2v\3\2\2\2\u01a3\u01a4\7"+
		"\'\2\2\u01a4x\3\2\2\2\u01a5\u01a6\7?\2\2\u01a6\u01a7\7?\2\2\u01a7z\3\2"+
		"\2\2\u01a8\u01a9\7#\2\2\u01a9\u01aa\7?\2\2\u01aa|\3\2\2\2\u01ab\u01ac"+
		"\7>\2\2\u01ac\u01ad\7?\2\2\u01ad~\3\2\2\2\u01ae\u01af\7@\2\2\u01af\u01b0"+
		"\7?\2\2\u01b0\u0080\3\2\2\2\u01b1\u01b2\7?\2\2\u01b2\u0082\3\2\2\2\u01b3"+
		"\u01b4\7>\2\2\u01b4\u0084\3\2\2\2\u01b5\u01b6\7@\2\2\u01b6\u0086\3\2\2"+
		"\2\u01b7\u01b8\7%\2\2\u01b8\u0088\3\2\2\2\u01b9\u01ba\7\u0080\2\2\u01ba"+
		"\u008a\3\2\2\2\u01bb\u01bc\7.\2\2\u01bc\u008c\3\2\2\2\u01bd\u01be\7=\2"+
		"\2\u01be\u008e\3\2\2\2\u01bf\u01c0\7$\2\2\u01c0\u01c1\5\u0091I\2\u01c1"+
		"\u01c2\7$\2\2\u01c2\u0090\3\2\2\2\u01c3\u01c6\5\u0093J\2\u01c4\u01c6\n"+
		"\16\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u0092\3\2\2\2\u01c9\u01c7\3\2"+
		"\2\2\u01ca\u01cb\7^\2\2\u01cb\u01cc\t\16\2\2\u01cc\u0094\3\2\2\2\u01cd"+
		"\u01d4\5\u009dO\2\u01ce\u01d4\5\u0099M\2\u01cf\u01d4\5\u009bN\2\u01d0"+
		"\u01d4\5\u00a1Q\2\u01d1\u01d4\5\u009fP\2\u01d2\u01d4\5\u0097L\2\u01d3"+
		"\u01cd\3\2\2\2\u01d3\u01ce\3\2\2\2\u01d3\u01cf\3\2\2\2\u01d3\u01d0\3\2"+
		"\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\u01d6\bK\2\2\u01d6\u0096\3\2\2\2\u01d7\u01d9\t\17\2\2\u01d8\u01d7\3\2"+
		"\2\2\u01d9\u01da\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db"+
		"\u0098\3\2\2\2\u01dc\u01dd\7\61\2\2\u01dd\u01de\7&\2\2\u01de\u01e2\3\2"+
		"\2\2\u01df\u01e1\13\2\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e2\3\2"+
		"\2\2\u01e5\u01e6\7&\2\2\u01e6\u01e7\7\61\2\2\u01e7\u009a\3\2\2\2\u01e8"+
		"\u01e9\7&\2\2\u01e9\u01ea\7&\2\2\u01ea\u01ee\3\2\2\2\u01eb\u01ed\n\17"+
		"\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\u009c\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f3\t\20"+
		"\2\2\u01f2\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u009e\3\2\2\2\u01f6\u01fa\7~\2\2\u01f7\u01f9\5\u009d"+
		"O\2\u01f8\u01f7\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa"+
		"\u01fb\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01ff\7."+
		"\2\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u00a0\3\2\2\2\u0200"+
		"\u0202\7^\2\2\u0201\u0203\5\u009dO\2\u0202\u0201\3\2\2\2\u0202\u0203\3"+
		"\2\2\2\u0203\u0209\3\2\2\2\u0204\u0206\7\17\2\2\u0205\u0204\3\2\2\2\u0205"+
		"\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u020a\7\f\2\2\u0208\u020a\7\17"+
		"\2\2\u0209\u0205\3\2\2\2\u0209\u0208\3\2\2\2\u020a\u00a2\3\2\2\2\u020b"+
		"\u020d\4\62;\2\u020c\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020c\3\2"+
		"\2\2\u020e\u020f\3\2\2\2\u020f\u00a4\3\2\2\2\u0210\u0212\t\2\2\2\u0211"+
		"\u0210\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214\3\2\2\2\u0213\u0215\5\u00a3"+
		"R\2\u0214\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0214\3\2\2\2\u0216"+
		"\u0217\3\2\2\2\u0217\u00a6\3\2\2\2 \2\u00c1\u013c\u0141\u0147\u014a\u0151"+
		"\u015b\u0161\u0167\u016b\u0172\u0178\u017a\u0181\u01c5\u01c7\u01d3\u01da"+
		"\u01e2\u01ee\u01f4\u01fa\u01fe\u0202\u0205\u0209\u020e\u0211\u0216\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}