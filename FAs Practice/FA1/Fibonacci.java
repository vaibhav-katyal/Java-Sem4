public class Fibonacci{
    static int calc(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return calc(n-1)+calc(n-2);
    }
    public static void main(String[] args) {
        int n = 10;
        for(int i=0; i<n; i++){
            System.out.print(calc(i) + " ");
        }
    }
}