package com.functions;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        String message = message();
        System.out.println(message);
    }
    static String message(){
        Scanner in = new Scanner(System.in);
        String greet = in.nextLine();
        return greet;
    }
}
