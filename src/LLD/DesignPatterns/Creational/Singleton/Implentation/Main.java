package LLD.DesignPatterns.Creational.Singleton.Implentation;

public class Main {
    public static void main(String[] args) {
        // Thread 1 creates the instance
        Thread t1 = new Thread(() -> {
            Logger logger = Logger.getInstance("ApplicationLogger");
            logger.log("name: " + logger.getName());
            logger.log("Log message from Thread 1");
        });

        // Thread 2 tries to create another instance
        Thread t2 = new Thread(() -> {
            Logger logger = Logger.getInstance("AppLogger");
            logger.log("name: " + logger.getName());
            logger.log("Log message from Thread 2");
        });

        t1.start();
        t2.start();
    }
}