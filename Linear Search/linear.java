package com.me;

public class linear {
    public static void main(String[] args) {
        int[] arr = {12,3,5,8,9,19};
        int target = 9;
        int ans = linearSearch(arr,target);
        System.out.println(ans);
        System.out.println(linearSearch1(arr,target));
    }

    // boolean method
    static boolean linearSearch1(int[] arr,int target){
        if (arr.length == 0){
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    // int method
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i <arr.length; i++) {
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }
}