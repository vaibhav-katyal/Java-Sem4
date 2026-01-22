public class PrintNnumbers{
    public static void printNums(int n){
        if(n == 0){
            System.out.println(0);
            return;
        }
        printNums(n-1);
        System.out.println(n);
    }
    public static void main(String [] args){
        printNums(10);
    }
}