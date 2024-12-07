package ie.atu.laptopmanager;

import java.util.ArrayList;
import java.util.List;

public class LaptopTest {
    public static void main(String[] args) {
        List<Laptop> testLaptops = new ArrayList<>();
        testLaptops.add(new Laptop(101, "Asus", 500.00, false));
        testLaptops.add(new Laptop(102, "HP", 300.00, true));

        System.out.println("Total Number of Laptops: " + testLaptops.size());
    }

}
