package com.Garvit;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println(Arrays.toString(arr));
        String token = "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";
    }
}
