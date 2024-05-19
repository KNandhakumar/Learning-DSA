package com.me;

import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        // Question : search 2D array
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 34;
        int[] ans = (searchArray(arr,target));
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchArray(int[][] arr,int target){
        for (int row = 0; row <arr.length; row++) {
            for (int col = 0; col <arr[row].length; col++) {
                if (target == arr[row][col]){
                    return new int[]{row,col}; // tow value return of array this method new int[]{row,col}
                }
            }
        }
        return new int[]{-1};
    }
}
