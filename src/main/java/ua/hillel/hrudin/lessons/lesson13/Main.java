package ua.hillel.hrudin.lessons.lesson13;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicStyles = {
            new RockMusic("AC/DC"),
            new ClassicMusic("Mozart"),
            new PopMusic("NK")
        };

        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();
        }
    }
}
