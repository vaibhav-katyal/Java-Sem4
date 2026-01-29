import java.util.*;

class five {

    static String removeChar(String str, char ch) {
        if(str.length() == 0){
            return "";
        }

        char first = str.charAt(0);
        String rem = removeChar(str.substring(1), ch);

        if(first == ch){
            return rem;
        }else{
            return first+rem;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();   // email message
        char ch = sc.next().charAt(0);  // character to remove

        String result = removeChar(str, ch);
        System.out.println(result);

        sc.close();
    }
}
