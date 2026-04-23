
import java.util.LinkedList;

public class three{
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();

        ls.add("Apple");
        ls.add("Banana");
        ls.add(1, "for");
        ls.addFirst(("Oranges"));
        ls.addLast("Grapes");

        for(int i=0; i<ls.size(); i++){
            System.out.print(ls.get(i) + " ");
        }

        System.out.println("");

        for(String str:ls){
            System.out.println(str + " ");
        }
    }
}