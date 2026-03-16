class Permutations{
    public static void permu(String exp, String ans){
        if(exp.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);
            String rem = exp.substring(0,i)+exp.substring(i+1);

            permu(rem, ans+ch);
        }
    }
    public static void main(String[] args) {
        permu("abcde", "");
    }
}