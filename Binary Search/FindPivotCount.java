package com.me;

public class FindPivotCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(searchRange(arr));
    }
    static int searchRange(int[] arr){
        int pivot = findPivotCount(arr);
        return pivot+1;
    }
    static int findPivotCount(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid= start + (end - start)/2;
            if (arr[mid]>arr[mid+1]){
                return mid;
            }
            if (arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[mid]<arr[start]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }
}
