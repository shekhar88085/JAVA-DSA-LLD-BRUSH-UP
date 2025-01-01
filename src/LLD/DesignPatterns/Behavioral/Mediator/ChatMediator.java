package LLD.DesignPatterns.Behavioral.Mediator;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}