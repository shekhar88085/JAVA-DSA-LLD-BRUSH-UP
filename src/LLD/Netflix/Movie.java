package LLD.Netflix;

import java.util.Date;
import java.util.List;

public class Movie {
    private int id;
    private String name;
    private String genre;
    private List<String> cast;
    private int viewCount;
    private Date releaseDate;
    private List<String> language;

    public Movie(int id, String name, String genre, List<String> cast, Date releaseDate, List<String> language) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.cast = cast;
        this.releaseDate = releaseDate;
        this.language = language;
        this.viewCount = 0;
    }
    
    String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Movie [id=" + id + ", name=" + name + ", genre=" + genre + ", cast=" + cast + ", viewCount=" + viewCount
                + ", releaseDate=" + releaseDate + ", language=" + language + "]";
    }

    void getDetails() {
        System.out.println(toString());
    }

    void increaseViewCount() {
        viewCount = viewCount + 1;
    }

    public String getGenre() {
        return genre;
    }
}
