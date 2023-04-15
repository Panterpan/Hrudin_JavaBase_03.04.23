package ua.hillel.hrudin.lessons.lesson4;

public class Homework5 {
    public static void main(String[] args) {
        int liWarriorDamage = 13;
        int liArcherDamage = 24;
        int liRiderDamage = 46;

        int minhWarriorDamage = 9;
        int minhArcherDamage = 35;
        int minhRiderDamage = 12;

        int liWarriors = 860;
        int minhWarriors = (int) (liWarriors * 1.5);

        int liWarriorsSumDamage = liWarriors * (liWarriorDamage + liArcherDamage + liRiderDamage);
        int minhWarriorsSumDamage = minhWarriors * (minhWarriorDamage + minhArcherDamage + minhRiderDamage);
        System.out.println("Загальна атака Лі: " + liWarriorsSumDamage);
        System.out.println("Загальна атака Мінь: " + minhWarriorsSumDamage);
    }
}
