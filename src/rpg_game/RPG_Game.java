/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rpg_game;
import java.util.Random;    
import rpg_game.allies.Warrior;
import rpg_game.allies.Tank;
import rpg_game.Allies.Mage;
import rpg_game.allies.Healer;
import rpg_game.allies.Archer;
import rpg_game.enemies.BasicEnemy;
import rpg_game.enemies.EliteEnemyA;
import rpg_game.enemies.EliteEnemyB;
import rpg_game.enemies.BossEnemy;
import java.util.ArrayList;
/**
 *
 * @author 63927
 */
public class RPG_Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        ArrayList<Character> allies = new ArrayList<>();
        allies.add(new Warrior("Tao Pingheng"));
        allies.add(new Tank("Lotus Blossom The I"));
        allies.add(new Mage("Wanda Salem"));
        allies.add(new Healer("Soprano Stave"));
        allies.add(new Archer("Gumi Sakura"));
        
        ArrayList<Character> enemies = new ArrayList<>();
        enemies.add(new BasicEnemy("Buggy Matter", 4000, 4000, 800, 200));
        enemies.add(new BasicEnemy("Thorned Buggy Matter", 4000, 4000, 1200, 100));
        enemies.add(new BasicEnemy("Bulky Buggy Matter", 6000, 6000, 680, 400));
        enemies.add(new EliteEnemyA("The Shredder"));
        enemies.add(new EliteEnemyB("The Potent Branch"));
        enemies.add(new BossEnemy("entityTest_011", 25000, 25000, 1600, 500));
        
        // status effect check
        while (alliesAlive(allies) && enemiesAlive(enemies)){
            
            for(Character c : allies) c.updateStatuses();
             for(Character e : enemies) e.updateStatuses();
 
            int randomIndex = rand.nextInt(allies.size());
            Character chosenTarget = allies.get(randomIndex);
        }
    }
    
    public static boolean alliesAlive(ArrayList<Character> allies){
            for(Character c : allies){
                if(c.getHP() > 0){
                    return true;
                }
            }
            return false;
        }
        
        public static boolean enemiesAlive(ArrayList<Character> enemies){
            for(Character c: enemies){
                if(c.getHP() > 0){
                    return true;
                }
            }
            return false;
        }
}
