package ua.hillel.hrudin.lessons.lesson2;

import java.util.Arrays;

public class MyApp {
    public static void main(String[] args) {
//        50°36'25.3"N+30°26'48.5"E/@50.6100201,30.4471602
        String longitude = " Довгота: ";
        String latitude = "Широта: ";

        double longNumber = 50.6100201;
        double latNumber = 30.4471602;
        char comma = '\u002c';

        System.out.println(latitude + latNumber + comma + longitude + longNumber);

        String dmsLong = " ДМС Довгота: ";
        String dmsLat = "ДМС Широта: ";

        byte degree = 50;
        byte degree1 = 36;
        byte degree2 = 30;
        byte degree3 = 26;
        double minute = 25.3;
        double minute1 = 48.5;

        char degreeSymbol = '\u00B0';
        char quotes = 34;

        System.out.println(dmsLat + degree + degreeSymbol + degree1 + "`" + minute + quotes + "N" + comma + dmsLong +
        + degree2 + degreeSymbol + degree3 + "`" + minute1 + quotes + "E");

    }
}
