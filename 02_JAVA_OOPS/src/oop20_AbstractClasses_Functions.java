// Abstract class because it has an abstract method
abstract class Employee{
    int empId;
    String empname;

    Employee(int id, String name){
        empId = id;
        empname = name;
    }

    // abstract function beacuse it has no declaration and declare using abstract keyword
    abstract void work();

    void display(){
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empname);
    }
}

// class Engineer inherits from Employee class
class Engineer extends Employee{
    // as Engineer is inherting from an abstract class
    // It should have to override the abstract method under the same class
    
    // Overriding work function
    @Override
    void work() {
        System.out.println("Engineer is Engineering");
    }

    // constructor
    Engineer(int id, String name){
        super(id, name);
    }
}

public class oop20_AbstractClasses_Functions {
    public static void main(String[] args) {
        // Employee e1 = new Employee(100,"Wasiq"); // this will give error
        // As Employee is an abstract class we can't create any instance/object of the class
        // This is because createing object of an abstract class is not allowed

        // creating objectof Engineer class
        Engineer e1 = new Engineer(101, "Afnan");
        e1.display();
    }   
}
