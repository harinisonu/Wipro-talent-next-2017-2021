/* Write a Program to accept two integers through the command line argument and print the sum of
the two numbers */

import java.util.*;
public class CommandLineArgPro3
{
	public static void main(String[] args) 
	{
		int sum=0;
		sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
	    System.out.println(" The Sum Of  "+Integer.parseInt(args[0])+" and "+Integer.parseInt(args[1])+" is "+ sum);  
		
	}

}
