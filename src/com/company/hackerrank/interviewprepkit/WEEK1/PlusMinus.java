package com.company.hackerrank.interviewprepkit.WEEK1;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {

        int positive = 0, negative = 0, zero = 0;
        double posProp = 0, negProp = 0, zeroProp = 0;

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i) > 0) {
                positive++;
                posProp = (float) positive / arr.size();
            } else if (arr.get(i) < 0) {
                negative++;
                negProp = (float) negative / arr.size();
            } else {
                zero++;
                zeroProp = (float) zero / arr.size();
            }
        }
        DecimalFormat df = new DecimalFormat("#.######");
        System.out.println(df.format(posProp));
        System.out.println(df.format(negProp));
        System.out.println(df.format(zeroProp));
    }

    public static void main(String[] args) {

        List<Integer> test1 = List.of(-4, 3, -9, 0, 4, 1);
        List<Integer> test2 = List.of(0, -67, -74, -38, -72, -53, 0, -13, -95, -91, -100, -59, 0, -10, -68, -71,
                -62, -21, 0, -42, -57, -16, -66, -23, 0, -80, -63, -68, -65, -71, 0, -71, -15, -32, -26, -8, 0,
                -6, -51, -87, -19, -71, 0, -93, -26, -35, -56, -89, 0, -21, -74, -39, -57, -8, 0, -69, -29, -24,
                -99, -53, 0, -65, -42, -72, -18, -4, 0, -73, -46, -63, -78, -87);
        plusMinus(test1);
        System.out.println();
        plusMinus(test2);
    }
}
