package com.yash;

public class AgnosticBS {
    public static void main(String[] args) {
        int[] array = {99,69,26,12,2,-2,-6,-89};
        int tar = 2;
        System.out.println(agnosticBS(array,tar));
    }
    static int agnosticBS(int[] arr,int target){
        int start =0;
        int end= arr.length-1;
        boolean isAsc = arr[start]<arr[end];

        while (start<=end) {

            int mid=start+(end-start)/2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                }
                if (arr[mid] < target) {
                    start = mid + 1;
                }
            }else {
                if (arr[mid] < target) {
                    end = mid - 1;
                }
                if (arr[mid] > target) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
