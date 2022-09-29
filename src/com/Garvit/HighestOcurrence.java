package com.Garvit;

import java.util.Scanner;

public class HighestOcurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:-");
        int num = in.nextInt();
        int givenNo = 1761713141;
        int count=0;

        while(givenNo>0){
           int rem = givenNo % 10;
           if (rem == num) {
               count++;
           }
           givenNo = givenNo/10;

        }
        System.out.println(count);
    }
}
