package com.company;

/*

************************************************************************************************************************
__________________________________________________STAND CLASS___________________________________________________________
Create a Stand class that has a property for inventory
The Stand class should have a method called displayFruit that prints the information of all Fruits available

*Stand.Inventory
________________________________________________________________________________________________________________________

************************************************************************************************************************

*/

import java.text.NumberFormat;

public class Stand {

    String[] fruits = {"Banana", "Mango", "Apple"};
    int[] prices = {300, 500, 250};
    int[] inventory = {130, 140, 230};

    public String[] displayFruit(String[] types) {

        NumberFormat curr = NumberFormat.getCurrencyInstance();

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i] + ": " + curr.format(prices[i] / 100) + " per fruit. " + inventory[i] + " in stock");
        }

        return types;
    }
}
