
import java.util.Scanner;

public class Factorial{
    public static int fact(int n){
        if(n==0 || n==1) return 1;

        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();

        System.out.print(fact(n));
    }
}