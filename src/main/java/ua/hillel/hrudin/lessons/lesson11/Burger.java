package ua.hillel.hrudin.lessons.lesson11;

public class Burger {
    String bun;
    String meat1;
    String meat2;
    String cheese;
    String greens;
    String mayonnaise;

    public Burger(String bun, String meat1, String cheese,  String greens, String mayonnaise) {
        this.bun = bun;
        this.meat1 = meat1;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Звичайний бургер: " + this.bun + ", " + this.meat1 + ", " + this.cheese + ", " + this.greens + ", " + this.mayonnaise);
    }

    public Burger(String bun, String meat1, String cheese, String greens) {
        this.bun = bun;
        this.meat1 = meat1;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Дієтичний бургер: " + this.bun + ", " + this.meat1 + ", " + this.cheese + ", " + this.greens);
    }

    public Burger(String bun, String meat1, String meat2, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat1 = meat1;
        this.meat2 = meat2;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Звичайний бургер: " + this.bun + ", " + this.meat1 + ", " + this.meat2 + ", " + this.cheese + ", " + this.greens + ", " + this.mayonnaise);
    }
}
