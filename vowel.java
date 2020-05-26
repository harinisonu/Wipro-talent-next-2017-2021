import java.util.*;
class vowel {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc =  new Scanner(System.in);
        String a = sc.nextLine();//getting string as input
        char[] ch = a.toCharArray();//converting strings into char
        TreeSet hs = new TreeSet();//creating hashset
        /* using enhanced forloop to acces the char*/
        for (char c : ch){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
               hs.add(c);
               flag = 1;
               //adding all vowels from string in hashset
            }
        }
        //using foreach loop tpo print the hashset
        hs.forEach(System.out::print);  
        if(flag == 0)//no vowels in string 
            System.out.println("Thank You");
    }
}