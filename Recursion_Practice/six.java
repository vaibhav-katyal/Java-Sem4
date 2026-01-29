import java.util.*;

class six {
    static int countVowels(String str) {
        if(str.length() == 0) return 0;

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();   // input sentence
        int result = countVowels(str);

        System.out.println(result);

        sc.close();
    }
}
