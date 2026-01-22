public class Count_Digit{
    public static int cntDig(int n){
        if(n == 0) return 0;

        return 1+cntDig(n/10);
    }
    public static void main(String[] args) {
        System.out.println(cntDig(12345));
    }
}