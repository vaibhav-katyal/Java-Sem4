class q1{
    static int ways = 0;
    public static void solve(int n, int temp){
        if(temp >= n){
            if(temp == n) ways++;
            return;
        }

        solve(n, temp+1);
        solve(n, temp+2);
    }
    public static void main(String[] args){
        solve(10, 0);
        System.out.println(ways);
    }
}