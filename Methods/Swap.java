package com.me;

public class Swap {
    public static void main(String[] args) {
        // Question swap two numbers
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a + " " + b);

        // change method not changing another method value in another method
        String name = "vishnu";
//        ChangeName(name);
//        System.out.println(name); // print the name is vishnu

        // change method return the value so change the name value;
        name = ChangeNum(name);
        System.out.println(name);
    }

    static void ChangeName(String naam) {
        naam = "gullu"; // not print this because this is a another scope
    }
    static String ChangeNum(String name1){
        name1 = "gullu";
        return name1;
    }

    public static void swap(int a,int b)
    {
        int c = 0;
        int temp = a;
        a = b;
        b = temp;
    }
}