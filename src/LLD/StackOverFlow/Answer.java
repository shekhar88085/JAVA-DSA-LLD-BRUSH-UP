package LLD.StackOverFlow;

public class Answer extends Post {

    private boolean isAccepted;

    // Constructor to initialize the Answer
    public Answer(int id, String title, User author, String content) {
        super(id, title, author, content);
        this.isAccepted = false;
    }

    public Answer(int id, String content, Question question, User user2) {
        //TODO Auto-generated constructor stub
        super(id, "title", user2, content);
        this.isAccepted = false;
    }

    // Method to mark the answer as accepted
    public void markAsAccepted() {
        isAccepted = true;
        System.out.println("Answer marked as accepted!");
    }

    @Override
    public String getTitle() {
        return "Answer: " + title;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    // Additional methods specific to answers
}