package com.company.hackerrank;

import java.util.*;

public class BeautifulDays {

    public static int beautifulDays(int i, int j, int k) {

        List<Integer> numbers = new ArrayList<>();
        int beautifulDay = 0, rev = 0;

        for (int l = i; l <= j; l++) {

            numbers.add(l);

            for (int m = numbers.size() - 1; m >= 0 ; m--) {


            }

        }


        return 0;
    }

    public static void main(String[] args) {

        System.out.println(beautifulDays(20, 23, 6));

        int num = 23, rev = 0;

        for (; num != 0; num = num / 10) {
            int remainder = num % 10;
            rev = rev * 10 + remainder;
        }
        System.out.println(rev);
    }
}
