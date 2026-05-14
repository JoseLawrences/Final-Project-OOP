/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg_game;

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
    
    public abstract void useSpecialSkill(Character target);
    public abstract void applyPassiveTrait();
    
    public int getVulnerableTurns() {
        return vulnerableTurns;
    }

    public void setVulnerableTurns(int vulnerableTurns) {
        this.vulnerableTurns = vulnerableTurns;
    }

    public int getOriginalDefense() {
        return originalDefense;
    }

    //Status Effects
    public void setOriginalDefense(int originalDefense) {
        this.originalDefense = originalDefense;
    }
    private int vulnerableTurns = 0;
    private int originalDefense = -1;
}

