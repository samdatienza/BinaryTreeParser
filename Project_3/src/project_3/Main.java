package project_3;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		// Scanner reads from user input string
		Scanner reader = new Scanner(System.in);
		
		while (reader.hasNext()) {
			// Will read from file and adding spaces of {expression} at the same time if need be
			String expression = AddSpaces.addSpaces(reader.nextLine());
		}
		
		// Closing {reader} and {inputFile}
		reader.close();
	}
}
