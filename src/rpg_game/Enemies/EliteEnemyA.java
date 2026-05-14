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
public class EliteEnemyA extends Character{
    public EliteEnemyA(String Name){
        super(Name, 10000, 10000, 1280, 300);
    }
    
    @Override
    public void useSpecialSkill(Character target){
        System.out.println(getName() + " used 'Draining Drill' on " +  target.getName() + "!");
        int damage = (int)(getAttackPower()*1.25);
        target.setHP(target.getHP() - damage);
        
       if(target.getVulnerableTurns() <= 0){
            target.setOriginalDefense(target.getDefensePower());
            int newDefense = (int)(target.getDefensePower() * 0.65);
            target.setDefensePower(newDefense);
       }
       
       target.setVulnerableTurns(3);
        System.out.println(target.getName() + " is vulnerable! They will take 35% more damage than usual.");
    }
    
    @Override
    public void applyPassiveTrait(){
        System.out.println(getName() + "is too busy giving a shit lol.");
    }
}
