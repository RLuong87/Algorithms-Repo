package com.company.hackerrank;

public class SaveThePrisoner {

    public static int saveThePrisoner(int n, int m, int s) {

        int[] prisoners = new int[n + 1];
        int i = 0;

        while (true) {
            for (i = s; i < prisoners.length; i++) {
                System.out.print(i + " ");
                m--;
                if (m == 0) {
                    System.out.println();
                    System.out.print("Warn prisoner in chair #");
                    return i;
                }
                s = 1;
            }
        }
    }

    public static void main(String[] args) {

        System.out.println(saveThePrisoner(4, 6, 2));
        System.out.println("___________________");
        System.out.println(saveThePrisoner(5, 2, 1));
        System.out.println("___________________");
        System.out.println(saveThePrisoner(5, 2, 2));
        System.out.println("___________________");
        System.out.println(saveThePrisoner(7, 19, 2));
        System.out.println("___________________");
        System.out.println(saveThePrisoner(3, 7, 3));
        System.out.println("___________________");

    }
}
