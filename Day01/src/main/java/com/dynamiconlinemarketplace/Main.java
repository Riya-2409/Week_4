package com.dynamiconlinemarketplace;

//Create the main class
public class Main {

    //Create the main method
    public static void main(String[] args) {

        // Creating BookCategory Object
        BookCategory bookCategory = new BookCategory();
        // Creating ClothingCategory Object
        ClothingCategory clothingCategory = new ClothingCategory();
        // Creating GadgetsCategory Object
        GadgetsCategory gadgetCategory = new GadgetsCategory();

        // Creating Product objects for different categories
        Product<BookCategory> book = new Product<>("The Alchemist", 20.0, bookCategory);
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 15.0, clothingCategory);
        Product<GadgetsCategory> phone = new Product<>("Smartphone", 500.0, gadgetCategory);

        // Creating a catalog to store products
        MarketplaceCatalog catalog = new MarketplaceCatalog();

        // Adding products to the catalog
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        // Displaying the product catalog
        System.out.println("Product Catalog:");
        for (Product<? extends ProductCategory> p : catalog.getProducts()) {
            System.out.println(p);
        }
        System.out.println("\nApplying Discounts:");

        // Applying discounts to products
        MarketplaceCatalog.applyDiscount(book, 10);
        MarketplaceCatalog.applyDiscount(shirt, 20);
        MarketplaceCatalog.applyDiscount(phone, 5);
    }
}
