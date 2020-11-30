package sem2project3;

public class treeNode {
	
	public char data;			//Data held in each node (will be either operator or operand)
	
	public treeNode nodeLeft, nodeRight;				//Nodes to left and right
	
	public treeNode(char theData)
	{data = theData; }
	
	public treeNode(char theData, treeNode left, treeNode right) 
	{data = theData;		
	nodeLeft = left;			//Node to left
	nodeRight = right;			//Node to right
	}

}
