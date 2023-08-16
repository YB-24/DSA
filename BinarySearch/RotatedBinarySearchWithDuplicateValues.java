package com.yash;

public class RotatedBinarySearchWithDuplicateValues {
    public static void main(String[] args) {
        System.out.println(pivot(new int[]{7,7,7,7,1,2,3}));

    }
    public static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (mid>0 && arr[mid] <arr[mid-1]){
                return mid-1;
            }
            if (mid<arr.length-1 && arr[mid+1] <arr[mid]){
                return mid;
            }
            if (arr[start]==arr[mid] && arr[mid]==arr[end]){
                if (arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if (arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            if (arr[start]<arr[mid]|| arr[start]==arr[mid]&& arr[mid]>arr[end]){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }
    public static int BinarySearch(int[] arr,int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
            if (arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
}
