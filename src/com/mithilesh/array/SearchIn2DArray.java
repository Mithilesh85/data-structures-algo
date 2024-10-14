package com.mithilesh.array;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        insert(arr);
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
        int[] indices = search(arr, 3);
        System.out.println("Index are here");
        System.out.println(Arrays.toString(indices));
    }

    // Insert elements in 2D array
    static void insert(int[][] arr) {
        System.out.println("Please enter element to be inserted...");
        Scanner sc = new Scanner(System.in);
        // Outer loop for row
        for (int i = 0; i < arr.length; i++) {
            // Inner loop column
            for (int j = 0; j < arr[i].length; j++) {
                // Insert elements at this row and column index
                arr[i][j] = sc.nextInt();
            }
        }
    }

    // Searching the elements in 2D array
    static int[] search(int[][] arr, int target) {
        // Outer loop for row
        for (int i = 0; i < arr.length; i++) {
            // Inner loop column
            for (int j = 0; j < arr[i].length; j++) {
                // If target is found then return its row and column index
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        // Otherwise return row as -1 and column as -1;
        return new int[]{-1, -1};
    }
}
