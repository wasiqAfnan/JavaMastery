public class Multithreading02_threadLifeCycle {
    public static void main(String[] args) {
        /*
        The life cycle of a thread in Java refers to the various states a thread can be in during its lifetime, 
        from its creation to its termination. Understanding the thread life cycle is essential for effective 
        thread management and synchronization in Java multithreading. 
    
        1. New (or Born) State:
            When a thread is created using the `new` keyword or by instantiating a subclass of the `Thread` class,
            it enters the new state. In this state, the thread is initialized, but it has not yet started executing.

        2. Runnable State:
            Once the `start()` method is called on the thread object, the thread enters the runnable state. 
            In this state, the thread is eligible to run, but it may not be currently executing due to 
            scheduling by the operating system. Threads in the runnable state can be executing or waiting for 
            their turn to run.

        3. Running State:
            When the thread scheduler selects the thread for execution, it enters the running state. 
            In this state, the thread is actively executing its code, and CPU resources are allocated to it. 

        4. Blocked (or Waiting) State:
            A thread can transition to the blocked state if it is waiting for a certain condition to be 
            satisfied, such as acquiring a lock, input/output operations, or waiting for another thread to 
            complete. When a thread is blocked, it temporarily gives up the CPU resources until the condition 
            is met.

        5. Waiting State:
            Threads can enter the waiting state when they explicitly wait for a notification from another 
            thread using methods like `wait()` or `join()`. Threads in the waiting state remain inactive until 
            they receive a signal or notification to resume execution.

        6. Timed Waiting State:
            Similar to the waiting state, threads can also enter a timed waiting state using methods like 
            `sleep()` or `join()` with a specified timeout period. Threads in this state wait for the specified 
            time duration before resuming execution.

        7. Terminated (or Dead) State:
            A thread enters the terminated state when it completes its execution or explicitly terminates using
            the `stop()` method (which is deprecated and not recommended). Once in the terminated state, 
            a thread cannot be restarted, and its resources are released by the JVM.
        */
    }
}
