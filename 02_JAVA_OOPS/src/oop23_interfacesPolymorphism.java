/*
 * What is Dynamic Method Dispatch?
 * Dynamic Method Dispatch is the mechanism by which a call to an overridden method
 * is resolved at runtime, rather than at compile time.

 * It allows Java to support runtime polymorphism — the ability to call the 
 * correct overridden method of a subclass or implementing class through a superclass/interface reference.

 */

interface Animal {
    void sound(); // abstract method
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }

    public void eat() {
        System.out.println("Dog eats.");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }
}

public class oop23_interfacesPolymorphism {
    public static void main(String[] args) {
         Animal myAnimal; // interface reference

        myAnimal = new Dog(); // object of Dog
        myAnimal.sound();     // calls Dog's implementation
        // myAnimal.eat();     // calls Dog's implementation of eat function. But Animal ref
        // do not resolve it. Hence, it gives error --> "Method eat undefined for type Animal"

        myAnimal = new Cat(); // now object of Cat
        myAnimal.sound();     // calls Cat's implementation

        /*
         * When you use an interface as a reference type, and assign an object 
         * of a class that implements that interface, Java allows you to only 
         * access the methods defined in the interface, Refer to line 39 in code. (unless you cast it back).
         * But at runtime, the actual method implementation in the class object 
         * is executed. 
         */
    }
}
