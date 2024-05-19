package com.me;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        display(1,2,3,4,5,6,7,8,9,10);
        fun(1,2,3,45);
        fun("vishal","gullu","vishnu");
    }
    static void display(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
