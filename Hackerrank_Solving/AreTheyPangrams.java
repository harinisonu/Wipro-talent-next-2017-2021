
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		TreeSet<Character> p = new TreeSet<>();
		ArrayList<String> pangram = new ArrayList<>();
		pangram.add("pack my box with five dozen liquor jugs");
		pangram.add("abcdelkopte");
		for(String i : pangram)
		{
		    String str = "";
		    System.out.println(i);
		    char[] x = i.toCharArray();
		    i = i.replaceAll("\\s", "");
		    Arrays.sort(x); 
		   for(int k=0;k<x.length;k++)
		   {
		       p.add(x[k]);
		   }
		   for(char l: p)
		   {
		       str = str + l;
		   }
		   p.clear();
		   str = str.replaceAll("\\s", "");
		   System.out.println(str);
		    if(str.equals(alpha))
		    {
		        System.out.println("1");
		    }
		    else
		    {
		        System.out.println("0");
		    }
		}
		System.out.println(pangram);
	}
}
