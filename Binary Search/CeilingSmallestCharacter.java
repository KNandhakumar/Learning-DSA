package com.me;

import java.util.Arrays;

public class CeilingSmallestCharacter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters,target));
    }
    static char nextGreatestLetter(char[] letters,int target) {
        int start = 0;
        int end = letters.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (target>letters[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return letters[start%letters.length];
    }
}
