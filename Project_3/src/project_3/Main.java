package project_3;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		// Scanner reads from user input string
		Scanner reader = new Scanner(System.in);
		
		while (reader.hasNext()) {
			// Will read from user input and add spaces to {expression} at the same time if need be
			String expression = AddSpaces.addSpaces(reader.nextLine());
		}
		
		// Closing {reader}
		reader.close();
	}
}
