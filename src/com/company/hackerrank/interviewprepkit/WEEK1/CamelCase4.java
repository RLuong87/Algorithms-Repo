package com.company.hackerrank.interviewprepkit.WEEK1;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class CamelCase4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder str = new StringBuilder();
        StringBuilder newStr = new StringBuilder();
        String input = scan.next();

        for (int i = 0; i < input.length(); i++) {
            if (input.startsWith("S;M;") && input.endsWith("()")) {
                input = input.substring(4, input.length() - 2);
                str.append(input);
            } else if (input.startsWith("S;C;") || input.startsWith("S;V;")) {
                input = input.substring(4);
                str.append(input);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char c = input.charAt(i);
            if (i != 0 && Character.isUpperCase(c)) {
                newStr.append(' ');
                newStr.append(Character.toLowerCase(c));
            } else if (i == 0 && Character.isUpperCase(c)) {
                newStr.append(' ');
                newStr.append(Character.toLowerCase(c));
            } else {
                newStr.append(c);
            }
        }
        System.out.println(newStr.toString().trim());

        char[] chars = input.toCharArray();

//        for (int i = 4; i < chars.length; i++) {
//            if (Character.isUpperCase(chars[i])) {
//                space.append(" ");
//                chars[i] = Character.toLowerCase(chars[i]);
//            }
//            str.append(space).append(chars[i]);
//        }
//        System.out.println(str);

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }
//            space.append(c);
        }
//        System.out.println(space);
        scan.close();
    }
}
