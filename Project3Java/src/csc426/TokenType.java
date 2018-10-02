package csc426;

/**
 * Enumeration of the different kinds of tokens in the YASL subset.
 * 
 * @author bhoward
 * @student ShutoAraki
 */
public enum TokenType {
	NUM, // numeric literal
	SEMI, // semicolon (;)
	PERIOD, // period (.)
	ASSIGN, // assign operator (=)
	PLUS, // plus operator (+)
	MINUS, // minus operator (-)
	STAR, // times operator (*)
	DIV, // division operator (div)
	MOD, // mod operator (mod)
	PROGRAM, // program keyword
	VAL, // val keyword
	BEGIN, // begin keyword
	END, // end keyword
	PRINT, // print keyword
	VAR, // variable
	INT, // integer
	BOOL, // boolean
	VOID, 
	FUN, // function keyword
	IF, // if
	THEN, // then
	ELSE, // else
	WHILE, // while
	DO, // do
	INPUT, // input
	AND, // and
	OR, // or
	NOT, // not
	TRUE, // true
	FALSE, // false
	COLON, // :
	LPAREN, // (
	RPAREN, // )
	COMMA, //,
	LET, // let keyword
	ID, // identifier
	EOF // end-of-file
}
