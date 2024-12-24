package LLD.URLShortner;

import java.util.Date;

public class URLMapping {
    private String shortUrl;
    private String originalUrl;
    private Date createdAt;
    private Date expiryTime;

    public URLMapping(String shortUrl, String originalUrl, Date expiryTime) {
        this.shortUrl = shortUrl;
        this.originalUrl = originalUrl;
        this.createdAt = new Date();
        this.expiryTime = expiryTime;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public boolean isExpired() {
        return new Date().after(expiryTime);
    }
}
