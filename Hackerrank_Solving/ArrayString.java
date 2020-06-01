/* Hackerrank problem 1 dated 25-05-2020 */
import java.util.*;
public class ArrayString {
    public static void main(String args[] ) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner s = new Scanner(System.in);//to scan inputs from user
        int n = s.nextInt();//n is scanned using "s"- object of scanner
        int m = s.nextInt();//m is scanned using "s"- object of scanner
        String[][] a = new String[n][m];//initiallizing array named a
        for (int i = 0; i < n; i++)
        { 
            for (int j = 0; j < m; j++)
            { 
                //to scan user input string
                a[i][j] = s.next(); 
            } 
        } 
        for(int i=0; i<n;i++)
        {
            for(int j=0; j<m;j++)
            {
              // ouput the char at position 0 of each string withou newline as a matrix
              System.out.print(a[i][j].charAt(0)+" ");
            }
            System.out.println("");
        }
    }
}
