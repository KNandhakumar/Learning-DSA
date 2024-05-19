package com.me;

import java.util.Arrays;
import java.util.Scanner;

public class threeDimentionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][][] num = new int[2][2][2];
        for (int row = 0; row <num.length; row++) {
            for (int col = 0; col <num[row].length; col++) {
                for (int max = 0; max <num[col].length; max++) {
                    num[row][col][max] = in.nextInt();
                }
            }
        }
        for (int[][] a : num){
            System.out.println(Arrays.deepToString(a));
        }
    }
}
