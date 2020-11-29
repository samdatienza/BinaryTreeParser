package sem2project3;

public class MorseNode {
	
	public char letter;			//Letter held in node
	
	public MorseNode leftMorse, rightMorse;				//Nodes to left and right
	
	public MorseNode(char theLetter)
	{letter = theLetter; }
	
	public MorseNode(char theLetter, MorseNode left, MorseNode right) 
	{letter = theLetter;		//Letter held in node
	leftMorse = left;			//MorseNode to left
	rightMorse = right;			//MorseNode to right
	}

}
