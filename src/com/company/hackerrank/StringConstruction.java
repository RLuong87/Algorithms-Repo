package com.company.hackerrank;

public class StringConstruction {

    public static int stringConstruction(String s) {

        int cost = 0;
        String p = "";
        String[] arr = s.split("");

        for (int i = 0; i < arr.length; i++) {

            p += arr[i];
            cost++;
        }

        System.out.println(p);
        return cost;
    }

    public static void main(String[] args) {

        System.out.println(stringConstruction("abcd"));

    }
}
