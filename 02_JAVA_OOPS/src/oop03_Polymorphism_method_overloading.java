// poly --> Many
// morphy --> Form

public class oop03_Polymorphism_method_overloading {
    // Method Overloading
    public static int area(int breadth){
        int squareArea = breadth * breadth;
        return squareArea;
    }
    
    // Method Overloading
    public static int area(int length,int width){
        int rectArea = length * width;
        return rectArea;
    }

    public static void main(String[] args) {
        //calling area with 1 parameters
        int result = area(5);
        System.out.println(result);

        //calling area with 2 parameters
        int result2 = area(5,4);
        System.out.println(result2);
    }
    
}