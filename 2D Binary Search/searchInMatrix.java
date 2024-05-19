package com.me;

import java.util.Arrays;

public class searchInMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {18, 9, 12},
                {36, -4, 91},
                {4, 100, 16},
        };
        int target = 91;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] arr,int target){
        for (int row = 0; row <arr.length; row++) {
            for (int col = 0; col <arr[row].length; col++) {
                if (target==arr[row][col]){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
