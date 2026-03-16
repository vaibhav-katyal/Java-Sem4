// overriding is runtime polymorphism 
class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{              // inheritance is used while overriding
    @Override void sound(){                              // if the function in parent is made static or final, it cannot be overriden as throguh static it belongs to class, and final means constant that we cant change 
        System.out.println("Dog sound");
    }

    void bark(){
        System.out.println("Bow Bow");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat sound");
    }
}
public class overriding{
    public static void main(String[] args) {
        Animal a = new Cat();            // this is called upcasting as in the stack the refernce of the parent is stored and object is made of child class that gets stores in the heap
        Animal b = new Dog();
        a.sound();
        b.sound();
        // b.bark();        // this will give error as this function is not present in the parent class as the refence of the parent is used.
    }
}