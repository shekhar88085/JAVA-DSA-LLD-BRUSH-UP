package LLD.StackOverFlow;

import java.util.Date;

public class Comment {
    private int id;
    private String commentText;
    private User author;
    private int upvotes;
    private int downvotes;
    private Date datePosted;

    // Constructor to initialize comment object
    public Comment(int id, String commentText, User author) {
        this.id = id;
        this.commentText = commentText;
        this.author = author;
        this.upvotes = 0;
        this.downvotes = 0;
        this.datePosted = new Date();  // Current date when the comment is posted
    }

    // Getter for comment text
    public String getCommentText() {
        return commentText;
    }

    // Getter for upvotes count
    public int getUpvotes() {
        return upvotes;
    }

    // Getter for downvotes count
    public int getDownvotes() {
        return downvotes;
    }

    // Getter for the date when the comment was posted
    public Date getDatePosted() {
        return datePosted;
    }

    // Method to upvote the comment
    public void upvote() {
        upvotes++;
        System.out.println("Comment got upvoted!");
    }

    // Method to downvote the comment
    public void downvote() {
        downvotes++;
        System.out.println("Comment got downvoted!");
    }

    // Method to edit the content of the comment
    public void editContent(String newContent) {
        this.commentText = newContent;
        System.out.println("Comment content got edited!");
    }

    // Method to display comment details in a readable format
    @Override
    public String toString() {
        return "Comment by " + author.getName() + " on " + datePosted + ": " + commentText + " [Upvotes: " + upvotes + ", Downvotes: " + downvotes + "]";
    }
}