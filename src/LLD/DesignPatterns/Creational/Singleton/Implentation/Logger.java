package LLD.DesignPatterns.Creational.Singleton.Implentation;

public class Logger {
    private String name;
    private static Logger instance;

    private Logger(String name) {
        this.name = name;
    }

    public static Logger getInstance(String name) {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger(name);
                }
            }
        }
        return instance;
    }

    // Get the logger's name
    public String getName() {
        return name;
    }

    // Log a message
    public void log(String message) {
        System.out.println(name + ": " + message);
    }
}
