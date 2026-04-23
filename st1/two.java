// all subseq

import java.util.*;

class two {

    static void subsequences(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String rem = str.substring(1);

        // include
        subsequences(rem, ans+ch);

        // exclude
        subsequences(rem, ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();   // input string
        subsequences(str, "");

        sc.close();
    }
}