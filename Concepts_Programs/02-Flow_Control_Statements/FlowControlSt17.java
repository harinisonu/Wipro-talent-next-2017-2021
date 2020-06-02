/*******************************************************************************
 
17)

Write a program to reverse a given number and print
Eg1)
I/P: 1234
O/P:4321
Eg2)
I/P:1004
O/P:4001
Topics Covered: While Loop
 
 *******************************************************************************/
import java.util.*;
public class FlowControlSt17
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");//Enter a number 
		int n = sc.nextInt();
		int sum=0,a=0;
		while(n>0)
		{
			a=n%10;
			sum = (sum*10)+a;
			n=n/10;
		}
		System.out.println("Reverse of given number ");
		System.out.print(sum);
	}
}
