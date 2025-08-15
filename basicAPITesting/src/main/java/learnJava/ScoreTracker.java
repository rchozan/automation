package learnJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreTracker {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int score = 0;
       boolean running = true;

        ArrayList<Integer> scoreHistroy = new ArrayList<>();
        scoreHistroy.add(score);

       while (running){
           System.out.println("\nChoose an option:");
           System.out.println("1.Add Point");
           System.out.println("2.Subtract Point");
           System.out.println("3.Reset Score");
           System.out.println("4.Show Score");
           System.out.println("5.Show score history");
           System.out.println("6.Exit");
           int choice =scanner.nextInt();
           System.out.println("Initial score:"+score);
           switch (choice){
               case 1:
                   score++;
                   scoreHistroy.add(score);
                   System.out.println("Added one point!");
                   System.out.println("New Score: " + score);
                    break;
               case 2:
                   score--;
                   scoreHistroy.add(score);
                   System.out.println("Subtracted one point!");
                   System.out.println("New Score: " + score);
                    break;
               case 3:
                   score = 0;
                   scoreHistroy.add(score);
                   System.out.println("Score reset to 0.");
                   System.out.println("New Score: " + score);
                   break;
               case 4:
                   System.out.println("Current Score: " + score);
                   System.out.println("New Score: " + score);
                   break;
               case 5:
                   System.out.println("Score History:");
                   for (int s : scoreHistroy){
                       System.out.println(s);
                   }
                   break;
               case 6:
                   running = false;
                   System.out.println("Exiting bye");
                   break;
               default:
                   System.out.println("Invalid Choice please try correct choice 1-5");

                   }
       }


    }


}
