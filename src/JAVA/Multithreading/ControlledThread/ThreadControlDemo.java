package JAVA.Multithreading.ControlledThread;

public class ThreadControlDemo {
    public static void main(String[] args) {
        ControlledThread thread = new ControlledThread("Demo Thread");

        try {
            Thread.sleep(2000);
            System.out.println("Suspending thread...");
            thread.suspendThread();

            Thread.sleep(2000);
            System.out.println("Resuming thread...");
            thread.resumeThread();

            Thread.sleep(2000);
            System.out.println("Stopping thread...");
            thread.stopThread();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}