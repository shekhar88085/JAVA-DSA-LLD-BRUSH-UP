package LLD.Netflix;

import java.util.List;

public class Series {
    private int id;
    private String name;
    private List<Season> seasons;
    private String genre;

    public Series(int id, String name, List<Season> seasons, String genre) {
        this.id = id;
        this.name = name;
        this.seasons = seasons;
        this.genre = genre;
    }

    void addSeason(Season season) {
        seasons.add(season);
        System.out.println("Successfully added " + season.toString() + " to series " + name);
    }

    @Override
    public String toString() {
        return "Series [id=" + id + ", name=" + name + ", seasons=" + seasons + "]";
    }

    void getDetails() {
        System.out.println(toString());
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }
}
