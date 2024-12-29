package LLD.DesignPatterns.Creational.Factory.Implementation;

public class Main {
    public static void main(String[] args) {
        Notification emailNotification = NotificationFactory.createNotification(Type.EMAIL);
        emailNotification.sendNotification(); // Output: Sending notification as Email.

        Notification smsNotification = NotificationFactory.createNotification(Type.SMS);
        smsNotification.sendNotification(); // Output: Sending notification as SMS.

        Notification pushNotification = NotificationFactory.createNotification(Type.PUSH);
        pushNotification.sendNotification(); // Output: Sending Notification as Push Notification.
    
    }
}
