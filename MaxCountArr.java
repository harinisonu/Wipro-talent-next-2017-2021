/* Design an algorithm to accept 10 integer elements for an array and then find the number of times the number with the maximum value occurs in the array.  */

import java.util.*;
public class MaxCountArr
{
	public static void main(String[] args) 
	{
	    int count =0;
	    Scanner sc = new Scanner(System.in);
		int[] array = new int[10]; // initializing array of size 25
		for(int i=0;i<10;i++)
		{
		    array[i] = sc.nextInt();// getting 25 integers in array
		}
		int maxno = array[0];
		for(int i=1;i<10;++i)
		{
		    if(array[i]>maxno) // array[0] is smaller
		    {
		        maxno = array[i]; // the bigger no will be assigned to 0th position
		    }
		}
		int i=0;
		while(i<10)
		{
		    if(maxno == array[i])
		        count++;
		    i++;
		}
		System.out.println(count);// returning 0th pos will return maximum no
	}
}
