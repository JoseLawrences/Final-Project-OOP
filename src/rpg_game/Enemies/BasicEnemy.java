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
public  class BasicEnemy extends Character{
    
    public BasicEnemy(String Name, int hp, int maxHP, int attackPower, int defensePower){
        super(Name, hp, maxHP, attackPower, defensePower);
    }
    
    @Override
    public void useSpecialSkill(Character target){
        System.out.println(getName() + "used 'Basic Attack Plus' on " +  target.getName() + "!");
    }
    
    @Override
    public void apply   PassiveTrait(){
        System.out.println(getName() + "is too busy giving a shit lol.");
    }
}
