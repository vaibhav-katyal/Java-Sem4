import java.util.*;

class three {

    static void boardPath(int curr, int target, String ans){
        if(curr == target){
            System.out.println(ans);
            return;
        }

        if(curr > target) return;

        for(int dice=1; dice<=6; dice++){
            boardPath(curr+dice, target, ans+dice);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        boardPath(0, target, "");

        sc.close();
    }
}