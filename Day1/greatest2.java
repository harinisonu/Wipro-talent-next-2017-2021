/* program to accept two numbers and print the greater value of the two */
import java.util.*;
public class greatest2
{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		//getting to integers as input 
		if(a>b)
		{
		    System.out.println(a);//if a is greater print a
		}
		else
		    System.out.println(b);//if b is greater b is printed
	}
}
