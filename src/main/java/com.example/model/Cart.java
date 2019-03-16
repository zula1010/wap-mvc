package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;
    public Cart(){
        this.products = new ArrayList<>();
    }
    public List getCart(){
        return this.products;
    }

    public void addToCart(Product product){
        this.products.add(product);
    }
    public List getProducts(){
        return products;
    }
    public int getSize(){
        return products.size();
    }

}
