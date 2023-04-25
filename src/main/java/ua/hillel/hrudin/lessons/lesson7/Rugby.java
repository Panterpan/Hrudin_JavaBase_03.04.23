package ua.hillel.hrudin.lessons.lesson7;

import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {

        int[] players1 = new int[25];
        int[] players2 = new int[25];
        int min = 18;
        int max = 40;
        double sumAge1 = 0.0;
        double sumAge2 = 0.0;

        for (int i = 0; i < players1.length; i++) {
            players1[i] = (int) ((Math.random() * (max - min + 1)) + min);
            sumAge1 += players1[i];
            players2[i] = (int) ((Math.random() * (max - min + 1)) + min);
            sumAge2 += players2[i];
        }
       double average1 = sumAge1/ players1.length;
       double average2 = sumAge2/ players2.length;

        System.out.println(Arrays.toString(players1));
        System.out.println(Arrays.toString(players2));
        System.out.println("Cумарний вік першої команди: " + sumAge1);
        System.out.println("Cумарний вік другої команди: " + sumAge2);
        System.out.println("Середній вік першої команди: " + average1);
        System.out.println("Середній вік першої команди: " + average2);

    }
}
