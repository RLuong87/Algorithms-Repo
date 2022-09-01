package com.company.hackerrank.interviewprepkit.WARMUPS;

public class CatsAndMouse {

    static String catAndMouse(int x, int y, int z) {

        int m = Math.abs(x - y), n = Math.abs(z - y), k = Math.abs(z - x);

        if (n < k || m < k) return "Cat B";
        else if (m == n || k == m || n == k) return "Mouse C";
        return "Cat A";
    }

    public static void main(String[] args) {

        System.out.println(catAndMouse(1, 2, 3));
    }
}
