import java.util.Scanner;

class Gateway {
    int amount;

    public Gateway(int amount) {
        this.amount = amount;
    }

    double calculateAmount(){
        return 0;
    }
}

class CreditCard extends Gateway {
    double reduction = 0.02;
    CreditCard(int amount){
        super(amount);
    }

    @Override
    double calculateAmount(){
        return amount + (amount*reduction);
    }
}

class DebitCard extends Gateway {0-+
 8
    double reduction = 0.01;
    public DebitCard(int amount) {
        super(amount);
    }

    @Override
    double calculateAmount(){
        return amount + (amount*reduction);
    }
}

class UPI extends Gateway {
    double reduction = 0.0;
    public UPI(int amount) {
        super(amount);
    }

    @Override
    double calculateAmount(){
        return amount + (amount*reduction);
    }
}


public class PaymentGateway{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the type of Gateway: ");
        String gateway = sc.nextLine();

        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();

        if(gateway.equals("CreditCard")){
            Gateway g1 = new CreditCard(amount);
            System.out.println("Amount deducted: " + g1.calculateAmount());
        }else if(gateway.equals("DebitCard")){
            Gateway g2 = new DebitCard(amount);
            System.out.println("Amount deducted: " + g2.calculateAmount());
        }else if(gateway.equals("UPI")){
            Gateway g3 = new UPI(amount);
            System.out.println("Amount deducted: " + g3.calculateAmount());
        }

    }

}