package com.smartwarehousemanagement;

public class Main {

        public static void main(String[] args) {

            Storage<Electronics> electronics = new Storage<>();
            Storage<Groceries> groceries = new Storage<>();
            Storage<Furniture> furniture = new Storage<>();

            electronics.addItem(new Electronics("LCD"));
            electronics.addItem(new Electronics("Speaker"));

            groceries.addItem(new Groceries("Potato"));
            groceries.addItem(new Groceries("Tomato"));

            furniture.addItem(new Furniture("Table"));
            furniture.addItem(new Furniture("Chair"));

            System.out.println("Electronics: ");
            Storage.displayItems(electronics.getItems());
            System.out.println("Groceries: ");
            Storage.displayItems(groceries.getItems());
            System.out.println("Furniture: ");
            Storage.displayItems(furniture.getItems());

        }

}
