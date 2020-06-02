
/*******************************************************************************
 
6)

Write a program to accept gender ("Male" or "Female") and age (1-120) from command line
arguments and print the percentage of interest based on the given conditions.
Interest == 8.2%
Gender ==> Female
Age ==>1 to 58
Interest == 7.6%
Gender ==> Female
Age ==>59 -120
Interest == 9.2%
Gender ==> Male
Age ==>1-60
Interest == 8.3%
Gender ==> Male
Age ==>61-120
Topics Covered: If Statement
 
 *******************************************************************************/

public class FlowControlSt6
{
	public static void main(String[] args) 
	{		
		double Interest = 0;
		String f = "female"; //initializing strings to compare
		String m = "male";
		if(args[0].equalsIgnoreCase(f)) // comparing command line argument with string f ignoring uppercase and lowercase 
		{
			System.out.println("Female");
			if(Integer.parseInt(args[1]) > 0 && Integer.parseInt(args[1]) <= 58)
				{
					System.out.println(args[1]);				
					Interest = 8.2;
				}
			else if(Integer.parseInt(args[1]) > 58 && Integer.parseInt(args[1]) <= 120)
				{
					System.out.println(args[1]);
					Interest = 7.6;
				}
		}
		if(args[0].equalsIgnoreCase(m)) // comparing command line argument with string m ignoring uppercase and lowercase
		{
			System.out.println("Male");
			if(Integer.parseInt(args[1]) > 0 && Integer.parseInt(args[1]) <= 60)
				{
				System.out.println(args[1]);
					Interest = 8.2;
				}
			else if(Integer.parseInt(args[1]) > 60 && Integer.parseInt(args[1]) <= 120)
				{
					System.out.println(args[1]);
					Interest = 7.6;
				}
		}
		System.out.print("Percentage Of Interest "+Interest+"%");
	}
}
