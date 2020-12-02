package project_3;

import java.util.*;

// Using https://www.sanfoundry.com/java-program-construct-expression-tree-infix-expression/ for help


public class Main {
	public static void main(String[] args) throws Exception {
		// Scanner reads from user input string
		Scanner reader = new Scanner(System.in);
		boolean cont = true;
		char input;
		
		while (cont) {
			Tree t1 = new Tree();
			// Will read from user input and add spaces to {expression} at the same time if need be
			System.out.print("Enter an infix expression -> ");
			String expression = reader.nextLine();
			System.out.println(expression);
			t1.insert(expression);
			expression = t1.traverse();
			System.out.println(expression);
			PostfixEvaluation.postfixEval(expression);
			System.out.print("If you wish to stop type \"n\". -> ");
			input = reader.nextLine().charAt(0);
			if (input == 'n') { cont = false; }
		}
		
		// Closing {reader}
		reader.close();
	}
}
