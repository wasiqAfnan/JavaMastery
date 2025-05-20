interface Animal {
    void eat();
}

/*
 * Interfaces in Java can inherit from other interfaces. 
 * A child interface inherits all methods from the parent interface 
 * and can also define more.
 */

interface Dog extends Animal {
    void bark();
}

class GermanShepherd implements Dog {
    public void eat() {
        System.out.println("German Shepherd is eating.");
    }

    public void bark() {
        System.out.println("German Shepherd is barking.");
    }
}

public class oop22_interfacesInheritance {
    public static void main(String[] args) {
        GermanShepherd dog = new GermanShepherd();
        dog.eat();  // inherited from Animal
        dog.bark(); // defined in Dog
    }
}
