package com.yash;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] array={5,4,2,1,3};
        cycle(array);
        System.out.println(Arrays.toString(array));
    }
    public static void cycle(int[] arr){
        int i=0;
        while (i<arr.length){
            if (arr[i]-1!=i){
                swap(arr,arr[i]-1,i );
            }else {
                i++;
            }
        }
    }
    static void swap(int[] array,int index1, int index2){
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
}