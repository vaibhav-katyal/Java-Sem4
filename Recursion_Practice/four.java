import java.util.*;

class four {

    static void reverseArray(int[] arr, int left, int right) {
        if(left > right){
            return;
        }

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseArray(arr, left+1, right-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // number of packages
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr, 0, N - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
