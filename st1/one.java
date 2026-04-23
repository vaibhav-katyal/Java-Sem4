// climb stairs
import java.util.*;

class one {

    // YOU HAVE TO WRITE LOGIC HERE
    static int climbStairs(int n) {

        if(n == 0) return 1;
        if(n < 0) return 0;

        return climbStairs(n-1)+climbStairs(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of stairs
        int result = climbStairs(n);

        System.out.println(result);

        sc.close();
    }
}