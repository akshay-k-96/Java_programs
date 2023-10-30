package com.functions;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }
    static int sum(){
        int a, b, sum;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        sum = a + b;
        return sum;
    }
}
