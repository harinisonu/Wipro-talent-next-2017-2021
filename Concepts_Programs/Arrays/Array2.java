/*******************************************************************************
 
2)
Write a program to initialize an integer array and find the maximum and minimum value of an
array.
Topics Covered: One dimensional Array

 
 *******************************************************************************/
import java.util.*;
public class Array2
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
		/*******************
		 * Method 1
		 */
		
		System.out.println("Method One :");
		int max = Arrays.stream(a).max().getAsInt(); 
		int min = Arrays.stream(a).min().getAsInt(); 
		System.out.println("Maximum = "+max);
		System.out.println("Minimum = "+min);
		
		/*******************
		 * Method 2
		 */
		
		System.out.println("Method Two :");
		max=a[0];
		min=a[0];
		for(int i=1;i<n;i++)
		{			
			if(max<a[i])
			{
				max = a[i];
			}
			if(min>a[i])
			{
				min = a[i];
			}
		}
		System.out.println("Maximum = "+max);
		System.out.println("Minimum = "+min);
	}
}
