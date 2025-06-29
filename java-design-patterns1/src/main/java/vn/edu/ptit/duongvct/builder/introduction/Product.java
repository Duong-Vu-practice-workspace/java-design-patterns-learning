package vn.edu.ptit.duongvct.builder.introduction;

public class Product {
    private int weight;
    private double price;
    private int shipVolume;
    private int shipCode;
    private Category category;
    public Product(int weight, double price, int shipVolume, int shipCode, Category category) {
        this.weight = weight;
        this.price = price;
        this.shipVolume = shipVolume;
        this.shipCode = shipCode;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getShipVolume() {
        return shipVolume;
    }

    public void setShipVolume(int shipVolume) {
        this.shipVolume = shipVolume;
    }

    public int getShipCode() {
        return shipCode;
    }

    public void setShipCode(int shipCode) {
        this.shipCode = shipCode;
    }
}
