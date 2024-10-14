package com.mithilesh.array;

public class EvenDigits {

    public static void main(String[] args) {
        int[] arr = {121, 22};
        int count = findEvenDigits(arr);
        System.out.println(count);
    }

    static int findEvenDigits(int[] nums) {
        // Count is 0 initially
        int count = 0;

        // Iterate over nums array
        for (int num : nums) {
            // If digits are of even number then increase the count
            if (isEven(num)) {
                count++;
            }
        }
        return count;
    }

    // Check if the number having even number of digits
    static boolean isEven(int number) {
        return digitCount2(number) % 2 == 0;
    }

    // First way to count the digits of a number
    static int digitCount(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // Second way to count the digits of a number
    static int digitCount2(int n) {
        return (int) Math.log10(n) + 1;
    }

}
