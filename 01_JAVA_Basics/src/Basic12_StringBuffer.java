public class Basic12_StringBuffer {
    public static void main(String[] args) {
        /*
         * It's mutable.
         * Use when you need to modify strings in multi-threaded programs (e.g., web
         * servers, background tasks).
         * It’s synchronized (thread-safe), so it prevents race conditions, but slightly
         * slower than StringBuilder.
         */

        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" World");
        // Use when threads might access it simultaneously

        // Support all function available under StrinBuilder.
        // As both StringBuffer and StringBuilder class extend the AbstractStringBuilder class
    }
}
