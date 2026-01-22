
import java.util.Scanner;

public class Reverse_Number{
    static int revNum = 0;
    public static int revNo(int n){
        if(n == 0) return 0;
        revNum = revNum*10 + (n%10);
        return revNo(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        revNo(n);
        System.out.println(revNum);
    }
}