package ua.hillel.hrudin.lessons.lesson6;

public class JapanNumber {
    public static void main(String[] args) {

        for (int numberShip = 1, count = 0; count < 100; numberShip++) {
            if (numberShip / 10 == 4 || numberShip % 10 == 4 || numberShip / 10 % 10 == 4 || numberShip / 10 == 9 || numberShip % 10 == 9 || numberShip / 10 % 10 == 9) {
                continue;
            }
            count++;
            System.out.println(numberShip);

        }

    }

}



