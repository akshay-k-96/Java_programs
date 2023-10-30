package com.functions;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.next();
        String greet = Greet(name);
        System.out.println(greet);
    }

    static String Greet(String name) {
        String message = "Hello " + name;
        return message;
    }


}
