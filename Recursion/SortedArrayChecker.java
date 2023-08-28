package com.yash;

public class SortedArrayChecker {
    public static void main(String[] args) {
        int[] array = {25,21,4,5,9,15};
        System.out.println(arrayCheck(array));
    }
    public static boolean arrayCheck(int[] arr){
        if (arr.length<=1){
            return true;
        }
        return helper(arr,0);
    }

    private static boolean helper(int[] arr, int i) {
        if (i== arr.length-1){
            return true;
        }
        return arr[i]<=arr[i+1] && helper(arr,i+1);
    }
}
