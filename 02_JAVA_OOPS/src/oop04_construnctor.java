// In Java, a Constructor is a block of codes similar to the method.  
// It is called when an instance of the class is created.
// At the time of calling the constructor, memory for the object is allocated in the memory. 
// It is a special type of method that is used to initialize the object. 
// Every time an object is created using the new() keyword, at least one constructor is called.

class Human{
    String name;
    int age;
    //1) constructor name should be same as classname
    //2) constructor should not return any value
    //3) constructor should be public
    // Non-Parameterized Constructor
    public Human(){
        System.out.println("Non-Parameterized constructor called");
    }

    // Parameterized Constructor
    public Human(String name,int age){
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Human(Human h){
        this.name = h.name;
        this.age = h.age;

        System.out.println("Copy constructor called");
    }

    //normal method
    public void show(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
public class oop04_construnctor {
    public static void main(String[] args) {
         Human h1 = new Human(); // Non-Parameterized Constructor called
         h1.show();

        Human h2 = new Human("wasiq",25); // Parameterized Constructor called
        h2.show();

        Human h3 = new Human(h2); // copy Constructor called
        h3.show();
    }
}
