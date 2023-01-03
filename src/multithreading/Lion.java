package multithreading;

public class Lion extends Thread {
   public void run(){
       System.out.println("Thread is running..");

    }
    public static void main(String[] args) {
        Lion l=new Lion();
        l.run();
        l.start();
    }
}
