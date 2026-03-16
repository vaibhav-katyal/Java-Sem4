public class Power{
    static int calc(int x, int n){
        if(n == 0){
            return 1;
        }

        return x*calc(x, n-1);
    }
    public static void main(String[] args){
        System.out.println(calc(4, 3));
    }
}