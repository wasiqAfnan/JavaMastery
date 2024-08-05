/*
    Introduction to TreeSet

    `TreeSet` is a part of the Java Collections Framework and implements the `NavigableSet` interface, which is a sub-interface of the `SortedSet` interface. It is used to store elements in a sorted and navigable set. The elements in a `TreeSet` are ordered according to their natural ordering, or by a comparator provided at set creation time, depending on which constructor is used.

    Features of TreeSet

1. **Sorted Order**: 
   - `TreeSet` maintains its elements in ascending order by default. This order is either the natural ordering of the elements or determined by a comparator specified at set creation time.

2. **No Duplicates**: 
   - It does not allow duplicate elements. If an attempt is made to add an element that already exists in the set, the add operation will not alter the set.

3. **NavigableSet Interface**: 
   - Provides navigation methods such as `lower()`, `floor()`, `ceiling()`, and `higher()` to find elements relative to a given element.
   - Also includes methods like `pollFirst()` and `pollLast()` to retrieve and remove the first and last elements of the set.

4. **Performance**: 
   - The `TreeSet` class is implemented using a `TreeMap`. Hence, the operations like add, remove, and search have a time complexity of O(log n).\

 */

import java.util.TreeSet;

public class TreeSet04 {
    public static void main(String[] args) {
        // Create a TreeSet of Strings
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Mango");
        treeSet.add("Grapes");

        // Displaying the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Checking if an element exists
        boolean containsApple = treeSet.contains("Apple");
        System.out.println("TreeSet contains Apple: " + containsApple);

        // Removing an element
        treeSet.remove("Banana");
        System.out.println("TreeSet after removing Banana: " + treeSet);

        // Iterating through the TreeSet
        System.out.println("Iterating through the TreeSet:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

        // Getting the first and last elements
        String firstElement = treeSet.first();
        String lastElement = treeSet.last();
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);
    }
}

