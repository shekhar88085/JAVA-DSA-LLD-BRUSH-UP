package LLD.StackOverFlow;

import java.util.List;

public class User {
    private int id;
    private String name;
    private String email;
    private UserReputation reputation;
    private List<Question> questionsAsked;
    private List<Answer> answersPosted;
    private List<Comment> commentsPosted;
    private List<Badge> badges;

    // Constructor
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Method to post a question
    void postQuestion(Question question) {
        System.out.println("Question: " + question.getQuestionText() + " asked by user: " + name);
        questionsAsked.add(question);
    }

    // Method to post an answer
    void postAnswer(Answer answer) {
        System.out.println("Answer: " + answer.getContent() + " posted by user: " + name);
        answersPosted.add(answer);
    }

    // Method to post a comment
    void postComment(Comment comment) {
        System.out.println("Comment: " + comment.getCommentText() + " posted by user: " + name);
        commentsPosted.add(comment);
    }

    // Method for upvoting a post (question or answer)
    void upvotePost(Post post) {
        post.addUpvote();
        System.out.println(name + " upvoted the post: " + post.getTitle());
    }

    // Method for downvoting a post (question or answer)
    void downvotePost(Post post) {
        post.addDownvote();
        System.out.println(name + " downvoted the post: " + post.getTitle());
    }

    // Method to earn a badge
    void earnBadge(Badge badge) {
        badges.add(badge);
        System.out.println(name + " earned a new badge: " + badge.getBadgeName());
    }

    // Method to get user details
    void getUserDetails() {
        System.out.println("User ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Reputation: " + reputation.getScore());
        System.out.println("Questions Asked: " + questionsAsked.size());
        System.out.println("Answers Posted: " + answersPosted.size());
        System.out.println("Comments Posted: " + commentsPosted.size());
        System.out.println("Badges: " + badges.size());
    }

    // Getter and Setter for User Reputation
    public UserReputation getReputation() {
        return reputation;
    }

    public void setReputation(UserReputation reputation) {
        this.reputation = reputation;
    }

    // Getter and Setter for the name
    public String getName() {
        return name;
    }

    // Getter for the email
    public String getEmail() {
        return email;
    }

    public  List<Badge> getBadges() {
        return badges;
    }

    // Additional methods can be added based on further requirements
}
