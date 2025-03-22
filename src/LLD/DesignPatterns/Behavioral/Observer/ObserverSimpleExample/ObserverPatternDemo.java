package LLD.DesignPatterns.Behavioral.Observer.ObserverSimpleExample;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        Observer user1 = new User("Alice");
        Observer user2 = new User("Bob");

        notificationService.subscribe(user1);
        notificationService.subscribe(user2);

        // Send notification
        notificationService.notifyObservers("New Video Uploaded!");

        // Unsubscribe Bob and send another notification
        notificationService.unsubscribe(user2);
        notificationService.notifyObservers("Live Stream Starting Soon!");
    }
}