package com.company;

public class Pyramid {

    public static void pyramid() {

//      Simple Pyramid

        int pSize = 10;

        for (int i = 0; i < pSize; i++) {

            for (int j = pSize - 1; j > i; j--) {

                System.out.print(" ");
            }
            System.out.print(" ".repeat(pSize - i - 1));

//            System.out.println("*".repeat(2 * i + 1));

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
