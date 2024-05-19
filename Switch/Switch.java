package com.me;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        //Switch case
        switch (fruit){
            case "mango", "Mango" :
                System.out.println("King of fruit");
                break;
            case "apple" :
                System.out.println("im apple");
                break;
            case "orange" :
                System.out.println("im orange");
                break;
            default:
                System.out.println("Enter valid fruit");
        }

        // enhanced switch case
//        switch (fruit) {
//            case "mango", "Mango" -> System.out.println("King of fruit");
//            case "apple" -> System.out.println("im apple");
//            case "orange" -> System.out.println("im orange");
//            default -> System.out.println("Enter valid fruit");
//        }

        // switch case to if condition or enhance switch to switch in press alt enter
//        if (fruit.equals("mango") || fruit.equals("Mango")) {
//            System.out.println("King of fruit");
//        } else if (fruit.equals("apple")) {
//            System.out.println("im apple");
//        } else if (fruit.equals("orange")) {
//            System.out.println("im orange");
//        } else {
//            System.out.println("Enter valid fruit");
//        }
    }
}