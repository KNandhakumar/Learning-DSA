package com.me;

import java.util.Arrays;
import java.util.Scanner;

public class multiDimentionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
            ^
            |  this is row; -> this is column
            1 2 3
            4 5 6
            7 8 9
        */

        // Array syntax row is mandatory column not mandatory we will initialize later
        //  int[][] arr = new int[3][];
//        int[][] arr = new int[3][3];
//        arr[1][0] = 10; // index one is 4 5 6 and column 0 is 4 so the change the value is 10;
//        arr[2][2] = 5;
//        System.out.println(Arrays.toString(arr[1]));
//        System.out.println(Arrays.deepToString(arr));

        //another example of 2D array
        int[][] arr2D = {
                {1,2,3},      // 0th index -> arr2D[0] = {1,2,3} -> arr2D[0][2] = {3}
                {4,5},        // 1st index -> arr2D[1] = {4,5}   -> arr2D[1][0] = {4}
                {6,7,8,9}     // 2nd index -> arr2D[2] {6,7,8,9} -> arr2D[2][3] = {9}
        };

        int[][] arr = new int[3][3];
        // input
        for (int row = 0; row <arr.length; row++) {
            for (int col = 0; col <arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // output
//        for (int row = 0; row <arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
        // enhance for loop
        for (int[] matrix : arr){
            System.out.println(Arrays.toString(matrix));
        }
        // input
//        for (int row = 0; row <arr2D.length ; row++) {
//            for (int col = 0; col <arr2D[row].length ; col++) {
//                arr2D[row][col] = in.nextInt();
//            }
//        }
//        // output
//        for (int row = 0; row <arr2D.length; row++) {
//            // for each col in every row
//            for (int col = 0; col <arr2D[row].length; col++) {
//                System.out.print(arr2D[row][col] + " ");
//            }
//            System.out.println();
//        }
    }
}
