/* program to print all numbers backwards from 100 to 0 i.e. 100 99 98 97 96 . . . 4 3 2 1 0 */
import java.util.*;
public class printnrev8
{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = 100;//intiallizing n is 1
		while(n>-1)//if n is positive loop executes
		{
		    System.out.println(n);//print numbers from 100 to 0
		    n--;//decrementing value of n
		}
	}
}
