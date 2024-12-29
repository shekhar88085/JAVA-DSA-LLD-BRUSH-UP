package LLD.Netflix;

import java.util.ArrayList;
import java.util.List;

public class MovieCatalogue {
    private int id;
    private List<Movie> movies;
    private List<Series> series;

    public MovieCatalogue(int id, List<Movie> movies, List<Series> series) {
        this.id = id;
        this.movies = movies != null ? movies : new ArrayList<>();
        this.series = series != null ? series : new ArrayList<>();
    }

    @Override
    public String toString() {
        return "MovieCatalogue [id=" + id + ", movies=" + movies + ", series=" + series + "]";
    }

    public void getDetails() {
        System.out.println(toString());
    }

    // Search for movies/series by genre and print results
    public void searchByGenre(String genre) {
        System.out.println("Searching for content by genre: " + genre);
        for (Movie movie : movies) {
            if (movie.getGenre().equalsIgnoreCase(genre)) {
                System.out.println("Movie Found: " + movie);
            }
        }
        for (Series series : this.series) {
            if (series.getGenre().equalsIgnoreCase(genre)) {
                System.out.println("Series Found: " + series);
            }
        }
    }

    // Search for movies/series by name and print results
    public void searchByName(String name) {
        System.out.println("Searching for content by name: " + name);
        for (Movie movie : movies) {
            if (movie.getName().equalsIgnoreCase(name)) {
                System.out.println("Movie Found: " + movie);
            }
        }
        for (Series series : this.series) {
            if (series.getName().equalsIgnoreCase(name)) {
                System.out.println("Series Found: " + series);
            }
        }
    }

    public void addMovie(Movie movie) {
        if (movie != null && !movies.contains(movie)) {
            movies.add(movie);
            System.out.println("Movie added successfully.");
        } else {
            System.out.println("Movie already exists in the catalogue.");
        }
    }

    public void addSeries(Series series) {
        if (series != null && !this.series.contains(series)) {
            this.series.add(series);
            System.out.println("Series added successfully.");
        } else {
            System.out.println("Series already exists in the catalogue.");
        }
    }
}