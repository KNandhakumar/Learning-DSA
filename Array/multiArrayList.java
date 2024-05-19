package com.me;

import java.util.ArrayList;
import java.util.Scanner;

public class multiArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 2d arraylist syntax
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialized also initialized the 2d array like [3][3] this initialized in this forloop method
        for (int i = 0; i <3; i++) {
            list.add(new ArrayList<>());
        }

        //add elements
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
