package com.smartwarehousemanagement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class StorageTest {
    private Storage<Electronics> electronicsStorage;
    private Storage<Groceries> groceriesStorage;
    private Storage<Furniture> furnitureStorage;

    @BeforeEach
    void setUp() {
        electronicsStorage = new Storage<>();
        groceriesStorage = new Storage<>();
        furnitureStorage = new Storage<>();
    }

    @Test
    void testAddAndRetrieveElectronics() {
        Electronics laptop = new Electronics("Laptop");
        electronicsStorage.addItem(laptop);

        List<Electronics> items = electronicsStorage.getItems();
        assertEquals(1, items.size());
        assertEquals("Laptop", items.get(0).getName());
    }

    @Test
    void testAddAndRetrieveGroceries() {
        Groceries apple = new Groceries("Apple");
        groceriesStorage.addItem(apple);

        List<Groceries> items = groceriesStorage.getItems();
        assertEquals(1, items.size());
        assertEquals("Apple", items.get(0).getName());
    }

    @Test
    void testAddAndRetrieveFurniture() {
        Furniture chair = new Furniture("Chair");
        furnitureStorage.addItem(chair);

        List<Furniture> items = furnitureStorage.getItems();
        assertEquals(1, items.size());
        assertEquals("Chair", items.get(0).getName());
    }

    @Test
    void testDisplayItems() {
        electronicsStorage.addItem(new Electronics("Smartphone"));
        electronicsStorage.addItem(new Electronics("Tablet"));

        List<? extends WarehouseItem> items = electronicsStorage.getItems();
        assertEquals(2, items.size());
        assertTrue(items.stream().anyMatch(item -> item.getName().equals("Smartphone")));
        assertTrue(items.stream().anyMatch(item -> item.getName().equals("Tablet")));
    }
}