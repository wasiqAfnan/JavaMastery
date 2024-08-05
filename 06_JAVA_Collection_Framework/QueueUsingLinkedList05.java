/*
### Queue Data Structure in Java Collection Framework
In the Java Collection Framework, the `Queue` is a linear data structure that 
follows the **First-In-First-Out (FIFO)** principle, where the first element 
added to the queue is the first one to be removed. Think of a queue like 
a line of people waiting for a service—those who come first are served first.


### Advantages of Using a Queue in the Collection Framework

1. **Simplicity and Intuitiveness**:
   - The queue interface provides an easy-to-understand and straightforward API
    for common operations like enqueueing, dequeueing, and peeking, 
    making it intuitive for developers to use.

2. **Flexible Implementations**:
   - The `Queue` interface can be implemented using various classes like 
   `LinkedList`, `PriorityQueue`, and `ArrayDeque`, allowing you to choose 
   the most suitable implementation based on your specific use case.

3. **FIFO Principle**:
   - The FIFO order is ideal for scenarios like task scheduling, 
   order processing, and managing resources where the order of operations 
   is important.

4. **Thread-Safe Variants**:
   - Java provides thread-safe implementations of queues, such as 
   `ConcurrentLinkedQueue` and `BlockingQueue`, which are useful in 
   concurrent programming and multithreaded environments.

5. **Efficient Operations**:
   - Queue operations such as insertion, deletion, and access to the front 
   element are generally efficient, often with constant time complexity, 
   especially in `LinkedList` and `ArrayDeque`.

6. **Support for Priority**:
   - The `PriorityQueue` implementation allows elements to be ordered 
   based on priority rather than insertion order, which is useful for 
   tasks like job scheduling where certain tasks have higher priority.

### When to Use a Queue

Queues are particularly useful in scenarios like:
- **Task Scheduling**: Where tasks are processed in the order they arrive.
- **Breadth-First Search (BFS)** in graph algorithms.
- **Resource Management**: Like printer task scheduling, CPU task scheduling, etc.
- **Asynchronous Data Processing**: Where you have producer-consumer patterns.
 */

import java.util.LinkedList;
import java.util.Queue;


public class QueueUsingLinkedList05 {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue: Adding elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        // Display the queue
        System.out.println("Queue: " + queue);

        // Offer method
        boolean wasAdded = queue.offer(50);
        System.out.println("Was the element 50 added? " + wasAdded);
        System.out.println("Queue after offer: " + queue);

        // Poll method: Removes and returns the front element, returns null if empty
        Integer polledElement = queue.poll();
        System.out.println("Polled Element using poll(): " + polledElement);
        System.out.println("Queue after poll: " + queue);

        // Peek method: Retrieves the front element without removing, returns null if empty
        Integer peekedElement = queue.peek();
        System.out.println("Peeked Element using peek(): " + peekedElement);
        System.out.println("Queue after peek: " + queue);

        // Remove method: Removes and returns the front element, throws exception if empty
        int removedElement = queue.remove();
        System.out.println("Removed Element using remove(): " + removedElement);
        System.out.println("Queue after remove: " + queue);

        // Element method: Retrieves the front element without removing, throws exception if empty
        int frontElement = queue.element();
        System.out.println("Front Element using element(): " + frontElement);

        // Size method: Returns the number of elements in the queue
        int size = queue.size();
        System.out.println("Queue Size: " + size);

        // Contains method: Checks if the queue contains a specific element
        boolean contains30 = queue.contains(30);
        System.out.println("Does the queue contain 30? " + contains30);

        // Clear method: Removes all elements from the queue
        queue.clear();
        System.out.println("Queue after clear(): " + queue);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
    }
}

