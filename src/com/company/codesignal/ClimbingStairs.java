package com.company.codesignal;

public class ClimbingStairs {

    public static void main(String[] args) {

        // Fibonacci Sequence 0, 1, 1, 3, 5, 8, 13, 21

//        System.out.println(climbingStairs(26));

        String s = "asmclksdnmcfkj;dsnavkljdsnfjksanlvfkjdnavldfnvladnfla";

        System.out.println(s.charAt(0));
    }

    public static int climbingStairs(int steps) {

        int a = 0, b = 1, c = 0;

        for (int i = 0; i < steps; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
