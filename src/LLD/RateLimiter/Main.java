package LLD.RateLimiter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        RateLimiter fixedWindowRateLimiter = new FixedWindowRateLimiter(1000, 5); // 5 requests per second

        String userId = "User1";
        for (int i = 0; i < 100; i++) {
            System.out.println("Request " + (i + 1) + ": " + fixedWindowRateLimiter.allowRequest(userId));
            Thread.sleep(1); // 200ms delay between requests
        }

        //sliding window
        RateLimiter slidingWindowRateLimiter = new SlidingWindowRateLimiter(1000, 3); // 3 requests per second

        String user1 = "User1";
        String user2 = "User2";

        for (int i = 0; i < 5; i++) {
            System.out.println("User1 Request " + (i + 1) + ": " + slidingWindowRateLimiter.allowRequest(user1));
            System.out.println("User2 Request " + (i + 1) + ": " + slidingWindowRateLimiter.allowRequest(user2));
            Thread.sleep(200); // 200ms delay between requests
        }
    }
}
