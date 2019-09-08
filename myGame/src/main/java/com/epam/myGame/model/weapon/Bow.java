package com.epam.myGame.weapon;

import com.epam.myGame.Damage;

public class Bow extends Weapon {

    public double getDamage() {
        return Damage.DAMAGE_BOW;
    }

    public double getFatalDamage() {
        return Damage.FATAL_DAMAGE_BOW;
    }
}
