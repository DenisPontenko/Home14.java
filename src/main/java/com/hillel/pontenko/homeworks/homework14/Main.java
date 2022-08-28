package com.hillel.pontenko.homeworks.homework14;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static int totalPrice = 0;

    public static void main(String[] args) {
        run();
        System.out.println("Total count: " + Drink.count);
        System.out.println("Total price: " + totalPrice);
        scanner.close();
    }

    private static void run() {
        System.out.println("You can buy: " + Arrays.toString(DrinksMachine.values()));

        while (true) {
            DrinksMachine drinksMachine = getDrinkType();
            if (drinksMachine == null) {
                return;
            }

            String str = "You choose: %s, price: %s";
            switch (drinksMachine) {
                case COFFEE: {
                    System.out.println(String.format(str, drinksMachine.getTitle(), Drinks.TEA_PRICE));
                    DrinkMaker.makeDrink(drinksMachine);
                    totalPrice += Drinks.COFFEE_PRICE;
                    break;
                }
                case TEA: {
                    System.out.println(String.format(str, drinksMachine.getTitle(), Drinks.TEA_PRICE));
                    DrinkMaker.makeDrink(drinksMachine);
                    totalPrice += Drinks.TEA_PRICE;
                    break;
                }
                case LEMONADE: {
                    System.out.println(String.format(str, drinksMachine.getTitle(), Drinks.LEMONADE_PRICE));
                    DrinkMaker.makeDrink(drinksMachine);
                    totalPrice += Drinks.LEMONADE_PRICE;
                    break;
                }
                case MOJITO: {
                    System.out.println(String.format(str, drinksMachine.getTitle(), Drinks.MOJITO_PRICE));
                    DrinkMaker.makeDrink(drinksMachine);
                    totalPrice += Drinks.MOJITO_PRICE;
                    break;
                }
                case WATER: {
                    System.out.println(String.format(str, drinksMachine.getTitle(), Drinks.WATER_PRICE));
                    DrinkMaker.makeDrink(drinksMachine);
                    totalPrice += Drinks.WATER_PRICE;
                    break;
                }
                case COLA: {
                    System.out.println(String.format(str, drinksMachine.getTitle(), Drinks.COLA_PRICE));
                    DrinkMaker.makeDrink(drinksMachine);
                    totalPrice += Drinks.COLA_PRICE;
                    break;
                }
            }
        }
    }

    private static DrinksMachine getDrinkType() {
        System.out.println("Please choose drink or type \"stop\"");

        while (true) {
            String str = scanner.next().toUpperCase();

            if (str.equals("STOP")) {
                return null;
            }

            for (DrinksMachine value : DrinksMachine.values()) {
                if (str.equals(value.toString())) {
                    return DrinksMachine.valueOf(str);
                }
            }
            System.out.println("Please choose drink from list " + Arrays.toString(DrinksMachine.values()));

        }
    }
}