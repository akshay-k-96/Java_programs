package com.Basic_Problems;

import java.util.Scanner;

public class Greeting {

    // Take an input and print a greeting message
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Happy Birthday: " + name );
    }
}
