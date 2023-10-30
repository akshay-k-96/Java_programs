package com.Basic_Problems;

import java.util.Scanner;

public class Currency_converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rupee;
        int dollar = 80;
        System.out.println("Enter how much Rupees you have: ");
        rupee = input.nextInt();
        int total = rupee * dollar;
        System.out.println("Here's your amount in dollars : " + total);


    }
}
