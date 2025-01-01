package LLD.Netflix;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusMonths(1);

        System.out.println();
        System.out.println();

        // Convert LocalDate to Date for compatibility
        Date startDateAsDate = Date.from(startDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date endDateAsDate = Date.from(endDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

        Subscription subscription = new Subscription(
                1,
                SubscriptionPlans.Annually,
                startDateAsDate,
                endDateAsDate,
                1);
        User user1 = new User(1, "Akash", subscription);
        subscription.getDetails();
        user1.getWatchHistory();
        user1.getWatchList();
    }
}
