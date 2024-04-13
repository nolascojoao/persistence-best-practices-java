package com.nolascojoao.data.db;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class serves as a model to better visualize how nested HashMaps can simulate a real database.
 * It is not intended to be used or executed.
 * It is simply a way to document this study.
 */
public class HashMapSimulatedDatabase {

    // Structure to simulate a users table using nested HashMap
    Map<String, Map<String, Object>> usersTable = new HashMap<>();

    // Adding a user
    Map<String, Object> user1 = new HashMap<>();
    {
        user1.put("name", "John");
        user1.put("age", 30);
        user1.put("email", "john@example.com");
        usersTable.put("1", user1);
    }

    // Retrieving a user by ID
    Map<String, Object> retrievedUser = usersTable.get("1");

    // Structure to simulate a products table using nested HashMap
    Map<String, Map<String, Object>> productsTable = new HashMap<>();

    // Adding a product
    Map<String, Object> product1 = new HashMap<>();
    {
        product1.put("name", "Smartphone");
        product1.put("price", 499.99);
        product1.put("description", "A powerful smartphone with advanced features.");
        productsTable.put("1001", product1);
    }

    // Structure to simulate an orders table using nested HashMap
    Map<String, Map<String, Object>> ordersTable = new HashMap<>();

    // Adding an order
    Map<String, Object> order1 = new HashMap<>();
    {
        order1.put("customerId", "1");
        order1.put("orderDate", LocalDate.now());
        List<Map<String, Object>> orderItems = new ArrayList<>();
        Map<String, Object> item1 = new HashMap<>();
        item1.put("productId", "1001");
        item1.put("quantity", 2);
        orderItems.add(item1);
        order1.put("items", orderItems);
        ordersTable.put("20001", order1);
    }

    // Retrieving an order by ID
    Map<String, Object> retrievedOrder = ordersTable.get("20001");
    
}
