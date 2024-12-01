package ie.atu.laptopmanager;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = a new Scanner(System.in);
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
        System.out.println("(1) Add a Student.");
        System.out.println("(2) Delete a Student.");
        System.out.println("(3)Show total Number of Students.");
        System.out.println("(4)Search for a Student by ID.");
        System.out.println("(5) Quit.");
        System.out.println("Select an option from 1 to 5 and press Enter.");

        // Store user Menu option selection
        userSelection = userInput.nextInt();

        if (userSelection == 5) { // Quit

            System.out.println("Laptop Application Closing - Goodbye!");
            // Close the User Input Scanner
            userInput.close();
            break; // Break out of display menu infinite loop
        } // end it
    } // end while
  } // end main method
} // end Main class
