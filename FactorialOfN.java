/* Design an algorithm to calculate the factorial of a number N. The value of N is provided as an input by the user. */

import java.util.*;
public class FactorialOfN
{
	public static void main(String[] args) 
	{
	    int  fact = 1;
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // initializing array of size 25
		for(int i=1;i<=n;i++)
		{
		    fact = fact * i;
		}
		System.out.println(fact);// returning 0th pos will return maximum no
	}
}
