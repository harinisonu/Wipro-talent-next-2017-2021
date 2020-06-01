/* program to print alternate numbers starting from 1 to 99 i.e. 1 3 5 7 9 11 13 . . . 95 97 99 */
import java.util.*;
public class printninctwo6
{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = 1;//intiallizing n is 1
		while(n<=100)//looping 100 times
		{
		    System.out.println(n);//print numbers from 1 t0 99
		    n+=2;//incrementing value of n by 2
		}
	}
}