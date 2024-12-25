package LLD.RateLimiter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        RateLimiter fixedWindowRateLimiter = new FixedWindowRateLimiter(1000, 5); // 5 requests per second

        String userId = "User1";
        System.out.println("FIXED WINDOW: ");
        for (int i = 0; i < 100; i++) {
            System.out.println("Request " + (i + 1) + ": " + fixedWindowRateLimiter.allowRequest(userId));
            Thread.sleep(1); // 200ms delay between requests
        }

        // sliding window
        RateLimiter slidingWindowRateLimiter = new SlidingWindowRateLimiter(1000, 3); // 3 requests per second

        String user1 = "User1";
        String user2 = "User2";

        System.out.println("SLIDING WINDOW: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("User1 Request " + (i + 1) + ": " + slidingWindowRateLimiter.allowRequest(user1));
            System.out.println("User2 Request " + (i + 1) + ": " + slidingWindowRateLimiter.allowRequest(user2));
            Thread.sleep(200); // 200ms delay between requests
        }

        // token bucket
        System.out.println("TOKEN BUCKET: ");
        // Initialize Sliding Window Rate Limiter
        SlidingWindowRateLimiter rateLimiter = new SlidingWindowRateLimiter(1000, 5); // 5 requests per 1 second

        // Simulate 10 requests with varying delays
        for (int i = 0; i < 10; i++) {
            boolean allowed = rateLimiter.allowRequest(userId);
            System.out.println("Request " + (i + 1) + ": " + (allowed ? "Allowed" : "Denied"));
            
            // Varying delay between requests
            if (i < 5) {
                Thread.sleep(150); // 150ms delay
            } else {
                Thread.sleep(300); // 300ms delay
            }
        }
    }
}
