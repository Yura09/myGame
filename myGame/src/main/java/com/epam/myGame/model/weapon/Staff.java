package com.epam.myGame.weapon;

import com.epam.myGame.Damage;

public class Staff extends Weapon {
    public double getDamage() {
        return Damage.DAMAGE_STAFF;
    }

    public double getFatalDamage() {
        return Damage.FATAL_DAMAGE_STAFF;
    }
}
