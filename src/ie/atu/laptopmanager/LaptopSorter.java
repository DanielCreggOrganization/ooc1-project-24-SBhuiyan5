package ie.atu.laptopmanager; // package declaration

import java.util.ArrayList; // imports ArrayList class to create Arrays
import java.util.Comparator; // imports Comparator interface to define sorting
import java.util.Collections; // imports Collections class to sort

public class LaptopSorter { // class declaration
    private static ArrayList<Laptop> laptop; // declares static ArrayList to store Laptop Objects
    // method to sort laptops by brand
        public static void sortByBrand(ArrayList<Laptop> laptops) {
            if (laptop.isEmpty()) { // to check if list is empty
            System.out.println("No Laptops Sorted by Brand"); // message printed
            return;
        }

        // sorts list of laptops based on brand using comparator
        Collections.sort(laptops, Comparator.comparing(Laptop::getBrand));
        System.out.println("Laptops Sorted by Brand: "); // message printed
        displayLaptops(laptops); // calls this method to print sorted list
    }

    //method to sort laptops by price
    public static void sortByPrice(ArrayList<Laptop> laptops) {
        if (laptop.isEmpty()) { // to check if list is empty
            System.out.println("No Laptops Sorted by Brand"); // message printed
            return;
        }
    
     // sorts list of laptops based on price using comparator
        Collections.sort(laptops, Comparator.comparing(Laptop::getPrice));
        System.out.println("Laptops Sorted by Price: "); // message printed
        displayLaptops(laptops); // calls this method to print sorted list
    }

    // method to display each laptop in the list
    private static void displayLaptops(ArrayList<Laptop> laptops) {
        for (Laptop laptop : laptops) { // iterated through each laptop in the list
            System.out.println(laptop); // prints details of each laptop
        }
    }
}
