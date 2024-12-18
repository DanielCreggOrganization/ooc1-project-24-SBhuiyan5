package ie.atu.laptopmanager; // package declaration

import java.util.ArrayList; // imports ArrayList class to create Arrays
import java.util.Comparator; // imports 
import java.util.Collections; // imports 

public class LaptopSorter {
    private static ArrayList<Laptop> laptop;
        public static void sortByBrand(ArrayList<Laptop> laptops) {
            if (laptop.isEmpty()) {
            System.out.println("No Laptops Sorted by Brand");
            return;
        }

        Collections.sort(laptops, Comparator.comparing(Laptop::getBrand));
        System.out.println("Laptops Sorted by Brand: ");
        displayLaptops(laptops);
    }
    public static void sortByPrice(ArrayList<Laptop> laptops) {
        if (laptop.isEmpty()) {
            System.out.println("No Laptops Sorted by Brand");
            return;
        }

        Collections.sort(laptops, Comparator.comparing(Laptop::getPrice));
        System.out.println("Laptops Sorted by Price: ");
        displayLaptops(laptops);
    }
    private static void displayLaptops(ArrayList<Laptop> laptops) {
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }
}
