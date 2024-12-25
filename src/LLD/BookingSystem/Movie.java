package LLD.BookingSystem;

import java.util.Date;
import java.util.List;

import LLD.BookingSystem.enums.Genre;
import LLD.BookingSystem.enums.Industry;
import LLD.BookingSystem.enums.Language;

public class Movie {
    private int id;
    private String movieName;
    private Genre genre;
    private Industry industry;
    private Date releaseDate;
    private Double totalCollection;
    private List<String> cast;
    private Double rating;
    private Language language;

    public Movie(int id, String movieName, Genre genre, Industry industry, Date releaseDate, List<String> cast,
            Double rating, Language language) {
        this.id = id;
        this.movieName = movieName;
        this.genre = genre;
        this.industry = industry;
        this.releaseDate = releaseDate;
        this.cast = cast;
        this.rating = rating;
        this.language = language;
        this.totalCollection = 0.0; // Assuming totalCollection starts at 0
    }

    // Method to get total collection
    public Double getCollection() {
        return totalCollection;
    }

    // Method to update the total collection (if new earnings come in)
    public void updateCollection(Double amount) {
        this.totalCollection += amount;
    }

    // Method to print the movie details
    public void getDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Genre: " + genre);
        System.out.println("Industry: " + industry);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Cast: " + String.join(", ", cast));
        System.out.println("Rating: " + rating);
        System.out.println("Language: " + language);
        System.out.println("Total Collection: " + totalCollection);
    }

    // Optionally, you could add a getter for rating or other fields if needed
    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }
}