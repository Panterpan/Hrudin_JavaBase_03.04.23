package ua.hillel.hrudin.lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        for (int i = 0; i < 21; i++) {
//            if (i % 2  != 0) {
//               continue;
//            }
//            System.out.println(i);
//        }
//
//           int num1 = 0;
//           int num2 = 1;
//           int sum;
//        System.out.print(num1 + " " + num2 + " ");
//        for (int i = 0; i < 9; i++) {
//             sum = num1 + num2;
//            System.out.print(sum + " ");
//             num1 = num2;
//             num2 = sum;
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please, quess the integer from 0 to 10");
//
//        int i = 0;
//        while (i < 5) {
//            i++;
//            if (scanner.hasNextInt()) {
//                int userValue = scanner.nextInt();
//                if (userValue >= 0 && userValue <= 10) {
//                    System.out.println("User value = " + userValue);
//                    break;
//                }else {
//                    System.out.println("New integer");
//                    scanner.nextLine();
//                }
//            }else {
//                System.out.println("Wrong data! Try again!");
//                scanner.nextLine();
//            }
//        }
            int i = 10;
            while (true){
                int random =(int) (Math.random() * 101);
                System.out.println(random);
                if (random >= 85 && random <=100) {
                    System.out.println("Winn");
                    break;
                }

                if (i == 0) {
                    System.out.println("Boom");
                    break;
                }
                System.out.println(i);
                i--;
            }

        } 

    }