/* return 2nd last digit of given no*/
package kexa;
import java.util.*;
public class returnseclastdigi
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(lastdigi(a,b));	//odd function called and printed	
	}
	private static int lastdigi(int a,int b) // odd function declaration
	{
		int lastdigi1,lastdigi2;
		if(a>0)
			lastdigi1 = a%10;
		else
			lastdigi1 = (-a)%10;
		if(b>0)
			lastdigi2 = b%10;
		else
			lastdigi2 = (-b)%10;
		return (lastdigi1+lastdigi2);
	}

}
