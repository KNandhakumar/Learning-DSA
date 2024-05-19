package com.me;

public class searchInRange {
    public static void main(String[] args) {
        // Question : find the range in index[1,4] ans = 5 index
        int[] arr = {18,12,-7,3,14,28};
        int target = 28;
        System.out.println(searchRange(arr,target,0,5));
    }
    static int searchRange(int[] arr,int target,int start,int end){
        if (arr.length == 0){
            return -1;
        }
        // this loop showing index
        for (int i = start; i <=end; i++) {
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        // this loop showing element
        for (int i = 0; i <arr.length; i++) {
            int element = arr[i];
            if (element == target){
                return element;
            }
        }
        return -1;
    }
}
