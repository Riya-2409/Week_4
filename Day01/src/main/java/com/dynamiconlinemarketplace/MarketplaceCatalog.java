package com.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

//Create the class name MarketplaceCatalog
public class MarketplaceCatalog {

    // List to store products of different categories using generics
    private List<Product<? extends ProductCategory>> products = new ArrayList<>();

    public void addProduct(Product<? extends ProductCategory> product) {
        products.add(product);
    }

    public List<Product<? extends ProductCategory>> getProducts() {
        return products;
    }

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        // Calculate the discount amount
        double discountAmount = product.getPrice() * (percentage / 100);

        // Set the new price after discount
        product.setPrice(product.getPrice() - discountAmount);

        // Display the updated product price
        System.out.println("Discount applied! New price of " + product.getName() + ": $" + product.getPrice());
    }
}