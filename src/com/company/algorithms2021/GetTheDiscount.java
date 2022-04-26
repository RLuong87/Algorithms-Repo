package com.company.algorithms2021;

public class GetTheDiscount {

    public static double discount(int price, int percentage) {

        double discountPrice = (percentage / 100D) * price;

        return price - discountPrice;
    }

    public static void main(String[] args) {

        System.out.println(discount(100, 20));
    }
}
