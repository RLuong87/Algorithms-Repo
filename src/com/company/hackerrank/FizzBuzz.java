package com.company.hackerrank;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number: ");
        int n = scan.nextInt();

        if (n % 5 == 0) {
            if (n % 3 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        }
        else if (n % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(n);
        scan.close();
    }
}
