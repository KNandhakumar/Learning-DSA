package com.me;

public class peakFindMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 4, 3, 2};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
        // another method
//    static int findPeakMountainArray(int[] arr){
//        int start = 0;
//        int end = arr.length-1;
//        while (start<=end){
//            int mid = start + (end - start)/2;
//            if (arr[start]<arr[mid]){
//                start = mid+1;
//            }
//            else if(arr[end]<arr[mid]){
//                end = mid-1;
//            }
//            else {
//                return mid;
//            }
//        }
//        return -1;
//    }
    }
}
