import java.util.*;

class three {
    static int lastIndex(int[] arr, int index, int target) {
        if(index > arr.length-1){
            return -1;
        }

        int ans = lastIndex(arr, index+1, target);    // call before checking so that it checks when coming back

        if(ans != -1){
            return ans;
        }

        if(arr[index] == target){
            return index;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // number of frames
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();   // suspicious frame ID

        int result = lastIndex(arr, 0, target);
        System.out.println(result);

        sc.close();
    }
}
