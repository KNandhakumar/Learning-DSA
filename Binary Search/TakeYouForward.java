package com.me;
public class TakeYouForward {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int target = 5;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (arr[mid]==target){
                return mid;
            }
            // left half is sorted
            if (arr[start]<=arr[mid]){
                if (target>=arr[start] && target<=arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else {
                // right half is sorted
                if (target<=arr[end]&&target>=arr[mid]){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}