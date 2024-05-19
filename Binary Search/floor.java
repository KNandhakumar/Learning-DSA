package com.me;

public class floor {
    // Question : if your not find your number return not -1,
    // return the you search the number of previous num example you search
    // 15 this is not in your array so return the previous number
    // of your target>=14; this is ceil
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(floor(arr,target));
    }
    // return the index of greatest no <= target
    static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
