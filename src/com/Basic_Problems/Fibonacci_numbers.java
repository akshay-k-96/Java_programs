package com.Basic_Problems;

import java.util.Scanner;

public class Fibonacci_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();  // Number of terms in the Fibonacci series
        int num_1 = 0;
        int num_2 = 1;
        System.out.print("Fibonacci series : ");
        int i = 2;
        int next = 0;
        while (i < n) {
            next = num_1 + num_2;
            num_1 = num_2;
            num_2 = next;
            i++;
        }
        System.out.println(next);

    }
}

