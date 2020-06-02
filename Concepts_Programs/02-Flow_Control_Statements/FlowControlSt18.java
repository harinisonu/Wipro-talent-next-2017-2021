/*******************************************************************************
 
18)

Write a Java program to find if the given number is palindrome or not
Example1:
C:\>java Sample 110011
O/P Expected : 110011 is a palindrome
Example2:
C:\>java Sample 1234
O/P Expected : 1234 is not a palindrome
Topics Covered: While Loop

 
 *******************************************************************************/
import java.util.*;
public class FlowControlSt18
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");//Enter a number 
		int n = sc.nextInt();
		int org = n;
		int rev=0,a=0;
		while(n>0)
		{
			a=n%10;
			rev = (rev*10)+a;
			n=n/10;
		}
		if(org == rev)
			System.out.println(org+" is a palindrome");
		else
			System.out.println(org+" is not a palindrome");
	}
}
