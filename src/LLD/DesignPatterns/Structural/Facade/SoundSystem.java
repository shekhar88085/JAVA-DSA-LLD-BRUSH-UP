package LLD.DesignPatterns.Structural.Facade;

public class SoundSystem {
    public void turnOn() {
        System.out.println("Sound system turned on.");
    }

    public void setVolume(int level) {
        System.out.println("Sound system volume set to " + level + ".");
    }

    public void turnOff() {
        System.out.println("Sound system turned off.");
    }
}