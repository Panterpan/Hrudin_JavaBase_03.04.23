package ua.hillel.hrudin.lessons.lesson13;

public class RockMusic extends MusicStyles{
    public RockMusic(String name) {
        super(name);
    }

    @Override
    void playMusic() {
        System.out.println(getName() + " play Rock music");
    }
}
