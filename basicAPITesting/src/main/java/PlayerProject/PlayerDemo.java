package PlayerProject;

public class PlayerDemo {
    public static void main(String[] args) {
        // Create players using constructor
        Player p1 = new Player("Virat", 50);
        Player p2 = new Player("Messi", 80);
        Player p3 = new Player("Ronaldo", 75);

        // Show player information
        p1.showInfo();
        System.out.println("-------------");
        p2.showInfo();
        System.out.println("-------------");
        p3.showInfo();
    }
}

