package com.yash;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,8,9,48,5,45,487};
        System.out.println(linearSearch(arr,7,2,5));

    }
    public static int linearSearch(int[] arr,int target, int start, int end){
        if (arr.length==0){
            return Integer.MAX_VALUE;
        }
        for (int i =start; i <=end; i++){
            if (arr[i]==target){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
