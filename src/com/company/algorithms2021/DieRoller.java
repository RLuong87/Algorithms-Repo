package com.company.algorithms2021;

import java.util.Random;

public class DieRoller {

    public static void main(String[] args) {

        Random r = new Random();
        int dice = 5, roll;

        for (int i = 0; i < dice; i++) {
            roll = r.nextInt(6) + 1;
            System.out.println("You rolled a " + roll);
        }
    }
}
