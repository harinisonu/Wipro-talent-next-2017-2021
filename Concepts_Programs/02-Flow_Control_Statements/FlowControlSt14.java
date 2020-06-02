/*******************************************************************************
 
14)

Write a Java program to find if the given number is prime or not.
Example1:
C:\>java Sample
O/P Expected : Please enter an integer number
Example2:
C:\>java Sample 1
O/P Expected : 1 is neither prime nor composite
Example3:
C:\>java Sample 0
O/P Expected : 0 is neither prime nor composite
Example4:
C:\>java Sample 10
O/P Expected : 10 is not a prime number
Example5:
C:\>java Sample 7
O/P Expected : 7 is a prime number
Topics Covered: For Loop

 
 *******************************************************************************/
import java.util.*;
public class FlowControlSt14
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int flag=0;
		System.out.println("Please enter an integer number");//Enter a number 
		int n = sc.nextInt();
		if(n == 0)
			System.out.println("0 is neither prime nor composite"); 
		else if(n==1)
			System.out.println("1 is neither prime nor composite"); 
		else
		{
			for(int i = 2; i < n; i++)//looping n times
			{
				if(n%i == 0)
					flag++;
			}		
			if(flag == 0)
				System.out.println(n+" is a prime number");// Number is prime 
			else
				System.out.println(n+" is not a prime number");// Number is not prime 
		}		
	}
}
