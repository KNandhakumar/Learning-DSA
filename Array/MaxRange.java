package com.me;

public class MaxRange {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println(maxRange(arr,1,3));
    }
    public static int maxRange(int[] array,int start,int end){
        int maxVal = array[0];
        for (int i = start; i <=end; i++) {
            if (array[i]>maxVal){
                maxVal = array[i];
            }
        }
        return maxVal;
    }
    // another method
//    static int maxRange(int[] arr,int start,int end){
//        int ans = 0;
//        for (int i = start; i <end; i++) {
//            int element = arr[i];
//            if (ans<element){
//                ans = element;
//            }
//        }
//        return ans;
//    }
}
