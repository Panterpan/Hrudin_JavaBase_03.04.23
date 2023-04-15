package ua.hillel.hrudin.lessons.lesson4;

public class Homework4 {
    public static void main(String[] args) {
        int height = 15;
        int width = 35;
        int length = 50;
        int volume = height * width * length;
        System.out.println("Об'єм паралелепіпеда: " + volume);
        int lengthOfSide = 4 * (height + width + length);
        System.out.println("Сума сторін: " + lengthOfSide);
    }
}
