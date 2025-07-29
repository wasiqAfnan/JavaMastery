// Shared Buffer class to hold the data
class Buffer {
    int item;             // Data to be shared
    boolean isProduced = false; // Flag to track if data is produced

    // Method for the producer to produce data
    synchronized void produceItem(int item) {
        if (isProduced) {
            try {
                wait();  // Wait if data is already produced
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        this.item = item;  // Set the data
        isProduced = true;  // Mark data as produced
        System.out.println("Produced: " + item);
        notify();  // Notify the consumer that data is ready
    }

    // Method for the consumer to consume data
    synchronized int consumeItem() {
        if (!isProduced) {
            try {
                wait();  // Wait if no data is produced
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Consumed: " + item);  // Consume the data
        isProduced = false;  // Mark data as consumed
        notify();  // Notify the producer to produce more data
        return item;
    }
}

// Producer class to produce data
class DataProducer extends Thread {
    Buffer buffer;
    
    DataProducer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produceItem(i);  // Produce 5 items
        }
    }
}

// Consumer class to consume data
class DataConsumer extends Thread {
    Buffer buffer;
    
    DataConsumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            buffer.consumeItem();  // Consume 5 items
        }
    }
}

// Main class to start the threads
public class ThreadCommunicationDemo {
    public static void main(String[] args) {
        Buffer sharedBuffer = new Buffer(); // Create shared buffer

        // Create producer and consumer threads
        DataProducer producer = new DataProducer(sharedBuffer);
        DataConsumer consumer = new DataConsumer(sharedBuffer);

        // Start the threads
        producer.start();
        consumer.start();
    }
}
