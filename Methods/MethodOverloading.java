package com.me;

public class MethodOverloading {
    public static void main(String[] args) {
        gym(1000);
        gym("velu gym");
    }
    static void gym(int gymfees){
        System.out.println(gymfees);
    }
    static void gym(String gymname){
        System.out.println(gymname);
    }
}
