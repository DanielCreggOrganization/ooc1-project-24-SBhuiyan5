package ie.atu.laptopmanager;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        List<Laptop> laptops = new ArrayList<>();
        int userSelection = 0;

        // Installation Scanner class so we can start reading user input
        Scanner userInput = new Scanner(System.in);
        int userSelection = 0; // Used to store user Menu option selection

        while (true) {
        System.out.println("");
        System.out.println("####################################");
        System.out.println("#         Laptop Application v0.9  #");
        System.out.println("####################################");
        System.out.println("(1) Add a Laptop.");
        System.out.println("(2) Delete a Laptop.");
        System.out.println("(3)Show total Laptops by Serial Number.");
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
            System.out.println("The Application Is Now Closing, Thank You!") // Close the User Input Scanner
            userInput.close();
            break; // Break out of display menu infinite loop
        }   else {
            System.out.println("Invalid! Please Select The Options From 1 to 5, Thank You!");
                } // end it    
            } // end while
        } // end main method

     } // end main class
