/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rpg_game;
import java.util.Random;    
import rpg_game.Allies.Warrior;
import rpg_game.Allies.Tank;
import rpg_game.Allies.Mage;
import rpg_game.Allies.Healer;
import rpg_game.Allies.Archer;
import rpg_game.Enemies.BasicEnemy;
import rpg_game.Enemies.EliteEnemyA;
import rpg_game.Enemies.EliteEnemyB;
import rpg_game.Enemies.BossEnemy;
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
            
            for(Character c : allies){
                if (c.getVulnerableTurns() > 0){
                    c.setVulnerableTurns(c.getVulnerableTurns() - 1);
                    
                    if(c.getVulnerableTurns() == 0){
                        c.setDefensePower(c.getOriginalDefense());
                        c.setOriginalDefense(-1);
                        System.out.println(c.getName() + " is no longer vulnerable!");
                    }
                }
                
                if(c.getPoisonedTurns() > 0){
                    int poisonDamage = (int)(c.getMaxHP() * 0.025);
                    c.setHP(c.getHP() - poisonDamage);
                    if(c.getHP() < 0) c.setHP(0);
                    System.out.println(c.getName() + " suffered some poison damage");
                    c.setPoisonedTurns(c.getPoisonedTurns() - 1);
                    
                    if (c.getPoisonedTurns() == 0){
                        System.out.println(c.getName() + " is now free from poison!");
                    }
                }
            }
 
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
