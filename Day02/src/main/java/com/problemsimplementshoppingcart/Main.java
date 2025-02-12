package com.problemsimplementshoppingcart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart<Double> cart = new ShoppingCart<>();

        // Adding products (name, price)
        cart.addProduct("Laptop", 1200.99);
        cart.addProduct("Headphones", 150.00);
        cart.addProduct("Mouse", 25.99);
        cart.addProduct("Keyboard", 80.75);

        // Display products in the order they were added
        cart.displayProductsInOrder();

        // Display products sorted by price
        cart.displayProductsSortedByPrice();

        // Display all products (quick lookup)
        cart.displayAllProducts();

        // Remove a product and show updated cart
        cart.removeProduct("Mouse");
        System.out.println("\nAfter removing Mouse:");
        cart.displayProductsInOrder();
        cart.displayProductsSortedByPrice();
    }
}

