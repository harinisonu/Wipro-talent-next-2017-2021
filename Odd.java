package kexa;
import java.util.*;
public class Odd 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		System.out.println(Odd(n));	//odd function called and printed	
	}
	private static int Odd(int n) // odd function declaration
	{
		if(n%2==0)
		{
			return 1;  // if n is even returns 1
		}
		else
			return 2; // if n is odd return 2
		
	}

}
