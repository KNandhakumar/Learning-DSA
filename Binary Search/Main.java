package com.me;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 7;
        System.out.println(binarySearch(arr,target));
    }
    // using linear search
//    static int linearSearch(int[] arr,int target){
//        for (int i = 0; i <arr.length; i++) {
//            int element = arr[i];
//                if (target == element){
//                    return i;
//            }
//        }
//        return -1;
//    }
    // using binary search
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start) /2;
            if (target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }
            else return mid;
        }
        return -1;
    }
}