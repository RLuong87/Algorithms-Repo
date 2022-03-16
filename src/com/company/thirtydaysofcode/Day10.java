package com.company.thirtydaysofcode;

import java.util.Arrays;
import java.util.Collections;

public class Day10 {

    public static void main(String[] args) {

        int n = 125, max = 0;
        int currentConsecutiveOnes = 0, maxConsecutiveOnes = 0;
        String bin = Integer.toBinaryString(n);

        for (char digit : bin.toCharArray()) {
            if (digit == '1') {
                currentConsecutiveOnes++;
            } else {
                if (currentConsecutiveOnes > maxConsecutiveOnes) {
                    maxConsecutiveOnes = currentConsecutiveOnes;
                }
                currentConsecutiveOnes = 0;
            }
        }

        if (currentConsecutiveOnes > maxConsecutiveOnes) {
            maxConsecutiveOnes = currentConsecutiveOnes;
        }

        System.out.println(maxConsecutiveOnes);


        String number = Integer.toBinaryString(n);

        for (String num : number.split("0")) {

            if (num.length() > max) {
                max = num.length();
            }
        }
        System.out.println(max);


        String[] binArray = bin.split("0");
        System.out.println(Collections.max(Arrays.asList(binArray)).length());

    }
}
