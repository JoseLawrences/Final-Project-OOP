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
public class EliteEnemy extends Character{
    public EliteEnemy(String Name){
        super("BadEnemy", 10000, 10000, 1280, 300);
    }
    
    @Override
    public void useSpecialSkill(Character target){
        System.out.println(getName() + "used 'Basic Attack Plus' on " +  target.getName() + "!");
    }
    
    @Override
    public void applyPassiveTrait(){
        System.out.println(getName() + "is too busy giving a shit lol.");
    }
}
