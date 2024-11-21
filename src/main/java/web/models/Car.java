package web.models;


public class Car {
    private String model;
    private String colors;
    private int series;

    public Car(String model, String colors, int series) {
        this.model = model;
        this.colors = colors;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
