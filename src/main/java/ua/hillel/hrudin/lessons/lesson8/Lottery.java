package ua.hillel.hrudin.lessons.lesson8;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] organizer = new int[7];
        int[] player = new int[7];
        System.out.println("Please, enter number from 0 to 9");
        for (int i = 0; i < organizer.length; i++) {
            organizer[i] = (int) (Math.random() * 10);
            if (sc.hasNextInt()) {
                player[i] = sc.nextInt();
                sc.nextLine();
                if (player[i] > 9 || player[i] < 0) {
                    System.out.println("Wrong, enter integer from 0 to 9!");
                    i--;
                }
            } else {
                System.out.println("Wrong integer, try again");
                i--;
                sc.nextLine();
            }

        }
        System.out.println("Не відсортовані значення:");
        System.out.println("Організатор: " + Arrays.toString(organizer));
        System.out.println("Гравець: " + Arrays.toString(player));


        for (int i = 0; i < organizer.length - 1; i++) {
            for (int j = 0; j < organizer.length - i - 1; j++) {
                if (organizer[j] > organizer[j + 1]) {
                    int swap = organizer[j];
                    organizer[j] = organizer[j + 1];
                    organizer[j + 1] = swap;
                }
            }
        }

        Arrays.sort(player);
        System.out.println(" ");
        System.out.println("Відсортовані значення:");
        System.out.println("Організатор: " + Arrays.toString(organizer));
        System.out.println("Гравець: " + Arrays.toString(player));
        int sumTrue = 0;
        for (int i = 0; i < organizer.length; i++) {
            if (organizer[i] == player[i]) {
                sumTrue++;
            }
        }
        System.out.println("Кількість збігів: " + sumTrue);

        if (sumTrue > 0) {
            int[] amount = new int[sumTrue];
            for (int j = 0, i = 0; i < organizer.length; i++) {
                if (organizer[i] == player[i]) {
                    amount[j] = i;
                    j++;
                }
            }
            System.out.println("Співпали наступні індекси: " + Arrays.toString(amount));
        } else {
            System.out.println("Ви програли!");
        }
    }

}
