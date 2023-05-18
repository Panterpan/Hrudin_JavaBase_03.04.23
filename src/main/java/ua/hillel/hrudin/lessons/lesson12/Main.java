package ua.hillel.hrudin.lessons.lesson12;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int users = 1;
        UserInformation [] userInformation = new UserInformation[users];
        for (int i = 0; i < userInformation.length; i++) {
            System.out.println("Введіть ім'я для клієнта " + (i + 1));
            String name = sc.nextLine();
            System.out.println("Введіть день народження для клієнта " + (i + 1));
            int day = 0;
            if (sc.hasNextInt()) {
                day = sc.nextInt();
                if (day < 1 || day > 31){
                    System.out.println("Введіть вірний ден0ь народження");
                    i--;
                    sc.nextLine();
                    continue;
                }
            } else {
                System.out.println("Введіть вірний день");
                i--;
                sc.nextLine();
                continue;
            }
            System.out.println("Введіть місяць народження для клієнта " + (i + 1));
            int month = 0;
            if (sc.hasNextInt()) {
                month = sc.nextInt();
                if (month < 1 || month > 12){
                    System.out.println("Введіть вірний місяць народження");
                    i--;
                    sc.nextLine();
                    continue;
                }
            } else {
                System.out.println("Введіть вірний місяць");
                i--;
                sc.nextLine();
                continue;
            }
            sc.nextLine();
            System.out.println("Введіть рік народження для клієнта " + (i + 1));
            int year = 0;
            if (sc.hasNextInt()) {
                year = sc.nextInt();
                if (year < 1945 || year > 2023){
                    System.out.println("Введіть вірний рік народження");
                    i--;
                    sc.nextLine();
                    continue;
                }
            } else {
                System.out.println("Введіть вірний місяць");
                i--;
                sc.nextLine();
                continue;
            }
            sc.nextLine();
            System.out.println("Введіть пошту для клієнта " + (i + 1));
            String mail = sc.nextLine();
            System.out.println("Введіть номер телефону для клієнта " + (i + 1));
            String phone = sc.nextLine();
            System.out.println("Введіть прізвище для клієнта " + (i + 1));
            String surname = sc.nextLine();
            System.out.println("Введіть вагу для клієнта " + (i + 1));
            int weight = 0;
            if (sc.hasNextInt()) {
                weight = sc.nextInt();
                if (weight < 40){
                    System.out.println("Занадто худий для залу");
                    i--;
                    sc.nextLine();
                    continue;
                }
            } else {
                System.out.println("Введіть вірну вагу");
                i--;
                sc.nextLine();
                continue;
            }
            sc.nextLine();
            System.out.println("Введіть тиск для клієнта " + (i + 1));
            int pressure = 0;
            if (sc.hasNextInt()) {
                pressure = sc.nextInt();
                if (pressure < 90){
                    System.out.println("Низький тиск");
                    i--;
                    sc.nextLine();
                    continue;
                }
            } else {
                System.out.println("Введіть вірниу вагу");
                i--;
                sc.nextLine();
                continue;
            }
            sc.nextLine();
            System.out.println("Введіть кількість кроків для клієнта " + (i + 1));
            int numberStepsPerDay = 0;
            if (sc.hasNextInt()) {
                numberStepsPerDay = sc.nextInt();
                if (numberStepsPerDay < 3000){
                    System.out.println("Походіть ще трохи");
                    i--;
                    sc.nextLine();
                    continue;
                }
            } else {
                System.out.println("Введіть вірниу вагу");
                i--;
                sc.nextLine();
                continue;
            }
            sc.nextLine();
            userInformation [i] = new UserInformation(name, day, month,year,mail,phone,surname,weight,pressure,numberStepsPerDay);
        }
        userInformation[0].printAccountInfo();
        userInformation[0].setSurname("Конончук");
        userInformation[0].printAccountInfo();
        System.out.println("userInformation[0].getAge() = " + userInformation[0].getAge());
    }
}
