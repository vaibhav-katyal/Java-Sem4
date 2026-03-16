public class two_one{
    public static int sumOfDig(int n){
        if(n == 0){
            return 0;
        }

        return sumOfDig(n/10) + n%10;
    }
    public static void main(String[] args) {
        System.out.print(sumOfDig(1234));

    }
}