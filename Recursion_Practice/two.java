import java.util.*;

class two {

    static int linearSearch(int[] arr, int index, int target) {
        if(index > arr.length-1){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }

        return linearSearch(arr, index+1, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // number of documents
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();   // document to search

        int result = linearSearch(arr, 0, target);
        System.out.println(result);

        sc.close();
    }
}
