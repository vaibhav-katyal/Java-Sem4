
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Student{
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString(){
        return "("+id+")"+name+ "-->" + marks;
    }
}

public class ques{
    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        list.add(new Student(101, "Vaibhav", 100));
        list.add(new Student(102, "Jatin", 87));
        list.add(new Student(103, "Manu", 32));
        list.add(new Student(104, "Madhav", 92));
        list.add(new Student(105, "Medhansh", 99));
        list.add(new Student(106, "Garg", 32));

        System.out.println(list);

        Student topStudent = list.get(0);
        for(Student s:list){
            if(s.marks > topStudent.marks){
                topStudent = s;
            }
        }

        System.out.println("With Highest marks: " + topStudent);


        // remove the student with marks less than 40

        // for(int i=0; i<list.size(); i++){
        //     if(list.get(i).marks < 40){
        //         list.remove(i);
        //     }
        // }

        // System.out.println(list);


        // Using iterator
        Iterator<Student> itr = list.iterator();

        while(itr.hasNext()){
            Student s = itr.next();
            if(s.marks < 40){
                itr.remove();
            }
        }
        
        System.out.println(list);


        // Update marks using ID

        int searchID = 104;

        for(Student s:list){
            if(s.id == searchID){
                s.marks = 55;
            }
        }

        System.out.println(list);

        // sort by marks
        Collections.sort(list, (a,b)->a.marks - b.marks);
        System.out.println(list);

        // count students who scored above 80
        int cnt = 0;
        for(Student s:list){
            if(s.marks > 80) cnt++;
        }

        System.out.println("Students above 80: " + cnt);
    }
}