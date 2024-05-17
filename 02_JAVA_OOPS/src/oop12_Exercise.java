// Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

class Shape{
    void getArea(){
        System.out.println("This is getArea() under Shape class");
    }
}

class Rectangle extends Shape{
    int length;
    int breadth;
    //contructor
    Rectangle(int len,int bred){
        this.length = len;
        this.breadth = bred;
    }

    @Override
    void getArea(){
        int area = length * breadth;
        System.out.println("Area of Rectangle: "+area);
    }
}

public class oop12_Exercise {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(12, 10);
        rect1.getArea();
    }
}
