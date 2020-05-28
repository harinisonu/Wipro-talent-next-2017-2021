package kexa;
/* return 2nd last digit of given no*/
import java.util.*;
public class returnseclastdigi
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		System.out.println(lastdigi(n));	//odd function called and printed	
	}
	private static int lastdigi(int n) // odd function declaration
	{
		n=n/10;//eliminates last digit 
		int a = n%10;  // modulus gives reminder which is the last digit
		return a;	// returns 2nd last digit of a no
	}

}