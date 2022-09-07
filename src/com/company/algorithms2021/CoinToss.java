package com.company.algorithms2021;

import java.util.Random;

public class CoinToss {

        public String tossACoin() {
            //Random utility object
            Random rand = new Random();
            /*
            Math.abs returns an absolute value, and the random method would return either
            positive or negative value
            */
            int toss = Math.abs(rand.nextInt()) % 2;
            // if number is divisible by 2 and equals to 0, return HEADS
            if (toss == 0) {
                return "HEADS";
                // else return TAILS
            } else {
                return "TAILS";
            }
        }
    }