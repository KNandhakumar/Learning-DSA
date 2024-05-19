package com.me;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {10,33,5,55,7};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] array,int index1,int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
