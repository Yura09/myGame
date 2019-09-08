package com.epam.myGame.heroes;

import com.epam.myGame.weapon.Staff;

import java.util.Random;

public class Wizard extends Hero {
    public Wizard(int health, int mana) {
        super(health, mana);
        weapon = new Staff();
        chanceOfFatalDamage = Hero.CHANCE_FATAL;
    }

    public Wizard() {
        super();
        weapon = new Staff();
        chanceOfFatalDamage = CHANCE_FATAL;
    }

    public double attack(Hero hero) {

       double damage=attackDamage();
        hero.health -= damage;
       // System.out.println("Wizard attacked for+ " + damage + " " + hero + "(" + hero.health + "hp)");
        return damage;
    }

    public void heal() {
        int healHp = healHp();
        System.out.println("Wizard heald to " + healHp + "hp");
    }

    public void resistWeapon() {

    }

    @Override
    public String toString() {
        return "Wizard";
    }
}
