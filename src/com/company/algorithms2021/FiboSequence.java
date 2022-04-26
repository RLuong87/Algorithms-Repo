package com.company.algorithms2021;

public class FiboSequence {

    public static int fib(int pos) {

        if (pos == 0) return 0;
        if (pos == 1) return 1;
        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 0; i < pos; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(fib(2));
    }
}
