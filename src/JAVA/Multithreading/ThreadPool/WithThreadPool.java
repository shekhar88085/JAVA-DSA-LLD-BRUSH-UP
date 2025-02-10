package JAVA.Multithreading.ThreadPool;

import java.util.concurrent.*;

public class WithThreadPool {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2); // 2 worker threads

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            pool.execute(() -> {
                System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName());
            });
        }

        // we can use cachedThreadPool too
        // If no free threads exist, new ones are created.
        // If a thread is idle, it is reused instead of creating a new one.

        ExecutorService cachedPool = Executors.newCachedThreadPool();

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            cachedPool.execute(() -> {
                System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName());
            });
        }

        cachedPool.shutdown();
        pool.shutdown(); // Shut down after tasks complete
    }
}
