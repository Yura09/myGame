package com.epam.myGame.heroes;

import com.epam.myGame.Heal;
import com.epam.myGame.weapon.Bow;

import java.util.Random;

public class Archer extends Hero {

    public Archer(int health, int mana) {
        super(health, mana);
        weapon = new Bow();
        chanceOfFatalDamage = Hero.CHANCE_FATAL;
    }

    public Archer() {
        super();
        weapon = new Bow();
        chanceOfFatalDamage = CHANCE_FATAL;
    }

    public double attack(Hero hero) {

        double damage=attackDamage();
        hero.health -= damage;

        // System.out.println("Archer attacked for+ " + damage + " " + hero + "(" + hero.health + "hp)");
        return damage;
    }

    public void heal() {
        int healHp = healHp();
//        Random random = new Random();
//        int healHp = random.nextInt(Heal.MAX_HEAL - Heal.MIN_HEAL) + MIN_HEAL;
//        this.health += healHp;
        System.out.println("Archer heald for " + healHp + "HP");
    }

    public void resistWeapon() {

    }

    @Override
    public String toString() {
        return "Archer";
    }
}
