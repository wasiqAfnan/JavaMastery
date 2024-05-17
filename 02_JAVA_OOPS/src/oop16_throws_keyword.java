public class oop16_throws_keyword {

    public static int div(int a, int b) throws Exception, ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            // int res = div(10, 5);// Exception will not occur
            // System.out.println(res);

            int res1 = div(10, 0);// will throw an exception
            System.out.println(res1);

        } catch (Exception e) {
            System.out.println("Error occured: " + e.getMessage());
        }
    }
}
