package project_3;

public class Conversion {
	// Used to convert infix to postfix
	
	private StackC c;
	private String input;
	private String output = "";
	
	public Conversion(String str) {
		input = str;
		c = new StackC(str.length());
	}

	public String infixToPostfix() {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			switch(ch) {
			case '+':
			case '-': 
				gotOperator(ch, 1);
				break;
			case '*':
			case '/':
				gotOperator(ch, 2);
				break;
			case '(':
				c.push(ch);
				break;
			case ')':
				gotParenthesis();
				break;
			default:
				output += ch;
			}
		}
		while (!c.isEmpty()) { output += c.pop(); }
		return output;
	}
	
	private void gotOperator(char opThis, int prec1) {
		while (!c.isEmpty()) {
			char opTop = c.pop();
			if (opTop == '(') {
				c.push(opTop);
				break;
			}
			else {
				int prec2;
				if (opTop == '+' || opTop == '-') { prec2 = 1; }
				else { prec2 = 2; }
				if (prec2 < prec1) {
					c.push(opTop);
					break;
				}
				else { output += opTop; }
			}
		}
		c.push(opThis);
	}
	
	private void gotParenthesis() {
		while (!c.isEmpty()) {
			char ch = c.pop();
			if (ch == '(') { break; }
			else { output += ch; }
		}
	}
}
