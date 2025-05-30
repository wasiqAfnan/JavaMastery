public class Basic13_ArrayOfChar {
    public static void main(String[] args) {
        char[] name = { 'J', 'a', 'v', 'a' };

        System.out.println("Character Array:");
        for (char c : name) {
            System.out.print(c + " ");
        }

        System.out.println("\nAs String: " + new String(name));
    }
}
