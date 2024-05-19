package com.me;

import java.util.Arrays;

public class PassingExample2 {
    public static void main(String[] args) {
        // create a array
        int[] arr = {1,4,66,7};
        int[] arr1 = {10,20,30,40};
        change(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    static void change(int[] num){
        num[0] = 99;
    }
}
