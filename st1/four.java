// permutations of a string

import java.util.*;

class four {

    // YOU HAVE TO WRITE LOGIC HERE
    static void permutations(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            String left = str.substring(0, i);
            String right = str.substring(i+1);

            String rest = left+right;
            permutations(rest, ans+ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();   // input string
        permutations(str, "");

        sc.close();
    }
}