package com.Basic_Problems;

import java.util.Scanner;

public class Principal_rate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Float principal = input.nextFloat();
        Float rate = input.nextFloat();
        Float time = input.nextFloat();
        Float Simple_interest = (principal * rate * time / 100);
        System.out.println(Simple_interest);
    }
}
