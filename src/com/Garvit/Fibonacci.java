package com.Garvit;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:-");
        int n = in.nextInt();
        int n1 = 0;
        int n2 = 1;
        for (int i = 1; i < n; i++) {
            int temp = n2;
            n2 = n1 + n2;
            n1 = temp;
        }
        System.out.println(n2);
    }
}
