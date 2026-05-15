/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg_game.Allies;

import java.util.Random;
import rpg_game.Character;
import java.util.ArrayList;

/**
 *
 * @author 63927
 */
public abstract class Archer extends Character{
    public Archer(String Name){
        super(Name, 2600, 2600, 1080, 250);
    }
    
@Override
public void useSpecialSkill(ArrayList<Character> targets, Random rand) {
    System.out.println(getName() + " used 'Torrential Arrow'!");

    int hits = 0;
    while (hits < 3) {
        int randomIndex = rand.nextInt(targets.size());
        Character randomTarget = targets.get(randomIndex);

        if (randomTarget.getHP() > 0) {
            int damage = (int)(getAttackPower() * 0.80);
            randomTarget.setHP(randomTarget.getHP() - damage);
            System.out.println("Arrow " + (hits + 1) + " hits " + randomTarget.getName() + "!");
            hits++;
        }
        
        // Safety check: if everyone is dead, stop shooting
        if (!rpg_game.enemiesAlive(targets)) break; 
    }
}
    
    @Override
    public void applyPassiveTrait(){
        System.out.println(getName() + "has triggered 'The Thrill of Hunting'! In the next 3 turns, " + getName() + "will deal 60% more damage.");
    }
}
