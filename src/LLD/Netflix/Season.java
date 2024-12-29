package LLD.Netflix;

import java.util.List;

public class Season {
    private int id;
    private int seasonNumber;
    private List<Movie> movies;

    public Season(int id, int seasonNumber, List<Movie> movies) {
        this.id = id;
        this.seasonNumber = seasonNumber;
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Season [id=" + id + ", seasonNumber=" + seasonNumber + ", movies=" + movies + "]";
    }

    void getDetails() {
        System.out.println(toString());
    }

    void addMovie(Movie movie) {
        movies.add(movie);
        System.out.println("SuccessFully added  movie " + movie.toString() + " to this season");
    }
}
