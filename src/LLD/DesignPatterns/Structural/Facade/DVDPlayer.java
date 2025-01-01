package LLD.DesignPatterns.Structural.Facade;

public class DVDPlayer {
    public void turnOn() {
        System.out.println("DVD Player turned on.");
    }

    public void playMovie(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void stop() {
        System.out.println("DVD Player stopped.");
    }

    public void turnOff() {
        System.out.println("DVD Player turned off.");
    }
}