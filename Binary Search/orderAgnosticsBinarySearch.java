package com.me;

public class orderAgnosticsBinarySearch {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 5, 3, 2, 1, 0};
        int target = 8;
        System.out.println(orderAgnosticBS(arr, target));
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAuscending = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAuscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}