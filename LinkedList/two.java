
import java.util.LinkedList;

public class two{
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();

        ls.add("first");
        ls.add("third");
        ls.add(1, "second");

        System.out.println(ls);
    }
}