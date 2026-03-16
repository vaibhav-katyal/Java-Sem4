public class BoardPath{
    public static int calc(int curr, int end){
        if(curr == end){
            // System.out.println(ans);
            return 1;
        }

        if(curr > end) return 0;

        int cnt = 0;
        for(int dice=1; dice<=6; dice++){
            cnt += calc(curr+dice, end);
        }

        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(calc(0, 3));
    }
}