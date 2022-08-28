package com.hillel.pontenko.homeworks.homework14;

public class DrinkMaker {

    public static void makeDrink(DrinksMachine drinksMachine) {
        System.out.println("Please, wait. " + drinksMachine.getTitle() + " is preparing ");
        make();
        System.out.println("Please take your " + drinksMachine.getTitle());
    }

    private static void make() {
        try {
            Thread.sleep(5000);
            new Drink();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
