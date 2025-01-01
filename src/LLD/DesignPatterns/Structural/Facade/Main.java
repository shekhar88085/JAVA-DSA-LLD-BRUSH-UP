package LLD.DesignPatterns.Structural.Facade;

public class Main {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        LightingSystem lightingSystem = new LightingSystem();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem, lightingSystem);

        // User interacts with the facade
        homeTheater.startMovie("Inception");
        System.out.println();
        homeTheater.endMovie();
    }
}