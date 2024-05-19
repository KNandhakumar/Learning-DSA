package com.me;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println(max(arr));
    }

    static int max(int[] array) {
        // imagine that array is not empty
        int maxVal = array[0];
        for (int i = 1; i <array.length; i++) {
            if (array[i]>maxVal){
                maxVal = array[i];
            }
        }
        return maxVal;
    }
}
