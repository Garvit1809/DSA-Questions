package com.Garvit;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int givenNo = 12345;
        int count=0;
        int newNum=0;

        while(givenNo>0){
            int rem = givenNo % 10;
            newNum = newNum * 10 + rem;
            givenNo = givenNo / 10;
        }

        System.out.println(newNum);
    }
}
