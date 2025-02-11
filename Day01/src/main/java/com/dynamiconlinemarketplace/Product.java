package com.dynamiconlinemarketplace;

// Generic class representing a Product with a specific category
public class Product<T extends ProductCategory> {

    //Attributes
    private String name;
    private double price;
    private T category;

    //Constructor
    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    //Create the method to get the name of the method
    public String getName() {
        return name;
    }

    //Create the method to get the price of the method
    public double getPrice() {
        return price;
    }


    public T getCategory() {
        return category;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    @Override
    public String toString() {
        return name + " (" + category.getCategoryName() + ") - $" + price;
    }
}