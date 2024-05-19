package com.me;

public class findMaxArrayValue {
    public static void main(String[] args) {
        // Question : find max value of 2d array
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 112}
        };
        System.out.println(maxArray1(arr));
    }
    static int maxArray(int[][] arr){
        int maxValue = arr[0][0];
        for (int row = 0; row <arr.length; row++) {
            for (int col = 0; col <arr[row].length; col++) {
                if (maxValue<arr[row][col]){
                    maxValue = arr[row][col];
                }
            }
        }
        return maxValue;
    }

    static int maxArray1(int[][] arr){
        int maxValue = Integer.MIN_VALUE; // this method is -38337 this minus values gave me
        for (int row = 0; row <arr.length; row++) {
            for (int col = 0; col <arr[row].length; col++) {
                if (maxValue<arr[row][col]){
                    maxValue = arr[row][col];
                }
            }
        }
        return maxValue;
    }
}
