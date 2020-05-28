package kexa;
import java.util.*;
public class Even 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		System.out.println(Even(n));		
	}
	private static int Even(int n) 
	{
		if(n%2==0)
		{
			return 2;
		}
		else
			return 0;
		
	}

}
