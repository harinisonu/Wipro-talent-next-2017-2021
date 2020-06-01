/* Write a program to print numbers backwards from 100 to 1 by skipping 2 numbers i.e. 100 97 94 91 88 85 82 79. . . 22 19 16 13 10 7 4 1 */
import java.util.*;
public class printnrevskiptwo9
{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = 100;//intiallizing n is 1
		while(n>-1)//if n is positive loop executes
		{
		    System.out.println(n);//print numbers from 100 to 1 by skipping 2 nos
		    n -= 3;//decrementing value of n by 3 to skip 2 numbers
		}
	}
}
