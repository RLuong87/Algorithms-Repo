package com.company.hackerrank.interviewprepkit.WARMUPS;

public class Staircase {

    public static void staircase(int stairSize) {

        for (int i = 0; i < stairSize; i++) {

            for (int j = stairSize - 1; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < 1 + i; j++) {
                System.out.print('#');
            }
            System.out.println();
        }
    }

    public static void staircase2(int n) {
        /*
        n = 6  / numOfSpaces / numOfSymbols
        _____#      5               1
        ____##      4               2
        ___###      3               3
        __####      2               4
        _#####      1               5
        ######      0               6
        */
        for (int numberOfSymbols = 1; numberOfSymbols <= n; numberOfSymbols++) {
            int numberOfSpaces = n - numberOfSymbols;
            // print the spaces
            for (int i = 0; i < numberOfSpaces; i++) {
                System.out.print(" ");
            }
            System.out.print(" ".repeat(n - 1));
            // print the symbols
            for (int i = 0; i < numberOfSymbols; i++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        staircase(10);
        System.out.println();
        staircase2(20);
    }
}
