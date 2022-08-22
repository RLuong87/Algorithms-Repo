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
            System.out.println(s1);
            System.out.println(x);
            System.out.printf("%d", x);
        }
        System.out.println("================================");

    }
}
