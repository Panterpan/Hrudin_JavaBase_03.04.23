package ua.hillel.hrudin.lessons.lesson14;

public class Androids implements Smartphones, LinuxOS{
    private String name;

    public Androids(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void call() {
        System.out.println("Виклик техпідтримки " + this.name);
    }

    @Override
    public void sms() {
        System.out.println("Надіслати екстрене смс " + this.name);
    }

    @Override
    public void internet() {
        System.out.println("Звернутись до OK.Google");
    }

    @Override
    public void lastUpdate() {
        System.out.println("Останнє оновлення " + this.name + " 24.05.2023");
    }
}
