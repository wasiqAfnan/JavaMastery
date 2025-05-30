public class Basic11_StringBuilder {
    public static void main(String[] args) {
        // StringBuilder is mutable and faster than StringBuffer but not thread-safe.
        // Use when you need to modify strings frequently (append, insert, delete, etc.)
        // Best for single-threaded environments like most desktop apps or algorithm problems.

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");                 // Hello World
        sb.insert(5, ", Java");              // Hello, Java World
        sb.replace(0, 5, "Hi");              // Hi, Java World
        int capacity = sb.capacity();
        sb.delete(3, 9);                     // Hi World
        sb.reverse();                        // dlroW,iH

        System.out.println("Final: " + sb);  // dlroW,iH
        System.out.println("Length: " + sb.length()); // 8
        System.out.println("Char at index 2: " + sb.charAt(2)); // r
        System.out.println("Char at index 2: " + capacity); // 21
    }
}
