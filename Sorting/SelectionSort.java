package com.yash;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arrays = {5,4,6,-3,2,2,1};
        selection(arrays);
        System.out.println(Arrays.toString(arrays));
    }
    public static void selection(int[] arr){

         for (int i =0;i<arr.length-1;i++){
             int end=arr.length-i-1;
             int s= maxIndex(arr,0,end);
             swap(arr,end,s);
         }
    }
    static void swap(int[] array,int index1, int index2){
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
    static int maxIndex(int[] arr,int start,int end){
        int max=0;
        for (int i=start; i<=end; i++){
            if (arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
}
