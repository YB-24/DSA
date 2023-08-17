package com.yash;
//leetcode problem no--44
import java.util.ArrayList;

public class FirstMissingPositive {
    public static void main(String[] args) {

    }
    public static int cycle(int[] arr){
        int i=0;
        int ans=1;
        while (i<arr.length){
            if (arr[i]>0 &&arr[i]<=arr.length&&arr[i]-1!=i && arr[i]!=arr[arr[i]-1]){
                swap(arr,arr[i]-1,i );
            }else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=ans){
                return ans;
            }else{
                ans++;
            }
        }

        return ans;
    }
    static void swap(int[] array,int index1, int index2){
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
}
