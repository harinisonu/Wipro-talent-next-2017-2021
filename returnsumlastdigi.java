/* return sum of last digit of given 2 no*/
package kexa;
import java.util.*;
public class returnsumlastdigi
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();//scan 2 numbers
		b = sc.nextInt();
		System.out.println(lastdigi(a,b));	//odd function called and printed	
	}
	private static int lastdigi(int a,int b) // odd function declaration
	{
		int lastdigi1,lastdigi2;
		if(a>0)
			lastdigi1 = a%10;//if given +ve a value 
		else
			lastdigi1 = (-a)%10;//if given -ve a value 
		if(b>0)
			lastdigi2 = b%10;//if given +ve b value 
		else
			lastdigi2 = (-b)%10;//if given -ve b value 
		return (lastdigi1+lastdigi2);//return sum of last digit (sum is positive)
	}

}
