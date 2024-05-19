package com.me;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        // 0 1 2 3 4 this is index
        // 1 2 3 4 5 this is index element

        // Q: store a roll number
        int rollNumber = 5;

        // Q: store a person name
        String name = "vishnu";

        // Q: store 5 roll numbers
        int rollNumber1 = 10;
        int rollNumber2 = 20;
        int rollNumber3 = 30;
        int rollNumber4 = 40;
        int rollNumber5 = 50;

        // syntax
        //data types[] variable_name = new datatype[size];

        // Q; store 5 roll number
        int[] num = new int[5];
        // or direct
        int[] num1 = {1,2,3,4,5};

        // stack memory and heap memory stack memory is example : primitive datatype is only using the stack memory is not changing the object a=10 this is stack primitive data types memory only in stack memory
        int a = 10;
        int b = a;
//        System.out.println(a);
//        System.out.println(b);

        // another memory management example : this reference datatype zig is pointing heap memory is 0,0,0,0 and also zag is pointing the zig memory of heap memory because im not create a new array im declared the zig value of zag
        int[] zig = new int[4];
        int[] zag = zig;
//        System.out.println(Arrays.toString(zig));
//        System.out.println(Arrays.toString(zag));

        // zig1 is pointing the [0,0,0,0] and zag is pointing the [1,2,3,4] because im create a new reference variable to create a new heap memory
        int[] zig1 = new int[4];
        int[] zag2 = {1,2,3,4};
//        System.out.println(Arrays.toString(zig1));
//        System.out.println(Arrays.toString(zag2));

        // now zig and zag is pointing a new values because im declared to create a new array so create a new memory and already assign memory are not using so now enter the garbage collection so clear the waste of memory
        int[] zig3 = new int[4];
        int[] zag4 = {1,2,3,4};
        zig3 = new int[4];
        zag4 = new int[4];
        System.out.println(Arrays.toString(zig3));
        System.out.println(Arrays.toString(zag4));
    }
}
