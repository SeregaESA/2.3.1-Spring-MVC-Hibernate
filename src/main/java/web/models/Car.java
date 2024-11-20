package web.models;

public class Car {
    private String model;
    private String colos;
    private int series;

    public Car(String model, String colos, int series) {
        this.model = model;
        this.colos = colos;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColos() {
        return colos;
    }

    public void setColos(String colos) {
        this.colos = colos;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
