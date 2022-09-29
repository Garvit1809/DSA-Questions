package com.LinearSearch;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 84, 54},
                {12, 83, 93, 50},
                {63, 61, 89, 10}
        };
        int target = 11;
        System.out.println(Arrays.toString(search2D(arr,target)));
    }

    static int[] search2D(int[][] arr, int target) {
        int[] indices = {-1,-1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target){
                    return indices = new int[]{i, j};
                }
            }
        }

        return indices;
    }
}
