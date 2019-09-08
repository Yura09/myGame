package com.epam.myGame.heroes;

import com.epam.myGame.weapon.Sword;

public class Warrior extends Hero {
    public Warrior(int health, int mana) {
        super(health, mana);
        weapon = new Sword();
        chanceOfFatalDamage = Hero.CHANCE_FATAL;
    }

    public Warrior() {
        super();
        weapon = new Sword();
        chanceOfFatalDamage = CHANCE_FATAL;
    }

    public double attack(Hero hero) {

      double damage=attackDamage();
        hero.health -= damage;

//        if (isDead()) {
//            System.out.println(hero + " is dead");
//            return;
//        }
        //System.out.println("Warrior attacked for+ " + damage + " " + hero + "(" + hero.health + "hp)");
        return damage;
    }

    //public fatalDamage()
    public void heal() {
        int healHp = healHp();
        System.out.println("Warrior heald to " + healHp + "hp");
    }

    public void resistWeapon() {

    }

    @Override
    public String toString() {
        return "Warrior";
    }
}
