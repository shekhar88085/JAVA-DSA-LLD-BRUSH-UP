package JAVA.Multithreading.DeadlockExample;

public class DeadlockDemo {
    public static void main(String[] args) {
        Resource resourceA = new Resource("Resource A");
        Resource resourceB = new Resource("Resource B");

        // Thread 1 tries to lock Resource A, then Resource B
        Thread t1 = new Thread(new DeadlockExample(resourceA, resourceB), "Thread-1");

        // Thread 2 tries to lock Resource B, then Resource A (opposite order)
        Thread t2 = new Thread(new DeadlockExample(resourceB, resourceA), "Thread-2");

        t1.start();
        t2.start();
    }
}