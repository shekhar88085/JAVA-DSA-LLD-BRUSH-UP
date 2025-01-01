package LLD.DesignPatterns.Creational.Factory.Implementation;

public class Sms implements Notification{

    @Override
    public void sendNotification() {
        System.out.println("Sending notification as SMS.");
    }
}
