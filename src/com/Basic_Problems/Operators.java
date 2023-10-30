package com.Basic_Problems;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you operator: ");
        String operator = input.next();
        int a, b, result = 0;
        System.out.println("Enter the first number");
        a = input.nextInt();
        System.out.println("Enter the second number");
        b = input.nextInt();
        if (operator.equals("+")){
            result = a + b;
        }else if(operator.equals("-")){
            result = a- b;
        }else if(operator.equals("*")){
            result = a * b;
        } else if (operator.equals("/")) {
            if (b == 0) {
                System.out.println("Number is not divisible by zero");
            } else {
                result = a / b;
            }
        }
        else {
                System.out.println("The number you've entered in invalid");
            }
            System.out.println(result);
        }

    }

