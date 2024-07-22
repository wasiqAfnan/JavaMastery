/*
ArrayList is a part of the Java Collection Framework and is an implementation of the 
List interface. It uses a dynamically resizable array to store elements.

Here are some key points about ArrayList:
Dynamic Size: Unlike arrays, ArrayList can grow and shrink in size automatically when 
elements are added or removed.

Indexed Access: Provides fast, random access to elements using an index, which makes it 
efficient for accessing elements.

Insertion Order: Maintains the insertion order of elements.

Performance: Generally, it's efficient for read operations but can be slow for add/remove 
operations, especially if performed in the middle of the list, as it requires shifting 
elements.

Usage: Ideal when you need a resizable array with fast access and iteration performance

*/
import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");// 0
        fruits.add("Banana");// 1
        fruits.add("Cherry");// 2
        fruits.add("Date");// 3

        // Access and print elements from the ArrayList
        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);// apple  banana  cherry date
        }
        
        // Alternative way to print the ArrayList
        System.out.println("Fruits in the list using normal for loop:");
        for(int i = 0; i < fruits.size(); i++){
            System.out.println(fruits.get(i));
        }

        // get and print index of an element
        System.out.println("Index of Cherry is: "+fruits.indexOf("Cherry"));


        // Get and print the size of the ArrayList
        System.out.println("\nTotal number of fruits: " + fruits.size());

        // Remove an element from the ArrayList
        fruits.remove("Banana");
        System.out.println("\nAfter removing Banana:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Check if an element is in the ArrayList
        if (fruits.contains("Cherry")) {
            System.out.println("\nThe list contains Cherry");
        } else {
            System.out.println("\nThe list does not contain Cherry");
        }

        // Get an element by its index
        String firstFruit = fruits.get(0);
        System.out.println("\nThe first fruit in the list is: " + firstFruit);


        // Clear all elements from the ArrayList
        fruits.clear();
        System.out.println("\nAfter clearing, the list is empty: " + fruits.isEmpty());

        //To explore more about ArraList function visit the below URL
        // https://docs.oracle.com/en/java/javase/19/docs/api//java.base/java/util/ArrayList.html
    }
}