package ua.hillel.hrudin.lessons.lesson13;

public class ClassicMusic extends MusicStyles{


    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    void playMusic() {
        System.out.println(getName() + " play Classic music");
    }
}
