package ua.hillel.hrudin.lessons.lesson5;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter information on the first team:");
        System.out.println(" Enter the name on the first team:");

        String teamName1 = sc.nextLine();

        System.out.println(" Enter the kills on the first team:");

        int teammate1_1 = 0;

        if (sc.hasNextInt()) {
            teammate1_1 = sc.nextInt();
        } else {
            System.out.println("Wrong integer, try again");
            System.exit(0);
        }

        int teammate1_2 = 0;

        if (sc.hasNextInt()) {
            teammate1_2 = sc.nextInt();
        } else {
            System.out.println("Wrong integer, try again");
            System.exit(0);
        }

        int teammate1_3 = 0;

        if (sc.hasNextInt()) {
            teammate1_3 = sc.nextInt();
        } else {
            System.out.println("Wrong integer, try again");
            System.exit(0);
        }

        int teammate1_4 = 0;

        if (sc.hasNextInt()) {
            teammate1_4 = sc.nextInt();
        } else {
            System.out.println("Wrong integer, try again");
            System.exit(0);
        }

        int teammate1_5 = 0;

        if (sc.hasNextInt()) {
            teammate1_5 = sc.nextInt();
            sc.nextLine();
        } else {
            System.out.println("Wrong integer, try again");
            System.exit(0);
        }

        System.out.println("Please enter information on the second team:");
        System.out.println(" Enter the name on the second team:");

        String teamName2 = sc.nextLine();

        System.out.println(" Enter the kills on the second team:");

        int teammate2_1 = 0;

        if (sc.hasNextInt()) {
            teammate2_1 = sc.nextInt();
        } else {
            System.out.println("Wrong integer, try again");
            System.exit(0);
        }

        int teammate2_2 = 0;

        if (sc.hasNextInt()) {
            teammate2_2 = sc.nextInt();
        } else {
            System.out.println("Wrong integer, try again");
            System.exit(0);
        }

        int teammate2_3 = 0;

        if (sc.hasNextInt()) {
            teammate2_3 = sc.nextInt();
        } else {
            System.out.println("Wrong integer, try again");
            System.exit(0);
        }

        int teammate2_4 = 0;

        if (sc.hasNextInt()) {
            teammate2_4 = sc.nextInt();
        } else {
            System.out.println("Wrong integer, try again");
            System.exit(0);
        }

        int teammate2_5 = 0;

        if (sc.hasNextInt()) {
            teammate2_5 = sc.nextInt();
            sc.nextLine();
        } else {
            System.out.println("Wrong integer, try again");
            System.exit(0);
        }

        System.out.println("TeamName1: " + teamName1);
        System.out.println("Albert: " + teammate1_1 + " kills");
        System.out.println("Gary: " + teammate1_2 + " kills");
        System.out.println("Ian: " + teammate1_3 + " kills");
        System.out.println("Tony: " + teammate1_4 + " kills");
        System.out.println("Ringo: " + teammate1_5 + " kills");
        System.out.println("");
        System.out.println("TeamName2: " + teamName2);
        System.out.println("Hank: " + teammate2_1 + " kills");
        System.out.println("Minh: " + teammate2_2 + " kills");
        System.out.println("Vitaliy : " + teammate2_3 + " kills");
        System.out.println("Xavier: " + teammate2_4 + " kills");
        System.out.println("Irving: " + teammate2_5 + " kills");

        int numberOfPlayersTeam1 = 5;
        int numberOfPlayersTeam2 = 5;

        double averageTeam1 = (teammate1_1 + teammate1_2 + teammate1_3 + teammate1_4 + teammate1_5)/(double) numberOfPlayersTeam1;
        double averageTeam2 = (teammate2_1 + teammate2_2 + teammate2_3 + teammate2_4 + teammate2_5)/(double) numberOfPlayersTeam2;

        System.out.println("");

        System.out.println("AverageTeam1: " + averageTeam1 + " kills");
        System.out.println("AverageTeam2: " + averageTeam2 + " kills");

        System.out.println("");

        if (averageTeam1 > averageTeam2) {
            System.out.println("Team " + teamName1 + " win, they have " + averageTeam1 + " average kills");
        } else if (averageTeam1 < averageTeam2) {
            System.out.println("Team " + teamName2 + " win, they have " + averageTeam2 + " average kills");
        } else {
            System.out.println("Draw, both teams have " + averageTeam1 + " average kills");
        }

    }
}
