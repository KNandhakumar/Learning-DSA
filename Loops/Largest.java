package com.me;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        Q: Find the largest of the 3 numbers method 1
        int max = a;
        if (b>max)
        {
            max = b;
        }
        if (c>max)
        {
            max = c;
        }
        System.out.println("the largest number is :"+ max);

//        Q: Find the largest of the 3 numbers method 2
//        int max = Math.max(a,Math.max(b,c));
//        System.out.println("the largest number is :" + max);

//        Q: Find the largest of the 3 numbers method 3
//        System.out.println(Math.max(10,20));
    }
}
