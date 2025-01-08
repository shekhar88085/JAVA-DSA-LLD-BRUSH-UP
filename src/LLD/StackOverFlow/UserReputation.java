package LLD.StackOverFlow;

public class UserReputation {

    private int reputationPoints;

    // Constructor to initialize reputation with points
    public UserReputation(int initialPoints) {
        this.reputationPoints = initialPoints;
    }

    // Method to get the current reputation score
    public String getScore() {
        if (reputationPoints >= 1000) {
            return "High Reputation";
        } else if (reputationPoints >= 500) {
            return "Medium Reputation";
        } else if (reputationPoints >= 100) {
            return "Low Reputation";
        } else {
            return "New User";
        }
    }

    // Method to get the current reputation points
    public int getReputationPoints() {
        return reputationPoints;
    }

    // Method to increase reputation points (e.g., for upvotes on posts)
    public void increaseReputation(int points) {
        reputationPoints += points;
        System.out.println("Reputation increased by " + points + " points. Current reputation: " + reputationPoints);
    }

    // Method to decrease reputation points (e.g., for downvotes on posts)
    public void decreaseReputation(int points) {
        reputationPoints -= points;
        System.out.println("Reputation decreased by " + points + " points. Current reputation: " + reputationPoints);
    }

    // Method to update reputation points (can be used to update points after an event like accepting an answer)
    public void updateReputation(int points) {
        reputationPoints = points;
        System.out.println("Reputation updated. Current reputation: " + reputationPoints);
    }

}