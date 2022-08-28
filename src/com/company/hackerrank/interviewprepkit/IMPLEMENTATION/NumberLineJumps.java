package com.company.hackerrank.interviewprepkit.IMPLEMENTATION;

public class NumberLineJumps {

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        int jumps = v1 - v2, kangaroos = x1 - x2;
        if (v1 > v2 && kangaroos % jumps == 0) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3, 4, 2));
        System.out.println(kangaroo(0, 2, 5, 3));
    }
}
