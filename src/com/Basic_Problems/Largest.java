package com.Basic_Problems;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num_1 = input.nextInt();
        int num_2 = input.nextInt();
        int num_3 = input.nextInt();
        int max = num_1;
        if (num_2 > max){
            max = num_2;
        }else if (num_3 > max){
            max = num_3;
        }
        System.out.println("The largest number is: " + max);
        }
    }
