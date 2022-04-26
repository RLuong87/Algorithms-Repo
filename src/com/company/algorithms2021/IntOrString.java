package com.company.algorithms2021;

public class IntOrString {

    public static String intOrString(Object var) {

        if (var instanceof String) {
            return "str";
        } else {
            return "int";
        }
    }

    public static void main(String[] args) {

        System.out.println(intOrString("String"));
        System.out.println(intOrString(2));
    }
}
