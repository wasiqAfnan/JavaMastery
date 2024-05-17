class A{
    private
        int x;
        int y;  
    public
        int c;
        int d;
        void fun(int v,int j){
            this.x = v;
            this.y = j;
        }

        void show(){
            System.out.println("X = " + x);
            System.out.println("Y = " + y);
        }
}
public class oop08_AccessModifiers {
    public static void main(String[] args) {
        A obj = new A();
        obj.c=25;
        obj.d=30;
        obj.fun(5,2);
        obj.show();
    }
}
