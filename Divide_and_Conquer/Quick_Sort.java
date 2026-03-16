public class Quick_Sort{
    public static int partition(int [] arr, int start, int end){
        int pivot = arr[start];
        int left = start;
        int right = end;

        while(left<right){
            while(arr[left] <= pivot){
                left++;
            }

            while(arr[right] > pivot){
                right--;
            }

            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        int temp = arr[start];
        arr[start] = arr[right];
        arr[right] = temp;

        return right;

    }

    public static void quicksort(int[] arr, int start, int end){
        if(start > end) return;

        int pivot = partition(arr, start, end);
        quicksort(arr, start, pivot-1);
        quicksort(arr, pivot+1, end);
    }
    public static void main(String[] args){
        int [] arr = {6,5,14,1,8,3};

        quicksort(arr, 0, arr.length-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}