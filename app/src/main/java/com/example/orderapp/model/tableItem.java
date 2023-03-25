package com.example.orderapp.model;

public class tableItem {
    private String nameTable;
    private int status;
    private int numServed;
    private int totalServe;

    public String getTotalCostFood() {
        return totalCostFood;
    }

    public void setTotalCostFood(String totalCostFood) {
        this.totalCostFood = totalCostFood;
    }

    private String totalCostFood;

    public String getNameTable() {
        return nameTable;
    }

    public void setNameTable(String nameTable) {
        this.nameTable = nameTable;
    }

    public int isStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getNumServed() {
        return numServed;
    }

    public void setNumServed(int numServed) {
        this.numServed = numServed;
    }

    public int getTotalServe() {
        return totalServe;
    }

    public void setTotalServe(int totalServe) {
        this.totalServe = totalServe;
    }

    public tableItem() {
    }

    public tableItem(String nameTable, int status, int numServed, int totalServe, String total) {
        this.nameTable = nameTable;
        this.status = status;
        this.numServed = numServed;
        this.totalServe = totalServe;
        this.totalCostFood = total;
    }
}
