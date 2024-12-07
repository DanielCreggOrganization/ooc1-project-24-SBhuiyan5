package ie.atu.laptopmanager; // package declaration

public class Laptop { // class declaration

    // Instance Variables
    private int serialNumber; // Unique ID
    private String brand; // Brand Name
    private float price; // Laptop Price
    private boolean isSold; // How Much Is Sold Or Not

    // Constructor
    public Laptop(int serialNumber, String brand, double price, boolean isSold){
        this.serialNumber = serialNumber; // Assigns Serial Number to Instance Variable (int)
        this.brand = brand; // Assigns Brand to Instance Variable (String)
        this.price = (float) price; // Changes "Price" from double to float 
        this.isSold = isSold; // Assigns isSold to Instance Variable (boolean)
    }

// Getter and Setter Methods
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
