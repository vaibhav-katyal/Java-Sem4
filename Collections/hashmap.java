    import java.util.*;

    public class hashmap{
        public static void main(String[] args) {
            Map<Integer, String> mpp = new HashMap<>();

            mpp.put(1, "abc");
            mpp.put(2, "def");
            mpp.put(3, "ghi");

            System.out.println(mpp);

            mpp.put(1, "hij");
            System.out.println(mpp);
            System.out.println(mpp.size());

            if(mpp.containsKey(1)){
                System.out.println("Key is present");
            }
        }
    }