package LLD.DesignPatterns.Behavioral.Command;

public class Main {
    public static void main(String[] args) {
        // Receiver
        Light livingRoomLight = new Light();

        // Command
        Command lightOn = new LightOnCommand(livingRoomLight);

        // Invoker
        RemoteController remote = new RemoteController();
        remote.setCommand(lightOn);

        // Execution
        remote.pressButton(); // The light is ON.
        remote.pressUndo();   // The light is OFF.
    }
}