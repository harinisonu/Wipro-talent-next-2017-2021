/* program to accept two numbers and print whether their sum is EVEN or ODD */
import java.util.*;
public class sumevenodd4
{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();//getting input from user
		int b = sc.nextInt();//getting input from user
		int n = a+b;
		if(n%2 == 0)//if n is even
		{
		    System.out.println("EVEN");//print even
		}
		else
		    System.out.println("ODD");//if n is odd print odd
	}
}