package com.company.algorithms2021;

public class IncrementNumber {

    /*
    Edabit Challenge

    Create a function that takes a number as an argument, increments the number by +1 and returns the result.

    Examples
    addition(0) ➞ 1

    addition(9) ➞ 10

    addition(-3) ➞ -2

    Notes:
    Don't forget to return the result.
    If you get stuck on a challenge, find help in the Resources tab.
    If you're really stuck, unlock solutions in the Solutions tab
    */
    public static int addition(int num) {
        int number = 1;
        return num + number;
    }

    public static void main(String[] args) {

        System.out.println(addition(0));
        System.out.println(addition(9));
        System.out.println(addition(-3));
    }
}
