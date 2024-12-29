package LLD.DesignPatterns.Creational.Factory.Implementation;

public class Push implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("Sending Notification as Push Notfication");
    }
}
