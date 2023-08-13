package com.yash;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][] array={
            {78,58,65,36},
            {87,99,2321,6,5,8},
            {23,25,45},
            {2,1}
        };
        int target= 21;
        System.out.println(searchIn2D(array,target));
    }
    static String searchIn2D(int[][] arr, int tar){
        if (arr.length==0){
            return "Zero length Array";
        }
        for (int i = 0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]==tar){
                    return i+" "+j;
                }
            }
        }
        return "Not found";
    }
}
