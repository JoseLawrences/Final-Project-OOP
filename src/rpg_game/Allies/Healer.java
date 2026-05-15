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
public abstract class Healer extends Character{
    public Healer(String Name){
        super(Name, 2800, 2800, 720, 200);
    }
    
    @Override
    public void useSpecialSkill(Character target){
        System.out.println(getName() + "used 'Placeholder' on " + target.getName() + "!"); //apply 20% of max hp healing  on ally.
    }
    
    @Override
    public void applyPassiveTrait(){
        System.out.println(getName() + "has triggered 'Placeholder'."); //
    }
}
