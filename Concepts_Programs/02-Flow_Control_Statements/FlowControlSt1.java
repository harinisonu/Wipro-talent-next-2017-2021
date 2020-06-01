/******

Write a program to check if a given number is Positive, Negative, or Zero.

******/

import java.util.*;
public class FlowControlSt1
{
	public static void main(String[] args) {
	    Scanner s =  new Scanner(System.in);
	    int n = s.nextInt();
	    //getting input from user
	    if(n == 0)//checking n is zero
	    {
	        System.out.println("zero");//printing zero
	    }
	    else//if n is non zero
	    {
	        if(n>0)//if n is positive (+)
	            System.out.println("positive");
	        else//n is (-)
	            System.out.println("negative");
	    }
	}
}
