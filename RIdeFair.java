
import java.util.Scanner;

class Ride1{
    int baseFair;
    int distance;

    Ride1(int baseFair, int distance){
        this.baseFair = baseFair;
        this.distance = distance;
    }

    int calculateFair(){
        return baseFair;
    }
}

class Mini1 extends Ride1{
    int addCharges = 100;
    Mini1(int baseFair, int distance){
        super(baseFair, distance);
    }

    int calculateFair(){
        return baseFair + (addCharges)*distance;
    }
}

class Sedan1 extends Ride1{
    int addCharges = 200;
    Sedan1(int baseFair, int distance){
        super(baseFair, distance);
    }

    int calculateFair(){
        return baseFair + (addCharges)*distance;
    }
}

class SUV extends Ride1{
    int addCharges = 300;
    SUV(int baseFair, int distance){
        super(baseFair, distance);
    }

    int calculateFair(){
        return baseFair + (addCharges)*distance;
    }
}

public class RIdeFair{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String car = sc.next();

        int baseFair = sc.nextInt();
        int distance = sc.nextInt();

        if(car.equals("Mini")){
            Ride1 r1 = new Mini1(baseFair, distance);
            System.out.println(r1.calculateFair());
        }else if(car.equals("Sedan")){
            Ride1 r2 = new Sedan1(baseFair, distance);
            System.out.println(r2.calculateFair());
        }else if(car.equals("SUV")){
            Ride1 r3 = new SUV(baseFair, distance);
            System.out.println(r3.calculateFair());
        }
    }
}