package ua.hillel.hrudin.lessons.lesson14;

public class IPhones implements IOS{
    @Override
    public void call() {
        System.out.println("Виклик техпідтримки Iphone");
    }

    @Override
    public void sms() {
        System.out.println("Надіслати екстрене смс з Iphone");
    }

    @Override
    public void internet() {
        System.out.println("Звернутись до OK.Siri");
    }

    @Override
    public void lastUpdate() {
        System.out.println("Останнє оновлення 12.03.2023");
    }
}
