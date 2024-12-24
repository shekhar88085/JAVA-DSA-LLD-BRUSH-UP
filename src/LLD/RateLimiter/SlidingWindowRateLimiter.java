package LLD.RateLimiter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class SlidingWindowRateLimiter extends RateLimiter {
    private int windowSize;
    private int requestLimit;
    private Map<String, Queue<Long>> userRequestTimestamps;

    public SlidingWindowRateLimiter(int windowSize, int requestLimit) {
        this.windowSize = windowSize;
        this.requestLimit = requestLimit;
        userRequestTimestamps = new HashMap<>();
    }

    @Override
    public synchronized boolean allowRequest(String userId) {
        long currentTime = System.currentTimeMillis();

        // Intialize the userRequestTimestamps queue if not already present
        userRequestTimestamps.putIfAbsent(userId, new LinkedList<>());
        Queue<Long> requestTimestamps = userRequestTimestamps.get(userId);

        // remove request out of window size
        while (!requestTimestamps.isEmpty() && currentTime - requestTimestamps.peek() > windowSize) {
            requestTimestamps.poll();
        }

        int currentCount = requestTimestamps.size();
        // if current windowSize is less than allowed, then let this request pass
        if (currentCount < requestLimit) {
            requestTimestamps.add(currentTime);
            return true;
        }
        return false;
    }

}
