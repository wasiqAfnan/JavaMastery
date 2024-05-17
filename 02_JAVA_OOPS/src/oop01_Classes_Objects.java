// class BankAccount{
//     // Attributes
//     String type;
//     String AccountNO;

//     //functions or behaviour
//     public void display(){
//         System.out.println("Type:"+type);
//         System.out.println("Account No:"+AccountNO);
//     }
// }

class Human{
    String name;
    int age;

    public void show(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}

public class oop01_Classes_Objects {
    public static void main(String[] args) {
        // created an object of class BankAccount
        // BankAccount obj = new BankAccount();
        // BankAccount obj1 = new BankAccount();

        // // Setting the values of type and accountno vars    
        // obj.type="Savings Ac";
        // obj.AccountNO="1234567890";
        // obj.display();

        // //Setting value of obj1
        // obj1.type = "Current ac";
        // obj1.AccountNO = "25964951548541633";
        // obj1.display();

        Human h1 = new Human();
        h1.name = "Rohan";
        h1.age = 50;
        h1.show();

        Human h2 = new Human();
        h2.name = "sohini";
        h2.age = 20;
        h2.show();
    }
}
