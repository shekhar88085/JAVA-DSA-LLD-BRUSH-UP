package LLD.DesignPatterns.Creational.Factory.Implementation;

public class NotificationFactory {
    public static Notification createNotification(Type type) {
        switch (type) {
            case EMAIL:
                return new Email();
            case SMS:
                return new Sms();
            case PUSH:
                return new Push();
            default:
                throw new IllegalArgumentException("Invalid Notication type");
        }
    }
}
