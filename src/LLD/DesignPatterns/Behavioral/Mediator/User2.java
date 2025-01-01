package LLD.DesignPatterns.Behavioral.Mediator;

public class User2 extends User {

    public User2(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + " is sending message: " + message);
        chatMediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " received message: " + message);
    }
}