package com.mithilesh.array;

public class LinearSearch {
    // Main method
    public static void main(String[] args) {
        int[] arr = {22, 11, 44, 55, 1234, 2, 3, 4, 5};
        int target = 44;
        int index = linearSearch(arr, 11);
        System.out.println(index);

        String str = "Mithilesh Shah";
        char targetChar = 'h';

        int charIndex = searchInString(str, targetChar);
        System.out.println(charIndex);
    }

    // Implementation of linear search
    static int linearSearch(int[] arr, int target) {

        // Iterate over the array
        for (int i = 0; i < arr.length; i++) {
            // Check if arr element is target element then return its index
            if (arr[i] == target) {
                return i;
            }
        }
        // Return -1 if element is not found.
        return -1;
    }

    // Search character in the string
    static int searchInString(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }
}
