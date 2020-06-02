import java.util.*;
public class PalindromeCounter {

    /*
     * Complete the 'countPalindromes' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int countPalindromes(String s) {
    // Write your code here
    ArrayList<String> palindrome = new ArrayList<>();
    char[] ch = s.toCharArray();
    int count=0;
    String string = " ";    
    int len=s.length();
    int k = len-2,sum=0;
    String rev="";
    
    for(int j=0;j<len;j++)
	{
    	string = String.valueOf(ch[j]);
    	palindrome.add(string);
	}	
    while(len>0)
    {       	
    	for(int i=0;i<len-1;i++)
    	{
    		string = "";
    		for(int j=i;j<len+i-k;j++)
    		{
    			string = string + ch[j];
    		}
    		palindrome.add(string);    		    		
    	}  
    	k=k-2;
    	len--;
    }
    System.out.println(palindrome);
    for(String org : palindrome)
    {
    	 rev="";
    	 for(int i=org.length()-1;i>=0;i--)
    	 {    
    	   rev= rev+org.charAt(i);     	     
    	 }    
    	 //System.out.println(rev);   
    	 if(org.equals(rev))   
    		{
    		 count++;
      	   	System.out.println(rev);
    		}
    }
    System.out.println(count);
    return count;
    }
    
    public static void main(String args[])
    {
    	int result = Palindrome.countPalindromes("tacocat");
    }

}
