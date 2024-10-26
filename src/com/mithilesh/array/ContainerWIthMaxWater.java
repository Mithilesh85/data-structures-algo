package com.mithilesh.array;

public class ContainerWIthMaxWater {

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxWater2(arr));
    }

    // Brute force approach
    static int maxWater1(int[] arr) {
        int maxWater = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int w = j - i;
                int ht = Math.min(arr[i], arr[j]);
                int area = w * ht;
                maxWater = Math.max(area, maxWater);
            }
        }
        return maxWater;
    }

    // Two pointer approach: Optimal approach
    static int maxWater2(int[] arr) {
        // Initialize maxWater as 0
        int maxWater = 0;

        // Make lp as 0
        int lp = 0;

        // Make right pointer as arr length - 1
        int rp = arr.length - 1;

        // Iterate till lp is less than right pointer
        while (lp < rp) {

            // Computer width: rp - lp
            int w = rp - lp;

            // Compute height: min of height of lp and rp
            int ht = Math.min(arr[lp], arr[rp]);

            // Compute: Current water
            int currentWater = w * ht;

            // Get max water comparing current water with max water
            maxWater = Math.max(maxWater, currentWater);

            // if height of lp is less then increase lp otherwise decrease the rp
            if (arr[lp] < arr[rp]) lp++;
            else rp--;
        }

        // return the max water
        return maxWater;
    }


}
