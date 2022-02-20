package com.company.thirtydaysofcode;

import java.io.*;
import java.util.*;

public class Day6 {

    public static void main(String[] args) {

//        System.out.println(splitEvenAndOdd("ovyvzvptyvpvpxyztlrztsrztztqvrxtxuxq"));
//        System.out.println(splitEvenAndOdd("Hacker"));
//        System.out.println(splitEvenAndOdd("Rank"));

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            String s = scan.nextLine();
            String even = "", odd = "";

            for (int j = 0; j < s.length(); j++) {

                if (j % 2 == 0) {
                    even += s.substring(j, j + 1);
                } else {
                    odd += s.substring(j, j + 1);
                }
            }
            System.out.println(even + " " + odd);
        }

        scan.close();
//        String str = "Hacker";
//        char[] charArray = str.toCharArray();
//        String even = "", odd = "", newStr = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            if (i % 2 == 0) {
//                even += charArray[i];
//            } else {
//                odd += charArray[i];
//            }
//            newStr = even + " " + odd;
//        }
//        System.out.print(newStr);
    }

    public static String splitEvenAndOdd(String str) {

        char[] charArray = str.toCharArray();
        String even = "", odd = "", newStr = "";

        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 == 0 && charArray.length != 2) {
                even += charArray[i];
            } else {
                odd += charArray[i];
            }
            newStr = even + " " + odd;
        }
        return newStr;
    }
}
