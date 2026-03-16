
import java.util.ArrayList;



public class arraylistdemo{
    public static void main(String[] args) {
        // List list = new ArrayList<>();             made through upcasting and interface

        // list.add(45);
        // list.add("hrllo");

        // for(int i=0; i<list.size(); i++){
        //     System.out.println(list.get(i));
        // }

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);

        l2.addAll(l1);

        System.out.println(l1);
        System.out.println(l2);

        l2.remove(1);
        System.out.println(l2);

        l2.remove(Integer.valueOf(40));
        System.out.println(l2);
    }

}