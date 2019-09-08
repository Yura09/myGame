package com.epam.myGame.model.heroes;

import java.util.Random;
import java.util.Scanner;

public class ConcreteHero {
    public static Hero generateHero() {
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose your hero:");
            System.out.println("1. Warrior");
            System.out.println("2. Wizard ");
            System.out.println("3. Archer");
            int choice = keyboard.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You chose Warrior");
                    return new Warrior();
                case 2:
                    System.out.println("You chose Wizard");
                    return new Wizard();
                case 3:
                    System.out.println("You chose Archer");
                    return new Archer();
                default:
                    System.out.println("You didn't choose a valid option");
                    return null;

            }
        }
    }
}
