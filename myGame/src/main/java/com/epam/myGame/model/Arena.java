package com.epam.myGame.model;

import com.epam.myGame.model.heroes.ConcreteHero;
import com.epam.myGame.model.heroes.Hero;

public class Arena {
    Hero hero;

    public Arena() {
        hero = ConcreteHero.generateHero();
    }

}
