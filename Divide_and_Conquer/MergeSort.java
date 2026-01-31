public class MergeSort{
    static void merge(int[] arr, int low, int mid, int high){
        int i = low;
        int j = mid+1;
        int k = low;

        int[] b = new int[arr.length];

        while(i <= mid && j<=high){
            if(arr[i] > arr[j]){
                b[k] = arr[i];
                i++;
            }else{
                b[k] = arr[j];
                j++;
            }

            k++;
        }

        if(i>mid){
            while(j<=high){
                b[k] = arr[j];
                j++;
                k++;
            }
        }else{
            while(i<=mid){
                b[k] = arr[i];
                i++;
                k++;
            }
        }

        for(int m=low; m<=high; m++){
            arr[m] = b[m];
        }
    }
    static void mergeSort(int [] arr, int low, int high){
        if(low < high){
            int mid = (low+high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }
    public static void main(String[] args) {
        int [] arr = {24,7,35,15,9,12};

        mergeSort(arr, 0, arr.length-1);

        for(int n:arr){
            System.out.print(n + " ");
        }
    }
}