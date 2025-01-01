package LLD.DesignPatterns.Structural.Facade;

public class Projector {
    public void turnOn() {
        System.out.println("Projector turned on.");
    }

    public void setWideScreenMode() {
        System.out.println("Projector set to widescreen mode.");
    }

    public void turnOff() {
        System.out.println("Projector turned off.");
    }
}