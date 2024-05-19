package com.me;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name1 = in.next();
        String personalized = display(name1);
        System.out.println(personalized);
    }

    static String display(String name)
    {
        String message = "Hello " + name;
        return message;
    }
}
