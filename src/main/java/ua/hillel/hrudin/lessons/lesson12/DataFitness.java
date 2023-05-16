package ua.hillel.hrudin.lessons.lesson12;

import java.util.Scanner;

public class DataFitness {
    public static void main(String[] args) {
        UserInformation client1 = new UserInformation("Віктор", 30,8,1995,"panterpanv@gmail.com",
                "0662519767", "Грудін", 67, 110, 5000);
        client1.printAccountInfo();
        client1.setSurname("Конончук");
        System.out.println("client1.getAge() = " + client1.getAge());
        System.out.println("client1.getName() = " + client1.getName());
        client1.printAccountInfo();

        UserInformation client2 = new UserInformation("Олег", 15,3,2001,"олег@gmail.com",
                "0673824481", "Шолойко", 82, 120, 5500);
        client2.printAccountInfo();
        client2.setPressure(110);
        client2.printAccountInfo();

        UserInformation client3 = new UserInformation("Аліна", 22,12,1998,"аліна@gmail.com",
                "0505928320", "Приходько", 55, 105, 6300);
        client3.printAccountInfo();
        client3.setWeight(58);
        client3.printAccountInfo();

        UserInformation client4 = new UserInformation("Анастасія", 12,2,1975,"panterpanv@gmail.com",
                "0939556410", "Нечай", 81, 110, 4500);
        client4.printAccountInfo();

    }
}
