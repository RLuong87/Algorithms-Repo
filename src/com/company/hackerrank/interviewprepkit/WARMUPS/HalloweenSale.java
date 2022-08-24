package com.company.hackerrank.interviewprepkit.WARMUPS;

import java.util.List;

public class HalloweenSale {

    public static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int amountOfGames = 0, total = 0, discount = 0;

        for (int i = p; i > 0; i--) {
            p -= d;
//            System.out.println(p);
            System.out.println(p);
            amountOfGames++;
            if (p <= m) {
                break;
            }
        }
        return amountOfGames;
    }

    public static void main(String[] args) {
        System.out.println(howManyGames(20,3,6,70));

        System.out.println(howManyGames(20, 3, 6, 85));

    }
}
