package com.me;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        // array syntax
        int[] arr = {1,2,3,4,5,6,7};
        swap(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] array,int index1,int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
