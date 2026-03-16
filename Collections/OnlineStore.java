
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OnlineStore{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, Integer> mpp = new HashMap<>();

        for(int i=0; i<n; i++){
            String inp = sc.next();
            if(mpp.containsKey(inp)){
                mpp.put(inp, mpp.get(inp)+1);
            }else{
                mpp.put(inp, 1);
            }
        }

        System.out.println(mpp);
    }
}