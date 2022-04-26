package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SalesByMatch {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {

        List<Integer> count = new ArrayList<>();

        boolean pair = false;
        int counter = 0;

        for (int i = 0; i < ar.size(); i++) {
            counter = Collections.frequency(ar, i + 1);

            if (counter == 2) {
                break;
            }
                count.add(counter);
        }

//        for (:
//             ) {
//
//        }
        System.out.println(count);
        return count.size();
    }

    public static void main(String[] args) {

        List<Integer> socks = new ArrayList<>();
        socks.add(1);
        socks.add(1);
        socks.add(2);
        socks.add(2);
        socks.add(1);

        System.out.println(sockMerchant(socks.size(), socks));

    }
}
