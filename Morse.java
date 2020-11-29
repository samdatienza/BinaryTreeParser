package sem2project3;

import java.io.IOException;
import java.util.Scanner;

public class Morse {
	
	public static void main(String[] args) throws IOException {
		
		//Create scanner to get string to convert to Morse Code
		Scanner scanner = new Scanner(System.in);
		
		//Get user input string for conversion
		System.out.println("Please enter word(s) to be converted to Morse Code: ");
		
		String text = scanner.nextLine();
		
		//Iterate through each character and convert to Morse equivalent
		for (int i = 0; i < text.length(); i++) {
			//I'm thinking we can write a Morse code conversion method then call it here and print result to console all in this loop
		}
		
		
		scanner.close();
	}

}
