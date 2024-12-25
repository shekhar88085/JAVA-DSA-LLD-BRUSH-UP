package LLD.RateLimiter;

import java.util.HashMap;
import java.util.Map;

public class TokenBucketRateLimiter extends RateLimiter {
    private int bucketSize;
    private int refillRate; //Tokens per second
    private Map<String, Integer> userTokens = new HashMap<>();
    private Map<String, Long> userLastRefillTimestamp = new HashMap<>();

    public TokenBucketRateLimiter(int bucketSize, int refillRate) {
        this.bucketSize = bucketSize;
        this.refillRate = refillRate;
    }
    
    @Override
    public synchronized boolean allowRequest(String userId) {
        userTokens.putIfAbsent(userId, bucketSize);
        Long currentTime = System.currentTimeMillis();
        userLastRefillTimestamp.putIfAbsent(userId, currentTime);

        long lastRefillTimestamp = userLastRefillTimestamp.get(userId);
        int tokensToAdd = (int)((currentTime - lastRefillTimestamp) / 1000 * refillRate);// Calculate how many tokens to add based on the time elapsed and refill rate.
        int currentTokens = Math.min(bucketSize, userTokens.get(userId) + tokensToAdd);//// Update the current number of tokens by adding tokensToAdd but not exceeding bucketSize.

        userTokens.put(userId, currentTokens);
        userLastRefillTimestamp.put(userId, currentTime);

        if(currentTokens > 0){
            userTokens.putIfAbsent(userId, currentTokens - 1);
            return true;
        }

        return false;
    }
    
}
