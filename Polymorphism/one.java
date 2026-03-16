class Sum1{
    void add(){
        int a = 5;
        int b = 10;
        int c = a+b;

        System.out.println(a+b);
    }

    void add(int a,int b){
        System.out.println(a+b);
    }

    void add(double a, double b){
        System.out.println(a+b);
    }
}
public class one{
    public static void main(String [] agrs){
        Sum1 s = new Sum1();
        s.add();
        s.add(5,4);
        s.add(3.2,4.5);
    }
}