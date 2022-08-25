package com.company.hackerrank.interviewprepkit.IMPLEMENTATION;

public class NumberLineJumps {

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        int firstJumpX1 = x1 + v1, secondJumpX2 = x2 + v2;
        for (int i = 0; i < 10000; i++) {
            if (firstJumpX1 == secondJumpX2) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
//        System.out.println(kangaroo(0, 3, 4, 2));

        System.out.println(Math.pow(1, 2));
    }
}
