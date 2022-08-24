package com.company.algorithms2021;

public class Pyramid {

    public static void pyramid(int stairSize) {

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

    public static void main(String[] args) {
        pyramid(6);
    }
}
