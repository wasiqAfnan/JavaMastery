/*
* What is a Priority Queue?
A Priority Queue is a type of queue in which each element is associated with a 
priority. In a regular queue, elements are processed in the order they arrive 
(FIFO: First-In-First-Out). However, in a Priority Queue, elements are processed
based on their priority. The element with the highest priority is processed first, 
regardless of the order in which it was added to the queue.

### Important Points about Priority Queue

1. **Natural Ordering vs Custom Comparator**:
   - By default, a `PriorityQueue` in Java orders its elements based on their 
   natural order. However, you can provide a custom comparator to define a 
   different priority order.

2. **No Strict FIFO**:
   - Unlike a normal queue, a priority queue does not strictly follow the FIFO order. The order of elements is determined by their priority.

3. **Use Cases**:
   - **Task Scheduling**: Where tasks need to be executed based on their urgency 
   or priority.
   - **Algorithm Optimization**: In algorithms like Dijkstra's shortest path, 
   where the next node to process is the one with the smallest tentative distance.

4. **Null Elements Not Allowed**:
   - Unlike some collections in Java, `PriorityQueue` does not allow `null` 
   elements, as `null` cannot be compared with other elements for ordering.


   ### Example Scenarios

1. **Normal Queue**:
   - **Ticketing System**: People are served in the order they arrive.
  
2. **Priority Queue**:
   - **Emergency Room**: Patients are treated based on the severity of their 
   condition, not the order they arrived.


### Difference Between Normal Queue and Priority Queue

**1. Ordering Principle**:
- A **Normal Queue** operates on the First-In-First-Out (FIFO) principle, 
meaning that elements are processed in the order they arrive. 
The first element added to the queue is the first one to be removed. 
This simple ordering mechanism is ideal for scenarios where the sequence of 
operations is essential, such as in task scheduling or line management systems.

- A **Priority Queue**, on the other hand, processes elements based on 
their priority rather than the order of arrival. Each element in a priority 
queue is associated with a priority level, and the element with the highest 
priority is processed first. This ordering principle is crucial in situations 
where certain tasks or data need to be handled before others, such as in 
emergency systems or certain algorithms like Dijkstra's shortest path.

**2. Implementation**:
- **Normal Queues** are typically implemented using arrays, linked lists, or 
circular buffers. These implementations are straightforward and efficient for the
FIFO ordering, with operations like enqueue (add) and dequeue (remove) being 
performed in constant time, O(1), in most cases.

- **Priority Queues** are usually implemented using binary heaps, which provide 
efficient insertion and removal operations with a time complexity of O(log n).
The heap structure allows the queue to maintain its ordering based on priority 
levels, making it suitable for more complex tasks where dynamic ordering is needed.

**3. Use Case**:
- **Normal Queues** are well-suited for scenarios where the order of processing 
is crucial and straightforward. Examples include task scheduling in operating 
systems, printing jobs in a printer queue, or customer service systems where 
requests are handled in the order they are received.

- **Priority Queues** are more appropriate in situations where some elements 
need to be processed ahead of others, regardless of their arrival order. 
They are commonly used in applications such as task management systems where 
urgent tasks need to be handled first, network packet scheduling where important 
data must be transmitted before less critical data, and in algorithmic solutions 
like A* and Dijkstra’s algorithm where the shortest or most optimal path needs to 
be calculated.

**4. Element Access and Processing**:
- In a **Normal Queue**, the element that has been in the queue the longest is 
the one that is processed next. This predictable behavior is ideal for situations 
where fairness or time-based processing is important.

- In a **Priority Queue**, the next element to be processed is the one with 
the highest priority, which might not be the element that has been in the queue 
the longest. This makes priority queues ideal for systems where the importance 
of processing certain elements outweighs the need for time-based fairness.

**5. Flexibility and Customization**:
- **Normal Queues** offer little flexibility in terms of ordering beyond FIFO.
They are simple and effective for many use cases but do not support scenarios 
where priority-based processing is required.

- **Priority Queues** provide greater flexibility through the use of custom 
comparators, allowing developers to define complex priority rules that dictate 
the order of processing. This makes them highly adaptable to a wide range of 
applications where custom priority schemes are necessary.

In summary, while normal queues are efficient and straightforward for time-based 
processing, priority queues offer advanced ordering mechanisms based on priority,
making them suitable for scenarios where some tasks or data need to take precedence 
over others.
*/

import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        priorityQueue.add(40);
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(30);

        // Display the priority queue
        System.out.println("PriorityQueue: " + priorityQueue);

        // Peek method
        int head = priorityQueue.peek();
        System.out.println("Head of the queue (using peek): " + head);

        // Poll method
        int polledElement = priorityQueue.poll();
        System.out.println("Polled element: " + polledElement);
        System.out.println("PriorityQueue after polling: " + priorityQueue);

        // Remove method
        boolean isRemoved = priorityQueue.remove(30);
        System.out.println("Is element 30 removed? " + isRemoved);
        System.out.println("PriorityQueue after removal: " + priorityQueue);

        // Check if an element is present
        boolean contains20 = priorityQueue.contains(20);
        System.out.println("Does the queue contain 20? " + contains20);

        // Size method
        int size = priorityQueue.size();
        System.out.println("Size of the queue: " + size);

        // Use iterator to traverse elements
        Iterator<Integer> iterator = priorityQueue.iterator();
        System.out.println("Elements in the queue using iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // Clear the queue
        priorityQueue.clear();
        System.out.println("PriorityQueue after clear(): " + priorityQueue);

        // Check if the queue is empty
        boolean isEmpty = priorityQueue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
    }
}
