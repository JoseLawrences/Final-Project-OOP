/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg_game.Allies;

import rpg_game.Character;

/**
 *
 * @author 63927
 */
public class Warrior extends Character{
    public Warrior(String Name){
        super(Name, 3600, 3600, 1280, 200);
    }
    
    @Override
    public void useSpecialSkill(Character target){
        System.out.println(getName() + "used 'Placeholder' on " + target.getName() + "!"); //bigger damage
    }
    
    @Override
    public void applyPassiveTrait(){
        System.out.println(getName() + "has triggered 'Retribution'. Their next attack will deal 50% more damage!"); //next turn damage buffed by 50% when attacked
    }
}
