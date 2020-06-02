/*******************************************************************************
 
12)

Write a program to check if a given number is prime or not
Topics Covered: For Loop
 
 *******************************************************************************/

import java.util.*;
public class FlowControlSt12
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int flag=0;
		int n = sc.nextInt();
		for(int i = 2; i < n; i++)//looping n times
		{
			if(n%i == 0)
				flag++;
		}		
		if(flag == 0)
			System.out.println(n+" The Given Number Is A Prime Number");// Number is prime 
		else
			System.out.println(n+" The Given Number Is Not A Prime Number");// Number is not prime 
	}
}
