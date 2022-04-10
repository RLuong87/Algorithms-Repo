package com.company.thirtydaysofcode;

import java.util.Scanner;

public class Day25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int nums = scanner.nextInt();

            if (nums <= 1) {
                System.out.println("1");
                System.out.println("Not prime");
            }
            if (nums == 2) {
                System.out.println("2");
                System.out.println("Prime");
            }

            for (int j = 2; j < nums;) {

                if (nums % j == 0) {
                    System.out.println("3");
                    System.out.println("Not prime");
                } else {
                    System.out.println("4");
                    System.out.println("Prime");
                }
                break;
            }
        }
        scanner.close();
    }
}
