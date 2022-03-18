package com.company.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {

//        String s = "Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!";
//        String s = "He is a very very good boy, isn't he?";


        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] splitS = s.split("[! ,?._'@]+");

        for (String split : splitS) {
            System.out.println(split);
        }
        scan.close();
    }
}
