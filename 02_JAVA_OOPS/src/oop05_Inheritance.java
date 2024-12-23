// Super Class or Parent class
// class Employee{
//     int id;
//     String name;

//     Employee(int id,String name){
//         this.id = id;
//         this.name = name;
//     }

//     public void show(){
//         System.out.println("ID:" + id);
//         System.out.println("Name:" + name);
//     }
// }

// // Sub Class or Child class
// class Manager extends Employee{
//     Manager(int id,String name){
//         // calling superclass constructor
//         super(id,name);
//     }
// }

// public class Inheritance05 {
//     public static void main(String[] args) {
//         // Employee obj1 = new Employee(100,"wasiq");
//         // obj1.show();
//         // Employee obj2     = new Employee(101,"Sohan");
//         // obj2.show();

//         Manager mn = new Manager(102,"Sohini");
//         mn.show();
//     }
// }

// Types of Inheritence
// 1) Single Inheritence
// 2) Multiple Inheritence
// 3) Multilevel Inheritance
// 4) Hierarchical Inheritence
// 5) Hybrid Inheritance

// Multilevel Inheritence

// class Employee{
//     public void display(){
//         System.out.println("I am Display function under Employee class");
//     }
// }

// class Engineer extends Employee{
//     public void show(){
//         System.out.println("I am show function under Engineer class");
//     }
// }

// class SoftwareEngineer extends Engineer{
//     public void work(){
//         System.out.println("I am work function under SoftwareEngineer class");
//     }
// }

// public class Inheritance05{
//     public static void main(String[] args) {
//         SoftwareEngineer se = new SoftwareEngineer();
//         se.display();
//         se.show();
//         se.work();
//     }
// }

// Heirarchical Inhertitence

// class Employee{
//     void display(){
//         System.out.println("I am display function under Employee class");
//     }
// }

// class Manager extends Employee{
//     void manage(){
//         System.out.println("I am manage function under Manager class");
//     }
// }

// class Engineer extends Employee{
//     void work(){
//         System.out.println("I am work function under Engineer class");
//     }
// }
// class HR extends Employee{
//     void hire(){
//         System.out.println("I am hire function under HR class");
//     }
// }

// public class Inheritance05{
//     public static void main(String[] args) {
//         Manager mn = new Manager();
//         mn.manage();
//         mn.display();
//     }
// }