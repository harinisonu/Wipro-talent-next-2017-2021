/*******************************************************************************
 
13)

Write a program to print prime numbers between 10 and 99.
Topics Covered: For Loop
 
 *******************************************************************************/

public class FlowControlSt13
{
	public static void main(String[] args) 
	{			
		for(int i = 10; i < 100; i++)//looping n times
		{
			int flag=0;
			for(int j = i; j > 0 ; j--)
			{
				if(i%j == 0)
					flag++; 
					
			}
			if(flag == 2)
				System.out.println(i);// Number is prime btw 10-99
		}		
	}
}
