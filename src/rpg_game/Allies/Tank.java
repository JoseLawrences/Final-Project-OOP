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
public class Tank extends Character{
    public Tank(String Name){
        super(Name,  5000, 5000, 800, 500);
    }
    
     @Override
    public void useSpecialSkill(Character target){
        System.out.println(getName() + "used 'Placeholder' on " + target.getName() + "!"); //Apply 15% defense boost to selected ally.
    }
    
    @Override
    public void applyPassiveTrait(){
        System.out.println(getName() + "Triggered 'Placeholder'"); // 40% defensePower boost when <30% HP
    }
}
