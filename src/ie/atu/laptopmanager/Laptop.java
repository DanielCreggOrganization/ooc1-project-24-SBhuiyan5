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

    public Laptop(int i, String string, int j) {
        //TODO Auto-generated constructor stub
    }

    public Laptop(int serialNumber2, String string, int price2, boolean isSold2) {
        //TODO Auto-generated constructor stub
    }

    // Getter and Setter Methods
    public int getSerialNumber() {
        return this.serialNumber;
    }

    public String getBrand() {
        return this.brand;
    }

    public float getPrice() {
        return this.price;
    }

    public boolean getIsSold() {
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

    public void setisSold(boolean isSold) {
        this.isSold = isSold;
    }
}
