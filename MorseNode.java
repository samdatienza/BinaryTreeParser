package sem2project3;

public class MorseNode {
	
	public char letter;
	
	public MorseNode leftMorse, rightMorse;
	
	public MorseNode(char theLetter)
	{letter = theLetter; }
	
	public MorseNode(char theLetter, MorseNode left, MorseNode right) 
	{letter = theLetter;
	leftMorse = left;
	rightMorse = right;
	}

}
