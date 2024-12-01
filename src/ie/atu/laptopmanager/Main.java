package ie.atu.laptopmanager;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Installation Scanner class so we can start reading user input
        Scanner userInput = new Scanner(System.in);
        List<Laptop> laptops = new ArrayList<>();
        int userSelection = 0; // Used to store user Menu option selection

        while (true) {
        System.out.println("");
        System.out.println("####################################");
        System.out.println("#         Laptop Application v0.9  #");
        System.out.println("####################################");
        System.out.println("(1) Add a Laptop.");
        System.out.println("(2) Delete a Laptop.");
        System.out.println("(3)Show total Number of Laptops.");
        System.out.println("(4)Search for a Laptop by Serial Number.");
        System.out.println("(5) Quit.");
        System.out.println("Select an option from 1 to 5 and press Enter.");

        // Store user Menu option selection
        userSelection = userInput.nextInt();

        if (userSelection == 1) { 
            addLaptop(userInput, laptops);
        }   else if (userSelection == 2) {
            deleteLaptop(userInput, laptops);
        }   else if (userSelection == 3) {
            showTotalLaptop(laptops);
        }   else if (userSelection == 4) {   
            searchLaptop(userInput, laptops);
        }   else if (userSelection == 5) {
        System.out.println("The Application Is Now Closing, Thank You!"); // Close the User Input Scanner
            userInput.close();
            break; // Break out of display menu infinite loop
        }   else {
            System.out.println("Invalid! Please Select The Options From 1 to 5, Thank You!");
        } // end it    
    } // end while
}

    private static void addLaptop(Scanner userInput, List<Laptop> laptops) {
        System.out.println("Enter Serial Number:        ");
        int serialNumber = userInput.nextInt();
        System.out.println("Enter Brand:                ");
        String brand = userInput.next();
        System.out.println("Enter Price:                ");
        float price = userInput.nextFloat();
        System.out.println("Enter isSold:                 ");
        boolean isSold = userInput.nextBoolean();

        laptops.add(new Laptop(serialNumber, brand, price, isSold));
        System.out.println("Laptop Added Successfully");
    } 
    
    private static void deleteLaptop(Scanner userInput, List<Laptop> laptops) {
        System.out.println("Enter Serial Number of Laptop to Delete:       ");
        int serialNumber = userInput.nextInt();

        boolean found = false;
        for (Laptop laptop : laptops) {
            if (laptop.getSerialNumber() == serialNumber) {
                laptops.remove(laptop);
                System.out.println("Laptop with Serial Number " + serialNumber + "has been deleted.");
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Laptop with Serial Number " + serialNumber + "has not found.");
        }
    }

    private static void showTotalLaptop(List<Laptop> laptops) {
        System.out.println("Show Total Number of Laptops: " + laptops.size());
    }

    private static void searchLaptop(Scanner userInput, List<Laptop> laptops) {
        System.out.println("Enter the Serial Number of Laptop from the Search:     ");
        int serialNumber = userInput.nextInt();
        boolean found = false;
        for (Laptop laptop : laptops) {
            if(laptop.getSerialNumber() == serialNumber) {
                System.out.println("Laptop Found:                                  ");
                System.out.println("Serial Number:      " + laptop.getSerialNumber());
                System.out.println("Brand:              " + laptop.getBrand());
                System.out.println("Price:              " + laptop.getPrice());
                System.out.println("Is Sold:            " + laptop.getIsSold());
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Laptop with Serial Number " + serialNumber + " not found.");    
        }
    } // end main method
} // end main class
