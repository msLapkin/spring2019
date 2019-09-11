package com.geekbrains.entities;

import org.springframework.stereotype.Component;

public class Product {
    private int id;
    private int cost;
    private String title;

    public Product(int id, String title, int cost) {
        this.id = id;
        this.cost = cost;
        this.title = title;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
