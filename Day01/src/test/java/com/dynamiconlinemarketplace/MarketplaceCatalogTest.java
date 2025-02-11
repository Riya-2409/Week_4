package com.dynamiconlinemarketplace;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class MarketplaceCatalogTest {
    private MarketplaceCatalog catalog;
    private BookCategory bookCategory;
    private ClothingCategory clothingCategory;
    private GadgetsCategory gadgetCategory;

    @BeforeEach
    void setUp() {
        catalog = new MarketplaceCatalog();
        bookCategory = new BookCategory();
        clothingCategory = new ClothingCategory();
        gadgetCategory = new GadgetsCategory();
    }

    @Test
    void testAddAndRetrieveProducts() {
        Product<BookCategory> book = new Product<>("Java Programming", 500, bookCategory);
        Product<ClothingCategory> tshirt = new Product<>("Cotton T-shirt", 300, clothingCategory);
        Product<GadgetsCategory> phone = new Product<>("Smartphone", 20000, gadgetCategory);

        catalog.addProduct(book);
        catalog.addProduct(tshirt);
        catalog.addProduct(phone);

        List<Product<? extends ProductCategory>> products = catalog.getProducts();
        assertEquals(3, products.size());

        assertEquals("Java Programming", products.get(0).getName());
        assertEquals(500, products.get(0).getPrice());
        assertEquals("Books", products.get(0).getCategory().getCategoryName());

        assertEquals("Cotton T-shirt", products.get(1).getName());
        assertEquals(300, products.get(1).getPrice());
        assertEquals("Clothing", products.get(1).getCategory().getCategoryName());

        assertEquals("Smartphone", products.get(2).getName());
        assertEquals(20000, products.get(2).getPrice());
        assertEquals("Gadgets", products.get(2).getCategory().getCategoryName());
    }

    @Test
    void testApplyDiscount() {
        Product<BookCategory> book = new Product<>("Java Programming", 500, bookCategory);
        Product<ClothingCategory> tshirt = new Product<>("Cotton T-shirt", 300, clothingCategory);

        catalog.addProduct(book);
        catalog.addProduct(tshirt);

        catalog.applyDiscount(book, 10); // 10% discount
        catalog.applyDiscount(tshirt, 20); // 20% discount

        assertEquals(450, book.getPrice());
        assertEquals(240, tshirt.getPrice());
    }

    @Test
    void testToString() {
        Product<GadgetsCategory> phone = new Product<>("Smartphone", 20000, gadgetCategory);
        assertEquals("Smartphone (Gadgets) - $20000.0", phone.toString());

        Product<ClothingCategory> tshirt = new Product<>("Cotton T-shirt", 300, clothingCategory);
        assertEquals("Cotton T-shirt (Clothing) - $300.0", tshirt.toString());
    }
}