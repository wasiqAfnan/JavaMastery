// Class representing a thread-safe counter

class Counter {
    int count = 0;

    // Synchronized method to ensure one thread at a time
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

// Thread task that increments the counter 1000 times
class CounterTask extends Thread {
    Counter counter;

    public CounterTask(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class MultiThreading06_Synchronized {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create two threads that share the same counter object
        CounterTask t1 = new CounterTask(counter);
        CounterTask t2 = new CounterTask(counter);

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Final counter value should be 2000 (1000 + 1000)
        System.out.println("Final Counter Value: " + counter.getCount());
    }
}
