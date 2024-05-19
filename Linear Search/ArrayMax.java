package com.me;

public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {100,33,5,55,7};
        System.out.println(max(arr));
    }
    public static int max(int[] array){
        int maxVal = array[0];
        for (int i = 0; i <array.length; i++) {
            if (maxVal<array[i]){
                maxVal = array[i];
            }
        }
        return maxVal;
    }
}
