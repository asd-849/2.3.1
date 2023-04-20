package web.model;

public class Car {
    private String model;
    private String brand;
    private int price;

    public Car(String model, String brand, int price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return String.format("Car: model - %s, brand - %s, price - %d", model, brand, price);
    }
}
