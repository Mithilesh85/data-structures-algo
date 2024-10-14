package com.mithilesh.array;

public class MaxElement {
    // Main method
    public static void main(String[] args) {
        int[] arr = {11, 21, 31, 41, 51, 6, 711};
//        int maxElement = maxElement(arr);
//        System.out.println(maxElement);
        int maxElementInRange = maxElementInRange(arr, 0, 1);
        System.out.println(maxElementInRange);
    }

    // Finding the maximum element in array
    static int maxElement(int[] arr) {
        // Take first element as max element
        int max = arr[0];

        // Iterate over the array using enhanced for loop
        for (int ele : arr) {
            // Check if upcoming elements are greater than max then make them max element
            if (ele > max) {
                max = ele;
            }
        }
        // Finally return the max element
        return max;
    }

    // Finding the maximum element in range.
    static int maxElementInRange(int[] arr, int start, int end) {
        // Make start element as max element
        int max = arr[start];

        // Iterate over the array from start to end
        for (int i = start; i <= end; i++) {
            // Check if upcoming elements are greater than max then make them max element
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // Finally return the max element
        return max;
    }
}
