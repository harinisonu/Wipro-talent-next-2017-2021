/* program to print all numbers from 1 to 100 i.e. 1 2 3 4 5 6 7 . . . 98 99 100 */
import java.util.*;
public class printntimes
{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = 1;//intiallizing n is 1
		while(n<=100)//looping 100 times
		{
		    System.out.println(n);//print numbers from 1 tp 100
		    n++;//incrementing value of n
		}
	}
}