package com.me;

public class Shadow {
    static int num = 10; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(num);    // 10;
        int num = 100;              // the class variable at line 4 is shadowed by this line
        System.out.println(num);    // 10
        display();
    }

    static void display() {
        System.out.println(num);
    }
}
