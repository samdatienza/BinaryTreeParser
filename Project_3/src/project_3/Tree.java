package project_3;

public class Tree {
	private treeNode root;
	private String postfix = "";
	
	public Tree() { root = null; }
	
	public void insert(String expression) {
		Conversion c = new Conversion(expression);
		expression = c.infixToPostfix();
		StackN stk = new StackN(expression.length());
		expression += "#";
		int i = 0;
		char symbol = expression.charAt(i);
		treeNode newNode;
		while (symbol != '#') {
			if (symbol >= '0' && symbol <= '9') {
				newNode = new treeNode(symbol);
				stk.push(newNode);
			}
			else if (symbol == '+' || symbol == '-' || symbol == '/' || symbol == '*') {
				treeNode ptr1 = stk.pop();
				treeNode ptr2 = stk.pop();
				newNode = new treeNode(symbol);
				newNode.nodeLeft = ptr2;
				newNode.nodeRight = ptr1;
				stk.push(newNode);
			}
			symbol = expression.charAt(++i);
		}
		root = stk.pop();
	}
	
	public String traverse() {
		postOrder(root);
		return postfix;
	}
	
	private void postOrder(treeNode localRoot) {
		if (localRoot != null) {
			postOrder(localRoot.nodeLeft);
			postOrder(localRoot.nodeRight);
			postfix += localRoot.data;
			postfix += " ";
		}
	}
	
	public String getExpression() { return postfix; }
}
