package ua.hillel.hrudin.lessons.lesson14;

public class Main {
    public static void main(String[] args) {

        Androids android = new Androids("Samsung");
        android.call();
        android.lastUpdate();
        android.sms();
        android.internet();
        System.out.println("android.getName() = " + android.getName());
        android.setName("Xiaomi");
        android.call();

        IPhones iphone = new IPhones();
        iphone.call();
        iphone.lastUpdate();
        iphone.sms();
        iphone.internet();
    }
}
