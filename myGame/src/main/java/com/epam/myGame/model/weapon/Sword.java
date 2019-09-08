package com.epam.myGame.weapon;

import com.epam.myGame.Damage;

public class Sword extends Weapon {
    public double getDamage() {
        return Damage.DAMAGE_SWORD;
    }

    public double getFatalDamage() {
        return Damage.FATAL_DAMAGE_SWORD;
    }
}
