package com.company.hackerrank;

public class BeautifulDays {

    /*

    ****** SOLVED *******

     */

    public static int beautifulDays(int i, int j, int k) {

        int beautifulDays = 0;

        for (int l = i; l <= j; l++) {
            StringBuilder str = new StringBuilder();
            str.append(l);
            str.reverse();
            int a = Integer.parseInt(String.valueOf(str));

            if ((l - a) % k == 0) {
                beautifulDays++;
            }
        }
        return beautifulDays;
    }

    public static void main(String[] args) {

        System.out.println(beautifulDays(20, 23, 6));

    }
}
