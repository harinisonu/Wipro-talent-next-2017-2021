/*******************************************************************************
 
15)

Write a program to add all the values in a given number and print. Ex: 1234->10
Topics Covered: For Loop
 
 *******************************************************************************/
import java.util.*;
public class FlowControlSt15
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Please enter an integer number");//Enter a number 
		int n = sc.nextInt();
		for(int i=n;i>0;)	
		{
			sum = sum + (i%10);
			i=i/10;
		}
		System.out.print(sum);
	}
}
