package com.me;

public class PassingExample1 {
    public static void main(String[] args) {
        int num = 10;
        int sum =230;
        System.out.println("Before method call: x = " + num); // print num = 10
        // copy of the sum value in greet method parameter
        greet(sum);
        System.out.println("After method call: x = " + num);  // print num = 10
    }
    static  void greet(int value){
        value = value*2;
        System.out.println("Inside method: value = " + value); // print num = 20 because the greet method is argument passed num the copy of greet(int value)
    }
}
