/* Design an algorithm to find the least perfect square, which is divisible by each of 21, 36 and 66. */
/* LeastPerSq */
import java.util.*;
public class LeastPerSq5 {
    public static void main(String[] args) {

        int n1 = 21, n2 = 36, n3 = 66, lcm;

        // maximum number between n1 and n2 is stored in lcm
        lcm = ((n1 > n2 && n1 > n3) ? n1 : (n2 > n3 ? n2 : n3));

        // Always true
        while(true)
        {
            if( lcm % n1 == 0 && lcm % n2 == 0 && lcm % n3 == 0 )
            {
                System.out.printf("The LCM of %d , %d , %d is %d.", n1, n2, n3, lcm*7*11);
                break;
            }
            ++lcm;
        }
    }
}
