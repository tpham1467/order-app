package com.example.orderapp.model;

public class foodItem {

    private String title;
    private String cost;

    public foodItem() {
    }

    public foodItem(String title, String cost) {
        this.title = title;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
