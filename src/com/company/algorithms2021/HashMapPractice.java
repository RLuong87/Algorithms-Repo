package com.company.algorithms2021;

import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {

        // A map is an abstract class (abstract data type)
        // HashMap is a specific implementation of a map
        HashMap<String, Integer> upperSection = new HashMap<>();
        upperSection.put("Ones", 3);
        upperSection.put("Twos", 6);
        upperSection.put("Threes", 9);
        upperSection.put("Fours", 8);
        upperSection.put("Fives", 15);

        System.out.println(upperSection.containsValue(9)); // Check for a value
        System.out.println(upperSection.containsKey("Ones")); // Check for a key
        System.out.println(upperSection.values()); // Print out all the values
        System.out.println(upperSection.keySet()); // Print out all the keys
        upperSection.replace("Fives", 15, 20); // Replace values
        upperSection.remove("Fives", 20); // remove key & value
        System.out.println(upperSection.get("Fives"));


        HashMap<String, Integer> lowerSection = new HashMap<>();
        lowerSection.put("Three of a kind", 0);
        lowerSection.put("Four of a kind", 0);
        lowerSection.put("Full House", 25);
        lowerSection.put("Small straight", 30);
        lowerSection.put("Large straight", 40);
        lowerSection.put("Yahtzee", 50);
        lowerSection.put("Chance", 0);

        System.out.println(lowerSection.containsValue(50));
        System.out.println(lowerSection.containsKey("Full House"));
        System.out.println(lowerSection.values());
        System.out.println(lowerSection.keySet());
        System.out.println(lowerSection.size()); // Get the size of the hashmap

        System.out.println("Three of a kind: " + lowerSection.get("Three of a kind") + " points");
        System.out.println("Four of a kind: " + lowerSection.get("Four of a kind") + " points");
        System.out.println("Full House: " + lowerSection.get("Full House") + " points");
        System.out.println("Small straight: " + lowerSection.get("Small straight") + " points");
        System.out.println("Large straight: " + lowerSection.get("Large straight") + " points");
        System.out.println("Yahtzee: " + lowerSection.get("Yahtzee") + " points");
        System.out.println("Chance: " + lowerSection.get("Chance") + " points");
    }
}
