package LLD.Netflix;

import java.util.List;

public class User {
    private int id;
    private String name;
    private Subscription subscription;
    private List<Movie> watchList;
    private WatchHistory watchHistory;

    public User(int id, String name, Subscription subscription) {
        this.id = id;
        this.name = name;
        this.subscription = subscription;
    }

    public String getName() {
        return name;
    }

    public void getSubscription() {
         subscription.getDetails();;
    }

    public void getWatchList() {
         System.out.println("User watch list: " + watchList.toString());
    }

    public void getWatchHistory() {
         watchHistory.getWatchHistory();
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", subscription=" + subscription + ", watchList=" + watchList
                + ", watchHistory=" + watchHistory + "]";
    }

}
