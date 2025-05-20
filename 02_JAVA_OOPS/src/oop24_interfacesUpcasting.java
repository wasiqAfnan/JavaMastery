/*
 * Interface-Based Upcasting and Dynamic Method Dispatch
In Java, interface-based upcasting allows us to refer to an object of a class
(that implements one or more interfaces) using a reference of the interface type.
This is similar to class-based upcasting but involves interfaces instead of 
parent classes.

When we upcast, we restrict access to only the methods defined in the interface,
even though the actual object may implement more methods. At runtime,
Java dynamically calls the correct method implementation from the class,
not the interface — this is known as dynamic method dispatch.

*/

// Interface 1: Engine-powered vehicles
interface EnginePowered {
    void startEngine(); // Abstract method
}

// Interface 2: Electric-powered vehicles
interface ElectricPowered {
    void chargeBattery(); // Abstract method
}

// Class: Car that implements both interfaces
class Car implements EnginePowered, ElectricPowered {
    // Implementing EnginePowered method
    public void startEngine() {
        System.out.println("Starting engine of the car.");
    }

    // Implementing ElectricPowered method
    public void chargeBattery() {
        System.out.println("Charging the electric battery of the car.");
    }

    // Specific method for Car
    public void drive() {
        System.out.println("Driving the car.");
    }
}

public class oop24_interfacesUpcasting {
    public static void main(String[] args) {
        // Upcasting to EnginePowered interface reference
        EnginePowered myCarEngine = new Car();
        myCarEngine.startEngine(); // Allowed
        // myCarEngine.chargeBattery(); // Error: not accessible through EnginePowered
        // reference
        // myCarEngine.drive(); // Error: not accessible through EnginePowered reference

        // Upcasting to ElectricPowered interface reference
        ElectricPowered myCarElectric = new Car();
        myCarElectric.chargeBattery(); // Allowed
        // myCarElectric.startEngine(); // Error: not accessible through ElectricPowered
        // reference
        // myCarElectric.drive(); // Error: not accessible through ElectricPowered
        // reference

        // Direct reference to the Car class
        Car myCar = new Car();
        myCar.startEngine(); // Accessible
        myCar.chargeBattery(); // Accessible
        myCar.drive(); // Accessible
    }
}
