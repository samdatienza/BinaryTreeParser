package project_3;

public class StackN {
	// Stack for nodes
	
	private treeNode[] a;
	private int top, m;
	
	public StackN(int max) {
		m = max;
		a = new treeNode[m];
		top = -1;
	}

	public void push(treeNode key) { a[++top] = key; }
	public treeNode pop() { return (a[top--]); }
	public boolean isEmpty() { return (top == -1); }
}
