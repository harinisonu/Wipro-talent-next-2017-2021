
/*******************************************************************************
 
 
5)

Initialize a character variable in a program and if the value is alphabet then print "Alphabet" if it’s
a number then print "Digit" and for other characters print "Special Character"
If Statement

 
 *******************************************************************************/

public class FlowControlSt5
{
	public static void main(String[] args) 
	{		
		/******************
		 for Character
		******************/
		char a = 'a';
		//char b = '7';
		if(Character.isDigit(a))
			System.out.println("Digit");
		else if(Character.isLetter(a))
			System.out.println("Alphabet");
		else
			System.out.println("Special Character");
		/******************
		 for a String
		******************/
		/*String str = "Hello 123&*!!";
		for (int i = 0; i < str.length(); ++i) 
		{
		   char ch = str.charAt(i);
		   if(Character.isDigit(ch))
			   System.out.println("Digit");
		   else if(Character.isLetter(ch))
			   System.out.println("Alphabet");
		   else
			   System.out.println("Special Character");
		}*/
	}
}
