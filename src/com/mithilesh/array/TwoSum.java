package com.mithilesh.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 14;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    static int[] twoSum(int[] arr, int target) {
        // Create a map where key is arr element and value is index
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate over the array
        for (int i = 0; i < arr.length; i++) {

            // Extract each arr element
            int item = arr[i];

            // Compute more required to achieve target
            int more = target - item;

            // Check if more contains in the map then return its value and index in the form of array
            if (map.containsKey(more)) {
                return new int[]{map.get(more), i};
            }

            // Otherwise add them arr item as key and index as value
            map.put(item, i);
        }

        // If adding two array element is not matching with target just return 0,0 as indices
        return new int[]{0, 0};
    }
}
