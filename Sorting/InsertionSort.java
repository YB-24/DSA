package com.yash;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arrays={69,25,-1,2,-69,35,25,10};
        insertion(arrays);
        System.out.println(Arrays.toString(arrays));
    }
    public static void insertion(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1 ; j > 0; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }
    static void swap(int[] array,int index1, int index2){
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
}
