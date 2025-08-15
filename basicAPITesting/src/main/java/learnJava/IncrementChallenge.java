package learnJava;

public class IncrementChallenge {

    public static void main(String[] args) {
        int x = 3;
        int y = x++ + ++x + --x + x--;
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }

}
