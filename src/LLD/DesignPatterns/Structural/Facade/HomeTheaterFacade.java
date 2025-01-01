package LLD.DesignPatterns.Structural.Facade;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;
    private LightingSystem lightingSystem;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem, LightingSystem lightingSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.lightingSystem = lightingSystem;
    }

    public void startMovie(String movie) {
        System.out.println("Starting the movie...");
        lightingSystem.dimLights();
        projector.turnOn();
        projector.setWideScreenMode();
        soundSystem.turnOn();
        soundSystem.setVolume(5);
        dvdPlayer.turnOn();
        dvdPlayer.playMovie(movie);
    }

    public void endMovie() {
        System.out.println("Ending the movie...");
        dvdPlayer.stop();
        dvdPlayer.turnOff();
        projector.turnOff();
        soundSystem.turnOff();
        lightingSystem.restoreLights();
    }
}