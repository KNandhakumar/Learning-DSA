// https://leetcode.com/problems/find-in-mountain-array/
package com.me;

public class searchInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 0};
        int target = 0;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int peak = findPeakIndex(arr);
        int firstCheck = orderOfAscending(arr,target,0,peak);
        if (firstCheck!=-1){
            return firstCheck;
        }
        return orderOfAscending(arr,target,peak+1,arr.length-1);
    }
    static int findPeakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start + (end - start)/2;
            if (arr[mid]>arr[mid+1]){
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }
    static int orderOfAscending(int[] arr,int target,int start,int end){
        boolean isAscending = arr[start]<arr[end];
        while (start<=end){
            int mid = start + (end - start)/2;
            if (target==arr[mid]){
                return mid;
            }
            if (isAscending){
                if (target>arr[mid]){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
            else {
                if (target>arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
