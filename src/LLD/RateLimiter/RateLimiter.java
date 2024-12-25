package LLD.RateLimiter;

public abstract class RateLimiter {
    public abstract boolean allowRequest(String userId);
}
