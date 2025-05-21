class MyMultithread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i=" + i);
            if (i == 3) {
                Thread.yield();
            }
        }
        System.out.println("End of i");
    }
}

class MyMultithread0 extends Thread {
    @Override
    public void run(){
        for(int j=1;j<=5;j++){
            System.out.println("j="+j);
            if(j == 4){
                try{
                    Thread.sleep(5000);
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("End of j");
    }
}

class MyMultithread1 extends Thread {
    @Override
    public void run(){
        for(int k=1;k<=5;k++){
            System.out.println("k="+k);
            if(k == 3){
                break;
            }
        }
        System.out.println("End of k");
    }
}

public class Multithreading03_threadLifeCycleExample {
    public static void main(String[] args) {
        MyMultithread i = new MyMultithread();
        MyMultithread0 j = new MyMultithread0();
        MyMultithread1 k = new MyMultithread1();

        i.start();
        j.start();
        k.start();
    }
}
