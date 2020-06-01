/* Java Program to accept 25 integer elements for an array then find the maximum number in the set and display it */

import java.util.*;
public class MaxNoArray1
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		int[] array = new int[25]; // initializing array of size 25
		for(int i=0;i<25;i++)
		{
		    array[i] = sc.nextInt();// getting 25 integers in array
		}
		for(int i=1;i<25;++i)
		{
		    if(array[i]>array[0]) // array[0] is smaller
		    {
		        array[0] = array[i]; // the bigger no will be assigned to 0th position
		    }
		}
		System.out.println(array[0]);// returning 0th pos will return maximum no
	}
}
