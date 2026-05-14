/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg_game.Enemies;
import java.util.Random;

/**
 *
 * @author 63927
 */
public class BossEnemy extends rpg_game.Character {
    private int turnCount = 0;
    private Random rand = new Random();
    private boolean isEnraged = false;
    
    public BossEnemy(String Name, int hp, int maxHP, int attackPower, int defensePower){
        super(Name, hp, maxHP, attackPower, defensePower);
    }
    
    @Override
    public void useSpecialSkill(rpg_game.Character target){
        if(turnCount % 8 == 0){
            performUltimate(target);
        }else{
            if (rand.nextBoolean()){
                performBasic(target);
            }else{
                performEnhancedBasic(target);
            }
        }
    }
    
    public void performBasic(rpg_game.Character target){
        System.out.println(getName() + "used 'Sharp Claws' on " + target.getName() + "!");
        int damage = getAttackPower();
        target.setHP(target.getHP() - damage);
    }
    
    public void performEnhancedBasic(rpg_game.Character target){
        System.out.println(getName() + "used 'Rapid Rage on " + target.getName() + "!");
        int damage = (int)(getAttackPower() * 1.15);
        target.setHP(target.getHP() - damage);
    }
    
    public void performUltimate(rpg_game.Character target){
        System.out.println(getName() + "unleashed Ultimate 'Doom Meteoroid' ");
        int ultimateDamage = getAttackPower() * 3;
        target.setHP(target.getHP() - ultimateDamage);
    }
    
    @Override
    public void applyPassiveTrait(){
        if (getHP()   <= (getMaxHP() * 0.3) && !isEnraged){
            System.out.println(getName() + "is enraged! Damage has been boosted by 30%");  // When 30% HP, deal 30% more damage
            int boostedAttack = (int)(getAttackPower() * 1.3);
            setAttackPower(boostedAttack);
            isEnraged = true;
        }
    }
}
