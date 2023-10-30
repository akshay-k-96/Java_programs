package com.functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
        sum();
    }
        static void sum() {
            Scanner in = new Scanner(System.in);
            int a, b, sum;
            a = in.nextInt();
            b = in.nextInt();
            sum = a + b;
            System.out.println(sum);
        }
    }

