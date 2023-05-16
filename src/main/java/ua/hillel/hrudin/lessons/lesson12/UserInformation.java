package ua.hillel.hrudin.lessons.lesson12;

public class UserInformation {
    private final String name;
    private final int day;
    private final int month;
    private final int year;
    private final String mail;
    private final String phone;
    private String surname;
    private int weight;
    private int pressure;
    private int numberStepsPerDay;
    private int age;
    private int thisYear = 2023;
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setNumberStepsPerDay(int numberStepsPerDay) {
        this.numberStepsPerDay = numberStepsPerDay;
    }

    public UserInformation(String name, int day, int month, int year, String mail, String phone, String surname, int weight, int pressure, int numberStepsPerDay) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.mail = mail;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.numberStepsPerDay = numberStepsPerDay;
        this.age = thisYear - this.year;
    }
    public void printAccountInfo(){
        System.out.println("Клієнт:"+ "\nІм'я: " + this.name + ";\nПрізвище: " +this.surname+";\nДата народження: " + this.day + "." + this.month+ "." + this.year+"; Вік: "
                + age+";\nПошта: " + this.mail+"; Мобільний: " +this.phone+";\nВага: " + this.weight+ "; Тиск: " + this.pressure+";\nК-ть кроків за день: " + this.numberStepsPerDay );
    }

}
