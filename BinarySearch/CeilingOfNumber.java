package com.yash;
//the number has to be equal or just greater than target i.e. equal or smallest of all numbers greater than target
public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] array={-12,-5,-4,-2,0,1,3,5,8,9,10,15,17,19,20,25,35,65,78,99};
        int tar= -6;
        System.out.println(ceilingOfNumber(array,tar));
    }
    static int ceilingOfNumber(int[] arr, int target){
        int start =0;
        int end= arr.length-1;
        if (target>arr[arr.length-1]){
            return -1;
        }

        while (start<=end) {
            int mid=start+(end-start)/2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return start;
    }
}
