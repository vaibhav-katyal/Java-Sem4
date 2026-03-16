public class Subsequence{
    public static void printsub(String exp, String ans){
        if(exp.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = exp.charAt(0);
        String res = exp.substring(1);

        // include
        printsub(res, ans+ch);

        // exclude
        printsub(res, ans);
    }
    public static void main(String[] args) {
        printsub("abc", "");
    }
}