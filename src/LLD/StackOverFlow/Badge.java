package LLD.StackOverFlow;

public class Badge {
    private int id;
    private String name;
    private String description;
    private int requiredReputation;

    // Constructor to initialize Badge object
    public Badge(int id, String name, String description, int requiredReputation) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.requiredReputation = requiredReputation;
    }

    // Getter for badge name
    public String getBadgeName() {
        return name;
    }

    // Getter for badge description
    public String getDescription() {
        return description;
    }

    // Getter for required reputation
    public int getRequiredReputation() {
        return requiredReputation;
    }

    // Method to assign badge to user if they have enough reputation
    public void assignToUser(User user) {
        if (user.getReputation().getReputationPoints() >= requiredReputation) {
            user.getBadges().add(this);
            System.out.println("Badge " + name + " assigned to " + user.getName());
        } else {
            System.out.println(user.getName() + " does not have enough reputation to earn the " + name + " badge.");
        }
    }

    // To represent badge details in string format
    @Override
    public String toString() {
        return "Badge: " + name + " (" + description + "), Required Reputation: " + requiredReputation;
    }
}
