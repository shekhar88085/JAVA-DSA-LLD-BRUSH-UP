package LLD.StackOverFlow;

public class Tag {

    private int id;
    private String name;

    // Constructor to initialize the Tag object
    public Tag(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Method to display the tag's details
    public void displayTagDetails() {
        System.out.println("Tag: " + name);
    }
}
