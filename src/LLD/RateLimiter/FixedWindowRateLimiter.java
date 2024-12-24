package LLD.RateLimiter;

import java.util.HashMap;
import java.util.Map;

public class FixedWindowRateLimiter extends RateLimiter {
    private int windowSize; // in MilliSeconds
    private int requestLimit;
    private Map<String, Integer> userRequestCount = new HashMap<>();
    private Map<String, Long> userWindowStart = new HashMap<>();

    public FixedWindowRateLimiter(int windowSize, int requestLimit) {
        this.windowSize = windowSize;
        this.requestLimit = requestLimit;
    }

    @Override
    public synchronized boolean allowRequest(String userId) {
        long currentTime = System.currentTimeMillis();
        userRequestCount.putIfAbsent(userId, 0);
        userWindowStart.putIfAbsent(userId, currentTime);

        long windowStart = userWindowStart.get(userId);
        // if current window time expires, reset to 0
        if (currentTime - windowStart > windowSize) {
            userRequestCount.put(userId, 1);
            userWindowStart.put(userId, currentTime);
            return true;
        }

        int currentCount = userRequestCount.get(userId);
        // if current count is less than limit then allow the request
        if (currentCount < requestLimit) {
            userRequestCount.put(userId, currentCount + 1);
            return true;
        }
        return false;
    }

}
