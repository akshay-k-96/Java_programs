package com.Basic_Problems;

import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int b = in.nextInt();
        int count = 0;
        // 456755 -> Find the last digit if last digit is equal to n update count to 1
        while (n > 0){
            int rem = n % 10;
                if (rem == b) {
                    count++;
                }
            n = n / 10;
        }
        System.out.println(count);
    }

}
