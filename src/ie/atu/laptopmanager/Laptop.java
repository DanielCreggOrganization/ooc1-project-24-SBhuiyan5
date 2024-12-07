package ie.atu.laptopmanager;

public class Laptop {

    // Instance Variables
    private int serialNumber; // Unique ID
    private String brand;
    private float price;
    private boolean isSold;

    // Constructor
    public Laptop(int serialNumber, String brand, double price, boolean isSold){
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.price = (float) price;
        this.isSold = isSold;
    }

public int getSerialNumber() {
    return this.serialNumber;
}

public String getBrand() {
    return this.brand;
}

public Float getPrice() {
    return this.price;
}

public Boolean getIsSold() {
    return this.isSold;
}

public void setSerialNumber(int serialNumber) {
    this.serialNumber = serialNumber;
}

public void setBrand(String brand) {
    this.brand = brand;
}

public void setPrice(float price) {
    this.price = price;
}

public void setIsSold(boolean isSold) {
    this.isSold = isSold;
}
}
