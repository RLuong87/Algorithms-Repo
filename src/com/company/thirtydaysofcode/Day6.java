package com.company.thirtydaysofcode;

import java.io.*;
import java.util.*;

public class Day6 {

    public static void main(String[] args) {

        System.out.println(splitEvenAndOdd("ovyvzvptyvpvpxyztlrztsrztztqvrxtxuxq"));
        System.out.println(splitEvenAndOdd("Hacker"));
        System.out.println(splitEvenAndOdd("Rank"));

        String str = "Hacker";
        char[] charArray = str.toCharArray();
        String even = "", odd = "", newStr = "";

        for (int i = 0; i < str.length(); i++) {

            if (i % 2 == 0) {
                even += charArray[i];
            } else {
                odd += charArray[i];
            }
            newStr = even + " " + odd;
        }
        System.out.print(newStr);
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
