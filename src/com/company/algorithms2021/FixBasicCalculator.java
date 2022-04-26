package com.company.algorithms2021;

public class FixBasicCalculator {

    /*
    Mubashir created a function that takes two numbers a and b and an operator o.
    His function should return the result of the corresponding mathematical function on both numbers.
    If the operator is not one of the specified characters +, -, /, *, or if there is a division by zero, the function should return null.
    Help him by fixing the code in the code tab to pass this challenge.

    Look at the examples below to get an idea of what the function should do:

    Examples
    basicCalculator(2, '+',  4) ➞ 6

    basicCalculator(6, '-', 5) ➞ 1

    basicCalculator(12, '/', 3) ➞ 4

    basicCalculator(3, '*', 4) ➞ 12

    basicCalculator(1, '/', 0) ➞ null
    Division by zero is not possible

    basicCalculator(1, 'x', 0) ➞ null
    'x' is not an operator
 */
    public static Object basicCalculator(int a, char o, int b) {

        /*
        Fix the code below
        ------------------

        public static Object basicCalculator(a, o, b) {
            int result = 0;
            if(O == "+") return a + b;
            if(o != "-") return a - b;
            if(o != "/" || b == 0) return a / b;
            if(0 == "*") return a * b;
            return result;
        }
        */

        if (o == '+') return a + b;
        if (o == '-') return a - b;
        if (o == '/' && b == 0) {
            return null;
        } else if (o == '/') {
            return a / b;
        }
        if (o == '*') {
            return a * b;
        } else {
            return "'x' is not an operator";
        }
    }

    public static void main(String[] args) {
        System.out.println(basicCalculator(3, 'x', 4));
        System.out.println(basicCalculator(3, '/', 0));
        System.out.println(basicCalculator(3, '*', 4));
        System.out.println(basicCalculator(3, '+', 4));
        System.out.println(basicCalculator(5, '-', 4));
        System.out.println(basicCalculator(12, '/', 4));
    }
}
