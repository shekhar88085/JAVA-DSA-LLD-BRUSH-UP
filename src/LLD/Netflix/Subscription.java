package LLD.Netflix;

import java.util.Date;

public class Subscription {
    private int id;
    private SubscriptionPlans planName;
    private Date boughtOn;
    private Date expiresOn;
    private int userId;

    public Subscription(int id, SubscriptionPlans planName, Date boughtOn, Date expiresOn, int userId) {
        this.id = id;
        this.planName = planName;
        this.boughtOn = boughtOn;
        this.expiresOn = expiresOn;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Subscription [id=" + id + ", planName=" + planName + ", boughtOn=" + boughtOn + ", expiresOn="
                + expiresOn + ", userId=" + userId + "]";
    }

    void getDetails(){
        System.out.println(toString());
    }

    void Subscribe() {
        System.out.println("Congratulations!!! You have successfully subscribed netflix " + planName.toString()
                + " plan on " + boughtOn + " and it will expires on " + expiresOn);
    }
}
