package com.me;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        // String is immutable Array is mutable
        int[] num = {1,2,3,4,5};
        System.out.println("before :"+ Arrays.toString(num));
        change(num);
        System.out.println("after :"+ Arrays.toString(num));
    }
    static void change(int[] arr)
    {
        arr[0] = 99;
    }
}
