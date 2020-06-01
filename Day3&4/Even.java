/* write a func to find whether given input no is even */
import java.util.*;
public class Even //creating class named even
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		System.out.println(Even(n));	//even function calling	
	}
	private static int Even(int n) //even function declaration which returns int type
	{
		if(n%2==0) // check if n is even 
		{
			return 2;  //return 2 if n is even
		}
		else
			return 1;  //return 1 if n is odd
		
	}

}
