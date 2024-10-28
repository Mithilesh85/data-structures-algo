package com.mithilesh.array;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -11};
        int target = 1;
        System.out.println(binarySearch(arr, target));
        System.out.println(binarySearch(arr2, target));
    }

    // Order agnostic binary search if we don't know the order of sorting
    static int binarySearch(int[] arr, int target) {

        // Start : 0
        int start = 0;

        // End : last index
        int end = arr.length - 1;

        // Checking whether the array is ascending order sorted or descending order sorted
        boolean isAsc = arr[start] < arr[end];

        // Iterate till start is less or equal to end
        while (start <= end) {

            // Calculate mid-index of the array
            int mid = start + (end - start) / 2; // Prevent integer overflow

            if (arr[mid] == target) {
                return mid;
            } else {
                if (isAsc) {
                    if (arr[mid] < target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                } else {
                    if (arr[mid] < target) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
        }

        // Element not found
        return -1;
    }
}
