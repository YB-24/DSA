package com.yash;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {2,6,8},
                {5,7,10},
                {9,11,15},
                {13,18,20}
        };
        int target=12;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    public static int[] search(int[][] arr,int target){
        int row=0;
        int col=arr[row].length-1;
        while (col>=0 &&  row<arr.length){
            if (arr[row][col]==target){
                return new int[]{row,col};
            }
            if (arr[row][col]>target){
                col--;
            }
           else {
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
