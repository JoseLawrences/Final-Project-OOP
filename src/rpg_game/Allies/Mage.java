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
public class Mage extends Character{
    public Mage(String Name){
        super(Name, 2400, 2400, 1440, 160);
    }
    
  @Override
    public void useSpecialSkill(Character target){
        System.out.println(getName() + "used 'Placeholder' on " + target.getName() + "!");
    }
    
    @Override
    public void applyPassiveTrait(){
        System.out.println(getName() + "has triggered 'Placeholder'. Their next attack will make an enemy deal 30% more damage for 2 turns."); //apply debuff to enemy when using any attack.
    }
}
