package ie.atu.laptopmanager; // package declaration

public class Laptop extends Device { // class declaration
    private boolean isSold; // specific attribute

    // Constructor
    public Laptop(int serialNumber, String brand, float price, boolean isSold){
        super(serialNumber, brand, price); // calls parent class constructor
        this.isSold = isSold; // Assigns isSold to Instance Variable (boolean)
    }

// Getter and Setter Methods for isSold
public boolean getIsSold() {
    return isSold;
}

public void setIsSold(boolean isSold) {
    this.isSold = isSold;
}

// overriden for addition info
public void displayDetails() {
    super.displayDetails();
    System.out.println("Is Sold: " + isSold);
}
}
