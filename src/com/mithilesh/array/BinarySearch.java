package com.mithilesh.array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 11;
        System.out.println(binarySearch(arr, target));
    }

    // Binary search that return index if element is found otherwise return -1
    static int binarySearch(int[] arr, int target) {

        // Start : 0
        int start = 0;

        // End : last index
        int end = arr.length - 1;

        // Iterate till start is less or equal to end
        while (start <= end) {

            // Calculate mid-index of the array
            int mid = start + (end - start) / 2; // Prevent integer overflow

            // If target is greater than mid-element then element lies at right side of the mid-element so start will be mid+1
            if (arr[mid] < target) {
                start = mid + 1;
                // If target is lesser than mid-element then element lies at left side of the mid-element so end will be mid-1
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                // If mid-element is equal to the target then return mid index
                return mid;
            }
        }

        // Element not found
        return -1;
    }
}
