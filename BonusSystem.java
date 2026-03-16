
import java.util.Scanner;

class Employee {

    int baseSalary;
    int bonus;
    Employee(int baseSalary,int bonus) {
        this.bonus=bonus;
        this.baseSalary = baseSalary;
    }
    int salary(){
        return baseSalary;
    }
}

class Manager extends Employee {

    Manager(int baseSalary, int bonus) {
        super(baseSalary,bonus);
        
    }

    int salary() {
        return baseSalary + bonus;
    }
}

public class BonusSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baseSalary = sc.nextInt();
        int bonus = sc.nextInt();
        Manager m = new Manager(baseSalary, bonus);
        System.out.println(m.salary());
    }
}
