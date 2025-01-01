package LLD.DesignPatterns.Behavioral.Mediator;

public abstract class User {
    protected ChatMediator chatMediator;
    protected String name;

    public User(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}