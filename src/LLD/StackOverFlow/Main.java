package LLD.StackOverFlow;

public class Main {
    public static void main(String[] args) {
        // Create users
        User user1 = new User(1, "Alice", "alice@example.com");
        User user2 = new User(2, "Bob", "bob@example.com");

        // Create a question
        Question question = new Question(101,"title", user1, "What is the Singleton Design Pattern?");
        question.addTag(new Tag(1, "Design Pattern"));
        
        // User1 posts a question
        user1.postQuestion(question);
        
        // User2 posts an answer
        Answer answer = new Answer(201, "The Singleton Design Pattern ensures a class has only one instance and provides a global point of access to it.", question, user2);
        user2.postAnswer(answer);
        
        // User1 upvotes the answer
        user1.upvotePost(answer);
        
        // User2 downvotes the answer
        user2.downvotePost(answer);
        
        // User1 earns a badge
        Badge badge = new Badge(1, "Helpful Contributor", "Awarded for posting answers that get upvoted.", 5);
        user1.earnBadge(badge);

        // Display user details
        user1.getUserDetails();
        user2.getUserDetails();
        
        // Display question details
        System.out.println("Question: " + question.getQuestionText());
        System.out.println("Posted by: " + question.getAuthor().getName());
        System.out.println("Answers: " + question.getAnswers().size());
        System.out.println("Tags: " + question.getTags());
    }
}