package com.Basic_Problems;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        //Initialize two numbers a and b
        //Take count from 2
        //take input add a and b
        //Swap places of a and b and update count
        int a = 0;
        int b = 1;
        int count = 2;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        System.out.println(b);
        while(count < n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;

        }
        System.out.println(b);

    }
}
