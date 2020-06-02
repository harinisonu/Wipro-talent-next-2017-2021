/*******************************************************************************
 
19)

Write a program to print first 5 values which are divisible by 2, 3, and 5.
Topics Covered: While Loop

 
 *******************************************************************************/
import java.util.*;
public class FlowControlSt19
{
	public static void main(String[] args) 
	{	
		int i=1;
		int n = 0;
		while(n<=5)
		{
			if(i%2==0 && i%3==0 && i%5==0)
			{
				System.out.println(i);
				n++;
			}
			i++;
			
		}
		
	}
}
