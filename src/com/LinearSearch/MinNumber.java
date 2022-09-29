package com.LinearSearch;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {23, 45, 87, 12, 9, 100, 6, -7};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int minimum = arr[0];
        for (int num : arr) {
            if (num < minimum) {
                minimum = num;
            }
        }
        return minimum;
    }
}
