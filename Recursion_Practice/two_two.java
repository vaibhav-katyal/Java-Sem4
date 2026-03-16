public class two_two{
    public static int cntDig(int n){
        if(n == 0) return 0;

        return 1+cntDig(n/10);
    }
    public static void main(String[] args) {
        int a = cntDig(1234567890);
        System.out.print(a);
    }
}