class Test{
    int a = 5;
    int b = 10;

    int add(){
        return a+b;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.a;
        hash = 73 * hash + this.b;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Test other = (Test) obj;
        if (this.a != other.a) {
            return false;
        }
        return this.b == other.b;
    }

    // @Override
    public String toString(){
        return "a"+a+"b"+b;
    }
}
public class one{
    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println(t1.add());

        Test t2 = new Test();
        System.out.println(t1.equals(t2));


        System.out.println(t1.hashCode());
        System.out.println(t1.toString());
    }
}