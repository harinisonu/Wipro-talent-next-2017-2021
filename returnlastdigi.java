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
		int a;
		if(n>0)//n is +ve
			a = n%10;  // modulus gives reminder which is the last digit
		else
			a=(-n)%10;
		return a;	// returns 2nd last digit of a no (a is positive)		
	}

}
