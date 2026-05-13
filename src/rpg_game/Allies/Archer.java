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
public class Archer extends Character{
    public Archer(String Name){
        super(Name, 2600, 2600, 1080, 250);
    }
    
    @Override
    public void useSpecialSkill(Character target){
        System.out.println(getName() + "used 'Placeholder' on " + target.getName() + "!");
    }
    
    @Override
    public void applyPassiveTrait(){
        System.out.println(getName() + "has triggered 'Placeholder'. Hitting consecutive attacks on the same opponent will deal 35% more damage.");
    }
}
