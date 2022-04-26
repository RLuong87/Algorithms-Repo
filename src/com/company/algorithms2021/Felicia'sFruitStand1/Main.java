package com.company;

/*

************************************************************************************************************************
_________________________________________FELICIA'S FRUIT STAND 1-MOBCODE________________________________________________

Felicia's fruit stand has upgraded. She now serves fruits and meat now.
Create a new IntelliJ project called "Felicia'sFruitStand"
Objects
Create a Fruit class that has properties for price, name, quantity available and quantity sold
Create a Stand class that has a property for inventory

*****************************************************Methods************************************************************

The Fruit class should have an "Override" toString method that returns an output with all of a Fruits' information
The Fruit class should also include methods called "purchase" & "addInventory" that update the available and sold
quantity of the fruit.

The Stand class should have a method called displayFruit that prints the information of all Fruits available.
________________________________________________________________________________________________________________________
************************************************************************************************************************

*/

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Fruit(String name, int price, int qSold, int qAvail)
        Main.Fruit fruit1 = new Main.Fruit("Banana",300, 80, 50);
        Main.Fruit fruit2 = new Main.Fruit("Mango", 500, 100, 40);
        Main.Fruit fruit3 = new Main.Fruit("Apple", 250, 150, 80);

//        fruit1.addInventory(5);
//        System.out.println(fruit1.getQuantAvailable());

//        fruit2.purchase(10);
//        System.out.println(fruit2.getQuantAvailable());

        Stand data = new Stand();
        System.out.println(Arrays.toString(data.displayFruit(data.fruits)));

        System.out.println(fruit2.toString());

    }
}
