// Type 1: Using final in class
// final class animal{
//     String voice;
//     String name;
    
//     animal(String v, String n){
//         this.voice = v;
//         this.name = n;
//     }

//     void print(){
//         System.out.println("Voice: "+voice);
//         System.out.println("Name: "+name);
//     }
// }

// class tiger extends animal{

// } this will give error as we have declare the animal class as final so we can not inherit it

// Type 2: using final in function

class A{
    final public void run(){
        System.out.println("This is run function under class A");
    }
}
class B extends A{
    // can not override run function as we have declare the run() in A class using final keyword
    // @Override
    // public void run(){
    //     System.out.println("This is run function under class B");
    // }
}

public class oop13_Final_keyword {
    public static void main(String[] args) {
        //Type3: Using final in var: Declaring variable using final keyowrd
        // final int myData = 54;
        // // myData = 60; error: cannot assign a value to final variable myData
        // System.out.println(myData);
    }
}
