package oop.characters;

import oop.characters.Character;

public class Enemy extends Character {

    public Enemy(int hp, int attackDamage, int defenseLevel, int spAttackDamage, int spDefenseLevel) {
        super(hp, attackDamage, defenseLevel, spAttackDamage, spDefenseLevel);
    }

    @Override
    public void attack() {
        System.out.println("Enemy Attack!");
    }

    public void spAttack() {
        System.out.println("Used Special Attack for " + spAttackDamage + " damage");
    }

    public void spDefense() {
        System.out.println("Used special defense for " + spDefenseLevel + " extra defense");
    }
}

