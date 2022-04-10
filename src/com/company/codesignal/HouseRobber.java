package com.company.codesignal;

public class HouseRobber {

    public static void main(String[] args) {

    }

    public static int houseRobber(int[] nums) {

        //iterate through nums
        //isolte the first two indexes
        //if first iso > second iso
        //total += first iso, i+= 2;
        //else
        //total += second iso, i+= 3;

        int total = 0;

        for (int i = 0; i < nums.length; ) {

            if ((i + 1) < nums.length) {
                if (nums[i] >= nums[i + 1]) {
                    total += nums[i];

                    i += 2;
                } else {
                    total += nums[i + 1];

                    i += 3;
                }
            } else {
                total += nums[i];

                i++;
            }
        }
        return total;
    }
}
