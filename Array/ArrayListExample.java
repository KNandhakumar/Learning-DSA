package com.me;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // syntax
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(100);
//        list.add(1000);
//        list.add(90);
//        System.out.println(list);
//        contains method is true or false example list.contain() 90 in your list print the true
//        list.set(3,10000); // set method is values set the index
//        list.remove(2); // remove method is remove the index
//        System.out.println(list);


        // input
        for (int i = 0; i <6; i++) {
            list.add(in.nextInt());
        }
        // get item at any index
        for (int i = 0; i <6; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }
        System.out.println(list);
    }
}
