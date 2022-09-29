package com.LinearSearch;

public class Question1 {
    public static void main(String[] args) {
        int[] arr = {18, 45, 3, 35, 92, 1, 15};
        int start = 1;
        int end = 4;
        int target = 1;
        int result = search(arr,start,end,target);
        System.out.println(result);
    }

    static int search(int[] arr, int start, int end, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (target == arr[i]){
                return i;
            }
        }

        return -1;
    }
}
