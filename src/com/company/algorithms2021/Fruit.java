package com.company.algorithms2021;

import java.text.NumberFormat;

public class Fruit {

    private int price = 0;
    private String name = "";
    private int quantAvailable = 0;
    private int quantSold = 0;

    public Fruit(String name, int price, int qSold, int qAvail) {
        this.name = name;
        this.price = price;
        this.quantSold = qSold;
        this.quantAvailable = qAvail;
    }

    public void purchase(int value) {

        this.quantSold += value;
        this.quantAvailable -= value;

    }

    public void addInventory(int value) {

        this.quantAvailable += value;

    }

    public int getQuantAvailable() {

        return quantAvailable;
    }

    public String toString() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        String outPut = "";
        outPut += "Name: " + name + "\n" + "Price: " + currency.format(price / 100) + "\n" + "Quantity Avalable: " + quantAvailable + "\n" +
                "Amount Sold: " + quantSold + "\n";
        return outPut;
    }
}
