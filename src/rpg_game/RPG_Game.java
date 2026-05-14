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
        enemies.add(new BossEnemy("entityTest_011"));
        
        int randomIndex = rand.nextInt(allies.size());
        Character chosenTarget = allies.get(randomIndex);
        
        while (partyIsAlive(allies) && enemiesAreAlive(enemies)){
            
            for(Character c : allies){
                if (c.getVulnerableTurns() > 0){
                    c.setVulnerableTurns(c.getVulnerableTurns() - 1);
                    
                    if(c.getVulnerableTurns() == 0){
                        c.setDefensePower(c.getOriginalDefense());
                        c.setOriginalDefense(-1);
                        System.out.println(c.getName() + " is no longer vulnerable!");
                    }
                }
            }
        }
        
        
    }
    
}
