import java.util.*;
public class positivenegative
{
	public static void main(String[] args) {
	    Scanner s =  new Scanner(System.in);
	    int n = s.nextInt();
	    //System.out.println(n);
	    if(n == 0)
	    {
	        System.out.println("zero");
	    }
	    else
	    {
	        if(n>0)
	            System.out.println("positive");
	        else
	            System.out.println("negative");
	    }
	}
}