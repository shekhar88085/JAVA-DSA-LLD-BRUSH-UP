package LLD.DesignPatterns.Creational.Factory.Implementation;

public class Email implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("Sending notification as Email.");
    }
    
}
