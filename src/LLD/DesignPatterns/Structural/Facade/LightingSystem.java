package LLD.DesignPatterns.Structural.Facade;

public class LightingSystem {
    public void dimLights() {
        System.out.println("Lights dimmed for the movie.");
    }

    public void restoreLights() {
        System.out.println("Lights restored to normal brightness.");
    }
}