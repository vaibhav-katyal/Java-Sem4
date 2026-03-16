public class uniqueNo{
    public static void main(String[] args) {
        int [] arr = {2,2,3,3,1,1,7};

        int ans = 0;
        // 0 ^ x = x
        // x ^ x = 0

        for(int num:arr){
            ans = ans^num;
        }

        System.out.print(ans);
    }
}