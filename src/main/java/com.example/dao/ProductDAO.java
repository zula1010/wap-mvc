package com.example.dao;

import com.example.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDAO {
    Map<Integer, Product> productsDb = new HashMap<>();

    {
        productsDb.put(1, new Product(1,"jeans1", 30.0));
        productsDb.put(2, new Product(2,"jeans2", 20.0));
        productsDb.put(3, new Product(3,"jeans3", 10.0));
        productsDb.put(4, new Product(4,"jeans4", 35.0));
        productsDb.put(5, new Product(5,"jeans5", 23.0));
        productsDb.put(6, new Product(6,"jeans6", 13.0));
        productsDb.put(7, new Product(7,"jeans7", 16.0));
        productsDb.put(8, new Product(8,"jeans8", 33.0));

    }

    public List<Product> getAllProducts(){
        return new ArrayList<>(productsDb.values());
    }

    public Product getProductById(int productId){
        return productsDb.get(productId);
    }


}
