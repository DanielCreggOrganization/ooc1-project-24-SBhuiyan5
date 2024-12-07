package ie.atu.laptopmanager; // package declaration

import java.util.ArrayList; // imports ArrayList class to create Arrays
import java.util.List; // imports list interface for functionality

public class LaptopTest { // class declaration
    public static void main(String[] args) { // main method
        List<Laptop> testLaptops = new ArrayList<>(); // list created to store laptop objects
        // new laptop objects added to instance variables
        testLaptops.add(new Laptop(101, "Asus", 500.00, false)); 
        testLaptops.add(new Laptop(102, "HP", 300.00, true));

        // prints total number of laptops within the list
        System.out.println("Total Number of Laptops: " + testLaptops.size());
    }

}
