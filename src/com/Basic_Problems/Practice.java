package com.Basic_Problems;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // Fibonacci Series --> 0,1, 1, 2, 3, 5
        int num_1 = 0;
        int num_2 = 1;
        int count = 2;
        int next = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (count < n){
            next = num_1 + num_2;
            num_1 = num_2;
            num_2 = next;
            count++;
        }
        if (n == 1){
            System.out.println(num_1);

        }else if (n == 2){
           System.out.println(num_2);
        }else{
            System.out.println(next);
        }
    }
}
