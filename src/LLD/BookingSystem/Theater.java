package LLD.BookingSystem;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private int id;
    private String name;
    private String location;
    private int numberOfScreens;
    private int seatsPerScreen;
    private List<Show> totalShowWithMovieDetails;

    public Theater(int id, String name, String location, int numberOfScreens, int seatsPerScreen) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.numberOfScreens = numberOfScreens;
        this.seatsPerScreen = seatsPerScreen;
        this.totalShowWithMovieDetails = new ArrayList<>();
    }

    public boolean addMovie(Movie movie) {
        // Logic to prevent duplicate movies
        for (Show show : totalShowWithMovieDetails) {
            if (show.getMovieId() == movie.getId()) {
                System.out.println("Movie is already scheduled in this theater.");
                return false;
            }
        }
        return true;
    }

    public boolean addShowWithMovie(List<Show> shows) {
        // Validate and add shows to the theater
        for (Show show : shows) {
            if (!isShowValid(show)) {
                System.out.println("Show conflicts with an existing schedule.");
                return false;
            }
            totalShowWithMovieDetails.add(show);
        }
        System.out.println("Shows added successfully!");
        return true;
    }

    private boolean isShowValid(Show newShow) {
        // Validate if the new show's timing conflicts with existing ones
        for (Show existingShow : totalShowWithMovieDetails) {
            if (existingShow.getScreenId() == newShow.getScreenId() &&
                    !(newShow.getEndTime().before(existingShow.getShowTime()) ||
                            newShow.getShowTime().after(existingShow.getEndTime()))) {
                return false;
            }
        }
        return true;
    }

    public int getAvailableSeats(int screenId) {
        // Logic to return available seats for a particular screen
        for (Show show : totalShowWithMovieDetails) {
            if (show.getScreenId() == screenId) {
                return show.getAvailableSeats();
            }
        }
        System.out.println("No such screen or show found!");
        return 0;
    }

    public void getListOfShows() {
        for (Show show : totalShowWithMovieDetails) {
            show.getDetails();
        }
    }

    // Getter and Setter methods for Theater fields
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfScreens() {
        return numberOfScreens;
    }

    public int getSeatsPerScreen() {
        return seatsPerScreen;
    }
}