package project_3;

public class StackC {
	// Stack to contain characters
	
	private char[] a;
	private int top, m;
	
	public StackC(int max) {
		m = max;
		a = new char[m];
		top = -1;
	}
	
	public void push(char key) { a[++top] = key; }
	public char pop() { return a[top--]; }
	public boolean isEmpty() { return (top == -1); }
}
