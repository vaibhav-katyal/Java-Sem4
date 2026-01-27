public class subSeq{
    public static void sub(String s, String res){
        // System.out.println("CALL s=" + s + " ans=" + res);
        if(s.length() == 0){
            System.out.println(res);
            return;

        char ch = s.charAt(0);
        String rem = s.substring(1);

        sub(rem, res);    // exclude
        sub(rem, res+ch);   // include
    }
    public static void main(String[] args) {
        sub("abc", "");
    }
}