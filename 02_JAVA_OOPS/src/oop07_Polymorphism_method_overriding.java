//Method overriding
class A{
    public void run(){
        System.out.println("This is run function under class A");
    }
}
class B extends A{
    @Override
    public void run(){
        System.out.println("This is run function under class B");
    }
}
public class oop07_Polymorphism_method_overriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.run();
    }
}