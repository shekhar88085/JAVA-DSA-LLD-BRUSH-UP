package LLD.Netflix;

import java.util.Date;
import java.util.Objects;
import java.util.TreeMap;

public class WatchHistory {
    private int id;
    private TreeMap<Movie, Date> history;

    public WatchHistory(int id) {
        this.id = id;
        history = new TreeMap<>();
    }

    void getWatchHistory() {
        if (Objects.nonNull(history) && !history.isEmpty()) {
            System.out.println(history.toString());
        }
    }

    void addToWatchHistory(Movie movie) {
        Date date = new Date();
        history.put(movie, date);
        System.out.println("Movie " + movie.toString() + " added to watch history successfully");
    }

}
