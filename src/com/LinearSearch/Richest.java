package com.LinearSearch;

public class Richest {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 4},
                {1, 2, 1},
                {5, 1, 4}
        };
        System.out.println(wealth(arr));
    }

    static int wealth(int[][] arr){
        int[] individualWealth = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int totalWealth = 0;
            for (int j = 0; j < arr[i].length; j++) {
                totalWealth += arr[i][j];
            }
            individualWealth[i] = totalWealth;
        }

        return max(individualWealth);
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int entry: arr) {
            if (entry >= max) {
                max = entry;
            }
        }
        return max;
    }
}
