/* return last digit of given no*/
import java.util.*;
public class returnlastdigi
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
		int a = n%10;  // modulus gives reminder which is the last digit
		return a;	// returns last digit of a no
	}

}
