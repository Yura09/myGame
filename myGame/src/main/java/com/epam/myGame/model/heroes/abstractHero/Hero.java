package com.epam.myGame.model.heroes;

import com.epam.myGame.model.features.Heal;
import com.epam.myGame.model.features.Health;
import com.epam.myGame.model.features.Mana;
import com.epam.myGame.model.weapon.Weapon;

import java.util.Random;

public abstract class Hero implements Race, Heal, Health, Mana {
    private final Random random = new Random();
     int health;
     int mana;
    private double damage;
    private int numHealthPotions;
    private double chanceOfFatalDamage;
    Weapon weapon;

    int healHp() {
        int healHp = random.nextInt(Heal.MAX_HEAL - Heal.MIN_HEAL) + MIN_HEAL;
        --numHealthPotions;
        this.health += healHp;
        return this.health;
    }

    public int getNumHealthPotions() {
        return numHealthPotions;
    }

    public int getHealth() {
        return health;
    }

    public Hero() {
        this.health = random.nextInt(MAX_HEALTH - MIN_HEALTH) + MIN_HEALTH;
        this.mana = random.nextInt(MAX_MANA - MIN_MANA) + MIN_MANA;
        numHealthPotions = NUM_HEALTH_POTIONS;
    }

    public boolean isDead() {
        if (this.health < 1) {
            this.health = 0;
            return true;
        } else {
            return false;
        }
    }

     double attackDamage() {
        if (isFatalDamage() && isEnoughMana()) {
            damage = this.weapon.getFatalDamage();
            this.mana -= damage;
        } else {
            damage = this.weapon.getDamage();
        }
        return damage;
    }

    private boolean isFatalDamage() {
        return Math.random() < chanceOfFatalDamage;
    }

    private boolean isEnoughMana() {
        return damage <= mana;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setChanceOfFatalDamage(double chanceOfFatalDamage) {
        this.chanceOfFatalDamage = chanceOfFatalDamage;
    }

    @Override
    public abstract String toString();
}
