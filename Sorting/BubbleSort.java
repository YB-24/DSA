package com.yash;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 8, 9, 13};
        bubble(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i< arr.length-1; i++){ // a type of counter which counts for n-1 times
            swapped = false;
            for (int j = 1 ; j<= arr.length-i-1;j++){
                if (arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
