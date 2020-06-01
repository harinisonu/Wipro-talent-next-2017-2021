/* Design an algorithm to accept a given string from the user. The algorithm must then remove characters from the string which appear more than once.  */

import java.util.*;
public class StringNoDupi
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    LinkedHashSet<Character> hs = new LinkedHashSet<>();
		String s = sc.nextLine(); // getting string as input
		char[] c = s.toCharArray(); // coverting string to array of char
	    for(int i=0;i<s.length();i++)
		{
		    hs.add(c[i]); //adding char to linked hash set
		}
		for(char ch : hs)
		{
		    System.out.print(ch);//print char without duplicates
		}
	}
}
