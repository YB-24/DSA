package com.yash;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {3,5,6,87,54,86,897,65,444,4855,48,44,4};
        int tar = 8;
        System.out.println(linearSearch(array,tar));
    }
    public static int linearSearch(int[] arr,int target){
        if (arr.length==0){
            return Integer.MAX_VALUE;
        }
        for (int i =0; i < arr.length; i++){
            if (arr[i]==target){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
