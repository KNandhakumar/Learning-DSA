package com.me;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;
        int a = 0;
        int b = 1;
        int count = 2;
        for (int i = count; i <=n; i++) {
            int temp = b;
            b = b+a;
            a = temp;
        }
        System.out.println(b);
    }
}