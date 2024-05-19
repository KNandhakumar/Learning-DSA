package com.me;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        int n = 13839;
        int count = 0;
        while (n>0)
        {
            int rem = n%10;   //n%10 this is last digit of number reminder example : 13839 rem : 9
            if (rem == 3)
            {
                count++;
            }
            n = n/10; // reminder balance example : 13839 1383
        }
        System.out.println(count);
    }
}