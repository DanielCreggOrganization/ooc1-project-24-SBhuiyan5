[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=17263122)
# OOC1 Project

**Title:** Laptop Application Manager  
**Name:** Sabirina Bhuiyan  
**Student ID:** G00416931  

## Application Function

The main.java file is like the entry point for the rest of the files, I've made a very basic menu using the while loop function which allows users to see a few different options, like for example, I got those options, to add, delete, check total number, search by serial number and to quit the application. The menu stays as a loop until the user selects the quit option.

Now let me talk about the methods I used in this particular file. 

The addLaptop method lets the users add a new laptop to the list, it can collect details like brand, price, serial number and if it is sold or not. With these details u create a new laptop object which then gets added to the list. 

The deleteLaptop method is there if a user wants to get rid of a laptop by providing the serial number. This method searches through the list with the provided serial number and if there’s a match it removes the laptop. 

The showTotalLaptop method is straightforward, it shows the total number of laptops that there is in the list by using the size() method in the ArrayList. 

The searchLaptop method allows the user to search for a laptop by entering a serial number. If there is an existing match it prints out the details, like the brand name, price, serial number, and whether it’s sold or not. 

## Running the Application

Provide step by step instructions on how to run your applicaiton. Are there any prerequisite softwares required?

```list
List the instructions step by step
    1. Copy repository link into a new tab and open
    2. Locate 'Main.java' class and in the 'ie.atu.laptopmanager' package
    3. Compile the project to ensure there are no syntax errors
    4. Then run 'Main.java' to start the application
    5. Look at the menu prompts and interact with the application
```

## Minimum Project Requirements

Describe how you have met all minimum project requirements below:

* The repository contains, at few commits per week for that i have worked on this project
* The project, including code and documentation, is fully contained in the provided GitHub Classroom repository.
* Methods = Add Laptop, Delete Laptop, Show Total Number of Laptops, Search for Laptop, and Quit.
* The 4 pillars of oop is included, Polymorphism, Abstraction, Inheritance, and Encapsulation.
* The code should compile if there are no syntax errors.
* The application code is formatted in a consistent and standard way.
* The code contains comments on almost every line, to help keep small desciption for each line of code.
* The documentation and commentary is free of a grammar and speling mistakes.

## Project Requirements above and beyond

This project goes above and beyond basic requirements by including the following features:

1.Polymorphism - The 'Device.java' class is used as a base class for 'Laptop.java' class,
  which allows devices to be stored and iterated through a common interface.

2.Abraction - The 'DeviceManagemnet.java' is an abstract class, the method that defines the abract method
  i used is the 'displayDetails()' method.

3.Inheritance - The 'Device.java' is a parent class, where 'Laptop.java' and 'DeviceManager.java' inherit
  from it. Because of this there is a shared usage for getters and setters methods such as serialNumber, 
  brand, price, can be used without code duplication.

4.Encapsulation - This is implemented through the use of private fields such as serialNumber, brand, price, 
  isSold and getters and setters methods to protect/control these private fields.

5.Error Handling - There is a decent way of handling errors such as the deleteLaptop method.

6.Reusable Architecture - Implemented methods such as while loop function so therefore reusable unless quit 
  option is selected

7.Better User Experience - Menu options put, easy enough for user to understand and use.

## Application Architecture

So let me explain how 'Main.java' connects with the rest of the java files and what they do or have.
In 'LaptopTest.java', I demonstrate one of the 4 classes of oop, and for this specific file I implement polymorphism by creating a list of devices and adding laptop objects to it. I then iterate through the list to display the details of each device there is.

Then we have 'Device.java', this is the base class that represents any type of device. I put in the common attributes such as brand, price, serialNumber, and in this file I also provided getter and setter methods, which is used to make my code more secure and protected. The getter method is meant to return the variable number, and the setter method sets the value. 

'Laptop.java' is a subclass for 'Device.java' which is used to represent a specific laptop. In 'Device.java' we had the common attributes, but here we have an additional attribute called isSold, which indictates if the laptop has been sold or not. I’ve also overridden the displayDetails method for additional information. 

'DeviceManagement.java' is an abstract class that defines the displayDetails method. 'Laptop.java', which is a subclass as mentioned earlier, implement the displayDetails method to display specific details

'LaptopSorter.java' is created so that it can sort the list of laptops based on their brand and price. If the list is empty it prints out a message instead of sorting.

## Roadblocks and Unfinished Functionality

I wanted to do enhanced features, and when i attempted to i'd have one file right, but when i check other files there is errors, so when i go back to the original files i changed there would be errors in all files, so i ended
up just leaving it, it's beyond my personal capability as well, so hopefully in the future i learn more about advanced java coding, bsaed of this project i've understood the basic requirements and yes i've learned a lot of new things in comparison when i first started to learn about java. Let me share some of the unfinished functionalities and solutions i came across. 

Roadblocks: It was challenging to ensure that my project did not face any form of errors and can compile and run 
            without any issues. 
Solution  : I added checks to verify user inputs which makes the application more user-friendly with no errors.

Roadblocks: For the delete method the laptops would not deletefrom the list when entering serial number.

Solution  : Added an iterator to fix this problem.

Unfinished Functionality: I didn't finish the function to sort laptops by brand, price etc. However i did go back and attempted something, i don't seem to have any issues when i run the file, so i'm assuming i'm ok with it. Overall, i  attempted my best effort i could and skipped a few of the enhanced features as it is beyond my personal capability.

## Resources

Provide links to resources used:

* [Tutorialspoint](https://www.tutorialspoint.com/java/) - Java Tutorials site I found helpful
  [W3schools]     (https://www.w3schools.com/java/)
  [GeeksforGeeks] (https://www.geeksforgeeks.org/java/)
  [Baeldung]      (https://www.baeldung.com/java-comparator-comparable)
  [Blog]          (https://blog.devgenius.io/java-comparator-a-step-by-step-tutorial-1ccf9429d180)
  [Javapoint]     (https://www.javatpoint.com/collections-in-java)
  [YouTube]       (I forgot what tutorials i watched...)
  
