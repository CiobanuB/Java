package ro.sda.webdata.controller;

public class LiteCar {
    private final String model;
    private final int hp;

    public LiteCar(String model, int hp) {
        this.model = model;
        this.hp = hp;
    }

    public String getModel() {
        return model;
    }

    public int getHp() {
        return hp;
    }
}
