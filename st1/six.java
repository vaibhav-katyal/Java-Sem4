import java.util.*;

class six {

    // YOU HAVE TO WRITE LOGIC HERE
    static void lexicographical(int curr, int n) {
        if(curr > n) return;

        System.out.print(curr + " ");

        for(int i=0; i<=9; i++){
            lexicographical(curr*10 + i, n);
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // start from 1 to 9
        for (int i = 1; i <= 9; i++) {
            lexicographical(i, n);
        }

        sc.close();
    }
}