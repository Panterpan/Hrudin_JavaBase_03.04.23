package ua.hillel.hrudin.lessons.lesson11;

public class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger("булочка", "м'ясо", "сир", "зелень", "майонез");
        Burger dietBurger = new Burger("булочка", "м'ясо", "сир", "зелень");
        Burger doubleBurger = new Burger("булочка", "м'ясо","м'ясо","сир", "зелень", "майонез");
    }

}
