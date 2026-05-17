/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg_game;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author 63927
 */
public abstract class Character {
    
    private String name;
    private int  HP;
    private int maxHP;
    private int attackPower;
    private int defensePower;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }

    public Character(String name, int hp, int maxHP, int attackPower, int defensePower) {
        this.name = name;
        this.HP = hp;
        this.maxHP = maxHP;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }
    
    // attacks
    public abstract void useBasicAttack(Character  targets);
    public abstract void useSpecialSkill(ArrayList<Character> targets, Random rand);
    public abstract void applyPassiveTrait(ArrayList<Character> targets);
    
    //getter and setter for status effects
    
    public int getVulnerableTurns() {
        return vulnerableTurns;
    }

    public void setVulnerableTurns(int vulnerableTurns) {
        this.vulnerableTurns = vulnerableTurns;
    }

    public int getOriginalDefense() {
        return originalDefense;
    }
    
     public int getDefenseBoostTurns() {
        return defenseBoostTurns;
    }

    public void setDefenseBoostTurns(int defenseBoostTurns) {
        this.defenseBoostTurns = defenseBoostTurns;
    }
    
      public int getPoisonedTurns() {
        return poisonedTurns;
    }

    public void setPoisonedTurns(int poisonedTurns) {
        this.poisonedTurns = poisonedTurns;
    }

    //Status Effects
    public void setOriginalDefense(int originalDefense) {
        this.originalDefense = originalDefense;
    }
    private int vulnerableTurns = 0;
    private int originalDefense = -1;
    private int poisonedTurns = 0;
    private int defenseBoostTurns = 0;
    
    public void updateStatuses(){
        if (this.getVulnerableTurns() > 0){
                    this.setVulnerableTurns(this.getVulnerableTurns() - 1);
                    
                    if(this.getVulnerableTurns() == 0){
                        this.setDefensePower(this.getOriginalDefense());
                        this.setOriginalDefense(-1);
                        System.out.println(this.getName() + " is no longer vulnerable!");
                    }
                }
        
        if(this.getPoisonedTurns() > 0){
                    int poisonDamage = (int)(this.getMaxHP() * 0.025);
                    this.setHP(this.getHP() - poisonDamage);
                    if(this.getHP() < 0) this.setHP(0);
                    System.out.println(this.getName() + " suffered some poison damage");
                    this.setPoisonedTurns(this.getPoisonedTurns() - 1);
                    
                    if (this.getPoisonedTurns() == 0){
                        System.out.println(this.getName() + " is now free from poison!");
                    }
                }
        
        if(this.getDefenseBoostTurns() > 0){
            this.setDefenseBoostTurns(this.getDefenseBoostTurns() - 1);
            
            if(this.getDefenseBoostTurns() == 0){
                this.setDefensePower(this.getOriginalDefense());
                this.setOriginalDefense(-1);
                System.out.println(this.getName() + "lost their defense boost!");
            }
        }
        
    }
}

