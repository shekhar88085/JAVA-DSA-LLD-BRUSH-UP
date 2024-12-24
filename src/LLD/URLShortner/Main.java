package LLD.URLShortner;

public class Main {
    public static void main(String[] args) {
        URLShortner shortener = new URLShortner();

        // Shorten a URL
        String shortUrl1 = shortener.shortenUrl("https://www.examplecvbnmnvcxdxfghbnbvghnbvf.com", 1); // Expires in 10 minutes
        System.out.println("Shortened URL: " + shortUrl1);

        // Retrieve Original URL
        String originalUrl1 = shortener.getOriginalUrl(shortUrl1);
        System.out.println("Original URL: " + originalUrl1);

        // Simulate Expiry (Optional for testing)
        try {
            Thread.sleep(1 * 60 * 1000); // Wait for 1 minutes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String expiredUrl = shortener.getOriginalUrl(shortUrl1);
        System.out.println("After expiry: " + expiredUrl);
    }
}
