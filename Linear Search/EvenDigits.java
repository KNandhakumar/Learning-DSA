package com.me;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {18,2,9,158,98,1}; // ans is 2
        System.out.println(findNumbers(nums));
//        System.out.println(digits1(23456));
    }
    // find numbers in the array
    static int findNumbers(int[] nums){
        int count = 0;
        for (int i = 0; i <nums.length; i++) {
            int num = nums[i];
            if (even(num)){
                count++;
            }
        }
        return count;
    }
    // even or not find method
    static boolean even(int num){
        int numberOfDigits = digits(num);
        if (numberOfDigits%2==0){
            return true;
        }
        return false;
    }
    // one by one digits to check the even method
    static int digits(int num){
        int count = 0;
        while (num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
