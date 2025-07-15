package Level_1;

import Level_1.exceptions.EmptySaleException;
import Level_1.model.Product;
import Level_1.model.Sale;
import java.util.ArrayList;
import java.util.List;

public class MainLevel1 {
    public static void main(String[] args) {

        System.out.println("--- EMPTY SALE EXCEPTION ---");

        Sale emptySale = new Sale();
        try {
            System.out.println("Attempting to calculate the total of an empty sale...");
            emptySale.calculateTotalPrice();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        Sale filledSale = new Sale();
        filledSale.addItem(new Product("Milk", 1.20));
        filledSale.addItem(new Product("Bread", 0.95));
        filledSale.addItem(new Product("Apples (1kg)", 1.85));

        try {
            System.out.println("Calculating the total of a sale with products...");
            filledSale.calculateTotalPrice();
            System.out.println("The total price of the sale is: " + filledSale.getTotalPrice() + " €");
        } catch (EmptySaleException e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

        System.out.println("\n--- INDEX OUT OF BOUNDS EXCEPTION  ---");

        List<String> itemsList = new ArrayList<>();
        itemsList.add("Element A");
        itemsList.add("Element B");

        try {
            System.out.println("The list has " + itemsList.size() + " elements.");
            System.out.println("Attempting to access the element at index 10...");
            String element = itemsList.get(10);
            System.out.println("Element obtained: " + element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
