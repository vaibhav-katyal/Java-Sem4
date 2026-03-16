public class Tower_of_Hanoi{
    static int cnt = 0;
    public static void toh(int n, char A, char B, char C){
        if(n == 0) return;

        toh(n-1, A, C , B);
        // System.out.println("Move a disc from " + A + " to " + C);
        cnt++;

        toh(n-1, B, A, C);
        
    }
    public static void main(String[] args) {
        toh(5, 'A', 'B', 'C');
        System.out.print(cnt);
    }
}