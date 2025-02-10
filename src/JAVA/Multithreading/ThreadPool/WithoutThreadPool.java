package JAVA.Multithreading.ThreadPool;

public class WithoutThreadPool {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(() -> {
                System.out.println("Task executed by " + Thread.currentThread().getName());
            });
            t.start();  // Creates a new thread every time!
        }
    }
}
