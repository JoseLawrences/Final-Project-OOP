/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg_game.Enemies;
import rpg_game.Character;
/**
 *
 * @author 63927
 */
public class EliteEnemyB extends Character {
    public EliteEnemyB(String Name){
        super(Name, 10000, 10000, 1280, 300);
    }
    
    @Override
    public void useSpecialSkill(Character target){
        System.out.println(getName() + "used 'Decaying Puncture' on " +  target.getName() + "!");
        int damage = (int)(getAttackPower() * 1.2);
        target.setHP(target.getHP() -  damage);
        
        target.setPoisonedTurns(3);
    }
    
    @Override
    public void applyPassiveTrait(){
        System.out.println(getName() + "is too busy giving a shit lol.");
    }
}
