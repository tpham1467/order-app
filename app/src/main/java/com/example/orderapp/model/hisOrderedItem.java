package com.example.orderapp.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class hisOrderedItem {
    private String nameCus;
    private String totalPaid;
    private String dateOrdered;

    public hisOrderedItem(String nameCus, String totalPaid, String dateOrdered) {
        this.nameCus = nameCus;
        this.totalPaid = totalPaid;
        this.dateOrdered = dateOrdered;
    }

    public String getNameCus() {
        return nameCus;
    }

    public void setNameCus(String nameCus) {
        this.nameCus = nameCus;
    }

    public String getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(String totalPaid) {
        this.totalPaid = totalPaid;
    }

    public String getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(String dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public hisOrderedItem() {
    }
}
