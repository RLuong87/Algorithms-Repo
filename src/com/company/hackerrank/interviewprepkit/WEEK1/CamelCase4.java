package com.company.hackerrank.interviewprepkit.WEEK1;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CamelCase4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String input = scan.nextLine();

            StringBuilder str = new StringBuilder();
            if (input.startsWith("S;M;") && input.endsWith("()")) {
                str.append(input.substring(4, input.length() - 2));
            } else if (input.startsWith("S;C;") || input.startsWith("S;V;")) {
                str.append(input.substring(4));
            } else if (input.startsWith("C;C;")) {
                str.append(input.substring(2).toLowerCase());
                System.out.println(str);
            } else if (input.startsWith("C;M;")) {
                str.append(input.substring(2).toLowerCase());
                System.out.println(str);
            } else {
                str.append(input.substring(2).toLowerCase());
            }
            StringBuilder newStr = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (i != 0 && Character.isUpperCase(c)) {
                    newStr.append(' ');
                    newStr.append(Character.toLowerCase(c));
                } else if (i == 0 && Character.isUpperCase(c)) {
                    newStr.append(' ');
                    newStr.append(Character.toLowerCase(c));
                } else if (str.charAt(0) == 'c') {
                    String[] arr = str.toString().split(" ");
                    for (String s : arr) {
                        newStr.append(s.toUpperCase().charAt(0)).append(s.substring(3));
                        // System.out.println(s.toUpperCase().charAt(0) + s.substring(3));
                    }
                } else if (str.charAt(0) == 'm') {
                    newStr.append(Character.toUpperCase(c));
                } else if (str.charAt(0) == 'v') {
                    newStr.append(Character.toUpperCase(c));
                } else {
                    newStr.append(c);
                }
            }
            System.out.println(newStr.toString().trim());
        }
        scan.close();
    }
}
