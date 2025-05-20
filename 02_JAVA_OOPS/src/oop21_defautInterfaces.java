interface Vehicle {
    void start(); // abstract method

    /*
    In Java 8 and onwards, interfaces can have default methods. 
    These are methods with a default implementation, so that implementing 
    classes don't have to override them unless needed.
    */
    
    // default method with implementation
    default void showType() {
        System.out.println("This is a vehicle.");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting.");
    }

    // showType() is inherited as-is from interface
}

public class oop21_defautInterfaces {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.showType(); // calls default method
    }
}
