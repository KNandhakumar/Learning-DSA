package com.me;

public class findMinArrayValue {
    public static void main(String[] args) {
        // Question : find the 2d array of minimum values
        int[][] arr = {
                {23, -1, -11},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 112}
        };
        System.out.println(minArray1(arr));
    }
    static int minArray1(int[][] arr){
        int minValue = arr[0][0];
        for (int row = 0; row <arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (minValue>arr[row][col]){
                    minValue = arr[row][col];
                }
            }
        }
        return minValue;
    }
    static int minArray(int[][] arr){
        int minValue = Integer.MAX_VALUE;  // this max method is 887434 only gave me max numbers
        for (int row = 0; row <arr.length; row++) {
            for (int col = 0; col <arr[row].length; col++) {
                if (minValue>arr[row][col]){
                    minValue = arr[row][col];
                }
            }
        }
        return minValue;
    }
}
