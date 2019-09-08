package com.epam.myGame.model.heroes;

import java.util.Random;

public class Monster {
    public static Hero generateMonster() {
        Random rand = new Random();
        while (true) {
            switch (rand.nextInt(3) + 1) {
                case 1:
                    return new Warrior();
                case 2:
                    return new Wizard();
                case 3:
                    return new Archer();
            }
        }
    }
}
