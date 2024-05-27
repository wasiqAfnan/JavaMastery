class MaxPriority extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Max Priotity Thread: "+i);
        }
        // getting priority if this thread
        System.out.println("Priority Level: " + getPriority());
    }
}

class MinPriority extends Thread{
    @Override
    public void run(){
        for(int j=1;j<=5;j++){
            System.out.println("Min Priotity Thread: "+j);
        }
        // getting priority if this thread
        System.out.println("Priority Level: " + getPriority());
    }
}
class AvgPriority extends Thread{
    @Override
    public void run(){
        for(int k=1;k<=5;k++){
            System.out.println("Avg Priotity Thread: "+k);
        }
        // getting priority if this thread
        System.out.println("Priority Level: " + getPriority());
    }

}

public class Multithreading04_threadPriority {
    public static void main(String[] args) {
        /*
         * In Java multithreading, thread priority is an attribute that determines the
         * relative importance of a thread compared to other
         * threads. Java threads can have priorities that affect the order in which
         * threads are scheduled for execution by the thread
         * scheduler. However, it's important to note that thread priority does not
         * guarantee the order of execution; it only suggests
         * to the scheduler which threads are more important.
         */

        /*
         * Thread priorities in Java are represented by integers. The priority value
         * ranges from 1 (minimum priority) to 10 (maximum priority).
         * Java defines three constants in the Thread class to represent standard
         * priority levels:
         * Thread.MIN_PRIORITY: 1
         * Thread.NORM_PRIORITY: 5 (default priority)
         * Thread.MAX_PRIORITY: 10
         */

        // creating ibjects of each class
        MaxPriority threadMax = new MaxPriority();
        MinPriority threadMin = new MinPriority();
        AvgPriority threadAvg = new AvgPriority();

        // assigning priorities to objects
        threadMax.setPriority(Thread.MAX_PRIORITY);
        threadMin.setPriority(Thread.MIN_PRIORITY);
        threadAvg.setPriority(Thread.NORM_PRIORITY);

        // running the threads
        threadMin.start();
        threadAvg.start();
        threadMax.start();
    }   
}