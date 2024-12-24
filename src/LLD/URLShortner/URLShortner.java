package LLD.URLShortner;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class URLShortner {
    private static final String BASE_URL = "http://short.ly/";
    private Map<String, URLMapping> urlDatabase;
    private int counter;

    public URLShortner() {
        this.urlDatabase = new HashMap<>();
        this.counter = 1;
    }

    // Shorten URL
    public String shortenUrl(String originalUrl, int expiryMinutes) {
        String shortUrl = generateShortUrl();
        Date expiryTime = new Date(System.currentTimeMillis() + (expiryMinutes * 60 * 1000));
        URLMapping mapping = new URLMapping(shortUrl, originalUrl, expiryTime);
        urlDatabase.put(shortUrl, mapping);
        return shortUrl;
    }

    // Retrieve Original URL
    public String getOriginalUrl(String shortUrl) {
        if (!urlDatabase.containsKey(shortUrl)) {
            return "Error: URL not found!";
        }
        URLMapping mapping = urlDatabase.get(shortUrl);
        if (mapping.isExpired()) {
            urlDatabase.remove(shortUrl);
            return "Error: URL has expired!";
        }
        return mapping.getOriginalUrl();
    }

    // Generate Short URL
    private String generateShortUrl() {
        String encoded = base62Encode(counter);
        counter++;
        return BASE_URL + encoded;
    }

    // Base-62 Encoding
    private String base62Encode(int number) {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            result.append(characters.charAt(number % 62));
            number /= 62;
        }
        return result.reverse().toString();
    }
}
