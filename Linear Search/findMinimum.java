package com.me;

public class findMinimum {
    public static void main(String[] args) {
        // Question : find the minimum element in the array
        int[] arr = {18,4,7,3,1,2};
        System.out.println(min1(arr,2,5));
    }

    // this method is find the range of min value
    static int min1(int[] arr,int start,int end){
        int minVal = arr[0];
        for (int i = start; i <=end; i++) {
            if (minVal>arr[i]){
                minVal = arr[i];
            }
        }
        return minVal;
    }
    // this method is find the min value
    static int min(int[] arr){
        int minVal = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if (minVal>arr[i]){
                minVal = arr[i];
            }
        }
        return minVal;
    }
}
