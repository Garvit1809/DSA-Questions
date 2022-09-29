package com.LinearSearch;

public class CountEven {
    public static void main(String[] args) {
        int[] arr = {11, -1, 749, 209, 87, 55, 103, 101};
        System.out.println(searchEven(arr));
    }

    static int searchEven(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
