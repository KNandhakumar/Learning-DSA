package com.me;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        sum1();
        sum2(10,5);
        System.out.println();
        int multiply = sum3();
        System.out.println(multiply*10);
    }
    // syntax
    /*
        Access modifier , return type , name () {
            body
            return statement;
        }
    */

    // void with non parameter method
    // f means fields m means methods
    public static void sum1()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num1 :");
        int num1 = in.nextInt();
        System.out.print("Enter the num2 :");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("num 1 + num2 = "+sum);
    }


    // void with parameterized method
    public static void sum2(int num1,int num2)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num1 :");
        num1 = in.nextInt();
        System.out.print("Enter the num2 :");
        num2 = in.nextInt();
        int sum = num1+num2;
        System.out.print("num1 + num2 = "+sum);
    }

    // non-void with non parameter method

    public static int sum3()
    {
//        int multiply = sum();
//        System.out.println(multiply*10);
//        using like this operation in non-void with non parameter method

        int num1,num2,sum;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num1 :");
        num1 = in.nextInt();
        System.out.print("Enter the num2 :");
        num2 = in.nextInt();
        sum = num1+num2;
        return sum;
    }
}
