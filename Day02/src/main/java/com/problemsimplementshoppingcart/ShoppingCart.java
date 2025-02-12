package com.problemsimplementshoppingcart;

import java.util.*;

class ShoppingCart<T extends Number> {
    // HashMap for quick lookups (Product Name -> Product)
    private Map<String, Product<T>> productsHashMap = new HashMap<>();

    // LinkedHashMap to maintain insertion order (Product Name -> Product)
    private Map<String, Product<T>> productsLinkedHashMap = new LinkedHashMap<>();

    // TreeMap to display products sorted by price (Price -> List of Products)
    private Map<Double, List<Product<T>>> productsTreeMap = new TreeMap<>();

    // Add product to all maps
    public void addProduct(String name, T price) {
        Product<T> product = new Product<>(name, price);

        // Add to HashMap for quick lookup
        productsHashMap.put(name, product);

        // Add to LinkedHashMap to maintain insertion order
        productsLinkedHashMap.put(name, product);

        // Add to TreeMap to maintain sorted order by price
        productsTreeMap.computeIfAbsent(price.doubleValue(), k -> new ArrayList<>()).add(product);
    }

    // Display all products in the order they were added
    public void displayProductsInOrder() {
        System.out.println("\nProducts in Order Added (LinkedHashMap):");
        productsLinkedHashMap.forEach((key, value) -> System.out.println(value));
    }

    // Display all products sorted by price
    public void displayProductsSortedByPrice() {
        System.out.println("\nProducts Sorted by Price (TreeMap):");
        productsTreeMap.forEach((price, productList) -> productList.forEach(System.out::println));
    }

    // Display all products (quick lookup using HashMap)
    public void displayAllProducts() {
        System.out.println("\nAll Products (HashMap):");
        productsHashMap.forEach((key, value) -> System.out.println(value));
    }

    // Remove product by name
    public void removeProduct(String name) {
        Product<T> product = productsHashMap.remove(name);
        if (product != null) {
            productsLinkedHashMap.remove(name);
            productsTreeMap.get(product.getPrice().doubleValue()).remove(product);
            if (productsTreeMap.get(product.getPrice().doubleValue()).isEmpty()) {
                productsTreeMap.remove(product.getPrice().doubleValue());
            }
        }
    }
}

