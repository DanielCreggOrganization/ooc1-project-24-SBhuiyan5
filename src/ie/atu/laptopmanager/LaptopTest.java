package ie.atu.laptopmanager; // package declaration

import java.util.ArrayList; // imports ArrayList class to create Arrays
import java.util.List; // imports list interface for functionality

public class LaptopTest { // class declaration
    public static void main(String[] args) { // main method
        List<Device> devices = new ArrayList<>(); // add laptop objects (polymorphism)

        // add laptop objects to device list
        devices.add(new Laptop(101, "Asus", 500.00f, false));
        devices.add(new Laptop(102, "HP", 300.00f, true));

        // itterate through the devices
        for (Device device : devices) {
            System.out.println("Device: " + device.getBrand() + ", Price: " + device.getPrice());
        }
    }

}
