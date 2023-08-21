package com.yash;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int [] array={3,9,15,17,25,55};
        int tar=55;
        System.out.println(bs(array,tar,0,array.length-1));
    }
    public static int bs(int[] arr,int target,int start,int end){
        if (start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                return bs(arr, target, start, mid - 1);
            } else {
                return bs(arr, target, mid + 1, end);
            }
        }
        return -1;
    }
}
