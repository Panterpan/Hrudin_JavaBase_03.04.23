package ua.hillel.hrudin.lessons.lesson16;

import java.util.Arrays;
import java.util.Scanner;

import static ua.hillel.hrudin.lessons.lesson16.DrinksMachine.*;

public class Main {
    public static void main(String[] args) {
        DrinksMachine[] drinksMachines = DrinksMachine.values();
        double price = 0.0;
        boolean make = true;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while (make) {
            System.out.println("Виберіть напій " + Arrays.toString(drinksMachines) + "або введіть NO");
            String userValue = sc.nextLine().toUpperCase();
            if (userValue.equals("NO")) {
                make = false;
                break;
            } else {
                for (DrinksMachine drinksMachine : drinksMachines) {
                    if (userValue.equals(drinksMachine.toString())) {
                        count++;
                        switch (drinksMachine) {
                            case COFFEE: {
                                Make.makeDrinksCoffee();
                                price += Drinks.coffee;
                                break;
                            }
                            case TEA: {
                                Make.makeDrinksTea();
                                price += Drinks.tea;
                                break;
                            }
                            case LEMONADE: {
                                Make.makeDrinksLemonade();
                                price += Drinks.lemonade;
                                break;
                            }
                            case MOXITO: {
                                Make.makeDrinksMoxito();
                                price += Drinks.moxito;
                                break;
                            }
                            case SPARKLING_WATER: {
                                Make.makeDrinksMineral();
                                price += Drinks.sparklingWater;
                                break;
                            }
                            case COCA_COLA: {
                                Make.makeDrinksCola();
                                price += Drinks.cocaCola;
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Кількість приготовлених напоїв = " + count);
        System.out.println("Ви маєте заплатити " + price + " грн");
    }


}
