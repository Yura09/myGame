package com.epam.myGame.model.heroes;

import com.epam.myGame.model.heroes.Hero;

public interface Race {
    double attack(Hero hero);

    void heal();

    void resistWeapon();

    double CHANCE_FATAL = 0.4D;
}
