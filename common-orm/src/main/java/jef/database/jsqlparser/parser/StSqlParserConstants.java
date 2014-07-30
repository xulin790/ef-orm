/* Generated By:JavaCC: Do not edit this line. StSqlParserConstants.java */
package jef.database.jsqlparser.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface StSqlParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int K_AS = 5;
  /** RegularExpression Id. */
  int K_BY = 6;
  /** RegularExpression Id. */
  int K_DO = 7;
  /** RegularExpression Id. */
  int K_IS = 8;
  /** RegularExpression Id. */
  int K_IN = 9;
  /** RegularExpression Id. */
  int K_OR = 10;
  /** RegularExpression Id. */
  int K_ON = 11;
  /** RegularExpression Id. */
  int K_ALL = 12;
  /** RegularExpression Id. */
  int K_AND = 13;
  /** RegularExpression Id. */
  int K_ANY = 14;
  /** RegularExpression Id. */
  int K_NOT = 15;
  /** RegularExpression Id. */
  int K_SET = 16;
  /** RegularExpression Id. */
  int K_ASC = 17;
  /** RegularExpression Id. */
  int K_TOP = 18;
  /** RegularExpression Id. */
  int K_END = 19;
  /** RegularExpression Id. */
  int K_DESC = 20;
  /** RegularExpression Id. */
  int K_INTO = 21;
  /** RegularExpression Id. */
  int K_NULL = 22;
  /** RegularExpression Id. */
  int K_LIKE = 23;
  /** RegularExpression Id. */
  int K_DROP = 24;
  /** RegularExpression Id. */
  int K_JOIN = 25;
  /** RegularExpression Id. */
  int K_LEFT = 26;
  /** RegularExpression Id. */
  int K_FROM = 27;
  /** RegularExpression Id. */
  int K_OPEN = 28;
  /** RegularExpression Id. */
  int K_CASE = 29;
  /** RegularExpression Id. */
  int K_WHEN = 30;
  /** RegularExpression Id. */
  int K_THEN = 31;
  /** RegularExpression Id. */
  int K_ELSE = 32;
  /** RegularExpression Id. */
  int K_SOME = 33;
  /** RegularExpression Id. */
  int K_FULL = 34;
  /** RegularExpression Id. */
  int K_WITH = 35;
  /** RegularExpression Id. */
  int K_TABLE = 36;
  /** RegularExpression Id. */
  int K_WHERE = 37;
  /** RegularExpression Id. */
  int K_USING = 38;
  /** RegularExpression Id. */
  int K_UNION = 39;
  /** RegularExpression Id. */
  int K_GROUP = 40;
  /** RegularExpression Id. */
  int K_BEGIN = 41;
  /** RegularExpression Id. */
  int K_INDEX = 42;
  /** RegularExpression Id. */
  int K_INNER = 43;
  /** RegularExpression Id. */
  int K_LIMIT = 44;
  /** RegularExpression Id. */
  int K_OUTER = 45;
  /** RegularExpression Id. */
  int K_ORDER = 46;
  /** RegularExpression Id. */
  int K_RIGHT = 47;
  /** RegularExpression Id. */
  int K_DELETE = 48;
  /** RegularExpression Id. */
  int K_CREATE = 49;
  /** RegularExpression Id. */
  int K_SELECT = 50;
  /** RegularExpression Id. */
  int K_OFFSET = 51;
  /** RegularExpression Id. */
  int K_EXISTS = 52;
  /** RegularExpression Id. */
  int K_HAVING = 53;
  /** RegularExpression Id. */
  int K_INSERT = 54;
  /** RegularExpression Id. */
  int K_UPDATE = 55;
  /** RegularExpression Id. */
  int K_VALUES = 56;
  /** RegularExpression Id. */
  int K_ESCAPE = 57;
  /** RegularExpression Id. */
  int K_PRIMARY = 58;
  /** RegularExpression Id. */
  int K_NATURAL = 59;
  /** RegularExpression Id. */
  int K_REPLACE = 60;
  /** RegularExpression Id. */
  int K_BETWEEN = 61;
  /** RegularExpression Id. */
  int K_TRUNCATE = 62;
  /** RegularExpression Id. */
  int K_DISTINCT = 63;
  /** RegularExpression Id. */
  int K_INTERSECT = 64;
  /** RegularExpression Id. */
  int K_CONNECT = 65;
  /** RegularExpression Id. */
  int K_PRIOR = 66;
  /** RegularExpression Id. */
  int K_START = 67;
  /** RegularExpression Id. */
  int K_INTERVAL = 68;
  /** RegularExpression Id. */
  int S_DOUBLE = 69;
  /** RegularExpression Id. */
  int S_INTEGER = 70;
  /** RegularExpression Id. */
  int DIGIT = 71;
  /** RegularExpression Id. */
  int LINE_COMMENT = 72;
  /** RegularExpression Id. */
  int MULTI_LINE_COMMENT = 73;
  /** RegularExpression Id. */
  int S_IDENTIFIER = 74;
  /** RegularExpression Id. */
  int LETTER = 75;
  /** RegularExpression Id. */
  int SPECIAL_CHARS = 76;
  /** RegularExpression Id. */
  int S_CHAR_LITERAL = 77;
  /** RegularExpression Id. */
  int S_QUOTED_IDENTIFIER = 78;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\r\"",
    "\"\\n\"",
    "\"AS\"",
    "\"BY\"",
    "\"DO\"",
    "\"IS\"",
    "\"IN\"",
    "\"OR\"",
    "\"ON\"",
    "\"ALL\"",
    "\"AND\"",
    "\"ANY\"",
    "\"NOT\"",
    "\"SET\"",
    "\"ASC\"",
    "\"TOP\"",
    "\"END\"",
    "\"DESC\"",
    "\"INTO\"",
    "\"NULL\"",
    "\"LIKE\"",
    "\"DROP\"",
    "\"JOIN\"",
    "\"LEFT\"",
    "\"FROM\"",
    "\"OPEN\"",
    "\"CASE\"",
    "\"WHEN\"",
    "\"THEN\"",
    "\"ELSE\"",
    "\"SOME\"",
    "\"FULL\"",
    "\"WITH\"",
    "\"TABLE\"",
    "\"WHERE\"",
    "\"USING\"",
    "\"UNION\"",
    "\"GROUP\"",
    "\"BEGIN\"",
    "\"INDEX\"",
    "\"INNER\"",
    "\"LIMIT\"",
    "\"OUTER\"",
    "\"ORDER\"",
    "\"RIGHT\"",
    "\"DELETE\"",
    "\"CREATE\"",
    "\"SELECT\"",
    "\"OFFSET\"",
    "\"EXISTS\"",
    "\"HAVING\"",
    "\"INSERT\"",
    "\"UPDATE\"",
    "\"VALUES\"",
    "\"ESCAPE\"",
    "<K_PRIMARY>",
    "\"NATURAL\"",
    "\"REPLACE\"",
    "\"BETWEEN\"",
    "\"TRUNCATE\"",
    "\"DISTINCT\"",
    "\"INTERSECT\"",
    "\"CONNECT\"",
    "\"PRIOR\"",
    "\"START\"",
    "\"INTERVAL\"",
    "<S_DOUBLE>",
    "<S_INTEGER>",
    "<DIGIT>",
    "<LINE_COMMENT>",
    "<MULTI_LINE_COMMENT>",
    "<S_IDENTIFIER>",
    "<LETTER>",
    "<SPECIAL_CHARS>",
    "<S_CHAR_LITERAL>",
    "<S_QUOTED_IDENTIFIER>",
    "\";\"",
    "\"=\"",
    "\",\"",
    "\"(\"",
    "\")\"",
    "\".\"",
    "\"@\"",
    "\"*\"",
    "\"?\"",
    "\">\"",
    "\"<\"",
    "\">=\"",
    "\"<=\"",
    "\"<>\"",
    "\"!=\"",
    "\"@@\"",
    "\"||\"",
    "\"|\"",
    "\"&\"",
    "\"+\"",
    "\"-\"",
    "\"/\"",
    "\"%\"",
    "\"^\"",
    "\"{d\"",
    "\"}\"",
    "\"{t\"",
    "\"{ts\"",
    "\"{fn\"",
  };

}