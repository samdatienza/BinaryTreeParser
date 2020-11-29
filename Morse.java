package sem2project3;

import java.io.IOException;
import java.util.Scanner;

public class Morse {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		//Get user input string for conversion
		System.out.println("Please enter word(s) to be converted to Morse Code: ");
		
		String text = scanner.nextLine();
		
		for (int i = 0; i < text.length(); i++) {
			//Morse code conversion method
		}
		
		
		scanner.close();
	}

}
