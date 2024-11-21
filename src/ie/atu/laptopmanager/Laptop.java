package ie.atu.laptopmanager;

public class Laptop {

    // Instance Variables
    private int serialNumber; // Unique ID
    private int brand;
    private int price;
    private int isSold;

    // Getter and Setter Methods
    public int getSerialNumber() {
        return this.serialNumber;
    }

    public int getBrand() {
        return this.brand;
    }

    public int getPrice() {
        return this.price;
    }

    public int getIsSold() {
        return this.isSold;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setisSold(int isSold) {
        this.isSold = isSold;
    }
}
