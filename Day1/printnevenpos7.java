/* program to print alternate numbers starting from 0 to 100 i.e. 0 2 4 6 8 10 12 . . . 96 98 100 */
import java.util.*;
public class printnevenpos7
{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = 0;//intiallizing n is 0
		while(n<=100)//looping 100 times
		{
		    System.out.println(n);//print numbers from 0 to 100
		    n+=2;//incrementing value of n by 2
		}
	}
}
