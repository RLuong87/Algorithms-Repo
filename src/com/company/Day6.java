package com.company;

import java.io.*;
import java.util.*;

public class Day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        System.out.println(splitEvenAndOdd("adbecf"));

        String s = "Hacker";
        char[] charArray = s.toCharArray();
        String even = "", odd = "";
        int numChar;
        for (int i = 0; i < charArray.length; i++) {
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
            if ( i % 2 == 0) {
                even += charArray[i];
            } else {
                odd += charArray[i];
            }
        }
        return even + " " + odd;
    }
}
