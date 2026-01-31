public class SortArray{
    public static void main(String[] args) {
        int [] arr = {24,7,35,15,9,12};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int n:arr){
            System.out.print(n + " ");
        }
    }
}