class A extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("i=" + i);
        }
    }
}

class B extends Thread {
    @Override
    public void run() {
        for (int j = 0; j <= 5; j++) {
            System.out.println("j=" + j);
        }
    }
}

class C extends Thread {
    @Override
    public void run() {
        for (int k = 0; k <= 5; k++) {
            System.out.println("k=" + k);
        }
    }
}

public class Multithreading01_basics {
    /**
     * What is multithreading?
     * Multithreading in Java allows multiple threads to execute concurrently within the same program,
     * enabling more efficient utilization of CPU resources and better responsiveness in applications. 
     * Java provides built-in support for multithreading through its Thread class and related APIs.
     * 
     * Thread Class:
        The Thread class in Java represents a thread of execution. It encapsulates the code that will run 
        concurrently with other threads in the application. To create a new thread, you typically extend the 
        Thread class and override its run() method to define the task or code that the thread will execute.

     * run() Method:
        The run() method is a crucial part of any thread in Java. It contains the code that the thread will 
        execute when started. You override this method in your custom Thread subclass to define the specific 
        behavior of the thread. Inside the run() method, you put the code that you want to run concurrently in 
        the new thread.
    
     * start() Method:
        The start() method is used to begin the execution of a thread. When you call start() on a Thread object,
        it initiates the execution of the run() method in a separate thread of control. It's important to note 
        that you should never directly call the run() method on a Thread object because doing so will not start
        a new thread; it will simply execute the run() method in the current thread.

     */

    public static void main(String[] args) {
        new A().start();
        new B().start();
        new C().start();
    }
}
