import java.util.*;

class one {

    static boolean isSorted(int[] arr, int index) {
        if(index>=arr.length-1){
            return true;
        }
        if(arr[index] > arr[index+1]){
            return false;
        }

        return isSorted(arr, index+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // number of employee IDs
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = isSorted(arr, 0);
        System.out.println(result);

        sc.close();
    }
}
