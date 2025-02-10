package JAVA.Multithreading.MultiThreadExample;

public class NewThread implements Runnable {

    Thread t;
    String name;
    public NewThread(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("New Thread:" + t);
        t.start();
    }



    @Override
    public void run() {
        try {
            for(int i = 1;i <= 5; i++){
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " Interrupted");
        }
        System.out.println("Exiting: " + name);
    }
}
