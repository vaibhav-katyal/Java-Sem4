class Employee{
    int id;
    String name;
    double baseSalary;

    Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary(){
        return 0;
    }
}

class FullTimeEmployee extends Employee{
    double bonus;

    FullTimeEmployee(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }
    
    @Override
    double calculateSalary(){
        return baseSalary+bonus;
    }
}   

class PartTimeEmployee extends Employee{
    int noofhours;
    int costperhour;

    PartTimeEmployee(int id, String name, int noofhours, int costperhour){
        super(id, name, 0);
        this.noofhours = noofhours;
        this.costperhour = costperhour;
    }

    @Override
    double calculateSalary(){
        return noofhours*costperhour;
    }
}

public class ques{
    public static void main(String[] args) {

        Employee [] employees = new Employee[2];

        employees[0] = new FullTimeEmployee(101, "Aman", 70000, 9000);
        employees[1] = new PartTimeEmployee(102, "Aditya", 4, 5000);

        for(Employee emp:employees){
            System.out.println(emp.calculateSalary());
        }
    }
}