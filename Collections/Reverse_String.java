
import java.util.Stack;

class Reverse_String{
    public static void main(String[] args) {
        String s = "vaibhav";
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            st.push(s.charAt(i));
        }

        StringBuilder newString = new StringBuilder();
        while(!st.isEmpty()){
            newString.append(st.pop());
        }

        System.out.println(newString);
    }
}