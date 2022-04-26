package com.company.algorithms2021;

public class OddsVsEvens {

    /*
    Given an integer, return "odd" if the sum of all odd digits is greater than the sum of all even digits.
    Return "even" if the sum of even digits is greater than the sum of odd digits, and "equal" if both sums are the same.

    Examples

    oddsVsEvens(97428) ➞ "odd"
    odd = 16 (9+7)
    even = 14 (4+2+8)

    oddsVsEvens(81961) ➞ "even"
    odd = 11 (1+9+1)
    even = 14 (8+6)

    oddsVsEvens(54870) ➞ "equal"
    odd = 12 (5+7)
    even = 12 (4+8+0)
*/

    public static String oddsVsEvens(int num) {

        int evenSum = 0, oddSum = 0;

        String valueNum = String.valueOf(num);
        String[] digits = valueNum.split("(?<=.)");

        for (String digit : digits) {
            int numbers = Integer.parseInt(digit);

            if (numbers % 2 == 0) {
                evenSum += numbers;
            } else {
                oddSum += numbers;
            }
        }
        if (evenSum > oddSum) {
            return "even";
        } else if (oddSum > evenSum) {
            return "odd";
        } else {
            return "equal";
        }
    }

    public static void main(String[] args) {

        System.out.println(oddsVsEvens(97428));


//        int number = 97428;
//
//        while (number > 0) {
//
//            System.out.print(number % 10 + " ");
//            number = number / 10;
//        }

        int num = 54870, evenSum = 0, oddSum = 0;

        String numberVal = String.valueOf(num);

        String[] digits = numberVal.split("(?<=.)");

        for (String digit : digits) {
            int numbers = Integer.parseInt(digit);

            if (numbers % 2 == 0) {
                evenSum += numbers;
            } else {
                oddSum += numbers;
            }
        }

        if (evenSum > oddSum) {
            System.out.println("even");
        } else if (oddSum > evenSum) {
            System.out.println("odd");
        } else {
            System.out.println("equal");
        }
    }
}

