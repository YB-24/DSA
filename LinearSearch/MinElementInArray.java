package com.yash;

//Assuming array to be non empty

public class MinElementInArray {
    public static void main(String[] args) {

        int[] array = {3,-9,78,6,8,79,36,48,58,57,69};

        System.out.println(min(array));
    }
    public static int min(int[] arr){
        int min = arr[0];
        for (int i =0; i < arr.length; i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
