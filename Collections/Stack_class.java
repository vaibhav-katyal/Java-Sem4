
import java.util.Stack;

class Stack_class{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(34);
        st.push(20);
        st.push(10);
        st.push(90);

        System.out.println(st);
        st.pop();
        System.out.println(st);

        System.out.println(st.isEmpty());
        System.out.println();

    }
}