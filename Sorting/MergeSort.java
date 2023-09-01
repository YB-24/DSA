package com.yash;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array={ 5,6,7,9,9,2,1,3};
        array=mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
    static int[] mergeSort(int[] arr){
        if (arr.length==1){
            return arr;
        }
        int mid= arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid)); //here mid is not inclusive
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left , right);

    }

    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length+ second.length];
        int i=0;
        int j=0;
        int k=0;

        while (i< first.length && j< second.length){
            if (first[i]>second[j]){
                mix[k]=second[j];
                j++;
            }else {
                mix[k]=first[i];
                i++;
            }
            k++;
        }
        while (i< first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}
