package com.me;

import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        //using scanner method
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int reverse = 0;
        while (n>0)
        {
            int rem = n%10;
            reverse = reverse*10+rem;
            n = n/10;
        }
        System.out.println(reverse);

        //using input method
//        int n = 12345;
//        int reverse = 0;
//        while (n>0)
//        {
//            int rem = n%10;
//            reverse = reverse*10+rem;
//            n = n/10;
//        }
//        System.out.println(reverse);
    }
}
