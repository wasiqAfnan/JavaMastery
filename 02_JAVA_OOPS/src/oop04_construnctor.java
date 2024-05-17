// In Java, a Constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling the constructor, memory for the object is allocated in the memory. It is a special type of method that is used to initialize the object. Every time an object is created using the new() keyword, at least one constructor is called.

class Human{
    String name;
    int age;
    //1) constructor name should be same as classname
    //2) constructor should not return any value
    //3) constructor should be public
    //Constructor
    public Human(String name,int age){
        this.name = name;
        this.age = age;
    }
    //normal method
    public void show(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
public class oop04_construnctor {
    public static void main(String[] args) {
        Human h1 = new Human("sohini", 20);
        h1.show();

        Human h2 = new Human("wasiq",25);
        h2.show();
    }
}
