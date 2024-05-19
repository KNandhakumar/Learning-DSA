package com.me;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Question take input of two numbers and print the sum
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number 1 :");
        int num1 = in.nextInt();
        System.out.print("Enter the number 2 :");
        int num2 = in.nextInt();

        int sum = num1+num2;
        System.out.println("num1 + num2 = "+sum);
    }
}