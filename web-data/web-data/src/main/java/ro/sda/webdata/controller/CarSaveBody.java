package ro.sda.webdata.controller;

public class CarSaveBody {
    private String model;
    private int hp;
    private String color;
    private CarInfo carInfo;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public CarInfo getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(CarInfo carInfo) {
        this.carInfo = carInfo;
    }

    @Override
    public String toString() {
        return "CarSaveBody{" +
                "model='" + model + '\'' +
                ", hp=" + hp +
                ", color='" + color + '\'' +
                ", carInfo=" + carInfo +
                '}';
    }
}
