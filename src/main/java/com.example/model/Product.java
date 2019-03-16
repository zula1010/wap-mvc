package com.example.model;

public class Product {

    private String name;
    private String description;
    private double price;
    private String picturePath;
    private int id;

    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Product(String name, double price){
        super();
        this.name = name;
        this.description= name;
        this.price=price;
        this.picturePath = "resources/images/"+name+".jpg";
    }

    public Product(int id, String name, double price){
        super();
        this.id = id;
        this.name = name;
        this.description= name;
        this.price=price;
        this.picturePath = "resources/images/"+name+".jpg";
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPicturePath(){
        return this.picturePath;
    }
    public void setPicturePath(String path){
        this.picturePath = path;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
