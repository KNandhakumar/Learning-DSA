package com.me;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i <5; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i <5; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // for each loop datatype reference variable : arr
//        for (int num : arr) // for every  element in array, print the element
//        {
//            System.out.print(num + " "); // here represents element of the array
//        }
    }
}
