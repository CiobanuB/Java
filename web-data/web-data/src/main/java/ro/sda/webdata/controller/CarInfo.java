package ro.sda.webdata.controller;

public class CarInfo {
    private int year;
    private int km;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "year=" + year +
                ", km=" + km +
                '}';
    }
}
