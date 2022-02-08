package com.company;

import java.io.*;
import java.util.*;

public class Day6 {

    public static void main(String[] args) {

        System.out.println(splitEvenAndOdd("ovyvzvptyvpvpxyztlrztsrztztqvrxtxuxq"));
        System.out.println(splitEvenAndOdd("ivvkxq"));
        System.out.println(splitEvenAndOdd("ivvkx"));

        String str = "ovyvzvptyvpvpxyztlrztsrztztqvrxtxuxq";
        char[] charArray = str.toCharArray();
        String even = "", odd = "";

        for (int i = 0; i < str.length(); i++) {

            if (i % 2 == 0) {
                even += charArray[i];
            } else {
                odd += charArray[i];
            }
        }
        System.out.print(even + " " + odd);
    }

    public static String splitEvenAndOdd(String str) {

        char[] charArray = str.toCharArray();
        String even = "", odd = "";

        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 == 0 && charArray.length != 2) {
                even += charArray[i];
            } else {
                odd += charArray[i];
            }
        }
        return even + " " + odd;
    }
}
