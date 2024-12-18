package ie.atu.laptopmanager; // package declaration

import java.util.Scanner; // imports scanner for reading user input
import java.util.ArrayList; // imports ArrayList class to create Arrays
import java.util.List; // imports list interface for functionality

public class Main { // class declaration

    private static ArrayList<Laptop> laptops;
        public static void main(String[] args) { // main method
            // Installation Scanner class so we can start reading user input
            Scanner userInput = new Scanner(System.in);
            List<Laptop> laptops = new ArrayList<>(); // list created to store laptop objects
            int userSelection = 0; // Used to store user Menu option selection
    
            while (true) { // infinite loop for displaying menu
            // display menu with options available for user
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
        // method to add a laptoo to the list
        private static void addLaptop(Scanner userInput, List<Laptop> laptops) {
            System.out.println("Enter Serial Number:        ");
            int serialNumber = userInput.nextInt();
            System.out.println("Enter Brand:                ");
            String brand = userInput.next();
            System.out.println("Enter Price:                ");
            float price = userInput.nextFloat();
            System.out.println("Enter isSold:                 ");
            boolean isSold = userInput.nextBoolean();
            // create and add a new laptop opbject to the list
            laptops.add(new Laptop(serialNumber, brand, price, isSold));
            System.out.println("Laptop Added Successfully");
        } 
        
        // method to delete a laptop from the list
        private static void deleteLaptop(Scanner userInput, List<Laptop> laptops) {
            System.out.println("Enter Serial Number of Laptop to Delete:       ");
            int serialNumber = userInput.nextInt();
    
            boolean found = false; // to see if laptop is found or not
            for (Laptop laptop : laptops) {
                if (laptop.getSerialNumber() == serialNumber) { // checks for matching serial number
                    laptops.remove(laptop); // removes laptop from list
                    System.out.println("Laptop with Serial Number " + serialNumber + "has been deleted.");
                    found = true;
                    break; // exit the loop
                }
            }
            if (found) { // if laptop not found
                System.out.println("Laptop with Serial Number " + serialNumber + "has not found.");
            }
        }
        
        // method to show total number of laptops
        private static void showTotalLaptop(List<Laptop> laptops) {
            System.out.println("Show Total Number of Laptops: " + laptops.size()); // display number of laptops
        }
    
        // method to search laptop by serial number
        private static void searchLaptop(Scanner userInput, List<Laptop> laptops) {
            System.out.println("Enter the Serial Number of Laptop from the Search:     "); // prompt for serial number
            int serialNumber = userInput.nextInt();
            boolean found = false; // to see laptop is found or not
            for (Laptop laptop : laptops) {
                if(laptop.getSerialNumber() == serialNumber) { // check for matching serial number
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
                System.out.println("Laptop with Serial Number " + serialNumber + " not found."); }   
            }
} // end main class

