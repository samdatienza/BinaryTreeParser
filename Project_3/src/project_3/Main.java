package project_3;

import java.io.FileInputStream;
import java.util.Scanner;


/*
	//Build tree method
	public static treeNode buildTree(String expression) {
		
		//Turn expression into array of operands/operators
		String[] newExp = expression.split(" ");
		
		int len = newExp.length;
		
		
		//Empty stack to push nodes of tree to
		Stack<treeNode> nodeStack = new Stack<treeNode>();
		
		for (int i = 0; i < len; i++) {
			if( reader.next() == "^" ||
				reader.next() == "*" ||
				reader.next() == "/" ||
				reader.next() == "%" ||
				reader.next() == "+" ||
				reader.next() == "-" ||
				reader.next() == ">" ||
				reader.next() == ">=" ||
				reader.next() == "<" ||
				reader.next() == "<=" ||
				reader.next() == "==" ||
				reader.next() == "!=" ||
				reader.next() == "&&" ||
				reader.next() == "||" ) {
				//Create new treenode containing operator
				
				//New treeNode^.nodeRight = nodeStack.pop();
				//New treeNode^.nodeLeft = nodeStack.pop();
				
				//nodeStack.push(new treeNode^)
			}
			else {					//If not operator, must be operand
				//Create new treeNode containing operand
				//nodeStack.push(new  treeNode^);
			}
				
		}
		
		
	}
	*/
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
