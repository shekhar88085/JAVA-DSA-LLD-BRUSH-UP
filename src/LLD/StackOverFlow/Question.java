package LLD.StackOverFlow;

import java.util.ArrayList;
import java.util.List;

public class Question extends Post {

    private List<Answer> answers;
    private Answer acceptedAnswer;
    private List<Tag> tags;
    private boolean isClosed;
    private String questionText;

    // Constructor to initialize the Question
    public Question(int id, String title, User author, String questionText) {
        super(id, title, author, questionText);  // Calling parent constructor
        this.answers = new ArrayList<>();
        this.tags = new ArrayList<>();
        this.isClosed = false;
        this.questionText = questionText;
    }

    // Method to add an answer to the question
    public void addAnswer(Answer answer) {
        answers.add(answer);
    }

    // Method to accept an answer
    public void acceptAnswer(Answer answer) {
        acceptedAnswer = answer;
        System.out.println("Answer marked as accepted!");
    }

    @Override
    public String getTitle() {
        return "Question: " + title;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public Answer getAcceptedAnswer() {
        return acceptedAnswer;
    }

    public List<Tag> getTags() {
        return tags;
    }

    // Method to add tags to the question
    public void addTag(Tag tag) {
        tags.add(tag);
    }

    public boolean isClosed() {
        return isClosed;
    }

    public String getQuestionText() {
        return questionText;
    }

    // Method to close the question
    public void closeQuestion() {
        this.isClosed = true;
        System.out.println("Question has been closed!");
    }
}