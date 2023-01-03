package multithreading;

public class Vehicle implements  Runnable {
    @Override
    public void run() {

    }


    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Thread myThread = new Thread();
        myThread.run();
        System.out.println("Thread is running....");
    }
}