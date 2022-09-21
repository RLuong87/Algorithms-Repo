package com.company.hackerrank.interviewprepkit.IMPLEMENTATION;

public class LibraryFine {

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here

        int lateFee = 0;

        if (m1 == m2 && y1 == y2 && d2 < d1) {
            lateFee = 15 * (d2 - d1);
        } else if (m2 < m1 && y1 == y2) {
            lateFee = 500 * (m2 - m1);
        } else if (y2 < y1) {
            lateFee = 10000;
        }
        return Math.abs(lateFee);
    }

    public static void main(String[] args) {
        System.out.println(libraryFine(1, 2, 2015, 4, 3, 2014));
    }
}
