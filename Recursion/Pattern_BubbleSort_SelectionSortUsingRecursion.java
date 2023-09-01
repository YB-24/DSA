package com.yash;

import java.util.Arrays;

public class Pattern_BubbleSort_SelectionSortUsingRecursion {
    public static void main(String[] args) {
        triangle2(4,0);
        int[] array={4,3,5,8,9,2,2,1};
        System.out.println();
    //    bubbleSort(array,array.length-1,0);
       // selectionSort(array, array.length-1, 0,0);
        System.out.println(Arrays.toString(array));
    }
    static void triangle(int r, int c){
        if (r==0){
            return;
        }
        if (r>c){
            System.out.print("*");
            triangle(r, c+1);
        }else {
            System.out.println();
            triangle(r-1,0);
        }
    }
    static void triangle2(int r, int c){
        if (r==0){
            return;
        }
        if (r>c){
            triangle2(r, c+1);
            System.out.print("*");
        }else {
            triangle2(r-1,0);
            System.out.println();
        }
    }
    static void bubbleSort(int[] arr, int p, int i){
        if (p ==0){
            return;
        }
        if (p > i){
            if (arr[i]>arr[i +1]){
                int temp= arr[i];
                arr[i]= arr[i +1];
                arr[i +1]=temp;
            }
            bubbleSort(arr, p, i +1);
        }else {
            bubbleSort(arr, p-1,0);
        }
    }
    static void selectionSort(int[] arr, int p, int i,int maxIndex){
        if (p ==0){
            return;
        }
        if (p > i){
            if (arr[i]> arr[maxIndex]){
               maxIndex =i;
            }
            selectionSort(arr, p, i +1,maxIndex);
        }else {
            if (arr[p]< arr[maxIndex]){
                int temp= arr[p];
                arr[p]= arr[maxIndex];
                arr[maxIndex]=temp;
            }
            maxIndex=0;

            selectionSort(arr, p-1,0,maxIndex);
        }
    }

}
