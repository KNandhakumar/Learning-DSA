package com.me;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        int n = 7;
        int a = 0;
        int b = 1;
        int count = 2;
        for (int i=count;i<=n;i++)
        {
            int temp = b;
            b = b + a;
            a = temp;
        }
//        while(count<=n)
//        {
//            int temp = b;
//            b = b + a;
//            a = temp;
//            count++;
//        }
        System.out.println(b);
    }
}
