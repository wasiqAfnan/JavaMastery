/*
    LinkedList is also a part of the Java Collection Framework and implements both the List and 
    Deque interfaces. It uses a doubly-linked list to store elements. 

    Here are some key points about LinkedList:

    Node-Based Storage: Elements are stored in nodes, with each node containing a reference to the
    next and previous nodes.

    Efficient Insertions/Deletions: Adding or removing elements is efficient, especially at the 
    beginning or end of the list, as it only involves changing node references.

    Sequential Access: Provides efficient sequential access but is slower than ArrayList for 
    indexed access since it requires traversal from the beginning or end of the list.
    
    Insertion Order: Maintains the insertion order of elements.
    
    Usage: Suitable for scenarios where frequent insertions and deletions are required.
*/
import java.util.LinkedList;

public class LinkedList02 {
    public static void main(String[] args) {
        // Create a LinkedList to hold String elements
        LinkedList<String> animals = new LinkedList<>();

        // Add elements to the LinkedList
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");
        animals.add("Horse");

        // Access and print elements from the LinkedList
        System.out.println("Animals in the list:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        // Get and print the size of the LinkedList
        System.out.println("\nTotal number of animals: " + animals.size());

        // Add an element at the first position
        animals.addFirst("Elephant");
        System.out.println("\nAfter adding Elephant at the first position:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        // Add an element at the last position
        animals.addLast("Lion");
        System.out.println("\nAfter adding Lion at the last position:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        // Remove the first element
        animals.removeFirst();
        System.out.println("\nAfter removing the first element:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        // Remove the last element
        animals.removeLast();
        System.out.println("\nAfter removing the last element:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        // Get the first element
        String firstAnimal = animals.getFirst();
        System.out.println("\nThe first animal in the list is: " + firstAnimal);

        // Get the last element
        String lastAnimal = animals.getLast();
        System.out.println("The last animal in the list is: " + lastAnimal);

        // Clear all elements from the LinkedList
        animals.clear();
        System.out.println("\nAfter clearing, the list is empty: " + animals.isEmpty());
    }
}
