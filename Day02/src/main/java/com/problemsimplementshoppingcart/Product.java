package com.problemsimplementshoppingcart;

class Product<T extends Number> {
    private String name;
    private T price;

    public Product(String name, T price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public T getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

