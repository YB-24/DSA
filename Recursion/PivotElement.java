package com.yash;

public class PivotElement {
    public static void main(String[] args) {
        int[] arr={4,5,7,2,3};
        System.out.println(pivot(arr,0, arr.length-1));
    }
    public static int pivot(int[] arr,int s, int e){
        if (s>=e){
            return -1;
        }
        int mid= s+(e-s)/2;
        if (mid>0 && arr[mid]<arr[mid-1]){
            return mid-1;
        }
        if (mid< arr.length-1 && arr[mid]>arr[mid+1] ){
            return mid;
        }
        if (arr[0]<arr[mid]){
            s=mid+1;
        }else {
            e=mid-1;
        }
        return pivot(arr,s,e);

    }
}
