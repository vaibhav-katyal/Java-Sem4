public class subSqunce{
    public static void printSubSequence(String expr, int start, int end){
        if(start == expr.length()){
            return;
        }

        if(end > expr.length()){
            printSubSequence(expr, start+1, start+2);
            return;
        }

        System.out.println(expr.substring(start, end));

        printSubSequence(expr, start, end+1);
        
    }
    public static void main(String[] args) {
        String s = "abc";
        printSubSequence(s, 0, 1);
    }
}