package PlayerGameProject;

import java.util.Random;

public class Player {

    String name;
    int health;
    Random rand = new Random();

    //constructor
    public Player(String name ) {
        this.name = name;
        this.health = 100; //all players starts with this points
    }
    //Attack another player
    public void attack(Player opponent){
        int damage = rand.nextInt(20)+10;
//        opponent.health = damage;
//        if opponent.health < 0{
//            opponent.health = 0; //Health should not go negative
//                }
        System.out.println(this.name + " attacks" + opponent.name + " for " + damage + " damage!");
    }
    // show current health
    public void showStatus(){
        System.out.println(name + " Health: "+ health);
    }
}
