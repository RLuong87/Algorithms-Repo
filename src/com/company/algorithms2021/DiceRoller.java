package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DiceRoller {

    /*
    TODO: Create a method to count values from rolling dice, get the count of 3 duplicate values and 4 duplicate values
    Start off by having two boolean values called THREE_OF_A_KIND and FOUR_OF_A_KIND, both set to false
    If 3 of the dice roll values are the same, make 3 of a kind true
    If 4 of the dice roll values are the same, make 4 of a kind true
     */

    public static void main(String[] args) {

        Random rand = new Random();

        List<Integer> diceRolls = new ArrayList<>();

        int dice = 5, roll, threeOfAKind = 3, fourOfAKind = 4, fullHouse = 5, total = 0, yahtzee = 5, yahtzeeScore = 50, fullHouseScore = 25;
        boolean THREE_OF_A_KIND = false;
        boolean FOUR_OF_A_KIND = false;

        for (int i = 0; i < dice; i++) {
            roll = rand.nextInt(6) + 1;
            diceRolls.add(roll);
        }
        System.out.println(diceRolls);

        Collections.sort(diceRolls);

        for (Integer d : diceRolls) {
            total = total + d;
        }

        int sum1 = Collections.frequency(diceRolls, 1);
        int sum2 = Collections.frequency(diceRolls, 2);
        int sum3 = Collections.frequency(diceRolls, 3);
        int sum4 = Collections.frequency(diceRolls, 4);
        int sum5 = Collections.frequency(diceRolls, 5);
        int sum6 = Collections.frequency(diceRolls, 6);

        for (int i = 0; i < diceRolls.size(); i++) {

            if (sum1 == threeOfAKind || sum2 == threeOfAKind || sum3 == threeOfAKind || sum4 == threeOfAKind || sum5 == threeOfAKind || sum6 == threeOfAKind)
                System.out.println("Three of a kind! Would you like to score " + total + " points?");
            threeOfAKind = 333;

            if (sum1 == fourOfAKind || sum2 == fourOfAKind || sum3 == fourOfAKind || sum4 == fourOfAKind || sum5 == fourOfAKind || sum6 == fourOfAKind)
                System.out.println("Four of a kind! Would you like to score " + total + " points?");
            fourOfAKind = 4444;

            if (sum1 == yahtzee || sum2 == yahtzee || sum3 == yahtzee || sum4 == yahtzee || sum5 == yahtzee || sum6 == yahtzee)
                System.out.println("Yahtzee! " + yahtzeeScore + " points!");
            yahtzee = 50;

            if ((sum1 + sum2) == fullHouse || (sum2 + sum3) == fullHouse || (sum3 + sum4) == fullHouse || (sum4 + sum5) == fullHouse || (sum5 + sum6) == fullHouse
                    || (sum1 + sum6) == fullHouse)
                System.out.print("Full House! " + fullHouseScore + " points!");
                    fullHouse = 25;
        }
        System.out.println();

//        System.out.println(threeOfAKind);
//        System.out.println(fourOfAKind);


//        System.out.println();
//        System.out.printf("1: %d, 2: %d, 3: %d, 4: %d, 5: %d, 6: %d", sum1, sum2, sum3, sum4, sum5, sum6);

//        System.out.println(2 + ": " + Collections.frequency(diceRolls, 2) + " times");
//        System.out.println(3 + ": " + Collections.frequency(diceRolls, 3) + " times");
//        System.out.println(4 + ": " + Collections.frequency(diceRolls, 4) + " times");
//        System.out.println(5 + ": " + Collections.frequency(diceRolls, 5) + " times");
//        System.out.println(6 + ": " + Collections.frequency(diceRolls, 6) + " times");

//        System.out.println();
//        System.out.println("Total points " + sum);
    }
}
