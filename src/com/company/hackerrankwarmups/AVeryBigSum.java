package com.company.hackerrankwarmups;

import java.util.ArrayList;
import java.util.List;

public class AVeryBigSum {

    public static long aVeryBigSum(List<Long> ar) {

        long sum = 0;

        for (Long aLong : ar) {
            sum += aLong;
        }
        return sum;
    }

    public static void main(String[] args) {

//      (1000000001, 1000000002, 1000000003, 1000000004, 1000000005)
        List<Long> numbers = new ArrayList<>() {{
            add(1000000001L);
            add(1000000002L);
            add(1000000003L);
            add(1000000004L);
            add(1000000005L);
        }};

        System.out.println(aVeryBigSum(numbers));
    }
}
