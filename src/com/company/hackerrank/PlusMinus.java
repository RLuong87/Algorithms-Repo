package com.company.hackerrank;

import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {

        int positive = 0, negative = 0, zero = 0;
        double posPor = 0, negPor = 0, zeroPor = 0;

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i) > 0) {
                positive++;
                posPor = (double) positive / arr.size();
            } else if (arr.get(i) < 0) {
                negative++;
                negPor = (double) negative / arr.size();
            } else {
                zero++;
                zeroPor = (double) zero / arr.size();
            }
        }
        String pos = String.valueOf(posPor);
        String neg = String.valueOf(negPor);
        String zer = String.valueOf(zeroPor);
        String p = "", n = "", z = "";

        System.out.println(pos);

        for (int i = 0; i < 8; i++) {
//            p += pos.charAt(i);
            n += neg.charAt(i);
            z += zer.charAt(i);
        }
        System.out.println(p);
        System.out.println(n);
        System.out.println(z);
    }

    public static void main(String[] args) {

        List<Integer> test = List.of(-4, 3, -9, 0, 4, 1);
        plusMinus(test);
    }
}
