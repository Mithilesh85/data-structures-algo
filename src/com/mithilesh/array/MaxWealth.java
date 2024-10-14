package com.mithilesh.array;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {{2, 8, 7}, {7, 1, 3}, {1, 9, 51}};
        System.out.println(findMaxWealth(arr));
    }

    // Find max wealth
    static int findMaxWealth(int[][] customers) {
        // Initial final wealth is 0
        int finalWealth = 0;

        // Iterate for all customers
        for (int[] customer : customers) {
            // Make initial sum 0 for all the customers
            int sum = 0;
            // Iterate through custom account and get the sum of their account
            for (int account : customer) {
                sum += account;
            }

            // Find max wealth
            if (finalWealth < sum) {
                finalWealth = sum;
            }
        }
        // Return final wealth
        return finalWealth;
    }
}
