/*
 * 
HashMap in Java Collection Framework
A HashMap is a part of Java's Collection Framework that stores data in key-value pairs.
It allows you to store and retrieve data quickly by using a hashing mechanism.
The keys must be unique, but values can be duplicated. HashMap is widely used because 
of its constant-time performance for basic operations like get and put, provided the 
hash function disperses the elements properly among the buckets.

### Advantages of HashMap
Fast Access: HashMap provides constant-time performance for basic operations like 
insertion, deletion, and lookup, assuming the hash function distributes elements 
properly.
Flexible: Supports null values and one null key.
Dynamic: Automatically grows in size to accommodate more entries.
Versatile: Suitable for implementing caches, dictionaries, and other associative 
data structures.

Basic Operations in HashMap
put(K key, V value): Inserts a key-value pair into the HashMap.
get(Object key): Retrieves the value associated with a specific key.
remove(Object key): Removes the key-value pair associated with the specified key.
containsKey(Object key): Checks if the map contains a specific key.
containsValue(Object value): Checks if the map contains a specific value.
size(): Returns the number of key-value pairs in the HashMap.
isEmpty(): Checks if the HashMap is empty.
keySet(): Returns a Set view of the keys contained in the HashMap.

*/
import java.util.HashMap;

public class HashMap07 {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 1. Adding elements to the HashMap
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");
        map.put(5, "Elderberry");

        // Display the HashMap
        System.out.println("Initial HashMap: " + map);

        // 2. Accessing a value
        String value = map.get(3);
        System.out.println("Value associated with key 3: " + value);

        // 3. Removing an entry
        map.remove(2);
        System.out.println("HashMap after removing key 2: " + map);

        // 4. Checking if a key exists
        boolean hasKey4 = map.containsKey(4);
        System.out.println("Does key 4 exist? " + hasKey4);

        // 5. Checking if a value exists
        boolean hasValueDate = map.containsValue("Date");
        System.out.println("Does value 'Date' exist? " + hasValueDate);

        // 6. Checking the size of the HashMap
        int size = map.size();
        System.out.println("Size of the HashMap: " + size);

        // 7. Checking if the HashMap is empty
        boolean isEmpty = map.isEmpty();
        System.out.println("Is the HashMap empty? " + isEmpty);

        // 8. Iterating over keys
        System.out.println("Keys in the HashMap: " + map.keySet());

        // 8. Iterating over values
        System.out.println("Keys in the HashMap: " + map.values());
    }
}
