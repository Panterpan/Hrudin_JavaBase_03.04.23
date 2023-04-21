package ua.hillel.hrudin.lessons.lesson6;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Даємо 5 спроб
        int i = 0;
        boolean userWon = false;
        int random = (int) (Math.random() * 11);
//                    System.out.println(random);
        while (i < 5) {
            i++;
            System.out.println("Enter integer from 0 to 10");
            if (scanner.hasNextInt()) {
                int userValue = scanner.nextInt();
                if (userValue == random) {
                    System.out.println("User Win");
                    userWon = true;
                    break;
                } else if (userValue > 10 || userValue < 0) {
                    System.out.println("Please enter integer from 0 to 10");
                } else {
                    System.out.println("Better luck next time)");
                }
            } else {
                System.out.println("Wrong integer!");
            }
            scanner.nextLine();
        }
        if (!userWon ) {
            System.out.println("You loose, try again");
        }

    }
}
