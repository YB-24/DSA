package com.yash;

import java.util.Arrays;

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        int[][] array={
                {1, 3, 5, 7, 9, 10},
                {12,15,18,17,19,23},
                {25,26,28,31,32,35},
                {40,45,46,49,50,51},
                {52,65,78,99,101,105},
        };
        int target=105;
        int [][] arrays={{1,2,5,9,10}};
      //  System.out.println(arrays.length);
        System.out.println(Arrays.toString(search(arrays,target)));
    }
    public static int[] search(int[][] arr, int target){

        if (arr.length==0){
            return new int[]{-1,-1};
        }
        if (arr.length==1){
            return new int[]{0,BinarySearch(arr,target,0,arr[0].length-1,0)};
        }

        int midCol=(arr[0].length-1)/2;
        int startRow=0;
        int endRow= arr.length-1;


        while(endRow-startRow>1){
            int midRow=startRow+(endRow-startRow)/2;
            if (arr[midRow][midCol]==target){
                return new int[]{midRow,midCol};
            }
            if (arr[midRow][midCol]>target){
            endRow=midRow;
            }else {
                startRow=midRow;
            }
        }
        if (arr[endRow][midCol]==target){
            return new int[]{endRow,midCol};
        }
        if (arr[startRow][midCol]==target){
            return new int[]{startRow,midCol};
        }
       if (arr[endRow][midCol]<target) {
            if (BinarySearch(arr, target, midCol + 1, arr[0].length - 1, endRow) != -1) {
                return new int[]{endRow, BinarySearch(arr, target, midCol + 1, arr[0].length - 1, endRow)};
            }
        }
       if (arr[endRow][midCol]>target) {
            if (BinarySearch(arr, target, 0, midCol-1, endRow) != -1) {
                return new int[]{endRow, BinarySearch(arr, target, 0, midCol-1, endRow)};
            }
        }
        if (arr[startRow][midCol]<target){
            if (BinarySearch(arr, target, midCol + 1, arr[0].length - 1, startRow) != -1) {
                return new int[]{startRow, BinarySearch(arr, target, midCol + 1, arr[0].length - 1, startRow)};
            }
        }
        if (arr[startRow][midCol]>target){
            if (BinarySearch(arr, target, 0, midCol-1, startRow) != -1) {
                return new int[]{startRow, BinarySearch(arr, target, 0, midCol-1, startRow)};
            }
        }
        return new int[]{-1,-1};
    }
    public static int BinarySearch(int[][] arr,int target, int start, int end,int rowIn2D) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[rowIn2D][mid] > target) {
                end = mid - 1;
            }
            if (arr[rowIn2D][mid] < target) {
                start = mid + 1;
            }
            if (arr[rowIn2D][mid] == target) {
                return mid;
            }
        }
        return -1;
    }
}
