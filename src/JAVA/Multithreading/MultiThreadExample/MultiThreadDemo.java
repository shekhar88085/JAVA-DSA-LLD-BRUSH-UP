package JAVA.Multithreading.MultiThreadExample;

public class MultiThreadDemo {
    public static void main(String[] args) {
        NewThread t1 = new NewThread("thread 1");
        NewThread t2 = new NewThread("thread 2");
        NewThread t3 = new NewThread("thread 3");

        System.out.println("Thread One is alive: "
                + t1.t.isAlive());
        System.out.println("Thread Two is alive: "
                + t2.t.isAlive());
        System.out.println("Thread Three is alive: "
                + t3.t.isAlive());
        // wait for threads to finish
        try {
            System.out.println("Waiting for threads to finish.");
            t1.t.join();
            t2.t.join();
            t3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Thread One is alive: "
                + t1.t.isAlive());
        System.out.println("Thread Two is alive: "
                + t2.t.isAlive());
        System.out.println("Thread Three is alive: "
                + t3.t.isAlive());
        System.out.println("Main thread exiting.");

        // try {
        // Thread.sleep(10000);
        // } catch (InterruptedException e) {
        // System.out.println(Thread.currentThread() + " got Interrupted");
        // }

        // System.out.println("Main thread Exiting");
    }
}
