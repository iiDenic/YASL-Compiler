package csc426;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;

/**
 * Main class for Project 1 -- Scanner for a Subset of YASL (Fall 2015). Scans
 * tokens from standard input and prints the token stream to standard output.
 * 
 * @author bhoward
 */
public class Project1 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
 		Token token;
		do {
			//Scan for the next token. Token type is handled below
			token = scanner.next();
			System.out.println(token);
		} while (token.type != TokenType.EOF);
		//When the end of file token is found, end the scanner
 		scanner.close();
	}
}
