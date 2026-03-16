class Student{
    int rollno;
    String name;

    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    Student(Student s){
        this.rollno = s.rollno;
        this.name = s.name;
    }

    void display(){
        System.out.println("Roll no.: "+ rollno);
        System.out.println("Name: "+ name);
    }
}

public class one{
    public static void main(String[] args) {
        Student s = new Student(480, "Vaibhav");
        Student s2 = new Student(s);
        s2.display();
    }
}