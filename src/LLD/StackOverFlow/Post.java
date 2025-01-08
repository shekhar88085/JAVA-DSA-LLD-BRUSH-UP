package LLD.StackOverFlow;

public abstract class Post {

    protected int id;
    protected String title;
    protected User author;
    protected int upvotes;
    protected int downvotes;
    protected String content;

    // Constructor to initialize post with title and author
    public Post(int id, String title, User author, String content) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.content = content;
        this.upvotes = 0;
        this.downvotes = 0;
    }

    // Method to upvote the post
    public void addUpvote() {
        upvotes++;
        System.out.println("Post upvoted! Current upvotes: " + upvotes);
    }

    // Method to downvote the post
    public void addDownvote() {
        downvotes++;
        System.out.println("Post downvoted! Current downvotes: " + downvotes);
    }

    // Abstract method to get the title of the post
    public abstract String getTitle();

    // Getters for content and author
    public String getContent() {
        return content;
    }

    public User getAuthor() {
        return author;
    }

    // Method to display post details
    public void displayPostDetails() {
        System.out.println("Post ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
        System.out.println("Upvotes: " + upvotes);
        System.out.println("Downvotes: " + downvotes);
    }
}
