package com.company.algorithms2021;

public class BasicCalc {

    public static int calculator(int num1, char operator, int num2) {

        int calc = 0;

        switch (operator) {
            case '+' -> calc = num1 + num2;
            case '-' -> calc = num1 - num2;
            case '*' -> calc = num1 * num2;
            case '/' -> {
                if (num2 == 0) return 0;
                calc = num1 / num2;
            }
        }
        return calc;
    }

    public static void main(String[] args) {

    }
}
