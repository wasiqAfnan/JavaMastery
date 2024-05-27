class MyRunnable implements Runnable {
    @Override
    public void run() {
        // Printing the current thread's name
        System.out.println("Running thread: " + Thread.currentThread().getName());
    }
}

public class ThreadNameExample {
    public static void main(String[] args) {
        /**
         * In Java multithreading, each thread is represented by an instance of the
         * Thread class. Two useful methods for working with thread names are getName()
         * and setName(). These methods allow you to retrieve and set the name of a
         * thread, respectively. Thread names are useful for debugging and logging
         * purposes, as they can make it easier to identify and track the execution of
         * specific threads in a concurrent application.
         */

        // Creating a thread with a custom name
        Thread thread1 = new Thread(new MyRunnable(), "CustomThread-1");

        // Creating a thread without a custom name
        Thread thread2 = new Thread(new MyRunnable());
        // MyRunnable thread2 = new MyRunnable();--> this won't work
        
        // Displaying the names of the threads
        System.out.println("Thread 1 name: " + thread1.getName());
        System.out.println("Thread 2 name: " + thread2.getName());

        // Starting the threads
        thread1.start();
        thread2.start();

        // Changing the name of thread2
        thread2.setName("CustomThread-2");

        // Displaying the new name of thread2
        System.out.println("Thread 2 new name: " + thread2.getName());
    }
}


