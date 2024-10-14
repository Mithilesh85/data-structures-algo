package com.mithilesh.array;

import java.util.Arrays;

public class SwapElements {
    // Main method
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 61};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Swap two elements from the array
    static void swap(int[] arr, int first, int second) {
        // Assign first element in the temp
        int temp = arr[first];

        // Assign second in fist
        arr[first] = arr[second];

        // Assign temp into the second
        arr[second] = temp;
    }

    // Reverse the array elements
    static void reverse(int[] arr) {

        // Make low as index of first element
        int low = 0;

        //Make high as index of last element
        int high = arr.length - 1;

        // Iterate until low gets more than high
        while (low <= high) {
            // Swap the element
            swap(arr, low, high);

            // Increase the low by one
            low++;

            // Decrease the high by one
            high--;
        }
    }

}
