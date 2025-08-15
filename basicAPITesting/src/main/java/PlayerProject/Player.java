package PlayerProject;

public class Player {
    // Player.java

    // Properties (Variables)
    String name;
    int score;

    // Constructor
    public Player(String playerName, int playerScore) {
        name = playerName;
        score = playerScore;
    }

    // Method to display Player details
    public void showInfo() {
        System.out.println("Player Name: " + name);
        System.out.println("Player Score: " + score);
    }
}

