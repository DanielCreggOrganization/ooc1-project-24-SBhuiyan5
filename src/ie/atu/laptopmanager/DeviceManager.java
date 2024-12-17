package ie.atu.laptopmanager;

public class DeviceManager extends DeviceManagement { // class declaration
    private int serialNumber; // Unique ID
    private String brand; // brand name
    private float price; // laptop price

    // constructor
    public DeviceManager(int serialNumber, String brand, float price) {
        this.serialNumber = serialNumber; // Assigns Serial Number to Instance Variable (int)
        this.brand = brand; // Assigns Brand to Instance Variable (String)
        this.price = price; // Changes "Price" from double to float 
    }

    // getter and setter methods
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // implementing absract method
    public void displayDetails() {
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

}
