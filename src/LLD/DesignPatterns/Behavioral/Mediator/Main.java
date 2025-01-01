package LLD.DesignPatterns.Behavioral.Mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new User1(chatRoom, "Alice");
        User user2 = new User2(chatRoom, "Bob");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);

        user1.sendMessage("Hello, Bob!");
        user2.sendMessage("Hello, Alice!");
    }
}