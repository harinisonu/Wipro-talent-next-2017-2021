/******************************************

Write a program to check if a given number is odd or even.

******************************************/
import java.util.*;
public class FlowControlSt2
{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();//getting input from user
		if(n%2 == 0)//if n is even
		{
		    System.out.println("EVEN");//print even
		}
		else
		    System.out.println("ODD");//if n is odd print odd
	}
}
