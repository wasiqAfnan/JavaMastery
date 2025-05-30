// interface player{
//     //abstract function
//     void play();
//     void play2();
// }

// class Cricketer implements player{
//     public void play(){
//         System.out.println("this is play function");
//     }
//     public void play2(){
//         System.out.println("this is play2 function");
//     }
// }

// public class Interface06 {
//     public static void main(String[] args) {
//         Cricketer ck = new Cricketer();
//         ck.play();
//         ck.play2();
//     }
// }

interface Power {
    void powerOn();
    void powerOff();
}

interface Connenctivity {
    void connect();
    void disconnect();
}

class Smartphone implements Power, Connenctivity {
    public void powerOn() {
        System.out.println("Powerring on the Smartphone");
    }

    public void powerOff() {
        System.out.println("Powerring off the Smartphone");
    }

    public void connect() {
        System.out.println("Connected to the network");
    }

    public void disconnect() {
        System.out.println("Disconnected to the network");
    }

    public void message(){
        System.out.println("sending meassage");
    }
}

public class oop06_Interface {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone(); // Created object of the phone class
        phone.powerOn(); // Calling functions of interfaces
        phone.connect();
        phone.message();
        phone.disconnect();
        phone.powerOff();
    }
}