package ua.hillel.hrudin.lessons.lesson13;

public class PopMusic extends MusicStyles{

    public PopMusic(String name) {
        super(name);
    }

    @Override
    void playMusic() {
        System.out.println(getName() +  " play Pop music");
    }
}
