/*******************************************************************************
 
16)

Write a program to print * in Floyds format (using for and while loop)
*
* *
* * *
Example1:
C:\>java Sample
O/P Expected : Please enter an integer number
Example1:
C:\>java Sample 3
O/P Expected :
*
* *
* * *
Topics Covered: For Loop
 
 *******************************************************************************/
import java.util.*;
public class FlowControlSt16
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer number");//Enter a number 
		int n = sc.nextInt();
		int i=0;
		System.out.println("Using While Loop");
		while(i<n)
		{
			int j=0;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println("");
			i++;
		}
		System.out.println("Using For Loop");
		for(int k=0;k<n;k++)
		{
			for(int l=0;l<=k;l++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
