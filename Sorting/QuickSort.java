package com.yash;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,10,8,12,4,3,2,1};
        quick(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quick(int[] array,int l,int h){
        if (l>=h){
            return;
        }
        int s = l;
        int e = h;
        int m = s+(e-s)/2;
        int pivot = array[m];

        while(s<=e){
            while (array[e]>pivot){
                e--;
            }
            while (array[s]<pivot){
                s++;
            }
            if (s<=e){
                int temp = array[s];
                array[s]=array[e];
                array[e]=temp;
                s++;
                e--;
            }
        }
        quick(array,l,e);
        quick(array,s,h);

    }
}
