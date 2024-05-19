package com.me;

public class ceiling {
    public static void main(String[] args) {
        // Question : find the number >= target
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        // System.out.println(Math.floor(5.1)); // floor give the number is small number
    }
    // return the index of smallest no >= target
    static int Ceiling(int[] arr, int target){
        // what if the target is greater than the greatest number in the array
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (target>arr[mid]){
                start = mid+1;
            } else if (target<arr[mid]) {
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
