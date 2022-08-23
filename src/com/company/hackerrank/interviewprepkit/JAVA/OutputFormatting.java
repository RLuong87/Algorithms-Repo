package com.company.hackerrank.interviewprepkit.JAVA;

import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line
            //%-15 will add 15 trailing whitespaces after the string
            //03 will fill preceding 0's if the int is less than 3
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }
}
