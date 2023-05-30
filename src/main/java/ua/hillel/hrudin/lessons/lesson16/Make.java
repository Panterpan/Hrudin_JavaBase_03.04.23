package ua.hillel.hrudin.lessons.lesson16;

import static ua.hillel.hrudin.lessons.lesson16.DrinksMachine.*;
import static ua.hillel.hrudin.lessons.lesson16.DrinksMachine.COCA_COLA;

public class Make {
    public static void makeDrinksCoffee() {
        System.out.println("Автомат готує " + COFFEE.getType());
    }

    public static void makeDrinksTea() {
        System.out.println("Автомат заварює " + TEA.getType());
    }

    public static void makeDrinksLemonade() {
        System.out.println("Автомат наливає " + LEMONADE.getType());
    }

    public  static void makeDrinksMoxito() {
        System.out.println("Автомат змішує " + MOXITO.getType());
    }

    public  static void makeDrinksMineral() {
        System.out.println("Автомат наливає " + SPARKLING_WATER.getType());
    }

    public static void makeDrinksCola() {
        System.out.println("Автомат відкриває " + COCA_COLA.getType());
    }
}
