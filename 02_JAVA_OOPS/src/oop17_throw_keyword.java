public class oop17_throw_keyword {
    public static int rectArea(int length, int width) throws Exception, ArithmeticException {
        if (length <= 0 || width <= 0) {
            throw new ArithmeticException("length or width can't be negative");
        } else {
            int area = length * width;
            return area;
        }
    }

    public static void main(String[] args) {

        try {
            int res = rectArea(5, 1); // this wil not trigger exception
            System.out.println(res);
            // int res = rectArea(5, 0); // this will trigger an exception
            // System.out.println(res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
