package com.yash;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr={4,5,7,2,3};
        System.out.println(search(arr,3,0,arr.length-1));
    }
    public static int search(int [] arr,int target, int s, int e){
        if (s>e){
            return -1;
        }
        int mid = s + (e-s)/2;

        if (arr[mid]==target){
            return mid;
        }
        if (arr[mid]>arr[s]){
            if (target>=arr[s] && target<=arr[mid]){
                return search(arr,target,s,mid-1);
            }else {
                return search(arr,target,mid+1,e);
            }
        }
        if (target>=arr[mid] && target<=e){
            return search(arr, target, mid+1, e);
        }
        return search(arr, target, s, mid-1);
    }
}
