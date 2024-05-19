package com.me;

public class AscendingDescending {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 5, 3, 2, 1, 0};  // Sorted of Descending
//        int[] arr = {1,2,3,4,5,6,7,8};        // Sorted of Ascending
        int target = 7;
        System.out.println(orderOfAgnosticsBinary(arr,target));
    }
    static int orderOfAgnosticsBinary(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAscending = arr[start] < arr[end];
        while (start<=end){
            int mid = start + (end - start)/2;
            if (target == arr[mid]){
                return mid;
            }
            if (isAscending){
                if (target>arr[mid]){
                    start = mid+1;
                }
                else{
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