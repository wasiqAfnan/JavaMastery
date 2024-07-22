/*
    HashSet is a part of the Java Collection Framework and implements the Set interface. 
    It is backed by a hash table. 
    Here are some key points about HashSet:
    
    Unique Elements: Stores unique elements and does not allow duplicates.
    
    No Order Guarantee: Does not guarantee any specific order of elements.
    
    Hashing: Uses hash codes for storing elements, providing constant-time performance for basic 
    operations like add, remove, and contains.
    
    Null Element: Allows one null element.
    
    Usage: Ideal for scenarios where you need a collection of unique elements and don't care about the order of elements.
*/
import java.util.HashSet;

public class HashSet03 {
    public static void main(String[] args) {
        // Create a HashSet to hold String elements
        HashSet<String> colors = new HashSet<>();

        // Add elements to the HashSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Access and print elements from the HashSet
        System.out.println("Colors in the set:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Get and print the size of the HashSet
        System.out.println("\nTotal number of colors: " + colors.size());

        // Remove an element from the HashSet
        colors.remove("Green");
        System.out.println("\nAfter removing Green:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Check if an element is in the HashSet
        if (colors.contains("Blue")) {
            System.out.println("\nThe set contains Blue");
        } else {
            System.out.println("\nThe set does not contain Blue");
        }

        // Add duplicate element to the HashSet
        colors.add("Red");
        System.out.println("\nAfter attempting to add duplicate Red:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Clear all elements from the HashSet
        colors.clear();
        System.out.println("\nAfter clearing, the set is empty: " + colors.isEmpty());
    }
}
