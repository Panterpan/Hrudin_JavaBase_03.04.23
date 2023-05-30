package ua.hillel.hrudin.lessons.lesson16;

public enum DrinksMachine {
    COFFEE("каву"),
    TEA("чай"),
    LEMONADE("лимонад"),
    MOXITO("мохіто"),
    SPARKLING_WATER("мінералку"),
    COCA_COLA("кока-колу");
    private String type;

    DrinksMachine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
