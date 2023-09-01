package com.yash;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] ar={5,4,3,2,1,2};
        mergeInPlace(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));
    }
    static void mergeInPlace(int[] arr , int s , int e){
        if (e-s==0){
            return;
        }
        int m = (s+e)/2;

        mergeInPlace(arr,s,m);
        mergeInPlace(arr,m+1,e);

        merge(arr,s,m,e);

    }
    static void merge(int[] array , int start , int mid , int end ){
       int[] a = new int[end-start+1];

        int i = start;
        int j = mid+1;
        int k =0;
        while (i<=mid && j<=end){
            if (array[i]>array[j]){
               a[k]=array[j];
               j++;
            }else {
                a[k]=array[i];
                i++;
            }
            k++;
        }
        while (i<=mid){
            a[k]=array[i];
            i++;
            k++;
        }
        while (j<=end){
            a[k]=array[j];
            j++;
            k++;
        }

        for (int l = 0; l < a.length; l++) {
            array[start+l]=a[l];
        }
    }
}
