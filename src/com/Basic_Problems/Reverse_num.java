package com.Basic_Problems;

import java.util.Scanner;

public class Reverse_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // let's say 4567 and to reverse it we need to get the remainder that is 7
        // 7 * 10 + 6 gives 76 and so on
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            ans = ans * 10 + rem;

        }
        System.out.println(ans);
    }
}
