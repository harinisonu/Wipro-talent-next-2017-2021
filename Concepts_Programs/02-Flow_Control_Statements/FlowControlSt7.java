
/*******************************************************************************
 
7)

Write a program to convert from upper case to lower case and vice versa of an alphabet and print
the old character and new character as shown in example (Ex: a->A, M->m).
 
 *******************************************************************************/

public class FlowControlSt7
{
	public static void main(String[] args) 
	{		
		String name = "hello";
		System.out.println(name.toUpperCase()); // to convert Lowercase "String" to Uppercase "String"
		char alpha = 'a';
		System.out.println(Character.toUpperCase(alpha)); // to convert Lowercase "Character" to Uppercase "Character"
	}
}
