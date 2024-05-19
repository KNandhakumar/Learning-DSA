package com.me;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        //  input
        for (int i = 0; i <9; i++) {
            list.add(in.nextInt());
        }
//        for (int i = 0; i <3; i++) {
//            System.out.println(list.get(i));
//        }
        System.out.print(list);
    }
}
