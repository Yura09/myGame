package com.epam.myGame.weapon;

import com.epam.myGame.Damage;

public abstract class Weapon implements Damage {
    //protected double damage;
 public abstract double getDamage();
 public abstract double getFatalDamage();

}
