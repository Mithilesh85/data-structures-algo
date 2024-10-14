package com.mithilesh.array;

public class MinElement {

    // Main method
    public static void main(String[] args) {
        int[] arr = {11, 21, 31, 41, 51, 6, 711};
//        int minElement = minElement(arr);
//        System.out.println(minElement);
        int minElementInRange = minElementInRange(arr, 2, 6);
        System.out.println(minElementInRange);
    }

    // Finding the minimum element in array
    static int minElement(int[] arr) {
        // Take first element as min element
        int min = arr[0];

        // Iterate over the array using enhanced for loop
        for (int ele : arr) {
            // Check if upcoming elements are lesser than min then make them min element
            if (ele < min) {
                min = ele;
            }
        }
        // Finally return the min element
        return min;
    }

    // Finding the minimum element in range.
    static int minElementInRange(int[] arr, int start, int end) {
        // Make start element as min element
        int min = arr[start];

        // Iterate over the array from start to end
        for (int i = start; i <= end; i++) {
            // Check if upcoming elements are lesser than min then make them min element
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        // Finally return the min element
        return min;
    }

}
