package Level_1.model;

import Level_1.exceptions.EmptySaleException;
import java.util.ArrayList;
import java.util.List;


public class Sale {
    private final List<Product> items;
    private double totalSalePrice;

    public Sale() {
        this.items = new ArrayList<>();
        this.totalSalePrice = 0;
    }

    public void addItem(Product product) {
        this.items.add(product);
    }

    public void calculateTotalPrice() throws EmptySaleException {
        if (this.items.isEmpty()) {
            throw new EmptySaleException("To make a sale you must add products first");
        }
        double totalPrice = 0;
        for (Product product : items) {
            totalPrice += product.getPrice();
        }
        this.totalSalePrice = totalPrice;
    }


    public double getTotalPrice(){
        return this.totalSalePrice;
        }
}