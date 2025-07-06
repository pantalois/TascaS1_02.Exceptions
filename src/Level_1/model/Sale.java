package Level_1.model;

import Level_1.exceptions.EmptySaleException;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Sale {
    public List<Product> item;
    public double totalPrice;

    public Sale() {
        this.item = new ArrayList<>();
        this.totalPrice = 0;
    }

    public void addItem(Product product) {
        this.item.add(product);
    }

    public void calculateTotalPrice() throws EmptySaleException {
        if (this.item.isEmpty()) {
            throw new EmptySaleException();
        }
        this.totalPrice = 0;
        for (Product product : item) {
            this.totalPrice += product.getPrice();
        }
        System.out.println("Total Price: " + this.totalPrice);
    }


    public void getPrice() throws EmptySaleException {
        Scanner scanner = new Scanner(System.in);
        boolean coincide = false;
        if (this.item.isEmpty()) {
            throw new EmptySaleException();
        }
            while (!coincide) {
                System.out.println("Of which product do you want to know the price? ");
                for (Product product : item) {
                    System.out.println(product.getName());
                }
                String productName = scanner.nextLine();
                for (Product product : item) {
                    if (productName.equals(product.getName())) {
                        System.out.println("The product " + product.getName() + " has a price of " + product.getPrice() + "€");
                        coincide = true;
                        break;
                    }
                }
                if (!coincide) {
                    System.out.println("You choosed a product that is not added to sales");
                }
            }
        }
    }




