/*******************************************************************************
 
1)

Write a program to initialize an integer array and print the sum and average of the array.
Topics Covered: One dimensional Array
 
 *******************************************************************************/
import java.util.*;
public class Array1
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter Size Of An Array");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter Numbers of Array");
		for(int i=0;i<n;i++)
		{			
			int k = sc.nextInt();
			a[i] = k;
		}
		for(int i=0;i<n;i++)
		{	
			System.out.println(a[i]);
			sum = sum +a[i];
		}
		System.out.println(sum);
	}
}
